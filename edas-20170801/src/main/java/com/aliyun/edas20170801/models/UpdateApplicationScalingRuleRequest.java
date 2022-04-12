// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class UpdateApplicationScalingRuleRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("ScalingRuleEnable")
    public Boolean scalingRuleEnable;

    @NameInMap("ScalingRuleMetric")
    public String scalingRuleMetric;

    @NameInMap("ScalingRuleName")
    public String scalingRuleName;

    @NameInMap("ScalingRuleTimer")
    public String scalingRuleTimer;

    @NameInMap("ScalingRuleTrigger")
    public String scalingRuleTrigger;

    @NameInMap("ScalingRuleType")
    public String scalingRuleType;

    public static UpdateApplicationScalingRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateApplicationScalingRuleRequest self = new UpdateApplicationScalingRuleRequest();
        return TeaModel.build(map, self);
    }

    public UpdateApplicationScalingRuleRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public UpdateApplicationScalingRuleRequest setScalingRuleEnable(Boolean scalingRuleEnable) {
        this.scalingRuleEnable = scalingRuleEnable;
        return this;
    }
    public Boolean getScalingRuleEnable() {
        return this.scalingRuleEnable;
    }

    public UpdateApplicationScalingRuleRequest setScalingRuleMetric(String scalingRuleMetric) {
        this.scalingRuleMetric = scalingRuleMetric;
        return this;
    }
    public String getScalingRuleMetric() {
        return this.scalingRuleMetric;
    }

    public UpdateApplicationScalingRuleRequest setScalingRuleName(String scalingRuleName) {
        this.scalingRuleName = scalingRuleName;
        return this;
    }
    public String getScalingRuleName() {
        return this.scalingRuleName;
    }

    public UpdateApplicationScalingRuleRequest setScalingRuleTimer(String scalingRuleTimer) {
        this.scalingRuleTimer = scalingRuleTimer;
        return this;
    }
    public String getScalingRuleTimer() {
        return this.scalingRuleTimer;
    }

    public UpdateApplicationScalingRuleRequest setScalingRuleTrigger(String scalingRuleTrigger) {
        this.scalingRuleTrigger = scalingRuleTrigger;
        return this;
    }
    public String getScalingRuleTrigger() {
        return this.scalingRuleTrigger;
    }

    public UpdateApplicationScalingRuleRequest setScalingRuleType(String scalingRuleType) {
        this.scalingRuleType = scalingRuleType;
        return this;
    }
    public String getScalingRuleType() {
        return this.scalingRuleType;
    }

}
