// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20230930.models;

import com.aliyun.tea.*;

public class ProductPageResult extends TeaModel {
    @NameInMap("pageNumber")
    public Integer pageNumber;

    @NameInMap("pageSize")
    public Integer pageSize;

    @NameInMap("products")
    public java.util.List<Product> products;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("total")
    public Integer total;

    public static ProductPageResult build(java.util.Map<String, ?> map) throws Exception {
        ProductPageResult self = new ProductPageResult();
        return TeaModel.build(map, self);
    }

    public ProductPageResult setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ProductPageResult setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ProductPageResult setProducts(java.util.List<Product> products) {
        this.products = products;
        return this;
    }
    public java.util.List<Product> getProducts() {
        return this.products;
    }

    public ProductPageResult setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ProductPageResult setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

}
