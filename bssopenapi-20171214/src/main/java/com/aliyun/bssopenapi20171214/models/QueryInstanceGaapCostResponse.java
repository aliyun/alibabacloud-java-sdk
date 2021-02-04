// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class QueryInstanceGaapCostResponse extends TeaModel {
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
    public QueryInstanceGaapCostResponseData data;

    public static QueryInstanceGaapCostResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryInstanceGaapCostResponse self = new QueryInstanceGaapCostResponse();
        return TeaModel.build(map, self);
    }

    public QueryInstanceGaapCostResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryInstanceGaapCostResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryInstanceGaapCostResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryInstanceGaapCostResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryInstanceGaapCostResponse setData(QueryInstanceGaapCostResponseData data) {
        this.data = data;
        return this;
    }
    public QueryInstanceGaapCostResponseData getData() {
        return this.data;
    }

    public static class QueryInstanceGaapCostResponseDataModulesModule extends TeaModel {
        @NameInMap("BillingCycle")
        @Validation(required = true)
        public String billingCycle;

        @NameInMap("InstanceID")
        @Validation(required = true)
        public String instanceID;

        @NameInMap("ProductCode")
        @Validation(required = true)
        public String productCode;

        @NameInMap("ProductType")
        @Validation(required = true)
        public String productType;

        @NameInMap("SubscriptionType")
        @Validation(required = true)
        public String subscriptionType;

        @NameInMap("Tag")
        @Validation(required = true)
        public String tag;

        @NameInMap("ResourceGroup")
        @Validation(required = true)
        public String resourceGroup;

        @NameInMap("AccountingUnit")
        @Validation(required = true)
        public String accountingUnit;

        @NameInMap("PayerAccount")
        @Validation(required = true)
        public String payerAccount;

        @NameInMap("OwnerID")
        @Validation(required = true)
        public String ownerID;

        @NameInMap("Region")
        @Validation(required = true)
        public String region;

        @NameInMap("Currency")
        @Validation(required = true)
        public String currency;

        @NameInMap("PaymentCurrency")
        @Validation(required = true)
        public String paymentCurrency;

        @NameInMap("OrderType")
        @Validation(required = true)
        public String orderType;

        @NameInMap("PayTime")
        @Validation(required = true)
        public String payTime;

        @NameInMap("PretaxGrossAmount")
        @Validation(required = true)
        public String pretaxGrossAmount;

        @NameInMap("PricingDiscount")
        @Validation(required = true)
        public String pricingDiscount;

        @NameInMap("DeductedByCoupons")
        @Validation(required = true)
        public String deductedByCoupons;

        @NameInMap("PretaxAmount")
        @Validation(required = true)
        public String pretaxAmount;

        @NameInMap("PretaxAmountLocal")
        @Validation(required = true)
        public String pretaxAmountLocal;

        @NameInMap("DeductedByCashCoupons")
        @Validation(required = true)
        public String deductedByCashCoupons;

        @NameInMap("DeductedByPrepaidCard")
        @Validation(required = true)
        public String deductedByPrepaidCard;

        @NameInMap("PaymentAmount")
        @Validation(required = true)
        public String paymentAmount;

        @NameInMap("GaapPretaxGrossAmount")
        @Validation(required = true)
        public String gaapPretaxGrossAmount;

        @NameInMap("GaapPricingDiscount")
        @Validation(required = true)
        public String gaapPricingDiscount;

        @NameInMap("GaapDeductedByCoupons")
        @Validation(required = true)
        public String gaapDeductedByCoupons;

        @NameInMap("GaapPretaxAmount")
        @Validation(required = true)
        public String gaapPretaxAmount;

        @NameInMap("GaapPretaxAmountLocal")
        @Validation(required = true)
        public String gaapPretaxAmountLocal;

        @NameInMap("GaapDeductedByCashCoupons")
        @Validation(required = true)
        public String gaapDeductedByCashCoupons;

        @NameInMap("GaapDeductedByPrepaidCard")
        @Validation(required = true)
        public String gaapDeductedByPrepaidCard;

        @NameInMap("GaapPaymentAmount")
        @Validation(required = true)
        public String gaapPaymentAmount;

        @NameInMap("MonthGaapPretaxGrossAmount")
        @Validation(required = true)
        public String monthGaapPretaxGrossAmount;

        @NameInMap("MonthGaapPricingDiscount")
        @Validation(required = true)
        public String monthGaapPricingDiscount;

        @NameInMap("MonthGaapDeductedByCoupons")
        @Validation(required = true)
        public String monthGaapDeductedByCoupons;

        @NameInMap("MonthGaapPretaxAmount")
        @Validation(required = true)
        public String monthGaapPretaxAmount;

        @NameInMap("MonthGaapPretaxAmountLocal")
        @Validation(required = true)
        public String monthGaapPretaxAmountLocal;

        @NameInMap("MonthGaapDeductedByCashCoupons")
        @Validation(required = true)
        public String monthGaapDeductedByCashCoupons;

        @NameInMap("MonthGaapDeductedByPrepaidCard")
        @Validation(required = true)
        public String monthGaapDeductedByPrepaidCard;

        @NameInMap("MonthGaapPaymentAmount")
        @Validation(required = true)
        public String monthGaapPaymentAmount;

        @NameInMap("UnallocatedPaymentAmount")
        @Validation(required = true)
        public String unallocatedPaymentAmount;

        @NameInMap("UsageStartDate")
        @Validation(required = true)
        public String usageStartDate;

        @NameInMap("UsageEndDate")
        @Validation(required = true)
        public String usageEndDate;

        @NameInMap("BillType")
        @Validation(required = true)
        public String billType;

        @NameInMap("OrderId")
        @Validation(required = true)
        public String orderId;

        @NameInMap("SubOrderId")
        @Validation(required = true)
        public String subOrderId;

        @NameInMap("UnallocatedPretaxGrossAmount")
        @Validation(required = true)
        public String unallocatedPretaxGrossAmount;

        @NameInMap("UnallocatedPricingDiscount")
        @Validation(required = true)
        public String unallocatedPricingDiscount;

        @NameInMap("UnallocatedDeductedByCoupons")
        @Validation(required = true)
        public String unallocatedDeductedByCoupons;

        @NameInMap("UnallocatedPretaxAmount")
        @Validation(required = true)
        public String unallocatedPretaxAmount;

        @NameInMap("UnallocatedPretaxAmountLocal")
        @Validation(required = true)
        public String unallocatedPretaxAmountLocal;

        @NameInMap("UnallocatedDeductedByCashCoupons")
        @Validation(required = true)
        public String unallocatedDeductedByCashCoupons;

        @NameInMap("UnallocatedDeductedByPrepaidCard")
        @Validation(required = true)
        public String unallocatedDeductedByPrepaidCard;

        public static QueryInstanceGaapCostResponseDataModulesModule build(java.util.Map<String, ?> map) throws Exception {
            QueryInstanceGaapCostResponseDataModulesModule self = new QueryInstanceGaapCostResponseDataModulesModule();
            return TeaModel.build(map, self);
        }

        public QueryInstanceGaapCostResponseDataModulesModule setBillingCycle(String billingCycle) {
            this.billingCycle = billingCycle;
            return this;
        }
        public String getBillingCycle() {
            return this.billingCycle;
        }

        public QueryInstanceGaapCostResponseDataModulesModule setInstanceID(String instanceID) {
            this.instanceID = instanceID;
            return this;
        }
        public String getInstanceID() {
            return this.instanceID;
        }

        public QueryInstanceGaapCostResponseDataModulesModule setProductCode(String productCode) {
            this.productCode = productCode;
            return this;
        }
        public String getProductCode() {
            return this.productCode;
        }

        public QueryInstanceGaapCostResponseDataModulesModule setProductType(String productType) {
            this.productType = productType;
            return this;
        }
        public String getProductType() {
            return this.productType;
        }

        public QueryInstanceGaapCostResponseDataModulesModule setSubscriptionType(String subscriptionType) {
            this.subscriptionType = subscriptionType;
            return this;
        }
        public String getSubscriptionType() {
            return this.subscriptionType;
        }

        public QueryInstanceGaapCostResponseDataModulesModule setTag(String tag) {
            this.tag = tag;
            return this;
        }
        public String getTag() {
            return this.tag;
        }

        public QueryInstanceGaapCostResponseDataModulesModule setResourceGroup(String resourceGroup) {
            this.resourceGroup = resourceGroup;
            return this;
        }
        public String getResourceGroup() {
            return this.resourceGroup;
        }

        public QueryInstanceGaapCostResponseDataModulesModule setAccountingUnit(String accountingUnit) {
            this.accountingUnit = accountingUnit;
            return this;
        }
        public String getAccountingUnit() {
            return this.accountingUnit;
        }

        public QueryInstanceGaapCostResponseDataModulesModule setPayerAccount(String payerAccount) {
            this.payerAccount = payerAccount;
            return this;
        }
        public String getPayerAccount() {
            return this.payerAccount;
        }

        public QueryInstanceGaapCostResponseDataModulesModule setOwnerID(String ownerID) {
            this.ownerID = ownerID;
            return this;
        }
        public String getOwnerID() {
            return this.ownerID;
        }

        public QueryInstanceGaapCostResponseDataModulesModule setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public QueryInstanceGaapCostResponseDataModulesModule setCurrency(String currency) {
            this.currency = currency;
            return this;
        }
        public String getCurrency() {
            return this.currency;
        }

        public QueryInstanceGaapCostResponseDataModulesModule setPaymentCurrency(String paymentCurrency) {
            this.paymentCurrency = paymentCurrency;
            return this;
        }
        public String getPaymentCurrency() {
            return this.paymentCurrency;
        }

        public QueryInstanceGaapCostResponseDataModulesModule setOrderType(String orderType) {
            this.orderType = orderType;
            return this;
        }
        public String getOrderType() {
            return this.orderType;
        }

        public QueryInstanceGaapCostResponseDataModulesModule setPayTime(String payTime) {
            this.payTime = payTime;
            return this;
        }
        public String getPayTime() {
            return this.payTime;
        }

        public QueryInstanceGaapCostResponseDataModulesModule setPretaxGrossAmount(String pretaxGrossAmount) {
            this.pretaxGrossAmount = pretaxGrossAmount;
            return this;
        }
        public String getPretaxGrossAmount() {
            return this.pretaxGrossAmount;
        }

        public QueryInstanceGaapCostResponseDataModulesModule setPricingDiscount(String pricingDiscount) {
            this.pricingDiscount = pricingDiscount;
            return this;
        }
        public String getPricingDiscount() {
            return this.pricingDiscount;
        }

        public QueryInstanceGaapCostResponseDataModulesModule setDeductedByCoupons(String deductedByCoupons) {
            this.deductedByCoupons = deductedByCoupons;
            return this;
        }
        public String getDeductedByCoupons() {
            return this.deductedByCoupons;
        }

        public QueryInstanceGaapCostResponseDataModulesModule setPretaxAmount(String pretaxAmount) {
            this.pretaxAmount = pretaxAmount;
            return this;
        }
        public String getPretaxAmount() {
            return this.pretaxAmount;
        }

        public QueryInstanceGaapCostResponseDataModulesModule setPretaxAmountLocal(String pretaxAmountLocal) {
            this.pretaxAmountLocal = pretaxAmountLocal;
            return this;
        }
        public String getPretaxAmountLocal() {
            return this.pretaxAmountLocal;
        }

        public QueryInstanceGaapCostResponseDataModulesModule setDeductedByCashCoupons(String deductedByCashCoupons) {
            this.deductedByCashCoupons = deductedByCashCoupons;
            return this;
        }
        public String getDeductedByCashCoupons() {
            return this.deductedByCashCoupons;
        }

        public QueryInstanceGaapCostResponseDataModulesModule setDeductedByPrepaidCard(String deductedByPrepaidCard) {
            this.deductedByPrepaidCard = deductedByPrepaidCard;
            return this;
        }
        public String getDeductedByPrepaidCard() {
            return this.deductedByPrepaidCard;
        }

        public QueryInstanceGaapCostResponseDataModulesModule setPaymentAmount(String paymentAmount) {
            this.paymentAmount = paymentAmount;
            return this;
        }
        public String getPaymentAmount() {
            return this.paymentAmount;
        }

        public QueryInstanceGaapCostResponseDataModulesModule setGaapPretaxGrossAmount(String gaapPretaxGrossAmount) {
            this.gaapPretaxGrossAmount = gaapPretaxGrossAmount;
            return this;
        }
        public String getGaapPretaxGrossAmount() {
            return this.gaapPretaxGrossAmount;
        }

        public QueryInstanceGaapCostResponseDataModulesModule setGaapPricingDiscount(String gaapPricingDiscount) {
            this.gaapPricingDiscount = gaapPricingDiscount;
            return this;
        }
        public String getGaapPricingDiscount() {
            return this.gaapPricingDiscount;
        }

        public QueryInstanceGaapCostResponseDataModulesModule setGaapDeductedByCoupons(String gaapDeductedByCoupons) {
            this.gaapDeductedByCoupons = gaapDeductedByCoupons;
            return this;
        }
        public String getGaapDeductedByCoupons() {
            return this.gaapDeductedByCoupons;
        }

        public QueryInstanceGaapCostResponseDataModulesModule setGaapPretaxAmount(String gaapPretaxAmount) {
            this.gaapPretaxAmount = gaapPretaxAmount;
            return this;
        }
        public String getGaapPretaxAmount() {
            return this.gaapPretaxAmount;
        }

        public QueryInstanceGaapCostResponseDataModulesModule setGaapPretaxAmountLocal(String gaapPretaxAmountLocal) {
            this.gaapPretaxAmountLocal = gaapPretaxAmountLocal;
            return this;
        }
        public String getGaapPretaxAmountLocal() {
            return this.gaapPretaxAmountLocal;
        }

        public QueryInstanceGaapCostResponseDataModulesModule setGaapDeductedByCashCoupons(String gaapDeductedByCashCoupons) {
            this.gaapDeductedByCashCoupons = gaapDeductedByCashCoupons;
            return this;
        }
        public String getGaapDeductedByCashCoupons() {
            return this.gaapDeductedByCashCoupons;
        }

        public QueryInstanceGaapCostResponseDataModulesModule setGaapDeductedByPrepaidCard(String gaapDeductedByPrepaidCard) {
            this.gaapDeductedByPrepaidCard = gaapDeductedByPrepaidCard;
            return this;
        }
        public String getGaapDeductedByPrepaidCard() {
            return this.gaapDeductedByPrepaidCard;
        }

        public QueryInstanceGaapCostResponseDataModulesModule setGaapPaymentAmount(String gaapPaymentAmount) {
            this.gaapPaymentAmount = gaapPaymentAmount;
            return this;
        }
        public String getGaapPaymentAmount() {
            return this.gaapPaymentAmount;
        }

        public QueryInstanceGaapCostResponseDataModulesModule setMonthGaapPretaxGrossAmount(String monthGaapPretaxGrossAmount) {
            this.monthGaapPretaxGrossAmount = monthGaapPretaxGrossAmount;
            return this;
        }
        public String getMonthGaapPretaxGrossAmount() {
            return this.monthGaapPretaxGrossAmount;
        }

        public QueryInstanceGaapCostResponseDataModulesModule setMonthGaapPricingDiscount(String monthGaapPricingDiscount) {
            this.monthGaapPricingDiscount = monthGaapPricingDiscount;
            return this;
        }
        public String getMonthGaapPricingDiscount() {
            return this.monthGaapPricingDiscount;
        }

        public QueryInstanceGaapCostResponseDataModulesModule setMonthGaapDeductedByCoupons(String monthGaapDeductedByCoupons) {
            this.monthGaapDeductedByCoupons = monthGaapDeductedByCoupons;
            return this;
        }
        public String getMonthGaapDeductedByCoupons() {
            return this.monthGaapDeductedByCoupons;
        }

        public QueryInstanceGaapCostResponseDataModulesModule setMonthGaapPretaxAmount(String monthGaapPretaxAmount) {
            this.monthGaapPretaxAmount = monthGaapPretaxAmount;
            return this;
        }
        public String getMonthGaapPretaxAmount() {
            return this.monthGaapPretaxAmount;
        }

        public QueryInstanceGaapCostResponseDataModulesModule setMonthGaapPretaxAmountLocal(String monthGaapPretaxAmountLocal) {
            this.monthGaapPretaxAmountLocal = monthGaapPretaxAmountLocal;
            return this;
        }
        public String getMonthGaapPretaxAmountLocal() {
            return this.monthGaapPretaxAmountLocal;
        }

        public QueryInstanceGaapCostResponseDataModulesModule setMonthGaapDeductedByCashCoupons(String monthGaapDeductedByCashCoupons) {
            this.monthGaapDeductedByCashCoupons = monthGaapDeductedByCashCoupons;
            return this;
        }
        public String getMonthGaapDeductedByCashCoupons() {
            return this.monthGaapDeductedByCashCoupons;
        }

        public QueryInstanceGaapCostResponseDataModulesModule setMonthGaapDeductedByPrepaidCard(String monthGaapDeductedByPrepaidCard) {
            this.monthGaapDeductedByPrepaidCard = monthGaapDeductedByPrepaidCard;
            return this;
        }
        public String getMonthGaapDeductedByPrepaidCard() {
            return this.monthGaapDeductedByPrepaidCard;
        }

        public QueryInstanceGaapCostResponseDataModulesModule setMonthGaapPaymentAmount(String monthGaapPaymentAmount) {
            this.monthGaapPaymentAmount = monthGaapPaymentAmount;
            return this;
        }
        public String getMonthGaapPaymentAmount() {
            return this.monthGaapPaymentAmount;
        }

        public QueryInstanceGaapCostResponseDataModulesModule setUnallocatedPaymentAmount(String unallocatedPaymentAmount) {
            this.unallocatedPaymentAmount = unallocatedPaymentAmount;
            return this;
        }
        public String getUnallocatedPaymentAmount() {
            return this.unallocatedPaymentAmount;
        }

        public QueryInstanceGaapCostResponseDataModulesModule setUsageStartDate(String usageStartDate) {
            this.usageStartDate = usageStartDate;
            return this;
        }
        public String getUsageStartDate() {
            return this.usageStartDate;
        }

        public QueryInstanceGaapCostResponseDataModulesModule setUsageEndDate(String usageEndDate) {
            this.usageEndDate = usageEndDate;
            return this;
        }
        public String getUsageEndDate() {
            return this.usageEndDate;
        }

        public QueryInstanceGaapCostResponseDataModulesModule setBillType(String billType) {
            this.billType = billType;
            return this;
        }
        public String getBillType() {
            return this.billType;
        }

        public QueryInstanceGaapCostResponseDataModulesModule setOrderId(String orderId) {
            this.orderId = orderId;
            return this;
        }
        public String getOrderId() {
            return this.orderId;
        }

        public QueryInstanceGaapCostResponseDataModulesModule setSubOrderId(String subOrderId) {
            this.subOrderId = subOrderId;
            return this;
        }
        public String getSubOrderId() {
            return this.subOrderId;
        }

        public QueryInstanceGaapCostResponseDataModulesModule setUnallocatedPretaxGrossAmount(String unallocatedPretaxGrossAmount) {
            this.unallocatedPretaxGrossAmount = unallocatedPretaxGrossAmount;
            return this;
        }
        public String getUnallocatedPretaxGrossAmount() {
            return this.unallocatedPretaxGrossAmount;
        }

        public QueryInstanceGaapCostResponseDataModulesModule setUnallocatedPricingDiscount(String unallocatedPricingDiscount) {
            this.unallocatedPricingDiscount = unallocatedPricingDiscount;
            return this;
        }
        public String getUnallocatedPricingDiscount() {
            return this.unallocatedPricingDiscount;
        }

        public QueryInstanceGaapCostResponseDataModulesModule setUnallocatedDeductedByCoupons(String unallocatedDeductedByCoupons) {
            this.unallocatedDeductedByCoupons = unallocatedDeductedByCoupons;
            return this;
        }
        public String getUnallocatedDeductedByCoupons() {
            return this.unallocatedDeductedByCoupons;
        }

        public QueryInstanceGaapCostResponseDataModulesModule setUnallocatedPretaxAmount(String unallocatedPretaxAmount) {
            this.unallocatedPretaxAmount = unallocatedPretaxAmount;
            return this;
        }
        public String getUnallocatedPretaxAmount() {
            return this.unallocatedPretaxAmount;
        }

        public QueryInstanceGaapCostResponseDataModulesModule setUnallocatedPretaxAmountLocal(String unallocatedPretaxAmountLocal) {
            this.unallocatedPretaxAmountLocal = unallocatedPretaxAmountLocal;
            return this;
        }
        public String getUnallocatedPretaxAmountLocal() {
            return this.unallocatedPretaxAmountLocal;
        }

        public QueryInstanceGaapCostResponseDataModulesModule setUnallocatedDeductedByCashCoupons(String unallocatedDeductedByCashCoupons) {
            this.unallocatedDeductedByCashCoupons = unallocatedDeductedByCashCoupons;
            return this;
        }
        public String getUnallocatedDeductedByCashCoupons() {
            return this.unallocatedDeductedByCashCoupons;
        }

        public QueryInstanceGaapCostResponseDataModulesModule setUnallocatedDeductedByPrepaidCard(String unallocatedDeductedByPrepaidCard) {
            this.unallocatedDeductedByPrepaidCard = unallocatedDeductedByPrepaidCard;
            return this;
        }
        public String getUnallocatedDeductedByPrepaidCard() {
            return this.unallocatedDeductedByPrepaidCard;
        }

    }

    public static class QueryInstanceGaapCostResponseDataModules extends TeaModel {
        @NameInMap("Module")
        @Validation(required = true)
        public java.util.List<QueryInstanceGaapCostResponseDataModulesModule> module;

        public static QueryInstanceGaapCostResponseDataModules build(java.util.Map<String, ?> map) throws Exception {
            QueryInstanceGaapCostResponseDataModules self = new QueryInstanceGaapCostResponseDataModules();
            return TeaModel.build(map, self);
        }

        public QueryInstanceGaapCostResponseDataModules setModule(java.util.List<QueryInstanceGaapCostResponseDataModulesModule> module) {
            this.module = module;
            return this;
        }
        public java.util.List<QueryInstanceGaapCostResponseDataModulesModule> getModule() {
            return this.module;
        }

    }

    public static class QueryInstanceGaapCostResponseData extends TeaModel {
        @NameInMap("HostId")
        @Validation(required = true)
        public String hostId;

        @NameInMap("PageNum")
        @Validation(required = true)
        public Integer pageNum;

        @NameInMap("PageSize")
        @Validation(required = true)
        public Integer pageSize;

        @NameInMap("TotalCount")
        @Validation(required = true)
        public Integer totalCount;

        @NameInMap("Modules")
        @Validation(required = true)
        public QueryInstanceGaapCostResponseDataModules modules;

        public static QueryInstanceGaapCostResponseData build(java.util.Map<String, ?> map) throws Exception {
            QueryInstanceGaapCostResponseData self = new QueryInstanceGaapCostResponseData();
            return TeaModel.build(map, self);
        }

        public QueryInstanceGaapCostResponseData setHostId(String hostId) {
            this.hostId = hostId;
            return this;
        }
        public String getHostId() {
            return this.hostId;
        }

        public QueryInstanceGaapCostResponseData setPageNum(Integer pageNum) {
            this.pageNum = pageNum;
            return this;
        }
        public Integer getPageNum() {
            return this.pageNum;
        }

        public QueryInstanceGaapCostResponseData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public QueryInstanceGaapCostResponseData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public QueryInstanceGaapCostResponseData setModules(QueryInstanceGaapCostResponseDataModules modules) {
            this.modules = modules;
            return this;
        }
        public QueryInstanceGaapCostResponseDataModules getModules() {
            return this.modules;
        }

    }

}
