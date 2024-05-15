// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifySnapshotGroupRequest extends TeaModel {
    /**
     * <p>The new name of the snapshot-consistent group. The name must be 2 to 128 characters in length. It can contain letters, digits, periods (.), underscores (_), hyphens (-), and colons (:). It must start with a letter or a digit and cannot start with `http://` or `https://`.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The ID of the snapshot-consistent group. You can call the [DescribeSnapshotGroups](https://help.aliyun.com/document_detail/210940.html) operation to query the IDs of one or more snapshot-consistent groups.</p>
     */
    @NameInMap("Name")
    public String name;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The operation that you want to perform. Set the value to **ModifySnapshotGroup**.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The region ID of the snapshot-consistent group. You can call the [DescribeRegions](https://help.aliyun.com/document_detail/25609.html) operation to query the most recent region list.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("SnapshotGroupId")
    public String snapshotGroupId;

    public static ModifySnapshotGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifySnapshotGroupRequest self = new ModifySnapshotGroupRequest();
        return TeaModel.build(map, self);
    }

    public ModifySnapshotGroupRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ModifySnapshotGroupRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ModifySnapshotGroupRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifySnapshotGroupRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifySnapshotGroupRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifySnapshotGroupRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifySnapshotGroupRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ModifySnapshotGroupRequest setSnapshotGroupId(String snapshotGroupId) {
        this.snapshotGroupId = snapshotGroupId;
        return this;
    }
    public String getSnapshotGroupId() {
        return this.snapshotGroupId;
    }

}
