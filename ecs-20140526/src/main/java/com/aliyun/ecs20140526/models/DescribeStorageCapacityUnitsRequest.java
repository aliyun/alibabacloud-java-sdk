// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeStorageCapacityUnitsRequest extends TeaModel {
    // The allocation type. Valid values:
    // 
    // *   Normal: queries SCUs within the current Alibaba Cloud account.
    // *   Shared: queries SCUs shared between the Alibaba Cloud account and RAM users.
    // 
    // Default value: Normal.
    @NameInMap("AllocationType")
    public String allocationType;

    // The capacity of the SCU. Unit: GiB. Valid values: 20, 40, 100, 200, 500, 1024, 2048, 5120, 10240, 20480, and 51200.
    @NameInMap("Capacity")
    public Integer capacity;

    // The name of the SCU. The name must be 2 to 128 characters in length. It must start with a letter but cannot start with `http://` or `https://`. It can contain letters, digits, colons (:), underscores (\_), and hyphens (-).
    @NameInMap("Name")
    public String name;

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

    // The region ID of the SCU. You can call the [DescribeRegions](~~25609~~) operation to query the most recent region list.
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    // The statuses of SCUs.
    @NameInMap("Status")
    public java.util.List<String> status;

    // The IDs of the SCUs. You can enter at most 100 SCU IDs.
    @NameInMap("StorageCapacityUnitId")
    public java.util.List<String> storageCapacityUnitId;

    // The tags.
    @NameInMap("Tag")
    public java.util.List<DescribeStorageCapacityUnitsRequestTag> tag;

    public static DescribeStorageCapacityUnitsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeStorageCapacityUnitsRequest self = new DescribeStorageCapacityUnitsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeStorageCapacityUnitsRequest setAllocationType(String allocationType) {
        this.allocationType = allocationType;
        return this;
    }
    public String getAllocationType() {
        return this.allocationType;
    }

    public DescribeStorageCapacityUnitsRequest setCapacity(Integer capacity) {
        this.capacity = capacity;
        return this;
    }
    public Integer getCapacity() {
        return this.capacity;
    }

    public DescribeStorageCapacityUnitsRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DescribeStorageCapacityUnitsRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeStorageCapacityUnitsRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeStorageCapacityUnitsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeStorageCapacityUnitsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeStorageCapacityUnitsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeStorageCapacityUnitsRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeStorageCapacityUnitsRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeStorageCapacityUnitsRequest setStatus(java.util.List<String> status) {
        this.status = status;
        return this;
    }
    public java.util.List<String> getStatus() {
        return this.status;
    }

    public DescribeStorageCapacityUnitsRequest setStorageCapacityUnitId(java.util.List<String> storageCapacityUnitId) {
        this.storageCapacityUnitId = storageCapacityUnitId;
        return this;
    }
    public java.util.List<String> getStorageCapacityUnitId() {
        return this.storageCapacityUnitId;
    }

    public DescribeStorageCapacityUnitsRequest setTag(java.util.List<DescribeStorageCapacityUnitsRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<DescribeStorageCapacityUnitsRequestTag> getTag() {
        return this.tag;
    }

    public static class DescribeStorageCapacityUnitsRequestTag extends TeaModel {
        // The key of tag N of the SCU. N indicates that you can set multiple tag keys to query. Valid values of N: 1 to 20.
        @NameInMap("Key")
        public String key;

        // The value of tag N of the SCU. N indicates that you can set multiple tag values to query and corresponds to N of `Tag.N.Key`. Valid values of N: 1 to 20.
        @NameInMap("Value")
        public String value;

        public static DescribeStorageCapacityUnitsRequestTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeStorageCapacityUnitsRequestTag self = new DescribeStorageCapacityUnitsRequestTag();
            return TeaModel.build(map, self);
        }

        public DescribeStorageCapacityUnitsRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeStorageCapacityUnitsRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
