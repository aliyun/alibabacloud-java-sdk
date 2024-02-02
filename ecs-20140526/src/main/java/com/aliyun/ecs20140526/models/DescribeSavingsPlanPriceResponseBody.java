// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeSavingsPlanPriceResponseBody extends TeaModel {
    @NameInMap("PriceInfo")
    public DescribeSavingsPlanPriceResponseBodyPriceInfo priceInfo;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeSavingsPlanPriceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSavingsPlanPriceResponseBody self = new DescribeSavingsPlanPriceResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSavingsPlanPriceResponseBody setPriceInfo(DescribeSavingsPlanPriceResponseBodyPriceInfo priceInfo) {
        this.priceInfo = priceInfo;
        return this;
    }
    public DescribeSavingsPlanPriceResponseBodyPriceInfo getPriceInfo() {
        return this.priceInfo;
    }

    public DescribeSavingsPlanPriceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeSavingsPlanPriceResponseBodyPriceInfoPrice extends TeaModel {
        @NameInMap("Currency")
        public String currency;

        @NameInMap("DiscountPrice")
        public Float discountPrice;

        @NameInMap("OriginalPrice")
        public Float originalPrice;

        @NameInMap("TradePrice")
        public Float tradePrice;

        public static DescribeSavingsPlanPriceResponseBodyPriceInfoPrice build(java.util.Map<String, ?> map) throws Exception {
            DescribeSavingsPlanPriceResponseBodyPriceInfoPrice self = new DescribeSavingsPlanPriceResponseBodyPriceInfoPrice();
            return TeaModel.build(map, self);
        }

        public DescribeSavingsPlanPriceResponseBodyPriceInfoPrice setCurrency(String currency) {
            this.currency = currency;
            return this;
        }
        public String getCurrency() {
            return this.currency;
        }

        public DescribeSavingsPlanPriceResponseBodyPriceInfoPrice setDiscountPrice(Float discountPrice) {
            this.discountPrice = discountPrice;
            return this;
        }
        public Float getDiscountPrice() {
            return this.discountPrice;
        }

        public DescribeSavingsPlanPriceResponseBodyPriceInfoPrice setOriginalPrice(Float originalPrice) {
            this.originalPrice = originalPrice;
            return this;
        }
        public Float getOriginalPrice() {
            return this.originalPrice;
        }

        public DescribeSavingsPlanPriceResponseBodyPriceInfoPrice setTradePrice(Float tradePrice) {
            this.tradePrice = tradePrice;
            return this;
        }
        public Float getTradePrice() {
            return this.tradePrice;
        }

    }

    public static class DescribeSavingsPlanPriceResponseBodyPriceInfoRules extends TeaModel {
        @NameInMap("Description")
        public String description;

        @NameInMap("RuleId")
        public String ruleId;

        public static DescribeSavingsPlanPriceResponseBodyPriceInfoRules build(java.util.Map<String, ?> map) throws Exception {
            DescribeSavingsPlanPriceResponseBodyPriceInfoRules self = new DescribeSavingsPlanPriceResponseBodyPriceInfoRules();
            return TeaModel.build(map, self);
        }

        public DescribeSavingsPlanPriceResponseBodyPriceInfoRules setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeSavingsPlanPriceResponseBodyPriceInfoRules setRuleId(String ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public String getRuleId() {
            return this.ruleId;
        }

    }

    public static class DescribeSavingsPlanPriceResponseBodyPriceInfo extends TeaModel {
        @NameInMap("Price")
        public DescribeSavingsPlanPriceResponseBodyPriceInfoPrice price;

        @NameInMap("Rules")
        public java.util.List<DescribeSavingsPlanPriceResponseBodyPriceInfoRules> rules;

        public static DescribeSavingsPlanPriceResponseBodyPriceInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeSavingsPlanPriceResponseBodyPriceInfo self = new DescribeSavingsPlanPriceResponseBodyPriceInfo();
            return TeaModel.build(map, self);
        }

        public DescribeSavingsPlanPriceResponseBodyPriceInfo setPrice(DescribeSavingsPlanPriceResponseBodyPriceInfoPrice price) {
            this.price = price;
            return this;
        }
        public DescribeSavingsPlanPriceResponseBodyPriceInfoPrice getPrice() {
            return this.price;
        }

        public DescribeSavingsPlanPriceResponseBodyPriceInfo setRules(java.util.List<DescribeSavingsPlanPriceResponseBodyPriceInfoRules> rules) {
            this.rules = rules;
            return this;
        }
        public java.util.List<DescribeSavingsPlanPriceResponseBodyPriceInfoRules> getRules() {
            return this.rules;
        }

    }

}
