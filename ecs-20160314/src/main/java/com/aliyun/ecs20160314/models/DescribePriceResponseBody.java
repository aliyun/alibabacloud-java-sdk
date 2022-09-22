// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class DescribePriceResponseBody extends TeaModel {
    @NameInMap("PriceInfo")
    public PriceInfo priceInfo;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribePriceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePriceResponseBody self = new DescribePriceResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePriceResponseBody setPriceInfo(PriceInfo priceInfo) {
        this.priceInfo = priceInfo;
        return this;
    }
    public PriceInfo getPriceInfo() {
        return this.priceInfo;
    }

    public DescribePriceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class Coupon extends TeaModel {
        @NameInMap("CouponNo")
        public String couponNo;

        @NameInMap("Description")
        public String description;

        @NameInMap("DiscountOff")
        public Float discountOff;

        @NameInMap("IsSelected")
        public Boolean isSelected;

        @NameInMap("Name")
        public String name;

        public static Coupon build(java.util.Map<String, ?> map) throws Exception {
            Coupon self = new Coupon();
            return TeaModel.build(map, self);
        }

        public Coupon setCouponNo(String couponNo) {
            this.couponNo = couponNo;
            return this;
        }
        public String getCouponNo() {
            return this.couponNo;
        }

        public Coupon setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public Coupon setDiscountOff(Float discountOff) {
            this.discountOff = discountOff;
            return this;
        }
        public Float getDiscountOff() {
            return this.discountOff;
        }

        public Coupon setIsSelected(Boolean isSelected) {
            this.isSelected = isSelected;
            return this;
        }
        public Boolean getIsSelected() {
            return this.isSelected;
        }

        public Coupon setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class Coupons extends TeaModel {
        @NameInMap("Coupon")
        public java.util.List<Coupon> coupon;

        public static Coupons build(java.util.Map<String, ?> map) throws Exception {
            Coupons self = new Coupons();
            return TeaModel.build(map, self);
        }

        public Coupons setCoupon(java.util.List<Coupon> coupon) {
            this.coupon = coupon;
            return this;
        }
        public java.util.List<Coupon> getCoupon() {
            return this.coupon;
        }

    }

    public static class Rule extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("RuleId")
        public Long ruleId;

        @NameInMap("Title")
        public String title;

        public static Rule build(java.util.Map<String, ?> map) throws Exception {
            Rule self = new Rule();
            return TeaModel.build(map, self);
        }

        public Rule setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public Rule setRuleId(Long ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public Long getRuleId() {
            return this.ruleId;
        }

        public Rule setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class SubRules extends TeaModel {
        @NameInMap("Rule")
        public java.util.List<Rule> rule;

        public static SubRules build(java.util.Map<String, ?> map) throws Exception {
            SubRules self = new SubRules();
            return TeaModel.build(map, self);
        }

        public SubRules setRule(java.util.List<Rule> rule) {
            this.rule = rule;
            return this;
        }
        public java.util.List<Rule> getRule() {
            return this.rule;
        }

    }

    public static class ResourcePriceModel extends TeaModel {
        @NameInMap("DiscountPrice")
        public Float discountPrice;

        @NameInMap("OriginalPrice")
        public Float originalPrice;

        @NameInMap("Resource")
        public String resource;

        @NameInMap("SubRules")
        public SubRules subRules;

        @NameInMap("TradePrice")
        public Float tradePrice;

        public static ResourcePriceModel build(java.util.Map<String, ?> map) throws Exception {
            ResourcePriceModel self = new ResourcePriceModel();
            return TeaModel.build(map, self);
        }

        public ResourcePriceModel setDiscountPrice(Float discountPrice) {
            this.discountPrice = discountPrice;
            return this;
        }
        public Float getDiscountPrice() {
            return this.discountPrice;
        }

        public ResourcePriceModel setOriginalPrice(Float originalPrice) {
            this.originalPrice = originalPrice;
            return this;
        }
        public Float getOriginalPrice() {
            return this.originalPrice;
        }

        public ResourcePriceModel setResource(String resource) {
            this.resource = resource;
            return this;
        }
        public String getResource() {
            return this.resource;
        }

        public ResourcePriceModel setSubRules(SubRules subRules) {
            this.subRules = subRules;
            return this;
        }
        public SubRules getSubRules() {
            return this.subRules;
        }

        public ResourcePriceModel setTradePrice(Float tradePrice) {
            this.tradePrice = tradePrice;
            return this;
        }
        public Float getTradePrice() {
            return this.tradePrice;
        }

    }

    public static class DetailInfos extends TeaModel {
        @NameInMap("ResourcePriceModel")
        public java.util.List<ResourcePriceModel> resourcePriceModel;

        public static DetailInfos build(java.util.Map<String, ?> map) throws Exception {
            DetailInfos self = new DetailInfos();
            return TeaModel.build(map, self);
        }

        public DetailInfos setResourcePriceModel(java.util.List<ResourcePriceModel> resourcePriceModel) {
            this.resourcePriceModel = resourcePriceModel;
            return this;
        }
        public java.util.List<ResourcePriceModel> getResourcePriceModel() {
            return this.resourcePriceModel;
        }

    }

    public static class RuleIdSet extends TeaModel {
        @NameInMap("RuleId")
        public java.util.List<String> ruleId;

        public static RuleIdSet build(java.util.Map<String, ?> map) throws Exception {
            RuleIdSet self = new RuleIdSet();
            return TeaModel.build(map, self);
        }

        public RuleIdSet setRuleId(java.util.List<String> ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public java.util.List<String> getRuleId() {
            return this.ruleId;
        }

    }

    public static class SubOrderRuleIdSet extends TeaModel {
        @NameInMap("RuleId")
        public java.util.List<String> ruleId;

        public static SubOrderRuleIdSet build(java.util.Map<String, ?> map) throws Exception {
            SubOrderRuleIdSet self = new SubOrderRuleIdSet();
            return TeaModel.build(map, self);
        }

        public SubOrderRuleIdSet setRuleId(java.util.List<String> ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public java.util.List<String> getRuleId() {
            return this.ruleId;
        }

    }

    public static class SubOrder extends TeaModel {
        @NameInMap("DiscountPrice")
        public Float discountPrice;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("OriginalPrice")
        public Float originalPrice;

        @NameInMap("RuleIdSet")
        public SubOrderRuleIdSet ruleIdSet;

        @NameInMap("TradePrice")
        public Float tradePrice;

        public static SubOrder build(java.util.Map<String, ?> map) throws Exception {
            SubOrder self = new SubOrder();
            return TeaModel.build(map, self);
        }

        public SubOrder setDiscountPrice(Float discountPrice) {
            this.discountPrice = discountPrice;
            return this;
        }
        public Float getDiscountPrice() {
            return this.discountPrice;
        }

        public SubOrder setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public SubOrder setOriginalPrice(Float originalPrice) {
            this.originalPrice = originalPrice;
            return this;
        }
        public Float getOriginalPrice() {
            return this.originalPrice;
        }

        public SubOrder setRuleIdSet(SubOrderRuleIdSet ruleIdSet) {
            this.ruleIdSet = ruleIdSet;
            return this;
        }
        public SubOrderRuleIdSet getRuleIdSet() {
            return this.ruleIdSet;
        }

        public SubOrder setTradePrice(Float tradePrice) {
            this.tradePrice = tradePrice;
            return this;
        }
        public Float getTradePrice() {
            return this.tradePrice;
        }

    }

    public static class SubOrders extends TeaModel {
        @NameInMap("SubOrder")
        public java.util.List<SubOrder> subOrder;

        public static SubOrders build(java.util.Map<String, ?> map) throws Exception {
            SubOrders self = new SubOrders();
            return TeaModel.build(map, self);
        }

        public SubOrders setSubOrder(java.util.List<SubOrder> subOrder) {
            this.subOrder = subOrder;
            return this;
        }
        public java.util.List<SubOrder> getSubOrder() {
            return this.subOrder;
        }

    }

    public static class Order extends TeaModel {
        @NameInMap("Coupons")
        public Coupons coupons;

        @NameInMap("Currency")
        public String currency;

        @NameInMap("DetailInfos")
        public DetailInfos detailInfos;

        @NameInMap("DiscountPrice")
        public Float discountPrice;

        @NameInMap("OriginalPrice")
        public Float originalPrice;

        @NameInMap("RuleIdSet")
        public RuleIdSet ruleIdSet;

        @NameInMap("SpotInstanceTypeOriginalPrice")
        public Float spotInstanceTypeOriginalPrice;

        @NameInMap("SpotInstanceTypePrice")
        public Float spotInstanceTypePrice;

        @NameInMap("SubOrders")
        public SubOrders subOrders;

        @NameInMap("TradePrice")
        public Float tradePrice;

        public static Order build(java.util.Map<String, ?> map) throws Exception {
            Order self = new Order();
            return TeaModel.build(map, self);
        }

        public Order setCoupons(Coupons coupons) {
            this.coupons = coupons;
            return this;
        }
        public Coupons getCoupons() {
            return this.coupons;
        }

        public Order setCurrency(String currency) {
            this.currency = currency;
            return this;
        }
        public String getCurrency() {
            return this.currency;
        }

        public Order setDetailInfos(DetailInfos detailInfos) {
            this.detailInfos = detailInfos;
            return this;
        }
        public DetailInfos getDetailInfos() {
            return this.detailInfos;
        }

        public Order setDiscountPrice(Float discountPrice) {
            this.discountPrice = discountPrice;
            return this;
        }
        public Float getDiscountPrice() {
            return this.discountPrice;
        }

        public Order setOriginalPrice(Float originalPrice) {
            this.originalPrice = originalPrice;
            return this;
        }
        public Float getOriginalPrice() {
            return this.originalPrice;
        }

        public Order setRuleIdSet(RuleIdSet ruleIdSet) {
            this.ruleIdSet = ruleIdSet;
            return this;
        }
        public RuleIdSet getRuleIdSet() {
            return this.ruleIdSet;
        }

        public Order setSpotInstanceTypeOriginalPrice(Float spotInstanceTypeOriginalPrice) {
            this.spotInstanceTypeOriginalPrice = spotInstanceTypeOriginalPrice;
            return this;
        }
        public Float getSpotInstanceTypeOriginalPrice() {
            return this.spotInstanceTypeOriginalPrice;
        }

        public Order setSpotInstanceTypePrice(Float spotInstanceTypePrice) {
            this.spotInstanceTypePrice = spotInstanceTypePrice;
            return this;
        }
        public Float getSpotInstanceTypePrice() {
            return this.spotInstanceTypePrice;
        }

        public Order setSubOrders(SubOrders subOrders) {
            this.subOrders = subOrders;
            return this;
        }
        public SubOrders getSubOrders() {
            return this.subOrders;
        }

        public Order setTradePrice(Float tradePrice) {
            this.tradePrice = tradePrice;
            return this;
        }
        public Float getTradePrice() {
            return this.tradePrice;
        }

    }

    public static class OrderParams extends TeaModel {
        @NameInMap("OrderParam")
        public java.util.List<String> orderParam;

        public static OrderParams build(java.util.Map<String, ?> map) throws Exception {
            OrderParams self = new OrderParams();
            return TeaModel.build(map, self);
        }

        public OrderParams setOrderParam(java.util.List<String> orderParam) {
            this.orderParam = orderParam;
            return this;
        }
        public java.util.List<String> getOrderParam() {
            return this.orderParam;
        }

    }

    public static class PriceWarning extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Msg")
        public String msg;

        public static PriceWarning build(java.util.Map<String, ?> map) throws Exception {
            PriceWarning self = new PriceWarning();
            return TeaModel.build(map, self);
        }

        public PriceWarning setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public PriceWarning setMsg(String msg) {
            this.msg = msg;
            return this;
        }
        public String getMsg() {
            return this.msg;
        }

    }

    public static class RulesRule extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("RuleId")
        public Long ruleId;

        @NameInMap("Title")
        public String title;

        public static RulesRule build(java.util.Map<String, ?> map) throws Exception {
            RulesRule self = new RulesRule();
            return TeaModel.build(map, self);
        }

        public RulesRule setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public RulesRule setRuleId(Long ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public Long getRuleId() {
            return this.ruleId;
        }

        public RulesRule setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class Rules extends TeaModel {
        @NameInMap("Rule")
        public java.util.List<RulesRule> rule;

        public static Rules build(java.util.Map<String, ?> map) throws Exception {
            Rules self = new Rules();
            return TeaModel.build(map, self);
        }

        public Rules setRule(java.util.List<RulesRule> rule) {
            this.rule = rule;
            return this;
        }
        public java.util.List<RulesRule> getRule() {
            return this.rule;
        }

    }

    public static class PriceInfo extends TeaModel {
        @NameInMap("Order")
        public Order order;

        @NameInMap("OrderParams")
        public OrderParams orderParams;

        @NameInMap("PriceWarning")
        public PriceWarning priceWarning;

        @NameInMap("Rules")
        public Rules rules;

        public static PriceInfo build(java.util.Map<String, ?> map) throws Exception {
            PriceInfo self = new PriceInfo();
            return TeaModel.build(map, self);
        }

        public PriceInfo setOrder(Order order) {
            this.order = order;
            return this;
        }
        public Order getOrder() {
            return this.order;
        }

        public PriceInfo setOrderParams(OrderParams orderParams) {
            this.orderParams = orderParams;
            return this;
        }
        public OrderParams getOrderParams() {
            return this.orderParams;
        }

        public PriceInfo setPriceWarning(PriceWarning priceWarning) {
            this.priceWarning = priceWarning;
            return this;
        }
        public PriceWarning getPriceWarning() {
            return this.priceWarning;
        }

        public PriceInfo setRules(Rules rules) {
            this.rules = rules;
            return this;
        }
        public Rules getRules() {
            return this.rules;
        }

    }

}
