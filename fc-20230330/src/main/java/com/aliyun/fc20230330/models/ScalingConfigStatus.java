// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class ScalingConfigStatus extends TeaModel {
    /**
     * <p>The error message that is returned when an instance fails to be created.</p>
     * 
     * <strong>example:</strong>
     * <p>image not found</p>
     */
    @NameInMap("currentError")
    public String currentError;

    /**
     * <p>The current number of instances.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("currentInstances")
    public Long currentInstances;

    /**
     * <p>Specifies whether mix mode is enabled.</p>
     * 
     * <strong>example:</strong>
     * <p>False</p>
     */
    @NameInMap("enableMixMode")
    public Boolean enableMixMode;

    /**
     * <p>Specifies whether on-demand scaling is enabled.</p>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("enableOnDemandScaling")
    public Boolean enableOnDemandScaling;

    /**
     * <p>The resource identifier of the function.</p>
     * 
     * <strong>example:</strong>
     * <p>acs:fc:cn-shanghai:124:functions/myFunction/prod</p>
     */
    @NameInMap("functionArn")
    public String functionArn;

    /**
     * <p>The horizontal scaling policies.</p>
     */
    @NameInMap("horizontalScalingPolicies")
    public java.util.List<ScalingPolicy> horizontalScalingPolicies;

    /**
     * <p>The minimum number of instances.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("minInstances")
    public Long minInstances;

    /**
     * <p>The request dispatch policy.</p>
     * 
     * <strong>example:</strong>
     * <p>Balanced</p>
     */
    @NameInMap("requestDispatchPolicy")
    public String requestDispatchPolicy;

    /**
     * <p>The ID of the resident resource pool.</p>
     * 
     * <strong>example:</strong>
     * <p>fc-pool-a2b664c1f87171j4******</p>
     */
    @NameInMap("residentPoolId")
    public String residentPoolId;

    /**
     * <p>The scheduled scaling policies.</p>
     */
    @NameInMap("scheduledPolicies")
    public java.util.List<ScheduledPolicy> scheduledPolicies;

    /**
     * <p>The target number of instances.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("targetInstances")
    public Long targetInstances;

    public static ScalingConfigStatus build(java.util.Map<String, ?> map) throws Exception {
        ScalingConfigStatus self = new ScalingConfigStatus();
        return TeaModel.build(map, self);
    }

    public ScalingConfigStatus setCurrentError(String currentError) {
        this.currentError = currentError;
        return this;
    }
    public String getCurrentError() {
        return this.currentError;
    }

    public ScalingConfigStatus setCurrentInstances(Long currentInstances) {
        this.currentInstances = currentInstances;
        return this;
    }
    public Long getCurrentInstances() {
        return this.currentInstances;
    }

    public ScalingConfigStatus setEnableMixMode(Boolean enableMixMode) {
        this.enableMixMode = enableMixMode;
        return this;
    }
    public Boolean getEnableMixMode() {
        return this.enableMixMode;
    }

    public ScalingConfigStatus setEnableOnDemandScaling(Boolean enableOnDemandScaling) {
        this.enableOnDemandScaling = enableOnDemandScaling;
        return this;
    }
    public Boolean getEnableOnDemandScaling() {
        return this.enableOnDemandScaling;
    }

    public ScalingConfigStatus setFunctionArn(String functionArn) {
        this.functionArn = functionArn;
        return this;
    }
    public String getFunctionArn() {
        return this.functionArn;
    }

    public ScalingConfigStatus setHorizontalScalingPolicies(java.util.List<ScalingPolicy> horizontalScalingPolicies) {
        this.horizontalScalingPolicies = horizontalScalingPolicies;
        return this;
    }
    public java.util.List<ScalingPolicy> getHorizontalScalingPolicies() {
        return this.horizontalScalingPolicies;
    }

    public ScalingConfigStatus setMinInstances(Long minInstances) {
        this.minInstances = minInstances;
        return this;
    }
    public Long getMinInstances() {
        return this.minInstances;
    }

    public ScalingConfigStatus setRequestDispatchPolicy(String requestDispatchPolicy) {
        this.requestDispatchPolicy = requestDispatchPolicy;
        return this;
    }
    public String getRequestDispatchPolicy() {
        return this.requestDispatchPolicy;
    }

    public ScalingConfigStatus setResidentPoolId(String residentPoolId) {
        this.residentPoolId = residentPoolId;
        return this;
    }
    public String getResidentPoolId() {
        return this.residentPoolId;
    }

    public ScalingConfigStatus setScheduledPolicies(java.util.List<ScheduledPolicy> scheduledPolicies) {
        this.scheduledPolicies = scheduledPolicies;
        return this;
    }
    public java.util.List<ScheduledPolicy> getScheduledPolicies() {
        return this.scheduledPolicies;
    }

    public ScalingConfigStatus setTargetInstances(Long targetInstances) {
        this.targetInstances = targetInstances;
        return this;
    }
    public Long getTargetInstances() {
        return this.targetInstances;
    }

}
