// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifySnapshotAttributeRequest extends TeaModel {
    /**
     * <p>The description of the snapshot. The description must be 2 to 256 characters in length and cannot start with [http:// or https://](http://https://。).</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Specifies whether to disable the instant access feature. Valid values:</p>
     * <br>
     * <p>*   true: disables the instant access feature.</p>
     * <p>*   false: does not disable the instant access feature.</p>
     * <br>
     * <p>Default value: false.</p>
     */
    @NameInMap("DisableInstantAccess")
    public Boolean disableInstantAccess;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("RetentionDays")
    public Integer retentionDays;

    /**
     * <p>The ID of the snapshot.</p>
     */
    @NameInMap("SnapshotId")
    public String snapshotId;

    /**
     * <p>The name of the snapshot. The name must be 2 to 128 characters in length. The name must start with a letter and cannot start with [http:// or https://. It can contain letters, digits, colons (:), underscores (\_), and hyphens (-).](http://https://。、（:）、（\_）（-）。)</p>
     * <br>
     * <p>The name cannot start with auto because snapshots whose names start with auto are recognized as automatic snapshots.</p>
     */
    @NameInMap("SnapshotName")
    public String snapshotName;

    public static ModifySnapshotAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifySnapshotAttributeRequest self = new ModifySnapshotAttributeRequest();
        return TeaModel.build(map, self);
    }

    public ModifySnapshotAttributeRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ModifySnapshotAttributeRequest setDisableInstantAccess(Boolean disableInstantAccess) {
        this.disableInstantAccess = disableInstantAccess;
        return this;
    }
    public Boolean getDisableInstantAccess() {
        return this.disableInstantAccess;
    }

    public ModifySnapshotAttributeRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifySnapshotAttributeRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifySnapshotAttributeRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifySnapshotAttributeRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ModifySnapshotAttributeRequest setRetentionDays(Integer retentionDays) {
        this.retentionDays = retentionDays;
        return this;
    }
    public Integer getRetentionDays() {
        return this.retentionDays;
    }

    public ModifySnapshotAttributeRequest setSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
        return this;
    }
    public String getSnapshotId() {
        return this.snapshotId;
    }

    public ModifySnapshotAttributeRequest setSnapshotName(String snapshotName) {
        this.snapshotName = snapshotName;
        return this;
    }
    public String getSnapshotName() {
        return this.snapshotName;
    }

}
