// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class QuerySettleBillResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Data")
    public QuerySettleBillResponseBodyData data;

    public static QuerySettleBillResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QuerySettleBillResponseBody self = new QuerySettleBillResponseBody();
        return TeaModel.build(map, self);
    }

    public QuerySettleBillResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QuerySettleBillResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QuerySettleBillResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QuerySettleBillResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QuerySettleBillResponseBody setData(QuerySettleBillResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QuerySettleBillResponseBodyData getData() {
        return this.data;
    }

    public static class QuerySettleBillResponseBodyDataItemsItem extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("RoundDownDiscount")
        public String roundDownDiscount;

        @NameInMap("Item")
        public String item;

        @NameInMap("Currency")
        public String currency;

        @NameInMap("BillAccountName")
        public String billAccountName;

        @NameInMap("DeductedByCashCoupons")
        public Float deductedByCashCoupons;

        @NameInMap("SubscriptionType")
        public String subscriptionType;

        @NameInMap("UsageStartTime")
        public String usageStartTime;

        @NameInMap("BizType")
        public String bizType;

        @NameInMap("UsageEndTime")
        public String usageEndTime;

        @NameInMap("DeductedByCoupons")
        public Float deductedByCoupons;

        @NameInMap("SubOrderId")
        public String subOrderId;

        @NameInMap("AfterTaxAmount")
        public Float afterTaxAmount;

        @NameInMap("OutstandingAmount")
        public Float outstandingAmount;

        @NameInMap("PaymentTime")
        public String paymentTime;

        @NameInMap("Tax")
        public Float tax;

        @NameInMap("PretaxAmountLocal")
        public Float pretaxAmountLocal;

        @NameInMap("PipCode")
        public String pipCode;

        @NameInMap("PaymentTransactionID")
        public String paymentTransactionID;

        @NameInMap("PretaxAmount")
        public Float pretaxAmount;

        @NameInMap("CommodityCode")
        public String commodityCode;

        @NameInMap("ProductName")
        public String productName;

        @NameInMap("RecordID")
        public String recordID;

        @NameInMap("ProductDetail")
        public String productDetail;

        @NameInMap("PaymentCurrency")
        public String paymentCurrency;

        @NameInMap("OwnerID")
        public String ownerID;

        @NameInMap("DeductedByPrepaidCard")
        public Float deductedByPrepaidCard;

        @NameInMap("BillAccountID")
        public String billAccountID;

        @NameInMap("PaymentAmount")
        public Float paymentAmount;

        @NameInMap("InvoiceDiscount")
        public Float invoiceDiscount;

        @NameInMap("ProductType")
        public String productType;

        @NameInMap("PretaxGrossAmount")
        public Float pretaxGrossAmount;

        @NameInMap("ProductCode")
        public String productCode;

        public static QuerySettleBillResponseBodyDataItemsItem build(java.util.Map<String, ?> map) throws Exception {
            QuerySettleBillResponseBodyDataItemsItem self = new QuerySettleBillResponseBodyDataItemsItem();
            return TeaModel.build(map, self);
        }

        public QuerySettleBillResponseBodyDataItemsItem setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public QuerySettleBillResponseBodyDataItemsItem setRoundDownDiscount(String roundDownDiscount) {
            this.roundDownDiscount = roundDownDiscount;
            return this;
        }
        public String getRoundDownDiscount() {
            return this.roundDownDiscount;
        }

        public QuerySettleBillResponseBodyDataItemsItem setItem(String item) {
            this.item = item;
            return this;
        }
        public String getItem() {
            return this.item;
        }

        public QuerySettleBillResponseBodyDataItemsItem setCurrency(String currency) {
            this.currency = currency;
            return this;
        }
        public String getCurrency() {
            return this.currency;
        }

        public QuerySettleBillResponseBodyDataItemsItem setBillAccountName(String billAccountName) {
            this.billAccountName = billAccountName;
            return this;
        }
        public String getBillAccountName() {
            return this.billAccountName;
        }

        public QuerySettleBillResponseBodyDataItemsItem setDeductedByCashCoupons(Float deductedByCashCoupons) {
            this.deductedByCashCoupons = deductedByCashCoupons;
            return this;
        }
        public Float getDeductedByCashCoupons() {
            return this.deductedByCashCoupons;
        }

        public QuerySettleBillResponseBodyDataItemsItem setSubscriptionType(String subscriptionType) {
            this.subscriptionType = subscriptionType;
            return this;
        }
        public String getSubscriptionType() {
            return this.subscriptionType;
        }

        public QuerySettleBillResponseBodyDataItemsItem setUsageStartTime(String usageStartTime) {
            this.usageStartTime = usageStartTime;
            return this;
        }
        public String getUsageStartTime() {
            return this.usageStartTime;
        }

        public QuerySettleBillResponseBodyDataItemsItem setBizType(String bizType) {
            this.bizType = bizType;
            return this;
        }
        public String getBizType() {
            return this.bizType;
        }

        public QuerySettleBillResponseBodyDataItemsItem setUsageEndTime(String usageEndTime) {
            this.usageEndTime = usageEndTime;
            return this;
        }
        public String getUsageEndTime() {
            return this.usageEndTime;
        }

        public QuerySettleBillResponseBodyDataItemsItem setDeductedByCoupons(Float deductedByCoupons) {
            this.deductedByCoupons = deductedByCoupons;
            return this;
        }
        public Float getDeductedByCoupons() {
            return this.deductedByCoupons;
        }

        public QuerySettleBillResponseBodyDataItemsItem setSubOrderId(String subOrderId) {
            this.subOrderId = subOrderId;
            return this;
        }
        public String getSubOrderId() {
            return this.subOrderId;
        }

        public QuerySettleBillResponseBodyDataItemsItem setAfterTaxAmount(Float afterTaxAmount) {
            this.afterTaxAmount = afterTaxAmount;
            return this;
        }
        public Float getAfterTaxAmount() {
            return this.afterTaxAmount;
        }

        public QuerySettleBillResponseBodyDataItemsItem setOutstandingAmount(Float outstandingAmount) {
            this.outstandingAmount = outstandingAmount;
            return this;
        }
        public Float getOutstandingAmount() {
            return this.outstandingAmount;
        }

        public QuerySettleBillResponseBodyDataItemsItem setPaymentTime(String paymentTime) {
            this.paymentTime = paymentTime;
            return this;
        }
        public String getPaymentTime() {
            return this.paymentTime;
        }

        public QuerySettleBillResponseBodyDataItemsItem setTax(Float tax) {
            this.tax = tax;
            return this;
        }
        public Float getTax() {
            return this.tax;
        }

        public QuerySettleBillResponseBodyDataItemsItem setPretaxAmountLocal(Float pretaxAmountLocal) {
            this.pretaxAmountLocal = pretaxAmountLocal;
            return this;
        }
        public Float getPretaxAmountLocal() {
            return this.pretaxAmountLocal;
        }

        public QuerySettleBillResponseBodyDataItemsItem setPipCode(String pipCode) {
            this.pipCode = pipCode;
            return this;
        }
        public String getPipCode() {
            return this.pipCode;
        }

        public QuerySettleBillResponseBodyDataItemsItem setPaymentTransactionID(String paymentTransactionID) {
            this.paymentTransactionID = paymentTransactionID;
            return this;
        }
        public String getPaymentTransactionID() {
            return this.paymentTransactionID;
        }

        public QuerySettleBillResponseBodyDataItemsItem setPretaxAmount(Float pretaxAmount) {
            this.pretaxAmount = pretaxAmount;
            return this;
        }
        public Float getPretaxAmount() {
            return this.pretaxAmount;
        }

        public QuerySettleBillResponseBodyDataItemsItem setCommodityCode(String commodityCode) {
            this.commodityCode = commodityCode;
            return this;
        }
        public String getCommodityCode() {
            return this.commodityCode;
        }

        public QuerySettleBillResponseBodyDataItemsItem setProductName(String productName) {
            this.productName = productName;
            return this;
        }
        public String getProductName() {
            return this.productName;
        }

        public QuerySettleBillResponseBodyDataItemsItem setRecordID(String recordID) {
            this.recordID = recordID;
            return this;
        }
        public String getRecordID() {
            return this.recordID;
        }

        public QuerySettleBillResponseBodyDataItemsItem setProductDetail(String productDetail) {
            this.productDetail = productDetail;
            return this;
        }
        public String getProductDetail() {
            return this.productDetail;
        }

        public QuerySettleBillResponseBodyDataItemsItem setPaymentCurrency(String paymentCurrency) {
            this.paymentCurrency = paymentCurrency;
            return this;
        }
        public String getPaymentCurrency() {
            return this.paymentCurrency;
        }

        public QuerySettleBillResponseBodyDataItemsItem setOwnerID(String ownerID) {
            this.ownerID = ownerID;
            return this;
        }
        public String getOwnerID() {
            return this.ownerID;
        }

        public QuerySettleBillResponseBodyDataItemsItem setDeductedByPrepaidCard(Float deductedByPrepaidCard) {
            this.deductedByPrepaidCard = deductedByPrepaidCard;
            return this;
        }
        public Float getDeductedByPrepaidCard() {
            return this.deductedByPrepaidCard;
        }

        public QuerySettleBillResponseBodyDataItemsItem setBillAccountID(String billAccountID) {
            this.billAccountID = billAccountID;
            return this;
        }
        public String getBillAccountID() {
            return this.billAccountID;
        }

        public QuerySettleBillResponseBodyDataItemsItem setPaymentAmount(Float paymentAmount) {
            this.paymentAmount = paymentAmount;
            return this;
        }
        public Float getPaymentAmount() {
            return this.paymentAmount;
        }

        public QuerySettleBillResponseBodyDataItemsItem setInvoiceDiscount(Float invoiceDiscount) {
            this.invoiceDiscount = invoiceDiscount;
            return this;
        }
        public Float getInvoiceDiscount() {
            return this.invoiceDiscount;
        }

        public QuerySettleBillResponseBodyDataItemsItem setProductType(String productType) {
            this.productType = productType;
            return this;
        }
        public String getProductType() {
            return this.productType;
        }

        public QuerySettleBillResponseBodyDataItemsItem setPretaxGrossAmount(Float pretaxGrossAmount) {
            this.pretaxGrossAmount = pretaxGrossAmount;
            return this;
        }
        public Float getPretaxGrossAmount() {
            return this.pretaxGrossAmount;
        }

        public QuerySettleBillResponseBodyDataItemsItem setProductCode(String productCode) {
            this.productCode = productCode;
            return this;
        }
        public String getProductCode() {
            return this.productCode;
        }

    }

    public static class QuerySettleBillResponseBodyDataItems extends TeaModel {
        @NameInMap("Item")
        public java.util.List<QuerySettleBillResponseBodyDataItemsItem> item;

        public static QuerySettleBillResponseBodyDataItems build(java.util.Map<String, ?> map) throws Exception {
            QuerySettleBillResponseBodyDataItems self = new QuerySettleBillResponseBodyDataItems();
            return TeaModel.build(map, self);
        }

        public QuerySettleBillResponseBodyDataItems setItem(java.util.List<QuerySettleBillResponseBodyDataItemsItem> item) {
            this.item = item;
            return this;
        }
        public java.util.List<QuerySettleBillResponseBodyDataItemsItem> getItem() {
            return this.item;
        }

    }

    public static class QuerySettleBillResponseBodyData extends TeaModel {
        @NameInMap("NextToken")
        public String nextToken;

        @NameInMap("BillingCycle")
        public String billingCycle;

        @NameInMap("MaxResults")
        public Integer maxResults;

        @NameInMap("AccountID")
        public String accountID;

        @NameInMap("TotalCount")
        public Integer totalCount;

        @NameInMap("AccountName")
        public String accountName;

        @NameInMap("Items")
        public QuerySettleBillResponseBodyDataItems items;

        public static QuerySettleBillResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QuerySettleBillResponseBodyData self = new QuerySettleBillResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QuerySettleBillResponseBodyData setNextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }
        public String getNextToken() {
            return this.nextToken;
        }

        public QuerySettleBillResponseBodyData setBillingCycle(String billingCycle) {
            this.billingCycle = billingCycle;
            return this;
        }
        public String getBillingCycle() {
            return this.billingCycle;
        }

        public QuerySettleBillResponseBodyData setMaxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }
        public Integer getMaxResults() {
            return this.maxResults;
        }

        public QuerySettleBillResponseBodyData setAccountID(String accountID) {
            this.accountID = accountID;
            return this;
        }
        public String getAccountID() {
            return this.accountID;
        }

        public QuerySettleBillResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public QuerySettleBillResponseBodyData setAccountName(String accountName) {
            this.accountName = accountName;
            return this;
        }
        public String getAccountName() {
            return this.accountName;
        }

        public QuerySettleBillResponseBodyData setItems(QuerySettleBillResponseBodyDataItems items) {
            this.items = items;
            return this;
        }
        public QuerySettleBillResponseBodyDataItems getItems() {
            return this.items;
        }

    }

}
