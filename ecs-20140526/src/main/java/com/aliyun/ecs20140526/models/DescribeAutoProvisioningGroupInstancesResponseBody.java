// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeAutoProvisioningGroupInstancesResponseBody extends TeaModel {
    /**
     * <p>The information about the instances in the auto provisioning group.</p>
     */
    @NameInMap("Instances")
    public DescribeAutoProvisioningGroupInstancesResponseBodyInstances instances;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>B48A12CD-1295-4A38-A8F0-0E92C937****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The number of queried instances in the auto provisioning group.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
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
        /**
         * <p>The number of vCPU cores of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("CPU")
        public Integer CPU;

        /**
         * <p>The time when the instance was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2017-12-10T04:04Z</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>i-bp67acfmxazb4p****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The ECS instance type.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs.g5.large</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        /**
         * <p>Indicates whether the instance is an I/O optimized instance.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IoOptimized")
        public Boolean ioOptimized;

        /**
         * <p>Indicates whether the instance is a spot instance.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsSpot")
        public Boolean isSpot;

        /**
         * <p>The memory capacity of the instance. Unit: MiB.</p>
         * 
         * <strong>example:</strong>
         * <p>1024</p>
         */
        @NameInMap("Memory")
        public Integer memory;

        /**
         * <p>The network type of the instance. Valid values:</p>
         * <ul>
         * <li>vpc: Virtual Private Cloud (VPC)</li>
         * <li>classic: classic network</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>vpc</p>
         */
        @NameInMap("NetworkType")
        public String networkType;

        /**
         * <p>The operating system type of the instance. Valid values:</p>
         * <ul>
         * <li>windows</li>
         * <li>linux</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>linux</p>
         */
        @NameInMap("OsType")
        public String osType;

        /**
         * <p>The region ID of the container group.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The status of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The ID of the zone to which the instance belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-g</p>
         */
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
