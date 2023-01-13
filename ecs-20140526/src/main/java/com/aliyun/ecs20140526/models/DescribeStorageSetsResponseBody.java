// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeStorageSetsResponseBody extends TeaModel {
    /**
     * <p>The page number of the returned page.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned per page.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Details about the storage sets. The value of this parameter is an array that consists of StorageSet data.</p>
     */
    @NameInMap("StorageSets")
    public DescribeStorageSetsResponseBodyStorageSets storageSets;

    /**
     * <p>The total number of storage sets.</p>
     */
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
        /**
         * <p>The time when the storage set was created.</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The description of the storage set.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The ID of the region to which the storage set belongs.</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The ID of the storage set.</p>
         */
        @NameInMap("StorageSetId")
        public String storageSetId;

        /**
         * <p>The name of the storage set.</p>
         */
        @NameInMap("StorageSetName")
        public String storageSetName;

        /**
         * <p>The maximum number of partitions supported by the storage set.</p>
         */
        @NameInMap("StorageSetPartitionNumber")
        public Integer storageSetPartitionNumber;

        /**
         * <p>The ID of the zone to which the storage set belongs.</p>
         */
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
