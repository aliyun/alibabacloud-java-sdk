// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class PutScalingConfigInput extends TeaModel {
    @NameInMap("enableMixMode")
    public Boolean enableMixMode;

    @NameInMap("enableOnDemandScaling")
    public Boolean enableOnDemandScaling;

    @NameInMap("horizontalScalingPolicies")
    public java.util.List<ScalingPolicy> horizontalScalingPolicies;

    @NameInMap("minInstances")
    public Long minInstances;

    @NameInMap("requestDispatchPolicy")
    public String requestDispatchPolicy;

    @NameInMap("residentPoolId")
    public String residentPoolId;

    @NameInMap("scheduledPolicies")
    public java.util.List<ScheduledPolicy> scheduledPolicies;

    public static PutScalingConfigInput build(java.util.Map<String, ?> map) throws Exception {
        PutScalingConfigInput self = new PutScalingConfigInput();
        return TeaModel.build(map, self);
    }

    public PutScalingConfigInput setEnableMixMode(Boolean enableMixMode) {
        this.enableMixMode = enableMixMode;
        return this;
    }
    public Boolean getEnableMixMode() {
        return this.enableMixMode;
    }

    public PutScalingConfigInput setEnableOnDemandScaling(Boolean enableOnDemandScaling) {
        this.enableOnDemandScaling = enableOnDemandScaling;
        return this;
    }
    public Boolean getEnableOnDemandScaling() {
        return this.enableOnDemandScaling;
    }

    public PutScalingConfigInput setHorizontalScalingPolicies(java.util.List<ScalingPolicy> horizontalScalingPolicies) {
        this.horizontalScalingPolicies = horizontalScalingPolicies;
        return this;
    }
    public java.util.List<ScalingPolicy> getHorizontalScalingPolicies() {
        return this.horizontalScalingPolicies;
    }

    public PutScalingConfigInput setMinInstances(Long minInstances) {
        this.minInstances = minInstances;
        return this;
    }
    public Long getMinInstances() {
        return this.minInstances;
    }

    public PutScalingConfigInput setRequestDispatchPolicy(String requestDispatchPolicy) {
        this.requestDispatchPolicy = requestDispatchPolicy;
        return this;
    }
    public String getRequestDispatchPolicy() {
        return this.requestDispatchPolicy;
    }

    public PutScalingConfigInput setResidentPoolId(String residentPoolId) {
        this.residentPoolId = residentPoolId;
        return this;
    }
    public String getResidentPoolId() {
        return this.residentPoolId;
    }

    public PutScalingConfigInput setScheduledPolicies(java.util.List<ScheduledPolicy> scheduledPolicies) {
        this.scheduledPolicies = scheduledPolicies;
        return this;
    }
    public java.util.List<ScheduledPolicy> getScheduledPolicies() {
        return this.scheduledPolicies;
    }

}
