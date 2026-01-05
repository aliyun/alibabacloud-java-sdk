// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifySnapshotCategoryRequest extends TeaModel {
    /**
     * <p>The type of the snapshot.</p>
     * <ul>
     * <li>Archive: archive snapshot</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Archive</p>
     */
    @NameInMap("Category")
    public String category;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The retention period of the snapshot. Unit: days. The retention period started at the point in time when the snapshot was created. You can archive only standard snapshots that have been retained for at least 14 days.</p>
     * <p>After the snapshot is archived, the minimum retention period (also called minimum archive period) is 60 days. When you calculate the retention period of archived snapshots, you must deduct the retention period of standard snapshots. If you delete the snapshot within 60 days after the snapshot is archived, you are charged archive tier storage fees for the snapshot for 60 days. For more information about the billing of snapshots, see <a href="https://help.aliyun.com/document_detail/56159.html">Snapshots</a>.</p>
     * <p>Value range [74,65536]</p>
     * <blockquote>
     * <p>If you do not specify this parameter, the snapshot is permanently retained.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("RetentionDays")
    public Integer retentionDays;

    /**
     * <p>The ID of the snapshot.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>s-123**sd</p>
     */
    @NameInMap("SnapshotId")
    public String snapshotId;

    public static ModifySnapshotCategoryRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifySnapshotCategoryRequest self = new ModifySnapshotCategoryRequest();
        return TeaModel.build(map, self);
    }

    public ModifySnapshotCategoryRequest setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

    public ModifySnapshotCategoryRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifySnapshotCategoryRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifySnapshotCategoryRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifySnapshotCategoryRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ModifySnapshotCategoryRequest setRetentionDays(Integer retentionDays) {
        this.retentionDays = retentionDays;
        return this;
    }
    public Integer getRetentionDays() {
        return this.retentionDays;
    }

    public ModifySnapshotCategoryRequest setSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
        return this;
    }
    public String getSnapshotId() {
        return this.snapshotId;
    }

}
