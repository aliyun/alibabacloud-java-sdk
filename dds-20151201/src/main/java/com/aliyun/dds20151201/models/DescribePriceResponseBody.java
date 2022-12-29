// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class DescribePriceResponseBody extends TeaModel {
    // The list of orders.
    @NameInMap("Order")
    public DescribePriceResponseBodyOrder order;

    // The order parameters. This parameter is returned if the `OrderParamOut` parameter is set to `true`.
    @NameInMap("OrderParams")
    public String orderParams;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    // Details about the promotion rules.
    @NameInMap("Rules")
    public DescribePriceResponseBodyRules rules;

    // Details about the rules that match the coupon.
    @NameInMap("SubOrders")
    public DescribePriceResponseBodySubOrders subOrders;

    // The ID of the trace.
    @NameInMap("TraceId")
    public String traceId;

    public static DescribePriceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePriceResponseBody self = new DescribePriceResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePriceResponseBody setOrder(DescribePriceResponseBodyOrder order) {
        this.order = order;
        return this;
    }
    public DescribePriceResponseBodyOrder getOrder() {
        return this.order;
    }

    public DescribePriceResponseBody setOrderParams(String orderParams) {
        this.orderParams = orderParams;
        return this;
    }
    public String getOrderParams() {
        return this.orderParams;
    }

    public DescribePriceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribePriceResponseBody setRules(DescribePriceResponseBodyRules rules) {
        this.rules = rules;
        return this;
    }
    public DescribePriceResponseBodyRules getRules() {
        return this.rules;
    }

    public DescribePriceResponseBody setSubOrders(DescribePriceResponseBodySubOrders subOrders) {
        this.subOrders = subOrders;
        return this;
    }
    public DescribePriceResponseBodySubOrders getSubOrders() {
        return this.subOrders;
    }

    public DescribePriceResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class DescribePriceResponseBodyOrderCouponsCouponPromotionRuleIdList extends TeaModel {
        @NameInMap("PromotionRuleId")
        public java.util.List<Long> promotionRuleId;

        public static DescribePriceResponseBodyOrderCouponsCouponPromotionRuleIdList build(java.util.Map<String, ?> map) throws Exception {
            DescribePriceResponseBodyOrderCouponsCouponPromotionRuleIdList self = new DescribePriceResponseBodyOrderCouponsCouponPromotionRuleIdList();
            return TeaModel.build(map, self);
        }

        public DescribePriceResponseBodyOrderCouponsCouponPromotionRuleIdList setPromotionRuleId(java.util.List<Long> promotionRuleId) {
            this.promotionRuleId = promotionRuleId;
            return this;
        }
        public java.util.List<Long> getPromotionRuleId() {
            return this.promotionRuleId;
        }

    }

    public static class DescribePriceResponseBodyOrderCouponsCoupon extends TeaModel {
        @NameInMap("ActivityCategory")
        public String activityCategory;

        // The coupon number.
        @NameInMap("CouponNo")
        public String couponNo;

        // The description of the topic.
        @NameInMap("Description")
        public String description;

        // Indicates whether the coupon was selected.
        @NameInMap("IsSelected")
        public String isSelected;

        // The name of the coupon.
        @NameInMap("Name")
        public String name;

        @NameInMap("OptionCode")
        public String optionCode;

        @NameInMap("PromotionOptionCode")
        public String promotionOptionCode;

        @NameInMap("PromotionRuleIdList")
        public DescribePriceResponseBodyOrderCouponsCouponPromotionRuleIdList promotionRuleIdList;

        public static DescribePriceResponseBodyOrderCouponsCoupon build(java.util.Map<String, ?> map) throws Exception {
            DescribePriceResponseBodyOrderCouponsCoupon self = new DescribePriceResponseBodyOrderCouponsCoupon();
            return TeaModel.build(map, self);
        }

        public DescribePriceResponseBodyOrderCouponsCoupon setActivityCategory(String activityCategory) {
            this.activityCategory = activityCategory;
            return this;
        }
        public String getActivityCategory() {
            return this.activityCategory;
        }

        public DescribePriceResponseBodyOrderCouponsCoupon setCouponNo(String couponNo) {
            this.couponNo = couponNo;
            return this;
        }
        public String getCouponNo() {
            return this.couponNo;
        }

        public DescribePriceResponseBodyOrderCouponsCoupon setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribePriceResponseBodyOrderCouponsCoupon setIsSelected(String isSelected) {
            this.isSelected = isSelected;
            return this;
        }
        public String getIsSelected() {
            return this.isSelected;
        }

        public DescribePriceResponseBodyOrderCouponsCoupon setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribePriceResponseBodyOrderCouponsCoupon setOptionCode(String optionCode) {
            this.optionCode = optionCode;
            return this;
        }
        public String getOptionCode() {
            return this.optionCode;
        }

        public DescribePriceResponseBodyOrderCouponsCoupon setPromotionOptionCode(String promotionOptionCode) {
            this.promotionOptionCode = promotionOptionCode;
            return this;
        }
        public String getPromotionOptionCode() {
            return this.promotionOptionCode;
        }

        public DescribePriceResponseBodyOrderCouponsCoupon setPromotionRuleIdList(DescribePriceResponseBodyOrderCouponsCouponPromotionRuleIdList promotionRuleIdList) {
            this.promotionRuleIdList = promotionRuleIdList;
            return this;
        }
        public DescribePriceResponseBodyOrderCouponsCouponPromotionRuleIdList getPromotionRuleIdList() {
            return this.promotionRuleIdList;
        }

    }

    public static class DescribePriceResponseBodyOrderCoupons extends TeaModel {
        @NameInMap("Coupon")
        public java.util.List<DescribePriceResponseBodyOrderCouponsCoupon> coupon;

        public static DescribePriceResponseBodyOrderCoupons build(java.util.Map<String, ?> map) throws Exception {
            DescribePriceResponseBodyOrderCoupons self = new DescribePriceResponseBodyOrderCoupons();
            return TeaModel.build(map, self);
        }

        public DescribePriceResponseBodyOrderCoupons setCoupon(java.util.List<DescribePriceResponseBodyOrderCouponsCoupon> coupon) {
            this.coupon = coupon;
            return this;
        }
        public java.util.List<DescribePriceResponseBodyOrderCouponsCoupon> getCoupon() {
            return this.coupon;
        }

    }

    public static class DescribePriceResponseBodyOrderRuleIds extends TeaModel {
        @NameInMap("RuleId")
        public java.util.List<String> ruleId;

        public static DescribePriceResponseBodyOrderRuleIds build(java.util.Map<String, ?> map) throws Exception {
            DescribePriceResponseBodyOrderRuleIds self = new DescribePriceResponseBodyOrderRuleIds();
            return TeaModel.build(map, self);
        }

        public DescribePriceResponseBodyOrderRuleIds setRuleId(java.util.List<String> ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public java.util.List<String> getRuleId() {
            return this.ruleId;
        }

    }

    public static class DescribePriceResponseBodyOrder extends TeaModel {
        // Details about the coupons.
        @NameInMap("Coupons")
        public DescribePriceResponseBodyOrderCoupons coupons;

        // The type of the currency. Valid values:
        // 
        // *   USD: United States dollar
        // *   JPY: Japanese Yen.
        @NameInMap("Currency")
        public String currency;

        // The discount amount of the order.
        @NameInMap("DiscountAmount")
        public String discountAmount;

        // The original price of the order.
        @NameInMap("OriginalAmount")
        public String originalAmount;

        // The list of one or more promotion rule IDs.
        @NameInMap("RuleIds")
        public DescribePriceResponseBodyOrderRuleIds ruleIds;

        // The actual price of the order.
        @NameInMap("TradeAmount")
        public String tradeAmount;

        public static DescribePriceResponseBodyOrder build(java.util.Map<String, ?> map) throws Exception {
            DescribePriceResponseBodyOrder self = new DescribePriceResponseBodyOrder();
            return TeaModel.build(map, self);
        }

        public DescribePriceResponseBodyOrder setCoupons(DescribePriceResponseBodyOrderCoupons coupons) {
            this.coupons = coupons;
            return this;
        }
        public DescribePriceResponseBodyOrderCoupons getCoupons() {
            return this.coupons;
        }

        public DescribePriceResponseBodyOrder setCurrency(String currency) {
            this.currency = currency;
            return this;
        }
        public String getCurrency() {
            return this.currency;
        }

        public DescribePriceResponseBodyOrder setDiscountAmount(String discountAmount) {
            this.discountAmount = discountAmount;
            return this;
        }
        public String getDiscountAmount() {
            return this.discountAmount;
        }

        public DescribePriceResponseBodyOrder setOriginalAmount(String originalAmount) {
            this.originalAmount = originalAmount;
            return this;
        }
        public String getOriginalAmount() {
            return this.originalAmount;
        }

        public DescribePriceResponseBodyOrder setRuleIds(DescribePriceResponseBodyOrderRuleIds ruleIds) {
            this.ruleIds = ruleIds;
            return this;
        }
        public DescribePriceResponseBodyOrderRuleIds getRuleIds() {
            return this.ruleIds;
        }

        public DescribePriceResponseBodyOrder setTradeAmount(String tradeAmount) {
            this.tradeAmount = tradeAmount;
            return this;
        }
        public String getTradeAmount() {
            return this.tradeAmount;
        }

    }

    public static class DescribePriceResponseBodyRulesRule extends TeaModel {
        // The name of the rule. Valid values
        @NameInMap("Name")
        public String name;

        // The ID of the policy.
        @NameInMap("RuleDescId")
        public Long ruleDescId;

        // The title of the rule.
        @NameInMap("Title")
        public String title;

        public static DescribePriceResponseBodyRulesRule build(java.util.Map<String, ?> map) throws Exception {
            DescribePriceResponseBodyRulesRule self = new DescribePriceResponseBodyRulesRule();
            return TeaModel.build(map, self);
        }

        public DescribePriceResponseBodyRulesRule setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribePriceResponseBodyRulesRule setRuleDescId(Long ruleDescId) {
            this.ruleDescId = ruleDescId;
            return this;
        }
        public Long getRuleDescId() {
            return this.ruleDescId;
        }

        public DescribePriceResponseBodyRulesRule setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class DescribePriceResponseBodyRules extends TeaModel {
        @NameInMap("Rule")
        public java.util.List<DescribePriceResponseBodyRulesRule> rule;

        public static DescribePriceResponseBodyRules build(java.util.Map<String, ?> map) throws Exception {
            DescribePriceResponseBodyRules self = new DescribePriceResponseBodyRules();
            return TeaModel.build(map, self);
        }

        public DescribePriceResponseBodyRules setRule(java.util.List<DescribePriceResponseBodyRulesRule> rule) {
            this.rule = rule;
            return this;
        }
        public java.util.List<DescribePriceResponseBodyRulesRule> getRule() {
            return this.rule;
        }

    }

    public static class DescribePriceResponseBodySubOrdersSubOrderRuleIds extends TeaModel {
        @NameInMap("RuleId")
        public java.util.List<String> ruleId;

        public static DescribePriceResponseBodySubOrdersSubOrderRuleIds build(java.util.Map<String, ?> map) throws Exception {
            DescribePriceResponseBodySubOrdersSubOrderRuleIds self = new DescribePriceResponseBodySubOrdersSubOrderRuleIds();
            return TeaModel.build(map, self);
        }

        public DescribePriceResponseBodySubOrdersSubOrderRuleIds setRuleId(java.util.List<String> ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public java.util.List<String> getRuleId() {
            return this.ruleId;
        }

    }

    public static class DescribePriceResponseBodySubOrdersSubOrder extends TeaModel {
        // The discount amount of the order.
        @NameInMap("DiscountAmount")
        public String discountAmount;

        // The ID of the instance.
        @NameInMap("InstanceId")
        public String instanceId;

        // The original price of the order.
        @NameInMap("OriginalAmount")
        public String originalAmount;

        // The list of one or more promotion rule IDs.
        @NameInMap("RuleIds")
        public DescribePriceResponseBodySubOrdersSubOrderRuleIds ruleIds;

        // The actual price of the order.
        @NameInMap("TradeAmount")
        public String tradeAmount;

        public static DescribePriceResponseBodySubOrdersSubOrder build(java.util.Map<String, ?> map) throws Exception {
            DescribePriceResponseBodySubOrdersSubOrder self = new DescribePriceResponseBodySubOrdersSubOrder();
            return TeaModel.build(map, self);
        }

        public DescribePriceResponseBodySubOrdersSubOrder setDiscountAmount(String discountAmount) {
            this.discountAmount = discountAmount;
            return this;
        }
        public String getDiscountAmount() {
            return this.discountAmount;
        }

        public DescribePriceResponseBodySubOrdersSubOrder setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribePriceResponseBodySubOrdersSubOrder setOriginalAmount(String originalAmount) {
            this.originalAmount = originalAmount;
            return this;
        }
        public String getOriginalAmount() {
            return this.originalAmount;
        }

        public DescribePriceResponseBodySubOrdersSubOrder setRuleIds(DescribePriceResponseBodySubOrdersSubOrderRuleIds ruleIds) {
            this.ruleIds = ruleIds;
            return this;
        }
        public DescribePriceResponseBodySubOrdersSubOrderRuleIds getRuleIds() {
            return this.ruleIds;
        }

        public DescribePriceResponseBodySubOrdersSubOrder setTradeAmount(String tradeAmount) {
            this.tradeAmount = tradeAmount;
            return this;
        }
        public String getTradeAmount() {
            return this.tradeAmount;
        }

    }

    public static class DescribePriceResponseBodySubOrders extends TeaModel {
        @NameInMap("SubOrder")
        public java.util.List<DescribePriceResponseBodySubOrdersSubOrder> subOrder;

        public static DescribePriceResponseBodySubOrders build(java.util.Map<String, ?> map) throws Exception {
            DescribePriceResponseBodySubOrders self = new DescribePriceResponseBodySubOrders();
            return TeaModel.build(map, self);
        }

        public DescribePriceResponseBodySubOrders setSubOrder(java.util.List<DescribePriceResponseBodySubOrdersSubOrder> subOrder) {
            this.subOrder = subOrder;
            return this;
        }
        public java.util.List<DescribePriceResponseBodySubOrdersSubOrder> getSubOrder() {
            return this.subOrder;
        }

    }

}
