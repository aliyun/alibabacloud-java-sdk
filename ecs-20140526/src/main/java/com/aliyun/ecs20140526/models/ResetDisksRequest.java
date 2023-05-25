// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ResetDisksRequest extends TeaModel {
    /**
     * <p>The disks that you want to roll back.</p>
     */
    @NameInMap("Disk")
    public java.util.List<ResetDisksRequestDisk> disk;

    /**
     * <p>Specifies whether to perform only a dry run, without performing the actual request. Valid values:</p>
     * <br>
     * <p>*   true: performs only a dry run. The system checks the request for potential issues, including missing parameter values, incorrect request syntax, and resource state limits. If the request fails the dry run, an error code is returned. If the request passes the dry run, the `DryRunOperation` error code is returned.</p>
     * <p>*   false: performs a dry run and performs the actual request. If the request passes the dry run, the rollback operation is performed.</p>
     * <br>
     * <p>Default value: false.</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID. You can call the [DescribeRegions](~~25609~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static ResetDisksRequest build(java.util.Map<String, ?> map) throws Exception {
        ResetDisksRequest self = new ResetDisksRequest();
        return TeaModel.build(map, self);
    }

    public ResetDisksRequest setDisk(java.util.List<ResetDisksRequestDisk> disk) {
        this.disk = disk;
        return this;
    }
    public java.util.List<ResetDisksRequestDisk> getDisk() {
        return this.disk;
    }

    public ResetDisksRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public ResetDisksRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ResetDisksRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ResetDisksRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ResetDisksRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ResetDisksRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public static class ResetDisksRequestDisk extends TeaModel {
        /**
         * <p>The ID of the disk that you want to roll back. You can specify up to 10 disk IDs.</p>
         */
        @NameInMap("DiskId")
        public String diskId;

        /**
         * <p>The ID of the disk snapshot that is contained in the instance snapshot. You can specify up to 10 disk snapshot IDs.</p>
         */
        @NameInMap("SnapshotId")
        public String snapshotId;

        public static ResetDisksRequestDisk build(java.util.Map<String, ?> map) throws Exception {
            ResetDisksRequestDisk self = new ResetDisksRequestDisk();
            return TeaModel.build(map, self);
        }

        public ResetDisksRequestDisk setDiskId(String diskId) {
            this.diskId = diskId;
            return this;
        }
        public String getDiskId() {
            return this.diskId;
        }

        public ResetDisksRequestDisk setSnapshotId(String snapshotId) {
            this.snapshotId = snapshotId;
            return this;
        }
        public String getSnapshotId() {
            return this.snapshotId;
        }

    }

}
