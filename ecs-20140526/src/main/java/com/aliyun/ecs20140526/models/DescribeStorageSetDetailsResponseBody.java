// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeStorageSetDetailsResponseBody extends TeaModel {
    /**
     * <p>Details about the disks or Shared Block Storage devices in the storage set.</p>
     */
    @NameInMap("Disks")
    public DescribeStorageSetDetailsResponseBodyDisks disks;

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
     * <p>The total number of storage sets.</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeStorageSetDetailsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeStorageSetDetailsResponseBody self = new DescribeStorageSetDetailsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeStorageSetDetailsResponseBody setDisks(DescribeStorageSetDetailsResponseBodyDisks disks) {
        this.disks = disks;
        return this;
    }
    public DescribeStorageSetDetailsResponseBodyDisks getDisks() {
        return this.disks;
    }

    public DescribeStorageSetDetailsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeStorageSetDetailsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeStorageSetDetailsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeStorageSetDetailsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeStorageSetDetailsResponseBodyDisksDisk extends TeaModel {
        /**
         * <p>The category of the disk or Shared Block Storage device.</p>
         */
        @NameInMap("Category")
        public String category;

        /**
         * <p>The time when the disk or Shared Block Storage device was created.</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The ID of the disk or Shared Block Storage device.</p>
         */
        @NameInMap("DiskId")
        public String diskId;

        /**
         * <p>The name of the disk or Shared Block Storage device.</p>
         */
        @NameInMap("DiskName")
        public String diskName;

        /**
         * <p>The region to which the disk or Shared Block Storage device belongs.</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The ID of the storage set.</p>
         */
        @NameInMap("StorageSetId")
        public String storageSetId;

        /**
         * <p>The number of partitions in the storage set.</p>
         */
        @NameInMap("StorageSetPartitionNumber")
        public Integer storageSetPartitionNumber;

        /**
         * <p>The zone to which the disk or Shared Block Storage device belongs.</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        public static DescribeStorageSetDetailsResponseBodyDisksDisk build(java.util.Map<String, ?> map) throws Exception {
            DescribeStorageSetDetailsResponseBodyDisksDisk self = new DescribeStorageSetDetailsResponseBodyDisksDisk();
            return TeaModel.build(map, self);
        }

        public DescribeStorageSetDetailsResponseBodyDisksDisk setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public DescribeStorageSetDetailsResponseBodyDisksDisk setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeStorageSetDetailsResponseBodyDisksDisk setDiskId(String diskId) {
            this.diskId = diskId;
            return this;
        }
        public String getDiskId() {
            return this.diskId;
        }

        public DescribeStorageSetDetailsResponseBodyDisksDisk setDiskName(String diskName) {
            this.diskName = diskName;
            return this;
        }
        public String getDiskName() {
            return this.diskName;
        }

        public DescribeStorageSetDetailsResponseBodyDisksDisk setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeStorageSetDetailsResponseBodyDisksDisk setStorageSetId(String storageSetId) {
            this.storageSetId = storageSetId;
            return this;
        }
        public String getStorageSetId() {
            return this.storageSetId;
        }

        public DescribeStorageSetDetailsResponseBodyDisksDisk setStorageSetPartitionNumber(Integer storageSetPartitionNumber) {
            this.storageSetPartitionNumber = storageSetPartitionNumber;
            return this;
        }
        public Integer getStorageSetPartitionNumber() {
            return this.storageSetPartitionNumber;
        }

        public DescribeStorageSetDetailsResponseBodyDisksDisk setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

    public static class DescribeStorageSetDetailsResponseBodyDisks extends TeaModel {
        @NameInMap("Disk")
        public java.util.List<DescribeStorageSetDetailsResponseBodyDisksDisk> disk;

        public static DescribeStorageSetDetailsResponseBodyDisks build(java.util.Map<String, ?> map) throws Exception {
            DescribeStorageSetDetailsResponseBodyDisks self = new DescribeStorageSetDetailsResponseBodyDisks();
            return TeaModel.build(map, self);
        }

        public DescribeStorageSetDetailsResponseBodyDisks setDisk(java.util.List<DescribeStorageSetDetailsResponseBodyDisksDisk> disk) {
            this.disk = disk;
            return this;
        }
        public java.util.List<DescribeStorageSetDetailsResponseBodyDisksDisk> getDisk() {
            return this.disk;
        }

    }

}
