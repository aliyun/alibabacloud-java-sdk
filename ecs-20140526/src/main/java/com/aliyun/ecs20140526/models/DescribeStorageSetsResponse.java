// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeStorageSetsResponse extends TeaModel {
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

    @NameInMap("StorageSets")
    @Validation(required = true)
    public DescribeStorageSetsResponseStorageSets storageSets;

    public static DescribeStorageSetsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeStorageSetsResponse self = new DescribeStorageSetsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeStorageSetsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeStorageSetsResponse setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeStorageSetsResponse setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeStorageSetsResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeStorageSetsResponse setStorageSets(DescribeStorageSetsResponseStorageSets storageSets) {
        this.storageSets = storageSets;
        return this;
    }
    public DescribeStorageSetsResponseStorageSets getStorageSets() {
        return this.storageSets;
    }

    public static class DescribeStorageSetsResponseStorageSetsStorageSet extends TeaModel {
        @NameInMap("StorageSetId")
        @Validation(required = true)
        public String storageSetId;

        @NameInMap("CreationTime")
        @Validation(required = true)
        public String creationTime;

        @NameInMap("StorageSetName")
        @Validation(required = true)
        public String storageSetName;

        @NameInMap("Description")
        @Validation(required = true)
        public String description;

        @NameInMap("StorageSetPartitionNumber")
        @Validation(required = true)
        public Integer storageSetPartitionNumber;

        @NameInMap("RegionId")
        @Validation(required = true)
        public String regionId;

        @NameInMap("ZoneId")
        @Validation(required = true)
        public String zoneId;

        public static DescribeStorageSetsResponseStorageSetsStorageSet build(java.util.Map<String, ?> map) throws Exception {
            DescribeStorageSetsResponseStorageSetsStorageSet self = new DescribeStorageSetsResponseStorageSetsStorageSet();
            return TeaModel.build(map, self);
        }

        public DescribeStorageSetsResponseStorageSetsStorageSet setStorageSetId(String storageSetId) {
            this.storageSetId = storageSetId;
            return this;
        }
        public String getStorageSetId() {
            return this.storageSetId;
        }

        public DescribeStorageSetsResponseStorageSetsStorageSet setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeStorageSetsResponseStorageSetsStorageSet setStorageSetName(String storageSetName) {
            this.storageSetName = storageSetName;
            return this;
        }
        public String getStorageSetName() {
            return this.storageSetName;
        }

        public DescribeStorageSetsResponseStorageSetsStorageSet setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeStorageSetsResponseStorageSetsStorageSet setStorageSetPartitionNumber(Integer storageSetPartitionNumber) {
            this.storageSetPartitionNumber = storageSetPartitionNumber;
            return this;
        }
        public Integer getStorageSetPartitionNumber() {
            return this.storageSetPartitionNumber;
        }

        public DescribeStorageSetsResponseStorageSetsStorageSet setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeStorageSetsResponseStorageSetsStorageSet setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

    public static class DescribeStorageSetsResponseStorageSets extends TeaModel {
        @NameInMap("StorageSet")
        @Validation(required = true)
        public java.util.List<DescribeStorageSetsResponseStorageSetsStorageSet> storageSet;

        public static DescribeStorageSetsResponseStorageSets build(java.util.Map<String, ?> map) throws Exception {
            DescribeStorageSetsResponseStorageSets self = new DescribeStorageSetsResponseStorageSets();
            return TeaModel.build(map, self);
        }

        public DescribeStorageSetsResponseStorageSets setStorageSet(java.util.List<DescribeStorageSetsResponseStorageSetsStorageSet> storageSet) {
            this.storageSet = storageSet;
            return this;
        }
        public java.util.List<DescribeStorageSetsResponseStorageSetsStorageSet> getStorageSet() {
            return this.storageSet;
        }

    }

}
