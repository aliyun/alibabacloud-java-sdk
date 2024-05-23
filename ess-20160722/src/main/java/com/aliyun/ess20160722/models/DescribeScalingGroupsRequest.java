// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20160722.models;

import com.aliyun.tea.*;

public class DescribeScalingGroupsRequest extends TeaModel {
    @NameInMap("ScalingGroupId")
    public java.util.List<String> scalingGroupId;

    @NameInMap("ScalingGroupName")
    public java.util.List<String> scalingGroupName;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    public static DescribeScalingGroupsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeScalingGroupsRequest self = new DescribeScalingGroupsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeScalingGroupsRequest setScalingGroupId(java.util.List<String> scalingGroupId) {
        this.scalingGroupId = scalingGroupId;
        return this;
    }
    public java.util.List<String> getScalingGroupId() {
        return this.scalingGroupId;
    }

    public DescribeScalingGroupsRequest setScalingGroupName(java.util.List<String> scalingGroupName) {
        this.scalingGroupName = scalingGroupName;
        return this;
    }
    public java.util.List<String> getScalingGroupName() {
        return this.scalingGroupName;
    }

    public DescribeScalingGroupsRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeScalingGroupsRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeScalingGroupsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeScalingGroupsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeScalingGroupsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeScalingGroupsRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

}
