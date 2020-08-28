// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class QueryBillOverviewResponse extends TeaModel {
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
    public QueryBillOverviewResponseData data;

    public static QueryBillOverviewResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryBillOverviewResponse self = new QueryBillOverviewResponse();
        return TeaModel.build(map, self);
    }

    public static class QueryBillOverviewResponseDataItemsItem extends TeaModel {
        @NameInMap("Item")
        @Validation(required = true)
        public String item;

        @NameInMap("ProductCode")
        @Validation(required = true)
        public String productCode;

        @NameInMap("ProductType")
        @Validation(required = true)
        public String productType;

        @NameInMap("SubscriptionType")
        @Validation(required = true)
        public String subscriptionType;

        @NameInMap("ProductName")
        @Validation(required = true)
        public String productName;

        @NameInMap("ProductDetail")
        @Validation(required = true)
        public String productDetail;

        @NameInMap("PretaxGrossAmount")
        @Validation(required = true)
        public Double pretaxGrossAmount;

        @NameInMap("InvoiceDiscount")
        @Validation(required = true)
        public Double invoiceDiscount;

        @NameInMap("DeductedByCoupons")
        @Validation(required = true)
        public Double deductedByCoupons;

        @NameInMap("PretaxAmount")
        @Validation(required = true)
        public Double pretaxAmount;

        @NameInMap("Currency")
        @Validation(required = true)
        public String currency;

        @NameInMap("PaymentAmount")
        @Validation(required = true)
        public Double paymentAmount;

        @NameInMap("OutstandingAmount")
        @Validation(required = true)
        public Double outstandingAmount;

        @NameInMap("DeductedByCashCoupons")
        @Validation(required = true)
        public Double deductedByCashCoupons;

        @NameInMap("DeductedByPrepaidCard")
        @Validation(required = true)
        public Double deductedByPrepaidCard;

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

        @NameInMap("RoundDownDiscount")
        @Validation(required = true)
        public String roundDownDiscount;

        public static QueryBillOverviewResponseDataItemsItem build(java.util.Map<String, ?> map) throws Exception {
            QueryBillOverviewResponseDataItemsItem self = new QueryBillOverviewResponseDataItemsItem();
            return TeaModel.build(map, self);
        }

    }

    public static class QueryBillOverviewResponseDataItems extends TeaModel {
        @NameInMap("Item")
        @Validation(required = true)
        public java.util.List<QueryBillOverviewResponseDataItemsItem> item;

        public static QueryBillOverviewResponseDataItems build(java.util.Map<String, ?> map) throws Exception {
            QueryBillOverviewResponseDataItems self = new QueryBillOverviewResponseDataItems();
            return TeaModel.build(map, self);
        }

    }

    public static class QueryBillOverviewResponseData extends TeaModel {
        @NameInMap("BillingCycle")
        @Validation(required = true)
        public String billingCycle;

        @NameInMap("AccountID")
        @Validation(required = true)
        public String accountID;

        @NameInMap("AccountName")
        @Validation(required = true)
        public String accountName;

        @NameInMap("Items")
        @Validation(required = true)
        public QueryBillOverviewResponseDataItems items;

        public static QueryBillOverviewResponseData build(java.util.Map<String, ?> map) throws Exception {
            QueryBillOverviewResponseData self = new QueryBillOverviewResponseData();
            return TeaModel.build(map, self);
        }

    }

}
