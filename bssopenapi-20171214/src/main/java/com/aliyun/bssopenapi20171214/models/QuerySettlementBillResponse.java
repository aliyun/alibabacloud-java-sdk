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

    public QuerySettlementBillResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QuerySettlementBillResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QuerySettlementBillResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QuerySettlementBillResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QuerySettlementBillResponse setData(QuerySettlementBillResponseData data) {
        this.data = data;
        return this;
    }
    public QuerySettlementBillResponseData getData() {
        return this.data;
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
        public Float pretaxGrossAmount;

        @NameInMap("ChargeDiscount")
        @Validation(required = true)
        public Float chargeDiscount;

        @NameInMap("DeductedByCoupons")
        @Validation(required = true)
        public Float deductedByCoupons;

        @NameInMap("AccountDiscount")
        @Validation(required = true)
        public Float accountDiscount;

        @NameInMap("Promotion")
        @Validation(required = true)
        public String promotion;

        @NameInMap("PretaxAmount")
        @Validation(required = true)
        public Float pretaxAmount;

        @NameInMap("Currency")
        @Validation(required = true)
        public String currency;

        @NameInMap("PretaxAmountLocal")
        @Validation(required = true)
        public Float pretaxAmountLocal;

        @NameInMap("PreviousBillingCycleBalance")
        @Validation(required = true)
        public Float previousBillingCycleBalance;

        @NameInMap("Tax")
        @Validation(required = true)
        public Float tax;

        @NameInMap("AfterTaxAmount")
        @Validation(required = true)
        public Float afterTaxAmount;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        @NameInMap("ClearedTime")
        @Validation(required = true)
        public String clearedTime;

        @NameInMap("OutstandingAmount")
        @Validation(required = true)
        public Float outstandingAmount;

        @NameInMap("DeductedByCashCoupons")
        @Validation(required = true)
        public Float deductedByCashCoupons;

        @NameInMap("DeductedByPrepaidCard")
        @Validation(required = true)
        public Float deductedByPrepaidCard;

        @NameInMap("MybankPaymentAmount")
        @Validation(required = true)
        public Float mybankPaymentAmount;

        @NameInMap("PaymentAmount")
        @Validation(required = true)
        public Float paymentAmount;

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

        public QuerySettlementBillResponseDataItemsItem setRecordID(String recordID) {
            this.recordID = recordID;
            return this;
        }
        public String getRecordID() {
            return this.recordID;
        }

        public QuerySettlementBillResponseDataItemsItem setItem(String item) {
            this.item = item;
            return this;
        }
        public String getItem() {
            return this.item;
        }

        public QuerySettlementBillResponseDataItemsItem setPayerAccount(String payerAccount) {
            this.payerAccount = payerAccount;
            return this;
        }
        public String getPayerAccount() {
            return this.payerAccount;
        }

        public QuerySettlementBillResponseDataItemsItem setOwnerID(String ownerID) {
            this.ownerID = ownerID;
            return this;
        }
        public String getOwnerID() {
            return this.ownerID;
        }

        public QuerySettlementBillResponseDataItemsItem setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public QuerySettlementBillResponseDataItemsItem setUsageStartTime(String usageStartTime) {
            this.usageStartTime = usageStartTime;
            return this;
        }
        public String getUsageStartTime() {
            return this.usageStartTime;
        }

        public QuerySettlementBillResponseDataItemsItem setUsageEndTime(String usageEndTime) {
            this.usageEndTime = usageEndTime;
            return this;
        }
        public String getUsageEndTime() {
            return this.usageEndTime;
        }

        public QuerySettlementBillResponseDataItemsItem setSuborderID(String suborderID) {
            this.suborderID = suborderID;
            return this;
        }
        public String getSuborderID() {
            return this.suborderID;
        }

        public QuerySettlementBillResponseDataItemsItem setOrderID(String orderID) {
            this.orderID = orderID;
            return this;
        }
        public String getOrderID() {
            return this.orderID;
        }

        public QuerySettlementBillResponseDataItemsItem setOrderType(String orderType) {
            this.orderType = orderType;
            return this;
        }
        public String getOrderType() {
            return this.orderType;
        }

        public QuerySettlementBillResponseDataItemsItem setLinkedCustomerOrderID(String linkedCustomerOrderID) {
            this.linkedCustomerOrderID = linkedCustomerOrderID;
            return this;
        }
        public String getLinkedCustomerOrderID() {
            return this.linkedCustomerOrderID;
        }

        public QuerySettlementBillResponseDataItemsItem setOriginalOrderID(String originalOrderID) {
            this.originalOrderID = originalOrderID;
            return this;
        }
        public String getOriginalOrderID() {
            return this.originalOrderID;
        }

        public QuerySettlementBillResponseDataItemsItem setPaymentTime(String paymentTime) {
            this.paymentTime = paymentTime;
            return this;
        }
        public String getPaymentTime() {
            return this.paymentTime;
        }

        public QuerySettlementBillResponseDataItemsItem setSolutionID(String solutionID) {
            this.solutionID = solutionID;
            return this;
        }
        public String getSolutionID() {
            return this.solutionID;
        }

        public QuerySettlementBillResponseDataItemsItem setSolutionName(String solutionName) {
            this.solutionName = solutionName;
            return this;
        }
        public String getSolutionName() {
            return this.solutionName;
        }

        public QuerySettlementBillResponseDataItemsItem setBillID(String billID) {
            this.billID = billID;
            return this;
        }
        public String getBillID() {
            return this.billID;
        }

        public QuerySettlementBillResponseDataItemsItem setProductCode(String productCode) {
            this.productCode = productCode;
            return this;
        }
        public String getProductCode() {
            return this.productCode;
        }

        public QuerySettlementBillResponseDataItemsItem setProductType(String productType) {
            this.productType = productType;
            return this;
        }
        public String getProductType() {
            return this.productType;
        }

        public QuerySettlementBillResponseDataItemsItem setSubscriptionType(String subscriptionType) {
            this.subscriptionType = subscriptionType;
            return this;
        }
        public String getSubscriptionType() {
            return this.subscriptionType;
        }

        public QuerySettlementBillResponseDataItemsItem setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public QuerySettlementBillResponseDataItemsItem setConfig(String config) {
            this.config = config;
            return this;
        }
        public String getConfig() {
            return this.config;
        }

        public QuerySettlementBillResponseDataItemsItem setQuantity(String quantity) {
            this.quantity = quantity;
            return this;
        }
        public String getQuantity() {
            return this.quantity;
        }

        public QuerySettlementBillResponseDataItemsItem setPretaxGrossAmount(Float pretaxGrossAmount) {
            this.pretaxGrossAmount = pretaxGrossAmount;
            return this;
        }
        public Float getPretaxGrossAmount() {
            return this.pretaxGrossAmount;
        }

        public QuerySettlementBillResponseDataItemsItem setChargeDiscount(Float chargeDiscount) {
            this.chargeDiscount = chargeDiscount;
            return this;
        }
        public Float getChargeDiscount() {
            return this.chargeDiscount;
        }

        public QuerySettlementBillResponseDataItemsItem setDeductedByCoupons(Float deductedByCoupons) {
            this.deductedByCoupons = deductedByCoupons;
            return this;
        }
        public Float getDeductedByCoupons() {
            return this.deductedByCoupons;
        }

        public QuerySettlementBillResponseDataItemsItem setAccountDiscount(Float accountDiscount) {
            this.accountDiscount = accountDiscount;
            return this;
        }
        public Float getAccountDiscount() {
            return this.accountDiscount;
        }

        public QuerySettlementBillResponseDataItemsItem setPromotion(String promotion) {
            this.promotion = promotion;
            return this;
        }
        public String getPromotion() {
            return this.promotion;
        }

        public QuerySettlementBillResponseDataItemsItem setPretaxAmount(Float pretaxAmount) {
            this.pretaxAmount = pretaxAmount;
            return this;
        }
        public Float getPretaxAmount() {
            return this.pretaxAmount;
        }

        public QuerySettlementBillResponseDataItemsItem setCurrency(String currency) {
            this.currency = currency;
            return this;
        }
        public String getCurrency() {
            return this.currency;
        }

        public QuerySettlementBillResponseDataItemsItem setPretaxAmountLocal(Float pretaxAmountLocal) {
            this.pretaxAmountLocal = pretaxAmountLocal;
            return this;
        }
        public Float getPretaxAmountLocal() {
            return this.pretaxAmountLocal;
        }

        public QuerySettlementBillResponseDataItemsItem setPreviousBillingCycleBalance(Float previousBillingCycleBalance) {
            this.previousBillingCycleBalance = previousBillingCycleBalance;
            return this;
        }
        public Float getPreviousBillingCycleBalance() {
            return this.previousBillingCycleBalance;
        }

        public QuerySettlementBillResponseDataItemsItem setTax(Float tax) {
            this.tax = tax;
            return this;
        }
        public Float getTax() {
            return this.tax;
        }

        public QuerySettlementBillResponseDataItemsItem setAfterTaxAmount(Float afterTaxAmount) {
            this.afterTaxAmount = afterTaxAmount;
            return this;
        }
        public Float getAfterTaxAmount() {
            return this.afterTaxAmount;
        }

        public QuerySettlementBillResponseDataItemsItem setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public QuerySettlementBillResponseDataItemsItem setClearedTime(String clearedTime) {
            this.clearedTime = clearedTime;
            return this;
        }
        public String getClearedTime() {
            return this.clearedTime;
        }

        public QuerySettlementBillResponseDataItemsItem setOutstandingAmount(Float outstandingAmount) {
            this.outstandingAmount = outstandingAmount;
            return this;
        }
        public Float getOutstandingAmount() {
            return this.outstandingAmount;
        }

        public QuerySettlementBillResponseDataItemsItem setDeductedByCashCoupons(Float deductedByCashCoupons) {
            this.deductedByCashCoupons = deductedByCashCoupons;
            return this;
        }
        public Float getDeductedByCashCoupons() {
            return this.deductedByCashCoupons;
        }

        public QuerySettlementBillResponseDataItemsItem setDeductedByPrepaidCard(Float deductedByPrepaidCard) {
            this.deductedByPrepaidCard = deductedByPrepaidCard;
            return this;
        }
        public Float getDeductedByPrepaidCard() {
            return this.deductedByPrepaidCard;
        }

        public QuerySettlementBillResponseDataItemsItem setMybankPaymentAmount(Float mybankPaymentAmount) {
            this.mybankPaymentAmount = mybankPaymentAmount;
            return this;
        }
        public Float getMybankPaymentAmount() {
            return this.mybankPaymentAmount;
        }

        public QuerySettlementBillResponseDataItemsItem setPaymentAmount(Float paymentAmount) {
            this.paymentAmount = paymentAmount;
            return this;
        }
        public Float getPaymentAmount() {
            return this.paymentAmount;
        }

        public QuerySettlementBillResponseDataItemsItem setPaymentCurrency(String paymentCurrency) {
            this.paymentCurrency = paymentCurrency;
            return this;
        }
        public String getPaymentCurrency() {
            return this.paymentCurrency;
        }

        public QuerySettlementBillResponseDataItemsItem setSeller(String seller) {
            this.seller = seller;
            return this;
        }
        public String getSeller() {
            return this.seller;
        }

        public QuerySettlementBillResponseDataItemsItem setInvoiceNo(String invoiceNo) {
            this.invoiceNo = invoiceNo;
            return this;
        }
        public String getInvoiceNo() {
            return this.invoiceNo;
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

        public QuerySettlementBillResponseDataItems setItem(java.util.List<QuerySettlementBillResponseDataItemsItem> item) {
            this.item = item;
            return this;
        }
        public java.util.List<QuerySettlementBillResponseDataItemsItem> getItem() {
            return this.item;
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

        public QuerySettlementBillResponseData setPageNum(Integer pageNum) {
            this.pageNum = pageNum;
            return this;
        }
        public Integer getPageNum() {
            return this.pageNum;
        }

        public QuerySettlementBillResponseData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public QuerySettlementBillResponseData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public QuerySettlementBillResponseData setBillingCycle(String billingCycle) {
            this.billingCycle = billingCycle;
            return this;
        }
        public String getBillingCycle() {
            return this.billingCycle;
        }

        public QuerySettlementBillResponseData setItems(QuerySettlementBillResponseDataItems items) {
            this.items = items;
            return this;
        }
        public QuerySettlementBillResponseDataItems getItems() {
            return this.items;
        }

    }

}
