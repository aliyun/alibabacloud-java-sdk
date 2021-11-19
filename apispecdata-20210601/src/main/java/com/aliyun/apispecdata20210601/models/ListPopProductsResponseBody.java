// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apispecdata20210601.models;

import com.aliyun.tea.*;

public class ListPopProductsResponseBody extends TeaModel {
    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PopProducts")
    public java.util.List<ListPopProductsResponseBodyPopProducts> popProducts;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListPopProductsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListPopProductsResponseBody self = new ListPopProductsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListPopProductsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListPopProductsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListPopProductsResponseBody setPopProducts(java.util.List<ListPopProductsResponseBodyPopProducts> popProducts) {
        this.popProducts = popProducts;
        return this;
    }
    public java.util.List<ListPopProductsResponseBodyPopProducts> getPopProducts() {
        return this.popProducts;
    }

    public ListPopProductsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListPopProductsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListPopProductsResponseBodyPopProducts extends TeaModel {
        @NameInMap("PopCode")
        public String popCode;

        public static ListPopProductsResponseBodyPopProducts build(java.util.Map<String, ?> map) throws Exception {
            ListPopProductsResponseBodyPopProducts self = new ListPopProductsResponseBodyPopProducts();
            return TeaModel.build(map, self);
        }

        public ListPopProductsResponseBodyPopProducts setPopCode(String popCode) {
            this.popCode = popCode;
            return this;
        }
        public String getPopCode() {
            return this.popCode;
        }

    }

}
