// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class QueryAccountBillResponseBody extends TeaModel {
    /**
     * <p>The status code returned.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The data returned.</p>
     */
    @NameInMap("Data")
    public QueryAccountBillResponseBodyData data;

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

    public static QueryAccountBillResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryAccountBillResponseBody self = new QueryAccountBillResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryAccountBillResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryAccountBillResponseBody setData(QueryAccountBillResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryAccountBillResponseBodyData getData() {
        return this.data;
    }

    public QueryAccountBillResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryAccountBillResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryAccountBillResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryAccountBillResponseBodyDataItemsItem extends TeaModel {
        /**
         * <p>The amount deducted by using credit refunds.</p>
         */
        @NameInMap("AdjustAmount")
        public Float adjustAmount;

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
         * <p>The billing date.</p>
         */
        @NameInMap("BillingDate")
        public String billingDate;

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
         * <p>The cost center.</p>
         */
        @NameInMap("CostUnit")
        public String costUnit;

        /**
         * <p>The type of the currency. Valid values:</p>
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
         * <p>The unsettled amount or the amount settled with credits.</p>
         */
        @NameInMap("OutstandingAmount")
        public Float outstandingAmount;

        /**
         * <p>The ID of the member.</p>
         */
        @NameInMap("OwnerID")
        public String ownerID;

        /**
         * <p>The name of the member.</p>
         */
        @NameInMap("OwnerName")
        public String ownerName;

        /**
         * <p>The amount paid in cash. The amount that was deducted by using credit refunds is included.</p>
         */
        @NameInMap("PaymentAmount")
        public Float paymentAmount;

        /**
         * <p>The code of the service. The service code is consistent with that displayed in User Center.</p>
         */
        @NameInMap("PipCode")
        public String pipCode;

        /**
         * <p>The pretax amount.</p>
         */
        @NameInMap("PretaxAmount")
        public Float pretaxAmount;

        /**
         * <p>The pretax gross amount.</p>
         */
        @NameInMap("PretaxGrossAmount")
        public Float pretaxGrossAmount;

        /**
         * <p>The code of the service.</p>
         * <br>
         * <p>>A value is returned only if the **IsGroupByProduct** parameter is set to true.</p>
         */
        @NameInMap("ProductCode")
        public String productCode;

        /**
         * <p>The name of the service.</p>
         * <br>
         * <p>> A value is returned only if the **IsGroupByProduct** parameter is set to true.</p>
         */
        @NameInMap("ProductName")
        public String productName;

        /**
         * <p>The billing method. Valid values:</p>
         * <br>
         * <p>*   Subscription: the subscription billing method</p>
         * <p>*   PayAsYouGo: the pay-as-you-go billing method</p>
         * <br>
         * <p>> A value is returned only if the IsGroupByProduct parameter is set to true.</p>
         */
        @NameInMap("SubscriptionType")
        public String subscriptionType;

        public static QueryAccountBillResponseBodyDataItemsItem build(java.util.Map<String, ?> map) throws Exception {
            QueryAccountBillResponseBodyDataItemsItem self = new QueryAccountBillResponseBodyDataItemsItem();
            return TeaModel.build(map, self);
        }

        public QueryAccountBillResponseBodyDataItemsItem setAdjustAmount(Float adjustAmount) {
            this.adjustAmount = adjustAmount;
            return this;
        }
        public Float getAdjustAmount() {
            return this.adjustAmount;
        }

        public QueryAccountBillResponseBodyDataItemsItem setBillAccountID(String billAccountID) {
            this.billAccountID = billAccountID;
            return this;
        }
        public String getBillAccountID() {
            return this.billAccountID;
        }

        public QueryAccountBillResponseBodyDataItemsItem setBillAccountName(String billAccountName) {
            this.billAccountName = billAccountName;
            return this;
        }
        public String getBillAccountName() {
            return this.billAccountName;
        }

        public QueryAccountBillResponseBodyDataItemsItem setBillingDate(String billingDate) {
            this.billingDate = billingDate;
            return this;
        }
        public String getBillingDate() {
            return this.billingDate;
        }

        public QueryAccountBillResponseBodyDataItemsItem setBizType(String bizType) {
            this.bizType = bizType;
            return this;
        }
        public String getBizType() {
            return this.bizType;
        }

        public QueryAccountBillResponseBodyDataItemsItem setCashAmount(Float cashAmount) {
            this.cashAmount = cashAmount;
            return this;
        }
        public Float getCashAmount() {
            return this.cashAmount;
        }

        public QueryAccountBillResponseBodyDataItemsItem setCostUnit(String costUnit) {
            this.costUnit = costUnit;
            return this;
        }
        public String getCostUnit() {
            return this.costUnit;
        }

        public QueryAccountBillResponseBodyDataItemsItem setCurrency(String currency) {
            this.currency = currency;
            return this;
        }
        public String getCurrency() {
            return this.currency;
        }

        public QueryAccountBillResponseBodyDataItemsItem setDeductedByCashCoupons(Float deductedByCashCoupons) {
            this.deductedByCashCoupons = deductedByCashCoupons;
            return this;
        }
        public Float getDeductedByCashCoupons() {
            return this.deductedByCashCoupons;
        }

        public QueryAccountBillResponseBodyDataItemsItem setDeductedByCoupons(Float deductedByCoupons) {
            this.deductedByCoupons = deductedByCoupons;
            return this;
        }
        public Float getDeductedByCoupons() {
            return this.deductedByCoupons;
        }

        public QueryAccountBillResponseBodyDataItemsItem setDeductedByPrepaidCard(Float deductedByPrepaidCard) {
            this.deductedByPrepaidCard = deductedByPrepaidCard;
            return this;
        }
        public Float getDeductedByPrepaidCard() {
            return this.deductedByPrepaidCard;
        }

        public QueryAccountBillResponseBodyDataItemsItem setInvoiceDiscount(Float invoiceDiscount) {
            this.invoiceDiscount = invoiceDiscount;
            return this;
        }
        public Float getInvoiceDiscount() {
            return this.invoiceDiscount;
        }

        public QueryAccountBillResponseBodyDataItemsItem setOutstandingAmount(Float outstandingAmount) {
            this.outstandingAmount = outstandingAmount;
            return this;
        }
        public Float getOutstandingAmount() {
            return this.outstandingAmount;
        }

        public QueryAccountBillResponseBodyDataItemsItem setOwnerID(String ownerID) {
            this.ownerID = ownerID;
            return this;
        }
        public String getOwnerID() {
            return this.ownerID;
        }

        public QueryAccountBillResponseBodyDataItemsItem setOwnerName(String ownerName) {
            this.ownerName = ownerName;
            return this;
        }
        public String getOwnerName() {
            return this.ownerName;
        }

        public QueryAccountBillResponseBodyDataItemsItem setPaymentAmount(Float paymentAmount) {
            this.paymentAmount = paymentAmount;
            return this;
        }
        public Float getPaymentAmount() {
            return this.paymentAmount;
        }

        public QueryAccountBillResponseBodyDataItemsItem setPipCode(String pipCode) {
            this.pipCode = pipCode;
            return this;
        }
        public String getPipCode() {
            return this.pipCode;
        }

        public QueryAccountBillResponseBodyDataItemsItem setPretaxAmount(Float pretaxAmount) {
            this.pretaxAmount = pretaxAmount;
            return this;
        }
        public Float getPretaxAmount() {
            return this.pretaxAmount;
        }

        public QueryAccountBillResponseBodyDataItemsItem setPretaxGrossAmount(Float pretaxGrossAmount) {
            this.pretaxGrossAmount = pretaxGrossAmount;
            return this;
        }
        public Float getPretaxGrossAmount() {
            return this.pretaxGrossAmount;
        }

        public QueryAccountBillResponseBodyDataItemsItem setProductCode(String productCode) {
            this.productCode = productCode;
            return this;
        }
        public String getProductCode() {
            return this.productCode;
        }

        public QueryAccountBillResponseBodyDataItemsItem setProductName(String productName) {
            this.productName = productName;
            return this;
        }
        public String getProductName() {
            return this.productName;
        }

        public QueryAccountBillResponseBodyDataItemsItem setSubscriptionType(String subscriptionType) {
            this.subscriptionType = subscriptionType;
            return this;
        }
        public String getSubscriptionType() {
            return this.subscriptionType;
        }

    }

    public static class QueryAccountBillResponseBodyDataItems extends TeaModel {
        @NameInMap("Item")
        public java.util.List<QueryAccountBillResponseBodyDataItemsItem> item;

        public static QueryAccountBillResponseBodyDataItems build(java.util.Map<String, ?> map) throws Exception {
            QueryAccountBillResponseBodyDataItems self = new QueryAccountBillResponseBodyDataItems();
            return TeaModel.build(map, self);
        }

        public QueryAccountBillResponseBodyDataItems setItem(java.util.List<QueryAccountBillResponseBodyDataItemsItem> item) {
            this.item = item;
            return this;
        }
        public java.util.List<QueryAccountBillResponseBodyDataItemsItem> getItem() {
            return this.item;
        }

    }

    public static class QueryAccountBillResponseBodyData extends TeaModel {
        /**
         * <p>The ID of your Alibaba Cloud account.</p>
         */
        @NameInMap("AccountID")
        public String accountID;

        /**
         * <p>The name of the Alibaba Cloud account.</p>
         */
        @NameInMap("AccountName")
        public String accountName;

        /**
         * <p>The billing cycle. Format: YYYY-MM.</p>
         */
        @NameInMap("BillingCycle")
        public String billingCycle;

        /**
         * <p>The details of the bills.</p>
         */
        @NameInMap("Items")
        public QueryAccountBillResponseBodyDataItems items;

        /**
         * <p>The page number of the returned page.</p>
         */
        @NameInMap("PageNum")
        public Integer pageNum;

        /**
         * <p>The number of entries returned per page.</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of returned entries.</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static QueryAccountBillResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryAccountBillResponseBodyData self = new QueryAccountBillResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryAccountBillResponseBodyData setAccountID(String accountID) {
            this.accountID = accountID;
            return this;
        }
        public String getAccountID() {
            return this.accountID;
        }

        public QueryAccountBillResponseBodyData setAccountName(String accountName) {
            this.accountName = accountName;
            return this;
        }
        public String getAccountName() {
            return this.accountName;
        }

        public QueryAccountBillResponseBodyData setBillingCycle(String billingCycle) {
            this.billingCycle = billingCycle;
            return this;
        }
        public String getBillingCycle() {
            return this.billingCycle;
        }

        public QueryAccountBillResponseBodyData setItems(QueryAccountBillResponseBodyDataItems items) {
            this.items = items;
            return this;
        }
        public QueryAccountBillResponseBodyDataItems getItems() {
            return this.items;
        }

        public QueryAccountBillResponseBodyData setPageNum(Integer pageNum) {
            this.pageNum = pageNum;
            return this;
        }
        public Integer getPageNum() {
            return this.pageNum;
        }

        public QueryAccountBillResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public QueryAccountBillResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
