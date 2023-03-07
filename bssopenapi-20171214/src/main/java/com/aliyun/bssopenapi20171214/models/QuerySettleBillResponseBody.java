// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class QuerySettleBillResponseBody extends TeaModel {
    /**
     * <p>The status code returned.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The data returned.</p>
     */
    @NameInMap("Data")
    public QuerySettleBillResponseBodyData data;

    /**
     * <p>The message returned.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful.</p>
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
         * <p>The amount deducted by using credit refunds.</p>
         */
        @NameInMap("AdjustAmount")
        public Float adjustAmount;

        /**
         * <p>The amount paid after the tax is deducted.</p>
         */
        @NameInMap("AfterTaxAmount")
        public Float afterTaxAmount;

        /**
         * <p>The ID of the account to which the bill belongs.</p>
         */
        @NameInMap("BillAccountID")
        public String billAccountID;

        /**
         * <p>The name of the account to which the bill belongs.</p>
         */
        @NameInMap("BillAccountName")
        public String billAccountName;

        /**
         * <p>The business type.</p>
         */
        @NameInMap("BizType")
        public String bizType;

        /**
         * <p>The amount paid in cash. The amount that was deducted by using credit refunds is not included.</p>
         */
        @NameInMap("CashAmount")
        public Float cashAmount;

        /**
         * <p>The code of the commodity. The commodity code is the same as that displayed in User Center.</p>
         */
        @NameInMap("CommodityCode")
        public String commodityCode;

        /**
         * <p>The type of the currency.</p>
         * <br>
         * <p>*   CNY</p>
         * <p>*   USD</p>
         * <p>*   JPY</p>
         */
        @NameInMap("Currency")
        public String currency;

        /**
         * <p>The amount deducted by using vouchers.</p>
         */
        @NameInMap("DeductedByCashCoupons")
        public Float deductedByCashCoupons;

        /**
         * <p>The amount deducted by using coupons.</p>
         */
        @NameInMap("DeductedByCoupons")
        public Float deductedByCoupons;

        /**
         * <p>The amount deducted by using prepaid cards.</p>
         */
        @NameInMap("DeductedByPrepaidCard")
        public Float deductedByPrepaidCard;

        /**
         * <p>The discount amount.</p>
         */
        @NameInMap("InvoiceDiscount")
        public Float invoiceDiscount;

        /**
         * <p>The type of the bill. Valid values:</p>
         * <br>
         * <p>*   Subscription</p>
         * <p>*   OrderPayAsYouGoBill</p>
         * <p>*   Refund</p>
         * <p>*   Adjustment</p>
         */
        @NameInMap("Item")
        public String item;

        /**
         * <p>The unsettled amount.</p>
         */
        @NameInMap("OutstandingAmount")
        public Float outstandingAmount;

        /**
         * <p>The ID of the member. This parameter is returned in a multi-account payment scenario.</p>
         */
        @NameInMap("OwnerID")
        public String ownerID;

        /**
         * <p>The amount paid in cash. The amount that was deducted by using credit refunds is included.</p>
         */
        @NameInMap("PaymentAmount")
        public Float paymentAmount;

        /**
         * <p>The currency used for payment.</p>
         */
        @NameInMap("PaymentCurrency")
        public String paymentCurrency;

        /**
         * <p>The time when the bill was paid.</p>
         */
        @NameInMap("PaymentTime")
        public String paymentTime;

        /**
         * <p>The ID of the transaction.</p>
         */
        @NameInMap("PaymentTransactionID")
        public String paymentTransactionID;

        /**
         * <p>The code of the service. The service code is the same as that displayed in User Center.</p>
         */
        @NameInMap("PipCode")
        public String pipCode;

        /**
         * <p>The pretax amount.</p>
         */
        @NameInMap("PretaxAmount")
        public Float pretaxAmount;

        /**
         * <p>The pretax amount paid in local currency.</p>
         */
        @NameInMap("PretaxAmountLocal")
        public Float pretaxAmountLocal;

        /**
         * <p>The pretax gross amount.</p>
         */
        @NameInMap("PretaxGrossAmount")
        public Float pretaxGrossAmount;

        /**
         * <p>The code of the service.</p>
         */
        @NameInMap("ProductCode")
        public String productCode;

        /**
         * <p>The details of the service.</p>
         */
        @NameInMap("ProductDetail")
        public String productDetail;

        /**
         * <p>The name of the service.</p>
         */
        @NameInMap("ProductName")
        public String productName;

        /**
         * <p>The type of the service.</p>
         */
        @NameInMap("ProductType")
        public String productType;

        /**
         * <p>The ID of the bill or order.</p>
         */
        @NameInMap("RecordID")
        public String recordID;

        /**
         * <p>The round down discount.</p>
         */
        @NameInMap("RoundDownDiscount")
        public String roundDownDiscount;

        /**
         * <p>The payment status of the bill. Valid values:</p>
         * <br>
         * <p>*   PayFinish: The bill is paid.</p>
         * <p>*   PayUnclear: The bill is not cleared.</p>
         * <p>*   PayUnsettle: The bill is not settled.</p>
         * <p>*   NoSettle: The bill is free of settlement.</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The ID of the order corresponding to the bill.</p>
         */
        @NameInMap("SubOrderId")
        public String subOrderId;

        /**
         * <p>The billing method. Valid values:</p>
         * <br>
         * <p>*   Subscription</p>
         * <p>*   PayAsYouGo</p>
         */
        @NameInMap("SubscriptionType")
        public String subscriptionType;

        /**
         * <p>The tax.</p>
         */
        @NameInMap("Tax")
        public Float tax;

        /**
         * <p>The end time of the bill.</p>
         */
        @NameInMap("UsageEndTime")
        public String usageEndTime;

        /**
         * <p>The start time of the bill.</p>
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
         * <p>The ID of the account.</p>
         */
        @NameInMap("AccountID")
        public String accountID;

        /**
         * <p>The name of the account.</p>
         */
        @NameInMap("AccountName")
        public String accountName;

        /**
         * <p>The billing cycle, in the YYYY-MM format.</p>
         */
        @NameInMap("BillingCycle")
        public String billingCycle;

        /**
         * <p>The details of the bills.</p>
         */
        @NameInMap("Items")
        public QuerySettleBillResponseBodyDataItems items;

        /**
         * <p>The maximum number of entries returned.</p>
         */
        @NameInMap("MaxResults")
        public Integer maxResults;

        /**
         * <p>The position where the query stopped. If no value is returned for this parameter, all data has been queried.</p>
         */
        @NameInMap("NextToken")
        public String nextToken;

        /**
         * <p>The total number of returned entries.</p>
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
