// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class ScalingConfigStatus extends TeaModel {
    @NameInMap("currentError")
    public String currentError;

    @NameInMap("currentInstances")
    public Long currentInstances;

    @NameInMap("functionArn")
    public String functionArn;

    @NameInMap("horizontalScalingPolicies")
    public java.util.List<ScalingPolicy> horizontalScalingPolicies;

    @NameInMap("minInstances")
    public Long minInstances;

    @NameInMap("residentPoolId")
    public String residentPoolId;

    @NameInMap("scheduledPolicies")
    public java.util.List<ScheduledPolicy> scheduledPolicies;

    @NameInMap("targetInstances")
    public Long targetInstances;

    public static ScalingConfigStatus build(java.util.Map<String, ?> map) throws Exception {
        ScalingConfigStatus self = new ScalingConfigStatus();
        return TeaModel.build(map, self);
    }

    public ScalingConfigStatus setCurrentError(String currentError) {
        this.currentError = currentError;
        return this;
    }
    public String getCurrentError() {
        return this.currentError;
    }

    public ScalingConfigStatus setCurrentInstances(Long currentInstances) {
        this.currentInstances = currentInstances;
        return this;
    }
    public Long getCurrentInstances() {
        return this.currentInstances;
    }

    public ScalingConfigStatus setFunctionArn(String functionArn) {
        this.functionArn = functionArn;
        return this;
    }
    public String getFunctionArn() {
        return this.functionArn;
    }

    public ScalingConfigStatus setHorizontalScalingPolicies(java.util.List<ScalingPolicy> horizontalScalingPolicies) {
        this.horizontalScalingPolicies = horizontalScalingPolicies;
        return this;
    }
    public java.util.List<ScalingPolicy> getHorizontalScalingPolicies() {
        return this.horizontalScalingPolicies;
    }

    public ScalingConfigStatus setMinInstances(Long minInstances) {
        this.minInstances = minInstances;
        return this;
    }
    public Long getMinInstances() {
        return this.minInstances;
    }

    public ScalingConfigStatus setResidentPoolId(String residentPoolId) {
        this.residentPoolId = residentPoolId;
        return this;
    }
    public String getResidentPoolId() {
        return this.residentPoolId;
    }

    public ScalingConfigStatus setScheduledPolicies(java.util.List<ScheduledPolicy> scheduledPolicies) {
        this.scheduledPolicies = scheduledPolicies;
        return this;
    }
    public java.util.List<ScheduledPolicy> getScheduledPolicies() {
        return this.scheduledPolicies;
    }

    public ScalingConfigStatus setTargetInstances(Long targetInstances) {
        this.targetInstances = targetInstances;
        return this;
    }
    public Long getTargetInstances() {
        return this.targetInstances;
    }

}
