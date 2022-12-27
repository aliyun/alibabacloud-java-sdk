// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeAutoProvisioningGroupInstancesResponseBody extends TeaModel {
    // An array consisting of Instance data.
    @NameInMap("Instances")
    public DescribeAutoProvisioningGroupInstancesResponseBodyInstances instances;

    // The page number of the returned page.
    @NameInMap("PageNumber")
    public Integer pageNumber;

    // The number of entries returned per page.
    @NameInMap("PageSize")
    public Integer pageSize;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    // The number of queried instances in the auto provisioning group.
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeAutoProvisioningGroupInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAutoProvisioningGroupInstancesResponseBody self = new DescribeAutoProvisioningGroupInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAutoProvisioningGroupInstancesResponseBody setInstances(DescribeAutoProvisioningGroupInstancesResponseBodyInstances instances) {
        this.instances = instances;
        return this;
    }
    public DescribeAutoProvisioningGroupInstancesResponseBodyInstances getInstances() {
        return this.instances;
    }

    public DescribeAutoProvisioningGroupInstancesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeAutoProvisioningGroupInstancesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeAutoProvisioningGroupInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAutoProvisioningGroupInstancesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeAutoProvisioningGroupInstancesResponseBodyInstancesInstance extends TeaModel {
        // The number of vCPUs.
        @NameInMap("CPU")
        public Integer CPU;

        // The time when the instance was created.
        @NameInMap("CreationTime")
        public String creationTime;

        // The ID of the instance.
        @NameInMap("InstanceId")
        public String instanceId;

        // The instance type of the ECS instance.
        @NameInMap("InstanceType")
        public String instanceType;

        // Indicates whether the instance is I/O optimized.
        @NameInMap("IoOptimized")
        public Boolean ioOptimized;

        // Indicates whether the instance is a preemptible instance.
        @NameInMap("IsSpot")
        public Boolean isSpot;

        // The memory size of the instance. Unit: MiB.
        @NameInMap("Memory")
        public Integer memory;

        // The network type of the instance. Valid values:
        // 
        // *   vpc
        // *   classic
        @NameInMap("NetworkType")
        public String networkType;

        // The operating system type of the instance. Valid values:
        // 
        // *   windows
        // *   linux
        @NameInMap("OsType")
        public String osType;

        // The region ID of the instance.
        @NameInMap("RegionId")
        public String regionId;

        // The status of the instance.
        @NameInMap("Status")
        public String status;

        // The zone ID of the instance.
        @NameInMap("ZoneId")
        public String zoneId;

        public static DescribeAutoProvisioningGroupInstancesResponseBodyInstancesInstance build(java.util.Map<String, ?> map) throws Exception {
            DescribeAutoProvisioningGroupInstancesResponseBodyInstancesInstance self = new DescribeAutoProvisioningGroupInstancesResponseBodyInstancesInstance();
            return TeaModel.build(map, self);
        }

        public DescribeAutoProvisioningGroupInstancesResponseBodyInstancesInstance setCPU(Integer CPU) {
            this.CPU = CPU;
            return this;
        }
        public Integer getCPU() {
            return this.CPU;
        }

        public DescribeAutoProvisioningGroupInstancesResponseBodyInstancesInstance setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeAutoProvisioningGroupInstancesResponseBodyInstancesInstance setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeAutoProvisioningGroupInstancesResponseBodyInstancesInstance setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public DescribeAutoProvisioningGroupInstancesResponseBodyInstancesInstance setIoOptimized(Boolean ioOptimized) {
            this.ioOptimized = ioOptimized;
            return this;
        }
        public Boolean getIoOptimized() {
            return this.ioOptimized;
        }

        public DescribeAutoProvisioningGroupInstancesResponseBodyInstancesInstance setIsSpot(Boolean isSpot) {
            this.isSpot = isSpot;
            return this;
        }
        public Boolean getIsSpot() {
            return this.isSpot;
        }

        public DescribeAutoProvisioningGroupInstancesResponseBodyInstancesInstance setMemory(Integer memory) {
            this.memory = memory;
            return this;
        }
        public Integer getMemory() {
            return this.memory;
        }

        public DescribeAutoProvisioningGroupInstancesResponseBodyInstancesInstance setNetworkType(String networkType) {
            this.networkType = networkType;
            return this;
        }
        public String getNetworkType() {
            return this.networkType;
        }

        public DescribeAutoProvisioningGroupInstancesResponseBodyInstancesInstance setOsType(String osType) {
            this.osType = osType;
            return this;
        }
        public String getOsType() {
            return this.osType;
        }

        public DescribeAutoProvisioningGroupInstancesResponseBodyInstancesInstance setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeAutoProvisioningGroupInstancesResponseBodyInstancesInstance setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeAutoProvisioningGroupInstancesResponseBodyInstancesInstance setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

    public static class DescribeAutoProvisioningGroupInstancesResponseBodyInstances extends TeaModel {
        @NameInMap("Instance")
        public java.util.List<DescribeAutoProvisioningGroupInstancesResponseBodyInstancesInstance> instance;

        public static DescribeAutoProvisioningGroupInstancesResponseBodyInstances build(java.util.Map<String, ?> map) throws Exception {
            DescribeAutoProvisioningGroupInstancesResponseBodyInstances self = new DescribeAutoProvisioningGroupInstancesResponseBodyInstances();
            return TeaModel.build(map, self);
        }

        public DescribeAutoProvisioningGroupInstancesResponseBodyInstances setInstance(java.util.List<DescribeAutoProvisioningGroupInstancesResponseBodyInstancesInstance> instance) {
            this.instance = instance;
            return this;
        }
        public java.util.List<DescribeAutoProvisioningGroupInstancesResponseBodyInstancesInstance> getInstance() {
            return this.instance;
        }

    }

}
