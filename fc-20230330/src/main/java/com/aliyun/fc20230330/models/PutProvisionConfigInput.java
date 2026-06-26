// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class PutProvisionConfigInput extends TeaModel {
    /**
     * <p>是否始终分配CPU，默认为true。</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("alwaysAllocateCPU")
    public Boolean alwaysAllocateCPU;

    /**
     * <p>是否始终分配GPU，默认为true。</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("alwaysAllocateGPU")
    public Boolean alwaysAllocateGPU;

    /**
     * <p>The number of target provisioned instances. Valid values: [0,10000].</p>
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
     * <p>public</p>
     */
    @NameInMap("scheduledActions")
    public java.util.List<ScheduledAction> scheduledActions;

    /**
     * <blockquote>
     * <p>Notice: 建议不再使用该参数，请使用 defaultTarget 参数。 </notice>
     * 预留的目标资源个数。取值范围为[0,10000]。</p>
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
     * <p>指标追踪伸缩策略配置。</p>
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
