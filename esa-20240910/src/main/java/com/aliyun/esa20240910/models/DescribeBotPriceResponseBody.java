// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class DescribeBotPriceResponseBody extends TeaModel {
    /**
     * <p>The price information.</p>
     */
    @NameInMap("PriceModel")
    public DescribeBotPriceResponseBodyPriceModel priceModel;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>FCF50EDF-1C2B-51E9-A372-E194D16ED350</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeBotPriceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeBotPriceResponseBody self = new DescribeBotPriceResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeBotPriceResponseBody setPriceModel(DescribeBotPriceResponseBodyPriceModel priceModel) {
        this.priceModel = priceModel;
        return this;
    }
    public DescribeBotPriceResponseBodyPriceModel getPriceModel() {
        return this.priceModel;
    }

    public DescribeBotPriceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeBotPriceResponseBodyPriceModelRuleRuleList extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("RuleDescId")
        public Long ruleDescId;

        public static DescribeBotPriceResponseBodyPriceModelRuleRuleList build(java.util.Map<String, ?> map) throws Exception {
            DescribeBotPriceResponseBodyPriceModelRuleRuleList self = new DescribeBotPriceResponseBodyPriceModelRuleRuleList();
            return TeaModel.build(map, self);
        }

        public DescribeBotPriceResponseBodyPriceModelRuleRuleList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeBotPriceResponseBodyPriceModelRuleRuleList setRuleDescId(Long ruleDescId) {
            this.ruleDescId = ruleDescId;
            return this;
        }
        public Long getRuleDescId() {
            return this.ruleDescId;
        }

    }

    public static class DescribeBotPriceResponseBodyPriceModelRule extends TeaModel {
        @NameInMap("RuleList")
        public java.util.List<DescribeBotPriceResponseBodyPriceModelRuleRuleList> ruleList;

        public static DescribeBotPriceResponseBodyPriceModelRule build(java.util.Map<String, ?> map) throws Exception {
            DescribeBotPriceResponseBodyPriceModelRule self = new DescribeBotPriceResponseBodyPriceModelRule();
            return TeaModel.build(map, self);
        }

        public DescribeBotPriceResponseBodyPriceModelRule setRuleList(java.util.List<DescribeBotPriceResponseBodyPriceModelRuleRuleList> ruleList) {
            this.ruleList = ruleList;
            return this;
        }
        public java.util.List<DescribeBotPriceResponseBodyPriceModelRuleRuleList> getRuleList() {
            return this.ruleList;
        }

    }

    public static class DescribeBotPriceResponseBodyPriceModel extends TeaModel {
        /**
         * <p>The currency. Valid values:</p>
         * <ul>
         * <li><p>JPY: Japanese Yen.</p>
         * </li>
         * <li><p>USD: US Dollar.</p>
         * </li>
         * <li><p>CNY: Chinese Yuan.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CNY</p>
         */
        @NameInMap("Currency")
        public String currency;

        /**
         * <p>The discount amount of the order.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("DiscountPrice")
        public Float discountPrice;

        /**
         * <p>The final price of the order, which is the actual transaction price.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Price")
        public Float price;

        @NameInMap("Rule")
        public DescribeBotPriceResponseBodyPriceModelRule rule;

        /**
         * <p>The original price of the order. Original price = actual transaction price + discount amount.</p>
         * 
         * <strong>example:</strong>
         * <p>150</p>
         */
        @NameInMap("TotalPrice")
        public Float totalPrice;

        public static DescribeBotPriceResponseBodyPriceModel build(java.util.Map<String, ?> map) throws Exception {
            DescribeBotPriceResponseBodyPriceModel self = new DescribeBotPriceResponseBodyPriceModel();
            return TeaModel.build(map, self);
        }

        public DescribeBotPriceResponseBodyPriceModel setCurrency(String currency) {
            this.currency = currency;
            return this;
        }
        public String getCurrency() {
            return this.currency;
        }

        public DescribeBotPriceResponseBodyPriceModel setDiscountPrice(Float discountPrice) {
            this.discountPrice = discountPrice;
            return this;
        }
        public Float getDiscountPrice() {
            return this.discountPrice;
        }

        public DescribeBotPriceResponseBodyPriceModel setPrice(Float price) {
            this.price = price;
            return this;
        }
        public Float getPrice() {
            return this.price;
        }

        public DescribeBotPriceResponseBodyPriceModel setRule(DescribeBotPriceResponseBodyPriceModelRule rule) {
            this.rule = rule;
            return this;
        }
        public DescribeBotPriceResponseBodyPriceModelRule getRule() {
            return this.rule;
        }

        public DescribeBotPriceResponseBodyPriceModel setTotalPrice(Float totalPrice) {
            this.totalPrice = totalPrice;
            return this;
        }
        public Float getTotalPrice() {
            return this.totalPrice;
        }

    }

}
