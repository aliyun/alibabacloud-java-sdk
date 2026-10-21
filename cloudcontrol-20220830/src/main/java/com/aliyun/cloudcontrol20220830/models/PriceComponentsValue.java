// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudcontrol20220830.models;

import com.aliyun.tea.*;

public class PriceComponentsValue extends TeaModel {
    /**
     * <p>The billing composition. Valid values: recurring_only (all time-based fees), usage_only (all usage-based fees, where a totalAmount of 0 indicates no fixed fees rather than free of charge, and actual costs depend on the unit price and actual usage in usageCharges), or mixed (both, which should be displayed separately). This allows the caller to choose the display text without iterating through modules to determine the composition.</p>
     */
    @NameInMap("chargeComposition")
    public String chargeComposition;

    @NameInMap("currency")
    public String currency;

    @NameInMap("effectiveModuleSum")
    public Float effectiveModuleSum;

    @NameInMap("moduleSum")
    public Float moduleSum;

    @NameInMap("modules")
    public java.util.List<PriceComponentsValueModules> modules;

    /**
     * <p>The total original price before discounts for this pricing inquiry. When originalPrice differs from tradePrice or moduleSum, it indicates that a discount was applied, such as a first-purchase discount or a promotional campaign.</p>
     */
    @NameInMap("originalPrice")
    public Float originalPrice;

    /**
     * <p>The billing cycle unit, such as \&quot;Hour\&quot;, \&quot;1 Month\&quot;, \&quot;12 Month\&quot;, or \&quot;GB·Month\&quot;, which indicates the time dimension of moduleSum. This field is not returned in the BSS response and must be explicitly declared by the mapping maintainer in pricingTarget.pricingUnit. It is optional for subscription scenarios because the CLI infers it from Period and PeriodUnit. However, it is required for pay-as-you-go scenarios in the mapping; otherwise, the amount has no dimension.</p>
     */
    @NameInMap("pricingUnit")
    public String pricingUnit;

    /**
     * <p>The pricing quantity from OpenAPI input parameters, such as Amount in ECS RunInstances. The moduleSum is the unit price per instance, and effectiveModuleSum = moduleSum × quantity is the total price. The caller should present the actual total price for N instances to the user based on this value to avoid mistaking the unit price for the total price.</p>
     */
    @NameInMap("quantity")
    public Float quantity;

    @NameInMap("tradePrice")
    public Float tradePrice;

    /**
     * <p>The list of unit prices for pay-as-you-go, usage-based modules, such as CNY/GB or CNY/CU. The amounts for these modules are not included in moduleSum or effectiveModuleSum. This field is empty when there are no usage-based modules.</p>
     */
    @NameInMap("usageCharges")
    public java.util.List<PriceComponentsValueUsageCharges> usageCharges;

    public static PriceComponentsValue build(java.util.Map<String, ?> map) throws Exception {
        PriceComponentsValue self = new PriceComponentsValue();
        return TeaModel.build(map, self);
    }

    public PriceComponentsValue setChargeComposition(String chargeComposition) {
        this.chargeComposition = chargeComposition;
        return this;
    }
    public String getChargeComposition() {
        return this.chargeComposition;
    }

    public PriceComponentsValue setCurrency(String currency) {
        this.currency = currency;
        return this;
    }
    public String getCurrency() {
        return this.currency;
    }

    public PriceComponentsValue setEffectiveModuleSum(Float effectiveModuleSum) {
        this.effectiveModuleSum = effectiveModuleSum;
        return this;
    }
    public Float getEffectiveModuleSum() {
        return this.effectiveModuleSum;
    }

    public PriceComponentsValue setModuleSum(Float moduleSum) {
        this.moduleSum = moduleSum;
        return this;
    }
    public Float getModuleSum() {
        return this.moduleSum;
    }

    public PriceComponentsValue setModules(java.util.List<PriceComponentsValueModules> modules) {
        this.modules = modules;
        return this;
    }
    public java.util.List<PriceComponentsValueModules> getModules() {
        return this.modules;
    }

    public PriceComponentsValue setOriginalPrice(Float originalPrice) {
        this.originalPrice = originalPrice;
        return this;
    }
    public Float getOriginalPrice() {
        return this.originalPrice;
    }

