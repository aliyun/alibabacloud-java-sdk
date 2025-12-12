// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hitsdb20200615.models;

import com.aliyun.tea.*;

public class CreateAutoScalingConfigRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ConfigName")
    public String configName;

    @NameInMap("EffectiveTimeEnd")
    public String effectiveTimeEnd;

    @NameInMap("EffectiveTimeStart")
    public String effectiveTimeStart;

    @NameInMap("Enabled")
    public Boolean enabled;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Engine")
    public String engine;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("NodesMax")
    public Integer nodesMax;

    @NameInMap("NodesMin")
    public Integer nodesMin;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("ScaleRuleList")
    public java.util.List<CreateAutoScalingConfigRequestScaleRuleList> scaleRuleList;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ScaleType")
    public String scaleType;

    @NameInMap("SecurityToken")
    public String securityToken;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("SpecId")
    public String specId;

    @NameInMap("StorageCapacityMax")
    public Long storageCapacityMax;

    public static CreateAutoScalingConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAutoScalingConfigRequest self = new CreateAutoScalingConfigRequest();
        return TeaModel.build(map, self);
    }

    public CreateAutoScalingConfigRequest setConfigName(String configName) {
        this.configName = configName;
        return this;
    }
    public String getConfigName() {
        return this.configName;
    }

    public CreateAutoScalingConfigRequest setEffectiveTimeEnd(String effectiveTimeEnd) {
        this.effectiveTimeEnd = effectiveTimeEnd;
        return this;
    }
    public String getEffectiveTimeEnd() {
        return this.effectiveTimeEnd;
    }

    public CreateAutoScalingConfigRequest setEffectiveTimeStart(String effectiveTimeStart) {
        this.effectiveTimeStart = effectiveTimeStart;
        return this;
    }
    public String getEffectiveTimeStart() {
        return this.effectiveTimeStart;
    }

    public CreateAutoScalingConfigRequest setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }
    public Boolean getEnabled() {
        return this.enabled;
    }

    public CreateAutoScalingConfigRequest setEngine(String engine) {
        this.engine = engine;
        return this;
    }
    public String getEngine() {
        return this.engine;
    }

    public CreateAutoScalingConfigRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateAutoScalingConfigRequest setNodesMax(Integer nodesMax) {
        this.nodesMax = nodesMax;
        return this;
    }
    public Integer getNodesMax() {
        return this.nodesMax;
    }

    public CreateAutoScalingConfigRequest setNodesMin(Integer nodesMin) {
        this.nodesMin = nodesMin;
        return this;
    }
    public Integer getNodesMin() {
        return this.nodesMin;
    }

    public CreateAutoScalingConfigRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CreateAutoScalingConfigRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateAutoScalingConfigRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateAutoScalingConfigRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateAutoScalingConfigRequest setScaleRuleList(java.util.List<CreateAutoScalingConfigRequestScaleRuleList> scaleRuleList) {
        this.scaleRuleList = scaleRuleList;
        return this;
    }
    public java.util.List<CreateAutoScalingConfigRequestScaleRuleList> getScaleRuleList() {
        return this.scaleRuleList;
    }

    public CreateAutoScalingConfigRequest setScaleType(String scaleType) {
        this.scaleType = scaleType;
        return this;
    }
    public String getScaleType() {
        return this.scaleType;
    }

    public CreateAutoScalingConfigRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public CreateAutoScalingConfigRequest setSpecId(String specId) {
        this.specId = specId;
        return this;
    }
    public String getSpecId() {
        return this.specId;
    }

    public CreateAutoScalingConfigRequest setStorageCapacityMax(Long storageCapacityMax) {
        this.storageCapacityMax = storageCapacityMax;
        return this;
    }
    public Long getStorageCapacityMax() {
        return this.storageCapacityMax;
    }

    public static class CreateAutoScalingConfigRequestScaleRuleList extends TeaModel {
        @NameInMap("ConfigId")
        public String configId;

        @NameInMap("Enabled")
        public Boolean enabled;

        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("ObservationWindow")
        public Integer observationWindow;

        @NameInMap("OperationType")
        public String operationType;

        @NameInMap("RuleId")
        public String ruleId;

        @NameInMap("RuleName")
        public String ruleName;

        @NameInMap("RuleType")
        public String ruleType;

        @NameInMap("ScaleInStep")
        public Integer scaleInStep;

        @NameInMap("ScaleOutStep")
        public Integer scaleOutStep;

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

        public static CreateAutoScalingConfigRequestScaleRuleList build(java.util.Map<String, ?> map) throws Exception {
            CreateAutoScalingConfigRequestScaleRuleList self = new CreateAutoScalingConfigRequestScaleRuleList();
            return TeaModel.build(map, self);
        }

        public CreateAutoScalingConfigRequestScaleRuleList setConfigId(String configId) {
            this.configId = configId;
            return this;
        }
        public String getConfigId() {
            return this.configId;
        }

        public CreateAutoScalingConfigRequestScaleRuleList setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public CreateAutoScalingConfigRequestScaleRuleList setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public CreateAutoScalingConfigRequestScaleRuleList setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public CreateAutoScalingConfigRequestScaleRuleList setObservationWindow(Integer observationWindow) {
            this.observationWindow = observationWindow;
            return this;
        }
        public Integer getObservationWindow() {
            return this.observationWindow;
        }

        public CreateAutoScalingConfigRequestScaleRuleList setOperationType(String operationType) {
            this.operationType = operationType;
            return this;
        }
        public String getOperationType() {
            return this.operationType;
        }

        public CreateAutoScalingConfigRequestScaleRuleList setRuleId(String ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public String getRuleId() {
            return this.ruleId;
        }

        public CreateAutoScalingConfigRequestScaleRuleList setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public CreateAutoScalingConfigRequestScaleRuleList setRuleType(String ruleType) {
            this.ruleType = ruleType;
            return this;
        }
        public String getRuleType() {
            return this.ruleType;
        }

        public CreateAutoScalingConfigRequestScaleRuleList setScaleInStep(Integer scaleInStep) {
            this.scaleInStep = scaleInStep;
            return this;
        }
        public Integer getScaleInStep() {
            return this.scaleInStep;
        }

        public CreateAutoScalingConfigRequestScaleRuleList setScaleOutStep(Integer scaleOutStep) {
            this.scaleOutStep = scaleOutStep;
            return this;
        }
        public Integer getScaleOutStep() {
            return this.scaleOutStep;
        }

        public CreateAutoScalingConfigRequestScaleRuleList setSilenceTime(Integer silenceTime) {
            this.silenceTime = silenceTime;
            return this;
        }
        public Integer getSilenceTime() {
            return this.silenceTime;
        }

        public CreateAutoScalingConfigRequestScaleRuleList setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public CreateAutoScalingConfigRequestScaleRuleList setTargetMetric(String targetMetric) {
            this.targetMetric = targetMetric;
            return this;
        }
        public String getTargetMetric() {
            return this.targetMetric;
        }

        public CreateAutoScalingConfigRequestScaleRuleList setTargetNodes(Integer targetNodes) {
            this.targetNodes = targetNodes;
            return this;
        }
        public Integer getTargetNodes() {
            return this.targetNodes;
        }

        public CreateAutoScalingConfigRequestScaleRuleList setThresholdLower(Integer thresholdLower) {
            this.thresholdLower = thresholdLower;
            return this;
        }
        public Integer getThresholdLower() {
            return this.thresholdLower;
        }

        public CreateAutoScalingConfigRequestScaleRuleList setThresholdUpper(Integer thresholdUpper) {
            this.thresholdUpper = thresholdUpper;
            return this;
        }
        public Integer getThresholdUpper() {
            return this.thresholdUpper;
        }

        public CreateAutoScalingConfigRequestScaleRuleList setTriggerCronExpr(String triggerCronExpr) {
            this.triggerCronExpr = triggerCronExpr;
            return this;
        }
        public String getTriggerCronExpr() {
            return this.triggerCronExpr;
        }

    }

}
