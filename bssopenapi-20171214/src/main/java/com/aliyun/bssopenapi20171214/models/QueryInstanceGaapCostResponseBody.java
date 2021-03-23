// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class QueryInstanceGaapCostResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("Data")
    public QueryInstanceGaapCostResponseBodyData data;

    public static QueryInstanceGaapCostResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryInstanceGaapCostResponseBody self = new QueryInstanceGaapCostResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryInstanceGaapCostResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryInstanceGaapCostResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryInstanceGaapCostResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryInstanceGaapCostResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryInstanceGaapCostResponseBody setData(QueryInstanceGaapCostResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryInstanceGaapCostResponseBodyData getData() {
        return this.data;
    }

    public static class QueryInstanceGaapCostResponseBodyDataModulesModule extends TeaModel {
        @NameInMap("BillingCycle")
        public String billingCycle;

        @NameInMap("InstanceID")
        public String instanceID;

        @NameInMap("ProductCode")
        public String productCode;

        @NameInMap("ProductType")
        public String productType;

        @NameInMap("SubscriptionType")
        public String subscriptionType;

        @NameInMap("Tag")
        public String tag;

        @NameInMap("ResourceGroup")
        public String resourceGroup;

        @NameInMap("AccountingUnit")
        public String accountingUnit;

        @NameInMap("PayerAccount")
        public String payerAccount;

        @NameInMap("OwnerID")
        public String ownerID;

        @NameInMap("Region")
        public String region;

        @NameInMap("Currency")
        public String currency;

        @NameInMap("PaymentCurrency")
        public String paymentCurrency;

        @NameInMap("OrderType")
        public String orderType;

        @NameInMap("PayTime")
        public String payTime;

        @NameInMap("PretaxGrossAmount")
        public String pretaxGrossAmount;

        @NameInMap("PricingDiscount")
        public String pricingDiscount;

        @NameInMap("DeductedByCoupons")
        public String deductedByCoupons;

        @NameInMap("PretaxAmount")
        public String pretaxAmount;

        @NameInMap("PretaxAmountLocal")
        public String pretaxAmountLocal;

        @NameInMap("DeductedByCashCoupons")
        public String deductedByCashCoupons;

        @NameInMap("DeductedByPrepaidCard")
        public String deductedByPrepaidCard;

        @NameInMap("PaymentAmount")
        public String paymentAmount;

        @NameInMap("GaapPretaxGrossAmount")
        public String gaapPretaxGrossAmount;

        @NameInMap("GaapPricingDiscount")
        public String gaapPricingDiscount;

        @NameInMap("GaapDeductedByCoupons")
        public String gaapDeductedByCoupons;

        @NameInMap("GaapPretaxAmount")
        public String gaapPretaxAmount;

        @NameInMap("GaapPretaxAmountLocal")
        public String gaapPretaxAmountLocal;

        @NameInMap("GaapDeductedByCashCoupons")
        public String gaapDeductedByCashCoupons;

        @NameInMap("GaapDeductedByPrepaidCard")
        public String gaapDeductedByPrepaidCard;

        @NameInMap("GaapPaymentAmount")
        public String gaapPaymentAmount;

        @NameInMap("MonthGaapPretaxGrossAmount")
        public String monthGaapPretaxGrossAmount;

        @NameInMap("MonthGaapPricingDiscount")
        public String monthGaapPricingDiscount;

        @NameInMap("MonthGaapDeductedByCoupons")
        public String monthGaapDeductedByCoupons;

        @NameInMap("MonthGaapPretaxAmount")
        public String monthGaapPretaxAmount;

        @NameInMap("MonthGaapPretaxAmountLocal")
        public String monthGaapPretaxAmountLocal;

        @NameInMap("MonthGaapDeductedByCashCoupons")
        public String monthGaapDeductedByCashCoupons;

        @NameInMap("MonthGaapDeductedByPrepaidCard")
        public String monthGaapDeductedByPrepaidCard;

        @NameInMap("MonthGaapPaymentAmount")
        public String monthGaapPaymentAmount;

        @NameInMap("UnallocatedPaymentAmount")
        public String unallocatedPaymentAmount;

        @NameInMap("UsageStartDate")
        public String usageStartDate;

        @NameInMap("UsageEndDate")
        public String usageEndDate;

        @NameInMap("BillType")
        public String billType;

        @NameInMap("OrderId")
        public String orderId;

        @NameInMap("SubOrderId")
        public String subOrderId;

        @NameInMap("UnallocatedPretaxGrossAmount")
        public String unallocatedPretaxGrossAmount;

        @NameInMap("UnallocatedPricingDiscount")
        public String unallocatedPricingDiscount;

        @NameInMap("UnallocatedDeductedByCoupons")
        public String unallocatedDeductedByCoupons;

        @NameInMap("UnallocatedPretaxAmount")
        public String unallocatedPretaxAmount;

        @NameInMap("UnallocatedPretaxAmountLocal")
        public String unallocatedPretaxAmountLocal;

        @NameInMap("UnallocatedDeductedByCashCoupons")
        public String unallocatedDeductedByCashCoupons;

        @NameInMap("UnallocatedDeductedByPrepaidCard")
        public String unallocatedDeductedByPrepaidCard;

        public static QueryInstanceGaapCostResponseBodyDataModulesModule build(java.util.Map<String, ?> map) throws Exception {
            QueryInstanceGaapCostResponseBodyDataModulesModule self = new QueryInstanceGaapCostResponseBodyDataModulesModule();
            return TeaModel.build(map, self);
        }

        public QueryInstanceGaapCostResponseBodyDataModulesModule setBillingCycle(String billingCycle) {
            this.billingCycle = billingCycle;
            return this;
        }
        public String getBillingCycle() {
            return this.billingCycle;
        }

        public QueryInstanceGaapCostResponseBodyDataModulesModule setInstanceID(String instanceID) {
            this.instanceID = instanceID;
            return this;
        }
        public String getInstanceID() {
            return this.instanceID;
        }

        public QueryInstanceGaapCostResponseBodyDataModulesModule setProductCode(String productCode) {
            this.productCode = productCode;
            return this;
        }
        public String getProductCode() {
            return this.productCode;
        }

        public QueryInstanceGaapCostResponseBodyDataModulesModule setProductType(String productType) {
            this.productType = productType;
            return this;
        }
        public String getProductType() {
            return this.productType;
        }

        public QueryInstanceGaapCostResponseBodyDataModulesModule setSubscriptionType(String subscriptionType) {
            this.subscriptionType = subscriptionType;
            return this;
        }
        public String getSubscriptionType() {
            return this.subscriptionType;
        }

        public QueryInstanceGaapCostResponseBodyDataModulesModule setTag(String tag) {
            this.tag = tag;
            return this;
        }
        public String getTag() {
            return this.tag;
        }

        public QueryInstanceGaapCostResponseBodyDataModulesModule setResourceGroup(String resourceGroup) {
            this.resourceGroup = resourceGroup;
            return this;
        }
        public String getResourceGroup() {
            return this.resourceGroup;
        }

        public QueryInstanceGaapCostResponseBodyDataModulesModule setAccountingUnit(String accountingUnit) {
            this.accountingUnit = accountingUnit;
            return this;
        }
        public String getAccountingUnit() {
            return this.accountingUnit;
        }

        public QueryInstanceGaapCostResponseBodyDataModulesModule setPayerAccount(String payerAccount) {
            this.payerAccount = payerAccount;
            return this;
        }
        public String getPayerAccount() {
            return this.payerAccount;
        }

        public QueryInstanceGaapCostResponseBodyDataModulesModule setOwnerID(String ownerID) {
            this.ownerID = ownerID;
            return this;
        }
        public String getOwnerID() {
            return this.ownerID;
        }

        public QueryInstanceGaapCostResponseBodyDataModulesModule setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public QueryInstanceGaapCostResponseBodyDataModulesModule setCurrency(String currency) {
            this.currency = currency;
            return this;
        }
        public String getCurrency() {
            return this.currency;
        }

        public QueryInstanceGaapCostResponseBodyDataModulesModule setPaymentCurrency(String paymentCurrency) {
            this.paymentCurrency = paymentCurrency;
            return this;
        }
        public String getPaymentCurrency() {
            return this.paymentCurrency;
        }

        public QueryInstanceGaapCostResponseBodyDataModulesModule setOrderType(String orderType) {
            this.orderType = orderType;
            return this;
        }
        public String getOrderType() {
            return this.orderType;
        }

        public QueryInstanceGaapCostResponseBodyDataModulesModule setPayTime(String payTime) {
            this.payTime = payTime;
            return this;
        }
        public String getPayTime() {
            return this.payTime;
        }

        public QueryInstanceGaapCostResponseBodyDataModulesModule setPretaxGrossAmount(String pretaxGrossAmount) {
            this.pretaxGrossAmount = pretaxGrossAmount;
            return this;
        }
        public String getPretaxGrossAmount() {
            return this.pretaxGrossAmount;
        }

        public QueryInstanceGaapCostResponseBodyDataModulesModule setPricingDiscount(String pricingDiscount) {
            this.pricingDiscount = pricingDiscount;
            return this;
        }
        public String getPricingDiscount() {
            return this.pricingDiscount;
        }

        public QueryInstanceGaapCostResponseBodyDataModulesModule setDeductedByCoupons(String deductedByCoupons) {
            this.deductedByCoupons = deductedByCoupons;
            return this;
        }
        public String getDeductedByCoupons() {
            return this.deductedByCoupons;
        }

        public QueryInstanceGaapCostResponseBodyDataModulesModule setPretaxAmount(String pretaxAmount) {
            this.pretaxAmount = pretaxAmount;
            return this;
        }
        public String getPretaxAmount() {
            return this.pretaxAmount;
        }

        public QueryInstanceGaapCostResponseBodyDataModulesModule setPretaxAmountLocal(String pretaxAmountLocal) {
            this.pretaxAmountLocal = pretaxAmountLocal;
            return this;
        }
        public String getPretaxAmountLocal() {
            return this.pretaxAmountLocal;
        }

        public QueryInstanceGaapCostResponseBodyDataModulesModule setDeductedByCashCoupons(String deductedByCashCoupons) {
            this.deductedByCashCoupons = deductedByCashCoupons;
            return this;
        }
        public String getDeductedByCashCoupons() {
            return this.deductedByCashCoupons;
        }

        public QueryInstanceGaapCostResponseBodyDataModulesModule setDeductedByPrepaidCard(String deductedByPrepaidCard) {
            this.deductedByPrepaidCard = deductedByPrepaidCard;
            return this;
        }
        public String getDeductedByPrepaidCard() {
            return this.deductedByPrepaidCard;
        }

        public QueryInstanceGaapCostResponseBodyDataModulesModule setPaymentAmount(String paymentAmount) {
            this.paymentAmount = paymentAmount;
            return this;
        }
        public String getPaymentAmount() {
            return this.paymentAmount;
        }

        public QueryInstanceGaapCostResponseBodyDataModulesModule setGaapPretaxGrossAmount(String gaapPretaxGrossAmount) {
            this.gaapPretaxGrossAmount = gaapPretaxGrossAmount;
            return this;
        }
        public String getGaapPretaxGrossAmount() {
            return this.gaapPretaxGrossAmount;
        }

        public QueryInstanceGaapCostResponseBodyDataModulesModule setGaapPricingDiscount(String gaapPricingDiscount) {
            this.gaapPricingDiscount = gaapPricingDiscount;
            return this;
        }
        public String getGaapPricingDiscount() {
            return this.gaapPricingDiscount;
        }

        public QueryInstanceGaapCostResponseBodyDataModulesModule setGaapDeductedByCoupons(String gaapDeductedByCoupons) {
            this.gaapDeductedByCoupons = gaapDeductedByCoupons;
            return this;
        }
        public String getGaapDeductedByCoupons() {
            return this.gaapDeductedByCoupons;
        }

        public QueryInstanceGaapCostResponseBodyDataModulesModule setGaapPretaxAmount(String gaapPretaxAmount) {
            this.gaapPretaxAmount = gaapPretaxAmount;
            return this;
        }
        public String getGaapPretaxAmount() {
            return this.gaapPretaxAmount;
        }

        public QueryInstanceGaapCostResponseBodyDataModulesModule setGaapPretaxAmountLocal(String gaapPretaxAmountLocal) {
            this.gaapPretaxAmountLocal = gaapPretaxAmountLocal;
            return this;
        }
        public String getGaapPretaxAmountLocal() {
            return this.gaapPretaxAmountLocal;
        }

        public QueryInstanceGaapCostResponseBodyDataModulesModule setGaapDeductedByCashCoupons(String gaapDeductedByCashCoupons) {
            this.gaapDeductedByCashCoupons = gaapDeductedByCashCoupons;
            return this;
        }
        public String getGaapDeductedByCashCoupons() {
            return this.gaapDeductedByCashCoupons;
        }

        public QueryInstanceGaapCostResponseBodyDataModulesModule setGaapDeductedByPrepaidCard(String gaapDeductedByPrepaidCard) {
            this.gaapDeductedByPrepaidCard = gaapDeductedByPrepaidCard;
            return this;
        }
        public String getGaapDeductedByPrepaidCard() {
            return this.gaapDeductedByPrepaidCard;
        }

        public QueryInstanceGaapCostResponseBodyDataModulesModule setGaapPaymentAmount(String gaapPaymentAmount) {
            this.gaapPaymentAmount = gaapPaymentAmount;
            return this;
        }
        public String getGaapPaymentAmount() {
            return this.gaapPaymentAmount;
        }

        public QueryInstanceGaapCostResponseBodyDataModulesModule setMonthGaapPretaxGrossAmount(String monthGaapPretaxGrossAmount) {
            this.monthGaapPretaxGrossAmount = monthGaapPretaxGrossAmount;
            return this;
        }
        public String getMonthGaapPretaxGrossAmount() {
            return this.monthGaapPretaxGrossAmount;
        }

        public QueryInstanceGaapCostResponseBodyDataModulesModule setMonthGaapPricingDiscount(String monthGaapPricingDiscount) {
            this.monthGaapPricingDiscount = monthGaapPricingDiscount;
            return this;
        }
        public String getMonthGaapPricingDiscount() {
            return this.monthGaapPricingDiscount;
        }

        public QueryInstanceGaapCostResponseBodyDataModulesModule setMonthGaapDeductedByCoupons(String monthGaapDeductedByCoupons) {
            this.monthGaapDeductedByCoupons = monthGaapDeductedByCoupons;
            return this;
        }
        public String getMonthGaapDeductedByCoupons() {
            return this.monthGaapDeductedByCoupons;
        }

        public QueryInstanceGaapCostResponseBodyDataModulesModule setMonthGaapPretaxAmount(String monthGaapPretaxAmount) {
            this.monthGaapPretaxAmount = monthGaapPretaxAmount;
            return this;
        }
        public String getMonthGaapPretaxAmount() {
            return this.monthGaapPretaxAmount;
        }

        public QueryInstanceGaapCostResponseBodyDataModulesModule setMonthGaapPretaxAmountLocal(String monthGaapPretaxAmountLocal) {
            this.monthGaapPretaxAmountLocal = monthGaapPretaxAmountLocal;
            return this;
        }
        public String getMonthGaapPretaxAmountLocal() {
            return this.monthGaapPretaxAmountLocal;
        }

        public QueryInstanceGaapCostResponseBodyDataModulesModule setMonthGaapDeductedByCashCoupons(String monthGaapDeductedByCashCoupons) {
            this.monthGaapDeductedByCashCoupons = monthGaapDeductedByCashCoupons;
            return this;
        }
        public String getMonthGaapDeductedByCashCoupons() {
            return this.monthGaapDeductedByCashCoupons;
        }

        public QueryInstanceGaapCostResponseBodyDataModulesModule setMonthGaapDeductedByPrepaidCard(String monthGaapDeductedByPrepaidCard) {
            this.monthGaapDeductedByPrepaidCard = monthGaapDeductedByPrepaidCard;
            return this;
        }
        public String getMonthGaapDeductedByPrepaidCard() {
            return this.monthGaapDeductedByPrepaidCard;
        }

        public QueryInstanceGaapCostResponseBodyDataModulesModule setMonthGaapPaymentAmount(String monthGaapPaymentAmount) {
            this.monthGaapPaymentAmount = monthGaapPaymentAmount;
            return this;
        }
        public String getMonthGaapPaymentAmount() {
            return this.monthGaapPaymentAmount;
        }

        public QueryInstanceGaapCostResponseBodyDataModulesModule setUnallocatedPaymentAmount(String unallocatedPaymentAmount) {
            this.unallocatedPaymentAmount = unallocatedPaymentAmount;
            return this;
        }
        public String getUnallocatedPaymentAmount() {
            return this.unallocatedPaymentAmount;
        }

        public QueryInstanceGaapCostResponseBodyDataModulesModule setUsageStartDate(String usageStartDate) {
            this.usageStartDate = usageStartDate;
            return this;
        }
        public String getUsageStartDate() {
            return this.usageStartDate;
        }

        public QueryInstanceGaapCostResponseBodyDataModulesModule setUsageEndDate(String usageEndDate) {
            this.usageEndDate = usageEndDate;
            return this;
        }
        public String getUsageEndDate() {
            return this.usageEndDate;
        }

        public QueryInstanceGaapCostResponseBodyDataModulesModule setBillType(String billType) {
            this.billType = billType;
            return this;
        }
        public String getBillType() {
            return this.billType;
        }

        public QueryInstanceGaapCostResponseBodyDataModulesModule setOrderId(String orderId) {
            this.orderId = orderId;
            return this;
        }
        public String getOrderId() {
            return this.orderId;
        }

        public QueryInstanceGaapCostResponseBodyDataModulesModule setSubOrderId(String subOrderId) {
            this.subOrderId = subOrderId;
            return this;
        }
        public String getSubOrderId() {
            return this.subOrderId;
        }

        public QueryInstanceGaapCostResponseBodyDataModulesModule setUnallocatedPretaxGrossAmount(String unallocatedPretaxGrossAmount) {
            this.unallocatedPretaxGrossAmount = unallocatedPretaxGrossAmount;
            return this;
        }
        public String getUnallocatedPretaxGrossAmount() {
            return this.unallocatedPretaxGrossAmount;
        }

        public QueryInstanceGaapCostResponseBodyDataModulesModule setUnallocatedPricingDiscount(String unallocatedPricingDiscount) {
            this.unallocatedPricingDiscount = unallocatedPricingDiscount;
            return this;
        }
        public String getUnallocatedPricingDiscount() {
            return this.unallocatedPricingDiscount;
        }

        public QueryInstanceGaapCostResponseBodyDataModulesModule setUnallocatedDeductedByCoupons(String unallocatedDeductedByCoupons) {
            this.unallocatedDeductedByCoupons = unallocatedDeductedByCoupons;
            return this;
        }
        public String getUnallocatedDeductedByCoupons() {
            return this.unallocatedDeductedByCoupons;
        }

        public QueryInstanceGaapCostResponseBodyDataModulesModule setUnallocatedPretaxAmount(String unallocatedPretaxAmount) {
            this.unallocatedPretaxAmount = unallocatedPretaxAmount;
            return this;
        }
        public String getUnallocatedPretaxAmount() {
            return this.unallocatedPretaxAmount;
        }

        public QueryInstanceGaapCostResponseBodyDataModulesModule setUnallocatedPretaxAmountLocal(String unallocatedPretaxAmountLocal) {
            this.unallocatedPretaxAmountLocal = unallocatedPretaxAmountLocal;
            return this;
        }
        public String getUnallocatedPretaxAmountLocal() {
            return this.unallocatedPretaxAmountLocal;
        }

        public QueryInstanceGaapCostResponseBodyDataModulesModule setUnallocatedDeductedByCashCoupons(String unallocatedDeductedByCashCoupons) {
            this.unallocatedDeductedByCashCoupons = unallocatedDeductedByCashCoupons;
            return this;
        }
        public String getUnallocatedDeductedByCashCoupons() {
            return this.unallocatedDeductedByCashCoupons;
        }

        public QueryInstanceGaapCostResponseBodyDataModulesModule setUnallocatedDeductedByPrepaidCard(String unallocatedDeductedByPrepaidCard) {
            this.unallocatedDeductedByPrepaidCard = unallocatedDeductedByPrepaidCard;
            return this;
        }
        public String getUnallocatedDeductedByPrepaidCard() {
            return this.unallocatedDeductedByPrepaidCard;
        }

    }

    public static class QueryInstanceGaapCostResponseBodyDataModules extends TeaModel {
        @NameInMap("Module")
        public java.util.List<QueryInstanceGaapCostResponseBodyDataModulesModule> module;

        public static QueryInstanceGaapCostResponseBodyDataModules build(java.util.Map<String, ?> map) throws Exception {
            QueryInstanceGaapCostResponseBodyDataModules self = new QueryInstanceGaapCostResponseBodyDataModules();
            return TeaModel.build(map, self);
        }

        public QueryInstanceGaapCostResponseBodyDataModules setModule(java.util.List<QueryInstanceGaapCostResponseBodyDataModulesModule> module) {
            this.module = module;
            return this;
        }
        public java.util.List<QueryInstanceGaapCostResponseBodyDataModulesModule> getModule() {
            return this.module;
        }

    }

    public static class QueryInstanceGaapCostResponseBodyData extends TeaModel {
        @NameInMap("HostId")
        public String hostId;

        @NameInMap("PageNum")
        public Integer pageNum;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        @NameInMap("Modules")
        public QueryInstanceGaapCostResponseBodyDataModules modules;

        public static QueryInstanceGaapCostResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryInstanceGaapCostResponseBodyData self = new QueryInstanceGaapCostResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryInstanceGaapCostResponseBodyData setHostId(String hostId) {
            this.hostId = hostId;
            return this;
        }
        public String getHostId() {
            return this.hostId;
        }

        public QueryInstanceGaapCostResponseBodyData setPageNum(Integer pageNum) {
            this.pageNum = pageNum;
            return this;
        }
        public Integer getPageNum() {
            return this.pageNum;
        }

        public QueryInstanceGaapCostResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public QueryInstanceGaapCostResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public QueryInstanceGaapCostResponseBodyData setModules(QueryInstanceGaapCostResponseBodyDataModules modules) {
            this.modules = modules;
            return this;
        }
        public QueryInstanceGaapCostResponseBodyDataModules getModules() {
            return this.modules;
        }

    }

}
