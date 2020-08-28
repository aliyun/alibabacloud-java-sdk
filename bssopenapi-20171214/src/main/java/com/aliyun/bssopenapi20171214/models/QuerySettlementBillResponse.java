// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class QuerySettlementBillResponse extends TeaModel {
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
    public QuerySettlementBillResponseData data;

    public static QuerySettlementBillResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySettlementBillResponse self = new QuerySettlementBillResponse();
        return TeaModel.build(map, self);
    }

    public static class QuerySettlementBillResponseDataItemsItem extends TeaModel {
        @NameInMap("RecordID")
        @Validation(required = true)
        public String recordID;

        @NameInMap("Item")
        @Validation(required = true)
        public String item;

        @NameInMap("PayerAccount")
        @Validation(required = true)
        public String payerAccount;

        @NameInMap("OwnerID")
        @Validation(required = true)
        public String ownerID;

        @NameInMap("CreateTime")
        @Validation(required = true)
        public String createTime;

        @NameInMap("UsageStartTime")
        @Validation(required = true)
        public String usageStartTime;

        @NameInMap("UsageEndTime")
        @Validation(required = true)
        public String usageEndTime;

        @NameInMap("SuborderID")
        @Validation(required = true)
        public String suborderID;

        @NameInMap("OrderID")
        @Validation(required = true)
        public String orderID;

        @NameInMap("OrderType")
        @Validation(required = true)
        public String orderType;

        @NameInMap("LinkedCustomerOrderID")
        @Validation(required = true)
        public String linkedCustomerOrderID;

        @NameInMap("OriginalOrderID")
        @Validation(required = true)
        public String originalOrderID;

        @NameInMap("PaymentTime")
        @Validation(required = true)
        public String paymentTime;

        @NameInMap("SolutionID")
        @Validation(required = true)
        public String solutionID;

        @NameInMap("SolutionName")
        @Validation(required = true)
        public String solutionName;

        @NameInMap("BillID")
        @Validation(required = true)
        public String billID;

        @NameInMap("ProductCode")
        @Validation(required = true)
        public String productCode;

        @NameInMap("ProductType")
        @Validation(required = true)
        public String productType;

        @NameInMap("SubscriptionType")
        @Validation(required = true)
        public String subscriptionType;

        @NameInMap("Region")
        @Validation(required = true)
        public String region;

        @NameInMap("Config")
        @Validation(required = true)
        public String config;

        @NameInMap("Quantity")
        @Validation(required = true)
        public String quantity;

        @NameInMap("PretaxGrossAmount")
        @Validation(required = true)
        public Double pretaxGrossAmount;

        @NameInMap("ChargeDiscount")
        @Validation(required = true)
        public Double chargeDiscount;

        @NameInMap("DeductedByCoupons")
        @Validation(required = true)
        public Double deductedByCoupons;

        @NameInMap("AccountDiscount")
        @Validation(required = true)
        public Double accountDiscount;

        @NameInMap("Promotion")
        @Validation(required = true)
        public String promotion;

        @NameInMap("PretaxAmount")
        @Validation(required = true)
        public Double pretaxAmount;

        @NameInMap("Currency")
        @Validation(required = true)
        public String currency;

        @NameInMap("PretaxAmountLocal")
        @Validation(required = true)
        public Double pretaxAmountLocal;

        @NameInMap("PreviousBillingCycleBalance")
        @Validation(required = true)
        public Double previousBillingCycleBalance;

        @NameInMap("Tax")
        @Validation(required = true)
        public Double tax;

        @NameInMap("AfterTaxAmount")
        @Validation(required = true)
        public Double afterTaxAmount;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        @NameInMap("ClearedTime")
        @Validation(required = true)
        public String clearedTime;

        @NameInMap("OutstandingAmount")
        @Validation(required = true)
        public Double outstandingAmount;

        @NameInMap("DeductedByCashCoupons")
        @Validation(required = true)
        public Double deductedByCashCoupons;

        @NameInMap("DeductedByPrepaidCard")
        @Validation(required = true)
        public Double deductedByPrepaidCard;

        @NameInMap("MybankPaymentAmount")
        @Validation(required = true)
        public Double mybankPaymentAmount;

        @NameInMap("PaymentAmount")
        @Validation(required = true)
        public Double paymentAmount;

        @NameInMap("PaymentCurrency")
        @Validation(required = true)
        public String paymentCurrency;

        @NameInMap("Seller")
        @Validation(required = true)
        public String seller;

        @NameInMap("InvoiceNo")
        @Validation(required = true)
        public String invoiceNo;

        public static QuerySettlementBillResponseDataItemsItem build(java.util.Map<String, ?> map) throws Exception {
            QuerySettlementBillResponseDataItemsItem self = new QuerySettlementBillResponseDataItemsItem();
            return TeaModel.build(map, self);
        }

    }

    public static class QuerySettlementBillResponseDataItems extends TeaModel {
        @NameInMap("Item")
        @Validation(required = true)
        public java.util.List<QuerySettlementBillResponseDataItemsItem> item;

        public static QuerySettlementBillResponseDataItems build(java.util.Map<String, ?> map) throws Exception {
            QuerySettlementBillResponseDataItems self = new QuerySettlementBillResponseDataItems();
            return TeaModel.build(map, self);
        }

    }

    public static class QuerySettlementBillResponseData extends TeaModel {
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
        public QuerySettlementBillResponseDataItems items;

        public static QuerySettlementBillResponseData build(java.util.Map<String, ?> map) throws Exception {
            QuerySettlementBillResponseData self = new QuerySettlementBillResponseData();
            return TeaModel.build(map, self);
        }

    }

}
