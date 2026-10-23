// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class DescribeMobileAgentPackagePriceResponseBody extends TeaModel {
    @NameInMap("Price")
    public DescribeMobileAgentPackagePriceResponseBodyPrice price;

    /**
     * <strong>example:</strong>
     * <p>1CBAFFAB-B697-4049-A9B1-67E1FC******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Rules")
    public java.util.List<DescribeMobileAgentPackagePriceResponseBodyRules> rules;

    public static DescribeMobileAgentPackagePriceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeMobileAgentPackagePriceResponseBody self = new DescribeMobileAgentPackagePriceResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeMobileAgentPackagePriceResponseBody setPrice(DescribeMobileAgentPackagePriceResponseBodyPrice price) {
        this.price = price;
        return this;
    }
    public DescribeMobileAgentPackagePriceResponseBodyPrice getPrice() {
        return this.price;
    }

    public DescribeMobileAgentPackagePriceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeMobileAgentPackagePriceResponseBody setRules(java.util.List<DescribeMobileAgentPackagePriceResponseBodyRules> rules) {
        this.rules = rules;
        return this;
    }
    public java.util.List<DescribeMobileAgentPackagePriceResponseBodyRules> getRules() {
        return this.rules;
    }

    public static class DescribeMobileAgentPackagePriceResponseBodyPricePriceDetailModulePrice extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>800</p>
         */
        @NameInMap("DiscountPrice")
        public String discountPrice;

        /**
         * <strong>example:</strong>
         * <p>高级版</p>
         */
        @NameInMap("ModuleName")
        public String moduleName;

        /**
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("OriginalPrice")
        public String originalPrice;

        /**
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("TradePrice")
        public String tradePrice;

        public static DescribeMobileAgentPackagePriceResponseBodyPricePriceDetailModulePrice build(java.util.Map<String, ?> map) throws Exception {
            DescribeMobileAgentPackagePriceResponseBodyPricePriceDetailModulePrice self = new DescribeMobileAgentPackagePriceResponseBodyPricePriceDetailModulePrice();
            return TeaModel.build(map, self);
        }

        public DescribeMobileAgentPackagePriceResponseBodyPricePriceDetailModulePrice setDiscountPrice(String discountPrice) {
            this.discountPrice = discountPrice;
            return this;
        }
        public String getDiscountPrice() {
            return this.discountPrice;
        }

        public DescribeMobileAgentPackagePriceResponseBodyPricePriceDetailModulePrice setModuleName(String moduleName) {
            this.moduleName = moduleName;
            return this;
        }
        public String getModuleName() {
            return this.moduleName;
        }

        public DescribeMobileAgentPackagePriceResponseBodyPricePriceDetailModulePrice setOriginalPrice(String originalPrice) {
            this.originalPrice = originalPrice;
            return this;
        }
        public String getOriginalPrice() {
            return this.originalPrice;
        }

        public DescribeMobileAgentPackagePriceResponseBodyPricePriceDetailModulePrice setTradePrice(String tradePrice) {
            this.tradePrice = tradePrice;
            return this;
        }
        public String getTradePrice() {
            return this.tradePrice;
        }

    }

    public static class DescribeMobileAgentPackagePriceResponseBodyPricePriceDetail extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>800</p>
         */
        @NameInMap("DiscountPrice")
        public Float discountPrice;

        @NameInMap("ModulePrice")
        public java.util.List<DescribeMobileAgentPackagePriceResponseBodyPricePriceDetailModulePrice> modulePrice;

        /**
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("OriginalPrice")
        public Float originalPrice;

        /**
         * <strong>example:</strong>
         * <p>CloudPhoneMobileAgent</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        /**
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("TradePrice")
        public Float tradePrice;

        public static DescribeMobileAgentPackagePriceResponseBodyPricePriceDetail build(java.util.Map<String, ?> map) throws Exception {
            DescribeMobileAgentPackagePriceResponseBodyPricePriceDetail self = new DescribeMobileAgentPackagePriceResponseBodyPricePriceDetail();
            return TeaModel.build(map, self);
        }

        public DescribeMobileAgentPackagePriceResponseBodyPricePriceDetail setDiscountPrice(Float discountPrice) {
            this.discountPrice = discountPrice;
            return this;
        }
        public Float getDiscountPrice() {
            return this.discountPrice;
        }

        public DescribeMobileAgentPackagePriceResponseBodyPricePriceDetail setModulePrice(java.util.List<DescribeMobileAgentPackagePriceResponseBodyPricePriceDetailModulePrice> modulePrice) {
            this.modulePrice = modulePrice;
            return this;
        }
        public java.util.List<DescribeMobileAgentPackagePriceResponseBodyPricePriceDetailModulePrice> getModulePrice() {
            return this.modulePrice;
        }

        public DescribeMobileAgentPackagePriceResponseBodyPricePriceDetail setOriginalPrice(Float originalPrice) {
            this.originalPrice = originalPrice;
            return this;
        }
        public Float getOriginalPrice() {
            return this.originalPrice;
        }

        public DescribeMobileAgentPackagePriceResponseBodyPricePriceDetail setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public DescribeMobileAgentPackagePriceResponseBodyPricePriceDetail setTradePrice(Float tradePrice) {
            this.tradePrice = tradePrice;
            return this;
        }
        public Float getTradePrice() {
            return this.tradePrice;
        }

    }

    public static class DescribeMobileAgentPackagePriceResponseBodyPricePromotions extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>daily</p>
         */
        @NameInMap("OptionCode")
        public String optionCode;

        /**
         * <strong>example:</strong>
         * <p>日常优惠</p>
         */
        @NameInMap("PromotionDesc")
        public String promotionDesc;

        /**
         * <strong>example:</strong>
         * <p>90712091****</p>
         */
        @NameInMap("PromotionId")
        public String promotionId;

        /**
         * <strong>example:</strong>
         * <p>日常优惠</p>
         */
        @NameInMap("PromotionName")
        public String promotionName;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Selected")
        public Boolean selected;

        public static DescribeMobileAgentPackagePriceResponseBodyPricePromotions build(java.util.Map<String, ?> map) throws Exception {
            DescribeMobileAgentPackagePriceResponseBodyPricePromotions self = new DescribeMobileAgentPackagePriceResponseBodyPricePromotions();
            return TeaModel.build(map, self);
        }

        public DescribeMobileAgentPackagePriceResponseBodyPricePromotions setOptionCode(String optionCode) {
            this.optionCode = optionCode;
            return this;
        }
        public String getOptionCode() {
            return this.optionCode;
        }

        public DescribeMobileAgentPackagePriceResponseBodyPricePromotions setPromotionDesc(String promotionDesc) {
            this.promotionDesc = promotionDesc;
            return this;
        }
        public String getPromotionDesc() {
            return this.promotionDesc;
        }

        public DescribeMobileAgentPackagePriceResponseBodyPricePromotions setPromotionId(String promotionId) {
            this.promotionId = promotionId;
            return this;
        }
        public String getPromotionId() {
            return this.promotionId;
        }

        public DescribeMobileAgentPackagePriceResponseBodyPricePromotions setPromotionName(String promotionName) {
            this.promotionName = promotionName;
            return this;
        }
        public String getPromotionName() {
            return this.promotionName;
        }

        public DescribeMobileAgentPackagePriceResponseBodyPricePromotions setSelected(Boolean selected) {
            this.selected = selected;
            return this;
        }
        public Boolean getSelected() {
            return this.selected;
        }

    }

    public static class DescribeMobileAgentPackagePriceResponseBodyPrice extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>CNY</p>
         */
        @NameInMap("Currency")
        public String currency;

        /**
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("DiscountPrice")
        public Float discountPrice;

        /**
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("OriginalPrice")
        public Float originalPrice;

        @NameInMap("PriceDetail")
        public java.util.List<DescribeMobileAgentPackagePriceResponseBodyPricePriceDetail> priceDetail;

        @NameInMap("Promotions")
        public java.util.List<DescribeMobileAgentPackagePriceResponseBodyPricePromotions> promotions;

        /**
         * <strong>example:</strong>
         * <p>800</p>
         */
        @NameInMap("TradePrice")
        public Float tradePrice;

        public static DescribeMobileAgentPackagePriceResponseBodyPrice build(java.util.Map<String, ?> map) throws Exception {
            DescribeMobileAgentPackagePriceResponseBodyPrice self = new DescribeMobileAgentPackagePriceResponseBodyPrice();
            return TeaModel.build(map, self);
        }

        public DescribeMobileAgentPackagePriceResponseBodyPrice setCurrency(String currency) {
            this.currency = currency;
            return this;
        }
        public String getCurrency() {
            return this.currency;
        }

        public DescribeMobileAgentPackagePriceResponseBodyPrice setDiscountPrice(Float discountPrice) {
            this.discountPrice = discountPrice;
            return this;
        }
        public Float getDiscountPrice() {
            return this.discountPrice;
        }

        public DescribeMobileAgentPackagePriceResponseBodyPrice setOriginalPrice(Float originalPrice) {
            this.originalPrice = originalPrice;
            return this;
        }
        public Float getOriginalPrice() {
            return this.originalPrice;
        }

        public DescribeMobileAgentPackagePriceResponseBodyPrice setPriceDetail(java.util.List<DescribeMobileAgentPackagePriceResponseBodyPricePriceDetail> priceDetail) {
            this.priceDetail = priceDetail;
            return this;
        }
        public java.util.List<DescribeMobileAgentPackagePriceResponseBodyPricePriceDetail> getPriceDetail() {
            return this.priceDetail;
        }

        public DescribeMobileAgentPackagePriceResponseBodyPrice setPromotions(java.util.List<DescribeMobileAgentPackagePriceResponseBodyPricePromotions> promotions) {
            this.promotions = promotions;
            return this;
        }
        public java.util.List<DescribeMobileAgentPackagePriceResponseBodyPricePromotions> getPromotions() {
            return this.promotions;
        }

        public DescribeMobileAgentPackagePriceResponseBodyPrice setTradePrice(Float tradePrice) {
            this.tradePrice = tradePrice;
            return this;
        }
        public Float getTradePrice() {
            return this.tradePrice;
        }

    }

    public static class DescribeMobileAgentPackagePriceResponseBodyRules extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>日常优惠</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>f07tkae80jbiy****</p>
         */
        @NameInMap("RuleId")
        public String ruleId;

        public static DescribeMobileAgentPackagePriceResponseBodyRules build(java.util.Map<String, ?> map) throws Exception {
            DescribeMobileAgentPackagePriceResponseBodyRules self = new DescribeMobileAgentPackagePriceResponseBodyRules();
            return TeaModel.build(map, self);
        }

        public DescribeMobileAgentPackagePriceResponseBodyRules setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeMobileAgentPackagePriceResponseBodyRules setRuleId(String ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public String getRuleId() {
            return this.ruleId;
        }

    }

}
