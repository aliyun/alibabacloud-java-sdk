// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class EditSentinelParamDegradeRuleRequest extends TeaModel {
    @NameInMap("AppGroup")
    public String appGroup;

    @NameInMap("AppName")
    public String appName;

    @NameInMap("Count")
    public Double count;

    @NameInMap("HalfOpenBaseAmountPerStep")
    public Integer halfOpenBaseAmountPerStep;

    @NameInMap("HalfOpenRecoveryStepNum")
    public Integer halfOpenRecoveryStepNum;

    @NameInMap("Id")
    public Long id;

    @NameInMap("MinRequestAmount")
    public Integer minRequestAmount;

    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("StatIntervalMs")
    public Integer statIntervalMs;

    @NameInMap("Tags")
    public String tags;

    @NameInMap("TimeWindow")
    public Integer timeWindow;

    public static EditSentinelParamDegradeRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        EditSentinelParamDegradeRuleRequest self = new EditSentinelParamDegradeRuleRequest();
        return TeaModel.build(map, self);
    }

    public EditSentinelParamDegradeRuleRequest setAppGroup(String appGroup) {
        this.appGroup = appGroup;
        return this;
    }
    public String getAppGroup() {
        return this.appGroup;
    }

    public EditSentinelParamDegradeRuleRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public EditSentinelParamDegradeRuleRequest setCount(Double count) {
        this.count = count;
        return this;
    }
    public Double getCount() {
        return this.count;
    }

    public EditSentinelParamDegradeRuleRequest setHalfOpenBaseAmountPerStep(Integer halfOpenBaseAmountPerStep) {
        this.halfOpenBaseAmountPerStep = halfOpenBaseAmountPerStep;
        return this;
    }
    public Integer getHalfOpenBaseAmountPerStep() {
        return this.halfOpenBaseAmountPerStep;
    }

    public EditSentinelParamDegradeRuleRequest setHalfOpenRecoveryStepNum(Integer halfOpenRecoveryStepNum) {
        this.halfOpenRecoveryStepNum = halfOpenRecoveryStepNum;
        return this;
    }
    public Integer getHalfOpenRecoveryStepNum() {
        return this.halfOpenRecoveryStepNum;
    }

    public EditSentinelParamDegradeRuleRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public EditSentinelParamDegradeRuleRequest setMinRequestAmount(Integer minRequestAmount) {
        this.minRequestAmount = minRequestAmount;
        return this;
    }
    public Integer getMinRequestAmount() {
        return this.minRequestAmount;
    }

    public EditSentinelParamDegradeRuleRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public EditSentinelParamDegradeRuleRequest setStatIntervalMs(Integer statIntervalMs) {
        this.statIntervalMs = statIntervalMs;
        return this;
    }
    public Integer getStatIntervalMs() {
        return this.statIntervalMs;
    }

    public EditSentinelParamDegradeRuleRequest setTags(String tags) {
        this.tags = tags;
        return this;
    }
    public String getTags() {
        return this.tags;
    }

    public EditSentinelParamDegradeRuleRequest setTimeWindow(Integer timeWindow) {
        this.timeWindow = timeWindow;
        return this;
    }
    public Integer getTimeWindow() {
        return this.timeWindow;
    }

}
