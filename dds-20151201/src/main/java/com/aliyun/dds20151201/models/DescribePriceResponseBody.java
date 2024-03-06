// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class DescribePriceResponseBody extends TeaModel {
    /**
     * <p>The order.</p>
     */
    @NameInMap("Order")
    public DescribePriceResponseBodyOrder order;

    /**
     * <p>The order parameters.</p>
     * <br>
     * <p>> This parameter is returned only when the **OrderParamOut** parameter is set to **true**.</p>
     */
    @NameInMap("OrderParams")
    public String orderParams;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The promotion rules.</p>
     */
    @NameInMap("Rules")
    public DescribePriceResponseBodyRules rules;

    /**
     * <p>The coupon rules.</p>
     */
    @NameInMap("SubOrders")
    public DescribePriceResponseBodySubOrders subOrders;

    /**
     * <p>The ID of the trace.</p>
     */
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
        /**
         * <p>The activity type of the coupon. Valid values:</p>
         * <br>
         * <p>*   **payondemand**: subscription</p>
         * <p>*   **payasyougo**: pay-as-you-go</p>
         */
        @NameInMap("ActivityCategory")
        public String activityCategory;

        /**
         * <p>The coupon ID.</p>
         */
        @NameInMap("CouponNo")
        public String couponNo;

        /**
         * <p>The description of the coupon.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>Indicates whether the coupon was selected. Valid values:</p>
         * <br>
         * <p>*   **true**</p>
         * <p>*   **false**</p>
         */
        @NameInMap("IsSelected")
        public String isSelected;

        /**
         * <p>The coupon name.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The code of the coupon.</p>
         */
        @NameInMap("OptionCode")
        public String optionCode;

        /**
         * <p>The promotional option code.</p>
         */
        @NameInMap("PromotionOptionCode")
        public String promotionOptionCode;

        /**
         * <p>Details about the rules that match the coupon.</p>
         */
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

    public static class DescribePriceResponseBodyOrderDepreciateInfoContractActivityOptionIds extends TeaModel {
        @NameInMap("OptionId")
        public java.util.List<Long> optionId;

        public static DescribePriceResponseBodyOrderDepreciateInfoContractActivityOptionIds build(java.util.Map<String, ?> map) throws Exception {
            DescribePriceResponseBodyOrderDepreciateInfoContractActivityOptionIds self = new DescribePriceResponseBodyOrderDepreciateInfoContractActivityOptionIds();
            return TeaModel.build(map, self);
        }

        public DescribePriceResponseBodyOrderDepreciateInfoContractActivityOptionIds setOptionId(java.util.List<Long> optionId) {
            this.optionId = optionId;
            return this;
        }
        public java.util.List<Long> getOptionId() {
            return this.optionId;
        }

    }

    public static class DescribePriceResponseBodyOrderDepreciateInfoContractActivity extends TeaModel {
        @NameInMap("ActivityId")
        public Long activityId;

        @NameInMap("ActivityName")
        public String activityName;

        @NameInMap("FinalFee")
        public Double finalFee;

        @NameInMap("FinalPromFee")
        public Double finalPromFee;

        @NameInMap("OptionCode")
        public String optionCode;

        @NameInMap("OptionIds")
        public DescribePriceResponseBodyOrderDepreciateInfoContractActivityOptionIds optionIds;

        @NameInMap("ProdFee")
        public Double prodFee;

        public static DescribePriceResponseBodyOrderDepreciateInfoContractActivity build(java.util.Map<String, ?> map) throws Exception {
            DescribePriceResponseBodyOrderDepreciateInfoContractActivity self = new DescribePriceResponseBodyOrderDepreciateInfoContractActivity();
            return TeaModel.build(map, self);
        }

        public DescribePriceResponseBodyOrderDepreciateInfoContractActivity setActivityId(Long activityId) {
            this.activityId = activityId;
            return this;
        }
        public Long getActivityId() {
            return this.activityId;
        }

        public DescribePriceResponseBodyOrderDepreciateInfoContractActivity setActivityName(String activityName) {
            this.activityName = activityName;
            return this;
        }
        public String getActivityName() {
            return this.activityName;
        }

        public DescribePriceResponseBodyOrderDepreciateInfoContractActivity setFinalFee(Double finalFee) {
            this.finalFee = finalFee;
            return this;
        }
        public Double getFinalFee() {
            return this.finalFee;
        }

        public DescribePriceResponseBodyOrderDepreciateInfoContractActivity setFinalPromFee(Double finalPromFee) {
            this.finalPromFee = finalPromFee;
            return this;
        }
        public Double getFinalPromFee() {
            return this.finalPromFee;
        }

        public DescribePriceResponseBodyOrderDepreciateInfoContractActivity setOptionCode(String optionCode) {
            this.optionCode = optionCode;
            return this;
        }
        public String getOptionCode() {
            return this.optionCode;
        }

        public DescribePriceResponseBodyOrderDepreciateInfoContractActivity setOptionIds(DescribePriceResponseBodyOrderDepreciateInfoContractActivityOptionIds optionIds) {
            this.optionIds = optionIds;
            return this;
        }
        public DescribePriceResponseBodyOrderDepreciateInfoContractActivityOptionIds getOptionIds() {
            return this.optionIds;
        }

        public DescribePriceResponseBodyOrderDepreciateInfoContractActivity setProdFee(Double prodFee) {
            this.prodFee = prodFee;
            return this;
        }
        public Double getProdFee() {
            return this.prodFee;
        }

    }

    public static class DescribePriceResponseBodyOrderDepreciateInfo extends TeaModel {
        @NameInMap("CheapRate")
        public Double cheapRate;

        @NameInMap("CheapStandAmount")
        public Double cheapStandAmount;

        @NameInMap("ContractActivity")
        public DescribePriceResponseBodyOrderDepreciateInfoContractActivity contractActivity;

        @NameInMap("Differential")
        public Double differential;

        @NameInMap("DifferentialName")
        public String differentialName;

        @NameInMap("IsContractActivity")
        public Boolean isContractActivity;

        @NameInMap("IsShow")
        public String isShow;

        @NameInMap("ListPrice")
        public Double listPrice;

        @NameInMap("MonthPrice")
        public Double monthPrice;

        @NameInMap("OriginalStandAmount")
        public Double originalStandAmount;

        public static DescribePriceResponseBodyOrderDepreciateInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribePriceResponseBodyOrderDepreciateInfo self = new DescribePriceResponseBodyOrderDepreciateInfo();
            return TeaModel.build(map, self);
        }

        public DescribePriceResponseBodyOrderDepreciateInfo setCheapRate(Double cheapRate) {
            this.cheapRate = cheapRate;
            return this;
        }
        public Double getCheapRate() {
            return this.cheapRate;
        }

        public DescribePriceResponseBodyOrderDepreciateInfo setCheapStandAmount(Double cheapStandAmount) {
            this.cheapStandAmount = cheapStandAmount;
            return this;
        }
        public Double getCheapStandAmount() {
            return this.cheapStandAmount;
        }

        public DescribePriceResponseBodyOrderDepreciateInfo setContractActivity(DescribePriceResponseBodyOrderDepreciateInfoContractActivity contractActivity) {
            this.contractActivity = contractActivity;
            return this;
        }
        public DescribePriceResponseBodyOrderDepreciateInfoContractActivity getContractActivity() {
            return this.contractActivity;
        }

        public DescribePriceResponseBodyOrderDepreciateInfo setDifferential(Double differential) {
            this.differential = differential;
            return this;
        }
        public Double getDifferential() {
            return this.differential;
        }

        public DescribePriceResponseBodyOrderDepreciateInfo setDifferentialName(String differentialName) {
            this.differentialName = differentialName;
            return this;
        }
        public String getDifferentialName() {
            return this.differentialName;
        }

        public DescribePriceResponseBodyOrderDepreciateInfo setIsContractActivity(Boolean isContractActivity) {
            this.isContractActivity = isContractActivity;
            return this;
        }
        public Boolean getIsContractActivity() {
            return this.isContractActivity;
        }

        public DescribePriceResponseBodyOrderDepreciateInfo setIsShow(String isShow) {
            this.isShow = isShow;
            return this;
        }
        public String getIsShow() {
            return this.isShow;
        }

        public DescribePriceResponseBodyOrderDepreciateInfo setListPrice(Double listPrice) {
            this.listPrice = listPrice;
            return this;
        }
        public Double getListPrice() {
            return this.listPrice;
        }

        public DescribePriceResponseBodyOrderDepreciateInfo setMonthPrice(Double monthPrice) {
            this.monthPrice = monthPrice;
            return this;
        }
        public Double getMonthPrice() {
            return this.monthPrice;
        }

        public DescribePriceResponseBodyOrderDepreciateInfo setOriginalStandAmount(Double originalStandAmount) {
            this.originalStandAmount = originalStandAmount;
            return this;
        }
        public Double getOriginalStandAmount() {
            return this.originalStandAmount;
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
        @NameInMap("Code")
        public String code;

        @NameInMap("ContractActivity")
        public Boolean contractActivity;

        /**
         * <p>The information of coupons.</p>
         */
        @NameInMap("Coupons")
        public DescribePriceResponseBodyOrderCoupons coupons;

        /**
         * <p>The currency.</p>
         */
        @NameInMap("Currency")
        public String currency;

        @NameInMap("DepreciateInfo")
        public DescribePriceResponseBodyOrderDepreciateInfo depreciateInfo;

        /**
         * <p>The discount amount of the order.</p>
         */
        @NameInMap("DiscountAmount")
        public String discountAmount;

        @NameInMap("IsContractActivity")
        public Boolean isContractActivity;

        @NameInMap("Message")
        public String message;

        @NameInMap("OptionalPromotions")
        public String optionalPromotions;

        /**
         * <p>The original price of the order.</p>
         */
        @NameInMap("OriginalAmount")
        public String originalAmount;

        @NameInMap("PromDetailList")
        public String promDetailList;

        /**
         * <p>The rules of the order.</p>
         */
        @NameInMap("RuleIds")
        public DescribePriceResponseBodyOrderRuleIds ruleIds;

        /**
         * <p>Indicates whether the information of the discount is displayed.</p>
         */
        @NameInMap("ShowDiscountInfo")
        public Boolean showDiscountInfo;

        @NameInMap("StandDiscountPrice")
        public Double standDiscountPrice;

        @NameInMap("StandPrice")
        public Double standPrice;

        /**
         * <p>The final price of the order.</p>
         */
        @NameInMap("TradeAmount")
        public String tradeAmount;

        public static DescribePriceResponseBodyOrder build(java.util.Map<String, ?> map) throws Exception {
            DescribePriceResponseBodyOrder self = new DescribePriceResponseBodyOrder();
            return TeaModel.build(map, self);
        }

        public DescribePriceResponseBodyOrder setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public DescribePriceResponseBodyOrder setContractActivity(Boolean contractActivity) {
            this.contractActivity = contractActivity;
            return this;
        }
        public Boolean getContractActivity() {
            return this.contractActivity;
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

        public DescribePriceResponseBodyOrder setDepreciateInfo(DescribePriceResponseBodyOrderDepreciateInfo depreciateInfo) {
            this.depreciateInfo = depreciateInfo;
            return this;
        }
        public DescribePriceResponseBodyOrderDepreciateInfo getDepreciateInfo() {
            return this.depreciateInfo;
        }

        public DescribePriceResponseBodyOrder setDiscountAmount(String discountAmount) {
            this.discountAmount = discountAmount;
            return this;
        }
        public String getDiscountAmount() {
            return this.discountAmount;
        }

        public DescribePriceResponseBodyOrder setIsContractActivity(Boolean isContractActivity) {
            this.isContractActivity = isContractActivity;
            return this;
        }
        public Boolean getIsContractActivity() {
            return this.isContractActivity;
        }

        public DescribePriceResponseBodyOrder setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public DescribePriceResponseBodyOrder setOptionalPromotions(String optionalPromotions) {
            this.optionalPromotions = optionalPromotions;
            return this;
        }
        public String getOptionalPromotions() {
            return this.optionalPromotions;
        }

        public DescribePriceResponseBodyOrder setOriginalAmount(String originalAmount) {
            this.originalAmount = originalAmount;
            return this;
        }
        public String getOriginalAmount() {
            return this.originalAmount;
        }

        public DescribePriceResponseBodyOrder setPromDetailList(String promDetailList) {
            this.promDetailList = promDetailList;
            return this;
        }
        public String getPromDetailList() {
            return this.promDetailList;
        }

        public DescribePriceResponseBodyOrder setRuleIds(DescribePriceResponseBodyOrderRuleIds ruleIds) {
            this.ruleIds = ruleIds;
            return this;
        }
        public DescribePriceResponseBodyOrderRuleIds getRuleIds() {
            return this.ruleIds;
        }

        public DescribePriceResponseBodyOrder setShowDiscountInfo(Boolean showDiscountInfo) {
            this.showDiscountInfo = showDiscountInfo;
            return this;
        }
        public Boolean getShowDiscountInfo() {
            return this.showDiscountInfo;
        }

        public DescribePriceResponseBodyOrder setStandDiscountPrice(Double standDiscountPrice) {
            this.standDiscountPrice = standDiscountPrice;
            return this;
        }
        public Double getStandDiscountPrice() {
            return this.standDiscountPrice;
        }

        public DescribePriceResponseBodyOrder setStandPrice(Double standPrice) {
            this.standPrice = standPrice;
            return this;
        }
        public Double getStandPrice() {
            return this.standPrice;
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
        /**
         * <p>The rule name.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The rule ID.</p>
         */
        @NameInMap("RuleDescId")
        public Long ruleDescId;

        /**
         * <p>The rule title.</p>
         */
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

    public static class DescribePriceResponseBodySubOrdersSubOrderDepreciateInfoContractActivityOptionIds extends TeaModel {
        @NameInMap("OptionId")
        public java.util.List<Long> optionId;

        public static DescribePriceResponseBodySubOrdersSubOrderDepreciateInfoContractActivityOptionIds build(java.util.Map<String, ?> map) throws Exception {
            DescribePriceResponseBodySubOrdersSubOrderDepreciateInfoContractActivityOptionIds self = new DescribePriceResponseBodySubOrdersSubOrderDepreciateInfoContractActivityOptionIds();
            return TeaModel.build(map, self);
        }

        public DescribePriceResponseBodySubOrdersSubOrderDepreciateInfoContractActivityOptionIds setOptionId(java.util.List<Long> optionId) {
            this.optionId = optionId;
            return this;
        }
        public java.util.List<Long> getOptionId() {
            return this.optionId;
        }

    }

    public static class DescribePriceResponseBodySubOrdersSubOrderDepreciateInfoContractActivity extends TeaModel {
        @NameInMap("ActivityId")
        public Long activityId;

        @NameInMap("ActivityName")
        public String activityName;

        @NameInMap("FinalFee")
        public Double finalFee;

        @NameInMap("FinalPromFee")
        public Double finalPromFee;

        @NameInMap("OptionCode")
        public String optionCode;

        @NameInMap("OptionIds")
        public DescribePriceResponseBodySubOrdersSubOrderDepreciateInfoContractActivityOptionIds optionIds;

        @NameInMap("ProdFee")
        public Double prodFee;

        public static DescribePriceResponseBodySubOrdersSubOrderDepreciateInfoContractActivity build(java.util.Map<String, ?> map) throws Exception {
            DescribePriceResponseBodySubOrdersSubOrderDepreciateInfoContractActivity self = new DescribePriceResponseBodySubOrdersSubOrderDepreciateInfoContractActivity();
            return TeaModel.build(map, self);
        }

        public DescribePriceResponseBodySubOrdersSubOrderDepreciateInfoContractActivity setActivityId(Long activityId) {
            this.activityId = activityId;
            return this;
        }
        public Long getActivityId() {
            return this.activityId;
        }

        public DescribePriceResponseBodySubOrdersSubOrderDepreciateInfoContractActivity setActivityName(String activityName) {
            this.activityName = activityName;
            return this;
        }
        public String getActivityName() {
            return this.activityName;
        }

        public DescribePriceResponseBodySubOrdersSubOrderDepreciateInfoContractActivity setFinalFee(Double finalFee) {
            this.finalFee = finalFee;
            return this;
        }
        public Double getFinalFee() {
            return this.finalFee;
        }

        public DescribePriceResponseBodySubOrdersSubOrderDepreciateInfoContractActivity setFinalPromFee(Double finalPromFee) {
            this.finalPromFee = finalPromFee;
            return this;
        }
        public Double getFinalPromFee() {
            return this.finalPromFee;
        }

        public DescribePriceResponseBodySubOrdersSubOrderDepreciateInfoContractActivity setOptionCode(String optionCode) {
            this.optionCode = optionCode;
            return this;
        }
        public String getOptionCode() {
            return this.optionCode;
        }

        public DescribePriceResponseBodySubOrdersSubOrderDepreciateInfoContractActivity setOptionIds(DescribePriceResponseBodySubOrdersSubOrderDepreciateInfoContractActivityOptionIds optionIds) {
            this.optionIds = optionIds;
            return this;
        }
        public DescribePriceResponseBodySubOrdersSubOrderDepreciateInfoContractActivityOptionIds getOptionIds() {
            return this.optionIds;
        }

        public DescribePriceResponseBodySubOrdersSubOrderDepreciateInfoContractActivity setProdFee(Double prodFee) {
            this.prodFee = prodFee;
            return this;
        }
        public Double getProdFee() {
            return this.prodFee;
        }

    }

    public static class DescribePriceResponseBodySubOrdersSubOrderDepreciateInfo extends TeaModel {
        @NameInMap("CheapRate")
        public Double cheapRate;

        @NameInMap("CheapStandAmount")
        public Double cheapStandAmount;

        @NameInMap("ContractActivity")
        public DescribePriceResponseBodySubOrdersSubOrderDepreciateInfoContractActivity contractActivity;

        @NameInMap("Differential")
        public Double differential;

        @NameInMap("DifferentialName")
        public String differentialName;

        @NameInMap("IsContractActivity")
        public Boolean isContractActivity;

        @NameInMap("IsShow")
        public String isShow;

        @NameInMap("ListPrice")
        public Double listPrice;

        @NameInMap("MonthPrice")
        public Double monthPrice;

        @NameInMap("OriginalStandAmount")
        public Double originalStandAmount;

        public static DescribePriceResponseBodySubOrdersSubOrderDepreciateInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribePriceResponseBodySubOrdersSubOrderDepreciateInfo self = new DescribePriceResponseBodySubOrdersSubOrderDepreciateInfo();
            return TeaModel.build(map, self);
        }

        public DescribePriceResponseBodySubOrdersSubOrderDepreciateInfo setCheapRate(Double cheapRate) {
            this.cheapRate = cheapRate;
            return this;
        }
        public Double getCheapRate() {
            return this.cheapRate;
        }

        public DescribePriceResponseBodySubOrdersSubOrderDepreciateInfo setCheapStandAmount(Double cheapStandAmount) {
            this.cheapStandAmount = cheapStandAmount;
            return this;
        }
        public Double getCheapStandAmount() {
            return this.cheapStandAmount;
        }

        public DescribePriceResponseBodySubOrdersSubOrderDepreciateInfo setContractActivity(DescribePriceResponseBodySubOrdersSubOrderDepreciateInfoContractActivity contractActivity) {
            this.contractActivity = contractActivity;
            return this;
        }
        public DescribePriceResponseBodySubOrdersSubOrderDepreciateInfoContractActivity getContractActivity() {
            return this.contractActivity;
        }

        public DescribePriceResponseBodySubOrdersSubOrderDepreciateInfo setDifferential(Double differential) {
            this.differential = differential;
            return this;
        }
        public Double getDifferential() {
            return this.differential;
        }

        public DescribePriceResponseBodySubOrdersSubOrderDepreciateInfo setDifferentialName(String differentialName) {
            this.differentialName = differentialName;
            return this;
        }
        public String getDifferentialName() {
            return this.differentialName;
        }

        public DescribePriceResponseBodySubOrdersSubOrderDepreciateInfo setIsContractActivity(Boolean isContractActivity) {
            this.isContractActivity = isContractActivity;
            return this;
        }
        public Boolean getIsContractActivity() {
            return this.isContractActivity;
        }

        public DescribePriceResponseBodySubOrdersSubOrderDepreciateInfo setIsShow(String isShow) {
            this.isShow = isShow;
            return this;
        }
        public String getIsShow() {
            return this.isShow;
        }

        public DescribePriceResponseBodySubOrdersSubOrderDepreciateInfo setListPrice(Double listPrice) {
            this.listPrice = listPrice;
            return this;
        }
        public Double getListPrice() {
            return this.listPrice;
        }

        public DescribePriceResponseBodySubOrdersSubOrderDepreciateInfo setMonthPrice(Double monthPrice) {
            this.monthPrice = monthPrice;
            return this;
        }
        public Double getMonthPrice() {
            return this.monthPrice;
        }

        public DescribePriceResponseBodySubOrdersSubOrderDepreciateInfo setOriginalStandAmount(Double originalStandAmount) {
            this.originalStandAmount = originalStandAmount;
            return this;
        }
        public Double getOriginalStandAmount() {
            return this.originalStandAmount;
        }

    }

    public static class DescribePriceResponseBodySubOrdersSubOrderModuleInstanceModuleInstanceDepreciateInfo extends TeaModel {
        @NameInMap("CheapRate")
        public Double cheapRate;

        @NameInMap("CheapStandAmount")
        public Double cheapStandAmount;

        @NameInMap("Differential")
        public Double differential;

        @NameInMap("DifferentialName")
        public String differentialName;

        @NameInMap("IsContractActivity")
        public Boolean isContractActivity;

        @NameInMap("IsShow")
        public String isShow;

        @NameInMap("ListPrice")
        public Double listPrice;

        @NameInMap("MonthPrice")
        public Double monthPrice;

        @NameInMap("OriginalStandAmount")
        public Double originalStandAmount;

        public static DescribePriceResponseBodySubOrdersSubOrderModuleInstanceModuleInstanceDepreciateInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribePriceResponseBodySubOrdersSubOrderModuleInstanceModuleInstanceDepreciateInfo self = new DescribePriceResponseBodySubOrdersSubOrderModuleInstanceModuleInstanceDepreciateInfo();
            return TeaModel.build(map, self);
        }

        public DescribePriceResponseBodySubOrdersSubOrderModuleInstanceModuleInstanceDepreciateInfo setCheapRate(Double cheapRate) {
            this.cheapRate = cheapRate;
            return this;
        }
        public Double getCheapRate() {
            return this.cheapRate;
        }

        public DescribePriceResponseBodySubOrdersSubOrderModuleInstanceModuleInstanceDepreciateInfo setCheapStandAmount(Double cheapStandAmount) {
            this.cheapStandAmount = cheapStandAmount;
            return this;
        }
        public Double getCheapStandAmount() {
            return this.cheapStandAmount;
        }

        public DescribePriceResponseBodySubOrdersSubOrderModuleInstanceModuleInstanceDepreciateInfo setDifferential(Double differential) {
            this.differential = differential;
            return this;
        }
        public Double getDifferential() {
            return this.differential;
        }

        public DescribePriceResponseBodySubOrdersSubOrderModuleInstanceModuleInstanceDepreciateInfo setDifferentialName(String differentialName) {
            this.differentialName = differentialName;
            return this;
        }
        public String getDifferentialName() {
            return this.differentialName;
        }

        public DescribePriceResponseBodySubOrdersSubOrderModuleInstanceModuleInstanceDepreciateInfo setIsContractActivity(Boolean isContractActivity) {
            this.isContractActivity = isContractActivity;
            return this;
        }
        public Boolean getIsContractActivity() {
            return this.isContractActivity;
        }

        public DescribePriceResponseBodySubOrdersSubOrderModuleInstanceModuleInstanceDepreciateInfo setIsShow(String isShow) {
            this.isShow = isShow;
            return this;
        }
        public String getIsShow() {
            return this.isShow;
        }

        public DescribePriceResponseBodySubOrdersSubOrderModuleInstanceModuleInstanceDepreciateInfo setListPrice(Double listPrice) {
            this.listPrice = listPrice;
            return this;
        }
        public Double getListPrice() {
            return this.listPrice;
        }

        public DescribePriceResponseBodySubOrdersSubOrderModuleInstanceModuleInstanceDepreciateInfo setMonthPrice(Double monthPrice) {
            this.monthPrice = monthPrice;
            return this;
        }
        public Double getMonthPrice() {
            return this.monthPrice;
        }

        public DescribePriceResponseBodySubOrdersSubOrderModuleInstanceModuleInstanceDepreciateInfo setOriginalStandAmount(Double originalStandAmount) {
            this.originalStandAmount = originalStandAmount;
            return this;
        }
        public Double getOriginalStandAmount() {
            return this.originalStandAmount;
        }

    }

    public static class DescribePriceResponseBodySubOrdersSubOrderModuleInstanceModuleInstanceModuleAttrsModuleAttr extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Name")
        public String name;

        @NameInMap("Type")
        public String type;

        @NameInMap("Value")
        public String value;

        public static DescribePriceResponseBodySubOrdersSubOrderModuleInstanceModuleInstanceModuleAttrsModuleAttr build(java.util.Map<String, ?> map) throws Exception {
            DescribePriceResponseBodySubOrdersSubOrderModuleInstanceModuleInstanceModuleAttrsModuleAttr self = new DescribePriceResponseBodySubOrdersSubOrderModuleInstanceModuleInstanceModuleAttrsModuleAttr();
            return TeaModel.build(map, self);
        }

        public DescribePriceResponseBodySubOrdersSubOrderModuleInstanceModuleInstanceModuleAttrsModuleAttr setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public DescribePriceResponseBodySubOrdersSubOrderModuleInstanceModuleInstanceModuleAttrsModuleAttr setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribePriceResponseBodySubOrdersSubOrderModuleInstanceModuleInstanceModuleAttrsModuleAttr setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribePriceResponseBodySubOrdersSubOrderModuleInstanceModuleInstanceModuleAttrsModuleAttr setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribePriceResponseBodySubOrdersSubOrderModuleInstanceModuleInstanceModuleAttrs extends TeaModel {
        @NameInMap("moduleAttr")
        public java.util.List<DescribePriceResponseBodySubOrdersSubOrderModuleInstanceModuleInstanceModuleAttrsModuleAttr> moduleAttr;

        public static DescribePriceResponseBodySubOrdersSubOrderModuleInstanceModuleInstanceModuleAttrs build(java.util.Map<String, ?> map) throws Exception {
            DescribePriceResponseBodySubOrdersSubOrderModuleInstanceModuleInstanceModuleAttrs self = new DescribePriceResponseBodySubOrdersSubOrderModuleInstanceModuleInstanceModuleAttrs();
            return TeaModel.build(map, self);
        }

        public DescribePriceResponseBodySubOrdersSubOrderModuleInstanceModuleInstanceModuleAttrs setModuleAttr(java.util.List<DescribePriceResponseBodySubOrdersSubOrderModuleInstanceModuleInstanceModuleAttrsModuleAttr> moduleAttr) {
            this.moduleAttr = moduleAttr;
            return this;
        }
        public java.util.List<DescribePriceResponseBodySubOrdersSubOrderModuleInstanceModuleInstanceModuleAttrsModuleAttr> getModuleAttr() {
            return this.moduleAttr;
        }

    }

    public static class DescribePriceResponseBodySubOrdersSubOrderModuleInstanceModuleInstancePromDetailListPromDetal extends TeaModel {
        @NameInMap("ActivityExtInfo")
        public java.util.Map<String, ?> activityExtInfo;

        @NameInMap("DerivedPromType")
        public String derivedPromType;

        @NameInMap("FinalPromFee")
        public Double finalPromFee;

        @NameInMap("OptionCode")
        public String optionCode;

        @NameInMap("PromType")
        public String promType;

        @NameInMap("PromotionCode")
        public String promotionCode;

        @NameInMap("PromotionId")
        public Long promotionId;

        @NameInMap("PromotionName")
        public String promotionName;

        public static DescribePriceResponseBodySubOrdersSubOrderModuleInstanceModuleInstancePromDetailListPromDetal build(java.util.Map<String, ?> map) throws Exception {
            DescribePriceResponseBodySubOrdersSubOrderModuleInstanceModuleInstancePromDetailListPromDetal self = new DescribePriceResponseBodySubOrdersSubOrderModuleInstanceModuleInstancePromDetailListPromDetal();
            return TeaModel.build(map, self);
        }

        public DescribePriceResponseBodySubOrdersSubOrderModuleInstanceModuleInstancePromDetailListPromDetal setActivityExtInfo(java.util.Map<String, ?> activityExtInfo) {
            this.activityExtInfo = activityExtInfo;
            return this;
        }
        public java.util.Map<String, ?> getActivityExtInfo() {
            return this.activityExtInfo;
        }

        public DescribePriceResponseBodySubOrdersSubOrderModuleInstanceModuleInstancePromDetailListPromDetal setDerivedPromType(String derivedPromType) {
            this.derivedPromType = derivedPromType;
            return this;
        }
        public String getDerivedPromType() {
            return this.derivedPromType;
        }

        public DescribePriceResponseBodySubOrdersSubOrderModuleInstanceModuleInstancePromDetailListPromDetal setFinalPromFee(Double finalPromFee) {
            this.finalPromFee = finalPromFee;
            return this;
        }
        public Double getFinalPromFee() {
            return this.finalPromFee;
        }

        public DescribePriceResponseBodySubOrdersSubOrderModuleInstanceModuleInstancePromDetailListPromDetal setOptionCode(String optionCode) {
            this.optionCode = optionCode;
            return this;
        }
        public String getOptionCode() {
            return this.optionCode;
        }

        public DescribePriceResponseBodySubOrdersSubOrderModuleInstanceModuleInstancePromDetailListPromDetal setPromType(String promType) {
            this.promType = promType;
            return this;
        }
        public String getPromType() {
            return this.promType;
        }

        public DescribePriceResponseBodySubOrdersSubOrderModuleInstanceModuleInstancePromDetailListPromDetal setPromotionCode(String promotionCode) {
            this.promotionCode = promotionCode;
            return this;
        }
        public String getPromotionCode() {
            return this.promotionCode;
        }

        public DescribePriceResponseBodySubOrdersSubOrderModuleInstanceModuleInstancePromDetailListPromDetal setPromotionId(Long promotionId) {
            this.promotionId = promotionId;
            return this;
        }
        public Long getPromotionId() {
            return this.promotionId;
        }

        public DescribePriceResponseBodySubOrdersSubOrderModuleInstanceModuleInstancePromDetailListPromDetal setPromotionName(String promotionName) {
            this.promotionName = promotionName;
            return this;
        }
        public String getPromotionName() {
            return this.promotionName;
        }

    }

    public static class DescribePriceResponseBodySubOrdersSubOrderModuleInstanceModuleInstancePromDetailList extends TeaModel {
        @NameInMap("PromDetal")
        public java.util.List<DescribePriceResponseBodySubOrdersSubOrderModuleInstanceModuleInstancePromDetailListPromDetal> promDetal;

        public static DescribePriceResponseBodySubOrdersSubOrderModuleInstanceModuleInstancePromDetailList build(java.util.Map<String, ?> map) throws Exception {
            DescribePriceResponseBodySubOrdersSubOrderModuleInstanceModuleInstancePromDetailList self = new DescribePriceResponseBodySubOrdersSubOrderModuleInstanceModuleInstancePromDetailList();
            return TeaModel.build(map, self);
        }

        public DescribePriceResponseBodySubOrdersSubOrderModuleInstanceModuleInstancePromDetailList setPromDetal(java.util.List<DescribePriceResponseBodySubOrdersSubOrderModuleInstanceModuleInstancePromDetailListPromDetal> promDetal) {
            this.promDetal = promDetal;
            return this;
        }
        public java.util.List<DescribePriceResponseBodySubOrdersSubOrderModuleInstanceModuleInstancePromDetailListPromDetal> getPromDetal() {
            return this.promDetal;
        }

    }

    public static class DescribePriceResponseBodySubOrdersSubOrderModuleInstanceModuleInstance extends TeaModel {
        @NameInMap("ContractActivity")
        public Boolean contractActivity;

        @NameInMap("CycleFee")
        public String cycleFee;

        @NameInMap("DepreciateInfo")
        public DescribePriceResponseBodySubOrdersSubOrderModuleInstanceModuleInstanceDepreciateInfo depreciateInfo;

        @NameInMap("DiscountFee")
        public String discountFee;

        @NameInMap("ModuleAttrs")
        public DescribePriceResponseBodySubOrdersSubOrderModuleInstanceModuleInstanceModuleAttrs moduleAttrs;

        @NameInMap("ModuleCode")
        public String moduleCode;

        @NameInMap("ModuleId")
        public Long moduleId;

        @NameInMap("ModuleName")
        public String moduleName;

        @NameInMap("NeedOrderPay")
        public Boolean needOrderPay;

        @NameInMap("PayFee")
        public Double payFee;

        @NameInMap("PricingModule")
        public Boolean pricingModule;

        @NameInMap("PromDetailList")
        public DescribePriceResponseBodySubOrdersSubOrderModuleInstanceModuleInstancePromDetailList promDetailList;

        @NameInMap("StandPrice")
        public Double standPrice;

        @NameInMap("TotalProductFee")
        public Double totalProductFee;

        public static DescribePriceResponseBodySubOrdersSubOrderModuleInstanceModuleInstance build(java.util.Map<String, ?> map) throws Exception {
            DescribePriceResponseBodySubOrdersSubOrderModuleInstanceModuleInstance self = new DescribePriceResponseBodySubOrdersSubOrderModuleInstanceModuleInstance();
            return TeaModel.build(map, self);
        }

        public DescribePriceResponseBodySubOrdersSubOrderModuleInstanceModuleInstance setContractActivity(Boolean contractActivity) {
            this.contractActivity = contractActivity;
            return this;
        }
        public Boolean getContractActivity() {
            return this.contractActivity;
        }

        public DescribePriceResponseBodySubOrdersSubOrderModuleInstanceModuleInstance setCycleFee(String cycleFee) {
            this.cycleFee = cycleFee;
            return this;
        }
        public String getCycleFee() {
            return this.cycleFee;
        }

        public DescribePriceResponseBodySubOrdersSubOrderModuleInstanceModuleInstance setDepreciateInfo(DescribePriceResponseBodySubOrdersSubOrderModuleInstanceModuleInstanceDepreciateInfo depreciateInfo) {
            this.depreciateInfo = depreciateInfo;
            return this;
        }
        public DescribePriceResponseBodySubOrdersSubOrderModuleInstanceModuleInstanceDepreciateInfo getDepreciateInfo() {
            return this.depreciateInfo;
        }

        public DescribePriceResponseBodySubOrdersSubOrderModuleInstanceModuleInstance setDiscountFee(String discountFee) {
            this.discountFee = discountFee;
            return this;
        }
        public String getDiscountFee() {
            return this.discountFee;
        }

        public DescribePriceResponseBodySubOrdersSubOrderModuleInstanceModuleInstance setModuleAttrs(DescribePriceResponseBodySubOrdersSubOrderModuleInstanceModuleInstanceModuleAttrs moduleAttrs) {
            this.moduleAttrs = moduleAttrs;
            return this;
        }
        public DescribePriceResponseBodySubOrdersSubOrderModuleInstanceModuleInstanceModuleAttrs getModuleAttrs() {
            return this.moduleAttrs;
        }

        public DescribePriceResponseBodySubOrdersSubOrderModuleInstanceModuleInstance setModuleCode(String moduleCode) {
            this.moduleCode = moduleCode;
            return this;
        }
        public String getModuleCode() {
            return this.moduleCode;
        }

        public DescribePriceResponseBodySubOrdersSubOrderModuleInstanceModuleInstance setModuleId(Long moduleId) {
            this.moduleId = moduleId;
            return this;
        }
        public Long getModuleId() {
            return this.moduleId;
        }

        public DescribePriceResponseBodySubOrdersSubOrderModuleInstanceModuleInstance setModuleName(String moduleName) {
            this.moduleName = moduleName;
            return this;
        }
        public String getModuleName() {
            return this.moduleName;
        }

        public DescribePriceResponseBodySubOrdersSubOrderModuleInstanceModuleInstance setNeedOrderPay(Boolean needOrderPay) {
            this.needOrderPay = needOrderPay;
            return this;
        }
        public Boolean getNeedOrderPay() {
            return this.needOrderPay;
        }

        public DescribePriceResponseBodySubOrdersSubOrderModuleInstanceModuleInstance setPayFee(Double payFee) {
            this.payFee = payFee;
            return this;
        }
        public Double getPayFee() {
            return this.payFee;
        }

        public DescribePriceResponseBodySubOrdersSubOrderModuleInstanceModuleInstance setPricingModule(Boolean pricingModule) {
            this.pricingModule = pricingModule;
            return this;
        }
        public Boolean getPricingModule() {
            return this.pricingModule;
        }

        public DescribePriceResponseBodySubOrdersSubOrderModuleInstanceModuleInstance setPromDetailList(DescribePriceResponseBodySubOrdersSubOrderModuleInstanceModuleInstancePromDetailList promDetailList) {
            this.promDetailList = promDetailList;
            return this;
        }
        public DescribePriceResponseBodySubOrdersSubOrderModuleInstanceModuleInstancePromDetailList getPromDetailList() {
            return this.promDetailList;
        }

        public DescribePriceResponseBodySubOrdersSubOrderModuleInstanceModuleInstance setStandPrice(Double standPrice) {
            this.standPrice = standPrice;
            return this;
        }
        public Double getStandPrice() {
            return this.standPrice;
        }

        public DescribePriceResponseBodySubOrdersSubOrderModuleInstanceModuleInstance setTotalProductFee(Double totalProductFee) {
            this.totalProductFee = totalProductFee;
            return this;
        }
        public Double getTotalProductFee() {
            return this.totalProductFee;
        }

    }

    public static class DescribePriceResponseBodySubOrdersSubOrderModuleInstance extends TeaModel {
        @NameInMap("ModuleInstance")
        public java.util.List<DescribePriceResponseBodySubOrdersSubOrderModuleInstanceModuleInstance> moduleInstance;

        public static DescribePriceResponseBodySubOrdersSubOrderModuleInstance build(java.util.Map<String, ?> map) throws Exception {
            DescribePriceResponseBodySubOrdersSubOrderModuleInstance self = new DescribePriceResponseBodySubOrdersSubOrderModuleInstance();
            return TeaModel.build(map, self);
        }

        public DescribePriceResponseBodySubOrdersSubOrderModuleInstance setModuleInstance(java.util.List<DescribePriceResponseBodySubOrdersSubOrderModuleInstanceModuleInstance> moduleInstance) {
            this.moduleInstance = moduleInstance;
            return this;
        }
        public java.util.List<DescribePriceResponseBodySubOrdersSubOrderModuleInstanceModuleInstance> getModuleInstance() {
            return this.moduleInstance;
        }

    }

    public static class DescribePriceResponseBodySubOrdersSubOrderOptionalPromotionsOptionalPromotionTargetArticleItemCodes extends TeaModel {
        @NameInMap("targetArticleItemCode")
        public java.util.List<String> targetArticleItemCode;

        public static DescribePriceResponseBodySubOrdersSubOrderOptionalPromotionsOptionalPromotionTargetArticleItemCodes build(java.util.Map<String, ?> map) throws Exception {
            DescribePriceResponseBodySubOrdersSubOrderOptionalPromotionsOptionalPromotionTargetArticleItemCodes self = new DescribePriceResponseBodySubOrdersSubOrderOptionalPromotionsOptionalPromotionTargetArticleItemCodes();
            return TeaModel.build(map, self);
        }

        public DescribePriceResponseBodySubOrdersSubOrderOptionalPromotionsOptionalPromotionTargetArticleItemCodes setTargetArticleItemCode(java.util.List<String> targetArticleItemCode) {
            this.targetArticleItemCode = targetArticleItemCode;
            return this;
        }
        public java.util.List<String> getTargetArticleItemCode() {
            return this.targetArticleItemCode;
        }

    }

    public static class DescribePriceResponseBodySubOrdersSubOrderOptionalPromotionsOptionalPromotion extends TeaModel {
        @NameInMap("ActivityCategory")
        public String activityCategory;

        @NameInMap("ActivityExtInfo")
        public java.util.Map<String, ?> activityExtInfo;

        @NameInMap("CanPromFee")
        public Double canPromFee;

        @NameInMap("OptionCode")
        public String optionCode;

        @NameInMap("PromotionName")
        public String promotionName;

        @NameInMap("PromotionOptionNo")
        public String promotionOptionNo;

        @NameInMap("Selected")
        public Boolean selected;

        @NameInMap("Show")
        public Boolean show;

        @NameInMap("TargetArticleItemCodes")
        public DescribePriceResponseBodySubOrdersSubOrderOptionalPromotionsOptionalPromotionTargetArticleItemCodes targetArticleItemCodes;

        public static DescribePriceResponseBodySubOrdersSubOrderOptionalPromotionsOptionalPromotion build(java.util.Map<String, ?> map) throws Exception {
            DescribePriceResponseBodySubOrdersSubOrderOptionalPromotionsOptionalPromotion self = new DescribePriceResponseBodySubOrdersSubOrderOptionalPromotionsOptionalPromotion();
            return TeaModel.build(map, self);
        }

        public DescribePriceResponseBodySubOrdersSubOrderOptionalPromotionsOptionalPromotion setActivityCategory(String activityCategory) {
            this.activityCategory = activityCategory;
            return this;
        }
        public String getActivityCategory() {
            return this.activityCategory;
        }

        public DescribePriceResponseBodySubOrdersSubOrderOptionalPromotionsOptionalPromotion setActivityExtInfo(java.util.Map<String, ?> activityExtInfo) {
            this.activityExtInfo = activityExtInfo;
            return this;
        }
        public java.util.Map<String, ?> getActivityExtInfo() {
            return this.activityExtInfo;
        }

        public DescribePriceResponseBodySubOrdersSubOrderOptionalPromotionsOptionalPromotion setCanPromFee(Double canPromFee) {
            this.canPromFee = canPromFee;
            return this;
        }
        public Double getCanPromFee() {
            return this.canPromFee;
        }

        public DescribePriceResponseBodySubOrdersSubOrderOptionalPromotionsOptionalPromotion setOptionCode(String optionCode) {
            this.optionCode = optionCode;
            return this;
        }
        public String getOptionCode() {
            return this.optionCode;
        }

        public DescribePriceResponseBodySubOrdersSubOrderOptionalPromotionsOptionalPromotion setPromotionName(String promotionName) {
            this.promotionName = promotionName;
            return this;
        }
        public String getPromotionName() {
            return this.promotionName;
        }

        public DescribePriceResponseBodySubOrdersSubOrderOptionalPromotionsOptionalPromotion setPromotionOptionNo(String promotionOptionNo) {
            this.promotionOptionNo = promotionOptionNo;
            return this;
        }
        public String getPromotionOptionNo() {
            return this.promotionOptionNo;
        }

        public DescribePriceResponseBodySubOrdersSubOrderOptionalPromotionsOptionalPromotion setSelected(Boolean selected) {
            this.selected = selected;
            return this;
        }
        public Boolean getSelected() {
            return this.selected;
        }

        public DescribePriceResponseBodySubOrdersSubOrderOptionalPromotionsOptionalPromotion setShow(Boolean show) {
            this.show = show;
            return this;
        }
        public Boolean getShow() {
            return this.show;
        }

        public DescribePriceResponseBodySubOrdersSubOrderOptionalPromotionsOptionalPromotion setTargetArticleItemCodes(DescribePriceResponseBodySubOrdersSubOrderOptionalPromotionsOptionalPromotionTargetArticleItemCodes targetArticleItemCodes) {
            this.targetArticleItemCodes = targetArticleItemCodes;
            return this;
        }
        public DescribePriceResponseBodySubOrdersSubOrderOptionalPromotionsOptionalPromotionTargetArticleItemCodes getTargetArticleItemCodes() {
            return this.targetArticleItemCodes;
        }

    }

    public static class DescribePriceResponseBodySubOrdersSubOrderOptionalPromotions extends TeaModel {
        @NameInMap("OptionalPromotion")
        public java.util.List<DescribePriceResponseBodySubOrdersSubOrderOptionalPromotionsOptionalPromotion> optionalPromotion;

        public static DescribePriceResponseBodySubOrdersSubOrderOptionalPromotions build(java.util.Map<String, ?> map) throws Exception {
            DescribePriceResponseBodySubOrdersSubOrderOptionalPromotions self = new DescribePriceResponseBodySubOrdersSubOrderOptionalPromotions();
            return TeaModel.build(map, self);
        }

        public DescribePriceResponseBodySubOrdersSubOrderOptionalPromotions setOptionalPromotion(java.util.List<DescribePriceResponseBodySubOrdersSubOrderOptionalPromotionsOptionalPromotion> optionalPromotion) {
            this.optionalPromotion = optionalPromotion;
            return this;
        }
        public java.util.List<DescribePriceResponseBodySubOrdersSubOrderOptionalPromotionsOptionalPromotion> getOptionalPromotion() {
            return this.optionalPromotion;
        }

    }

    public static class DescribePriceResponseBodySubOrdersSubOrderPromDetailListPromDetal extends TeaModel {
        @NameInMap("ActivityExtInfo")
        public java.util.Map<String, ?> activityExtInfo;

        @NameInMap("DerivedPromType")
        public String derivedPromType;

        @NameInMap("FinalPromFee")
        public Double finalPromFee;

        @NameInMap("OptionCode")
        public String optionCode;

        @NameInMap("PromType")
        public String promType;

        @NameInMap("PromotionCode")
        public String promotionCode;

        @NameInMap("PromotionId")
        public Long promotionId;

        @NameInMap("PromotionName")
        public String promotionName;

        public static DescribePriceResponseBodySubOrdersSubOrderPromDetailListPromDetal build(java.util.Map<String, ?> map) throws Exception {
            DescribePriceResponseBodySubOrdersSubOrderPromDetailListPromDetal self = new DescribePriceResponseBodySubOrdersSubOrderPromDetailListPromDetal();
            return TeaModel.build(map, self);
        }

        public DescribePriceResponseBodySubOrdersSubOrderPromDetailListPromDetal setActivityExtInfo(java.util.Map<String, ?> activityExtInfo) {
            this.activityExtInfo = activityExtInfo;
            return this;
        }
        public java.util.Map<String, ?> getActivityExtInfo() {
            return this.activityExtInfo;
        }

        public DescribePriceResponseBodySubOrdersSubOrderPromDetailListPromDetal setDerivedPromType(String derivedPromType) {
            this.derivedPromType = derivedPromType;
            return this;
        }
        public String getDerivedPromType() {
            return this.derivedPromType;
        }

        public DescribePriceResponseBodySubOrdersSubOrderPromDetailListPromDetal setFinalPromFee(Double finalPromFee) {
            this.finalPromFee = finalPromFee;
            return this;
        }
        public Double getFinalPromFee() {
            return this.finalPromFee;
        }

        public DescribePriceResponseBodySubOrdersSubOrderPromDetailListPromDetal setOptionCode(String optionCode) {
            this.optionCode = optionCode;
            return this;
        }
        public String getOptionCode() {
            return this.optionCode;
        }

        public DescribePriceResponseBodySubOrdersSubOrderPromDetailListPromDetal setPromType(String promType) {
            this.promType = promType;
            return this;
        }
        public String getPromType() {
            return this.promType;
        }

        public DescribePriceResponseBodySubOrdersSubOrderPromDetailListPromDetal setPromotionCode(String promotionCode) {
            this.promotionCode = promotionCode;
            return this;
        }
        public String getPromotionCode() {
            return this.promotionCode;
        }

        public DescribePriceResponseBodySubOrdersSubOrderPromDetailListPromDetal setPromotionId(Long promotionId) {
            this.promotionId = promotionId;
            return this;
        }
        public Long getPromotionId() {
            return this.promotionId;
        }

        public DescribePriceResponseBodySubOrdersSubOrderPromDetailListPromDetal setPromotionName(String promotionName) {
            this.promotionName = promotionName;
            return this;
        }
        public String getPromotionName() {
            return this.promotionName;
        }

    }

    public static class DescribePriceResponseBodySubOrdersSubOrderPromDetailList extends TeaModel {
        @NameInMap("PromDetal")
        public java.util.List<DescribePriceResponseBodySubOrdersSubOrderPromDetailListPromDetal> promDetal;

        public static DescribePriceResponseBodySubOrdersSubOrderPromDetailList build(java.util.Map<String, ?> map) throws Exception {
            DescribePriceResponseBodySubOrdersSubOrderPromDetailList self = new DescribePriceResponseBodySubOrdersSubOrderPromDetailList();
            return TeaModel.build(map, self);
        }

        public DescribePriceResponseBodySubOrdersSubOrderPromDetailList setPromDetal(java.util.List<DescribePriceResponseBodySubOrdersSubOrderPromDetailListPromDetal> promDetal) {
            this.promDetal = promDetal;
            return this;
        }
        public java.util.List<DescribePriceResponseBodySubOrdersSubOrderPromDetailListPromDetal> getPromDetal() {
            return this.promDetal;
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
        @NameInMap("ContractActivity")
        public Boolean contractActivity;

        @NameInMap("DepreciateInfo")
        public DescribePriceResponseBodySubOrdersSubOrderDepreciateInfo depreciateInfo;

        /**
         * <p>The discount amount of the order.</p>
         */
        @NameInMap("DiscountAmount")
        public String discountAmount;

        /**
         * <p>The instance ID.</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("IsContractActivity")
        public Boolean isContractActivity;

        @NameInMap("IsNewOfficialActivity")
        public String isNewOfficialActivity;

        @NameInMap("ModuleInstance")
        public DescribePriceResponseBodySubOrdersSubOrderModuleInstance moduleInstance;

        @NameInMap("OptionalPromotions")
        public DescribePriceResponseBodySubOrdersSubOrderOptionalPromotions optionalPromotions;

        /**
         * <p>The list price of the order.</p>
         */
        @NameInMap("OriginalAmount")
        public String originalAmount;

        @NameInMap("PromDetailList")
        public DescribePriceResponseBodySubOrdersSubOrderPromDetailList promDetailList;

        /**
         * <p>The promotion rules.</p>
         */
        @NameInMap("RuleIds")
        public DescribePriceResponseBodySubOrdersSubOrderRuleIds ruleIds;

        @NameInMap("StandDiscountPrice")
        public Double standDiscountPrice;

        @NameInMap("StandPrice")
        public Double standPrice;

        /**
         * <p>The actual price of the order.</p>
         */
        @NameInMap("TradeAmount")
        public String tradeAmount;

        public static DescribePriceResponseBodySubOrdersSubOrder build(java.util.Map<String, ?> map) throws Exception {
            DescribePriceResponseBodySubOrdersSubOrder self = new DescribePriceResponseBodySubOrdersSubOrder();
            return TeaModel.build(map, self);
        }

        public DescribePriceResponseBodySubOrdersSubOrder setContractActivity(Boolean contractActivity) {
            this.contractActivity = contractActivity;
            return this;
        }
        public Boolean getContractActivity() {
            return this.contractActivity;
        }

        public DescribePriceResponseBodySubOrdersSubOrder setDepreciateInfo(DescribePriceResponseBodySubOrdersSubOrderDepreciateInfo depreciateInfo) {
            this.depreciateInfo = depreciateInfo;
            return this;
        }
        public DescribePriceResponseBodySubOrdersSubOrderDepreciateInfo getDepreciateInfo() {
            return this.depreciateInfo;
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

        public DescribePriceResponseBodySubOrdersSubOrder setIsContractActivity(Boolean isContractActivity) {
            this.isContractActivity = isContractActivity;
            return this;
        }
        public Boolean getIsContractActivity() {
            return this.isContractActivity;
        }

        public DescribePriceResponseBodySubOrdersSubOrder setIsNewOfficialActivity(String isNewOfficialActivity) {
            this.isNewOfficialActivity = isNewOfficialActivity;
            return this;
        }
        public String getIsNewOfficialActivity() {
            return this.isNewOfficialActivity;
        }

        public DescribePriceResponseBodySubOrdersSubOrder setModuleInstance(DescribePriceResponseBodySubOrdersSubOrderModuleInstance moduleInstance) {
            this.moduleInstance = moduleInstance;
            return this;
        }
        public DescribePriceResponseBodySubOrdersSubOrderModuleInstance getModuleInstance() {
            return this.moduleInstance;
        }

        public DescribePriceResponseBodySubOrdersSubOrder setOptionalPromotions(DescribePriceResponseBodySubOrdersSubOrderOptionalPromotions optionalPromotions) {
            this.optionalPromotions = optionalPromotions;
            return this;
        }
        public DescribePriceResponseBodySubOrdersSubOrderOptionalPromotions getOptionalPromotions() {
            return this.optionalPromotions;
        }

        public DescribePriceResponseBodySubOrdersSubOrder setOriginalAmount(String originalAmount) {
            this.originalAmount = originalAmount;
            return this;
        }
        public String getOriginalAmount() {
            return this.originalAmount;
        }

        public DescribePriceResponseBodySubOrdersSubOrder setPromDetailList(DescribePriceResponseBodySubOrdersSubOrderPromDetailList promDetailList) {
            this.promDetailList = promDetailList;
            return this;
        }
        public DescribePriceResponseBodySubOrdersSubOrderPromDetailList getPromDetailList() {
            return this.promDetailList;
        }

        public DescribePriceResponseBodySubOrdersSubOrder setRuleIds(DescribePriceResponseBodySubOrdersSubOrderRuleIds ruleIds) {
            this.ruleIds = ruleIds;
            return this;
        }
        public DescribePriceResponseBodySubOrdersSubOrderRuleIds getRuleIds() {
            return this.ruleIds;
        }

        public DescribePriceResponseBodySubOrdersSubOrder setStandDiscountPrice(Double standDiscountPrice) {
            this.standDiscountPrice = standDiscountPrice;
            return this;
        }
        public Double getStandDiscountPrice() {
            return this.standDiscountPrice;
        }

        public DescribePriceResponseBodySubOrdersSubOrder setStandPrice(Double standPrice) {
            this.standPrice = standPrice;
            return this;
        }
        public Double getStandPrice() {
            return this.standPrice;
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
