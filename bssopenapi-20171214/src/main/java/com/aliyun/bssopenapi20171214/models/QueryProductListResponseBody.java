// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class QueryProductListResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Data")
    public QueryProductListResponseBodyData data;

    public static QueryProductListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryProductListResponseBody self = new QueryProductListResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryProductListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryProductListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryProductListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryProductListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryProductListResponseBody setData(QueryProductListResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryProductListResponseBodyData getData() {
        return this.data;
    }

    public static class QueryProductListResponseBodyDataProductListProduct extends TeaModel {
        @NameInMap("ProductName")
        public String productName;

        @NameInMap("ProductType")
        public String productType;

        @NameInMap("SubscriptionType")
        public String subscriptionType;

        @NameInMap("ProductCode")
        public String productCode;

        public static QueryProductListResponseBodyDataProductListProduct build(java.util.Map<String, ?> map) throws Exception {
            QueryProductListResponseBodyDataProductListProduct self = new QueryProductListResponseBodyDataProductListProduct();
            return TeaModel.build(map, self);
        }

        public QueryProductListResponseBodyDataProductListProduct setProductName(String productName) {
            this.productName = productName;
            return this;
        }
        public String getProductName() {
            return this.productName;
        }

        public QueryProductListResponseBodyDataProductListProduct setProductType(String productType) {
            this.productType = productType;
            return this;
        }
        public String getProductType() {
            return this.productType;
        }

        public QueryProductListResponseBodyDataProductListProduct setSubscriptionType(String subscriptionType) {
            this.subscriptionType = subscriptionType;
            return this;
        }
        public String getSubscriptionType() {
            return this.subscriptionType;
        }

        public QueryProductListResponseBodyDataProductListProduct setProductCode(String productCode) {
            this.productCode = productCode;
            return this;
        }
        public String getProductCode() {
            return this.productCode;
        }

    }

    public static class QueryProductListResponseBodyDataProductList extends TeaModel {
        @NameInMap("Product")
        public java.util.List<QueryProductListResponseBodyDataProductListProduct> product;

        public static QueryProductListResponseBodyDataProductList build(java.util.Map<String, ?> map) throws Exception {
            QueryProductListResponseBodyDataProductList self = new QueryProductListResponseBodyDataProductList();
            return TeaModel.build(map, self);
        }

        public QueryProductListResponseBodyDataProductList setProduct(java.util.List<QueryProductListResponseBodyDataProductListProduct> product) {
            this.product = product;
            return this;
        }
        public java.util.List<QueryProductListResponseBodyDataProductListProduct> getProduct() {
            return this.product;
        }

    }

    public static class QueryProductListResponseBodyData extends TeaModel {
        @NameInMap("PageNum")
        public Integer pageNum;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        @NameInMap("ProductList")
        public QueryProductListResponseBodyDataProductList productList;

        public static QueryProductListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryProductListResponseBodyData self = new QueryProductListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryProductListResponseBodyData setPageNum(Integer pageNum) {
            this.pageNum = pageNum;
            return this;
        }
        public Integer getPageNum() {
            return this.pageNum;
        }

        public QueryProductListResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public QueryProductListResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public QueryProductListResponseBodyData setProductList(QueryProductListResponseBodyDataProductList productList) {
            this.productList = productList;
            return this;
        }
        public QueryProductListResponseBodyDataProductList getProductList() {
            return this.productList;
        }

    }

}
