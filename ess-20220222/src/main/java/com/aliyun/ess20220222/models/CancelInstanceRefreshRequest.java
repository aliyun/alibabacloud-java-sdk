// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class CancelInstanceRefreshRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ir-aca123sf****</p>
     */
    @NameInMap("InstanceRefreshTaskId")
    public String instanceRefreshTaskId;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>asg-bp1igpak5ft1flyp****</p>
     */
    @NameInMap("ScalingGroupId")
    public String scalingGroupId;

    public static CancelInstanceRefreshRequest build(java.util.Map<String, ?> map) throws Exception {
        CancelInstanceRefreshRequest self = new CancelInstanceRefreshRequest();
        return TeaModel.build(map, self);
    }

    public CancelInstanceRefreshRequest setInstanceRefreshTaskId(String instanceRefreshTaskId) {
        this.instanceRefreshTaskId = instanceRefreshTaskId;
        return this;
    }
    public String getInstanceRefreshTaskId() {
        return this.instanceRefreshTaskId;
    }

    public CancelInstanceRefreshRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CancelInstanceRefreshRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CancelInstanceRefreshRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CancelInstanceRefreshRequest setScalingGroupId(String scalingGroupId) {
        this.scalingGroupId = scalingGroupId;
        return this;
    }
    public String getScalingGroupId() {
        return this.scalingGroupId;
    }

}