    public PriceComponentsValue setPricingUnit(String pricingUnit) {
        this.pricingUnit = pricingUnit;
        return this;
    }
    public String getPricingUnit() {
        return this.pricingUnit;
    }

    public PriceComponentsValue setQuantity(Float quantity) {
        this.quantity = quantity;
        return this;
    }
    public Float getQuantity() {
        return this.quantity;
    }

    public PriceComponentsValue setTradePrice(Float tradePrice) {
        this.tradePrice = tradePrice;
        return this;
    }
    public Float getTradePrice() {
        return this.tradePrice;
    }

    public PriceComponentsValue setUsageCharges(java.util.List<PriceComponentsValueUsageCharges> usageCharges) {
        this.usageCharges = usageCharges;
        return this;
    }
    public java.util.List<PriceComponentsValueUsageCharges> getUsageCharges() {
        return this.usageCharges;
    }

    public static class PriceComponentsValueModules extends TeaModel {
        /**
         * <p>The billing dimension of this module, which is always explicitly output. Valid values: \&quot;recurring\&quot; for time-based fees, which are included in moduleSum and totalAmount; \&quot;usage\&quot; for usage-based fees, where costAfterDiscount is the usage unit price (CNY/usageUnit) and is not included in moduleSum, and the unit price is also provided in usageCharges.</p>
         */
        @NameInMap("billingMode")
        public String billingMode;

        @NameInMap("costAfterDiscount")
        public Float costAfterDiscount;

        /**
         * <p>The discount amount for this module. The value is calculated as invoiceDiscount = originalCost - costAfterDiscount and is precisely provided by the upstream BSS. Manual subtraction in tax-inclusive scenarios may cause precision loss.</p>
         */
        @NameInMap("invoiceDiscount")
        public Float invoiceDiscount;

        @NameInMap("moduleCode")
        public String moduleCode;

        @NameInMap("originalCost")
        public Float originalCost;

        /**
         * <p>The estimated usage used for pricing this module. This field has a value only when the caller passes a usage greater than 1 through PricingContext. In this case, costAfterDiscount is the total cost for this usage rather than the unit price. Refer to usageCharges[].pricePerUnit for the normalized unit price. This field is empty when no estimated usage is passed.</p>
         */
        @NameInMap("quantityUsedForQuote")
        public Float quantityUsedForQuote;

        /**
         * <p>The unit price of this module per billing unit, such as CNY/hour, CNY/month, or CNY/unit. This is used to explain the composition of costAfterDiscount in multi-quantity or multi-period scenarios.</p>
         */
        @NameInMap("unitPrice")
        public Float unitPrice;

        /**
         * <p>The usage unit, such as GB or CU. This field has a value when billingMode is \&quot;usage\&quot; and indicates the dimension of costAfterDiscount.</p>
         */
        @NameInMap("usageUnit")
        public String usageUnit;

        public static PriceComponentsValueModules build(java.util.Map<String, ?> map) throws Exception {
            PriceComponentsValueModules self = new PriceComponentsValueModules();
            return TeaModel.build(map, self);
        }

        public PriceComponentsValueModules setBillingMode(String billingMode) {
            this.billingMode = billingMode;
            return this;
        }
        public String getBillingMode() {
            return this.billingMode;
        }

        public PriceComponentsValueModules setCostAfterDiscount(Float costAfterDiscount) {
            this.costAfterDiscount = costAfterDiscount;
            return this;
        }
        public Float getCostAfterDiscount() {
            return this.costAfterDiscount;
        }

        public PriceComponentsValueModules setInvoiceDiscount(Float invoiceDiscount) {
            this.invoiceDiscount = invoiceDiscount;
            return this;
        }
        public Float getInvoiceDiscount() {
            return this.invoiceDiscount;
        }

        public PriceComponentsValueModules setModuleCode(String moduleCode) {
            this.moduleCode = moduleCode;
            return this;
        }
        public String getModuleCode() {
            return this.moduleCode;
        }

        public PriceComponentsValueModules setOriginalCost(Float originalCost) {
            this.originalCost = originalCost;
            return this;
        }
        public Float getOriginalCost() {
            return this.originalCost;
        }

