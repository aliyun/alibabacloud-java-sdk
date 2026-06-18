// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class DescribeRatePlanPriceGapResponseBody extends TeaModel {
    /**
     * <p>The price information.</p>
     */
    @NameInMap("PriceModel")
    public DescribeRatePlanPriceGapResponseBodyPriceModel priceModel;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>40423A7F-A83D-1E24-B80E-86DD25790759</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeRatePlanPriceGapResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRatePlanPriceGapResponseBody self = new DescribeRatePlanPriceGapResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRatePlanPriceGapResponseBody setPriceModel(DescribeRatePlanPriceGapResponseBodyPriceModel priceModel) {
        this.priceModel = priceModel;
        return this;
    }
    public DescribeRatePlanPriceGapResponseBodyPriceModel getPriceModel() {
        return this.priceModel;
    }

    public DescribeRatePlanPriceGapResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeRatePlanPriceGapResponseBodyPriceModelRuleRuleList extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("RuleDescId")
        public Long ruleDescId;

        public static DescribeRatePlanPriceGapResponseBodyPriceModelRuleRuleList build(java.util.Map<String, ?> map) throws Exception {
            DescribeRatePlanPriceGapResponseBodyPriceModelRuleRuleList self = new DescribeRatePlanPriceGapResponseBodyPriceModelRuleRuleList();
            return TeaModel.build(map, self);
        }

        public DescribeRatePlanPriceGapResponseBodyPriceModelRuleRuleList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeRatePlanPriceGapResponseBodyPriceModelRuleRuleList setRuleDescId(Long ruleDescId) {
            this.ruleDescId = ruleDescId;
            return this;
        }
        public Long getRuleDescId() {
            return this.ruleDescId;
        }

    }

    public static class DescribeRatePlanPriceGapResponseBodyPriceModelRule extends TeaModel {
        @NameInMap("RuleList")
        public java.util.List<DescribeRatePlanPriceGapResponseBodyPriceModelRuleRuleList> ruleList;

        public static DescribeRatePlanPriceGapResponseBodyPriceModelRule build(java.util.Map<String, ?> map) throws Exception {
            DescribeRatePlanPriceGapResponseBodyPriceModelRule self = new DescribeRatePlanPriceGapResponseBodyPriceModelRule();
            return TeaModel.build(map, self);
        }

        public DescribeRatePlanPriceGapResponseBodyPriceModelRule setRuleList(java.util.List<DescribeRatePlanPriceGapResponseBodyPriceModelRuleRuleList> ruleList) {
            this.ruleList = ruleList;
            return this;
        }
        public java.util.List<DescribeRatePlanPriceGapResponseBodyPriceModelRuleRuleList> getRuleList() {
            return this.ruleList;
        }

    }

    public static class DescribeRatePlanPriceGapResponseBodyPriceModel extends TeaModel {
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
         * <p>xcdn-91fknmb80f0g</p>
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
        public DescribeRatePlanPriceGapResponseBodyPriceModelRule rule;

        /**
         * <p>The target plan code.</p>
         * 
         * <strong>example:</strong>
         * <p>entranceplan</p>
         */
        @NameInMap("TargetPlanCode")
        public String targetPlanCode;

        /**
         * <p>The original order price, which equals the actual transaction price plus the discount amount.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("TotalPrice")
        public Float totalPrice;

        public static DescribeRatePlanPriceGapResponseBodyPriceModel build(java.util.Map<String, ?> map) throws Exception {
            DescribeRatePlanPriceGapResponseBodyPriceModel self = new DescribeRatePlanPriceGapResponseBodyPriceModel();
            return TeaModel.build(map, self);
        }

        public DescribeRatePlanPriceGapResponseBodyPriceModel setCurrency(String currency) {
            this.currency = currency;
            return this;
        }
        public String getCurrency() {
            return this.currency;
        }

        public DescribeRatePlanPriceGapResponseBodyPriceModel setDiscountPrice(Float discountPrice) {
            this.discountPrice = discountPrice;
            return this;
        }
        public Float getDiscountPrice() {
            return this.discountPrice;
        }

        public DescribeRatePlanPriceGapResponseBodyPriceModel setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeRatePlanPriceGapResponseBodyPriceModel setPrice(Float price) {
            this.price = price;
            return this;
        }
        public Float getPrice() {
            return this.price;
        }

        public DescribeRatePlanPriceGapResponseBodyPriceModel setRule(DescribeRatePlanPriceGapResponseBodyPriceModelRule rule) {
            this.rule = rule;
            return this;
        }
        public DescribeRatePlanPriceGapResponseBodyPriceModelRule getRule() {
            return this.rule;
        }

        public DescribeRatePlanPriceGapResponseBodyPriceModel setTargetPlanCode(String targetPlanCode) {
            this.targetPlanCode = targetPlanCode;
            return this;
        }
        public String getTargetPlanCode() {
            return this.targetPlanCode;
        }

        public DescribeRatePlanPriceGapResponseBodyPriceModel setTotalPrice(Float totalPrice) {
            this.totalPrice = totalPrice;
            return this;
        }
        public Float getTotalPrice() {
            return this.totalPrice;
        }

    }

}
