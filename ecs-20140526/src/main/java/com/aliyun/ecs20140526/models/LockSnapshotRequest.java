// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class LockSnapshotRequest extends TeaModel {
    /**
     * <p>A client token that is used to ensure the idempotence of the request. You can use the client to generate a client token. Make sure that a unique client token is used for each request. ClientToken only supports ASCII characters and cannot exceed 64 characters. For more information, see <a href="https://help.aliyun.com/zh/ecs/developer-reference/how-to-ensure-idempotence?spm=a2c4g.11186623.0.0.2a29d467Bh2sO5">How to ensure idempotence</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>5EC38E7D-389F-1925-ABE2-D7925A8F****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Cooling-off period. In compliance mode, you can set a cooling-off period or skip the cooling-off period to directly lock the snapshot.</p>
     * <p>During the cooling-off period, users with corresponding RAM permissions can unlock snapshots, extend or shorten the cooling-off period, and extend or shorten the lock duration. Snapshots cannot be deleted during the cooling-off period.</p>
     * <p>After the cooling-off period ends, only extending the lock duration is supported.</p>
     * <p>Unit: hours.</p>
     * <p>Valid values: 0 to 72. A value of 0 indicates skipping the cooling-off period and directly locking the snapshot.</p>
     * <p>If the snapshot has entered the compliance mode lock period, set this parameter to 0 when extending the lock duration.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("CoolOffPeriod")
    public Integer coolOffPeriod;

    /**
     * <p>Specifies whether to perform only a dry run. Valid values:</p>
     * <ul>
     * <li>true: The request is checked and is not executed. The system checks the request for potential issues, including missing parameter values, incorrect request syntax, and service limits. If the check fails, the corresponding error is returned. If the check passes, the error code DryRunOperation is returned.</li>
     * <li>false (default): Sends a normal request, checks it, and executes the request directly if it passes the check.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>Lock duration. After the lock duration ends, the snapshot lock will automatically expire.</p>
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
     * <p>The lock mode. Valid values:</p>
     * <ul>
     * <li>compliance: The snapshot is locked in compliance mode. A snapshot that is locked in compliance mode cannot be unlocked by any user. It can be deleted only after the lock duration expires. Users cannot shorten the lock duration, but users with the corresponding RAM permissions can extend the lock duration at any time. When locking a snapshot in compliance mode, you can optionally specify a cooling-off period.</li>
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
     * <p>The region ID You can call the <a href="https://help.aliyun.com/zh/ecs/developer-reference/api-ecs-2014-05-26-describeregions?spm=a2c4g.11186623.0.i2">DescribeRegions</a> operation to query the most recent region list.</p>
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
