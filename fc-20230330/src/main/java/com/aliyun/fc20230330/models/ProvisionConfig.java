// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class ProvisionConfig extends TeaModel {
    /**
     * <p>Specifies whether to always allocate CPU to function instances.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("alwaysAllocateCPU")
    public Boolean alwaysAllocateCPU;

    /**
     * <p>Specifies whether to always allocate GPU to function instances.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("alwaysAllocateGPU")
    public Boolean alwaysAllocateGPU;

    /**
     * <p>The actual number of resources.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("current")
    public Long current;

    /**
     * <p>The error message when provisioned instance creation fails.</p>
     * 
     * <strong>example:</strong>
     * <p>image not found</p>
     */
    @NameInMap("currentError")
    public String currentError;

    /**
     * <p>The default number of resources when all metric-based scaling policies and scheduled scaling policies are inactive.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("defaultTarget")
    public Long defaultTarget;

    /**
     * <p>The resource descriptor of the function.</p>
     * 
     * <strong>example:</strong>
     * <p>acs:fc:cn-shanghai:124:functions/myFunction/prod</p>
     */
    @NameInMap("functionArn")
    public String functionArn;

    /**
     * <p>The scheduled scaling policy configurations.</p>
     */
    @NameInMap("scheduledActions")
    public java.util.List<ScheduledAction> scheduledActions;

    /**
     * <p>The current target number of resources. If a metric-based scaling policy or scheduled scaling policy exists, this value is the number of resources calculated by the policy. Otherwise, it is the default number of provisioned instances.</p>
     * <blockquote>
     * <p>What is the difference between target and defaultTarget?\
     * Assume that the number of provisioned instances is configured as 1, and then a scheduled scaling policy is added to set the number of provisioned instances to 5 during a specific time period.</p>
     * <ul>
     * <li>During the <strong>active period</strong> of the scheduled scaling policy, target and defaultTarget are 5 and 1, respectively.</li>
     * <li>During the <strong>inactive period</strong> of the scheduled scaling policy, both target and defaultTarget are 1.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("target")
    public Long target;

    /**
     * <p>The metric-based scaling policy configurations.</p>
     */
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
