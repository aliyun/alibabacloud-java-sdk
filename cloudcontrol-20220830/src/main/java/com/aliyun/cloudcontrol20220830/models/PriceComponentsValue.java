// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudcontrol20220830.models;

import com.aliyun.tea.*;

public class PriceComponentsValue extends TeaModel {
    @NameInMap("currency")
    public String currency;

    @NameInMap("tradePrice")
    public Float tradePrice;

    @NameInMap("originalPrice")
    public Float originalPrice;

    @NameInMap("moduleSum")
    public Float moduleSum;

    @NameInMap("effectiveModuleSum")
    public Float effectiveModuleSum;

    @NameInMap("quantity")
    public Float quantity;

    @NameInMap("pricingUnit")
    public String pricingUnit;

    @NameInMap("modules")
    public java.util.List<PriceComponentsValueModules> modules;

    @NameInMap("usageCharges")
    public java.util.List<PriceComponentsValueUsageCharges> usageCharges;

    @NameInMap("chargeComposition")
    public String chargeComposition;

    public static PriceComponentsValue build(java.util.Map<String, ?> map) throws Exception {
        PriceComponentsValue self = new PriceComponentsValue();
        return TeaModel.build(map, self);
    }

    public PriceComponentsValue setCurrency(String currency) {
        this.currency = currency;
        return this;
    }
    public String getCurrency() {
        return this.currency;
    }

    public PriceComponentsValue setTradePrice(Float tradePrice) {
        this.tradePrice = tradePrice;
        return this;
    }
    public Float getTradePrice() {
        return this.tradePrice;
    }

    public PriceComponentsValue setOriginalPrice(Float originalPrice) {
        this.originalPrice = originalPrice;
        return this;
    }
    public Float getOriginalPrice() {
        return this.originalPrice;
    }

    public PriceComponentsValue setModuleSum(Float moduleSum) {
        this.moduleSum = moduleSum;
        return this;
    }
    public Float getModuleSum() {
        return this.moduleSum;
    }

    public PriceComponentsValue setEffectiveModuleSum(Float effectiveModuleSum) {
        this.effectiveModuleSum = effectiveModuleSum;
        return this;
    }
    public Float getEffectiveModuleSum() {
        return this.effectiveModuleSum;
    }

    public PriceComponentsValue setQuantity(Float quantity) {
        this.quantity = quantity;
        return this;
    }
    public Float getQuantity() {
        return this.quantity;
    }

    public PriceComponentsValue setPricingUnit(String pricingUnit) {
        this.pricingUnit = pricingUnit;
        return this;
    }
    public String getPricingUnit() {
        return this.pricingUnit;
    }

    public PriceComponentsValue setModules(java.util.List<PriceComponentsValueModules> modules) {
        this.modules = modules;
        return this;
    }
    public java.util.List<PriceComponentsValueModules> getModules() {
        return this.modules;
    }

    public PriceComponentsValue setUsageCharges(java.util.List<PriceComponentsValueUsageCharges> usageCharges) {
        this.usageCharges = usageCharges;
        return this;
    }
    public java.util.List<PriceComponentsValueUsageCharges> getUsageCharges() {
        return this.usageCharges;
    }

    public PriceComponentsValue setChargeComposition(String chargeComposition) {
        this.chargeComposition = chargeComposition;
        return this;
    }
    public String getChargeComposition() {
        return this.chargeComposition;
    }

    public static class PriceComponentsValueModules extends TeaModel {
        @NameInMap("moduleCode")
        public String moduleCode;

        @NameInMap("costAfterDiscount")
        public Float costAfterDiscount;

        @NameInMap("originalCost")
        public Float originalCost;

        @NameInMap("invoiceDiscount")
        public Float invoiceDiscount;

        @NameInMap("unitPrice")
        public Float unitPrice;

        @NameInMap("billingMode")
        public String billingMode;

        @NameInMap("usageUnit")
        public String usageUnit;

        @NameInMap("quantityUsedForQuote")
        public Float quantityUsedForQuote;

        public static PriceComponentsValueModules build(java.util.Map<String, ?> map) throws Exception {
            PriceComponentsValueModules self = new PriceComponentsValueModules();
            return TeaModel.build(map, self);
        }

        public PriceComponentsValueModules setModuleCode(String moduleCode) {
            this.moduleCode = moduleCode;
            return this;
        }
        public String getModuleCode() {
            return this.moduleCode;
        }

        public PriceComponentsValueModules setCostAfterDiscount(Float costAfterDiscount) {
            this.costAfterDiscount = costAfterDiscount;
            return this;
        }
        public Float getCostAfterDiscount() {
            return this.costAfterDiscount;
        }

        public PriceComponentsValueModules setOriginalCost(Float originalCost) {
            this.originalCost = originalCost;
            return this;
        }
        public Float getOriginalCost() {
            return this.originalCost;
        }

        public PriceComponentsValueModules setInvoiceDiscount(Float invoiceDiscount) {
            this.invoiceDiscount = invoiceDiscount;
            return this;
        }
        public Float getInvoiceDiscount() {
            return this.invoiceDiscount;
        }

        public PriceComponentsValueModules setUnitPrice(Float unitPrice) {
            this.unitPrice = unitPrice;
            return this;
        }
        public Float getUnitPrice() {
            return this.unitPrice;
        }

        public PriceComponentsValueModules setBillingMode(String billingMode) {
            this.billingMode = billingMode;
            return this;
        }
        public String getBillingMode() {
            return this.billingMode;
        }

        public PriceComponentsValueModules setUsageUnit(String usageUnit) {
            this.usageUnit = usageUnit;
            return this;
        }
        public String getUsageUnit() {
            return this.usageUnit;
        }

        public PriceComponentsValueModules setQuantityUsedForQuote(Float quantityUsedForQuote) {
            this.quantityUsedForQuote = quantityUsedForQuote;
            return this;
        }
        public Float getQuantityUsedForQuote() {
            return this.quantityUsedForQuote;
        }

    }

    public static class PriceComponentsValueUsageCharges extends TeaModel {
        @NameInMap("moduleCode")
        public String moduleCode;

        @NameInMap("unit")
        public String unit;

        @NameInMap("pricePerUnit")
        public Float pricePerUnit;

        @NameInMap("originalPricePerUnit")
        public Float originalPricePerUnit;

        @NameInMap("assumedQuantity")
        public Float assumedQuantity;

        @NameInMap("assumedQuantityCost")
        public Float assumedQuantityCost;

        public static PriceComponentsValueUsageCharges build(java.util.Map<String, ?> map) throws Exception {
            PriceComponentsValueUsageCharges self = new PriceComponentsValueUsageCharges();
            return TeaModel.build(map, self);
        }

        public PriceComponentsValueUsageCharges setModuleCode(String moduleCode) {
            this.moduleCode = moduleCode;
            return this;
        }
        public String getModuleCode() {
            return this.moduleCode;
        }

        public PriceComponentsValueUsageCharges setUnit(String unit) {
            this.unit = unit;
            return this;
        }
        public String getUnit() {
            return this.unit;
        }

        public PriceComponentsValueUsageCharges setPricePerUnit(Float pricePerUnit) {
            this.pricePerUnit = pricePerUnit;
            return this;
        }
        public Float getPricePerUnit() {
            return this.pricePerUnit;
        }

        public PriceComponentsValueUsageCharges setOriginalPricePerUnit(Float originalPricePerUnit) {
            this.originalPricePerUnit = originalPricePerUnit;
            return this;
        }
        public Float getOriginalPricePerUnit() {
            return this.originalPricePerUnit;
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

    }

}
