// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class ElasticConfigStatus extends TeaModel {
    @NameInMap("currentError")
    public String currentError;

    @NameInMap("currentInstances")
    public Long currentInstances;

    @NameInMap("functionArn")
    public String functionArn;

    @NameInMap("minInstances")
    public Long minInstances;

    @NameInMap("residentPoolId")
    public String residentPoolId;

    @NameInMap("scalingPolicies")
    public java.util.List<ScalingPolicy> scalingPolicies;

    @NameInMap("scheduledPolicies")
    public java.util.List<ScheduledPolicy> scheduledPolicies;

    public static ElasticConfigStatus build(java.util.Map<String, ?> map) throws Exception {
        ElasticConfigStatus self = new ElasticConfigStatus();
        return TeaModel.build(map, self);
    }

    public ElasticConfigStatus setCurrentError(String currentError) {
        this.currentError = currentError;
        return this;
    }
    public String getCurrentError() {
        return this.currentError;
    }

    public ElasticConfigStatus setCurrentInstances(Long currentInstances) {
        this.currentInstances = currentInstances;
        return this;
    }
    public Long getCurrentInstances() {
        return this.currentInstances;
    }

    public ElasticConfigStatus setFunctionArn(String functionArn) {
        this.functionArn = functionArn;
        return this;
    }
    public String getFunctionArn() {
        return this.functionArn;
    }

    public ElasticConfigStatus setMinInstances(Long minInstances) {
        this.minInstances = minInstances;
        return this;
    }
    public Long getMinInstances() {
        return this.minInstances;
    }

    public ElasticConfigStatus setResidentPoolId(String residentPoolId) {
        this.residentPoolId = residentPoolId;
        return this;
    }
    public String getResidentPoolId() {
        return this.residentPoolId;
    }

    public ElasticConfigStatus setScalingPolicies(java.util.List<ScalingPolicy> scalingPolicies) {
        this.scalingPolicies = scalingPolicies;
        return this;
    }
    public java.util.List<ScalingPolicy> getScalingPolicies() {
        return this.scalingPolicies;
    }

    public ElasticConfigStatus setScheduledPolicies(java.util.List<ScheduledPolicy> scheduledPolicies) {
        this.scheduledPolicies = scheduledPolicies;
        return this;
    }
    public java.util.List<ScheduledPolicy> getScheduledPolicies() {
        return this.scheduledPolicies;
    }

}
