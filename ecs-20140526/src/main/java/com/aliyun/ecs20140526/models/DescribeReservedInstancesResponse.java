// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeReservedInstancesResponse extends TeaModel {
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

    @NameInMap("ReservedInstances")
    @Validation(required = true)
    public DescribeReservedInstancesResponseReservedInstances reservedInstances;

    public static DescribeReservedInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeReservedInstancesResponse self = new DescribeReservedInstancesResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeReservedInstancesResponseReservedInstancesReservedInstanceOperationLocksOperationLock extends TeaModel {
        @NameInMap("LockReason")
        @Validation(required = true)
        public String lockReason;

        public static DescribeReservedInstancesResponseReservedInstancesReservedInstanceOperationLocksOperationLock build(java.util.Map<String, ?> map) throws Exception {
            DescribeReservedInstancesResponseReservedInstancesReservedInstanceOperationLocksOperationLock self = new DescribeReservedInstancesResponseReservedInstancesReservedInstanceOperationLocksOperationLock();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeReservedInstancesResponseReservedInstancesReservedInstanceOperationLocks extends TeaModel {
        @NameInMap("OperationLock")
        @Validation(required = true)
        public java.util.List<DescribeReservedInstancesResponseReservedInstancesReservedInstanceOperationLocksOperationLock> operationLock;

        public static DescribeReservedInstancesResponseReservedInstancesReservedInstanceOperationLocks build(java.util.Map<String, ?> map) throws Exception {
            DescribeReservedInstancesResponseReservedInstancesReservedInstanceOperationLocks self = new DescribeReservedInstancesResponseReservedInstancesReservedInstanceOperationLocks();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeReservedInstancesResponseReservedInstancesReservedInstance extends TeaModel {
        @NameInMap("ReservedInstanceId")
        @Validation(required = true)
        public String reservedInstanceId;

        @NameInMap("RegionId")
        @Validation(required = true)
        public String regionId;

        @NameInMap("ZoneId")
        @Validation(required = true)
        public String zoneId;

        @NameInMap("ReservedInstanceName")
        @Validation(required = true)
        public String reservedInstanceName;

        @NameInMap("Description")
        @Validation(required = true)
        public String description;

        @NameInMap("InstanceType")
        @Validation(required = true)
        public String instanceType;

        @NameInMap("Scope")
        @Validation(required = true)
        public String scope;

        @NameInMap("OfferingType")
        @Validation(required = true)
        public String offeringType;

        @NameInMap("Platform")
        @Validation(required = true)
        public String platform;

        @NameInMap("InstanceAmount")
        @Validation(required = true)
        public Integer instanceAmount;

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

        @NameInMap("ResourceGroupId")
        @Validation(required = true)
        public String resourceGroupId;

        @NameInMap("AllocationStatus")
        @Validation(required = true)
        public String allocationStatus;

        @NameInMap("OperationLocks")
        @Validation(required = true)
        public DescribeReservedInstancesResponseReservedInstancesReservedInstanceOperationLocks operationLocks;

        public static DescribeReservedInstancesResponseReservedInstancesReservedInstance build(java.util.Map<String, ?> map) throws Exception {
            DescribeReservedInstancesResponseReservedInstancesReservedInstance self = new DescribeReservedInstancesResponseReservedInstancesReservedInstance();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeReservedInstancesResponseReservedInstances extends TeaModel {
        @NameInMap("ReservedInstance")
        @Validation(required = true)
        public java.util.List<DescribeReservedInstancesResponseReservedInstancesReservedInstance> reservedInstance;

        public static DescribeReservedInstancesResponseReservedInstances build(java.util.Map<String, ?> map) throws Exception {
            DescribeReservedInstancesResponseReservedInstances self = new DescribeReservedInstancesResponseReservedInstances();
            return TeaModel.build(map, self);
        }

    }

}
