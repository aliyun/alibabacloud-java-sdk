// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ResetDiskRequest extends TeaModel {
    /**
     * <p>The ID of the disk that you want to roll back.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("DiskId")
    public String diskId;

    /**
     * <p>Specifies whether to check the validity of the request without actually making the request. Valid values:</p>
     * <br>
     * <p>*   true: performs only a dry run. The system checks the request for potential issues, including missing parameter values, incorrect request syntax, and resource state limits. If the request fails the dry run, an error code is returned. If the request passes the dry run, the `DryRunOperation` error code is returned.</p>
     * <p>*   false: performs a dry run and performs the actual request. If the request passes the dry run, the rollback operation is performed.</p>
     * <br>
     * <p>Default value: false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The ID of the snapshot that you want to use to roll back the disk.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("SnapshotId")
    public String snapshotId;

    public static ResetDiskRequest build(java.util.Map<String, ?> map) throws Exception {
        ResetDiskRequest self = new ResetDiskRequest();
        return TeaModel.build(map, self);
    }

    public ResetDiskRequest setDiskId(String diskId) {
        this.diskId = diskId;
        return this;
    }
    public String getDiskId() {
        return this.diskId;
    }

    public ResetDiskRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public ResetDiskRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ResetDiskRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ResetDiskRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ResetDiskRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ResetDiskRequest setSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
        return this;
    }
    public String getSnapshotId() {
        return this.snapshotId;
    }

}
