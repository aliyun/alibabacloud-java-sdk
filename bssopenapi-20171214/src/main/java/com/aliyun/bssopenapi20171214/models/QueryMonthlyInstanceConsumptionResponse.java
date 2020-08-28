// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class QueryMonthlyInstanceConsumptionResponse extends TeaModel {
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
    public QueryMonthlyInstanceConsumptionResponseData data;

    public static QueryMonthlyInstanceConsumptionResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryMonthlyInstanceConsumptionResponse self = new QueryMonthlyInstanceConsumptionResponse();
        return TeaModel.build(map, self);
    }

    public static class QueryMonthlyInstanceConsumptionResponseDataItemsItem extends TeaModel {
        @NameInMap("InstanceID")
        @Validation(required = true)
        public String instanceID;

        @NameInMap("ProductCode")
        @Validation(required = true)
        public String productCode;

        @NameInMap("ProductType")
        @Validation(required = true)
        public String productType;

        @NameInMap("SubscriptionType")
        @Validation(required = true)
        public String subscriptionType;

        @NameInMap("Tag")
        @Validation(required = true)
        public String tag;

        @NameInMap("ResourceGroup")
        @Validation(required = true)
        public String resourceGroup;

        @NameInMap("PayerAccount")
        @Validation(required = true)
        public String payerAccount;

        @NameInMap("OwnerID")
        @Validation(required = true)
        public String ownerID;

        @NameInMap("Region")
        @Validation(required = true)
        public String region;

        @NameInMap("PretaxGrossAmount")
        @Validation(required = true)
        public Double pretaxGrossAmount;

        @NameInMap("DiscountAmount")
        @Validation(required = true)
        public Double discountAmount;

        @NameInMap("PretaxAmount")
        @Validation(required = true)
        public Double pretaxAmount;

        @NameInMap("Currency")
        @Validation(required = true)
        public String currency;

        @NameInMap("PretaxAmountLocal")
        @Validation(required = true)
        public Double pretaxAmountLocal;

        @NameInMap("Tax")
        @Validation(required = true)
        public Double tax;

        @NameInMap("AfterTaxAmount")
        @Validation(required = true)
        public Double afterTaxAmount;

        @NameInMap("PaymentCurrency")
        @Validation(required = true)
        public String paymentCurrency;

        public static QueryMonthlyInstanceConsumptionResponseDataItemsItem build(java.util.Map<String, ?> map) throws Exception {
            QueryMonthlyInstanceConsumptionResponseDataItemsItem self = new QueryMonthlyInstanceConsumptionResponseDataItemsItem();
            return TeaModel.build(map, self);
        }

    }

    public static class QueryMonthlyInstanceConsumptionResponseDataItems extends TeaModel {
        @NameInMap("Item")
        @Validation(required = true)
        public java.util.List<QueryMonthlyInstanceConsumptionResponseDataItemsItem> item;

        public static QueryMonthlyInstanceConsumptionResponseDataItems build(java.util.Map<String, ?> map) throws Exception {
            QueryMonthlyInstanceConsumptionResponseDataItems self = new QueryMonthlyInstanceConsumptionResponseDataItems();
            return TeaModel.build(map, self);
        }

    }

    public static class QueryMonthlyInstanceConsumptionResponseData extends TeaModel {
        @NameInMap("PageNum")
        @Validation(required = true)
        public Integer pageNum;

        @NameInMap("PageSize")
        @Validation(required = true)
        public Integer pageSize;

        @NameInMap("TotalCount")
        @Validation(required = true)
        public Integer totalCount;

        @NameInMap("BillingCycle")
        @Validation(required = true)
        public String billingCycle;

        @NameInMap("Items")
        @Validation(required = true)
        public QueryMonthlyInstanceConsumptionResponseDataItems items;

        public static QueryMonthlyInstanceConsumptionResponseData build(java.util.Map<String, ?> map) throws Exception {
            QueryMonthlyInstanceConsumptionResponseData self = new QueryMonthlyInstanceConsumptionResponseData();
            return TeaModel.build(map, self);
        }

    }

}
