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

    }

    public static class QueryProductListResponseDataProductList extends TeaModel {
        @NameInMap("Product")
        @Validation(required = true)
        public java.util.List<QueryProductListResponseDataProductListProduct> product;

        public static QueryProductListResponseDataProductList build(java.util.Map<String, ?> map) throws Exception {
            QueryProductListResponseDataProductList self = new QueryProductListResponseDataProductList();
            return TeaModel.build(map, self);
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

    }

}
