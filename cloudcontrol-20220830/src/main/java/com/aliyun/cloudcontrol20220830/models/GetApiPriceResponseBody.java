// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudcontrol20220830.models;

import com.aliyun.tea.*;

public class GetApiPriceResponseBody extends TeaModel {
    @NameInMap("price")
    public GetApiPriceResponseBodyPrice price;

    /**
     * <p>Id of the request</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static GetApiPriceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetApiPriceResponseBody self = new GetApiPriceResponseBody();
        return TeaModel.build(map, self);
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

    public static class GetApiPriceResponseBodyPricePriceSummaryModules extends TeaModel {
        @NameInMap("billingMode")
        public String billingMode;

        @NameInMap("costAfterDiscount")
        public Float costAfterDiscount;

        @NameInMap("invoiceDiscount")
        public Float invoiceDiscount;

        @NameInMap("moduleCode")
        public String moduleCode;

        @NameInMap("originalCost")
        public Float originalCost;

        @NameInMap("quantityUsedForQuote")
        public Float quantityUsedForQuote;

        @NameInMap("unitPrice")
        public Float unitPrice;

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
        @NameInMap("assumedQuantity")
        public Float assumedQuantity;

        @NameInMap("assumedQuantityCost")
        public Float assumedQuantityCost;

        @NameInMap("moduleCode")
        public String moduleCode;

        @NameInMap("originalPricePerUnit")
        public Float originalPricePerUnit;

        @NameInMap("pricePerUnit")
        public Float pricePerUnit;

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

        @NameInMap("originalPrice")
        public Float originalPrice;

        @NameInMap("pricingUnit")
        public String pricingUnit;

        @NameInMap("quantity")
        public Float quantity;

        @NameInMap("tradePrice")
        public Float tradePrice;

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
        @NameInMap("assumedQuantity")
        public Float assumedQuantity;

        @NameInMap("assumedQuantityCost")
        public Float assumedQuantityCost;

        @NameInMap("moduleCode")
        public String moduleCode;

        @NameInMap("originalPricePerUnit")
        public Float originalPricePerUnit;

        @NameInMap("pricePerUnit")
        public Float pricePerUnit;

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
        @NameInMap("billingUnit")
        public String billingUnit;

        @NameInMap("calculatedAmount")
        public Float calculatedAmount;

        @NameInMap("chargeComposition")
        public String chargeComposition;

        @NameInMap("components")
        public java.util.Map<String, PriceComponentsValue> components;

        @NameInMap("currency")
        public String currency;

        @NameInMap("discountAmount")
        public Float discountAmount;

        @NameInMap("errorCode")
        public String errorCode;

        @NameInMap("errorMessage")
        public String errorMessage;

        @NameInMap("originalAmount")
        public Float originalAmount;

        @NameInMap("priceSummary")
        public GetApiPriceResponseBodyPricePriceSummary priceSummary;

        @NameInMap("pricingMode")
        public String pricingMode;

        @NameInMap("success")
        public Boolean success;

        @NameInMap("totalAmount")
        public Float totalAmount;

        @NameInMap("upstreamRequestId")
        public String upstreamRequestId;

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
