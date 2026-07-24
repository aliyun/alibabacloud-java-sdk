// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class DescribeDDoSPriceResponseBody extends TeaModel {
    /**
     * <p>The price information.</p>
     */
    @NameInMap("PriceModel")
    public DescribeDDoSPriceResponseBodyPriceModel priceModel;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>36af3fcc-43d0-441c-86b1-428951dc8225</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDDoSPriceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDDoSPriceResponseBody self = new DescribeDDoSPriceResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDDoSPriceResponseBody setPriceModel(DescribeDDoSPriceResponseBodyPriceModel priceModel) {
        this.priceModel = priceModel;
        return this;
    }
    public DescribeDDoSPriceResponseBodyPriceModel getPriceModel() {
        return this.priceModel;
    }

    public DescribeDDoSPriceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeDDoSPriceResponseBodyPriceModelRuleRuleList extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("RuleDescId")
        public Long ruleDescId;

        public static DescribeDDoSPriceResponseBodyPriceModelRuleRuleList build(java.util.Map<String, ?> map) throws Exception {
            DescribeDDoSPriceResponseBodyPriceModelRuleRuleList self = new DescribeDDoSPriceResponseBodyPriceModelRuleRuleList();
            return TeaModel.build(map, self);
        }

        public DescribeDDoSPriceResponseBodyPriceModelRuleRuleList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeDDoSPriceResponseBodyPriceModelRuleRuleList setRuleDescId(Long ruleDescId) {
            this.ruleDescId = ruleDescId;
            return this;
        }
        public Long getRuleDescId() {
            return this.ruleDescId;
        }

    }

    public static class DescribeDDoSPriceResponseBodyPriceModelRule extends TeaModel {
        @NameInMap("RuleList")
        public java.util.List<DescribeDDoSPriceResponseBodyPriceModelRuleRuleList> ruleList;

        public static DescribeDDoSPriceResponseBodyPriceModelRule build(java.util.Map<String, ?> map) throws Exception {
            DescribeDDoSPriceResponseBodyPriceModelRule self = new DescribeDDoSPriceResponseBodyPriceModelRule();
            return TeaModel.build(map, self);
        }

        public DescribeDDoSPriceResponseBodyPriceModelRule setRuleList(java.util.List<DescribeDDoSPriceResponseBodyPriceModelRuleRuleList> ruleList) {
            this.ruleList = ruleList;
            return this;
        }
        public java.util.List<DescribeDDoSPriceResponseBodyPriceModelRuleRuleList> getRuleList() {
            return this.ruleList;
        }

    }

    public static class DescribeDDoSPriceResponseBodyPriceModel extends TeaModel {
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
         * <p>40</p>
         */
        @NameInMap("DiscountPrice")
        public Float discountPrice;

        /**
         * <p>The final price of the order, which is the actual transaction price.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        @NameInMap("Price")
        public Float price;

        @NameInMap("Rule")
        public DescribeDDoSPriceResponseBodyPriceModelRule rule;

        /**
         * <p>The original price of the order. Original price = actual transaction price + discount amount.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("TotalPrice")
        public Float totalPrice;

        public static DescribeDDoSPriceResponseBodyPriceModel build(java.util.Map<String, ?> map) throws Exception {
            DescribeDDoSPriceResponseBodyPriceModel self = new DescribeDDoSPriceResponseBodyPriceModel();
            return TeaModel.build(map, self);
        }

        public DescribeDDoSPriceResponseBodyPriceModel setCurrency(String currency) {
            this.currency = currency;
            return this;
        }
        public String getCurrency() {
            return this.currency;
        }

        public DescribeDDoSPriceResponseBodyPriceModel setDiscountPrice(Float discountPrice) {
            this.discountPrice = discountPrice;
            return this;
        }
        public Float getDiscountPrice() {
            return this.discountPrice;
        }

        public DescribeDDoSPriceResponseBodyPriceModel setPrice(Float price) {
            this.price = price;
            return this;
        }
        public Float getPrice() {
            return this.price;
        }

        public DescribeDDoSPriceResponseBodyPriceModel setRule(DescribeDDoSPriceResponseBodyPriceModelRule rule) {
            this.rule = rule;
            return this;
        }
        public DescribeDDoSPriceResponseBodyPriceModelRule getRule() {
            return this.rule;
        }

        public DescribeDDoSPriceResponseBodyPriceModel setTotalPrice(Float totalPrice) {
            this.totalPrice = totalPrice;
            return this;
        }
        public Float getTotalPrice() {
            return this.totalPrice;
        }

    }

}
