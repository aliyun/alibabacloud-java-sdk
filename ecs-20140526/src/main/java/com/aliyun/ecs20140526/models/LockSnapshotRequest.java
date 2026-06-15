// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class LockSnapshotRequest extends TeaModel {
    /**
     * <p>A unique, case-sensitive token that you provide to ensure the idempotence of the request. The token can contain only ASCII characters and must not exceed 64 characters in length. For more information, see <a href="https://help.aliyun.com/zh/ecs/developer-reference/how-to-ensure-idempotence?spm=a2c4g.11186623.0.0.2a29d467Bh2sO5">How to ensure idempotence</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>5EC38E7D-389F-1925-ABE2-D7925A8F****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The cool-off period. In compliance mode, you can specify a cool-off period or set this parameter to 0 to lock the snapshot immediately.</p>
     * <p>During the cool-off period, users with the required RAM permissions can unlock the snapshot, extend or shorten the cool-off period, and extend or shorten the lock duration. The snapshot cannot be deleted during the cool-off period.</p>
     * <p>After the cool-off period ends, you can only extend the lock duration.</p>
     * <p>Unit: hours.</p>
     * <p>Valid values: 0 to 72. A value of 0 indicates that the cool-off period is skipped and the snapshot is locked immediately.</p>
     * <p>If a snapshot is already locked in compliance mode, you must set this parameter to 0 to extend its lock duration.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("CoolOffPeriod")
    public Integer coolOffPeriod;

    /**
     * <p>Specifies whether to perform a dry run. Valid values:</p>
     * <ul>
     * <li><p><code>true</code>: Performs a dry run to check the request without executing it. The system checks for required parameters, request format, business constraints, and permissions. If the check passes, the <code>DryRunOperation</code> error code is returned. If the check fails, a corresponding error is returned.</p>
     * </li>
     * <li><p><code>false</code> (default): Checks the request and, if the checks pass, executes the operation.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The number of days to lock the snapshot. The lock automatically expires at the end of this period.</p>
     * <p>Unit: days.</p>
     * <p>Valid values: 1 to 36500.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("LockDuration")
    public Integer lockDuration;

    /**
     * <p>The lock mode. Valid value:</p>
     * <ul>
     * <li><code>compliance</code>: Locks the snapshot in compliance mode. A snapshot locked in compliance mode cannot be unlocked by any user and can be deleted only after its lock duration expires. You cannot shorten the lock duration. However, users with the required RAM permissions can extend the lock duration at any time. When you lock a snapshot in compliance mode, you can optionally specify a cool-off period.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>compliance</p>
     */
    @NameInMap("LockMode")
    public String lockMode;

    /**
     * <strong>example:</strong>
     * <p>158704318252****</p>
     */
    @NameInMap("OwnerAccount")
    public String ownerAccount;

    /**
     * <strong>example:</strong>
     * <p>158704318252****</p>
     */
    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID. You can call <a href="https://help.aliyun.com/zh/ecs/developer-reference/api-ecs-2014-05-26-describeregions?spm=a2c4g.11186623.0.i2">DescribeRegions</a> to get the latest list of Alibaba Cloud regions.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <strong>example:</strong>
     * <p>158704318252****</p>
     */
    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    /**
     * <strong>example:</strong>
     * <p>158704318252****</p>
     */
    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The snapshot ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>s-9dp2qojdpdfmgfmf****</p>
     */
    @NameInMap("SnapshotId")
    public String snapshotId;

    public static LockSnapshotRequest build(java.util.Map<String, ?> map) throws Exception {
        LockSnapshotRequest self = new LockSnapshotRequest();
        return TeaModel.build(map, self);
    }

    public LockSnapshotRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public LockSnapshotRequest setCoolOffPeriod(Integer coolOffPeriod) {
        this.coolOffPeriod = coolOffPeriod;
        return this;
    }
    public Integer getCoolOffPeriod() {
        return this.coolOffPeriod;
    }

    public LockSnapshotRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public LockSnapshotRequest setLockDuration(Integer lockDuration) {
        this.lockDuration = lockDuration;
        return this;
    }
    public Integer getLockDuration() {
        return this.lockDuration;
    }

    public LockSnapshotRequest setLockMode(String lockMode) {
        this.lockMode = lockMode;
        return this;
    }
    public String getLockMode() {
        return this.lockMode;
    }

    public LockSnapshotRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public LockSnapshotRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public LockSnapshotRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public LockSnapshotRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public LockSnapshotRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public LockSnapshotRequest setSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
        return this;
    }
    public String getSnapshotId() {
        return this.snapshotId;
    }

}
