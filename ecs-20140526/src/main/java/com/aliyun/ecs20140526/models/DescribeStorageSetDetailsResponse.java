// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeStorageSetDetailsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("TotalCount")
    @Validation(required = true)
    public Integer totalCount;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public Integer pageNumber;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Integer pageSize;

    @NameInMap("Disks")
    @Validation(required = true)
    public DescribeStorageSetDetailsResponseDisks disks;

    public static DescribeStorageSetDetailsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeStorageSetDetailsResponse self = new DescribeStorageSetDetailsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeStorageSetDetailsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeStorageSetDetailsResponse setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeStorageSetDetailsResponse setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeStorageSetDetailsResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeStorageSetDetailsResponse setDisks(DescribeStorageSetDetailsResponseDisks disks) {
        this.disks = disks;
        return this;
    }
    public DescribeStorageSetDetailsResponseDisks getDisks() {
        return this.disks;
    }

    public static class DescribeStorageSetDetailsResponseDisksDisk extends TeaModel {
        @NameInMap("DiskId")
        @Validation(required = true)
        public String diskId;

        @NameInMap("DiskName")
        @Validation(required = true)
        public String diskName;

        @NameInMap("Category")
        @Validation(required = true)
        public String category;

        @NameInMap("StorageSetId")
        @Validation(required = true)
        public String storageSetId;

        @NameInMap("CreationTime")
        @Validation(required = true)
        public String creationTime;

        @NameInMap("StorageSetPartitionNumber")
        @Validation(required = true)
        public Integer storageSetPartitionNumber;

        @NameInMap("RegionId")
        @Validation(required = true)
        public String regionId;

        @NameInMap("ZoneId")
        @Validation(required = true)
        public String zoneId;

        public static DescribeStorageSetDetailsResponseDisksDisk build(java.util.Map<String, ?> map) throws Exception {
            DescribeStorageSetDetailsResponseDisksDisk self = new DescribeStorageSetDetailsResponseDisksDisk();
            return TeaModel.build(map, self);
        }

        public DescribeStorageSetDetailsResponseDisksDisk setDiskId(String diskId) {
            this.diskId = diskId;
            return this;
        }
        public String getDiskId() {
            return this.diskId;
        }

        public DescribeStorageSetDetailsResponseDisksDisk setDiskName(String diskName) {
            this.diskName = diskName;
            return this;
        }
        public String getDiskName() {
            return this.diskName;
        }

        public DescribeStorageSetDetailsResponseDisksDisk setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public DescribeStorageSetDetailsResponseDisksDisk setStorageSetId(String storageSetId) {
            this.storageSetId = storageSetId;
            return this;
        }
        public String getStorageSetId() {
            return this.storageSetId;
        }

        public DescribeStorageSetDetailsResponseDisksDisk setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeStorageSetDetailsResponseDisksDisk setStorageSetPartitionNumber(Integer storageSetPartitionNumber) {
            this.storageSetPartitionNumber = storageSetPartitionNumber;
            return this;
        }
        public Integer getStorageSetPartitionNumber() {
            return this.storageSetPartitionNumber;
        }

        public DescribeStorageSetDetailsResponseDisksDisk setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeStorageSetDetailsResponseDisksDisk setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

    public static class DescribeStorageSetDetailsResponseDisks extends TeaModel {
        @NameInMap("Disk")
        @Validation(required = true)
        public java.util.List<DescribeStorageSetDetailsResponseDisksDisk> disk;

        public static DescribeStorageSetDetailsResponseDisks build(java.util.Map<String, ?> map) throws Exception {
            DescribeStorageSetDetailsResponseDisks self = new DescribeStorageSetDetailsResponseDisks();
            return TeaModel.build(map, self);
        }

        public DescribeStorageSetDetailsResponseDisks setDisk(java.util.List<DescribeStorageSetDetailsResponseDisksDisk> disk) {
            this.disk = disk;
            return this;
        }
        public java.util.List<DescribeStorageSetDetailsResponseDisksDisk> getDisk() {
            return this.disk;
        }

    }

}
