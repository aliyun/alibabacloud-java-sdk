// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeStorageCapacityUnitsResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("StorageCapacityUnits")
    public java.util.List<DescribeStorageCapacityUnitsResponseBodyStorageCapacityUnits> storageCapacityUnits;

    public static DescribeStorageCapacityUnitsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeStorageCapacityUnitsResponseBody self = new DescribeStorageCapacityUnitsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeStorageCapacityUnitsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeStorageCapacityUnitsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeStorageCapacityUnitsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeStorageCapacityUnitsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeStorageCapacityUnitsResponseBody setStorageCapacityUnits(java.util.List<DescribeStorageCapacityUnitsResponseBodyStorageCapacityUnits> storageCapacityUnits) {
        this.storageCapacityUnits = storageCapacityUnits;
        return this;
    }
    public java.util.List<DescribeStorageCapacityUnitsResponseBodyStorageCapacityUnits> getStorageCapacityUnits() {
        return this.storageCapacityUnits;
    }

    public static class DescribeStorageCapacityUnitsResponseBodyStorageCapacityUnits extends TeaModel {
        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("Status")
        public String status;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("Capacity")
        public Integer capacity;

        @NameInMap("Description")
        public String description;

        @NameInMap("AllocationStatus")
        public String allocationStatus;

        @NameInMap("ExpiredTime")
        public String expiredTime;

        @NameInMap("StorageCapacityUnitId")
        public String storageCapacityUnitId;

        @NameInMap("Name")
        public String name;

        @NameInMap("RegionId")
        public String regionId;

        public static DescribeStorageCapacityUnitsResponseBodyStorageCapacityUnits build(java.util.Map<String, ?> map) throws Exception {
            DescribeStorageCapacityUnitsResponseBodyStorageCapacityUnits self = new DescribeStorageCapacityUnitsResponseBodyStorageCapacityUnits();
            return TeaModel.build(map, self);
        }

        public DescribeStorageCapacityUnitsResponseBodyStorageCapacityUnits setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeStorageCapacityUnitsResponseBodyStorageCapacityUnits setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeStorageCapacityUnitsResponseBodyStorageCapacityUnits setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DescribeStorageCapacityUnitsResponseBodyStorageCapacityUnits setCapacity(Integer capacity) {
            this.capacity = capacity;
            return this;
        }
        public Integer getCapacity() {
            return this.capacity;
        }

        public DescribeStorageCapacityUnitsResponseBodyStorageCapacityUnits setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeStorageCapacityUnitsResponseBodyStorageCapacityUnits setAllocationStatus(String allocationStatus) {
            this.allocationStatus = allocationStatus;
            return this;
        }
        public String getAllocationStatus() {
            return this.allocationStatus;
        }

        public DescribeStorageCapacityUnitsResponseBodyStorageCapacityUnits setExpiredTime(String expiredTime) {
            this.expiredTime = expiredTime;
            return this;
        }
        public String getExpiredTime() {
            return this.expiredTime;
        }

        public DescribeStorageCapacityUnitsResponseBodyStorageCapacityUnits setStorageCapacityUnitId(String storageCapacityUnitId) {
            this.storageCapacityUnitId = storageCapacityUnitId;
            return this;
        }
        public String getStorageCapacityUnitId() {
            return this.storageCapacityUnitId;
        }

        public DescribeStorageCapacityUnitsResponseBodyStorageCapacityUnits setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeStorageCapacityUnitsResponseBodyStorageCapacityUnits setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

}
