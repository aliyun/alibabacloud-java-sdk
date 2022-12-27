// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeStorageSetsResponseBody extends TeaModel {
    // The page number of the returned page.
    @NameInMap("PageNumber")
    public Integer pageNumber;

    // The number of entries returned per page.
    @NameInMap("PageSize")
    public Integer pageSize;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    // Details about the storage sets. The value of this parameter is an array that consists of StorageSet data.
    @NameInMap("StorageSets")
    public DescribeStorageSetsResponseBodyStorageSets storageSets;

    // The total number of storage sets.
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

    public DescribeStorageSetsResponseBody setStorageSets(DescribeStorageSetsResponseBodyStorageSets storageSets) {
        this.storageSets = storageSets;
        return this;
    }
    public DescribeStorageSetsResponseBodyStorageSets getStorageSets() {
        return this.storageSets;
    }

    public DescribeStorageSetsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeStorageSetsResponseBodyStorageSetsStorageSet extends TeaModel {
        // The time when the storage set was created.
        @NameInMap("CreationTime")
        public String creationTime;

        // The description of the storage set.
        @NameInMap("Description")
        public String description;

        // The ID of the region to which the storage set belongs.
        @NameInMap("RegionId")
        public String regionId;

        // The ID of the storage set.
        @NameInMap("StorageSetId")
        public String storageSetId;

        // The name of the storage set.
        @NameInMap("StorageSetName")
        public String storageSetName;

        // The maximum number of partitions supported by the storage set.
        @NameInMap("StorageSetPartitionNumber")
        public Integer storageSetPartitionNumber;

        // The ID of the zone to which the storage set belongs.
        @NameInMap("ZoneId")
        public String zoneId;

        public static DescribeStorageSetsResponseBodyStorageSetsStorageSet build(java.util.Map<String, ?> map) throws Exception {
            DescribeStorageSetsResponseBodyStorageSetsStorageSet self = new DescribeStorageSetsResponseBodyStorageSetsStorageSet();
            return TeaModel.build(map, self);
        }

        public DescribeStorageSetsResponseBodyStorageSetsStorageSet setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeStorageSetsResponseBodyStorageSetsStorageSet setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeStorageSetsResponseBodyStorageSetsStorageSet setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeStorageSetsResponseBodyStorageSetsStorageSet setStorageSetId(String storageSetId) {
            this.storageSetId = storageSetId;
            return this;
        }
        public String getStorageSetId() {
            return this.storageSetId;
        }

        public DescribeStorageSetsResponseBodyStorageSetsStorageSet setStorageSetName(String storageSetName) {
            this.storageSetName = storageSetName;
            return this;
        }
        public String getStorageSetName() {
            return this.storageSetName;
        }

        public DescribeStorageSetsResponseBodyStorageSetsStorageSet setStorageSetPartitionNumber(Integer storageSetPartitionNumber) {
            this.storageSetPartitionNumber = storageSetPartitionNumber;
            return this;
        }
        public Integer getStorageSetPartitionNumber() {
            return this.storageSetPartitionNumber;
        }

        public DescribeStorageSetsResponseBodyStorageSetsStorageSet setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

    public static class DescribeStorageSetsResponseBodyStorageSets extends TeaModel {
        @NameInMap("StorageSet")
        public java.util.List<DescribeStorageSetsResponseBodyStorageSetsStorageSet> storageSet;

        public static DescribeStorageSetsResponseBodyStorageSets build(java.util.Map<String, ?> map) throws Exception {
            DescribeStorageSetsResponseBodyStorageSets self = new DescribeStorageSetsResponseBodyStorageSets();
            return TeaModel.build(map, self);
        }

        public DescribeStorageSetsResponseBodyStorageSets setStorageSet(java.util.List<DescribeStorageSetsResponseBodyStorageSetsStorageSet> storageSet) {
            this.storageSet = storageSet;
            return this;
        }
        public java.util.List<DescribeStorageSetsResponseBodyStorageSetsStorageSet> getStorageSet() {
            return this.storageSet;
        }

    }

}
