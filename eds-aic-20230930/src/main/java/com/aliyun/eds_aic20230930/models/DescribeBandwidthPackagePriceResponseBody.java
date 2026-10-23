// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class DescribeBandwidthPackagePriceResponseBody extends TeaModel {
    @NameInMap("Price")
    public DescribeBandwidthPackagePriceResponseBodyPrice price;

    /**
     * <strong>example:</strong>
     * <p>6C8439B9-7DBF-57F4-92AE-55A9B9D3****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Rules")
    public java.util.List<DescribeBandwidthPackagePriceResponseBodyRules> rules;

    public static DescribeBandwidthPackagePriceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeBandwidthPackagePriceResponseBody self = new DescribeBandwidthPackagePriceResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeBandwidthPackagePriceResponseBody setPrice(DescribeBandwidthPackagePriceResponseBodyPrice price) {
        this.price = price;
        return this;
    }
    public DescribeBandwidthPackagePriceResponseBodyPrice getPrice() {
        return this.price;
    }

    public DescribeBandwidthPackagePriceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeBandwidthPackagePriceResponseBody setRules(java.util.List<DescribeBandwidthPackagePriceResponseBodyRules> rules) {
        this.rules = rules;
        return this;
    }
    public java.util.List<DescribeBandwidthPackagePriceResponseBodyRules> getRules() {
        return this.rules;
    }

    public static class DescribeBandwidthPackagePriceResponseBodyPricePromotions extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>youhui_quan</p>
         */
        @NameInMap("OptionCode")
        public String optionCode;

        /**
         * <strong>example:</strong>
         * <p>youhui</p>
         */
        @NameInMap("PromotionDesc")
        public String promotionDesc;

        /**
         * <strong>example:</strong>
         * <p>91381816****</p>
         */
        @NameInMap("PromotionId")
        public String promotionId;

        /**
         * <strong>example:</strong>
         * <p>youhui</p>
         */
        @NameInMap("PromotionName")
        public String promotionName;

        /**
         * <strong>example:</strong>
         * <p>ture</p>
         */
        @NameInMap("Selected")
        public Boolean selected;

        public static DescribeBandwidthPackagePriceResponseBodyPricePromotions build(java.util.Map<String, ?> map) throws Exception {
            DescribeBandwidthPackagePriceResponseBodyPricePromotions self = new DescribeBandwidthPackagePriceResponseBodyPricePromotions();
            return TeaModel.build(map, self);
        }

        public DescribeBandwidthPackagePriceResponseBodyPricePromotions setOptionCode(String optionCode) {
            this.optionCode = optionCode;
            return this;
        }
        public String getOptionCode() {
            return this.optionCode;
        }

        public DescribeBandwidthPackagePriceResponseBodyPricePromotions setPromotionDesc(String promotionDesc) {
            this.promotionDesc = promotionDesc;
            return this;
        }
        public String getPromotionDesc() {
            return this.promotionDesc;
        }

        public DescribeBandwidthPackagePriceResponseBodyPricePromotions setPromotionId(String promotionId) {
            this.promotionId = promotionId;
            return this;
        }
        public String getPromotionId() {
            return this.promotionId;
        }

        public DescribeBandwidthPackagePriceResponseBodyPricePromotions setPromotionName(String promotionName) {
            this.promotionName = promotionName;
            return this;
        }
        public String getPromotionName() {
            return this.promotionName;
        }

        public DescribeBandwidthPackagePriceResponseBodyPricePromotions setSelected(Boolean selected) {
            this.selected = selected;
            return this;
        }
        public Boolean getSelected() {
            return this.selected;
        }

    }

    public static class DescribeBandwidthPackagePriceResponseBodyPrice extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>CNY</p>
         */
        @NameInMap("Currency")
        public String currency;

        /**
         * <strong>example:</strong>
         * <p>274.75</p>
         */
        @NameInMap("DiscountPrice")
        public Float discountPrice;

        /**
         * <strong>example:</strong>
         * <p>8800</p>
         */
        @NameInMap("OriginalPrice")
        public Float originalPrice;

        @NameInMap("Promotions")
        public java.util.List<DescribeBandwidthPackagePriceResponseBodyPricePromotions> promotions;

        /**
         * <strong>example:</strong>
         * <p>213.52</p>
         */
        @NameInMap("TradePrice")
        public Float tradePrice;

        public static DescribeBandwidthPackagePriceResponseBodyPrice build(java.util.Map<String, ?> map) throws Exception {
            DescribeBandwidthPackagePriceResponseBodyPrice self = new DescribeBandwidthPackagePriceResponseBodyPrice();
            return TeaModel.build(map, self);
        }

        public DescribeBandwidthPackagePriceResponseBodyPrice setCurrency(String currency) {
            this.currency = currency;
            return this;
        }
        public String getCurrency() {
            return this.currency;
        }

        public DescribeBandwidthPackagePriceResponseBodyPrice setDiscountPrice(Float discountPrice) {
            this.discountPrice = discountPrice;
            return this;
        }
        public Float getDiscountPrice() {
            return this.discountPrice;
        }

        public DescribeBandwidthPackagePriceResponseBodyPrice setOriginalPrice(Float originalPrice) {
            this.originalPrice = originalPrice;
            return this;
        }
        public Float getOriginalPrice() {
            return this.originalPrice;
        }

        public DescribeBandwidthPackagePriceResponseBodyPrice setPromotions(java.util.List<DescribeBandwidthPackagePriceResponseBodyPricePromotions> promotions) {
            this.promotions = promotions;
            return this;
        }
        public java.util.List<DescribeBandwidthPackagePriceResponseBodyPricePromotions> getPromotions() {
            return this.promotions;
        }

        public DescribeBandwidthPackagePriceResponseBodyPrice setTradePrice(Float tradePrice) {
            this.tradePrice = tradePrice;
            return this;
        }
        public Float getTradePrice() {
            return this.tradePrice;
        }

    }

    public static class DescribeBandwidthPackagePriceResponseBodyRules extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>description</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>a7gesyly7o34qy****</p>
         */
        @NameInMap("RuleId")
        public String ruleId;

        public static DescribeBandwidthPackagePriceResponseBodyRules build(java.util.Map<String, ?> map) throws Exception {
            DescribeBandwidthPackagePriceResponseBodyRules self = new DescribeBandwidthPackagePriceResponseBodyRules();
            return TeaModel.build(map, self);
        }

        public DescribeBandwidthPackagePriceResponseBodyRules setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeBandwidthPackagePriceResponseBodyRules setRuleId(String ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public String getRuleId() {
            return this.ruleId;
        }

    }

}
