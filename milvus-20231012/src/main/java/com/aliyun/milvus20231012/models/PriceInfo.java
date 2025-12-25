// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.milvus20231012.models;

import com.aliyun.tea.*;

public class PriceInfo extends TeaModel {
    @NameInMap("currency")
    public String currency;

    @NameInMap("discountAmount")
    public String discountAmount;

    @NameInMap("optionalPromotions")
    public java.util.List<PromotionInfo> optionalPromotions;

    @NameInMap("originalAmount")
    public String originalAmount;

    @NameInMap("priceModules")
    public java.util.List<PriceInfoPriceModules> priceModules;

    @NameInMap("rules")
    public java.util.List<PriceInfoRules> rules;

    @NameInMap("taxAmount")
    public String taxAmount;

    @NameInMap("tradeAmount")
    public String tradeAmount;

    public static PriceInfo build(java.util.Map<String, ?> map) throws Exception {
        PriceInfo self = new PriceInfo();
        return TeaModel.build(map, self);
    }

    public PriceInfo setCurrency(String currency) {
        this.currency = currency;
        return this;
    }
    public String getCurrency() {
        return this.currency;
    }

    public PriceInfo setDiscountAmount(String discountAmount) {
        this.discountAmount = discountAmount;
        return this;
    }
    public String getDiscountAmount() {
        return this.discountAmount;
    }

    public PriceInfo setOptionalPromotions(java.util.List<PromotionInfo> optionalPromotions) {
        this.optionalPromotions = optionalPromotions;
        return this;
    }
    public java.util.List<PromotionInfo> getOptionalPromotions() {
        return this.optionalPromotions;
    }

    public PriceInfo setOriginalAmount(String originalAmount) {
        this.originalAmount = originalAmount;
        return this;
    }
    public String getOriginalAmount() {
        return this.originalAmount;
    }

    public PriceInfo setPriceModules(java.util.List<PriceInfoPriceModules> priceModules) {
        this.priceModules = priceModules;
        return this;
    }
    public java.util.List<PriceInfoPriceModules> getPriceModules() {
        return this.priceModules;
    }

    public PriceInfo setRules(java.util.List<PriceInfoRules> rules) {
        this.rules = rules;
        return this;
    }
    public java.util.List<PriceInfoRules> getRules() {
        return this.rules;
    }

    public PriceInfo setTaxAmount(String taxAmount) {
        this.taxAmount = taxAmount;
        return this;
    }
    public String getTaxAmount() {
        return this.taxAmount;
    }

    public PriceInfo setTradeAmount(String tradeAmount) {
        this.tradeAmount = tradeAmount;
        return this;
    }
    public String getTradeAmount() {
        return this.tradeAmount;
    }

    public static class PriceInfoPriceModules extends TeaModel {
        @NameInMap("originalAmount")
        public String originalAmount;

        @NameInMap("type")
        public String type;

        public static PriceInfoPriceModules build(java.util.Map<String, ?> map) throws Exception {
            PriceInfoPriceModules self = new PriceInfoPriceModules();
            return TeaModel.build(map, self);
        }

        public PriceInfoPriceModules setOriginalAmount(String originalAmount) {
            this.originalAmount = originalAmount;
            return this;
        }
        public String getOriginalAmount() {
            return this.originalAmount;
        }

        public PriceInfoPriceModules setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class PriceInfoRules extends TeaModel {
        @NameInMap("amount")
        public String amount;

        @NameInMap("name")
        public String name;

        @NameInMap("ruleId")
        public String ruleId;

        public static PriceInfoRules build(java.util.Map<String, ?> map) throws Exception {
            PriceInfoRules self = new PriceInfoRules();
            return TeaModel.build(map, self);
        }

        public PriceInfoRules setAmount(String amount) {
            this.amount = amount;
            return this;
        }
        public String getAmount() {
            return this.amount;
        }

        public PriceInfoRules setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public PriceInfoRules setRuleId(String ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public String getRuleId() {
            return this.ruleId;
        }

    }

}
