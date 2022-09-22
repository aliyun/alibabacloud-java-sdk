// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class DescribeStorageCapacityUnitAllocationsRequest extends TeaModel {
    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("StorageCapacityUnitId")
    public String storageCapacityUnitId;

    public static DescribeStorageCapacityUnitAllocationsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeStorageCapacityUnitAllocationsRequest self = new DescribeStorageCapacityUnitAllocationsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeStorageCapacityUnitAllocationsRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeStorageCapacityUnitAllocationsRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeStorageCapacityUnitAllocationsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeStorageCapacityUnitAllocationsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeStorageCapacityUnitAllocationsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeStorageCapacityUnitAllocationsRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeStorageCapacityUnitAllocationsRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeStorageCapacityUnitAllocationsRequest setStorageCapacityUnitId(String storageCapacityUnitId) {
        this.storageCapacityUnitId = storageCapacityUnitId;
        return this;
    }
    public String getStorageCapacityUnitId() {
        return this.storageCapacityUnitId;
    }

}
