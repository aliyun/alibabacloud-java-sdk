// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class GetInstanceScreenshotRequest extends TeaModel {
    // The ID of the instance.
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    // The region ID of the instance. You can call the [DescribeRegions](~~25609~~) operation to query the most recent region list.
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    // Specifies whether to wake up the instance that is in sleep mode.
    // 
    // Default value: false.
    @NameInMap("WakeUp")
    public Boolean wakeUp;

    public static GetInstanceScreenshotRequest build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceScreenshotRequest self = new GetInstanceScreenshotRequest();
        return TeaModel.build(map, self);
    }

    public GetInstanceScreenshotRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetInstanceScreenshotRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public GetInstanceScreenshotRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public GetInstanceScreenshotRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetInstanceScreenshotRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public GetInstanceScreenshotRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public GetInstanceScreenshotRequest setWakeUp(Boolean wakeUp) {
        this.wakeUp = wakeUp;
        return this;
    }
    public Boolean getWakeUp() {
        return this.wakeUp;
    }

}
