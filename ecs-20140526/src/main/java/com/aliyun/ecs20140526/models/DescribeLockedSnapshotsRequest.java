// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeLockedSnapshotsRequest extends TeaModel {
    /**
     * <p>Specifies whether to perform a dry run. Valid values:</p>
     * <ul>
     * <li><p>true: performs a dry run without performing the actual operation. The system checks for required parameters, the request format, and business constraints. If the request fails the dry run, an error message is returned. If the request passes the dry run, the DryRunOperation error code is returned.</p>
     * </li>
     * <li><p>false (default): performs a dry run and performs the actual operation if the request passes the dry run.</p>
     * </li>
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
     * <li><p>compliance-cooloff: The snapshot is locked in compliance mode and is within its cool-off period. The snapshot cannot be deleted. Users with the required RAM permissions can unlock the snapshot, extend or shorten the cool-off period, and extend or shorten the lock duration.</p>
     * </li>
     * <li><p>compliance: The snapshot is locked in compliance mode and the cool-off period has ended. The snapshot cannot be unlocked or deleted. Users with the required RAM permissions can extend the lock duration.</p>
     * </li>
     * <li><p>expired: The lock on the snapshot has expired. The snapshot is no longer locked and can be deleted.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>compliance-cooloff</p>
     */
    @NameInMap("LockStatus")
    public String lockStatus;

    /**
     * <p>The number of entries per page. Maximum value: 100.</p>
     * <p>Default value:</p>
     * <ul>
     * <li><p>If you do not specify this parameter or you specify a value smaller than 10, the default value is 10.</p>
     * </li>
     * <li><p>If you specify a value larger than 100, the value is capped at 100.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token that is used in the next request to retrieve a new page of results. It is the <code>NextToken</code> value from a previous response.</p>
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
     * <p>The region ID. You can call <a href="https://help.aliyun.com/zh/ecs/developer-reference/api-ecs-2014-05-26-describeregions?spm=a2c4g.11186623.0.i2">DescribeRegions</a> to view the latest list of Alibaba Cloud regions.</p>
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
     * <p>An array of one to 100 snapshot IDs.</p>
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
