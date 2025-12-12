// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hitsdb20200615.models;

import com.aliyun.tea.*;

public class ModifyAutoScalingConfigShrinkRequest extends TeaModel {
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
    public String scaleRuleListShrink;

    @NameInMap("ScaleType")
    public String scaleType;

    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("SpecId")
    public String specId;

    @NameInMap("StorageCapacityMax")
    public Long storageCapacityMax;

    public static ModifyAutoScalingConfigShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyAutoScalingConfigShrinkRequest self = new ModifyAutoScalingConfigShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ModifyAutoScalingConfigShrinkRequest setConfigId(String configId) {
        this.configId = configId;
        return this;
    }
    public String getConfigId() {
        return this.configId;
    }

    public ModifyAutoScalingConfigShrinkRequest setConfigName(String configName) {
        this.configName = configName;
        return this;
    }
    public String getConfigName() {
        return this.configName;
    }

    public ModifyAutoScalingConfigShrinkRequest setEffectiveTimeEnd(String effectiveTimeEnd) {
        this.effectiveTimeEnd = effectiveTimeEnd;
        return this;
    }
    public String getEffectiveTimeEnd() {
        return this.effectiveTimeEnd;
    }

    public ModifyAutoScalingConfigShrinkRequest setEffectiveTimeStart(String effectiveTimeStart) {
        this.effectiveTimeStart = effectiveTimeStart;
        return this;
    }
    public String getEffectiveTimeStart() {
        return this.effectiveTimeStart;
    }

    public ModifyAutoScalingConfigShrinkRequest setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }
    public Boolean getEnabled() {
        return this.enabled;
    }

    public ModifyAutoScalingConfigShrinkRequest setEngine(String engine) {
        this.engine = engine;
        return this;
    }
    public String getEngine() {
        return this.engine;
    }

    public ModifyAutoScalingConfigShrinkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyAutoScalingConfigShrinkRequest setNodesMax(Integer nodesMax) {
        this.nodesMax = nodesMax;
        return this;
    }
    public Integer getNodesMax() {
        return this.nodesMax;
    }

    public ModifyAutoScalingConfigShrinkRequest setNodesMin(Integer nodesMin) {
        this.nodesMin = nodesMin;
        return this;
    }
    public Integer getNodesMin() {
        return this.nodesMin;
    }

    public ModifyAutoScalingConfigShrinkRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifyAutoScalingConfigShrinkRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyAutoScalingConfigShrinkRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyAutoScalingConfigShrinkRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ModifyAutoScalingConfigShrinkRequest setScaleRuleListShrink(String scaleRuleListShrink) {
        this.scaleRuleListShrink = scaleRuleListShrink;
        return this;
    }
    public String getScaleRuleListShrink() {
        return this.scaleRuleListShrink;
    }

    public ModifyAutoScalingConfigShrinkRequest setScaleType(String scaleType) {
        this.scaleType = scaleType;
        return this;
    }
    public String getScaleType() {
        return this.scaleType;
    }

    public ModifyAutoScalingConfigShrinkRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public ModifyAutoScalingConfigShrinkRequest setSpecId(String specId) {
        this.specId = specId;
        return this;
    }
    public String getSpecId() {
        return this.specId;
    }

    public ModifyAutoScalingConfigShrinkRequest setStorageCapacityMax(Long storageCapacityMax) {
        this.storageCapacityMax = storageCapacityMax;
        return this;
    }
    public Long getStorageCapacityMax() {
        return this.storageCapacityMax;
    }

}
