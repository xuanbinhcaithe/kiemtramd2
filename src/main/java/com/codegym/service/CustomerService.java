package com.codegym.service;

import com.codegym.model.Customer;
import com.codegym.model.Province;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface CustomerService {
    Page<Customer> findAll(Pageable pageable);
    Customer findById(Long id);
    void save(Customer customer);
    void remove(Long id);
    Iterable<Customer> findAllProvince(Province province);

}
