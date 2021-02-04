// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class QueryAccountBillResponse extends TeaModel {
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
    public QueryAccountBillResponseData data;

    public static QueryAccountBillResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAccountBillResponse self = new QueryAccountBillResponse();
        return TeaModel.build(map, self);
    }

    public QueryAccountBillResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryAccountBillResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryAccountBillResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryAccountBillResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryAccountBillResponse setData(QueryAccountBillResponseData data) {
        this.data = data;
        return this;
    }
    public QueryAccountBillResponseData getData() {
        return this.data;
    }

    public static class QueryAccountBillResponseDataItemsItem extends TeaModel {
        @NameInMap("CostUnit")
        @Validation(required = true)
        public String costUnit;

        @NameInMap("OwnerID")
        @Validation(required = true)
        public String ownerID;

        @NameInMap("PretaxGrossAmount")
        @Validation(required = true)
        public Float pretaxGrossAmount;

        @NameInMap("InvoiceDiscount")
        @Validation(required = true)
        public Float invoiceDiscount;

        @NameInMap("DeductedByCoupons")
        @Validation(required = true)
        public Float deductedByCoupons;

        @NameInMap("PretaxAmount")
        @Validation(required = true)
        public Float pretaxAmount;

        @NameInMap("DeductedByCashCoupons")
        @Validation(required = true)
        public Float deductedByCashCoupons;

        @NameInMap("DeductedByPrepaidCard")
        @Validation(required = true)
        public Float deductedByPrepaidCard;

        @NameInMap("PaymentAmount")
        @Validation(required = true)
        public Float paymentAmount;

        @NameInMap("OutstandingAmount")
        @Validation(required = true)
        public Float outstandingAmount;

        @NameInMap("Currency")
        @Validation(required = true)
        public String currency;

        @NameInMap("OwnerName")
        @Validation(required = true)
        public String ownerName;

        @NameInMap("ProductCode")
        @Validation(required = true)
        public String productCode;

        @NameInMap("ProductName")
        @Validation(required = true)
        public String productName;

        @NameInMap("SubscriptionType")
        @Validation(required = true)
        public String subscriptionType;

        @NameInMap("PipCode")
        @Validation(required = true)
        public String pipCode;

        @NameInMap("BillingDate")
        @Validation(required = true)
        public String billingDate;

        public static QueryAccountBillResponseDataItemsItem build(java.util.Map<String, ?> map) throws Exception {
            QueryAccountBillResponseDataItemsItem self = new QueryAccountBillResponseDataItemsItem();
            return TeaModel.build(map, self);
        }

        public QueryAccountBillResponseDataItemsItem setCostUnit(String costUnit) {
            this.costUnit = costUnit;
            return this;
        }
        public String getCostUnit() {
            return this.costUnit;
        }

        public QueryAccountBillResponseDataItemsItem setOwnerID(String ownerID) {
            this.ownerID = ownerID;
            return this;
        }
        public String getOwnerID() {
            return this.ownerID;
        }

        public QueryAccountBillResponseDataItemsItem setPretaxGrossAmount(Float pretaxGrossAmount) {
            this.pretaxGrossAmount = pretaxGrossAmount;
            return this;
        }
        public Float getPretaxGrossAmount() {
            return this.pretaxGrossAmount;
        }

        public QueryAccountBillResponseDataItemsItem setInvoiceDiscount(Float invoiceDiscount) {
            this.invoiceDiscount = invoiceDiscount;
            return this;
        }
        public Float getInvoiceDiscount() {
            return this.invoiceDiscount;
        }

        public QueryAccountBillResponseDataItemsItem setDeductedByCoupons(Float deductedByCoupons) {
            this.deductedByCoupons = deductedByCoupons;
            return this;
        }
        public Float getDeductedByCoupons() {
            return this.deductedByCoupons;
        }

        public QueryAccountBillResponseDataItemsItem setPretaxAmount(Float pretaxAmount) {
            this.pretaxAmount = pretaxAmount;
            return this;
        }
        public Float getPretaxAmount() {
            return this.pretaxAmount;
        }

        public QueryAccountBillResponseDataItemsItem setDeductedByCashCoupons(Float deductedByCashCoupons) {
            this.deductedByCashCoupons = deductedByCashCoupons;
            return this;
        }
        public Float getDeductedByCashCoupons() {
            return this.deductedByCashCoupons;
        }

        public QueryAccountBillResponseDataItemsItem setDeductedByPrepaidCard(Float deductedByPrepaidCard) {
            this.deductedByPrepaidCard = deductedByPrepaidCard;
            return this;
        }
        public Float getDeductedByPrepaidCard() {
            return this.deductedByPrepaidCard;
        }

        public QueryAccountBillResponseDataItemsItem setPaymentAmount(Float paymentAmount) {
            this.paymentAmount = paymentAmount;
            return this;
        }
        public Float getPaymentAmount() {
            return this.paymentAmount;
        }

        public QueryAccountBillResponseDataItemsItem setOutstandingAmount(Float outstandingAmount) {
            this.outstandingAmount = outstandingAmount;
            return this;
        }
        public Float getOutstandingAmount() {
            return this.outstandingAmount;
        }

        public QueryAccountBillResponseDataItemsItem setCurrency(String currency) {
            this.currency = currency;
            return this;
        }
        public String getCurrency() {
            return this.currency;
        }

        public QueryAccountBillResponseDataItemsItem setOwnerName(String ownerName) {
            this.ownerName = ownerName;
            return this;
        }
        public String getOwnerName() {
            return this.ownerName;
        }

        public QueryAccountBillResponseDataItemsItem setProductCode(String productCode) {
            this.productCode = productCode;
            return this;
        }
        public String getProductCode() {
            return this.productCode;
        }

        public QueryAccountBillResponseDataItemsItem setProductName(String productName) {
            this.productName = productName;
            return this;
        }
        public String getProductName() {
            return this.productName;
        }

        public QueryAccountBillResponseDataItemsItem setSubscriptionType(String subscriptionType) {
            this.subscriptionType = subscriptionType;
            return this;
        }
        public String getSubscriptionType() {
            return this.subscriptionType;
        }

        public QueryAccountBillResponseDataItemsItem setPipCode(String pipCode) {
            this.pipCode = pipCode;
            return this;
        }
        public String getPipCode() {
            return this.pipCode;
        }

        public QueryAccountBillResponseDataItemsItem setBillingDate(String billingDate) {
            this.billingDate = billingDate;
            return this;
        }
        public String getBillingDate() {
            return this.billingDate;
        }

    }

    public static class QueryAccountBillResponseDataItems extends TeaModel {
        @NameInMap("Item")
        @Validation(required = true)
        public java.util.List<QueryAccountBillResponseDataItemsItem> item;

        public static QueryAccountBillResponseDataItems build(java.util.Map<String, ?> map) throws Exception {
            QueryAccountBillResponseDataItems self = new QueryAccountBillResponseDataItems();
            return TeaModel.build(map, self);
        }

        public QueryAccountBillResponseDataItems setItem(java.util.List<QueryAccountBillResponseDataItemsItem> item) {
            this.item = item;
            return this;
        }
        public java.util.List<QueryAccountBillResponseDataItemsItem> getItem() {
            return this.item;
        }

    }

    public static class QueryAccountBillResponseData extends TeaModel {
        @NameInMap("BillingCycle")
        @Validation(required = true)
        public String billingCycle;

        @NameInMap("AccountID")
        @Validation(required = true)
        public String accountID;

        @NameInMap("AccountName")
        @Validation(required = true)
        public String accountName;

        @NameInMap("TotalCount")
        @Validation(required = true)
        public Integer totalCount;

        @NameInMap("PageNum")
        @Validation(required = true)
        public Integer pageNum;

        @NameInMap("PageSize")
        @Validation(required = true)
        public Integer pageSize;

        @NameInMap("Items")
        @Validation(required = true)
        public QueryAccountBillResponseDataItems items;

        public static QueryAccountBillResponseData build(java.util.Map<String, ?> map) throws Exception {
            QueryAccountBillResponseData self = new QueryAccountBillResponseData();
            return TeaModel.build(map, self);
        }

        public QueryAccountBillResponseData setBillingCycle(String billingCycle) {
            this.billingCycle = billingCycle;
            return this;
        }
        public String getBillingCycle() {
            return this.billingCycle;
        }

        public QueryAccountBillResponseData setAccountID(String accountID) {
            this.accountID = accountID;
            return this;
        }
        public String getAccountID() {
            return this.accountID;
        }

        public QueryAccountBillResponseData setAccountName(String accountName) {
            this.accountName = accountName;
            return this;
        }
        public String getAccountName() {
            return this.accountName;
        }

        public QueryAccountBillResponseData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public QueryAccountBillResponseData setPageNum(Integer pageNum) {
            this.pageNum = pageNum;
            return this;
        }
        public Integer getPageNum() {
            return this.pageNum;
        }

        public QueryAccountBillResponseData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public QueryAccountBillResponseData setItems(QueryAccountBillResponseDataItems items) {
            this.items = items;
            return this;
        }
        public QueryAccountBillResponseDataItems getItems() {
            return this.items;
        }

    }

}
