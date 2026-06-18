// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class DescribeRatePlanPriceResponseBody extends TeaModel {
    /**
     * <p>The pricing information.</p>
     */
    @NameInMap("PriceModel")
    public DescribeRatePlanPriceResponseBodyPriceModel priceModel;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>50423A7F-A83D-1E24-B80E-86DD25790759</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeRatePlanPriceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRatePlanPriceResponseBody self = new DescribeRatePlanPriceResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRatePlanPriceResponseBody setPriceModel(DescribeRatePlanPriceResponseBodyPriceModel priceModel) {
        this.priceModel = priceModel;
        return this;
    }
    public DescribeRatePlanPriceResponseBodyPriceModel getPriceModel() {
        return this.priceModel;
    }

    public DescribeRatePlanPriceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeRatePlanPriceResponseBodyPriceModelRatePlanPlanPriceList extends TeaModel {
        @NameInMap("AccelerateType")
        public String accelerateType;

        @NameInMap("ChargeType")
        public String chargeType;

        @NameInMap("Coverages")
        public String coverages;

        @NameInMap("CrossborderTraffic")
        public String crossborderTraffic;

        @NameInMap("Currency")
        public String currency;

        @NameInMap("DcdnPlan")
        public String dcdnPlan;

        @NameInMap("DiscountPrice")
        public Float discountPrice;

        @NameInMap("EdgeCompute")
        public String edgeCompute;

        @NameInMap("EdgeDdos4Layer")
        public String edgeDdos4Layer;

        @NameInMap("EdgeDdos4LayerIntl")
        public String edgeDdos4LayerIntl;

        @NameInMap("EdgeDdos7Layer")
        public String edgeDdos7Layer;

        @NameInMap("EdgeDdosInstanceCn")
        public String edgeDdosInstanceCn;

        @NameInMap("EdgeDdosInstanceIntl")
        public String edgeDdosInstanceIntl;

        @NameInMap("EdgeLb4Layer")
        public String edgeLb4Layer;

        @NameInMap("EdgeLb4LayerIntl")
        public String edgeLb4LayerIntl;

        @NameInMap("EdgeLb7Layer")
        public String edgeLb7Layer;

        @NameInMap("EdgeWaf")
        public String edgeWaf;

        @NameInMap("EdgeWafInstance")
        public String edgeWafInstance;

        @NameInMap("Layer4Traffic")
        public String layer4Traffic;

        @NameInMap("Layer4TrafficIntl")
        public String layer4TrafficIntl;

        @NameInMap("PlanName")
        public String planName;

        @NameInMap("PlanStatus")
        public String planStatus;

        @NameInMap("PlanTraffic")
        public String planTraffic;

        @NameInMap("PlanType")
        public String planType;

        @NameInMap("Position")
        public Integer position;

        @NameInMap("Price")
        public Float price;

        @NameInMap("TotalPrice")
        public Float totalPrice;

        public static DescribeRatePlanPriceResponseBodyPriceModelRatePlanPlanPriceList build(java.util.Map<String, ?> map) throws Exception {
            DescribeRatePlanPriceResponseBodyPriceModelRatePlanPlanPriceList self = new DescribeRatePlanPriceResponseBodyPriceModelRatePlanPlanPriceList();
            return TeaModel.build(map, self);
        }

        public DescribeRatePlanPriceResponseBodyPriceModelRatePlanPlanPriceList setAccelerateType(String accelerateType) {
            this.accelerateType = accelerateType;
            return this;
        }
        public String getAccelerateType() {
            return this.accelerateType;
        }

        public DescribeRatePlanPriceResponseBodyPriceModelRatePlanPlanPriceList setChargeType(String chargeType) {
            this.chargeType = chargeType;
            return this;
        }
        public String getChargeType() {
            return this.chargeType;
        }

        public DescribeRatePlanPriceResponseBodyPriceModelRatePlanPlanPriceList setCoverages(String coverages) {
            this.coverages = coverages;
            return this;
        }
        public String getCoverages() {
            return this.coverages;
        }

        public DescribeRatePlanPriceResponseBodyPriceModelRatePlanPlanPriceList setCrossborderTraffic(String crossborderTraffic) {
            this.crossborderTraffic = crossborderTraffic;
            return this;
        }
        public String getCrossborderTraffic() {
            return this.crossborderTraffic;
        }

        public DescribeRatePlanPriceResponseBodyPriceModelRatePlanPlanPriceList setCurrency(String currency) {
            this.currency = currency;
            return this;
        }
        public String getCurrency() {
            return this.currency;
        }

        public DescribeRatePlanPriceResponseBodyPriceModelRatePlanPlanPriceList setDcdnPlan(String dcdnPlan) {
            this.dcdnPlan = dcdnPlan;
            return this;
        }
        public String getDcdnPlan() {
            return this.dcdnPlan;
        }

        public DescribeRatePlanPriceResponseBodyPriceModelRatePlanPlanPriceList setDiscountPrice(Float discountPrice) {
            this.discountPrice = discountPrice;
            return this;
        }
        public Float getDiscountPrice() {
            return this.discountPrice;
        }

        public DescribeRatePlanPriceResponseBodyPriceModelRatePlanPlanPriceList setEdgeCompute(String edgeCompute) {
            this.edgeCompute = edgeCompute;
            return this;
        }
        public String getEdgeCompute() {
            return this.edgeCompute;
        }

        public DescribeRatePlanPriceResponseBodyPriceModelRatePlanPlanPriceList setEdgeDdos4Layer(String edgeDdos4Layer) {
            this.edgeDdos4Layer = edgeDdos4Layer;
            return this;
        }
        public String getEdgeDdos4Layer() {
            return this.edgeDdos4Layer;
        }

        public DescribeRatePlanPriceResponseBodyPriceModelRatePlanPlanPriceList setEdgeDdos4LayerIntl(String edgeDdos4LayerIntl) {
            this.edgeDdos4LayerIntl = edgeDdos4LayerIntl;
            return this;
        }
        public String getEdgeDdos4LayerIntl() {
            return this.edgeDdos4LayerIntl;
        }

        public DescribeRatePlanPriceResponseBodyPriceModelRatePlanPlanPriceList setEdgeDdos7Layer(String edgeDdos7Layer) {
            this.edgeDdos7Layer = edgeDdos7Layer;
            return this;
        }
        public String getEdgeDdos7Layer() {
            return this.edgeDdos7Layer;
        }

        public DescribeRatePlanPriceResponseBodyPriceModelRatePlanPlanPriceList setEdgeDdosInstanceCn(String edgeDdosInstanceCn) {
            this.edgeDdosInstanceCn = edgeDdosInstanceCn;
            return this;
        }
        public String getEdgeDdosInstanceCn() {
            return this.edgeDdosInstanceCn;
        }

        public DescribeRatePlanPriceResponseBodyPriceModelRatePlanPlanPriceList setEdgeDdosInstanceIntl(String edgeDdosInstanceIntl) {
            this.edgeDdosInstanceIntl = edgeDdosInstanceIntl;
            return this;
        }
        public String getEdgeDdosInstanceIntl() {
            return this.edgeDdosInstanceIntl;
        }

        public DescribeRatePlanPriceResponseBodyPriceModelRatePlanPlanPriceList setEdgeLb4Layer(String edgeLb4Layer) {
            this.edgeLb4Layer = edgeLb4Layer;
            return this;
        }
        public String getEdgeLb4Layer() {
            return this.edgeLb4Layer;
        }

        public DescribeRatePlanPriceResponseBodyPriceModelRatePlanPlanPriceList setEdgeLb4LayerIntl(String edgeLb4LayerIntl) {
            this.edgeLb4LayerIntl = edgeLb4LayerIntl;
            return this;
        }
        public String getEdgeLb4LayerIntl() {
            return this.edgeLb4LayerIntl;
        }

        public DescribeRatePlanPriceResponseBodyPriceModelRatePlanPlanPriceList setEdgeLb7Layer(String edgeLb7Layer) {
            this.edgeLb7Layer = edgeLb7Layer;
            return this;
        }
        public String getEdgeLb7Layer() {
            return this.edgeLb7Layer;
        }

        public DescribeRatePlanPriceResponseBodyPriceModelRatePlanPlanPriceList setEdgeWaf(String edgeWaf) {
            this.edgeWaf = edgeWaf;
            return this;
        }
        public String getEdgeWaf() {
            return this.edgeWaf;
        }

        public DescribeRatePlanPriceResponseBodyPriceModelRatePlanPlanPriceList setEdgeWafInstance(String edgeWafInstance) {
            this.edgeWafInstance = edgeWafInstance;
            return this;
        }
        public String getEdgeWafInstance() {
            return this.edgeWafInstance;
        }

        public DescribeRatePlanPriceResponseBodyPriceModelRatePlanPlanPriceList setLayer4Traffic(String layer4Traffic) {
            this.layer4Traffic = layer4Traffic;
            return this;
        }
        public String getLayer4Traffic() {
            return this.layer4Traffic;
        }

        public DescribeRatePlanPriceResponseBodyPriceModelRatePlanPlanPriceList setLayer4TrafficIntl(String layer4TrafficIntl) {
            this.layer4TrafficIntl = layer4TrafficIntl;
            return this;
        }
        public String getLayer4TrafficIntl() {
            return this.layer4TrafficIntl;
        }

        public DescribeRatePlanPriceResponseBodyPriceModelRatePlanPlanPriceList setPlanName(String planName) {
            this.planName = planName;
            return this;
        }
        public String getPlanName() {
            return this.planName;
        }

        public DescribeRatePlanPriceResponseBodyPriceModelRatePlanPlanPriceList setPlanStatus(String planStatus) {
            this.planStatus = planStatus;
            return this;
        }
        public String getPlanStatus() {
            return this.planStatus;
        }

        public DescribeRatePlanPriceResponseBodyPriceModelRatePlanPlanPriceList setPlanTraffic(String planTraffic) {
            this.planTraffic = planTraffic;
            return this;
        }
        public String getPlanTraffic() {
            return this.planTraffic;
        }

        public DescribeRatePlanPriceResponseBodyPriceModelRatePlanPlanPriceList setPlanType(String planType) {
            this.planType = planType;
            return this;
        }
        public String getPlanType() {
            return this.planType;
        }

        public DescribeRatePlanPriceResponseBodyPriceModelRatePlanPlanPriceList setPosition(Integer position) {
            this.position = position;
            return this;
        }
        public Integer getPosition() {
            return this.position;
        }

        public DescribeRatePlanPriceResponseBodyPriceModelRatePlanPlanPriceList setPrice(Float price) {
            this.price = price;
            return this;
        }
        public Float getPrice() {
            return this.price;
        }

        public DescribeRatePlanPriceResponseBodyPriceModelRatePlanPlanPriceList setTotalPrice(Float totalPrice) {
            this.totalPrice = totalPrice;
            return this;
        }
        public Float getTotalPrice() {
            return this.totalPrice;
        }

    }

    public static class DescribeRatePlanPriceResponseBodyPriceModelRatePlan extends TeaModel {
        @NameInMap("PlanPriceList")
        public java.util.List<DescribeRatePlanPriceResponseBodyPriceModelRatePlanPlanPriceList> planPriceList;

        public static DescribeRatePlanPriceResponseBodyPriceModelRatePlan build(java.util.Map<String, ?> map) throws Exception {
            DescribeRatePlanPriceResponseBodyPriceModelRatePlan self = new DescribeRatePlanPriceResponseBodyPriceModelRatePlan();
            return TeaModel.build(map, self);
        }

        public DescribeRatePlanPriceResponseBodyPriceModelRatePlan setPlanPriceList(java.util.List<DescribeRatePlanPriceResponseBodyPriceModelRatePlanPlanPriceList> planPriceList) {
            this.planPriceList = planPriceList;
            return this;
        }
        public java.util.List<DescribeRatePlanPriceResponseBodyPriceModelRatePlanPlanPriceList> getPlanPriceList() {
            return this.planPriceList;
        }

    }

    public static class DescribeRatePlanPriceResponseBodyPriceModelRuleRuleList extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("RuleDescId")
        public Long ruleDescId;

        public static DescribeRatePlanPriceResponseBodyPriceModelRuleRuleList build(java.util.Map<String, ?> map) throws Exception {
            DescribeRatePlanPriceResponseBodyPriceModelRuleRuleList self = new DescribeRatePlanPriceResponseBodyPriceModelRuleRuleList();
            return TeaModel.build(map, self);
        }

        public DescribeRatePlanPriceResponseBodyPriceModelRuleRuleList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeRatePlanPriceResponseBodyPriceModelRuleRuleList setRuleDescId(Long ruleDescId) {
            this.ruleDescId = ruleDescId;
            return this;
        }
        public Long getRuleDescId() {
            return this.ruleDescId;
        }

    }

    public static class DescribeRatePlanPriceResponseBodyPriceModelRule extends TeaModel {
        @NameInMap("RuleList")
        public java.util.List<DescribeRatePlanPriceResponseBodyPriceModelRuleRuleList> ruleList;

        public static DescribeRatePlanPriceResponseBodyPriceModelRule build(java.util.Map<String, ?> map) throws Exception {
            DescribeRatePlanPriceResponseBodyPriceModelRule self = new DescribeRatePlanPriceResponseBodyPriceModelRule();
            return TeaModel.build(map, self);
        }

        public DescribeRatePlanPriceResponseBodyPriceModelRule setRuleList(java.util.List<DescribeRatePlanPriceResponseBodyPriceModelRuleRuleList> ruleList) {
            this.ruleList = ruleList;
            return this;
        }
        public java.util.List<DescribeRatePlanPriceResponseBodyPriceModelRuleRuleList> getRuleList() {
            return this.ruleList;
        }

    }

    public static class DescribeRatePlanPriceResponseBodyPriceModel extends TeaModel {
        @NameInMap("RatePlan")
        public DescribeRatePlanPriceResponseBodyPriceModelRatePlan ratePlan;

        @NameInMap("Rule")
        public DescribeRatePlanPriceResponseBodyPriceModelRule rule;

        public static DescribeRatePlanPriceResponseBodyPriceModel build(java.util.Map<String, ?> map) throws Exception {
            DescribeRatePlanPriceResponseBodyPriceModel self = new DescribeRatePlanPriceResponseBodyPriceModel();
            return TeaModel.build(map, self);
        }

        public DescribeRatePlanPriceResponseBodyPriceModel setRatePlan(DescribeRatePlanPriceResponseBodyPriceModelRatePlan ratePlan) {
            this.ratePlan = ratePlan;
            return this;
        }
        public DescribeRatePlanPriceResponseBodyPriceModelRatePlan getRatePlan() {
            return this.ratePlan;
        }

        public DescribeRatePlanPriceResponseBodyPriceModel setRule(DescribeRatePlanPriceResponseBodyPriceModelRule rule) {
            this.rule = rule;
            return this;
        }
        public DescribeRatePlanPriceResponseBodyPriceModelRule getRule() {
            return this.rule;
        }

    }

}
