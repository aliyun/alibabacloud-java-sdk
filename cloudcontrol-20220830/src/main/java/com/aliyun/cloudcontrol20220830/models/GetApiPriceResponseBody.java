// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudcontrol20220830.models;

import com.aliyun.tea.*;

public class GetApiPriceResponseBody extends TeaModel {
    /**
     * <p>The pricing result code. Valid values: Success, PricingNotRequired, PricingNotSupported, or an upstream pricing failure code.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The server-side pricing result description. The language is specified by the language parameter in the request body and defaults to Chinese.</p>
     * 
     * <strong>example:</strong>
     * <p>Pricing succeeded</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The pricing data. This field is omitted for PricingNotRequired and PricingNotSupported results that do not include pricing.</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("price")
    public GetApiPriceResponseBodyPrice price;

    /**
     * <p>Id of the request</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Indicates whether a valid pricing result is obtained. The value is true for normal pricing and when no pricing inquiry is required, and false when pricing is not supported or the pricing inquiry fails.</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static GetApiPriceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetApiPriceResponseBody self = new GetApiPriceResponseBody();
        return TeaModel.build(map, self);
    }

    public GetApiPriceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetApiPriceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetApiPriceResponseBody setPrice(GetApiPriceResponseBodyPrice price) {
        this.price = price;
        return this;
    }
    public GetApiPriceResponseBodyPrice getPrice() {
        return this.price;
    }

    public GetApiPriceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetApiPriceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetApiPriceResponseBodyPricePriceSummaryModules extends TeaModel {
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

        public static GetApiPriceResponseBodyPricePriceSummaryModules build(java.util.Map<String, ?> map) throws Exception {
            GetApiPriceResponseBodyPricePriceSummaryModules self = new GetApiPriceResponseBodyPricePriceSummaryModules();
            return TeaModel.build(map, self);
        }

        public GetApiPriceResponseBodyPricePriceSummaryModules setBillingMode(String billingMode) {
            this.billingMode = billingMode;
            return this;
        }
        public String getBillingMode() {
            return this.billingMode;
        }

        public GetApiPriceResponseBodyPricePriceSummaryModules setCostAfterDiscount(Float costAfterDiscount) {
            this.costAfterDiscount = costAfterDiscount;
            return this;
        }
        public Float getCostAfterDiscount() {
            return this.costAfterDiscount;
        }

        public GetApiPriceResponseBodyPricePriceSummaryModules setInvoiceDiscount(Float invoiceDiscount) {
            this.invoiceDiscount = invoiceDiscount;
            return this;
        }
        public Float getInvoiceDiscount() {
            return this.invoiceDiscount;
        }

        public GetApiPriceResponseBodyPricePriceSummaryModules setModuleCode(String moduleCode) {
            this.moduleCode = moduleCode;
            return this;
        }
        public String getModuleCode() {
            return this.moduleCode;
        }

        public GetApiPriceResponseBodyPricePriceSummaryModules setOriginalCost(Float originalCost) {
            this.originalCost = originalCost;
            return this;
        }
        public Float getOriginalCost() {
            return this.originalCost;
        }

        public GetApiPriceResponseBodyPricePriceSummaryModules setQuantityUsedForQuote(Float quantityUsedForQuote) {
            this.quantityUsedForQuote = quantityUsedForQuote;
            return this;
        }
        public Float getQuantityUsedForQuote() {
            return this.quantityUsedForQuote;
        }

        public GetApiPriceResponseBodyPricePriceSummaryModules setUnitPrice(Float unitPrice) {
            this.unitPrice = unitPrice;
            return this;
        }
        public Float getUnitPrice() {
            return this.unitPrice;
        }

        public GetApiPriceResponseBodyPricePriceSummaryModules setUsageUnit(String usageUnit) {
            this.usageUnit = usageUnit;
            return this;
        }
        public String getUsageUnit() {
            return this.usageUnit;
        }

    }

    public static class GetApiPriceResponseBodyPricePriceSummaryUsageCharges extends TeaModel {
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

        public static GetApiPriceResponseBodyPricePriceSummaryUsageCharges build(java.util.Map<String, ?> map) throws Exception {
            GetApiPriceResponseBodyPricePriceSummaryUsageCharges self = new GetApiPriceResponseBodyPricePriceSummaryUsageCharges();
            return TeaModel.build(map, self);
        }

        public GetApiPriceResponseBodyPricePriceSummaryUsageCharges setAssumedQuantity(Float assumedQuantity) {
            this.assumedQuantity = assumedQuantity;
            return this;
        }
        public Float getAssumedQuantity() {
            return this.assumedQuantity;
        }

        public GetApiPriceResponseBodyPricePriceSummaryUsageCharges setAssumedQuantityCost(Float assumedQuantityCost) {
            this.assumedQuantityCost = assumedQuantityCost;
            return this;
        }
        public Float getAssumedQuantityCost() {
            return this.assumedQuantityCost;
        }

        public GetApiPriceResponseBodyPricePriceSummaryUsageCharges setModuleCode(String moduleCode) {
            this.moduleCode = moduleCode;
            return this;
        }
        public String getModuleCode() {
            return this.moduleCode;
        }

        public GetApiPriceResponseBodyPricePriceSummaryUsageCharges setOriginalPricePerUnit(Float originalPricePerUnit) {
            this.originalPricePerUnit = originalPricePerUnit;
            return this;
        }
        public Float getOriginalPricePerUnit() {
            return this.originalPricePerUnit;
        }

        public GetApiPriceResponseBodyPricePriceSummaryUsageCharges setPricePerUnit(Float pricePerUnit) {
            this.pricePerUnit = pricePerUnit;
            return this;
        }
        public Float getPricePerUnit() {
            return this.pricePerUnit;
        }

        public GetApiPriceResponseBodyPricePriceSummaryUsageCharges setUnit(String unit) {
            this.unit = unit;
            return this;
        }
        public String getUnit() {
            return this.unit;
        }

    }

    public static class GetApiPriceResponseBodyPricePriceSummary extends TeaModel {
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
        public java.util.List<GetApiPriceResponseBodyPricePriceSummaryModules> modules;

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
        public java.util.List<GetApiPriceResponseBodyPricePriceSummaryUsageCharges> usageCharges;

        public static GetApiPriceResponseBodyPricePriceSummary build(java.util.Map<String, ?> map) throws Exception {
            GetApiPriceResponseBodyPricePriceSummary self = new GetApiPriceResponseBodyPricePriceSummary();
            return TeaModel.build(map, self);
        }

        public GetApiPriceResponseBodyPricePriceSummary setChargeComposition(String chargeComposition) {
            this.chargeComposition = chargeComposition;
            return this;
        }
        public String getChargeComposition() {
            return this.chargeComposition;
        }

        public GetApiPriceResponseBodyPricePriceSummary setCurrency(String currency) {
            this.currency = currency;
            return this;
        }
        public String getCurrency() {
            return this.currency;
        }

        public GetApiPriceResponseBodyPricePriceSummary setEffectiveModuleSum(Float effectiveModuleSum) {
            this.effectiveModuleSum = effectiveModuleSum;
            return this;
        }
        public Float getEffectiveModuleSum() {
            return this.effectiveModuleSum;
        }

        public GetApiPriceResponseBodyPricePriceSummary setModuleSum(Float moduleSum) {
            this.moduleSum = moduleSum;
            return this;
        }
        public Float getModuleSum() {
            return this.moduleSum;
        }

        public GetApiPriceResponseBodyPricePriceSummary setModules(java.util.List<GetApiPriceResponseBodyPricePriceSummaryModules> modules) {
            this.modules = modules;
            return this;
        }
        public java.util.List<GetApiPriceResponseBodyPricePriceSummaryModules> getModules() {
            return this.modules;
        }

        public GetApiPriceResponseBodyPricePriceSummary setOriginalPrice(Float originalPrice) {
            this.originalPrice = originalPrice;
            return this;
        }
        public Float getOriginalPrice() {
            return this.originalPrice;
        }

        public GetApiPriceResponseBodyPricePriceSummary setPricingUnit(String pricingUnit) {
            this.pricingUnit = pricingUnit;
            return this;
        }
        public String getPricingUnit() {
            return this.pricingUnit;
        }

        public GetApiPriceResponseBodyPricePriceSummary setQuantity(Float quantity) {
            this.quantity = quantity;
            return this;
        }
        public Float getQuantity() {
            return this.quantity;
        }

        public GetApiPriceResponseBodyPricePriceSummary setTradePrice(Float tradePrice) {
            this.tradePrice = tradePrice;
            return this;
        }
        public Float getTradePrice() {
            return this.tradePrice;
        }

        public GetApiPriceResponseBodyPricePriceSummary setUsageCharges(java.util.List<GetApiPriceResponseBodyPricePriceSummaryUsageCharges> usageCharges) {
            this.usageCharges = usageCharges;
            return this;
        }
        public java.util.List<GetApiPriceResponseBodyPricePriceSummaryUsageCharges> getUsageCharges() {
            return this.usageCharges;
        }

    }

    public static class GetApiPriceResponseBodyPriceUsageCharges extends TeaModel {
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

        public static GetApiPriceResponseBodyPriceUsageCharges build(java.util.Map<String, ?> map) throws Exception {
            GetApiPriceResponseBodyPriceUsageCharges self = new GetApiPriceResponseBodyPriceUsageCharges();
            return TeaModel.build(map, self);
        }

        public GetApiPriceResponseBodyPriceUsageCharges setAssumedQuantity(Float assumedQuantity) {
            this.assumedQuantity = assumedQuantity;
            return this;
        }
        public Float getAssumedQuantity() {
            return this.assumedQuantity;
        }

        public GetApiPriceResponseBodyPriceUsageCharges setAssumedQuantityCost(Float assumedQuantityCost) {
            this.assumedQuantityCost = assumedQuantityCost;
            return this;
        }
        public Float getAssumedQuantityCost() {
            return this.assumedQuantityCost;
        }

        public GetApiPriceResponseBodyPriceUsageCharges setModuleCode(String moduleCode) {
            this.moduleCode = moduleCode;
            return this;
        }
        public String getModuleCode() {
            return this.moduleCode;
        }

        public GetApiPriceResponseBodyPriceUsageCharges setOriginalPricePerUnit(Float originalPricePerUnit) {
            this.originalPricePerUnit = originalPricePerUnit;
            return this;
        }
        public Float getOriginalPricePerUnit() {
            return this.originalPricePerUnit;
        }

        public GetApiPriceResponseBodyPriceUsageCharges setPricePerUnit(Float pricePerUnit) {
            this.pricePerUnit = pricePerUnit;
            return this;
        }
        public Float getPricePerUnit() {
            return this.pricePerUnit;
        }

        public GetApiPriceResponseBodyPriceUsageCharges setUnit(String unit) {
            this.unit = unit;
            return this;
        }
        public String getUnit() {
            return this.unit;
        }

    }

    public static class GetApiPriceResponseBodyPrice extends TeaModel {
        /**
         * <p>The common billing dimension for fixed fees, including totalAmount, originalAmount, and discountAmount. This is a canonical field, such as \&quot;Hour\&quot; or \&quot;1 Month\&quot;, derived from the pricingUnit declared in the mapping. It is empty if not declared. This field describes only the dimension for fixed fees. The pay-as-you-go billing method components each have their own unit (see usageCharges[].unit).</p>
         */
        @NameInMap("billingUnit")
        public String billingUnit;

