// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas_openapi20190901.models;

import com.aliyun.tea.*;

public class ModifyFlowRuleRequest extends TeaModel {
    @NameInMap("AhasRegionId")
    public String ahasRegionId;

    @NameInMap("ControlBehavior")
    public String controlBehavior;

    @NameInMap("LimitOrigin")
    public String limitOrigin;

    @NameInMap("MaxQueueingTimeMs")
    public Integer maxQueueingTimeMs;

    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("RefResource")
    public String refResource;

    @NameInMap("RelationStrategy")
    public Integer relationStrategy;

    @NameInMap("RuleId")
    public Long ruleId;

    @NameInMap("Threshold")
    public Float threshold;

    @NameInMap("WarmUpPeriodSec")
    public Integer warmUpPeriodSec;

    public static ModifyFlowRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyFlowRuleRequest self = new ModifyFlowRuleRequest();
        return TeaModel.build(map, self);
    }

    public ModifyFlowRuleRequest setAhasRegionId(String ahasRegionId) {
        this.ahasRegionId = ahasRegionId;
        return this;
    }
    public String getAhasRegionId() {
        return this.ahasRegionId;
    }

    public ModifyFlowRuleRequest setControlBehavior(String controlBehavior) {
        this.controlBehavior = controlBehavior;
        return this;
    }
    public String getControlBehavior() {
        return this.controlBehavior;
    }

    public ModifyFlowRuleRequest setLimitOrigin(String limitOrigin) {
        this.limitOrigin = limitOrigin;
        return this;
    }
    public String getLimitOrigin() {
        return this.limitOrigin;
    }

    public ModifyFlowRuleRequest setMaxQueueingTimeMs(Integer maxQueueingTimeMs) {
        this.maxQueueingTimeMs = maxQueueingTimeMs;
        return this;
    }
    public Integer getMaxQueueingTimeMs() {
        return this.maxQueueingTimeMs;
    }

    public ModifyFlowRuleRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public ModifyFlowRuleRequest setRefResource(String refResource) {
        this.refResource = refResource;
        return this;
    }
    public String getRefResource() {
        return this.refResource;
    }

    public ModifyFlowRuleRequest setRelationStrategy(Integer relationStrategy) {
        this.relationStrategy = relationStrategy;
        return this;
    }
    public Integer getRelationStrategy() {
        return this.relationStrategy;
    }

    public ModifyFlowRuleRequest setRuleId(Long ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public Long getRuleId() {
        return this.ruleId;
    }

    public ModifyFlowRuleRequest setThreshold(Float threshold) {
        this.threshold = threshold;
        return this;
    }
    public Float getThreshold() {
        return this.threshold;
    }

    public ModifyFlowRuleRequest setWarmUpPeriodSec(Integer warmUpPeriodSec) {
        this.warmUpPeriodSec = warmUpPeriodSec;
        return this;
    }
    public Integer getWarmUpPeriodSec() {
        return this.warmUpPeriodSec;
    }

}
