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

    @NameInMap("ScaleType")
    public String scaleType;

    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("SpecId")
    public String specId;

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

}
