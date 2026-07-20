// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class ProvisionConfig extends TeaModel {
    /**
     * <p>The target number of provisioned instances at the current time. If a metric-based or scheduled auto scaling policy is in effect, the value of this parameter is the number of provisioned instances as calculated by the policy. Otherwise, the value is the default number of provisioned instances when all auto scaling policies become invalid.</p>
     * <blockquote>
     * <p> Comparison between this parameter and defaultTarget\
     * Assume that after the number of provisioned instances is set to 1, a scheduled auto scaling policy is added, and this auto scaling policy increases the number of provisioned instances during a specified time period to 5.</p>
     * </blockquote>
     * <ul>
     * <li><p>During the time period when the scheduled policy <strong>takes effect</strong>, the value of the target parameter is 5, while the value of the defaultTarget parameter is 1.</p>
     * </li>
     * <li><p>When the scheduled policy <strong>is ineffective</strong>, both the target value and defaultTarget value are 1.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("alwaysAllocateCPU")
    public Boolean alwaysAllocateCPU;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("alwaysAllocateGPU")
    public Boolean alwaysAllocateGPU;

    /**
     * <p>public</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("current")
    public Long current;

    /**
     * <p>public</p>
     * 
     * <strong>example:</strong>
     * <p>image not found</p>
     */
    @NameInMap("currentError")
    public String currentError;

    /**
     * <p>public</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("defaultTarget")
    public Long defaultTarget;

    /**
     * <strong>example:</strong>
     * <p>acs:fc:cn-shanghai:124:functions/myFunction/prod</p>
     */
    @NameInMap("functionArn")
    public String functionArn;

    /**
     * <p>public</p>
     */
    @NameInMap("scheduledActions")
    public java.util.List<ScheduledAction> scheduledActions;

    /**
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("target")
    public Long target;

    @NameInMap("targetTrackingPolicies")
    public java.util.List<TargetTrackingPolicy> targetTrackingPolicies;

    public static ProvisionConfig build(java.util.Map<String, ?> map) throws Exception {
        ProvisionConfig self = new ProvisionConfig();
        return TeaModel.build(map, self);
    }

    public ProvisionConfig setAlwaysAllocateCPU(Boolean alwaysAllocateCPU) {
        this.alwaysAllocateCPU = alwaysAllocateCPU;
        return this;
    }
    public Boolean getAlwaysAllocateCPU() {
        return this.alwaysAllocateCPU;
    }

    public ProvisionConfig setAlwaysAllocateGPU(Boolean alwaysAllocateGPU) {
        this.alwaysAllocateGPU = alwaysAllocateGPU;
        return this;
    }
    public Boolean getAlwaysAllocateGPU() {
        return this.alwaysAllocateGPU;
    }

    public ProvisionConfig setCurrent(Long current) {
        this.current = current;
        return this;
    }
    public Long getCurrent() {
        return this.current;
    }

    public ProvisionConfig setCurrentError(String currentError) {
        this.currentError = currentError;
        return this;
    }
    public String getCurrentError() {
        return this.currentError;
    }

    public ProvisionConfig setDefaultTarget(Long defaultTarget) {
        this.defaultTarget = defaultTarget;
        return this;
    }
    public Long getDefaultTarget() {
        return this.defaultTarget;
    }

    public ProvisionConfig setFunctionArn(String functionArn) {
        this.functionArn = functionArn;
        return this;
    }
    public String getFunctionArn() {
        return this.functionArn;
    }

    public ProvisionConfig setScheduledActions(java.util.List<ScheduledAction> scheduledActions) {
        this.scheduledActions = scheduledActions;
        return this;
    }
    public java.util.List<ScheduledAction> getScheduledActions() {
        return this.scheduledActions;
    }

    public ProvisionConfig setTarget(Long target) {
        this.target = target;
        return this;
    }
    public Long getTarget() {
        return this.target;
    }

    public ProvisionConfig setTargetTrackingPolicies(java.util.List<TargetTrackingPolicy> targetTrackingPolicies) {
        this.targetTrackingPolicies = targetTrackingPolicies;
        return this;
    }
    public java.util.List<TargetTrackingPolicy> getTargetTrackingPolicies() {
        return this.targetTrackingPolicies;
    }

}
