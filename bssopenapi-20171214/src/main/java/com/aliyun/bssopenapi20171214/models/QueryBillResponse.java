// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class QueryBillResponse extends TeaModel {
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
    public QueryBillResponseData data;

    public static QueryBillResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryBillResponse self = new QueryBillResponse();
        return TeaModel.build(map, self);
    }

    public static class QueryBillResponseDataItemsItem extends TeaModel {
        @NameInMap("RecordID")
        @Validation(required = true)
        public String recordID;

        @NameInMap("Item")
        @Validation(required = true)
        public String item;

        @NameInMap("OwnerID")
        @Validation(required = true)
        public String ownerID;

        @NameInMap("UsageStartTime")
        @Validation(required = true)
        public String usageStartTime;

        @NameInMap("UsageEndTime")
        @Validation(required = true)
        public String usageEndTime;

        @NameInMap("PaymentTime")
        @Validation(required = true)
        public String paymentTime;

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

        @NameInMap("DeductedByCoupons")
        @Validation(required = true)
        public Double deductedByCoupons;

        @NameInMap("InvoiceDiscount")
        @Validation(required = true)
        public Double invoiceDiscount;

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

        @NameInMap("PaymentAmount")
        @Validation(required = true)
        public Double paymentAmount;

        @NameInMap("DeductedByCashCoupons")
        @Validation(required = true)
        public Double deductedByCashCoupons;

        @NameInMap("DeductedByPrepaidCard")
        @Validation(required = true)
        public Double deductedByPrepaidCard;

        @NameInMap("OutstandingAmount")
        @Validation(required = true)
        public Double outstandingAmount;

        @NameInMap("AfterTaxAmount")
        @Validation(required = true)
        public Double afterTaxAmount;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        @NameInMap("PaymentCurrency")
        @Validation(required = true)
        public String paymentCurrency;

        @NameInMap("PaymentTransactionID")
        @Validation(required = true)
        public String paymentTransactionID;

        @NameInMap("RoundDownDiscount")
        @Validation(required = true)
        public String roundDownDiscount;

        @NameInMap("SubOrderId")
        @Validation(required = true)
        public String subOrderId;

        public static QueryBillResponseDataItemsItem build(java.util.Map<String, ?> map) throws Exception {
            QueryBillResponseDataItemsItem self = new QueryBillResponseDataItemsItem();
            return TeaModel.build(map, self);
        }

    }

    public static class QueryBillResponseDataItems extends TeaModel {
        @NameInMap("Item")
        @Validation(required = true)
        public java.util.List<QueryBillResponseDataItemsItem> item;

        public static QueryBillResponseDataItems build(java.util.Map<String, ?> map) throws Exception {
            QueryBillResponseDataItems self = new QueryBillResponseDataItems();
            return TeaModel.build(map, self);
        }

    }

    public static class QueryBillResponseData extends TeaModel {
        @NameInMap("BillingCycle")
        @Validation(required = true)
        public String billingCycle;

        @NameInMap("AccountID")
        @Validation(required = true)
        public String accountID;

        @NameInMap("AccountName")
        @Validation(required = true)
        public String accountName;

        @NameInMap("PageNum")
        @Validation(required = true)
        public Integer pageNum;

        @NameInMap("PageSize")
        @Validation(required = true)
        public Integer pageSize;

        @NameInMap("TotalCount")
        @Validation(required = true)
        public Integer totalCount;

        @NameInMap("Items")
        @Validation(required = true)
        public QueryBillResponseDataItems items;

        public static QueryBillResponseData build(java.util.Map<String, ?> map) throws Exception {
            QueryBillResponseData self = new QueryBillResponseData();
            return TeaModel.build(map, self);
        }

    }

}
