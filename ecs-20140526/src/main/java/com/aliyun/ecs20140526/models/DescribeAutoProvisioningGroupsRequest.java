// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeAutoProvisioningGroupsRequest extends TeaModel {
    // The IDs of auto provisioning groups. You can specify up to 20 auto provisioning group IDs.
    @NameInMap("AutoProvisioningGroupId")
    public java.util.List<String> autoProvisioningGroupId;

    // The name of the auto provisioning group.
    @NameInMap("AutoProvisioningGroupName")
    public String autoProvisioningGroupName;

    // The statuses of auto provisioning groups.
    @NameInMap("AutoProvisioningGroupStatus")
    public java.util.List<String> autoProvisioningGroupStatus;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    // The number of the page to return.
    // 
    // Pages start from page 1.
    // 
    // Default value: 1.
    @NameInMap("PageNumber")
    public Integer pageNumber;

    // The number of entries to return on each page.
    // 
    // Maximum value: 100.
    // 
    // Default value: 10.
    @NameInMap("PageSize")
    public Integer pageSize;

    // The region ID of the auto provisioning group.
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static DescribeAutoProvisioningGroupsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAutoProvisioningGroupsRequest self = new DescribeAutoProvisioningGroupsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAutoProvisioningGroupsRequest setAutoProvisioningGroupId(java.util.List<String> autoProvisioningGroupId) {
        this.autoProvisioningGroupId = autoProvisioningGroupId;
        return this;
    }
    public java.util.List<String> getAutoProvisioningGroupId() {
        return this.autoProvisioningGroupId;
    }

    public DescribeAutoProvisioningGroupsRequest setAutoProvisioningGroupName(String autoProvisioningGroupName) {
        this.autoProvisioningGroupName = autoProvisioningGroupName;
        return this;
    }
    public String getAutoProvisioningGroupName() {
        return this.autoProvisioningGroupName;
    }

    public DescribeAutoProvisioningGroupsRequest setAutoProvisioningGroupStatus(java.util.List<String> autoProvisioningGroupStatus) {
        this.autoProvisioningGroupStatus = autoProvisioningGroupStatus;
        return this;
    }
    public java.util.List<String> getAutoProvisioningGroupStatus() {
        return this.autoProvisioningGroupStatus;
    }

    public DescribeAutoProvisioningGroupsRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeAutoProvisioningGroupsRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeAutoProvisioningGroupsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeAutoProvisioningGroupsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeAutoProvisioningGroupsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeAutoProvisioningGroupsRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeAutoProvisioningGroupsRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
