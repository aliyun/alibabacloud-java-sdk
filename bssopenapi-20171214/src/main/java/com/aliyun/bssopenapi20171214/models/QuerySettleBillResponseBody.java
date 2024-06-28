// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class QuerySettleBillResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public QuerySettleBillResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>Successful!</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>AE3F4057-DFC9-4B81-8858-F620651010C9</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

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

    public QuerySettleBillResponseBody setData(QuerySettleBillResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QuerySettleBillResponseBodyData getData() {
        return this.data;
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

    public static class QuerySettleBillResponseBodyDataItemsItem extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("AdjustAmount")
        public Float adjustAmount;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("AfterTaxAmount")
        public Float afterTaxAmount;

        /**
         * <strong>example:</strong>
         * <p>185xxxxx489</p>
         */
        @NameInMap("BillAccountID")
        public String billAccountID;

        /**
         * <strong>example:</strong>
         * <p><a href="mailto:test@test.aliyunid.com">test@test.aliyunid.com</a></p>
         */
        @NameInMap("BillAccountName")
        public String billAccountName;

        /**
         * <strong>example:</strong>
         * <p>trusteeship</p>
         */
        @NameInMap("BizType")
        public String bizType;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("CashAmount")
        public Float cashAmount;

        /**
         * <strong>example:</strong>
         * <p>rds</p>
         */
        @NameInMap("CommodityCode")
        public String commodityCode;

        /**
         * <strong>example:</strong>
         * <p>CNY</p>
         */
        @NameInMap("Currency")
        public String currency;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("DeductedByCashCoupons")
        public Float deductedByCashCoupons;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("DeductedByCoupons")
        public Float deductedByCoupons;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("DeductedByPrepaidCard")
        public Float deductedByPrepaidCard;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("InvoiceDiscount")
        public Float invoiceDiscount;

        /**
         * <strong>example:</strong>
         * <p>SubscriptionOrder</p>
         */
        @NameInMap("Item")
        public String item;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("OutstandingAmount")
        public Float outstandingAmount;

        /**
         * <strong>example:</strong>
         * <p>3532535235</p>
         */
        @NameInMap("OwnerID")
        public String ownerID;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("PaymentAmount")
        public Float paymentAmount;

        /**
         * <strong>example:</strong>
         * <p>USD</p>
         */
        @NameInMap("PaymentCurrency")
        public String paymentCurrency;

        /**
         * <strong>example:</strong>
         * <p>2020-03-11 08:00:00</p>
         */
        @NameInMap("PaymentTime")
        public String paymentTime;

        /**
         * <strong>example:</strong>
         * <p>2O3AADJFEAF2PDKSFAMFCB11918</p>
         */
        @NameInMap("PaymentTransactionID")
        public String paymentTransactionID;

        /**
         * <strong>example:</strong>
         * <p>rds</p>
         */
        @NameInMap("PipCode")
        public String pipCode;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("PretaxAmount")
        public Float pretaxAmount;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("PretaxAmountLocal")
        public Float pretaxAmountLocal;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("PretaxGrossAmount")
        public Float pretaxGrossAmount;

        /**
         * <strong>example:</strong>
         * <p>rds</p>
         */
        @NameInMap("ProductCode")
        public String productCode;

        @NameInMap("ProductDetail")
        public String productDetail;

        @NameInMap("ProductName")
        public String productName;

        /**
         * <strong>example:</strong>
         * <p>rds</p>
         */
        @NameInMap("ProductType")
        public String productType;

        /**
         * <strong>example:</strong>
         * <p>2020xxxx5912</p>
         */
        @NameInMap("RecordID")
        public String recordID;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("RoundDownDiscount")
        public String roundDownDiscount;

        /**
         * <strong>example:</strong>
         * <p>PayFinish</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>325345254353</p>
         */
        @NameInMap("SubOrderId")
        public String subOrderId;

        /**
         * <strong>example:</strong>
         * <p>PayAsYouGo</p>
         */
        @NameInMap("SubscriptionType")
        public String subscriptionType;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Tax")
        public Float tax;

        /**
         * <strong>example:</strong>
         * <p>2020-03-11 08:00:00</p>
         */
        @NameInMap("UsageEndTime")
        public String usageEndTime;

        /**
         * <strong>example:</strong>
         * <p>2020-03-11 07:00:00</p>
         */
        @NameInMap("UsageStartTime")
        public String usageStartTime;

        public static QuerySettleBillResponseBodyDataItemsItem build(java.util.Map<String, ?> map) throws Exception {
            QuerySettleBillResponseBodyDataItemsItem self = new QuerySettleBillResponseBodyDataItemsItem();
            return TeaModel.build(map, self);
        }

        public QuerySettleBillResponseBodyDataItemsItem setAdjustAmount(Float adjustAmount) {
            this.adjustAmount = adjustAmount;
            return this;
        }
        public Float getAdjustAmount() {
            return this.adjustAmount;
        }

        public QuerySettleBillResponseBodyDataItemsItem setAfterTaxAmount(Float afterTaxAmount) {
            this.afterTaxAmount = afterTaxAmount;
            return this;
        }
        public Float getAfterTaxAmount() {
            return this.afterTaxAmount;
        }

        public QuerySettleBillResponseBodyDataItemsItem setBillAccountID(String billAccountID) {
            this.billAccountID = billAccountID;
            return this;
        }
        public String getBillAccountID() {
            return this.billAccountID;
        }

        public QuerySettleBillResponseBodyDataItemsItem setBillAccountName(String billAccountName) {
            this.billAccountName = billAccountName;
            return this;
        }
        public String getBillAccountName() {
            return this.billAccountName;
        }

        public QuerySettleBillResponseBodyDataItemsItem setBizType(String bizType) {
            this.bizType = bizType;
            return this;
        }
        public String getBizType() {
            return this.bizType;
        }

        public QuerySettleBillResponseBodyDataItemsItem setCashAmount(Float cashAmount) {
            this.cashAmount = cashAmount;
            return this;
        }
        public Float getCashAmount() {
            return this.cashAmount;
        }

        public QuerySettleBillResponseBodyDataItemsItem setCommodityCode(String commodityCode) {
            this.commodityCode = commodityCode;
            return this;
        }
        public String getCommodityCode() {
            return this.commodityCode;
        }

        public QuerySettleBillResponseBodyDataItemsItem setCurrency(String currency) {
            this.currency = currency;
            return this;
        }
        public String getCurrency() {
            return this.currency;
        }

        public QuerySettleBillResponseBodyDataItemsItem setDeductedByCashCoupons(Float deductedByCashCoupons) {
            this.deductedByCashCoupons = deductedByCashCoupons;
            return this;
        }
        public Float getDeductedByCashCoupons() {
            return this.deductedByCashCoupons;
        }

        public QuerySettleBillResponseBodyDataItemsItem setDeductedByCoupons(Float deductedByCoupons) {
            this.deductedByCoupons = deductedByCoupons;
            return this;
        }
        public Float getDeductedByCoupons() {
            return this.deductedByCoupons;
        }

        public QuerySettleBillResponseBodyDataItemsItem setDeductedByPrepaidCard(Float deductedByPrepaidCard) {
            this.deductedByPrepaidCard = deductedByPrepaidCard;
            return this;
        }
        public Float getDeductedByPrepaidCard() {
            return this.deductedByPrepaidCard;
        }

        public QuerySettleBillResponseBodyDataItemsItem setInvoiceDiscount(Float invoiceDiscount) {
            this.invoiceDiscount = invoiceDiscount;
            return this;
        }
        public Float getInvoiceDiscount() {
            return this.invoiceDiscount;
        }

        public QuerySettleBillResponseBodyDataItemsItem setItem(String item) {
            this.item = item;
            return this;
        }
        public String getItem() {
            return this.item;
        }

        public QuerySettleBillResponseBodyDataItemsItem setOutstandingAmount(Float outstandingAmount) {
            this.outstandingAmount = outstandingAmount;
            return this;
        }
        public Float getOutstandingAmount() {
            return this.outstandingAmount;
        }

        public QuerySettleBillResponseBodyDataItemsItem setOwnerID(String ownerID) {
            this.ownerID = ownerID;
            return this;
        }
        public String getOwnerID() {
            return this.ownerID;
        }

        public QuerySettleBillResponseBodyDataItemsItem setPaymentAmount(Float paymentAmount) {
            this.paymentAmount = paymentAmount;
            return this;
        }
        public Float getPaymentAmount() {
            return this.paymentAmount;
        }

        public QuerySettleBillResponseBodyDataItemsItem setPaymentCurrency(String paymentCurrency) {
            this.paymentCurrency = paymentCurrency;
            return this;
        }
        public String getPaymentCurrency() {
            return this.paymentCurrency;
        }

        public QuerySettleBillResponseBodyDataItemsItem setPaymentTime(String paymentTime) {
            this.paymentTime = paymentTime;
            return this;
        }
        public String getPaymentTime() {
            return this.paymentTime;
        }

        public QuerySettleBillResponseBodyDataItemsItem setPaymentTransactionID(String paymentTransactionID) {
            this.paymentTransactionID = paymentTransactionID;
            return this;
        }
        public String getPaymentTransactionID() {
            return this.paymentTransactionID;
        }

        public QuerySettleBillResponseBodyDataItemsItem setPipCode(String pipCode) {
            this.pipCode = pipCode;
            return this;
        }
        public String getPipCode() {
            return this.pipCode;
        }

        public QuerySettleBillResponseBodyDataItemsItem setPretaxAmount(Float pretaxAmount) {
            this.pretaxAmount = pretaxAmount;
            return this;
        }
        public Float getPretaxAmount() {
            return this.pretaxAmount;
        }

        public QuerySettleBillResponseBodyDataItemsItem setPretaxAmountLocal(Float pretaxAmountLocal) {
            this.pretaxAmountLocal = pretaxAmountLocal;
            return this;
        }
        public Float getPretaxAmountLocal() {
            return this.pretaxAmountLocal;
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

        public QuerySettleBillResponseBodyDataItemsItem setProductDetail(String productDetail) {
            this.productDetail = productDetail;
            return this;
        }
        public String getProductDetail() {
            return this.productDetail;
        }

        public QuerySettleBillResponseBodyDataItemsItem setProductName(String productName) {
            this.productName = productName;
            return this;
        }
        public String getProductName() {
            return this.productName;
        }

        public QuerySettleBillResponseBodyDataItemsItem setProductType(String productType) {
            this.productType = productType;
            return this;
        }
        public String getProductType() {
            return this.productType;
        }

        public QuerySettleBillResponseBodyDataItemsItem setRecordID(String recordID) {
            this.recordID = recordID;
            return this;
        }
        public String getRecordID() {
            return this.recordID;
        }

        public QuerySettleBillResponseBodyDataItemsItem setRoundDownDiscount(String roundDownDiscount) {
            this.roundDownDiscount = roundDownDiscount;
            return this;
        }
        public String getRoundDownDiscount() {
            return this.roundDownDiscount;
        }

        public QuerySettleBillResponseBodyDataItemsItem setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public QuerySettleBillResponseBodyDataItemsItem setSubOrderId(String subOrderId) {
            this.subOrderId = subOrderId;
            return this;
        }
        public String getSubOrderId() {
            return this.subOrderId;
        }

        public QuerySettleBillResponseBodyDataItemsItem setSubscriptionType(String subscriptionType) {
            this.subscriptionType = subscriptionType;
            return this;
        }
        public String getSubscriptionType() {
            return this.subscriptionType;
        }

        public QuerySettleBillResponseBodyDataItemsItem setTax(Float tax) {
            this.tax = tax;
            return this;
        }
        public Float getTax() {
            return this.tax;
        }

        public QuerySettleBillResponseBodyDataItemsItem setUsageEndTime(String usageEndTime) {
            this.usageEndTime = usageEndTime;
            return this;
        }
        public String getUsageEndTime() {
            return this.usageEndTime;
        }

        public QuerySettleBillResponseBodyDataItemsItem setUsageStartTime(String usageStartTime) {
            this.usageStartTime = usageStartTime;
            return this;
        }
        public String getUsageStartTime() {
            return this.usageStartTime;
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
        /**
         * <strong>example:</strong>
         * <p>185xxxxx489</p>
         */
        @NameInMap("AccountID")
        public String accountID;

        /**
         * <strong>example:</strong>
         * <p><a href="mailto:test@test.aliyunid.com">test@test.aliyunid.com</a></p>
         */
        @NameInMap("AccountName")
        public String accountName;

        /**
         * <strong>example:</strong>
         * <p>2020-02</p>
         */
        @NameInMap("BillingCycle")
        public String billingCycle;

        @NameInMap("Items")
        public QuerySettleBillResponseBodyDataItems items;

        /**
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("MaxResults")
        public Integer maxResults;

        /**
         * <strong>example:</strong>
         * <p>CAESEgoQCg4KCmdtdF9jcmVhdGUQARgBIkgKCQBwhGmPcAEAAAo7AzYAAAAxTDgwMDcxMjg3ZDJhNmM3ZDguTDgwMDAwMDAwMDAwMzE1MTIuTDgwMDcyZDMyZTJkYzg3N2U</p>
         */
        @NameInMap("NextToken")
        public String nextToken;

        /**
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static QuerySettleBillResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QuerySettleBillResponseBodyData self = new QuerySettleBillResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QuerySettleBillResponseBodyData setAccountID(String accountID) {
            this.accountID = accountID;
            return this;
        }
        public String getAccountID() {
            return this.accountID;
        }

        public QuerySettleBillResponseBodyData setAccountName(String accountName) {
            this.accountName = accountName;
            return this;
        }
        public String getAccountName() {
            return this.accountName;
        }

        public QuerySettleBillResponseBodyData setBillingCycle(String billingCycle) {
            this.billingCycle = billingCycle;
            return this;
        }
        public String getBillingCycle() {
            return this.billingCycle;
        }

        public QuerySettleBillResponseBodyData setItems(QuerySettleBillResponseBodyDataItems items) {
            this.items = items;
            return this;
        }
        public QuerySettleBillResponseBodyDataItems getItems() {
            return this.items;
        }

        public QuerySettleBillResponseBodyData setMaxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }
        public Integer getMaxResults() {
            return this.maxResults;
        }

        public QuerySettleBillResponseBodyData setNextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }
        public String getNextToken() {
            return this.nextToken;
        }

        public QuerySettleBillResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
