// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class QueryProductListResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code returned.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The information about all Alibaba Cloud services.</p>
     */
    @NameInMap("Data")
    public QueryProductListResponseBodyData data;

    /**
     * <p>The message returned.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     */
    @NameInMap("Success")
    public Boolean success;

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

    public QueryProductListResponseBody setData(QueryProductListResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryProductListResponseBodyData getData() {
        return this.data;
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

    public static class QueryProductListResponseBodyDataProductListProduct extends TeaModel {
        /**
         * <p>The code of the service.</p>
         */
        @NameInMap("ProductCode")
        public String productCode;

        /**
         * <p>The name of the service.</p>
         */
        @NameInMap("ProductName")
        public String productName;

        /**
         * <p>The type of the service.</p>
         */
        @NameInMap("ProductType")
        public String productType;

        /**
         * <p>The billing method. Valid values:</p>
         * <br>
         * <p>*   Subscription: subscription</p>
         * <p>*   PayAsYouGo: pay-as-you-go</p>
         */
        @NameInMap("SubscriptionType")
        public String subscriptionType;

        public static QueryProductListResponseBodyDataProductListProduct build(java.util.Map<String, ?> map) throws Exception {
            QueryProductListResponseBodyDataProductListProduct self = new QueryProductListResponseBodyDataProductListProduct();
            return TeaModel.build(map, self);
        }

        public QueryProductListResponseBodyDataProductListProduct setProductCode(String productCode) {
            this.productCode = productCode;
            return this;
        }
        public String getProductCode() {
            return this.productCode;
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
        /**
         * <p>The page number of the returned page.</p>
         */
        @NameInMap("PageNum")
        public Integer pageNum;

        /**
         * <p>The number of entries returned on each page.</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The service definitions.</p>
         */
        @NameInMap("ProductList")
        public QueryProductListResponseBodyDataProductList productList;

        /**
         * <p>The total number of services.</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

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

        public QueryProductListResponseBodyData setProductList(QueryProductListResponseBodyDataProductList productList) {
            this.productList = productList;
            return this;
        }
        public QueryProductListResponseBodyDataProductList getProductList() {
            return this.productList;
        }

        public QueryProductListResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
