// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20230930.models;

import com.aliyun.tea.*;

public class ProductPageResult extends TeaModel {
    /**
     * <p>The cursor value for the next page.</p>
     * 
     * <strong>example:</strong>
     * <p>7091510713</p>
     */
    @NameInMap("nextCursor")
    public String nextCursor;

    /**
     * <p>The current page number.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pageNumber")
    public Integer pageNumber;

    /**
     * <p>The page size.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    /**
     * <p>The product collection.</p>
     */
    @NameInMap("products")
    public java.util.List<Product> products;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>3239281273464326823</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The total count.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>24</p>
     */
    @NameInMap("total")
    public Integer total;

    public static ProductPageResult build(java.util.Map<String, ?> map) throws Exception {
        ProductPageResult self = new ProductPageResult();
        return TeaModel.build(map, self);
    }

    public ProductPageResult setNextCursor(String nextCursor) {
        this.nextCursor = nextCursor;
        return this;
    }
    public String getNextCursor() {
        return this.nextCursor;
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
