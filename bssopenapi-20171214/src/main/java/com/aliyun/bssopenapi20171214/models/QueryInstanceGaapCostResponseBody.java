// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class QueryInstanceGaapCostResponseBody extends TeaModel {
    /**
     * <p>The status code returned.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The data returned.</p>
     */
    @NameInMap("Data")
    public QueryInstanceGaapCostResponseBodyData data;

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
        /**
         * <p>The accounting unit. This parameter is reserved and unavailable now.</p>
         */
        @NameInMap("AccountingUnit")
        public String accountingUnit;

        /**
         * <p>The type of the bill. Valid values:</p>
         * <br>
         * <p>*   SubscriptionOrder: subscription order</p>
         * <p>*   PayAsYouGoBill: pay-as-you-go bill</p>
         * <p>*   Refund: refund</p>
         * <p>*   Adjustment: reconciliation</p>
         */
        @NameInMap("BillType")
        public String billType;

        /**
         * <p>The billing cycle, in the YYYY-MM format.</p>
         */
        @NameInMap("BillingCycle")
        public String billingCycle;

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
        public String deductedByCashCoupons;

        /**
         * <p>The amount deducted by using coupons.</p>
         */
        @NameInMap("DeductedByCoupons")
        public String deductedByCoupons;

        /**
         * <p>The amount deducted by using prepaid cards.</p>
         */
        @NameInMap("DeductedByPrepaidCard")
        public String deductedByPrepaidCard;

        /**
         * <p>The allocated amount deducted by using vouchers.</p>
         */
        @NameInMap("GaapDeductedByCashCoupons")
        public String gaapDeductedByCashCoupons;

        /**
         * <p>The allocated amount deducted by using coupons.</p>
         */
        @NameInMap("GaapDeductedByCoupons")
        public String gaapDeductedByCoupons;

        /**
         * <p>The allocated amount deducted by using prepaid cards.</p>
         */
        @NameInMap("GaapDeductedByPrepaidCard")
        public String gaapDeductedByPrepaidCard;

        /**
         * <p>The allocated amount paid in cash.</p>
         */
        @NameInMap("GaapPaymentAmount")
        public String gaapPaymentAmount;

        /**
         * <p>The allocated pretax amount.</p>
         */
        @NameInMap("GaapPretaxAmount")
        public String gaapPretaxAmount;

        /**
         * <p>The allocated pretax amount paid with the local currency.</p>
         */
        @NameInMap("GaapPretaxAmountLocal")
        public String gaapPretaxAmountLocal;

        /**
         * <p>The allocated pretax gross amount.</p>
         */
        @NameInMap("GaapPretaxGrossAmount")
        public String gaapPretaxGrossAmount;

        /**
         * <p>The allocated pricing discount.</p>
         */
        @NameInMap("GaapPricingDiscount")
        public String gaapPricingDiscount;

        /**
         * <p>The ID of the instance.</p>
         */
        @NameInMap("InstanceID")
        public String instanceID;

        /**
         * <p>The amount deducted by using vouchers and allocated to the current month.</p>
         */
        @NameInMap("MonthGaapDeductedByCashCoupons")
        public String monthGaapDeductedByCashCoupons;

        /**
         * <p>The amount deducted by using coupons and allocated to the current month.</p>
         */
        @NameInMap("MonthGaapDeductedByCoupons")
        public String monthGaapDeductedByCoupons;

        /**
         * <p>The amount deducted by using prepaid cards and allocated to the current month.</p>
         */
        @NameInMap("MonthGaapDeductedByPrepaidCard")
        public String monthGaapDeductedByPrepaidCard;

        /**
         * <p>The amount paid in cash and allocated to the current month.</p>
         */
        @NameInMap("MonthGaapPaymentAmount")
        public String monthGaapPaymentAmount;

        /**
         * <p>The pretax amount allocated to the current month.</p>
         */
        @NameInMap("MonthGaapPretaxAmount")
        public String monthGaapPretaxAmount;

        /**
         * <p>The pretax amount paid with the local currency and allocated to the current month (Alibaba Cloud International site).</p>
         */
        @NameInMap("MonthGaapPretaxAmountLocal")
        public String monthGaapPretaxAmountLocal;

        /**
         * <p>The pretax gross amount allocated to the current month.</p>
         */
        @NameInMap("MonthGaapPretaxGrossAmount")
        public String monthGaapPretaxGrossAmount;

        /**
         * <p>The pricing discount allocated to the current month.</p>
         */
        @NameInMap("MonthGaapPricingDiscount")
        public String monthGaapPricingDiscount;

        /**
         * <p>The ID of the order.</p>
         */
        @NameInMap("OrderId")
        public String orderId;

        /**
         * <p>The type of the order. Valid values:</p>
         * <br>
         * <p>*   New</p>
         * <p>*   Renewal</p>
         * <p>*   Upgrade</p>
         * <p>*   Degrade</p>
         */
        @NameInMap("OrderType")
        public String orderType;

        /**
         * <p>The ID of the bill owner.</p>
         */
        @NameInMap("OwnerID")
        public String ownerID;

        /**
         * <p>The time when the bill was paid.</p>
         */
        @NameInMap("PayTime")
        public String payTime;

        /**
         * <p>The account of the payer.</p>
         */
        @NameInMap("PayerAccount")
        public String payerAccount;

        /**
         * <p>The amount paid in cash.</p>
         */
        @NameInMap("PaymentAmount")
        public String paymentAmount;

        /**
         * <p>The type of the currency (Alibaba Cloud International site).</p>
         */
        @NameInMap("PaymentCurrency")
        public String paymentCurrency;

        /**
         * <p>The pretax amount.</p>
         */
        @NameInMap("PretaxAmount")
        public String pretaxAmount;

        /**
         * <p>The allocated pretax amount paid with the local currency (Alibaba Cloud International site).</p>
         */
        @NameInMap("PretaxAmountLocal")
        public String pretaxAmountLocal;

        /**
         * <p>The pretax gross amount.</p>
         */
        @NameInMap("PretaxGrossAmount")
        public String pretaxGrossAmount;

        /**
         * <p>The pricing discount.</p>
         */
        @NameInMap("PricingDiscount")
        public String pricingDiscount;

        /**
         * <p>The code of the service.</p>
         */
        @NameInMap("ProductCode")
        public String productCode;

        /**
         * <p>The type of the service.</p>
         */
        @NameInMap("ProductType")
        public String productType;

        /**
         * <p>The ID of the region.</p>
         */
        @NameInMap("Region")
        public String region;

        /**
         * <p>The resource group.</p>
         */
        @NameInMap("ResourceGroup")
        public String resourceGroup;

        /**
         * <p>The ID of the sub-order.</p>
         */
        @NameInMap("SubOrderId")
        public String subOrderId;

        /**
         * <p>The billing method. Valid values:</p>
         * <br>
         * <p>*   Subscription: the subscription billing method</p>
         * <p>*   PayAsYouGo: the pay-as-you-go billing method</p>
         */
        @NameInMap("SubscriptionType")
        public String subscriptionType;

        /**
         * <p>The tag.</p>
         */
        @NameInMap("Tag")
        public String tag;

        /**
         * <p>The unallocated amount deducted by using vouchers.</p>
         */
        @NameInMap("UnallocatedDeductedByCashCoupons")
        public String unallocatedDeductedByCashCoupons;

        /**
         * <p>The unallocated amount deducted by using coupons.</p>
         */
        @NameInMap("UnallocatedDeductedByCoupons")
        public String unallocatedDeductedByCoupons;

        /**
         * <p>The unallocated amount deducted by using prepaid cards.</p>
         */
        @NameInMap("UnallocatedDeductedByPrepaidCard")
        public String unallocatedDeductedByPrepaidCard;

        /**
         * <p>The unallocated amount paid in cash.</p>
         */
        @NameInMap("UnallocatedPaymentAmount")
        public String unallocatedPaymentAmount;

        /**
         * <p>The unallocated pretax amount.</p>
         */
        @NameInMap("UnallocatedPretaxAmount")
        public String unallocatedPretaxAmount;

        /**
         * <p>The unallocated pretax amount paid with the local currency.</p>
         */
        @NameInMap("UnallocatedPretaxAmountLocal")
        public String unallocatedPretaxAmountLocal;

        /**
         * <p>The unallocated pretax gross amount.</p>
         */
        @NameInMap("UnallocatedPretaxGrossAmount")
        public String unallocatedPretaxGrossAmount;

        /**
         * <p>The unallocated pricing discount.</p>
         */
        @NameInMap("UnallocatedPricingDiscount")
        public String unallocatedPricingDiscount;

        /**
         * <p>The time when the service usage ended.</p>
         */
        @NameInMap("UsageEndDate")
        public String usageEndDate;

        /**
         * <p>The time when the service usage started.</p>
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
         * <p>The ID of the host.</p>
         */
        @NameInMap("HostId")
        public String hostId;

        /**
         * <p>The billing information.</p>
         */
        @NameInMap("Modules")
        public QueryInstanceGaapCostResponseBodyDataModules modules;

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