        @NameInMap("calculatedAmount")
        public Float calculatedAmount;

        /**
         * <p>The billing composition. This is a canonical field. Valid values: recurring_only (all time-based fees), usage_only (all usage-based fees, where a totalAmount of 0 indicates no fixed fees rather than free of charge, and actual costs depend on the unit price and actual usage in usageCharges), or mixed (both, which should be displayed separately as \&quot;X CNY/hour + Y CNY/GB\&quot;). This allows the caller to choose the display text without iterating through modules to determine the composition.</p>
         */
        @NameInMap("chargeComposition")
        public String chargeComposition;

        /**
         * <p>The details of each pricing call in composite or delta mode. The key is the priceCall ID, such as prepaid, postpaid, or a custom ID. This field is empty in single mode. The calculatedAmount is the aggregated result of each component based on the priceCalculation expression. The components field exposes the line items so that the caller can view the composition, such as instance fees versus storage fees.</p>
         */
        @NameInMap("components")
        public java.util.Map<String, PriceComponentsValue> components;

        @NameInMap("currency")
        public String currency;

        /**
         * <p>The total discount amount for fixed fees. This is a canonical field calculated as originalAmount - totalAmount. It includes only discounts for fixed fees and excludes the pay-as-you-go billing method. The value is 0 when there is no discount and empty when the original price is missing.</p>
         */
        @NameInMap("discountAmount")
        public Float discountAmount;

