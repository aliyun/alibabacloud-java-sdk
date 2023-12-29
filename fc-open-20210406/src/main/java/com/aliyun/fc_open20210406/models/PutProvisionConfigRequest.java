// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class PutProvisionConfigRequest extends TeaModel {
    /**
     * <p>Specifies whether to always allocate CPU resources. Default value: true.</p>
     */
    @NameInMap("alwaysAllocateCPU")
    public Boolean alwaysAllocateCPU;

    /**
     * <p>The configurations of scheduled auto scaling.</p>
     */
    @NameInMap("scheduledActions")
    public java.util.List<ScheduledActions> scheduledActions;

    /**
     * <p>The number of target provisioned instances. Valid values: \[0,10000].</p>
     */
    @NameInMap("target")
    public Long target;

    /**
     * <p>The configurations of metric-based auto scaling.</p>
     */
    @NameInMap("targetTrackingPolicies")
    public java.util.List<TargetTrackingPolicies> targetTrackingPolicies;

    /**
     * <p>The service alias or latest version. Other versions are not supported.</p>
     */
    @NameInMap("qualifier")
    public String qualifier;

    public static PutProvisionConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        PutProvisionConfigRequest self = new PutProvisionConfigRequest();
        return TeaModel.build(map, self);
    }

    public PutProvisionConfigRequest setAlwaysAllocateCPU(Boolean alwaysAllocateCPU) {
        this.alwaysAllocateCPU = alwaysAllocateCPU;
        return this;
    }
    public Boolean getAlwaysAllocateCPU() {
        return this.alwaysAllocateCPU;
    }

    public PutProvisionConfigRequest setScheduledActions(java.util.List<ScheduledActions> scheduledActions) {
        this.scheduledActions = scheduledActions;
        return this;
    }
    public java.util.List<ScheduledActions> getScheduledActions() {
        return this.scheduledActions;
    }

    public PutProvisionConfigRequest setTarget(Long target) {
        this.target = target;
        return this;
    }
    public Long getTarget() {
        return this.target;
    }

    public PutProvisionConfigRequest setTargetTrackingPolicies(java.util.List<TargetTrackingPolicies> targetTrackingPolicies) {
        this.targetTrackingPolicies = targetTrackingPolicies;
        return this;
    }
    public java.util.List<TargetTrackingPolicies> getTargetTrackingPolicies() {
        return this.targetTrackingPolicies;
    }

    public PutProvisionConfigRequest setQualifier(String qualifier) {
        this.qualifier = qualifier;
        return this;
    }
    public String getQualifier() {
        return this.qualifier;
    }

}