        public PriceComponentsValueModules setQuantityUsedForQuote(Float quantityUsedForQuote) {
            this.quantityUsedForQuote = quantityUsedForQuote;
            return this;
        }
        public Float getQuantityUsedForQuote() {
            return this.quantityUsedForQuote;
        }

        public PriceComponentsValueModules setUnitPrice(Float unitPrice) {
            this.unitPrice = unitPrice;
            return this;
        }
        public Float getUnitPrice() {
            return this.unitPrice;
        }

        public PriceComponentsValueModules setUsageUnit(String usageUnit) {
            this.usageUnit = usageUnit;
            return this;
        }
        public String getUsageUnit() {
            return this.usageUnit;
        }

    }

    public static class PriceComponentsValueUsageCharges extends TeaModel {
        /**
         * <p>The estimated usage passed by the caller through PricingContext. This field has a value only when it is greater than 1. In this case, this entry also provides the assumedQuantityCost calculated based on this assumed usage.</p>
         */
        @NameInMap("assumedQuantity")
        public Float assumedQuantity;

        /**
         * <p>The module cost calculated based on assumedQuantity, which equals pricePerUnit × assumedQuantity. This cost is not included in totalAmount because it is based on the assumed usage reported by the caller and is not a cost necessarily incurred by this call.</p>
         */
        @NameInMap("assumedQuantityCost")
        public Float assumedQuantityCost;

        /**
         * <p>The billing module code, such as TrafficOut or NatCu. This corresponds to the moduleCode in modules.</p>
         */
        @NameInMap("moduleCode")
        public String moduleCode;

        /**
         * <p>The original unit price before discounts, in CNY/unit, which is also normalized. This field is empty when not provided by the upstream. The difference between this value and pricePerUnit is the unit price discount for this module.</p>
         */
        @NameInMap("originalPricePerUnit")
        public Float originalPricePerUnit;

        /**
         * <p>The discounted unit price, in CNY/unit. The actual cost equals pricePerUnit × actual usage. Because the usage is unknown during pricing, it is not included in totalAmount. If the caller passed an estimated usage, the total returned by the upstream is normalized back to the unit price based on that usage.</p>
         */
        @NameInMap("pricePerUnit")
        public Float pricePerUnit;

        /**
         * <p>The usage unit, such as GB, CU, or 10,000 requests. This comes from the module-level billing.unit annotation in the mapping. The dimension of pricePerUnit is CNY/unit.</p>
         */
        @NameInMap("unit")
        public String unit;

        public static PriceComponentsValueUsageCharges build(java.util.Map<String, ?> map) throws Exception {
            PriceComponentsValueUsageCharges self = new PriceComponentsValueUsageCharges();
            return TeaModel.build(map, self);
        }

        public PriceComponentsValueUsageCharges setAssumedQuantity(Float assumedQuantity) {
            this.assumedQuantity = assumedQuantity;
            return this;
        }
        public Float getAssumedQuantity() {
            return this.assumedQuantity;
        }

        public PriceComponentsValueUsageCharges setAssumedQuantityCost(Float assumedQuantityCost) {
            this.assumedQuantityCost = assumedQuantityCost;
            return this;
        }
        public Float getAssumedQuantityCost() {
            return this.assumedQuantityCost;
        }

        public PriceComponentsValueUsageCharges setModuleCode(String moduleCode) {
            this.moduleCode = moduleCode;
            return this;
        }
        public String getModuleCode() {
            return this.moduleCode;
        }

        public PriceComponentsValueUsageCharges setOriginalPricePerUnit(Float originalPricePerUnit) {
            this.originalPricePerUnit = originalPricePerUnit;
            return this;
        }
        public Float getOriginalPricePerUnit() {
            return this.originalPricePerUnit;
        }

        public PriceComponentsValueUsageCharges setPricePerUnit(Float pricePerUnit) {
            this.pricePerUnit = pricePerUnit;
            return this;
        }
        public Float getPricePerUnit() {
            return this.pricePerUnit;
        }

        public PriceComponentsValueUsageCharges setUnit(String unit) {
            this.unit = unit;
            return this;
        }
        public String getUnit() {
            return this.unit;
        }

    }

}
