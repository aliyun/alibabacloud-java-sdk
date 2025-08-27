// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class PutElasticConfigInput extends TeaModel {
    @NameInMap("minInstances")
    public Long minInstances;

    @NameInMap("residentPoolId")
    public String residentPoolId;

    @NameInMap("scalingPolicies")
    public java.util.List<ScalingPolicy> scalingPolicies;

    @NameInMap("scheduledPolicies")
    public java.util.List<ScheduledPolicy> scheduledPolicies;

    public static PutElasticConfigInput build(java.util.Map<String, ?> map) throws Exception {
        PutElasticConfigInput self = new PutElasticConfigInput();
        return TeaModel.build(map, self);
    }

    public PutElasticConfigInput setMinInstances(Long minInstances) {
        this.minInstances = minInstances;
        return this;
    }
    public Long getMinInstances() {
        return this.minInstances;
    }

    public PutElasticConfigInput setResidentPoolId(String residentPoolId) {
        this.residentPoolId = residentPoolId;
        return this;
    }
    public String getResidentPoolId() {
        return this.residentPoolId;
    }

    public PutElasticConfigInput setScalingPolicies(java.util.List<ScalingPolicy> scalingPolicies) {
        this.scalingPolicies = scalingPolicies;
        return this;
    }
    public java.util.List<ScalingPolicy> getScalingPolicies() {
        return this.scalingPolicies;
    }

    public PutElasticConfigInput setScheduledPolicies(java.util.List<ScheduledPolicy> scheduledPolicies) {
        this.scheduledPolicies = scheduledPolicies;
        return this;
    }
    public java.util.List<ScheduledPolicy> getScheduledPolicies() {
        return this.scheduledPolicies;
    }

}
