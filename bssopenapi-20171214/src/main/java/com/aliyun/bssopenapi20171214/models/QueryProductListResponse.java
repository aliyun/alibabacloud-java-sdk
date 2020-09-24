// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class QueryProductListResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("Data")
    @Validation(required = true)
    public QueryProductListResponseData data;

    public static QueryProductListResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryProductListResponse self = new QueryProductListResponse();
        return TeaModel.build(map, self);
    }

    public QueryProductListResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryProductListResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryProductListResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryProductListResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryProductListResponse setData(QueryProductListResponseData data) {
        this.data = data;
        return this;
    }
    public QueryProductListResponseData getData() {
        return this.data;
    }

    public static class QueryProductListResponseDataProductListProduct extends TeaModel {
        @NameInMap("ProductCode")
        @Validation(required = true)
        public String productCode;

        @NameInMap("ProductName")
        @Validation(required = true)
        public String productName;

        @NameInMap("ProductType")
        @Validation(required = true)
        public String productType;

        @NameInMap("SubscriptionType")
        @Validation(required = true)
        public String subscriptionType;

        public static QueryProductListResponseDataProductListProduct build(java.util.Map<String, ?> map) throws Exception {
            QueryProductListResponseDataProductListProduct self = new QueryProductListResponseDataProductListProduct();
            return TeaModel.build(map, self);
        }

        public QueryProductListResponseDataProductListProduct setProductCode(String productCode) {
            this.productCode = productCode;
            return this;
        }
        public String getProductCode() {
            return this.productCode;
        }

        public QueryProductListResponseDataProductListProduct setProductName(String productName) {
            this.productName = productName;
            return this;
        }
        public String getProductName() {
            return this.productName;
        }

        public QueryProductListResponseDataProductListProduct setProductType(String productType) {
            this.productType = productType;
            return this;
        }
        public String getProductType() {
            return this.productType;
        }

        public QueryProductListResponseDataProductListProduct setSubscriptionType(String subscriptionType) {
            this.subscriptionType = subscriptionType;
            return this;
        }
        public String getSubscriptionType() {
            return this.subscriptionType;
        }

    }

    public static class QueryProductListResponseDataProductList extends TeaModel {
        @NameInMap("Product")
        @Validation(required = true)
        public java.util.List<QueryProductListResponseDataProductListProduct> product;

        public static QueryProductListResponseDataProductList build(java.util.Map<String, ?> map) throws Exception {
            QueryProductListResponseDataProductList self = new QueryProductListResponseDataProductList();
            return TeaModel.build(map, self);
        }

        public QueryProductListResponseDataProductList setProduct(java.util.List<QueryProductListResponseDataProductListProduct> product) {
            this.product = product;
            return this;
        }
        public java.util.List<QueryProductListResponseDataProductListProduct> getProduct() {
            return this.product;
        }

    }

    public static class QueryProductListResponseData extends TeaModel {
        @NameInMap("TotalCount")
        @Validation(required = true)
        public Integer totalCount;

        @NameInMap("PageNum")
        @Validation(required = true)
        public Integer pageNum;

        @NameInMap("PageSize")
        @Validation(required = true)
        public Integer pageSize;

        @NameInMap("ProductList")
        @Validation(required = true)
        public QueryProductListResponseDataProductList productList;

        public static QueryProductListResponseData build(java.util.Map<String, ?> map) throws Exception {
            QueryProductListResponseData self = new QueryProductListResponseData();
            return TeaModel.build(map, self);
        }

        public QueryProductListResponseData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public QueryProductListResponseData setPageNum(Integer pageNum) {
            this.pageNum = pageNum;
            return this;
        }
        public Integer getPageNum() {
            return this.pageNum;
        }

        public QueryProductListResponseData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public QueryProductListResponseData setProductList(QueryProductListResponseDataProductList productList) {
            this.productList = productList;
            return this;
        }
        public QueryProductListResponseDataProductList getProductList() {
            return this.productList;
        }

    }

}
