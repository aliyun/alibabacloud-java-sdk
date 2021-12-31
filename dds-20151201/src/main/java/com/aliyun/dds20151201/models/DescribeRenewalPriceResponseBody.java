// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class DescribeRenewalPriceResponseBody extends TeaModel {
    @NameInMap("Order")
    public DescribeRenewalPriceResponseBodyOrder order;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Rules")
    public DescribeRenewalPriceResponseBodyRules rules;

    @NameInMap("SubOrders")
    public DescribeRenewalPriceResponseBodySubOrders subOrders;

    public static DescribeRenewalPriceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRenewalPriceResponseBody self = new DescribeRenewalPriceResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRenewalPriceResponseBody setOrder(DescribeRenewalPriceResponseBodyOrder order) {
        this.order = order;
        return this;
    }
    public DescribeRenewalPriceResponseBodyOrder getOrder() {
        return this.order;
    }

    public DescribeRenewalPriceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeRenewalPriceResponseBody setRules(DescribeRenewalPriceResponseBodyRules rules) {
        this.rules = rules;
        return this;
    }
    public DescribeRenewalPriceResponseBodyRules getRules() {
        return this.rules;
    }

    public DescribeRenewalPriceResponseBody setSubOrders(DescribeRenewalPriceResponseBodySubOrders subOrders) {
        this.subOrders = subOrders;
        return this;
    }
    public DescribeRenewalPriceResponseBodySubOrders getSubOrders() {
        return this.subOrders;
    }

    public static class DescribeRenewalPriceResponseBodyOrderCouponsCoupon extends TeaModel {
        @NameInMap("CouponNo")
        public String couponNo;

        @NameInMap("Description")
        public String description;

        @NameInMap("IsSelected")
        public String isSelected;

        @NameInMap("Name")
        public String name;

        public static DescribeRenewalPriceResponseBodyOrderCouponsCoupon build(java.util.Map<String, ?> map) throws Exception {
            DescribeRenewalPriceResponseBodyOrderCouponsCoupon self = new DescribeRenewalPriceResponseBodyOrderCouponsCoupon();
            return TeaModel.build(map, self);
        }

        public DescribeRenewalPriceResponseBodyOrderCouponsCoupon setCouponNo(String couponNo) {
            this.couponNo = couponNo;
            return this;
        }
        public String getCouponNo() {
            return this.couponNo;
        }

        public DescribeRenewalPriceResponseBodyOrderCouponsCoupon setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeRenewalPriceResponseBodyOrderCouponsCoupon setIsSelected(String isSelected) {
            this.isSelected = isSelected;
            return this;
        }
        public String getIsSelected() {
            return this.isSelected;
        }

        public DescribeRenewalPriceResponseBodyOrderCouponsCoupon setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class DescribeRenewalPriceResponseBodyOrderCoupons extends TeaModel {
        @NameInMap("Coupon")
        public java.util.List<DescribeRenewalPriceResponseBodyOrderCouponsCoupon> coupon;

        public static DescribeRenewalPriceResponseBodyOrderCoupons build(java.util.Map<String, ?> map) throws Exception {
            DescribeRenewalPriceResponseBodyOrderCoupons self = new DescribeRenewalPriceResponseBodyOrderCoupons();
            return TeaModel.build(map, self);
        }

        public DescribeRenewalPriceResponseBodyOrderCoupons setCoupon(java.util.List<DescribeRenewalPriceResponseBodyOrderCouponsCoupon> coupon) {
            this.coupon = coupon;
            return this;
        }
        public java.util.List<DescribeRenewalPriceResponseBodyOrderCouponsCoupon> getCoupon() {
            return this.coupon;
        }

    }

    public static class DescribeRenewalPriceResponseBodyOrderRuleIds extends TeaModel {
        @NameInMap("RuleId")
        public java.util.List<String> ruleId;

        public static DescribeRenewalPriceResponseBodyOrderRuleIds build(java.util.Map<String, ?> map) throws Exception {
            DescribeRenewalPriceResponseBodyOrderRuleIds self = new DescribeRenewalPriceResponseBodyOrderRuleIds();
            return TeaModel.build(map, self);
        }

        public DescribeRenewalPriceResponseBodyOrderRuleIds setRuleId(java.util.List<String> ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public java.util.List<String> getRuleId() {
            return this.ruleId;
        }

    }

    public static class DescribeRenewalPriceResponseBodyOrder extends TeaModel {
        @NameInMap("Coupons")
        public DescribeRenewalPriceResponseBodyOrderCoupons coupons;

        @NameInMap("Currency")
        public String currency;

        @NameInMap("DiscountAmount")
        public Float discountAmount;

        @NameInMap("OriginalAmount")
        public Float originalAmount;

        @NameInMap("RuleIds")
        public DescribeRenewalPriceResponseBodyOrderRuleIds ruleIds;

        @NameInMap("TradeAmount")
        public Float tradeAmount;

        public static DescribeRenewalPriceResponseBodyOrder build(java.util.Map<String, ?> map) throws Exception {
            DescribeRenewalPriceResponseBodyOrder self = new DescribeRenewalPriceResponseBodyOrder();
            return TeaModel.build(map, self);
        }

        public DescribeRenewalPriceResponseBodyOrder setCoupons(DescribeRenewalPriceResponseBodyOrderCoupons coupons) {
            this.coupons = coupons;
            return this;
        }
        public DescribeRenewalPriceResponseBodyOrderCoupons getCoupons() {
            return this.coupons;
        }

        public DescribeRenewalPriceResponseBodyOrder setCurrency(String currency) {
            this.currency = currency;
            return this;
        }
        public String getCurrency() {
            return this.currency;
        }

        public DescribeRenewalPriceResponseBodyOrder setDiscountAmount(Float discountAmount) {
            this.discountAmount = discountAmount;
            return this;
        }
        public Float getDiscountAmount() {
            return this.discountAmount;
        }

        public DescribeRenewalPriceResponseBodyOrder setOriginalAmount(Float originalAmount) {
            this.originalAmount = originalAmount;
            return this;
        }
        public Float getOriginalAmount() {
            return this.originalAmount;
        }

        public DescribeRenewalPriceResponseBodyOrder setRuleIds(DescribeRenewalPriceResponseBodyOrderRuleIds ruleIds) {
            this.ruleIds = ruleIds;
            return this;
        }
        public DescribeRenewalPriceResponseBodyOrderRuleIds getRuleIds() {
            return this.ruleIds;
        }

        public DescribeRenewalPriceResponseBodyOrder setTradeAmount(Float tradeAmount) {
            this.tradeAmount = tradeAmount;
            return this;
        }
        public Float getTradeAmount() {
            return this.tradeAmount;
        }

    }

    public static class DescribeRenewalPriceResponseBodyRulesRule extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("RuleDescId")
        public Long ruleDescId;

        @NameInMap("Title")
        public String title;

        public static DescribeRenewalPriceResponseBodyRulesRule build(java.util.Map<String, ?> map) throws Exception {
            DescribeRenewalPriceResponseBodyRulesRule self = new DescribeRenewalPriceResponseBodyRulesRule();
            return TeaModel.build(map, self);
        }

        public DescribeRenewalPriceResponseBodyRulesRule setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeRenewalPriceResponseBodyRulesRule setRuleDescId(Long ruleDescId) {
            this.ruleDescId = ruleDescId;
            return this;
        }
        public Long getRuleDescId() {
            return this.ruleDescId;
        }

        public DescribeRenewalPriceResponseBodyRulesRule setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class DescribeRenewalPriceResponseBodyRules extends TeaModel {
        @NameInMap("Rule")
        public java.util.List<DescribeRenewalPriceResponseBodyRulesRule> rule;

        public static DescribeRenewalPriceResponseBodyRules build(java.util.Map<String, ?> map) throws Exception {
            DescribeRenewalPriceResponseBodyRules self = new DescribeRenewalPriceResponseBodyRules();
            return TeaModel.build(map, self);
        }

        public DescribeRenewalPriceResponseBodyRules setRule(java.util.List<DescribeRenewalPriceResponseBodyRulesRule> rule) {
            this.rule = rule;
            return this;
        }
        public java.util.List<DescribeRenewalPriceResponseBodyRulesRule> getRule() {
            return this.rule;
        }

    }

    public static class DescribeRenewalPriceResponseBodySubOrdersSubOrderRuleIds extends TeaModel {
        @NameInMap("RuleId")
        public java.util.List<String> ruleId;

        public static DescribeRenewalPriceResponseBodySubOrdersSubOrderRuleIds build(java.util.Map<String, ?> map) throws Exception {
            DescribeRenewalPriceResponseBodySubOrdersSubOrderRuleIds self = new DescribeRenewalPriceResponseBodySubOrdersSubOrderRuleIds();
            return TeaModel.build(map, self);
        }

        public DescribeRenewalPriceResponseBodySubOrdersSubOrderRuleIds setRuleId(java.util.List<String> ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public java.util.List<String> getRuleId() {
            return this.ruleId;
        }

    }

    public static class DescribeRenewalPriceResponseBodySubOrdersSubOrder extends TeaModel {
        @NameInMap("DiscountAmount")
        public Float discountAmount;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("OriginalAmount")
        public Float originalAmount;

        @NameInMap("RuleIds")
        public DescribeRenewalPriceResponseBodySubOrdersSubOrderRuleIds ruleIds;

        @NameInMap("TradeAmount")
        public Float tradeAmount;

        public static DescribeRenewalPriceResponseBodySubOrdersSubOrder build(java.util.Map<String, ?> map) throws Exception {
            DescribeRenewalPriceResponseBodySubOrdersSubOrder self = new DescribeRenewalPriceResponseBodySubOrdersSubOrder();
            return TeaModel.build(map, self);
        }

        public DescribeRenewalPriceResponseBodySubOrdersSubOrder setDiscountAmount(Float discountAmount) {
            this.discountAmount = discountAmount;
            return this;
        }
        public Float getDiscountAmount() {
            return this.discountAmount;
        }

        public DescribeRenewalPriceResponseBodySubOrdersSubOrder setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeRenewalPriceResponseBodySubOrdersSubOrder setOriginalAmount(Float originalAmount) {
            this.originalAmount = originalAmount;
            return this;
        }
        public Float getOriginalAmount() {
            return this.originalAmount;
        }

        public DescribeRenewalPriceResponseBodySubOrdersSubOrder setRuleIds(DescribeRenewalPriceResponseBodySubOrdersSubOrderRuleIds ruleIds) {
            this.ruleIds = ruleIds;
            return this;
        }
        public DescribeRenewalPriceResponseBodySubOrdersSubOrderRuleIds getRuleIds() {
            return this.ruleIds;
        }

        public DescribeRenewalPriceResponseBodySubOrdersSubOrder setTradeAmount(Float tradeAmount) {
            this.tradeAmount = tradeAmount;
            return this;
        }
        public Float getTradeAmount() {
            return this.tradeAmount;
        }

    }

    public static class DescribeRenewalPriceResponseBodySubOrders extends TeaModel {
        @NameInMap("SubOrder")
        public java.util.List<DescribeRenewalPriceResponseBodySubOrdersSubOrder> subOrder;

        public static DescribeRenewalPriceResponseBodySubOrders build(java.util.Map<String, ?> map) throws Exception {
            DescribeRenewalPriceResponseBodySubOrders self = new DescribeRenewalPriceResponseBodySubOrders();
            return TeaModel.build(map, self);
        }

        public DescribeRenewalPriceResponseBodySubOrders setSubOrder(java.util.List<DescribeRenewalPriceResponseBodySubOrdersSubOrder> subOrder) {
            this.subOrder = subOrder;
            return this;
        }
        public java.util.List<DescribeRenewalPriceResponseBodySubOrdersSubOrder> getSubOrder() {
            return this.subOrder;
        }

    }

}
