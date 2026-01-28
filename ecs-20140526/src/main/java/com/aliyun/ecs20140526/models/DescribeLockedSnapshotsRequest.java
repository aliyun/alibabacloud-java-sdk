// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeLockedSnapshotsRequest extends TeaModel {
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
     * <p>The lock status. Valid values:</p>
     * <ul>
     * <li>compliance-cooloff: The snapshot is locked in compliance mode but is still in a cooling-off period. Snapshots cannot be deleted. However, users with the corresponding RAM permissions can unlock snapshots, extend or shorten the cooling-off period, and extend or shorten the lock duration.</li>
     * <li>compliance: The snapshot is locked in compliance mode and the cooling-off period has ended. Snapshots cannot be unlocked or deleted. However, users with the corresponding RAM permissions can extend the locked duration.</li>
     * <li>expired: The snapshot was once locked, but the lock duration has ended and the lock has expired. The snapshot is not locked and can be deleted.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>compliance-cooloff</p>
     */
    @NameInMap("LockStatus")
    public String lockStatus;

    /**
     * <p>The maximum number of entries to return on each page. Maximum value: 100.</p>
     * <p>Default value:</p>
     * <ul>
     * <li>If no value is set or the set value is less than 10, the default value is 10.</li>
     * <li>If you set a value greater than 100, the default value is 100.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The query token. Set the value to the <code>NextToken</code> parameter value returned in the last API call.</p>
     * 
     * <strong>example:</strong>
     * <p>caeba0bbb2be03f84eb48b699f0a****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

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
     * <p>The region ID. You can call the <a href="https://help.aliyun.com/zh/ecs/developer-reference/api-ecs-2014-05-26-describeregions?spm=a2c4g.11186623.0.i2">DescribeRegions</a> operation to query the most recent region list.</p>
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
     * <p>The snapshot IDs. You can specify 1 to 100 IDs.</p>
     */
    @NameInMap("SnapshotIds")
    public java.util.List<String> snapshotIds;

    public static DescribeLockedSnapshotsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeLockedSnapshotsRequest self = new DescribeLockedSnapshotsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeLockedSnapshotsRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public DescribeLockedSnapshotsRequest setLockStatus(String lockStatus) {
        this.lockStatus = lockStatus;
        return this;
    }
    public String getLockStatus() {
        return this.lockStatus;
    }

    public DescribeLockedSnapshotsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeLockedSnapshotsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeLockedSnapshotsRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeLockedSnapshotsRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeLockedSnapshotsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeLockedSnapshotsRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeLockedSnapshotsRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeLockedSnapshotsRequest setSnapshotIds(java.util.List<String> snapshotIds) {
        this.snapshotIds = snapshotIds;
        return this;
    }
    public java.util.List<String> getSnapshotIds() {
        return this.snapshotIds;
    }

}
