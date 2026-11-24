// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ResetDiskRequest extends TeaModel {
    /**
     * <p>The ID of the disk to be rolled back.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>d-bp199lyny9b3****</p>
     */
    @NameInMap("DiskId")
    public String diskId;

    /**
     * <p>Specifies whether to perform a dry run on the request. Valid values:</p>
     * <ul>
     * <li>true: performs a dry run without rolling back the disk. The system checks the required parameters, request format, and resource status. If the request fails the dry run, the corresponding error message is returned. If the request passes the dry run, the DryRunOperation error code is returned.</li>
     * <li>false: performs a normal request. If the request passes the check, the disk is rolled back.</li>
     * </ul>
     * <p>Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
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
     * <p>The ID of the historical snapshot to which the disk is rolled back.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>s-bp199lyny9b3****</p>
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
