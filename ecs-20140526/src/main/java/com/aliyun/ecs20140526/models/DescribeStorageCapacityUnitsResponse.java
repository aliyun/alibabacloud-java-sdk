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

    }

    public static class DescribeStorageCapacityUnitsResponseStorageCapacityUnits extends TeaModel {
        @NameInMap("StorageCapacityUnit")
        @Validation(required = true)
        public java.util.List<DescribeStorageCapacityUnitsResponseStorageCapacityUnitsStorageCapacityUnit> storageCapacityUnit;

        public static DescribeStorageCapacityUnitsResponseStorageCapacityUnits build(java.util.Map<String, ?> map) throws Exception {
            DescribeStorageCapacityUnitsResponseStorageCapacityUnits self = new DescribeStorageCapacityUnitsResponseStorageCapacityUnits();
            return TeaModel.build(map, self);
        }

    }

}
