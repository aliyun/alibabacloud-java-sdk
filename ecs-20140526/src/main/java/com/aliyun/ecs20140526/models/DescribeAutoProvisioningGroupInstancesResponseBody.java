// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeAutoProvisioningGroupInstancesResponseBody extends TeaModel {
    @NameInMap("Instances")
    public DescribeAutoProvisioningGroupInstancesResponseBodyInstances instances;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("CPU")
        public Integer CPU;

        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("InstanceType")
        public String instanceType;

        @NameInMap("IoOptimized")
        public Boolean ioOptimized;

        @NameInMap("IsSpot")
        public Boolean isSpot;

        @NameInMap("Memory")
        public Integer memory;

        @NameInMap("NetworkType")
        public String networkType;

        @NameInMap("OsType")
        public String osType;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("Status")
        public String status;

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
