// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class DescribeCacheReservePriceResponseBody extends TeaModel {
    /**
     * <p>The price information.</p>
     */
    @NameInMap("PriceModel")
    public DescribeCacheReservePriceResponseBodyPriceModel priceModel;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>2430E05E-1340-5773-B5E1-B743929F46F2</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeCacheReservePriceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCacheReservePriceResponseBody self = new DescribeCacheReservePriceResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCacheReservePriceResponseBody setPriceModel(DescribeCacheReservePriceResponseBodyPriceModel priceModel) {
        this.priceModel = priceModel;
        return this;
    }
    public DescribeCacheReservePriceResponseBodyPriceModel getPriceModel() {
        return this.priceModel;
    }

    public DescribeCacheReservePriceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeCacheReservePriceResponseBodyPriceModelRuleRuleList extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("RuleDescId")
        public Long ruleDescId;

        public static DescribeCacheReservePriceResponseBodyPriceModelRuleRuleList build(java.util.Map<String, ?> map) throws Exception {
            DescribeCacheReservePriceResponseBodyPriceModelRuleRuleList self = new DescribeCacheReservePriceResponseBodyPriceModelRuleRuleList();
            return TeaModel.build(map, self);
        }

        public DescribeCacheReservePriceResponseBodyPriceModelRuleRuleList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeCacheReservePriceResponseBodyPriceModelRuleRuleList setRuleDescId(Long ruleDescId) {
            this.ruleDescId = ruleDescId;
            return this;
        }
        public Long getRuleDescId() {
            return this.ruleDescId;
        }

    }

    public static class DescribeCacheReservePriceResponseBodyPriceModelRule extends TeaModel {
        @NameInMap("RuleList")
        public java.util.List<DescribeCacheReservePriceResponseBodyPriceModelRuleRuleList> ruleList;

        public static DescribeCacheReservePriceResponseBodyPriceModelRule build(java.util.Map<String, ?> map) throws Exception {
            DescribeCacheReservePriceResponseBodyPriceModelRule self = new DescribeCacheReservePriceResponseBodyPriceModelRule();
            return TeaModel.build(map, self);
        }

        public DescribeCacheReservePriceResponseBodyPriceModelRule setRuleList(java.util.List<DescribeCacheReservePriceResponseBodyPriceModelRuleRuleList> ruleList) {
            this.ruleList = ruleList;
            return this;
        }
        public java.util.List<DescribeCacheReservePriceResponseBodyPriceModelRuleRuleList> getRuleList() {
            return this.ruleList;
        }

    }

    public static class DescribeCacheReservePriceResponseBodyPriceModel extends TeaModel {
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
         * <p>1</p>
         */
        @NameInMap("DiscountPrice")
        public Float discountPrice;

        /**
         * <p>The final order price, which is the actual transaction price.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Price")
        public Float price;

        @NameInMap("Rule")
        public DescribeCacheReservePriceResponseBodyPriceModelRule rule;

        /**
         * <p>The original order price. Original order price = actual transaction price + discount amount.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("TotalPrice")
        public Float totalPrice;

        public static DescribeCacheReservePriceResponseBodyPriceModel build(java.util.Map<String, ?> map) throws Exception {
            DescribeCacheReservePriceResponseBodyPriceModel self = new DescribeCacheReservePriceResponseBodyPriceModel();
            return TeaModel.build(map, self);
        }

        public DescribeCacheReservePriceResponseBodyPriceModel setCurrency(String currency) {
            this.currency = currency;
            return this;
        }
        public String getCurrency() {
            return this.currency;
        }

        public DescribeCacheReservePriceResponseBodyPriceModel setDiscountPrice(Float discountPrice) {
            this.discountPrice = discountPrice;
            return this;
        }
        public Float getDiscountPrice() {
            return this.discountPrice;
        }

        public DescribeCacheReservePriceResponseBodyPriceModel setPrice(Float price) {
            this.price = price;
            return this;
        }
        public Float getPrice() {
            return this.price;
        }

        public DescribeCacheReservePriceResponseBodyPriceModel setRule(DescribeCacheReservePriceResponseBodyPriceModelRule rule) {
            this.rule = rule;
            return this;
        }
        public DescribeCacheReservePriceResponseBodyPriceModelRule getRule() {
            return this.rule;
        }

        public DescribeCacheReservePriceResponseBodyPriceModel setTotalPrice(Float totalPrice) {
            this.totalPrice = totalPrice;
            return this;
        }
        public Float getTotalPrice() {
            return this.totalPrice;
        }

    }

}
