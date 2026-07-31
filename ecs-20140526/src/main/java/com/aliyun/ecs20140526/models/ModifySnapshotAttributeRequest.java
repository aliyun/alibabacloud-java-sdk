// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifySnapshotAttributeRequest extends TeaModel {
    /**
     * <p>The description of the snapshot. The description can be empty and can be up to 256 characters in length. It cannot start with http:// or https://.</p>
     * 
     * <strong>example:</strong>
     * <p>testDescription</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Specifies whether to disable the snapshot instant access feature. Valid values:</p>
     * <ul>
     * <li>true: Disables the snapshot instant access feature.</li>
     * <li>false: Does not disable the snapshot instant access feature.</li>
     * </ul>
     * <p>Default value: false.</p>
     * <blockquote>
     * <p>This parameter is deprecated. Standard snapshots of enterprise SSDs have been upgraded to <a href="https://help.aliyun.com/document_detail/193667.html">instant access by default</a>. No additional configuration or fees are required.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>false</p>
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

    /**
     * <p>The number of days for which the snapshot is retained. The retention period is calculated from the snapshot <strong>creation time</strong> (represented in the ISO 8601 standard and in UTC+0 time in the yyyy-MM-ddTHH:mm:ssZ format). Valid values: 1 to 65536.</p>
     * <blockquote>
     * <p>The snapshot retention period can only be extended. Shortening the existing retention period of a snapshot is not supported.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("RetentionDays")
    public Integer retentionDays;

    /**
     * <p>The snapshot ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>s-bp199lyny9bb47pa****</p>
     */
    @NameInMap("SnapshotId")
    public String snapshotId;

    /**
     * <p>The display name of the snapshot. The name must be 2 to 128 characters in length. It must start with a letter and cannot start with http:// or https://. The name can contain digits, colons (:), underscores (_), or hyphens (-).</p>
     * <p>The name cannot start with auto to avoid conflicts with automatic snapshot names.</p>
     * 
     * <strong>example:</strong>
     * <p>testSnapshotName</p>
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
