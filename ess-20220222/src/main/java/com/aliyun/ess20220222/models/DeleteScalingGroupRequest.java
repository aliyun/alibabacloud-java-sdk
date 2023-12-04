// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class DeleteScalingGroupRequest extends TeaModel {
    /**
     * <p>Specifies whether to forcefully delete the VPC. Valid values:</p>
     * <br>
     * <p>- **true**: yes</p>
     * <p>- **false** (default): no</p>
     * <br>
     * <p>You can forcefully delete a VPC in the following scenarios:</p>
     * <br>
     * <p>- Only an IPv4 gateway and routes that point to the IPv4 gateway exist in the VPC.</p>
     * <p>- Only an IPv6 gateway and routes that point to the IPv6 gateway exist in the VPC.</p>
     */
    @NameInMap("ForceDelete")
    public Boolean forceDelete;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    /**
     * <p>The ID of the scaling group.</p>
     */
    @NameInMap("ScalingGroupId")
    public String scalingGroupId;

    public static DeleteScalingGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteScalingGroupRequest self = new DeleteScalingGroupRequest();
        return TeaModel.build(map, self);
    }

    public DeleteScalingGroupRequest setForceDelete(Boolean forceDelete) {
        this.forceDelete = forceDelete;
        return this;
    }
    public Boolean getForceDelete() {
        return this.forceDelete;
    }

    public DeleteScalingGroupRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DeleteScalingGroupRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DeleteScalingGroupRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DeleteScalingGroupRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DeleteScalingGroupRequest setScalingGroupId(String scalingGroupId) {
        this.scalingGroupId = scalingGroupId;
        return this;
    }
    public String getScalingGroupId() {
        return this.scalingGroupId;
    }

}
