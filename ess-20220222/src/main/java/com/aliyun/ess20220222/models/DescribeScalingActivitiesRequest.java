// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class DescribeScalingActivitiesRequest extends TeaModel {
    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The number of the page to return. Pages start from page 1.</p>
     * <br>
     * <p>Default value: 1.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page. Maximum value: 50.</p>
     * <br>
     * <p>Default value: 10.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The region ID of the scaling group to which the scaling activity that you want to query belongs.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The IDs of the scaling activities that you want to query.</p>
     * <br>
     * <p>> When you call this operation, you must specify one of the `ScalingGroupId` and `ScalingActivityId.N` parameters. Otherwise, an error is reported.</p>
     */
    @NameInMap("ScalingActivityIds")
    public java.util.List<String> scalingActivityIds;

    /**
     * <p>The ID of the scaling group.</p>
     * <br>
     * <p>> When you call this operation, you must specify one of the `ScalingGroupId` and `ScalingActivityId.N` parameters. Otherwise, an error is reported.</p>
     */
    @NameInMap("ScalingGroupId")
    public String scalingGroupId;

    /**
     * <p>The status of the scaling activity. Valid values:</p>
     * <br>
     * <p>*   Successful: The scaling activity is successful.</p>
     * <p>*   Warning: The scaling activity is partially successful.</p>
     * <p>*   Failed: The scaling activity failed.</p>
     * <p>*   InProgress: The scaling activity is in progress.</p>
     * <p>*   Rejected: The request to trigger the scaling activity is rejected.</p>
     */
    @NameInMap("StatusCode")
    public String statusCode;

    public static DescribeScalingActivitiesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeScalingActivitiesRequest self = new DescribeScalingActivitiesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeScalingActivitiesRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeScalingActivitiesRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeScalingActivitiesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeScalingActivitiesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeScalingActivitiesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeScalingActivitiesRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeScalingActivitiesRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeScalingActivitiesRequest setScalingActivityIds(java.util.List<String> scalingActivityIds) {
        this.scalingActivityIds = scalingActivityIds;
        return this;
    }
    public java.util.List<String> getScalingActivityIds() {
        return this.scalingActivityIds;
    }

    public DescribeScalingActivitiesRequest setScalingGroupId(String scalingGroupId) {
        this.scalingGroupId = scalingGroupId;
        return this;
    }
    public String getScalingGroupId() {
        return this.scalingGroupId;
    }

    public DescribeScalingActivitiesRequest setStatusCode(String statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public String getStatusCode() {
        return this.statusCode;
    }

}
