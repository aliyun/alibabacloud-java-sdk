// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class QueryOrdersResponse extends TeaModel {
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
    public QueryOrdersResponseData data;

    public static QueryOrdersResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryOrdersResponse self = new QueryOrdersResponse();
        return TeaModel.build(map, self);
    }

    public static class QueryOrdersResponseDataOrderListOrder extends TeaModel {
        @NameInMap("OrderId")
        @Validation(required = true)
        public String orderId;

        @NameInMap("ProductCode")
        @Validation(required = true)
        public String productCode;

        @NameInMap("ProductType")
        @Validation(required = true)
        public String productType;

        @NameInMap("SubscriptionType")
        @Validation(required = true)
        public String subscriptionType;

        @NameInMap("OrderType")
        @Validation(required = true)
        public String orderType;

        @NameInMap("CreateTime")
        @Validation(required = true)
        public String createTime;

        @NameInMap("PaymentTime")
        @Validation(required = true)
        public String paymentTime;

        @NameInMap("PaymentStatus")
        @Validation(required = true)
        public String paymentStatus;

        @NameInMap("PretaxGrossAmount")
        @Validation(required = true)
        public String pretaxGrossAmount;

        @NameInMap("PretaxAmount")
        @Validation(required = true)
        public String pretaxAmount;

        @NameInMap("Currency")
        @Validation(required = true)
        public String currency;

        @NameInMap("PretaxAmountLocal")
        @Validation(required = true)
        public String pretaxAmountLocal;

        @NameInMap("Tax")
        @Validation(required = true)
        public String tax;

        @NameInMap("AfterTaxAmount")
        @Validation(required = true)
        public String afterTaxAmount;

        @NameInMap("PaymentCurrency")
        @Validation(required = true)
        public String paymentCurrency;

        @NameInMap("RelatedOrderId")
        @Validation(required = true)
        public String relatedOrderId;

        public static QueryOrdersResponseDataOrderListOrder build(java.util.Map<String, ?> map) throws Exception {
            QueryOrdersResponseDataOrderListOrder self = new QueryOrdersResponseDataOrderListOrder();
            return TeaModel.build(map, self);
        }

    }

    public static class QueryOrdersResponseDataOrderList extends TeaModel {
        @NameInMap("Order")
        @Validation(required = true)
        public java.util.List<QueryOrdersResponseDataOrderListOrder> order;

        public static QueryOrdersResponseDataOrderList build(java.util.Map<String, ?> map) throws Exception {
            QueryOrdersResponseDataOrderList self = new QueryOrdersResponseDataOrderList();
            return TeaModel.build(map, self);
        }

    }

    public static class QueryOrdersResponseData extends TeaModel {
        @NameInMap("HostName")
        @Validation(required = true)
        public String hostName;

        @NameInMap("PageNum")
        @Validation(required = true)
        public Integer pageNum;

        @NameInMap("PageSize")
        @Validation(required = true)
        public Integer pageSize;

        @NameInMap("TotalCount")
        @Validation(required = true)
        public Integer totalCount;

        @NameInMap("OrderList")
        @Validation(required = true)
        public QueryOrdersResponseDataOrderList orderList;

        public static QueryOrdersResponseData build(java.util.Map<String, ?> map) throws Exception {
            QueryOrdersResponseData self = new QueryOrdersResponseData();
            return TeaModel.build(map, self);
        }

    }

}
