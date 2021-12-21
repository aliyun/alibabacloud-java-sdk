// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas_openapi20190901.models;

import com.aliyun.tea.*;

public class ModifyIsolationRuleRequest extends TeaModel {
    @NameInMap("AhasRegionId")
    public String ahasRegionId;

    @NameInMap("LimitOrigin")
    public String limitOrigin;

    @NameInMap("RefResource")
    public String refResource;

    @NameInMap("RelationStrategy")
    public Integer relationStrategy;

    @NameInMap("RuleId")
    public Long ruleId;

    @NameInMap("Threshold")
    public Float threshold;

    public static ModifyIsolationRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyIsolationRuleRequest self = new ModifyIsolationRuleRequest();
        return TeaModel.build(map, self);
    }

    public ModifyIsolationRuleRequest setAhasRegionId(String ahasRegionId) {
        this.ahasRegionId = ahasRegionId;
        return this;
    }
    public String getAhasRegionId() {
        return this.ahasRegionId;
    }

    public ModifyIsolationRuleRequest setLimitOrigin(String limitOrigin) {
        this.limitOrigin = limitOrigin;
        return this;
    }
    public String getLimitOrigin() {
        return this.limitOrigin;
    }

    public ModifyIsolationRuleRequest setRefResource(String refResource) {
        this.refResource = refResource;
        return this;
    }
    public String getRefResource() {
        return this.refResource;
    }

    public ModifyIsolationRuleRequest setRelationStrategy(Integer relationStrategy) {
        this.relationStrategy = relationStrategy;
        return this;
    }
    public Integer getRelationStrategy() {
        return this.relationStrategy;
    }

    public ModifyIsolationRuleRequest setRuleId(Long ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public Long getRuleId() {
        return this.ruleId;
    }

    public ModifyIsolationRuleRequest setThreshold(Float threshold) {
        this.threshold = threshold;
        return this;
    }
    public Float getThreshold() {
        return this.threshold;
    }

}
