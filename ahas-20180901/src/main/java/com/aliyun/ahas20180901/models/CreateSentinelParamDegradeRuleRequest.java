// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class CreateSentinelParamDegradeRuleRequest extends TeaModel {
    @NameInMap("AppGroup")
    public String appGroup;

    @NameInMap("AppName")
    public String appName;

    @NameInMap("Count")
    public Double count;

    @NameInMap("Enable")
    public Boolean enable;

    @NameInMap("HalfOpenBaseAmountPerStep")
    public Integer halfOpenBaseAmountPerStep;

    @NameInMap("HalfOpenRecoveryStepNum")
    public Integer halfOpenRecoveryStepNum;

    @NameInMap("MinRequestAmount")
    public Integer minRequestAmount;

    @NameInMap("Model")
    public Long model;

    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("StatIntervalMs")
    public Integer statIntervalMs;

    @NameInMap("Tags")
    public String tags;

    @NameInMap("TimeWindow")
    public Integer timeWindow;

    public static CreateSentinelParamDegradeRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSentinelParamDegradeRuleRequest self = new CreateSentinelParamDegradeRuleRequest();
        return TeaModel.build(map, self);
    }

    public CreateSentinelParamDegradeRuleRequest setAppGroup(String appGroup) {
        this.appGroup = appGroup;
        return this;
    }
    public String getAppGroup() {
        return this.appGroup;
    }

    public CreateSentinelParamDegradeRuleRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public CreateSentinelParamDegradeRuleRequest setCount(Double count) {
        this.count = count;
        return this;
    }
    public Double getCount() {
        return this.count;
    }

    public CreateSentinelParamDegradeRuleRequest setEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }
    public Boolean getEnable() {
        return this.enable;
    }

    public CreateSentinelParamDegradeRuleRequest setHalfOpenBaseAmountPerStep(Integer halfOpenBaseAmountPerStep) {
        this.halfOpenBaseAmountPerStep = halfOpenBaseAmountPerStep;
        return this;
    }
    public Integer getHalfOpenBaseAmountPerStep() {
        return this.halfOpenBaseAmountPerStep;
    }

    public CreateSentinelParamDegradeRuleRequest setHalfOpenRecoveryStepNum(Integer halfOpenRecoveryStepNum) {
        this.halfOpenRecoveryStepNum = halfOpenRecoveryStepNum;
        return this;
    }
    public Integer getHalfOpenRecoveryStepNum() {
        return this.halfOpenRecoveryStepNum;
    }

    public CreateSentinelParamDegradeRuleRequest setMinRequestAmount(Integer minRequestAmount) {
        this.minRequestAmount = minRequestAmount;
        return this;
    }
    public Integer getMinRequestAmount() {
        return this.minRequestAmount;
    }

    public CreateSentinelParamDegradeRuleRequest setModel(Long model) {
        this.model = model;
        return this;
    }
    public Long getModel() {
        return this.model;
    }

    public CreateSentinelParamDegradeRuleRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public CreateSentinelParamDegradeRuleRequest setStatIntervalMs(Integer statIntervalMs) {
        this.statIntervalMs = statIntervalMs;
        return this;
    }
    public Integer getStatIntervalMs() {
        return this.statIntervalMs;
    }

    public CreateSentinelParamDegradeRuleRequest setTags(String tags) {
        this.tags = tags;
        return this;
    }
    public String getTags() {
        return this.tags;
    }

    public CreateSentinelParamDegradeRuleRequest setTimeWindow(Integer timeWindow) {
        this.timeWindow = timeWindow;
        return this;
    }
    public Integer getTimeWindow() {
        return this.timeWindow;
    }

}
