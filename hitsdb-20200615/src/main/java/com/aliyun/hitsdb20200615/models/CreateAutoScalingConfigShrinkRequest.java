// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hitsdb20200615.models;

import com.aliyun.tea.*;

public class CreateAutoScalingConfigShrinkRequest extends TeaModel {
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
    public String scaleRuleListShrink;

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

    public static CreateAutoScalingConfigShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAutoScalingConfigShrinkRequest self = new CreateAutoScalingConfigShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateAutoScalingConfigShrinkRequest setConfigName(String configName) {
        this.configName = configName;
        return this;
    }
    public String getConfigName() {
        return this.configName;
    }

    public CreateAutoScalingConfigShrinkRequest setEffectiveTimeEnd(String effectiveTimeEnd) {
        this.effectiveTimeEnd = effectiveTimeEnd;
        return this;
    }
    public String getEffectiveTimeEnd() {
        return this.effectiveTimeEnd;
    }

    public CreateAutoScalingConfigShrinkRequest setEffectiveTimeStart(String effectiveTimeStart) {
        this.effectiveTimeStart = effectiveTimeStart;
        return this;
    }
    public String getEffectiveTimeStart() {
        return this.effectiveTimeStart;
    }

    public CreateAutoScalingConfigShrinkRequest setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }
    public Boolean getEnabled() {
        return this.enabled;
    }

    public CreateAutoScalingConfigShrinkRequest setEngine(String engine) {
        this.engine = engine;
        return this;
    }
    public String getEngine() {
        return this.engine;
    }

    public CreateAutoScalingConfigShrinkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateAutoScalingConfigShrinkRequest setNodesMax(Integer nodesMax) {
        this.nodesMax = nodesMax;
        return this;
    }
    public Integer getNodesMax() {
        return this.nodesMax;
    }

    public CreateAutoScalingConfigShrinkRequest setNodesMin(Integer nodesMin) {
        this.nodesMin = nodesMin;
        return this;
    }
    public Integer getNodesMin() {
        return this.nodesMin;
    }

    public CreateAutoScalingConfigShrinkRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CreateAutoScalingConfigShrinkRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateAutoScalingConfigShrinkRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateAutoScalingConfigShrinkRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateAutoScalingConfigShrinkRequest setScaleRuleListShrink(String scaleRuleListShrink) {
        this.scaleRuleListShrink = scaleRuleListShrink;
        return this;
    }
    public String getScaleRuleListShrink() {
        return this.scaleRuleListShrink;
    }

    public CreateAutoScalingConfigShrinkRequest setScaleType(String scaleType) {
        this.scaleType = scaleType;
        return this;
    }
    public String getScaleType() {
        return this.scaleType;
    }

    public CreateAutoScalingConfigShrinkRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public CreateAutoScalingConfigShrinkRequest setSpecId(String specId) {
        this.specId = specId;
        return this;
    }
    public String getSpecId() {
        return this.specId;
    }

}
