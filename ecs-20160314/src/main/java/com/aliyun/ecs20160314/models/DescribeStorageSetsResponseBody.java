// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class DescribeStorageSetsResponseBody extends TeaModel {
    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("StorageSets")
    public StorageSets storageSets;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeStorageSetsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeStorageSetsResponseBody self = new DescribeStorageSetsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeStorageSetsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeStorageSetsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeStorageSetsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeStorageSetsResponseBody setStorageSets(StorageSets storageSets) {
        this.storageSets = storageSets;
        return this;
    }
    public StorageSets getStorageSets() {
        return this.storageSets;
    }

    public DescribeStorageSetsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class StorageSet extends TeaModel {
        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("Description")
        public String description;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("StorageSetId")
        public String storageSetId;

        @NameInMap("StorageSetName")
        public String storageSetName;

        @NameInMap("StorageSetPartitionNumber")
        public Integer storageSetPartitionNumber;

        @NameInMap("ZoneId")
        public String zoneId;

        public static StorageSet build(java.util.Map<String, ?> map) throws Exception {
            StorageSet self = new StorageSet();
            return TeaModel.build(map, self);
        }

        public StorageSet setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public StorageSet setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public StorageSet setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public StorageSet setStorageSetId(String storageSetId) {
            this.storageSetId = storageSetId;
            return this;
        }
        public String getStorageSetId() {
            return this.storageSetId;
        }

        public StorageSet setStorageSetName(String storageSetName) {
            this.storageSetName = storageSetName;
            return this;
        }
        public String getStorageSetName() {
            return this.storageSetName;
        }

        public StorageSet setStorageSetPartitionNumber(Integer storageSetPartitionNumber) {
            this.storageSetPartitionNumber = storageSetPartitionNumber;
            return this;
        }
        public Integer getStorageSetPartitionNumber() {
            return this.storageSetPartitionNumber;
        }

        public StorageSet setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

    public static class StorageSets extends TeaModel {
        @NameInMap("StorageSet")
        public java.util.List<StorageSet> storageSet;

        public static StorageSets build(java.util.Map<String, ?> map) throws Exception {
            StorageSets self = new StorageSets();
            return TeaModel.build(map, self);
        }

        public StorageSets setStorageSet(java.util.List<StorageSet> storageSet) {
            this.storageSet = storageSet;
            return this;
        }
        public java.util.List<StorageSet> getStorageSet() {
            return this.storageSet;
        }

    }

}
