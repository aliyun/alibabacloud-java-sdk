// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ApplyAutoSnapshotPolicyRequest extends TeaModel {
    // RAM用户的虚拟账号ID。
    @NameInMap("OwnerId")
    public Long ownerId;

    // 资源主账号的账号名称。
    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    // 资源主账号的ID，亦即UID。
    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    // The ID of the automatic snapshot policy.
    @NameInMap("autoSnapshotPolicyId")
    public String autoSnapshotPolicyId;

    // The IDs of one or more disks. The value is a JSON array that consists of disk IDs. Separate the disk IDs with commas (,).
    @NameInMap("diskIds")
    public String diskIds;

    // The region ID of the automatic snapshot policy and the disks. You can call the [DescribeRegions](~~25609~~) operation to query the most recent region list.
    @NameInMap("regionId")
    public String regionId;

    public static ApplyAutoSnapshotPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        ApplyAutoSnapshotPolicyRequest self = new ApplyAutoSnapshotPolicyRequest();
        return TeaModel.build(map, self);
    }

    public ApplyAutoSnapshotPolicyRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ApplyAutoSnapshotPolicyRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ApplyAutoSnapshotPolicyRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ApplyAutoSnapshotPolicyRequest setAutoSnapshotPolicyId(String autoSnapshotPolicyId) {
        this.autoSnapshotPolicyId = autoSnapshotPolicyId;
        return this;
    }
    public String getAutoSnapshotPolicyId() {
        return this.autoSnapshotPolicyId;
    }

    public ApplyAutoSnapshotPolicyRequest setDiskIds(String diskIds) {
        this.diskIds = diskIds;
        return this;
    }
    public String getDiskIds() {
        return this.diskIds;
    }

    public ApplyAutoSnapshotPolicyRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
