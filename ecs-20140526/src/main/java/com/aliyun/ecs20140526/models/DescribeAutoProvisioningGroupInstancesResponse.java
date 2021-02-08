// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeAutoProvisioningGroupInstancesResponse extends TeaModel {
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

    @NameInMap("Instances")
    @Validation(required = true)
    public DescribeAutoProvisioningGroupInstancesResponseInstances instances;

    public static DescribeAutoProvisioningGroupInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAutoProvisioningGroupInstancesResponse self = new DescribeAutoProvisioningGroupInstancesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAutoProvisioningGroupInstancesResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAutoProvisioningGroupInstancesResponse setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeAutoProvisioningGroupInstancesResponse setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeAutoProvisioningGroupInstancesResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeAutoProvisioningGroupInstancesResponse setInstances(DescribeAutoProvisioningGroupInstancesResponseInstances instances) {
        this.instances = instances;
        return this;
    }
    public DescribeAutoProvisioningGroupInstancesResponseInstances getInstances() {
        return this.instances;
    }

    public static class DescribeAutoProvisioningGroupInstancesResponseInstancesInstance extends TeaModel {
        @NameInMap("InstanceId")
        @Validation(required = true)
        public String instanceId;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        @NameInMap("RegionId")
        @Validation(required = true)
        public String regionId;

        @NameInMap("ZoneId")
        @Validation(required = true)
        public String zoneId;

        @NameInMap("CPU")
        @Validation(required = true)
        public Integer CPU;

        @NameInMap("Memory")
        @Validation(required = true)
        public Integer memory;

        @NameInMap("InstanceType")
        @Validation(required = true)
        public String instanceType;

        @NameInMap("IsSpot")
        @Validation(required = true)
        public Boolean isSpot;

        @NameInMap("IoOptimized")
        @Validation(required = true)
        public Boolean ioOptimized;

        @NameInMap("NetworkType")
        @Validation(required = true)
        public String networkType;

        @NameInMap("OsType")
        @Validation(required = true)
        public String osType;

        @NameInMap("CreationTime")
        @Validation(required = true)
        public String creationTime;

        public static DescribeAutoProvisioningGroupInstancesResponseInstancesInstance build(java.util.Map<String, ?> map) throws Exception {
            DescribeAutoProvisioningGroupInstancesResponseInstancesInstance self = new DescribeAutoProvisioningGroupInstancesResponseInstancesInstance();
            return TeaModel.build(map, self);
        }

        public DescribeAutoProvisioningGroupInstancesResponseInstancesInstance setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeAutoProvisioningGroupInstancesResponseInstancesInstance setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeAutoProvisioningGroupInstancesResponseInstancesInstance setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeAutoProvisioningGroupInstancesResponseInstancesInstance setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

        public DescribeAutoProvisioningGroupInstancesResponseInstancesInstance setCPU(Integer CPU) {
            this.CPU = CPU;
            return this;
        }
        public Integer getCPU() {
            return this.CPU;
        }

        public DescribeAutoProvisioningGroupInstancesResponseInstancesInstance setMemory(Integer memory) {
            this.memory = memory;
            return this;
        }
        public Integer getMemory() {
            return this.memory;
        }

        public DescribeAutoProvisioningGroupInstancesResponseInstancesInstance setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public DescribeAutoProvisioningGroupInstancesResponseInstancesInstance setIsSpot(Boolean isSpot) {
            this.isSpot = isSpot;
            return this;
        }
        public Boolean getIsSpot() {
            return this.isSpot;
        }

        public DescribeAutoProvisioningGroupInstancesResponseInstancesInstance setIoOptimized(Boolean ioOptimized) {
            this.ioOptimized = ioOptimized;
            return this;
        }
        public Boolean getIoOptimized() {
            return this.ioOptimized;
        }

        public DescribeAutoProvisioningGroupInstancesResponseInstancesInstance setNetworkType(String networkType) {
            this.networkType = networkType;
            return this;
        }
        public String getNetworkType() {
            return this.networkType;
        }

        public DescribeAutoProvisioningGroupInstancesResponseInstancesInstance setOsType(String osType) {
            this.osType = osType;
            return this;
        }
        public String getOsType() {
            return this.osType;
        }

        public DescribeAutoProvisioningGroupInstancesResponseInstancesInstance setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

    }

    public static class DescribeAutoProvisioningGroupInstancesResponseInstances extends TeaModel {
        @NameInMap("Instance")
        @Validation(required = true)
        public java.util.List<DescribeAutoProvisioningGroupInstancesResponseInstancesInstance> instance;

        public static DescribeAutoProvisioningGroupInstancesResponseInstances build(java.util.Map<String, ?> map) throws Exception {
            DescribeAutoProvisioningGroupInstancesResponseInstances self = new DescribeAutoProvisioningGroupInstancesResponseInstances();
            return TeaModel.build(map, self);
        }

        public DescribeAutoProvisioningGroupInstancesResponseInstances setInstance(java.util.List<DescribeAutoProvisioningGroupInstancesResponseInstancesInstance> instance) {
            this.instance = instance;
            return this;
        }
        public java.util.List<DescribeAutoProvisioningGroupInstancesResponseInstancesInstance> getInstance() {
            return this.instance;
        }

    }

}
