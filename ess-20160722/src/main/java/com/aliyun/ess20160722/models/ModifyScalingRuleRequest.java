// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20160722.models;

import com.aliyun.tea.*;

public class ModifyScalingRuleRequest extends TeaModel {
    @NameInMap("AdjustmentType")
    public String adjustmentType;

    @NameInMap("AdjustmentValue")
    public Integer adjustmentValue;

    @NameInMap("Cooldown")
    public Integer cooldown;

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
    @NameInMap("ScalingRuleId")
    public String scalingRuleId;

    @NameInMap("ScalingRuleName")
    public String scalingRuleName;

    public static ModifyScalingRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyScalingRuleRequest self = new ModifyScalingRuleRequest();
        return TeaModel.build(map, self);
    }

    public ModifyScalingRuleRequest setAdjustmentType(String adjustmentType) {
        this.adjustmentType = adjustmentType;
        return this;
    }
    public String getAdjustmentType() {
        return this.adjustmentType;
    }

    public ModifyScalingRuleRequest setAdjustmentValue(Integer adjustmentValue) {
        this.adjustmentValue = adjustmentValue;
        return this;
    }
    public Integer getAdjustmentValue() {
        return this.adjustmentValue;
    }

    public ModifyScalingRuleRequest setCooldown(Integer cooldown) {
        this.cooldown = cooldown;
        return this;
    }
    public Integer getCooldown() {
        return this.cooldown;
    }

    public ModifyScalingRuleRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifyScalingRuleRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyScalingRuleRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyScalingRuleRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ModifyScalingRuleRequest setScalingRuleId(String scalingRuleId) {
        this.scalingRuleId = scalingRuleId;
        return this;
    }
    public String getScalingRuleId() {
        return this.scalingRuleId;
    }

    public ModifyScalingRuleRequest setScalingRuleName(String scalingRuleName) {
        this.scalingRuleName = scalingRuleName;
        return this;
    }
    public String getScalingRuleName() {
        return this.scalingRuleName;
    }

}
