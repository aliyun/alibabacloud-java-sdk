// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeSnapshotPackageRequest extends TeaModel {
    @NameInMap("OwnerAccount")
    public String ownerAccount;

    // RAM用户的虚拟账号ID。
    @NameInMap("OwnerId")
    public Long ownerId;

    // The number of the page to return. Pages start from page 1.
    // 
    // Default value: 1.
    @NameInMap("PageNumber")
    public Integer pageNumber;

    // The number of entries to return on each page. Maximum value: 100.
    // 
    // Default value: 10.
    @NameInMap("PageSize")
    public Integer pageSize;

    // The region ID of the snapshot. You can call the [DescribeRegions](~~25609~~) operation to query the most recent region list.
    @NameInMap("RegionId")
    public String regionId;

    // 资源主账号的账号名称。
    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    // 资源主账号的ID，亦即UID。
    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static DescribeSnapshotPackageRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSnapshotPackageRequest self = new DescribeSnapshotPackageRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSnapshotPackageRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeSnapshotPackageRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeSnapshotPackageRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeSnapshotPackageRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeSnapshotPackageRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeSnapshotPackageRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeSnapshotPackageRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
