// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class ResumeInstanceRefreshRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ir-a12ds234fasd*****</p>
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
     * <p>asg-bp18p2yfxow2dloq****</p>
     */
    @NameInMap("ScalingGroupId")
    public String scalingGroupId;

    public static ResumeInstanceRefreshRequest build(java.util.Map<String, ?> map) throws Exception {
        ResumeInstanceRefreshRequest self = new ResumeInstanceRefreshRequest();
        return TeaModel.build(map, self);
    }

    public ResumeInstanceRefreshRequest setInstanceRefreshTaskId(String instanceRefreshTaskId) {
        this.instanceRefreshTaskId = instanceRefreshTaskId;
        return this;
    }
    public String getInstanceRefreshTaskId() {
        return this.instanceRefreshTaskId;
    }

    public ResumeInstanceRefreshRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ResumeInstanceRefreshRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ResumeInstanceRefreshRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ResumeInstanceRefreshRequest setScalingGroupId(String scalingGroupId) {
        this.scalingGroupId = scalingGroupId;
        return this;
    }
    public String getScalingGroupId() {
        return this.scalingGroupId;
    }

}
