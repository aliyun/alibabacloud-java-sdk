// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeLockedSnapshotsRequest extends TeaModel {
    /**
     * <p>Specifies whether to perform only a dry run on the request. Valid values: </p>
     * <ul>
     * <li>true: Performs a dry run only. The request is not actually executed. The system checks whether required parameters are specified, the request format is valid, and service limits are met. If the request fails the dry run, an error message is returned. If the request passes the dry run, the DryRunOperation error code is returned. </li>
     * <li>false (default): Sends a normal request and executes the request after it passes the dry run.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The lock status. Valid values: </p>
     * <ul>
     * <li>compliance-cooloff: The snapshot is locked in compliance mode but is still in the cool-off period. The snapshot cannot be deleted, but users with the required RAM permissions can unlock the snapshot, extend or shorten the cool-off period, and extend or shorten the lock duration. </li>
     * <li>compliance: The snapshot is locked in compliance mode and the cool-off period has ended. The snapshot cannot be unlocked or deleted, but users with the required RAM permissions can extend the lock duration. </li>
     * <li>expired: The snapshot was locked, but the lock duration has ended and the lock has expired. The snapshot is currently unlocked and can be deleted.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>compliance-cooloff</p>
     */
    @NameInMap("LockStatus")
    public String lockStatus;

    /**
     * <p>The number of entries per page for paging in a paged query. Maximum value: 100. </p>
     * <p>Default value: </p>
     * <ul>
     * <li>If no Settings are specified or the Settings value is less than 10, the default value is 10. </li>
     * <li>If the Settings value is greater than 100, the default value is 100.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The query token. Set the value to the NextToken parameter value returned from the previous API call to invoke the next request.</p>
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
     * <p>The region ID. You can call the <a href="https://www.alibabacloud.com/help/en/ecs/developer-reference/api-ecs-2014-05-26-describeregions">DescribeRegions</a> operation to query the most recent region list.</p>
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
     * <p>The snapshot IDs. Array length: 1 to 100.</p>
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
