// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class DescribeCacheReservePriceGapResponseBody extends TeaModel {
    /**
     * <p>The pricing information.</p>
     */
    @NameInMap("PriceModel")
    public DescribeCacheReservePriceGapResponseBodyPriceModel priceModel;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>40423A7F-A83D-1E24-B80E-86DD25790759</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeCacheReservePriceGapResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCacheReservePriceGapResponseBody self = new DescribeCacheReservePriceGapResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCacheReservePriceGapResponseBody setPriceModel(DescribeCacheReservePriceGapResponseBodyPriceModel priceModel) {
        this.priceModel = priceModel;
        return this;
    }
    public DescribeCacheReservePriceGapResponseBodyPriceModel getPriceModel() {
        return this.priceModel;
    }

    public DescribeCacheReservePriceGapResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeCacheReservePriceGapResponseBodyPriceModelRuleRuleList extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("RuleDescId")
        public Long ruleDescId;

        public static DescribeCacheReservePriceGapResponseBodyPriceModelRuleRuleList build(java.util.Map<String, ?> map) throws Exception {
            DescribeCacheReservePriceGapResponseBodyPriceModelRuleRuleList self = new DescribeCacheReservePriceGapResponseBodyPriceModelRuleRuleList();
            return TeaModel.build(map, self);
        }

        public DescribeCacheReservePriceGapResponseBodyPriceModelRuleRuleList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeCacheReservePriceGapResponseBodyPriceModelRuleRuleList setRuleDescId(Long ruleDescId) {
            this.ruleDescId = ruleDescId;
            return this;
        }
        public Long getRuleDescId() {
            return this.ruleDescId;
        }

    }

    public static class DescribeCacheReservePriceGapResponseBodyPriceModelRule extends TeaModel {
        @NameInMap("RuleList")
        public java.util.List<DescribeCacheReservePriceGapResponseBodyPriceModelRuleRuleList> ruleList;

        public static DescribeCacheReservePriceGapResponseBodyPriceModelRule build(java.util.Map<String, ?> map) throws Exception {
            DescribeCacheReservePriceGapResponseBodyPriceModelRule self = new DescribeCacheReservePriceGapResponseBodyPriceModelRule();
            return TeaModel.build(map, self);
        }

        public DescribeCacheReservePriceGapResponseBodyPriceModelRule setRuleList(java.util.List<DescribeCacheReservePriceGapResponseBodyPriceModelRuleRuleList> ruleList) {
            this.ruleList = ruleList;
            return this;
        }
        public java.util.List<DescribeCacheReservePriceGapResponseBodyPriceModelRuleRuleList> getRuleList() {
            return this.ruleList;
        }

    }

    public static class DescribeCacheReservePriceGapResponseBodyPriceModel extends TeaModel {
        /**
         * <p>The currency. Valid values:</p>
         * <ul>
         * <li>JPY: Japanese Yen.</li>
         * <li>USD: US Dollar.</li>
         * <li>CNY: Chinese Yuan.</li>
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
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>esa-cr-9tuv*********</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The final order price, which is the actual transaction price.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Price")
        public Float price;

        @NameInMap("Rule")
        public DescribeCacheReservePriceGapResponseBodyPriceModelRule rule;

        /**
         * <p>The original order price. Original order price = actual transaction price + discount amount.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("TotalPrice")
        public Float totalPrice;

        public static DescribeCacheReservePriceGapResponseBodyPriceModel build(java.util.Map<String, ?> map) throws Exception {
            DescribeCacheReservePriceGapResponseBodyPriceModel self = new DescribeCacheReservePriceGapResponseBodyPriceModel();
            return TeaModel.build(map, self);
        }

        public DescribeCacheReservePriceGapResponseBodyPriceModel setCurrency(String currency) {
            this.currency = currency;
            return this;
        }
        public String getCurrency() {
            return this.currency;
        }

        public DescribeCacheReservePriceGapResponseBodyPriceModel setDiscountPrice(Float discountPrice) {
            this.discountPrice = discountPrice;
            return this;
        }
        public Float getDiscountPrice() {
            return this.discountPrice;
        }

        public DescribeCacheReservePriceGapResponseBodyPriceModel setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeCacheReservePriceGapResponseBodyPriceModel setPrice(Float price) {
            this.price = price;
            return this;
        }
        public Float getPrice() {
            return this.price;
        }

        public DescribeCacheReservePriceGapResponseBodyPriceModel setRule(DescribeCacheReservePriceGapResponseBodyPriceModelRule rule) {
            this.rule = rule;
            return this;
        }
        public DescribeCacheReservePriceGapResponseBodyPriceModelRule getRule() {
            return this.rule;
        }

        public DescribeCacheReservePriceGapResponseBodyPriceModel setTotalPrice(Float totalPrice) {
            this.totalPrice = totalPrice;
            return this;
        }
        public Float getTotalPrice() {
            return this.totalPrice;
        }

    }

}
