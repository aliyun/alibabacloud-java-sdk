// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class ModifyInstanceAttributeRequest extends TeaModel {
    /**
     * <p>Specifies whether to use the scaling group to manage the lifecycles of the manually added ECS instances. Valid values:</p>
     * <br>
     * <p>*   true: The scaling group manages the lifecycles of instances that are manually added and instances that are automatically created in the same manner. In this case, Auto Scaling releases the instances when they are removed from the scaling group. This rule does not apply to instances that are removed by calling the DetachInstances operation.</p>
     * <p>*   false: The scaling group does not manage the lifecycles of instances that are manually added. In this case, Auto Scaling does not release the instances when they are removed from the scaling group.</p>
     * <br>
     * <p>>  You can specify this parameter for only ECS instances that are manually added to scaling groups.</p>
     */
    @NameInMap("Entrusted")
    public Boolean entrusted;

    /**
     * <p>The ID of the ECS instance.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID of the scaling group.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    /**
     * <p>The ID of the scaling group.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ScalingGroupId")
    public String scalingGroupId;

    public static ModifyInstanceAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstanceAttributeRequest self = new ModifyInstanceAttributeRequest();
        return TeaModel.build(map, self);
    }

    public ModifyInstanceAttributeRequest setEntrusted(Boolean entrusted) {
        this.entrusted = entrusted;
        return this;
    }
    public Boolean getEntrusted() {
        return this.entrusted;
    }

    public ModifyInstanceAttributeRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyInstanceAttributeRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyInstanceAttributeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyInstanceAttributeRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyInstanceAttributeRequest setScalingGroupId(String scalingGroupId) {
        this.scalingGroupId = scalingGroupId;
        return this;
    }
    public String getScalingGroupId() {
        return this.scalingGroupId;
    }

}
