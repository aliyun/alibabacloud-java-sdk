// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class QueryMonthlyBillResponse extends TeaModel {
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
    public QueryMonthlyBillResponseData data;

    public static QueryMonthlyBillResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryMonthlyBillResponse self = new QueryMonthlyBillResponse();
        return TeaModel.build(map, self);
    }

    public static class QueryMonthlyBillResponseDataItemsItem extends TeaModel {
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

        @NameInMap("SolutionCode")
        @Validation(required = true)
        public String solutionCode;

        @NameInMap("SolutionName")
        @Validation(required = true)
        public String solutionName;

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

        @NameInMap("PretaxAmountLocal")
        @Validation(required = true)
        public Double pretaxAmountLocal;

        @NameInMap("Tax")
        @Validation(required = true)
        public Double tax;

        @NameInMap("AfterTaxAmount")
        @Validation(required = true)
        public Double afterTaxAmount;

        @NameInMap("OutstandingAmount")
        @Validation(required = true)
        public Double outstandingAmount;

        @NameInMap("DeductedByCashCoupons")
        @Validation(required = true)
        public Double deductedByCashCoupons;

        @NameInMap("DeductedByPrepaidCard")
        @Validation(required = true)
        public Double deductedByPrepaidCard;

        @NameInMap("PaymentAmount")
        @Validation(required = true)
        public Double paymentAmount;

        @NameInMap("PaymentCurrency")
        @Validation(required = true)
        public String paymentCurrency;

        public static QueryMonthlyBillResponseDataItemsItem build(java.util.Map<String, ?> map) throws Exception {
            QueryMonthlyBillResponseDataItemsItem self = new QueryMonthlyBillResponseDataItemsItem();
            return TeaModel.build(map, self);
        }

    }

    public static class QueryMonthlyBillResponseDataItems extends TeaModel {
        @NameInMap("Item")
        @Validation(required = true)
        public java.util.List<QueryMonthlyBillResponseDataItemsItem> item;

        public static QueryMonthlyBillResponseDataItems build(java.util.Map<String, ?> map) throws Exception {
            QueryMonthlyBillResponseDataItems self = new QueryMonthlyBillResponseDataItems();
            return TeaModel.build(map, self);
        }

    }

    public static class QueryMonthlyBillResponseData extends TeaModel {
        @NameInMap("OutstandingAmount")
        @Validation(required = true)
        public Double outstandingAmount;

        @NameInMap("TotalOutstandingAmount")
        @Validation(required = true)
        public Double totalOutstandingAmount;

        @NameInMap("NewInvoiceAmount")
        @Validation(required = true)
        public Double newInvoiceAmount;

        @NameInMap("BillingCycle")
        @Validation(required = true)
        public String billingCycle;

        @NameInMap("Items")
        @Validation(required = true)
        public QueryMonthlyBillResponseDataItems items;

        public static QueryMonthlyBillResponseData build(java.util.Map<String, ?> map) throws Exception {
            QueryMonthlyBillResponseData self = new QueryMonthlyBillResponseData();
            return TeaModel.build(map, self);
        }

    }

}