        /**
         * <p>The error code when upstream pricing fails, such as InvalidParameter or COMMODITY.INVALID_COMPONENT. This field is empty when success is true.</p>
         */
        @NameInMap("errorCode")
        public String errorCode;

        /**
         * <p>The error description when upstream pricing fails. This facilitates self-troubleshooting of specific parameter issues by the caller. This field is empty when success is true.</p>
         */
        @NameInMap("errorMessage")
        public String errorMessage;

        /**
         * <p>The total original price before discounts for fixed fees. This is a canonical field with the same scope as totalAmount. It includes only fixed fees and excludes the pay-as-you-go billing method. Refer to usageCharges[].originalPricePerUnit for the pre-discount unit price of the pay-as-you-go billing method. The difference between this value and totalAmount is the total discount for this inquiry. This field is empty when the upstream does not provide original price information.</p>
         */
        @NameInMap("originalAmount")
        public Float originalAmount;

        @NameInMap("priceSummary")
        public GetApiPriceResponseBodyPricePriceSummary priceSummary;

        @NameInMap("pricingMode")
        public String pricingMode;

        @NameInMap("success")
        public Boolean success;

        /**
         * <p>The periodic payable amount for fixed fees in this pricing inquiry (canonical field). For the unit of measurement, see billingUnit. <strong>This field includes only fixed fees</strong>. Usage-based charges (such as traffic in CNY/GB or CUs in CNY/CU) have different units of measurement and cannot be added to this field. For the unit prices of usage-based charges, see usageCharges. To check whether both types of charges exist, see chargeComposition. In single mode, this value is derived from priceSummary.effectiveModuleSum (falling back to tradePrice if missing). In composite or delta mode, this value is derived from calculatedAmount. This field always has a value when success is true.</p>
         */
        @NameInMap("totalAmount")
        public Float totalAmount;

