// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class DescribeCreditPackagePriceResponseBody extends TeaModel {
    /**
     * <p>The price.</p>
     */
    @NameInMap("Price")
    public DescribeCreditPackagePriceResponseBodyPrice price;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>6C8439B9-7DBF-57F4-92AE-55A9B9D3****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The promotion rules.</p>
     */
    @NameInMap("Rules")
    public java.util.List<DescribeCreditPackagePriceResponseBodyRules> rules;

    public static DescribeCreditPackagePriceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCreditPackagePriceResponseBody self = new DescribeCreditPackagePriceResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCreditPackagePriceResponseBody setPrice(DescribeCreditPackagePriceResponseBodyPrice price) {
        this.price = price;
        return this;
    }
    public DescribeCreditPackagePriceResponseBodyPrice getPrice() {
        return this.price;
    }

    public DescribeCreditPackagePriceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCreditPackagePriceResponseBody setRules(java.util.List<DescribeCreditPackagePriceResponseBodyRules> rules) {
        this.rules = rules;
        return this;
    }
    public java.util.List<DescribeCreditPackagePriceResponseBodyRules> getRules() {
        return this.rules;
    }

    public static class DescribeCreditPackagePriceResponseBodyPricePriceDetailModulePrice extends TeaModel {
        /**
         * <p>The discounted price.</p>
         * 
         * <strong>example:</strong>
         * <p>800</p>
         */
        @NameInMap("DiscountPrice")
        public String discountPrice;

        /**
         * <p>The name of the billing module.</p>
         * 
         * <strong>example:</strong>
         * <p>1000 credits</p>
         */
        @NameInMap("ModuleName")
        public String moduleName;

        /**
         * <p>The original price.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("OriginalPrice")
        public String originalPrice;

        /**
         * <p>The transaction price.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("TradePrice")
        public String tradePrice;

        public static DescribeCreditPackagePriceResponseBodyPricePriceDetailModulePrice build(java.util.Map<String, ?> map) throws Exception {
            DescribeCreditPackagePriceResponseBodyPricePriceDetailModulePrice self = new DescribeCreditPackagePriceResponseBodyPricePriceDetailModulePrice();
            return TeaModel.build(map, self);
        }

        public DescribeCreditPackagePriceResponseBodyPricePriceDetailModulePrice setDiscountPrice(String discountPrice) {
            this.discountPrice = discountPrice;
            return this;
        }
        public String getDiscountPrice() {
            return this.discountPrice;
        }

        public DescribeCreditPackagePriceResponseBodyPricePriceDetailModulePrice setModuleName(String moduleName) {
            this.moduleName = moduleName;
            return this;
        }
        public String getModuleName() {
            return this.moduleName;
        }

        public DescribeCreditPackagePriceResponseBodyPricePriceDetailModulePrice setOriginalPrice(String originalPrice) {
            this.originalPrice = originalPrice;
            return this;
        }
        public String getOriginalPrice() {
            return this.originalPrice;
        }

        public DescribeCreditPackagePriceResponseBodyPricePriceDetailModulePrice setTradePrice(String tradePrice) {
            this.tradePrice = tradePrice;
            return this;
        }
        public String getTradePrice() {
            return this.tradePrice;
        }

    }

    public static class DescribeCreditPackagePriceResponseBodyPricePriceDetail extends TeaModel {
        /**
         * <p>The discounted price.</p>
         * 
         * <strong>example:</strong>
         * <p>800</p>
         */
        @NameInMap("DiscountPrice")
        public Float discountPrice;

        /**
         * <p>The prices of the modules.</p>
         */
        @NameInMap("ModulePrice")
        public java.util.List<DescribeCreditPackagePriceResponseBodyPricePriceDetailModulePrice> modulePrice;

        /**
         * <p>The original price.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("OriginalPrice")
        public Float originalPrice;

        /**
         * <p>The resource type.</p>
         * 
         * <strong>example:</strong>
         * <p>CloudPhoneAIPackage</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        /**
         * <p>The transaction price.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("TradePrice")
        public Float tradePrice;

        public static DescribeCreditPackagePriceResponseBodyPricePriceDetail build(java.util.Map<String, ?> map) throws Exception {
            DescribeCreditPackagePriceResponseBodyPricePriceDetail self = new DescribeCreditPackagePriceResponseBodyPricePriceDetail();
            return TeaModel.build(map, self);
        }

        public DescribeCreditPackagePriceResponseBodyPricePriceDetail setDiscountPrice(Float discountPrice) {
            this.discountPrice = discountPrice;
            return this;
        }
        public Float getDiscountPrice() {
            return this.discountPrice;
        }

        public DescribeCreditPackagePriceResponseBodyPricePriceDetail setModulePrice(java.util.List<DescribeCreditPackagePriceResponseBodyPricePriceDetailModulePrice> modulePrice) {
            this.modulePrice = modulePrice;
            return this;
        }
        public java.util.List<DescribeCreditPackagePriceResponseBodyPricePriceDetailModulePrice> getModulePrice() {
            return this.modulePrice;
        }

        public DescribeCreditPackagePriceResponseBodyPricePriceDetail setOriginalPrice(Float originalPrice) {
            this.originalPrice = originalPrice;
            return this;
        }
        public Float getOriginalPrice() {
            return this.originalPrice;
        }

        public DescribeCreditPackagePriceResponseBodyPricePriceDetail setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public DescribeCreditPackagePriceResponseBodyPricePriceDetail setTradePrice(Float tradePrice) {
            this.tradePrice = tradePrice;
            return this;
        }
        public Float getTradePrice() {
            return this.tradePrice;
        }

    }

    public static class DescribeCreditPackagePriceResponseBodyPricePromotions extends TeaModel {
        /**
         * <p>The coupon code.</p>
         * 
         * <strong>example:</strong>
         * <p>daily</p>
         */
        @NameInMap("OptionCode")
        public String optionCode;

        /**
         * <p>The coupon description.</p>
         * 
         * <strong>example:</strong>
         * <p>Regular discount</p>
         */
        @NameInMap("PromotionDesc")
        public String promotionDesc;

        /**
         * <p>The ID of the promotion.</p>
         * 
         * <strong>example:</strong>
         * <p>50003308011****</p>
         */
        @NameInMap("PromotionId")
        public String promotionId;

        /**
         * <p>The coupon name.</p>
         * 
         * <strong>example:</strong>
         * <p>Regular discount</p>
         */
        @NameInMap("PromotionName")
        public String promotionName;

        /**
         * <p>Indicates whether the coupon is selected.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Selected")
        public Boolean selected;

        public static DescribeCreditPackagePriceResponseBodyPricePromotions build(java.util.Map<String, ?> map) throws Exception {
            DescribeCreditPackagePriceResponseBodyPricePromotions self = new DescribeCreditPackagePriceResponseBodyPricePromotions();
            return TeaModel.build(map, self);
        }

        public DescribeCreditPackagePriceResponseBodyPricePromotions setOptionCode(String optionCode) {
            this.optionCode = optionCode;
            return this;
        }
        public String getOptionCode() {
            return this.optionCode;
        }

        public DescribeCreditPackagePriceResponseBodyPricePromotions setPromotionDesc(String promotionDesc) {
            this.promotionDesc = promotionDesc;
            return this;
        }
        public String getPromotionDesc() {
            return this.promotionDesc;
        }

        public DescribeCreditPackagePriceResponseBodyPricePromotions setPromotionId(String promotionId) {
            this.promotionId = promotionId;
            return this;
        }
        public String getPromotionId() {
            return this.promotionId;
        }

        public DescribeCreditPackagePriceResponseBodyPricePromotions setPromotionName(String promotionName) {
            this.promotionName = promotionName;
            return this;
        }
        public String getPromotionName() {
            return this.promotionName;
        }

        public DescribeCreditPackagePriceResponseBodyPricePromotions setSelected(Boolean selected) {
            this.selected = selected;
            return this;
        }
        public Boolean getSelected() {
            return this.selected;
        }

    }

    public static class DescribeCreditPackagePriceResponseBodyPrice extends TeaModel {
        /**
         * <p>The currency. Valid values:</p>
         * <ul>
         * <li>CNY: Chinese yuan</li>
         * <li>USD: US dollar</li>
         * <li>JPY: Japanese yen</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CNY</p>
         */
        @NameInMap("Currency")
        public String currency;

        /**
         * <p>The discounted price.</p>
         * 
         * <strong>example:</strong>
         * <p>800</p>
         */
        @NameInMap("DiscountPrice")
        public Float discountPrice;

        /**
         * <p>The original price.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("OriginalPrice")
        public Float originalPrice;

        /**
         * <p>The price details.</p>
         */
        @NameInMap("PriceDetail")
        public java.util.List<DescribeCreditPackagePriceResponseBodyPricePriceDetail> priceDetail;

        /**
         * <p>The promotion information.</p>
         */
        @NameInMap("Promotions")
        public java.util.List<DescribeCreditPackagePriceResponseBodyPricePromotions> promotions;

        /**
         * <p>The transaction price.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("TradePrice")
        public Float tradePrice;

        public static DescribeCreditPackagePriceResponseBodyPrice build(java.util.Map<String, ?> map) throws Exception {
            DescribeCreditPackagePriceResponseBodyPrice self = new DescribeCreditPackagePriceResponseBodyPrice();
            return TeaModel.build(map, self);
        }

        public DescribeCreditPackagePriceResponseBodyPrice setCurrency(String currency) {
            this.currency = currency;
            return this;
        }
        public String getCurrency() {
            return this.currency;
        }

        public DescribeCreditPackagePriceResponseBodyPrice setDiscountPrice(Float discountPrice) {
            this.discountPrice = discountPrice;
            return this;
        }
        public Float getDiscountPrice() {
            return this.discountPrice;
        }

        public DescribeCreditPackagePriceResponseBodyPrice setOriginalPrice(Float originalPrice) {
            this.originalPrice = originalPrice;
            return this;
        }
        public Float getOriginalPrice() {
            return this.originalPrice;
        }

        public DescribeCreditPackagePriceResponseBodyPrice setPriceDetail(java.util.List<DescribeCreditPackagePriceResponseBodyPricePriceDetail> priceDetail) {
            this.priceDetail = priceDetail;
            return this;
        }
        public java.util.List<DescribeCreditPackagePriceResponseBodyPricePriceDetail> getPriceDetail() {
            return this.priceDetail;
        }

        public DescribeCreditPackagePriceResponseBodyPrice setPromotions(java.util.List<DescribeCreditPackagePriceResponseBodyPricePromotions> promotions) {
            this.promotions = promotions;
            return this;
        }
        public java.util.List<DescribeCreditPackagePriceResponseBodyPricePromotions> getPromotions() {
            return this.promotions;
        }

        public DescribeCreditPackagePriceResponseBodyPrice setTradePrice(Float tradePrice) {
            this.tradePrice = tradePrice;
            return this;
        }
        public Float getTradePrice() {
            return this.tradePrice;
        }

    }

    public static class DescribeCreditPackagePriceResponseBodyRules extends TeaModel {
        /**
         * <p>The promotion description.</p>
         * 
         * <strong>example:</strong>
         * <p>Regular discount</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The rule ID.</p>
         * 
         * <strong>example:</strong>
         * <p>3s2f42fis7pmb9****</p>
         */
        @NameInMap("RuleId")
        public String ruleId;

        public static DescribeCreditPackagePriceResponseBodyRules build(java.util.Map<String, ?> map) throws Exception {
            DescribeCreditPackagePriceResponseBodyRules self = new DescribeCreditPackagePriceResponseBodyRules();
            return TeaModel.build(map, self);
        }

        public DescribeCreditPackagePriceResponseBodyRules setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeCreditPackagePriceResponseBodyRules setRuleId(String ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public String getRuleId() {
            return this.ruleId;
        }

    }

}
