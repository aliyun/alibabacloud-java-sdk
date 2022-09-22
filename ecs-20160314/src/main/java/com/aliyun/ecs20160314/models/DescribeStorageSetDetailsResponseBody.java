// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class DescribeStorageSetDetailsResponseBody extends TeaModel {
    @NameInMap("Disks")
    public Disks disks;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeStorageSetDetailsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeStorageSetDetailsResponseBody self = new DescribeStorageSetDetailsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeStorageSetDetailsResponseBody setDisks(Disks disks) {
        this.disks = disks;
        return this;
    }
    public Disks getDisks() {
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

    public static class Disk extends TeaModel {
        @NameInMap("Category")
        public String category;

        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("DiskId")
        public String diskId;

        @NameInMap("DiskName")
        public String diskName;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("StorageSetId")
        public String storageSetId;

        @NameInMap("StorageSetPartitionNumber")
        public Integer storageSetPartitionNumber;

        @NameInMap("ZoneId")
        public String zoneId;

        public static Disk build(java.util.Map<String, ?> map) throws Exception {
            Disk self = new Disk();
            return TeaModel.build(map, self);
        }

        public Disk setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public Disk setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public Disk setDiskId(String diskId) {
            this.diskId = diskId;
            return this;
        }
        public String getDiskId() {
            return this.diskId;
        }

        public Disk setDiskName(String diskName) {
            this.diskName = diskName;
            return this;
        }
        public String getDiskName() {
            return this.diskName;
        }

        public Disk setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public Disk setStorageSetId(String storageSetId) {
            this.storageSetId = storageSetId;
            return this;
        }
        public String getStorageSetId() {
            return this.storageSetId;
        }

        public Disk setStorageSetPartitionNumber(Integer storageSetPartitionNumber) {
            this.storageSetPartitionNumber = storageSetPartitionNumber;
            return this;
        }
        public Integer getStorageSetPartitionNumber() {
            return this.storageSetPartitionNumber;
        }

        public Disk setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

    public static class Disks extends TeaModel {
        @NameInMap("Disk")
        public java.util.List<Disk> disk;

        public static Disks build(java.util.Map<String, ?> map) throws Exception {
            Disks self = new Disks();
            return TeaModel.build(map, self);
        }

        public Disks setDisk(java.util.List<Disk> disk) {
            this.disk = disk;
            return this;
        }
        public java.util.List<Disk> getDisk() {
            return this.disk;
        }

    }

}
