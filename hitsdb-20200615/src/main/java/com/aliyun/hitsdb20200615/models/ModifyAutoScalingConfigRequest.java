// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hitsdb20200615.models;

import com.aliyun.tea.*;

public class ModifyAutoScalingConfigRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ConfigId")
    public String configId;

    @NameInMap("ConfigName")
    public String configName;

    @NameInMap("EffectiveTimeEnd")
    public String effectiveTimeEnd;

    @NameInMap("EffectiveTimeStart")
    public String effectiveTimeStart;

    @NameInMap("Enabled")
    public Boolean enabled;

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
    public java.util.List<ModifyAutoScalingConfigRequestScaleRuleList> scaleRuleList;

    @NameInMap("ScaleType")
    public String scaleType;

    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("SpecId")
    public String specId;

    @NameInMap("StorageCapacityMax")
    public Long storageCapacityMax;

    public static ModifyAutoScalingConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyAutoScalingConfigRequest self = new ModifyAutoScalingConfigRequest();
        return TeaModel.build(map, self);
    }

    public ModifyAutoScalingConfigRequest setConfigId(String configId) {
        this.configId = configId;
        return this;
    }
    public String getConfigId() {
        return this.configId;
    }

    public ModifyAutoScalingConfigRequest setConfigName(String configName) {
        this.configName = configName;
        return this;
    }
    public String getConfigName() {
        return this.configName;
    }

    public ModifyAutoScalingConfigRequest setEffectiveTimeEnd(String effectiveTimeEnd) {
        this.effectiveTimeEnd = effectiveTimeEnd;
        return this;
    }
    public String getEffectiveTimeEnd() {
        return this.effectiveTimeEnd;
    }

    public ModifyAutoScalingConfigRequest setEffectiveTimeStart(String effectiveTimeStart) {
        this.effectiveTimeStart = effectiveTimeStart;
        return this;
    }
    public String getEffectiveTimeStart() {
        return this.effectiveTimeStart;
    }

    public ModifyAutoScalingConfigRequest setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }
    public Boolean getEnabled() {
        return this.enabled;
    }

    public ModifyAutoScalingConfigRequest setEngine(String engine) {
        this.engine = engine;
        return this;
    }
    public String getEngine() {
        return this.engine;
    }

    public ModifyAutoScalingConfigRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyAutoScalingConfigRequest setNodesMax(Integer nodesMax) {
        this.nodesMax = nodesMax;
        return this;
    }
    public Integer getNodesMax() {
        return this.nodesMax;
    }

    public ModifyAutoScalingConfigRequest setNodesMin(Integer nodesMin) {
        this.nodesMin = nodesMin;
        return this;
    }
    public Integer getNodesMin() {
        return this.nodesMin;
    }

    public ModifyAutoScalingConfigRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifyAutoScalingConfigRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyAutoScalingConfigRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyAutoScalingConfigRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ModifyAutoScalingConfigRequest setScaleRuleList(java.util.List<ModifyAutoScalingConfigRequestScaleRuleList> scaleRuleList) {
        this.scaleRuleList = scaleRuleList;
        return this;
    }
    public java.util.List<ModifyAutoScalingConfigRequestScaleRuleList> getScaleRuleList() {
        return this.scaleRuleList;
    }

    public ModifyAutoScalingConfigRequest setScaleType(String scaleType) {
        this.scaleType = scaleType;
        return this;
    }
    public String getScaleType() {
        return this.scaleType;
    }

    public ModifyAutoScalingConfigRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public ModifyAutoScalingConfigRequest setSpecId(String specId) {
        this.specId = specId;
        return this;
    }
    public String getSpecId() {
        return this.specId;
    }

    public ModifyAutoScalingConfigRequest setStorageCapacityMax(Long storageCapacityMax) {
        this.storageCapacityMax = storageCapacityMax;
        return this;
    }
    public Long getStorageCapacityMax() {
        return this.storageCapacityMax;
    }

    public static class ModifyAutoScalingConfigRequestScaleRuleList extends TeaModel {
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

        public static ModifyAutoScalingConfigRequestScaleRuleList build(java.util.Map<String, ?> map) throws Exception {
            ModifyAutoScalingConfigRequestScaleRuleList self = new ModifyAutoScalingConfigRequestScaleRuleList();
            return TeaModel.build(map, self);
        }

        public ModifyAutoScalingConfigRequestScaleRuleList setConfigId(String configId) {
            this.configId = configId;
            return this;
        }
        public String getConfigId() {
            return this.configId;
        }

        public ModifyAutoScalingConfigRequestScaleRuleList setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public ModifyAutoScalingConfigRequestScaleRuleList setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public ModifyAutoScalingConfigRequestScaleRuleList setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ModifyAutoScalingConfigRequestScaleRuleList setObservationWindow(Integer observationWindow) {
            this.observationWindow = observationWindow;
            return this;
        }
        public Integer getObservationWindow() {
            return this.observationWindow;
        }

        public ModifyAutoScalingConfigRequestScaleRuleList setOperationType(String operationType) {
            this.operationType = operationType;
            return this;
        }
        public String getOperationType() {
            return this.operationType;
        }

        public ModifyAutoScalingConfigRequestScaleRuleList setRuleId(String ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public String getRuleId() {
            return this.ruleId;
        }

        public ModifyAutoScalingConfigRequestScaleRuleList setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public ModifyAutoScalingConfigRequestScaleRuleList setRuleType(String ruleType) {
            this.ruleType = ruleType;
            return this;
        }
        public String getRuleType() {
            return this.ruleType;
        }

        public ModifyAutoScalingConfigRequestScaleRuleList setScaleInStep(Integer scaleInStep) {
            this.scaleInStep = scaleInStep;
            return this;
        }
        public Integer getScaleInStep() {
            return this.scaleInStep;
        }

        public ModifyAutoScalingConfigRequestScaleRuleList setScaleOutStep(Integer scaleOutStep) {
            this.scaleOutStep = scaleOutStep;
            return this;
        }
        public Integer getScaleOutStep() {
            return this.scaleOutStep;
        }

        public ModifyAutoScalingConfigRequestScaleRuleList setSilenceTime(Integer silenceTime) {
            this.silenceTime = silenceTime;
            return this;
        }
        public Integer getSilenceTime() {
            return this.silenceTime;
        }

        public ModifyAutoScalingConfigRequestScaleRuleList setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public ModifyAutoScalingConfigRequestScaleRuleList setTargetMetric(String targetMetric) {
            this.targetMetric = targetMetric;
            return this;
        }
        public String getTargetMetric() {
            return this.targetMetric;
        }

        public ModifyAutoScalingConfigRequestScaleRuleList setTargetNodes(Integer targetNodes) {
            this.targetNodes = targetNodes;
            return this;
        }
        public Integer getTargetNodes() {
            return this.targetNodes;
        }

        public ModifyAutoScalingConfigRequestScaleRuleList setThresholdLower(Integer thresholdLower) {
            this.thresholdLower = thresholdLower;
            return this;
        }
        public Integer getThresholdLower() {
            return this.thresholdLower;
        }

        public ModifyAutoScalingConfigRequestScaleRuleList setThresholdUpper(Integer thresholdUpper) {
            this.thresholdUpper = thresholdUpper;
            return this;
        }
        public Integer getThresholdUpper() {
            return this.thresholdUpper;
        }

        public ModifyAutoScalingConfigRequestScaleRuleList setTriggerCronExpr(String triggerCronExpr) {
            this.triggerCronExpr = triggerCronExpr;
            return this;
        }
        public String getTriggerCronExpr() {
            return this.triggerCronExpr;
        }

    }

}
