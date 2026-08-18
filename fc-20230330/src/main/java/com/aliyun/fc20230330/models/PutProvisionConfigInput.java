// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class PutProvisionConfigInput extends TeaModel {
    /**
     * <p>Specifies whether to always allocate CPU. Default value: true.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("alwaysAllocateCPU")
    public Boolean alwaysAllocateCPU;

    /**
     * <p>Specifies whether to always allocate GPU. Default value: true.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("alwaysAllocateGPU")
    public Boolean alwaysAllocateGPU;

    /**
     * <p>The default minimum number of provisioned instances. Valid values: 0 to 10000.</p>
     * <blockquote>
     * <ul>
     * <li>If no metric-based auto elastic policy or scheduled elastic policy is configured, the current minimum number of instances equals the minimum number of instances you configured.</li>
     * <li>If you configured multiple elastic policies for the minimum number of instances, the system calculates the minimum number of instances triggered by each policy and uses the maximum value among the elastic policies that are effective at the current time as the current minimum number of instances.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("defaultTarget")
    public Long defaultTarget;

    /**
     * <p>The scheduled scaling configuration.</p>
     */
    @NameInMap("scheduledActions")
    public java.util.List<ScheduledAction> scheduledActions;

    /**
     * <blockquote>
     * <p>Notice: This parameter is no longer recommended. Use the defaultTarget parameter instead.</notice>
     * The target number of provisioned resources. Valid values: 0 to 10000.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("target")
    @Deprecated
    public Long target;

    /**
     * <p>The metric-based scaling policy configuration.</p>
     */
    @NameInMap("targetTrackingPolicies")
    public java.util.List<TargetTrackingPolicy> targetTrackingPolicies;

    public static PutProvisionConfigInput build(java.util.Map<String, ?> map) throws Exception {
        PutProvisionConfigInput self = new PutProvisionConfigInput();
        return TeaModel.build(map, self);
    }

    public PutProvisionConfigInput setAlwaysAllocateCPU(Boolean alwaysAllocateCPU) {
        this.alwaysAllocateCPU = alwaysAllocateCPU;
        return this;
    }
    public Boolean getAlwaysAllocateCPU() {
        return this.alwaysAllocateCPU;
    }

    public PutProvisionConfigInput setAlwaysAllocateGPU(Boolean alwaysAllocateGPU) {
        this.alwaysAllocateGPU = alwaysAllocateGPU;
        return this;
    }
    public Boolean getAlwaysAllocateGPU() {
        return this.alwaysAllocateGPU;
    }

    public PutProvisionConfigInput setDefaultTarget(Long defaultTarget) {
        this.defaultTarget = defaultTarget;
        return this;
    }
    public Long getDefaultTarget() {
        return this.defaultTarget;
    }

    public PutProvisionConfigInput setScheduledActions(java.util.List<ScheduledAction> scheduledActions) {
        this.scheduledActions = scheduledActions;
        return this;
    }
    public java.util.List<ScheduledAction> getScheduledActions() {
        return this.scheduledActions;
    }

    @Deprecated
    public PutProvisionConfigInput setTarget(Long target) {
        this.target = target;
        return this;
    }
    public Long getTarget() {
        return this.target;
    }

    public PutProvisionConfigInput setTargetTrackingPolicies(java.util.List<TargetTrackingPolicy> targetTrackingPolicies) {
        this.targetTrackingPolicies = targetTrackingPolicies;
        return this;
    }
    public java.util.List<TargetTrackingPolicy> getTargetTrackingPolicies() {
        return this.targetTrackingPolicies;
    }

}
