// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class GetOrderDetailResponse extends TeaModel {
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
    public GetOrderDetailResponseData data;

    public static GetOrderDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        GetOrderDetailResponse self = new GetOrderDetailResponse();
        return TeaModel.build(map, self);
    }

    public static class GetOrderDetailResponseDataOrderListOrder extends TeaModel {
        @NameInMap("OrderId")
        @Validation(required = true)
        public String orderId;

        @NameInMap("SubOrderId")
        @Validation(required = true)
        public String subOrderId;

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

        @NameInMap("Region")
        @Validation(required = true)
        public String region;

        @NameInMap("Config")
        @Validation(required = true)
        public String config;

        @NameInMap("Quantity")
        @Validation(required = true)
        public String quantity;

        @NameInMap("UsageStartTime")
        @Validation(required = true)
        public String usageStartTime;

        @NameInMap("UsageEndTime")
        @Validation(required = true)
        public String usageEndTime;

        @NameInMap("InstanceIDs")
        @Validation(required = true)
        public String instanceIDs;

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

        @NameInMap("Operator")
        @Validation(required = true)
        public String operator;

        @NameInMap("RelatedOrderId")
        @Validation(required = true)
        public String relatedOrderId;

        @NameInMap("OrderSubType")
        @Validation(required = true)
        public String orderSubType;

        @NameInMap("OriginalConfig")
        @Validation(required = true)
        public String originalConfig;

        public static GetOrderDetailResponseDataOrderListOrder build(java.util.Map<String, ?> map) throws Exception {
            GetOrderDetailResponseDataOrderListOrder self = new GetOrderDetailResponseDataOrderListOrder();
            return TeaModel.build(map, self);
        }

    }

    public static class GetOrderDetailResponseDataOrderList extends TeaModel {
        @NameInMap("Order")
        @Validation(required = true)
        public java.util.List<GetOrderDetailResponseDataOrderListOrder> order;

        public static GetOrderDetailResponseDataOrderList build(java.util.Map<String, ?> map) throws Exception {
            GetOrderDetailResponseDataOrderList self = new GetOrderDetailResponseDataOrderList();
            return TeaModel.build(map, self);
        }

    }

    public static class GetOrderDetailResponseData extends TeaModel {
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
        public GetOrderDetailResponseDataOrderList orderList;

        public static GetOrderDetailResponseData build(java.util.Map<String, ?> map) throws Exception {
            GetOrderDetailResponseData self = new GetOrderDetailResponseData();
            return TeaModel.build(map, self);
        }

    }

}
