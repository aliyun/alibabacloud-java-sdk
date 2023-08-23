// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class SetInstancesProtectionRequest extends TeaModel {
    /**
     * <p>The IDs of the ECS instances.</p>
     */
    @NameInMap("InstanceIds")
    public java.util.List<String> instanceIds;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>Specifies whether to put ECS instances into the Protected state. Auto Scaling does not remove ECS instances in the Protected state from scaling groups during scale-in activities.</p>
     * <br>
     * <p>*   true</p>
     * <p>*   false</p>
     */
    @NameInMap("ProtectedFromScaleIn")
    public Boolean protectedFromScaleIn;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    /**
     * <p>The ID of the scaling group.</p>
     */
    @NameInMap("ScalingGroupId")
    public String scalingGroupId;

    public static SetInstancesProtectionRequest build(java.util.Map<String, ?> map) throws Exception {
        SetInstancesProtectionRequest self = new SetInstancesProtectionRequest();
        return TeaModel.build(map, self);
    }

    public SetInstancesProtectionRequest setInstanceIds(java.util.List<String> instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public java.util.List<String> getInstanceIds() {
        return this.instanceIds;
    }

    public SetInstancesProtectionRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public SetInstancesProtectionRequest setProtectedFromScaleIn(Boolean protectedFromScaleIn) {
        this.protectedFromScaleIn = protectedFromScaleIn;
        return this;
    }
    public Boolean getProtectedFromScaleIn() {
        return this.protectedFromScaleIn;
    }

    public SetInstancesProtectionRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public SetInstancesProtectionRequest setScalingGroupId(String scalingGroupId) {
        this.scalingGroupId = scalingGroupId;
        return this;
    }
    public String getScalingGroupId() {
        return this.scalingGroupId;
    }

}
