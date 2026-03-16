// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class ScalingConfig extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("minInstances")
    public Long minInstances;

    @NameInMap("scheduledPolicies")
    public java.util.List<ScheduledPolicy> scheduledPolicies;

    public static ScalingConfig build(java.util.Map<String, ?> map) throws Exception {
        ScalingConfig self = new ScalingConfig();
        return TeaModel.build(map, self);
    }

    public ScalingConfig setMinInstances(Long minInstances) {
        this.minInstances = minInstances;
        return this;
    }
    public Long getMinInstances() {
        return this.minInstances;
    }

    public ScalingConfig setScheduledPolicies(java.util.List<ScheduledPolicy> scheduledPolicies) {
        this.scheduledPolicies = scheduledPolicies;
        return this;
    }
    public java.util.List<ScheduledPolicy> getScheduledPolicies() {
        return this.scheduledPolicies;
    }

}
