// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class ProvisionConfig extends TeaModel {
    /**
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
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("current")
    public Long current;

    /**
     * <strong>example:</strong>
     * <p>image not found</p>
     */
    @NameInMap("currentError")
    public String currentError;

    /**
     * <strong>example:</strong>
     * <p>acs:fc:cn-shanghai:124:functions/myFunction</p>
     */
    @NameInMap("functionArn")
    public String functionArn;

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
