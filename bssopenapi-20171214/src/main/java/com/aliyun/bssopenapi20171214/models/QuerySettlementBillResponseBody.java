// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class QuerySettlementBillResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public QuerySettlementBillResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QuerySettlementBillResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QuerySettlementBillResponseBody self = new QuerySettlementBillResponseBody();
        return TeaModel.build(map, self);
    }

    public QuerySettlementBillResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QuerySettlementBillResponseBody setData(QuerySettlementBillResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QuerySettlementBillResponseBodyData getData() {
        return this.data;
    }

    public QuerySettlementBillResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QuerySettlementBillResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QuerySettlementBillResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QuerySettlementBillResponseBodyDataItemsItem extends TeaModel {
        @NameInMap("AccountDiscount")
        public Float accountDiscount;

        @NameInMap("AfterTaxAmount")
        public Float afterTaxAmount;

        @NameInMap("BillID")
        public String billID;

        @NameInMap("ChargeDiscount")
        public Float chargeDiscount;

        @NameInMap("ClearedTime")
        public String clearedTime;

        @NameInMap("Config")
        public String config;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("Currency")
        public String currency;

        @NameInMap("DeductedByCashCoupons")
        public Float deductedByCashCoupons;

        @NameInMap("DeductedByCoupons")
        public Float deductedByCoupons;

        @NameInMap("DeductedByPrepaidCard")
        public Float deductedByPrepaidCard;

        @NameInMap("InvoiceNo")
        public String invoiceNo;

        @NameInMap("Item")
        public String item;

        @NameInMap("LinkedCustomerOrderID")
        public String linkedCustomerOrderID;

        @NameInMap("MybankPaymentAmount")
        public Float mybankPaymentAmount;

        @NameInMap("OrderID")
        public String orderID;

        @NameInMap("OrderType")
        public String orderType;

        @NameInMap("OriginalOrderID")
        public String originalOrderID;

        @NameInMap("OutstandingAmount")
        public Float outstandingAmount;

        @NameInMap("OwnerID")
        public String ownerID;

        @NameInMap("PayerAccount")
        public String payerAccount;

        @NameInMap("PaymentAmount")
        public Float paymentAmount;

        @NameInMap("PaymentCurrency")
        public String paymentCurrency;

        @NameInMap("PaymentTime")
        public String paymentTime;

        @NameInMap("PretaxAmount")
        public Float pretaxAmount;

        @NameInMap("PretaxAmountLocal")
        public Float pretaxAmountLocal;

        @NameInMap("PretaxGrossAmount")
        public Float pretaxGrossAmount;

        @NameInMap("PreviousBillingCycleBalance")
        public Float previousBillingCycleBalance;

        @NameInMap("ProductCode")
        public String productCode;

        @NameInMap("ProductType")
        public String productType;

        @NameInMap("Promotion")
        public String promotion;

        @NameInMap("Quantity")
        public String quantity;

        @NameInMap("RecordID")
        public String recordID;

        @NameInMap("Region")
        public String region;

        @NameInMap("Seller")
        public String seller;

        @NameInMap("SolutionID")
        public String solutionID;

        @NameInMap("SolutionName")
        public String solutionName;

        @NameInMap("Status")
        public String status;

        @NameInMap("SuborderID")
        public String suborderID;

        @NameInMap("SubscriptionType")
        public String subscriptionType;

        @NameInMap("Tax")
        public Float tax;

        @NameInMap("UsageEndTime")
        public String usageEndTime;

        @NameInMap("UsageStartTime")
        public String usageStartTime;

        public static QuerySettlementBillResponseBodyDataItemsItem build(java.util.Map<String, ?> map) throws Exception {
            QuerySettlementBillResponseBodyDataItemsItem self = new QuerySettlementBillResponseBodyDataItemsItem();
            return TeaModel.build(map, self);
        }

        public QuerySettlementBillResponseBodyDataItemsItem setAccountDiscount(Float accountDiscount) {
            this.accountDiscount = accountDiscount;
            return this;
        }
        public Float getAccountDiscount() {
            return this.accountDiscount;
        }

        public QuerySettlementBillResponseBodyDataItemsItem setAfterTaxAmount(Float afterTaxAmount) {
            this.afterTaxAmount = afterTaxAmount;
            return this;
        }
        public Float getAfterTaxAmount() {
            return this.afterTaxAmount;
        }

        public QuerySettlementBillResponseBodyDataItemsItem setBillID(String billID) {
            this.billID = billID;
            return this;
        }
        public String getBillID() {
            return this.billID;
        }

        public QuerySettlementBillResponseBodyDataItemsItem setChargeDiscount(Float chargeDiscount) {
            this.chargeDiscount = chargeDiscount;
            return this;
        }
        public Float getChargeDiscount() {
            return this.chargeDiscount;
        }

        public QuerySettlementBillResponseBodyDataItemsItem setClearedTime(String clearedTime) {
            this.clearedTime = clearedTime;
            return this;
        }
        public String getClearedTime() {
            return this.clearedTime;
        }

        public QuerySettlementBillResponseBodyDataItemsItem setConfig(String config) {
            this.config = config;
            return this;
        }
        public String getConfig() {
            return this.config;
        }

        public QuerySettlementBillResponseBodyDataItemsItem setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public QuerySettlementBillResponseBodyDataItemsItem setCurrency(String currency) {
            this.currency = currency;
            return this;
        }
        public String getCurrency() {
            return this.currency;
        }

        public QuerySettlementBillResponseBodyDataItemsItem setDeductedByCashCoupons(Float deductedByCashCoupons) {
            this.deductedByCashCoupons = deductedByCashCoupons;
            return this;
        }
        public Float getDeductedByCashCoupons() {
            return this.deductedByCashCoupons;
        }

        public QuerySettlementBillResponseBodyDataItemsItem setDeductedByCoupons(Float deductedByCoupons) {
            this.deductedByCoupons = deductedByCoupons;
            return this;
        }
        public Float getDeductedByCoupons() {
            return this.deductedByCoupons;
        }

        public QuerySettlementBillResponseBodyDataItemsItem setDeductedByPrepaidCard(Float deductedByPrepaidCard) {
            this.deductedByPrepaidCard = deductedByPrepaidCard;
            return this;
        }
        public Float getDeductedByPrepaidCard() {
            return this.deductedByPrepaidCard;
        }

        public QuerySettlementBillResponseBodyDataItemsItem setInvoiceNo(String invoiceNo) {
            this.invoiceNo = invoiceNo;
            return this;
        }
        public String getInvoiceNo() {
            return this.invoiceNo;
        }

        public QuerySettlementBillResponseBodyDataItemsItem setItem(String item) {
            this.item = item;
            return this;
        }
        public String getItem() {
            return this.item;
        }

        public QuerySettlementBillResponseBodyDataItemsItem setLinkedCustomerOrderID(String linkedCustomerOrderID) {
            this.linkedCustomerOrderID = linkedCustomerOrderID;
            return this;
        }
        public String getLinkedCustomerOrderID() {
            return this.linkedCustomerOrderID;
        }

        public QuerySettlementBillResponseBodyDataItemsItem setMybankPaymentAmount(Float mybankPaymentAmount) {
            this.mybankPaymentAmount = mybankPaymentAmount;
            return this;
        }
        public Float getMybankPaymentAmount() {
            return this.mybankPaymentAmount;
        }

        public QuerySettlementBillResponseBodyDataItemsItem setOrderID(String orderID) {
            this.orderID = orderID;
            return this;
        }
        public String getOrderID() {
            return this.orderID;
        }

        public QuerySettlementBillResponseBodyDataItemsItem setOrderType(String orderType) {
            this.orderType = orderType;
            return this;
        }
        public String getOrderType() {
            return this.orderType;
        }

        public QuerySettlementBillResponseBodyDataItemsItem setOriginalOrderID(String originalOrderID) {
            this.originalOrderID = originalOrderID;
            return this;
        }
        public String getOriginalOrderID() {
            return this.originalOrderID;
        }

        public QuerySettlementBillResponseBodyDataItemsItem setOutstandingAmount(Float outstandingAmount) {
            this.outstandingAmount = outstandingAmount;
            return this;
        }
        public Float getOutstandingAmount() {
            return this.outstandingAmount;
        }

        public QuerySettlementBillResponseBodyDataItemsItem setOwnerID(String ownerID) {
            this.ownerID = ownerID;
            return this;
        }
        public String getOwnerID() {
            return this.ownerID;
        }

        public QuerySettlementBillResponseBodyDataItemsItem setPayerAccount(String payerAccount) {
            this.payerAccount = payerAccount;
            return this;
        }
        public String getPayerAccount() {
            return this.payerAccount;
        }

        public QuerySettlementBillResponseBodyDataItemsItem setPaymentAmount(Float paymentAmount) {
            this.paymentAmount = paymentAmount;
            return this;
        }
        public Float getPaymentAmount() {
            return this.paymentAmount;
        }

        public QuerySettlementBillResponseBodyDataItemsItem setPaymentCurrency(String paymentCurrency) {
            this.paymentCurrency = paymentCurrency;
            return this;
        }
        public String getPaymentCurrency() {
            return this.paymentCurrency;
        }

        public QuerySettlementBillResponseBodyDataItemsItem setPaymentTime(String paymentTime) {
            this.paymentTime = paymentTime;
            return this;
        }
        public String getPaymentTime() {
            return this.paymentTime;
        }

        public QuerySettlementBillResponseBodyDataItemsItem setPretaxAmount(Float pretaxAmount) {
            this.pretaxAmount = pretaxAmount;
            return this;
        }
        public Float getPretaxAmount() {
            return this.pretaxAmount;
        }

        public QuerySettlementBillResponseBodyDataItemsItem setPretaxAmountLocal(Float pretaxAmountLocal) {
            this.pretaxAmountLocal = pretaxAmountLocal;
            return this;
        }
        public Float getPretaxAmountLocal() {
            return this.pretaxAmountLocal;
        }

        public QuerySettlementBillResponseBodyDataItemsItem setPretaxGrossAmount(Float pretaxGrossAmount) {
            this.pretaxGrossAmount = pretaxGrossAmount;
            return this;
        }
        public Float getPretaxGrossAmount() {
            return this.pretaxGrossAmount;
        }

        public QuerySettlementBillResponseBodyDataItemsItem setPreviousBillingCycleBalance(Float previousBillingCycleBalance) {
            this.previousBillingCycleBalance = previousBillingCycleBalance;
            return this;
        }
        public Float getPreviousBillingCycleBalance() {
            return this.previousBillingCycleBalance;
        }

        public QuerySettlementBillResponseBodyDataItemsItem setProductCode(String productCode) {
            this.productCode = productCode;
            return this;
        }
        public String getProductCode() {
            return this.productCode;
        }

        public QuerySettlementBillResponseBodyDataItemsItem setProductType(String productType) {
            this.productType = productType;
            return this;
        }
        public String getProductType() {
            return this.productType;
        }

        public QuerySettlementBillResponseBodyDataItemsItem setPromotion(String promotion) {
            this.promotion = promotion;
            return this;
        }
        public String getPromotion() {
            return this.promotion;
        }

        public QuerySettlementBillResponseBodyDataItemsItem setQuantity(String quantity) {
            this.quantity = quantity;
            return this;
        }
        public String getQuantity() {
            return this.quantity;
        }

        public QuerySettlementBillResponseBodyDataItemsItem setRecordID(String recordID) {
            this.recordID = recordID;
            return this;
        }
        public String getRecordID() {
            return this.recordID;
        }

        public QuerySettlementBillResponseBodyDataItemsItem setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public QuerySettlementBillResponseBodyDataItemsItem setSeller(String seller) {
            this.seller = seller;
            return this;
        }
        public String getSeller() {
            return this.seller;
        }

        public QuerySettlementBillResponseBodyDataItemsItem setSolutionID(String solutionID) {
            this.solutionID = solutionID;
            return this;
        }
        public String getSolutionID() {
            return this.solutionID;
        }

        public QuerySettlementBillResponseBodyDataItemsItem setSolutionName(String solutionName) {
            this.solutionName = solutionName;
            return this;
        }
        public String getSolutionName() {
            return this.solutionName;
        }

        public QuerySettlementBillResponseBodyDataItemsItem setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public QuerySettlementBillResponseBodyDataItemsItem setSuborderID(String suborderID) {
            this.suborderID = suborderID;
            return this;
        }
        public String getSuborderID() {
            return this.suborderID;
        }

        public QuerySettlementBillResponseBodyDataItemsItem setSubscriptionType(String subscriptionType) {
            this.subscriptionType = subscriptionType;
            return this;
        }
        public String getSubscriptionType() {
            return this.subscriptionType;
        }

        public QuerySettlementBillResponseBodyDataItemsItem setTax(Float tax) {
            this.tax = tax;
            return this;
        }
        public Float getTax() {
            return this.tax;
        }

        public QuerySettlementBillResponseBodyDataItemsItem setUsageEndTime(String usageEndTime) {
            this.usageEndTime = usageEndTime;
            return this;
        }
        public String getUsageEndTime() {
            return this.usageEndTime;
        }

        public QuerySettlementBillResponseBodyDataItemsItem setUsageStartTime(String usageStartTime) {
            this.usageStartTime = usageStartTime;
            return this;
        }
        public String getUsageStartTime() {
            return this.usageStartTime;
        }

    }

    public static class QuerySettlementBillResponseBodyDataItems extends TeaModel {
        @NameInMap("Item")
        public java.util.List<QuerySettlementBillResponseBodyDataItemsItem> item;

        public static QuerySettlementBillResponseBodyDataItems build(java.util.Map<String, ?> map) throws Exception {
            QuerySettlementBillResponseBodyDataItems self = new QuerySettlementBillResponseBodyDataItems();
            return TeaModel.build(map, self);
        }

        public QuerySettlementBillResponseBodyDataItems setItem(java.util.List<QuerySettlementBillResponseBodyDataItemsItem> item) {
            this.item = item;
            return this;
        }
        public java.util.List<QuerySettlementBillResponseBodyDataItemsItem> getItem() {
            return this.item;
        }

    }

    public static class QuerySettlementBillResponseBodyData extends TeaModel {
        @NameInMap("BillingCycle")
        public String billingCycle;

        @NameInMap("Items")
        public QuerySettlementBillResponseBodyDataItems items;

        @NameInMap("PageNum")
        public Integer pageNum;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        public static QuerySettlementBillResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QuerySettlementBillResponseBodyData self = new QuerySettlementBillResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QuerySettlementBillResponseBodyData setBillingCycle(String billingCycle) {
            this.billingCycle = billingCycle;
            return this;
        }
        public String getBillingCycle() {
            return this.billingCycle;
        }

        public QuerySettlementBillResponseBodyData setItems(QuerySettlementBillResponseBodyDataItems items) {
            this.items = items;
            return this;
        }
        public QuerySettlementBillResponseBodyDataItems getItems() {
            return this.items;
        }

        public QuerySettlementBillResponseBodyData setPageNum(Integer pageNum) {
            this.pageNum = pageNum;
            return this;
        }
        public Integer getPageNum() {
            return this.pageNum;
        }

        public QuerySettlementBillResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public QuerySettlementBillResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
