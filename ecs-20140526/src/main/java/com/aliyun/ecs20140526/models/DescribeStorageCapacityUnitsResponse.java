// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeStorageCapacityUnitsResponse extends TeaModel {
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

    @NameInMap("StorageCapacityUnits")
    @Validation(required = true)
    public DescribeStorageCapacityUnitsResponseStorageCapacityUnits storageCapacityUnits;

    public static DescribeStorageCapacityUnitsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeStorageCapacityUnitsResponse self = new DescribeStorageCapacityUnitsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeStorageCapacityUnitsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeStorageCapacityUnitsResponse setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeStorageCapacityUnitsResponse setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeStorageCapacityUnitsResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeStorageCapacityUnitsResponse setStorageCapacityUnits(DescribeStorageCapacityUnitsResponseStorageCapacityUnits storageCapacityUnits) {
        this.storageCapacityUnits = storageCapacityUnits;
        return this;
    }
    public DescribeStorageCapacityUnitsResponseStorageCapacityUnits getStorageCapacityUnits() {
        return this.storageCapacityUnits;
    }

    public static class DescribeStorageCapacityUnitsResponseStorageCapacityUnitsStorageCapacityUnit extends TeaModel {
        @NameInMap("RegionId")
        @Validation(required = true)
        public String regionId;

        @NameInMap("StorageCapacityUnitId")
        @Validation(required = true)
        public String storageCapacityUnitId;

        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("Capacity")
        @Validation(required = true)
        public Integer capacity;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        @NameInMap("CreationTime")
        @Validation(required = true)
        public String creationTime;

        @NameInMap("ExpiredTime")
        @Validation(required = true)
        public String expiredTime;

        @NameInMap("StartTime")
        @Validation(required = true)
        public String startTime;

        @NameInMap("Description")
        @Validation(required = true)
        public String description;

        @NameInMap("AllocationStatus")
        @Validation(required = true)
        public String allocationStatus;

        public static DescribeStorageCapacityUnitsResponseStorageCapacityUnitsStorageCapacityUnit build(java.util.Map<String, ?> map) throws Exception {
            DescribeStorageCapacityUnitsResponseStorageCapacityUnitsStorageCapacityUnit self = new DescribeStorageCapacityUnitsResponseStorageCapacityUnitsStorageCapacityUnit();
            return TeaModel.build(map, self);
        }

        public DescribeStorageCapacityUnitsResponseStorageCapacityUnitsStorageCapacityUnit setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeStorageCapacityUnitsResponseStorageCapacityUnitsStorageCapacityUnit setStorageCapacityUnitId(String storageCapacityUnitId) {
            this.storageCapacityUnitId = storageCapacityUnitId;
            return this;
        }
        public String getStorageCapacityUnitId() {
            return this.storageCapacityUnitId;
        }

        public DescribeStorageCapacityUnitsResponseStorageCapacityUnitsStorageCapacityUnit setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeStorageCapacityUnitsResponseStorageCapacityUnitsStorageCapacityUnit setCapacity(Integer capacity) {
            this.capacity = capacity;
            return this;
        }
        public Integer getCapacity() {
            return this.capacity;
        }

        public DescribeStorageCapacityUnitsResponseStorageCapacityUnitsStorageCapacityUnit setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeStorageCapacityUnitsResponseStorageCapacityUnitsStorageCapacityUnit setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeStorageCapacityUnitsResponseStorageCapacityUnitsStorageCapacityUnit setExpiredTime(String expiredTime) {
            this.expiredTime = expiredTime;
            return this;
        }
        public String getExpiredTime() {
            return this.expiredTime;
        }

        public DescribeStorageCapacityUnitsResponseStorageCapacityUnitsStorageCapacityUnit setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DescribeStorageCapacityUnitsResponseStorageCapacityUnitsStorageCapacityUnit setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeStorageCapacityUnitsResponseStorageCapacityUnitsStorageCapacityUnit setAllocationStatus(String allocationStatus) {
            this.allocationStatus = allocationStatus;
            return this;
        }
        public String getAllocationStatus() {
            return this.allocationStatus;
        }

    }

    public static class DescribeStorageCapacityUnitsResponseStorageCapacityUnits extends TeaModel {
        @NameInMap("StorageCapacityUnit")
        @Validation(required = true)
        public java.util.List<DescribeStorageCapacityUnitsResponseStorageCapacityUnitsStorageCapacityUnit> storageCapacityUnit;

        public static DescribeStorageCapacityUnitsResponseStorageCapacityUnits build(java.util.Map<String, ?> map) throws Exception {
            DescribeStorageCapacityUnitsResponseStorageCapacityUnits self = new DescribeStorageCapacityUnitsResponseStorageCapacityUnits();
            return TeaModel.build(map, self);
        }

        public DescribeStorageCapacityUnitsResponseStorageCapacityUnits setStorageCapacityUnit(java.util.List<DescribeStorageCapacityUnitsResponseStorageCapacityUnitsStorageCapacityUnit> storageCapacityUnit) {
            this.storageCapacityUnit = storageCapacityUnit;
            return this;
        }
        public java.util.List<DescribeStorageCapacityUnitsResponseStorageCapacityUnitsStorageCapacityUnit> getStorageCapacityUnit() {
            return this.storageCapacityUnit;
        }

    }

}
