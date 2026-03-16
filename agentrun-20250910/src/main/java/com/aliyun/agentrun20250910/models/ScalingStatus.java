// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class ScalingStatus extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>error</p>
     */
    @NameInMap("currentError")
    public String currentError;

    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("currentInstances")
    public Long currentInstances;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("minInstances")
    public Long minInstances;

    @NameInMap("scheduledPolicies")
    public java.util.List<ScheduledPolicy> scheduledPolicies;

    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("targetInstances")
    public Long targetInstances;

    public static ScalingStatus build(java.util.Map<String, ?> map) throws Exception {
        ScalingStatus self = new ScalingStatus();
        return TeaModel.build(map, self);
    }

    public ScalingStatus setCurrentError(String currentError) {
        this.currentError = currentError;
        return this;
    }
    public String getCurrentError() {
        return this.currentError;
    }

    public ScalingStatus setCurrentInstances(Long currentInstances) {
        this.currentInstances = currentInstances;
        return this;
    }
    public Long getCurrentInstances() {
        return this.currentInstances;
    }

    public ScalingStatus setMinInstances(Long minInstances) {
        this.minInstances = minInstances;
        return this;
    }
    public Long getMinInstances() {
        return this.minInstances;
    }

    public ScalingStatus setScheduledPolicies(java.util.List<ScheduledPolicy> scheduledPolicies) {
        this.scheduledPolicies = scheduledPolicies;
        return this;
    }
    public java.util.List<ScheduledPolicy> getScheduledPolicies() {
        return this.scheduledPolicies;
    }

    public ScalingStatus setTargetInstances(Long targetInstances) {
        this.targetInstances = targetInstances;
        return this;
    }
    public Long getTargetInstances() {
        return this.targetInstances;
    }

}
