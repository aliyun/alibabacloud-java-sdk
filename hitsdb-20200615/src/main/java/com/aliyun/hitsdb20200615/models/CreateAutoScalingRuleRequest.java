// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hitsdb20200615.models;

import com.aliyun.tea.*;

public class CreateAutoScalingRuleRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ConfigId")
    public String configId;

    @NameInMap("Enabled")
    public Boolean enabled;

    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("ObservationWindow")
    public Integer observationWindow;

    @NameInMap("OperationType")
    public String operationType;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("RuleName")
    public String ruleName;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("RuleType")
    public String ruleType;

    @NameInMap("ScaleInStep")
    public Integer scaleInStep;

    @NameInMap("ScaleOutStep")
    public Integer scaleOutStep;

    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("SilenceTime")
    public Integer silenceTime;

    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("TargetMetric")
    public String targetMetric;

    @NameInMap("TargetNodes")
    public Integer targetNodes;

    @NameInMap("ThresholdLower")
    public Integer thresholdLower;

    @NameInMap("ThresholdUpper")
    public Integer thresholdUpper;

    @NameInMap("TriggerCronExpr")
    public String triggerCronExpr;

    public static CreateAutoScalingRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAutoScalingRuleRequest self = new CreateAutoScalingRuleRequest();
        return TeaModel.build(map, self);
    }

    public CreateAutoScalingRuleRequest setConfigId(String configId) {
        this.configId = configId;
        return this;
    }
    public String getConfigId() {
        return this.configId;
    }

    public CreateAutoScalingRuleRequest setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }
    public Boolean getEnabled() {
        return this.enabled;
    }

    public CreateAutoScalingRuleRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public CreateAutoScalingRuleRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateAutoScalingRuleRequest setObservationWindow(Integer observationWindow) {
        this.observationWindow = observationWindow;
        return this;
    }
    public Integer getObservationWindow() {
        return this.observationWindow;
    }

    public CreateAutoScalingRuleRequest setOperationType(String operationType) {
        this.operationType = operationType;
        return this;
    }
    public String getOperationType() {
        return this.operationType;
    }

    public CreateAutoScalingRuleRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CreateAutoScalingRuleRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateAutoScalingRuleRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateAutoScalingRuleRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateAutoScalingRuleRequest setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

    public CreateAutoScalingRuleRequest setRuleType(String ruleType) {
        this.ruleType = ruleType;
        return this;
    }
    public String getRuleType() {
        return this.ruleType;
    }

    public CreateAutoScalingRuleRequest setScaleInStep(Integer scaleInStep) {
        this.scaleInStep = scaleInStep;
        return this;
    }
    public Integer getScaleInStep() {
        return this.scaleInStep;
    }

    public CreateAutoScalingRuleRequest setScaleOutStep(Integer scaleOutStep) {
        this.scaleOutStep = scaleOutStep;
        return this;
    }
    public Integer getScaleOutStep() {
        return this.scaleOutStep;
    }

    public CreateAutoScalingRuleRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public CreateAutoScalingRuleRequest setSilenceTime(Integer silenceTime) {
        this.silenceTime = silenceTime;
        return this;
    }
    public Integer getSilenceTime() {
        return this.silenceTime;
    }

    public CreateAutoScalingRuleRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public CreateAutoScalingRuleRequest setTargetMetric(String targetMetric) {
        this.targetMetric = targetMetric;
        return this;
    }
    public String getTargetMetric() {
        return this.targetMetric;
    }

    public CreateAutoScalingRuleRequest setTargetNodes(Integer targetNodes) {
        this.targetNodes = targetNodes;
        return this;
    }
    public Integer getTargetNodes() {
        return this.targetNodes;
    }

    public CreateAutoScalingRuleRequest setThresholdLower(Integer thresholdLower) {
        this.thresholdLower = thresholdLower;
        return this;
    }
    public Integer getThresholdLower() {
        return this.thresholdLower;
    }

    public CreateAutoScalingRuleRequest setThresholdUpper(Integer thresholdUpper) {
        this.thresholdUpper = thresholdUpper;
        return this;
    }
    public Integer getThresholdUpper() {
        return this.thresholdUpper;
    }

    public CreateAutoScalingRuleRequest setTriggerCronExpr(String triggerCronExpr) {
        this.triggerCronExpr = triggerCronExpr;
        return this;
    }
    public String getTriggerCronExpr() {
        return this.triggerCronExpr;
    }

}