        /**
         * <p>The request ID of the upstream pricing API (such as the RequestId of BSS GetSubscriptionPrice). This field is populated regardless of whether the request succeeds or fails, and is used for audit reconciliation and upstream log tracing.</p>
         */
        @NameInMap("upstreamRequestId")
        public String upstreamRequestId;

        /**
         * <p>The list of unit prices for usage-based billing modules (canonical field). Modules billed by actual usage, such as traffic and NAT CUs, have different units of measurement (such as CNY/GB or CNY/CU) from billingUnit and are not included in totalAmount. This field provides the unit price for each item. In single mode, the values are derived from priceSummary. In composite or delta mode, the values are concatenated from each component in the order of priceCall. This field is empty when the mapping contains no usage-based modules.</p>
         */
        @NameInMap("usageCharges")
        public java.util.List<GetApiPriceResponseBodyPriceUsageCharges> usageCharges;

        public static GetApiPriceResponseBodyPrice build(java.util.Map<String, ?> map) throws Exception {
            GetApiPriceResponseBodyPrice self = new GetApiPriceResponseBodyPrice();
            return TeaModel.build(map, self);
        }

        public GetApiPriceResponseBodyPrice setBillingUnit(String billingUnit) {
            this.billingUnit = billingUnit;
            return this;
        }
        public String getBillingUnit() {
            return this.billingUnit;
        }

        public GetApiPriceResponseBodyPrice setCalculatedAmount(Float calculatedAmount) {
            this.calculatedAmount = calculatedAmount;
            return this;
        }
        public Float getCalculatedAmount() {
            return this.calculatedAmount;
        }

        public GetApiPriceResponseBodyPrice setChargeComposition(String chargeComposition) {
            this.chargeComposition = chargeComposition;
            return this;
        }
        public String getChargeComposition() {
            return this.chargeComposition;
        }

        public GetApiPriceResponseBodyPrice setComponents(java.util.Map<String, PriceComponentsValue> components) {
            this.components = components;
            return this;
        }
        public java.util.Map<String, PriceComponentsValue> getComponents() {
            return this.components;
        }

        public GetApiPriceResponseBodyPrice setCurrency(String currency) {
            this.currency = currency;
            return this;
        }
        public String getCurrency() {
            return this.currency;
        }

        public GetApiPriceResponseBodyPrice setDiscountAmount(Float discountAmount) {
            this.discountAmount = discountAmount;
            return this;
        }
        public Float getDiscountAmount() {
            return this.discountAmount;
        }

        public GetApiPriceResponseBodyPrice setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public GetApiPriceResponseBodyPrice setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public GetApiPriceResponseBodyPrice setOriginalAmount(Float originalAmount) {
            this.originalAmount = originalAmount;
            return this;
        }
        public Float getOriginalAmount() {
            return this.originalAmount;
        }

        public GetApiPriceResponseBodyPrice setPriceSummary(GetApiPriceResponseBodyPricePriceSummary priceSummary) {
            this.priceSummary = priceSummary;
            return this;
        }
        public GetApiPriceResponseBodyPricePriceSummary getPriceSummary() {
            return this.priceSummary;
        }

        public GetApiPriceResponseBodyPrice setPricingMode(String pricingMode) {
            this.pricingMode = pricingMode;
            return this;
        }
        public String getPricingMode() {
            return this.pricingMode;
        }

        public GetApiPriceResponseBodyPrice setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public GetApiPriceResponseBodyPrice setTotalAmount(Float totalAmount) {
            this.totalAmount = totalAmount;
            return this;
        }
        public Float getTotalAmount() {
            return this.totalAmount;
        }

        public GetApiPriceResponseBodyPrice setUpstreamRequestId(String upstreamRequestId) {
            this.upstreamRequestId = upstreamRequestId;
            return this;
        }
        public String getUpstreamRequestId() {
            return this.upstreamRequestId;
        }

        public GetApiPriceResponseBodyPrice setUsageCharges(java.util.List<GetApiPriceResponseBodyPriceUsageCharges> usageCharges) {
            this.usageCharges = usageCharges;
            return this;
        }
        public java.util.List<GetApiPriceResponseBodyPriceUsageCharges> getUsageCharges() {
            return this.usageCharges;
        }

    }

}
