// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifySnapshotCategoryRequest extends TeaModel {
    /**
     * <p>The snapshot type.</p>
     * <ul>
     * <li>Archive: archive snapshot.</li>
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
     * <p>The number of days for which the snapshot is retained. The retention period starts from the snapshot creation time (CreationTime). A standard snapshot must have been retained for at least 14 days after creation before it can be archived.</p>
     * <p>Archive snapshots must be retained for at least 60 days. When the retention period of an archive snapshot is calculated, the retention period of the standard snapshot is deducted. If an archive snapshot is deleted before 60 days, you are charged for 60 days of archive storage. For more information, see <a href="https://help.aliyun.com/document_detail/56159.html">Snapshot billing</a>.</p>
     * <p>Valid values: [74, 65536].</p>
     * <blockquote>
     * <p>If you do not specify this parameter, the snapshot is permanently retained.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("RetentionDays")
    public Integer retentionDays;

    /**
     * <p>The snapshot ID.</p>
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
