// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class QueryAccountBillResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Data")
    public QueryAccountBillResponseBodyData data;

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

    public QueryAccountBillResponseBody setData(QueryAccountBillResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryAccountBillResponseBodyData getData() {
        return this.data;
    }

    public static class QueryAccountBillResponseBodyDataItemsItem extends TeaModel {
        @NameInMap("PipCode")
        public String pipCode;

        @NameInMap("PretaxAmount")
        public Float pretaxAmount;

        @NameInMap("BillingDate")
        public String billingDate;

        @NameInMap("ProductName")
        public String productName;

        @NameInMap("OwnerName")
        public String ownerName;

        @NameInMap("Currency")
        public String currency;

        @NameInMap("BillAccountName")
        public String billAccountName;

        @NameInMap("SubscriptionType")
        public String subscriptionType;

        @NameInMap("DeductedByCashCoupons")
        public Float deductedByCashCoupons;

        @NameInMap("BizType")
        public String bizType;

        @NameInMap("OwnerID")
        public String ownerID;

        @NameInMap("DeductedByPrepaidCard")
        public Float deductedByPrepaidCard;

        @NameInMap("DeductedByCoupons")
        public Float deductedByCoupons;

        @NameInMap("BillAccountID")
        public String billAccountID;

        @NameInMap("PaymentAmount")
        public Float paymentAmount;

        @NameInMap("InvoiceDiscount")
        public Float invoiceDiscount;

        @NameInMap("OutstandingAmount")
        public Float outstandingAmount;

        @NameInMap("CostUnit")
        public String costUnit;

        @NameInMap("PretaxGrossAmount")
        public Float pretaxGrossAmount;

        @NameInMap("ProductCode")
        public String productCode;

        public static QueryAccountBillResponseBodyDataItemsItem build(java.util.Map<String, ?> map) throws Exception {
            QueryAccountBillResponseBodyDataItemsItem self = new QueryAccountBillResponseBodyDataItemsItem();
            return TeaModel.build(map, self);
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

        public QueryAccountBillResponseBodyDataItemsItem setBillingDate(String billingDate) {
            this.billingDate = billingDate;
            return this;
        }
        public String getBillingDate() {
            return this.billingDate;
        }

        public QueryAccountBillResponseBodyDataItemsItem setProductName(String productName) {
            this.productName = productName;
            return this;
        }
        public String getProductName() {
            return this.productName;
        }

        public QueryAccountBillResponseBodyDataItemsItem setOwnerName(String ownerName) {
            this.ownerName = ownerName;
            return this;
        }
        public String getOwnerName() {
            return this.ownerName;
        }

        public QueryAccountBillResponseBodyDataItemsItem setCurrency(String currency) {
            this.currency = currency;
            return this;
        }
        public String getCurrency() {
            return this.currency;
        }

        public QueryAccountBillResponseBodyDataItemsItem setBillAccountName(String billAccountName) {
            this.billAccountName = billAccountName;
            return this;
        }
        public String getBillAccountName() {
            return this.billAccountName;
        }

        public QueryAccountBillResponseBodyDataItemsItem setSubscriptionType(String subscriptionType) {
            this.subscriptionType = subscriptionType;
            return this;
        }
        public String getSubscriptionType() {
            return this.subscriptionType;
        }

        public QueryAccountBillResponseBodyDataItemsItem setDeductedByCashCoupons(Float deductedByCashCoupons) {
            this.deductedByCashCoupons = deductedByCashCoupons;
            return this;
        }
        public Float getDeductedByCashCoupons() {
            return this.deductedByCashCoupons;
        }

        public QueryAccountBillResponseBodyDataItemsItem setBizType(String bizType) {
            this.bizType = bizType;
            return this;
        }
        public String getBizType() {
            return this.bizType;
        }

        public QueryAccountBillResponseBodyDataItemsItem setOwnerID(String ownerID) {
            this.ownerID = ownerID;
            return this;
        }
        public String getOwnerID() {
            return this.ownerID;
        }

        public QueryAccountBillResponseBodyDataItemsItem setDeductedByPrepaidCard(Float deductedByPrepaidCard) {
            this.deductedByPrepaidCard = deductedByPrepaidCard;
            return this;
        }
        public Float getDeductedByPrepaidCard() {
            return this.deductedByPrepaidCard;
        }

        public QueryAccountBillResponseBodyDataItemsItem setDeductedByCoupons(Float deductedByCoupons) {
            this.deductedByCoupons = deductedByCoupons;
            return this;
        }
        public Float getDeductedByCoupons() {
            return this.deductedByCoupons;
        }

        public QueryAccountBillResponseBodyDataItemsItem setBillAccountID(String billAccountID) {
            this.billAccountID = billAccountID;
            return this;
        }
        public String getBillAccountID() {
            return this.billAccountID;
        }

        public QueryAccountBillResponseBodyDataItemsItem setPaymentAmount(Float paymentAmount) {
            this.paymentAmount = paymentAmount;
            return this;
        }
        public Float getPaymentAmount() {
            return this.paymentAmount;
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

        public QueryAccountBillResponseBodyDataItemsItem setCostUnit(String costUnit) {
            this.costUnit = costUnit;
            return this;
        }
        public String getCostUnit() {
            return this.costUnit;
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
        @NameInMap("PageNum")
        public Integer pageNum;

        @NameInMap("BillingCycle")
        public String billingCycle;

        @NameInMap("AccountID")
        public String accountID;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        @NameInMap("AccountName")
        public String accountName;

        @NameInMap("Items")
        public QueryAccountBillResponseBodyDataItems items;

        public static QueryAccountBillResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryAccountBillResponseBodyData self = new QueryAccountBillResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryAccountBillResponseBodyData setPageNum(Integer pageNum) {
            this.pageNum = pageNum;
            return this;
        }
        public Integer getPageNum() {
            return this.pageNum;
        }

        public QueryAccountBillResponseBodyData setBillingCycle(String billingCycle) {
            this.billingCycle = billingCycle;
            return this;
        }
        public String getBillingCycle() {
            return this.billingCycle;
        }

        public QueryAccountBillResponseBodyData setAccountID(String accountID) {
            this.accountID = accountID;
            return this;
        }
        public String getAccountID() {
            return this.accountID;
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

        public QueryAccountBillResponseBodyData setAccountName(String accountName) {
            this.accountName = accountName;
            return this;
        }
        public String getAccountName() {
            return this.accountName;
        }

        public QueryAccountBillResponseBodyData setItems(QueryAccountBillResponseBodyDataItems items) {
            this.items = items;
            return this;
        }
        public QueryAccountBillResponseBodyDataItems getItems() {
            return this.items;
        }

    }

}
