// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class QueryInstanceGaapCostResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public QueryInstanceGaapCostResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>Successful!</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>CCBB1BB9-22F1-4177-867B-7A75D665B488</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static QueryInstanceGaapCostResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryInstanceGaapCostResponseBody self = new QueryInstanceGaapCostResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryInstanceGaapCostResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryInstanceGaapCostResponseBody setData(QueryInstanceGaapCostResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryInstanceGaapCostResponseBodyData getData() {
        return this.data;
    }

    public QueryInstanceGaapCostResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
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

    public static class QueryInstanceGaapCostResponseBodyDataModulesModule extends TeaModel {
        @NameInMap("AccountingUnit")
        public String accountingUnit;

        /**
         * <strong>example:</strong>
         * <p>SubscriptionOrder</p>
         */
        @NameInMap("BillType")
        public String billType;

        /**
         * <strong>example:</strong>
         * <p>2020-03</p>
         */
        @NameInMap("BillingCycle")
        public String billingCycle;

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
        public String deductedByCashCoupons;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("DeductedByCoupons")
        public String deductedByCoupons;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("DeductedByPrepaidCard")
        public String deductedByPrepaidCard;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("GaapDeductedByCashCoupons")
        public String gaapDeductedByCashCoupons;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("GaapDeductedByCoupons")
        public String gaapDeductedByCoupons;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("GaapDeductedByPrepaidCard")
        public String gaapDeductedByPrepaidCard;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("GaapPaymentAmount")
        public String gaapPaymentAmount;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("GaapPretaxAmount")
        public String gaapPretaxAmount;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("GaapPretaxAmountLocal")
        public String gaapPretaxAmountLocal;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("GaapPretaxGrossAmount")
        public String gaapPretaxGrossAmount;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("GaapPricingDiscount")
        public String gaapPricingDiscount;

        /**
         * <strong>example:</strong>
         * <p>OSSBAG-cn-0xl0xxxxxx</p>
         */
        @NameInMap("InstanceID")
        public String instanceID;

        /**
         * <strong>example:</strong>
         * <p>0.75</p>
         */
        @NameInMap("MonthGaapDeductedByCashCoupons")
        public String monthGaapDeductedByCashCoupons;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("MonthGaapDeductedByCoupons")
        public String monthGaapDeductedByCoupons;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("MonthGaapDeductedByPrepaidCard")
        public String monthGaapDeductedByPrepaidCard;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("MonthGaapPaymentAmount")
        public String monthGaapPaymentAmount;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("MonthGaapPretaxAmount")
        public String monthGaapPretaxAmount;

        /**
         * <strong>example:</strong>
         * <p>0.99</p>
         */
        @NameInMap("MonthGaapPretaxAmountLocal")
        public String monthGaapPretaxAmountLocal;

        /**
         * <strong>example:</strong>
         * <p>0.99</p>
         */
        @NameInMap("MonthGaapPretaxGrossAmount")
        public String monthGaapPretaxGrossAmount;

        /**
         * <strong>example:</strong>
         * <p>0,.25</p>
         */
        @NameInMap("MonthGaapPricingDiscount")
        public String monthGaapPricingDiscount;

        /**
         * <strong>example:</strong>
         * <p>213123213123</p>
         */
        @NameInMap("OrderId")
        public String orderId;

        /**
         * <strong>example:</strong>
         * <p>New</p>
         */
        @NameInMap("OrderType")
        public String orderType;

        /**
         * <strong>example:</strong>
         * <p>123213123123</p>
         */
        @NameInMap("OwnerID")
        public String ownerID;

        /**
         * <strong>example:</strong>
         * <p>2018-06-15 15:59:57</p>
         */
        @NameInMap("PayTime")
        public String payTime;

        /**
         * <strong>example:</strong>
         * <p>23534534</p>
         */
        @NameInMap("PayerAccount")
        public String payerAccount;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("PaymentAmount")
        public String paymentAmount;

        /**
         * <strong>example:</strong>
         * <p>CNY</p>
         */
        @NameInMap("PaymentCurrency")
        public String paymentCurrency;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("PretaxAmount")
        public String pretaxAmount;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("PretaxAmountLocal")
        public String pretaxAmountLocal;

        /**
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("PretaxGrossAmount")
        public String pretaxGrossAmount;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PricingDiscount")
        public String pricingDiscount;

        /**
         * <strong>example:</strong>
         * <p>rds</p>
         */
        @NameInMap("ProductCode")
        public String productCode;

        /**
         * <strong>example:</strong>
         * <p>rds</p>
         */
        @NameInMap("ProductType")
        public String productType;

        /**
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("Region")
        public String region;

        @NameInMap("ResourceGroup")
        public String resourceGroup;

        /**
         * <strong>example:</strong>
         * <p>12434345</p>
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
         * <p>tag</p>
         */
        @NameInMap("Tag")
        public String tag;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("UnallocatedDeductedByCashCoupons")
        public String unallocatedDeductedByCashCoupons;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("UnallocatedDeductedByCoupons")
        public String unallocatedDeductedByCoupons;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("UnallocatedDeductedByPrepaidCard")
        public String unallocatedDeductedByPrepaidCard;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("UnallocatedPaymentAmount")
        public String unallocatedPaymentAmount;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("UnallocatedPretaxAmount")
        public String unallocatedPretaxAmount;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("UnallocatedPretaxAmountLocal")
        public String unallocatedPretaxAmountLocal;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("UnallocatedPretaxGrossAmount")
        public String unallocatedPretaxGrossAmount;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("UnallocatedPricingDiscount")
        public String unallocatedPricingDiscount;

        /**
         * <strong>example:</strong>
         * <p>2019-05-01 00:00:00</p>
         */
        @NameInMap("UsageEndDate")
        public String usageEndDate;

        /**
         * <strong>example:</strong>
         * <p>2019-04-01 00:00:00</p>
         */
        @NameInMap("UsageStartDate")
        public String usageStartDate;

        public static QueryInstanceGaapCostResponseBodyDataModulesModule build(java.util.Map<String, ?> map) throws Exception {
            QueryInstanceGaapCostResponseBodyDataModulesModule self = new QueryInstanceGaapCostResponseBodyDataModulesModule();
            return TeaModel.build(map, self);
        }

        public QueryInstanceGaapCostResponseBodyDataModulesModule setAccountingUnit(String accountingUnit) {
            this.accountingUnit = accountingUnit;
            return this;
        }
        public String getAccountingUnit() {
            return this.accountingUnit;
        }

        public QueryInstanceGaapCostResponseBodyDataModulesModule setBillType(String billType) {
            this.billType = billType;
            return this;
        }
        public String getBillType() {
            return this.billType;
        }

        public QueryInstanceGaapCostResponseBodyDataModulesModule setBillingCycle(String billingCycle) {
            this.billingCycle = billingCycle;
            return this;
        }
        public String getBillingCycle() {
            return this.billingCycle;
        }

        public QueryInstanceGaapCostResponseBodyDataModulesModule setCurrency(String currency) {
            this.currency = currency;
            return this;
        }
        public String getCurrency() {
            return this.currency;
        }

        public QueryInstanceGaapCostResponseBodyDataModulesModule setDeductedByCashCoupons(String deductedByCashCoupons) {
            this.deductedByCashCoupons = deductedByCashCoupons;
            return this;
        }
        public String getDeductedByCashCoupons() {
            return this.deductedByCashCoupons;
        }

        public QueryInstanceGaapCostResponseBodyDataModulesModule setDeductedByCoupons(String deductedByCoupons) {
            this.deductedByCoupons = deductedByCoupons;
            return this;
        }
        public String getDeductedByCoupons() {
            return this.deductedByCoupons;
        }

        public QueryInstanceGaapCostResponseBodyDataModulesModule setDeductedByPrepaidCard(String deductedByPrepaidCard) {
            this.deductedByPrepaidCard = deductedByPrepaidCard;
            return this;
        }
        public String getDeductedByPrepaidCard() {
            return this.deductedByPrepaidCard;
        }

        public QueryInstanceGaapCostResponseBodyDataModulesModule setGaapDeductedByCashCoupons(String gaapDeductedByCashCoupons) {
            this.gaapDeductedByCashCoupons = gaapDeductedByCashCoupons;
            return this;
        }
        public String getGaapDeductedByCashCoupons() {
            return this.gaapDeductedByCashCoupons;
        }

        public QueryInstanceGaapCostResponseBodyDataModulesModule setGaapDeductedByCoupons(String gaapDeductedByCoupons) {
            this.gaapDeductedByCoupons = gaapDeductedByCoupons;
            return this;
        }
        public String getGaapDeductedByCoupons() {
            return this.gaapDeductedByCoupons;
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

        public QueryInstanceGaapCostResponseBodyDataModulesModule setInstanceID(String instanceID) {
            this.instanceID = instanceID;
            return this;
        }
        public String getInstanceID() {
            return this.instanceID;
        }

        public QueryInstanceGaapCostResponseBodyDataModulesModule setMonthGaapDeductedByCashCoupons(String monthGaapDeductedByCashCoupons) {
            this.monthGaapDeductedByCashCoupons = monthGaapDeductedByCashCoupons;
            return this;
        }
        public String getMonthGaapDeductedByCashCoupons() {
            return this.monthGaapDeductedByCashCoupons;
        }

        public QueryInstanceGaapCostResponseBodyDataModulesModule setMonthGaapDeductedByCoupons(String monthGaapDeductedByCoupons) {
            this.monthGaapDeductedByCoupons = monthGaapDeductedByCoupons;
            return this;
        }
        public String getMonthGaapDeductedByCoupons() {
            return this.monthGaapDeductedByCoupons;
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

        public QueryInstanceGaapCostResponseBodyDataModulesModule setOrderId(String orderId) {
            this.orderId = orderId;
            return this;
        }
        public String getOrderId() {
            return this.orderId;
        }

        public QueryInstanceGaapCostResponseBodyDataModulesModule setOrderType(String orderType) {
            this.orderType = orderType;
            return this;
        }
        public String getOrderType() {
            return this.orderType;
        }

        public QueryInstanceGaapCostResponseBodyDataModulesModule setOwnerID(String ownerID) {
            this.ownerID = ownerID;
            return this;
        }
        public String getOwnerID() {
            return this.ownerID;
        }

        public QueryInstanceGaapCostResponseBodyDataModulesModule setPayTime(String payTime) {
            this.payTime = payTime;
            return this;
        }
        public String getPayTime() {
            return this.payTime;
        }

        public QueryInstanceGaapCostResponseBodyDataModulesModule setPayerAccount(String payerAccount) {
            this.payerAccount = payerAccount;
            return this;
        }
        public String getPayerAccount() {
            return this.payerAccount;
        }

        public QueryInstanceGaapCostResponseBodyDataModulesModule setPaymentAmount(String paymentAmount) {
            this.paymentAmount = paymentAmount;
            return this;
        }
        public String getPaymentAmount() {
            return this.paymentAmount;
        }

        public QueryInstanceGaapCostResponseBodyDataModulesModule setPaymentCurrency(String paymentCurrency) {
            this.paymentCurrency = paymentCurrency;
            return this;
        }
        public String getPaymentCurrency() {
            return this.paymentCurrency;
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

        public QueryInstanceGaapCostResponseBodyDataModulesModule setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public QueryInstanceGaapCostResponseBodyDataModulesModule setResourceGroup(String resourceGroup) {
            this.resourceGroup = resourceGroup;
            return this;
        }
        public String getResourceGroup() {
            return this.resourceGroup;
        }

        public QueryInstanceGaapCostResponseBodyDataModulesModule setSubOrderId(String subOrderId) {
            this.subOrderId = subOrderId;
            return this;
        }
        public String getSubOrderId() {
            return this.subOrderId;
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

        public QueryInstanceGaapCostResponseBodyDataModulesModule setUnallocatedDeductedByCashCoupons(String unallocatedDeductedByCashCoupons) {
            this.unallocatedDeductedByCashCoupons = unallocatedDeductedByCashCoupons;
            return this;
        }
        public String getUnallocatedDeductedByCashCoupons() {
            return this.unallocatedDeductedByCashCoupons;
        }

        public QueryInstanceGaapCostResponseBodyDataModulesModule setUnallocatedDeductedByCoupons(String unallocatedDeductedByCoupons) {
            this.unallocatedDeductedByCoupons = unallocatedDeductedByCoupons;
            return this;
        }
        public String getUnallocatedDeductedByCoupons() {
            return this.unallocatedDeductedByCoupons;
        }

        public QueryInstanceGaapCostResponseBodyDataModulesModule setUnallocatedDeductedByPrepaidCard(String unallocatedDeductedByPrepaidCard) {
            this.unallocatedDeductedByPrepaidCard = unallocatedDeductedByPrepaidCard;
            return this;
        }
        public String getUnallocatedDeductedByPrepaidCard() {
            return this.unallocatedDeductedByPrepaidCard;
        }

        public QueryInstanceGaapCostResponseBodyDataModulesModule setUnallocatedPaymentAmount(String unallocatedPaymentAmount) {
            this.unallocatedPaymentAmount = unallocatedPaymentAmount;
            return this;
        }
        public String getUnallocatedPaymentAmount() {
            return this.unallocatedPaymentAmount;
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

        public QueryInstanceGaapCostResponseBodyDataModulesModule setUsageEndDate(String usageEndDate) {
            this.usageEndDate = usageEndDate;
            return this;
        }
        public String getUsageEndDate() {
            return this.usageEndDate;
        }

        public QueryInstanceGaapCostResponseBodyDataModulesModule setUsageStartDate(String usageStartDate) {
            this.usageStartDate = usageStartDate;
            return this;
        }
        public String getUsageStartDate() {
            return this.usageStartDate;
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
        /**
         * <strong>example:</strong>
         * <p>1.1.1.1</p>
         */
        @NameInMap("HostId")
        public String hostId;

        @NameInMap("Modules")
        public QueryInstanceGaapCostResponseBodyDataModules modules;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNum")
        public Integer pageNum;

        /**
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

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

        public QueryInstanceGaapCostResponseBodyData setModules(QueryInstanceGaapCostResponseBodyDataModules modules) {
            this.modules = modules;
            return this;
        }
        public QueryInstanceGaapCostResponseBodyDataModules getModules() {
            return this.modules;
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

    }

}
