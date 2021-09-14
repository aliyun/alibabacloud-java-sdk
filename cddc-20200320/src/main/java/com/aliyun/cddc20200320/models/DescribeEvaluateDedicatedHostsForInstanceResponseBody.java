// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cddc20200320.models;

import com.aliyun.tea.*;

public class DescribeEvaluateDedicatedHostsForInstanceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("InstanceRequiredCPU")
    public Integer instanceRequiredCPU;

    @NameInMap("CpuOverAllocationRatio")
    public Integer cpuOverAllocationRatio;

    @NameInMap("MemoryOverAllocationRatio")
    public Integer memoryOverAllocationRatio;

    @NameInMap("InstanceRequiredMemory")
    public Integer instanceRequiredMemory;

    @NameInMap("InstanceClassCode")
    public String instanceClassCode;

    @NameInMap("AvailableHostNum")
    public Integer availableHostNum;

    @NameInMap("InstanceRequiredStorage")
    public Integer instanceRequiredStorage;

    @NameInMap("DiskOverAllocationRatio")
    public Integer diskOverAllocationRatio;

    @NameInMap("DedicatedHostGroupId")
    public String dedicatedHostGroupId;

    @NameInMap("DedicatedHosts")
    public java.util.List<DescribeEvaluateDedicatedHostsForInstanceResponseBodyDedicatedHosts> dedicatedHosts;

    public static DescribeEvaluateDedicatedHostsForInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeEvaluateDedicatedHostsForInstanceResponseBody self = new DescribeEvaluateDedicatedHostsForInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeEvaluateDedicatedHostsForInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeEvaluateDedicatedHostsForInstanceResponseBody setInstanceRequiredCPU(Integer instanceRequiredCPU) {
        this.instanceRequiredCPU = instanceRequiredCPU;
        return this;
    }
    public Integer getInstanceRequiredCPU() {
        return this.instanceRequiredCPU;
    }

    public DescribeEvaluateDedicatedHostsForInstanceResponseBody setCpuOverAllocationRatio(Integer cpuOverAllocationRatio) {
        this.cpuOverAllocationRatio = cpuOverAllocationRatio;
        return this;
    }
    public Integer getCpuOverAllocationRatio() {
        return this.cpuOverAllocationRatio;
    }

    public DescribeEvaluateDedicatedHostsForInstanceResponseBody setMemoryOverAllocationRatio(Integer memoryOverAllocationRatio) {
        this.memoryOverAllocationRatio = memoryOverAllocationRatio;
        return this;
    }
    public Integer getMemoryOverAllocationRatio() {
        return this.memoryOverAllocationRatio;
    }

    public DescribeEvaluateDedicatedHostsForInstanceResponseBody setInstanceRequiredMemory(Integer instanceRequiredMemory) {
        this.instanceRequiredMemory = instanceRequiredMemory;
        return this;
    }
    public Integer getInstanceRequiredMemory() {
        return this.instanceRequiredMemory;
    }

    public DescribeEvaluateDedicatedHostsForInstanceResponseBody setInstanceClassCode(String instanceClassCode) {
        this.instanceClassCode = instanceClassCode;
        return this;
    }
    public String getInstanceClassCode() {
        return this.instanceClassCode;
    }

    public DescribeEvaluateDedicatedHostsForInstanceResponseBody setAvailableHostNum(Integer availableHostNum) {
        this.availableHostNum = availableHostNum;
        return this;
    }
    public Integer getAvailableHostNum() {
        return this.availableHostNum;
    }

    public DescribeEvaluateDedicatedHostsForInstanceResponseBody setInstanceRequiredStorage(Integer instanceRequiredStorage) {
        this.instanceRequiredStorage = instanceRequiredStorage;
        return this;
    }
    public Integer getInstanceRequiredStorage() {
        return this.instanceRequiredStorage;
    }

    public DescribeEvaluateDedicatedHostsForInstanceResponseBody setDiskOverAllocationRatio(Integer diskOverAllocationRatio) {
        this.diskOverAllocationRatio = diskOverAllocationRatio;
        return this;
    }
    public Integer getDiskOverAllocationRatio() {
        return this.diskOverAllocationRatio;
    }

    public DescribeEvaluateDedicatedHostsForInstanceResponseBody setDedicatedHostGroupId(String dedicatedHostGroupId) {
        this.dedicatedHostGroupId = dedicatedHostGroupId;
        return this;
    }
    public String getDedicatedHostGroupId() {
        return this.dedicatedHostGroupId;
    }

    public DescribeEvaluateDedicatedHostsForInstanceResponseBody setDedicatedHosts(java.util.List<DescribeEvaluateDedicatedHostsForInstanceResponseBodyDedicatedHosts> dedicatedHosts) {
        this.dedicatedHosts = dedicatedHosts;
        return this;
    }
    public java.util.List<DescribeEvaluateDedicatedHostsForInstanceResponseBodyDedicatedHosts> getDedicatedHosts() {
        return this.dedicatedHosts;
    }

    public static class DescribeEvaluateDedicatedHostsForInstanceResponseBodyDedicatedHosts extends TeaModel {
        @NameInMap("IsContainReadOnlyInstance")
        public Boolean isContainReadOnlyInstance;

        @NameInMap("HostAllocationStatus")
        public Boolean hostAllocationStatus;

        @NameInMap("Comment")
        public String comment;

        @NameInMap("HostFreeMem")
        public Integer hostFreeMem;

        @NameInMap("HostStatus")
        public String hostStatus;

        @NameInMap("HostFreeCPU")
        public Integer hostFreeCPU;

        @NameInMap("HostStorage")
        public Integer hostStorage;

        @NameInMap("HostCPU")
        public Integer hostCPU;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("HostFreeStorage")
        public Integer hostFreeStorage;

        @NameInMap("VSwitchId")
        public String vSwitchId;

        @NameInMap("DedicatedHostName")
        public String dedicatedHostName;

        @NameInMap("ZoneId")
        public String zoneId;

        @NameInMap("DedicatedHostId")
        public String dedicatedHostId;

        @NameInMap("Engine")
        public String engine;

        @NameInMap("IsCouldSSD")
        public Boolean isCouldSSD;

        @NameInMap("IsAvailableForInstance")
        public Boolean isAvailableForInstance;

        @NameInMap("HostMem")
        public Integer hostMem;

        @NameInMap("CreatedTime")
        public Long createdTime;

        @NameInMap("IPAddress")
        public String IPAddress;

        public static DescribeEvaluateDedicatedHostsForInstanceResponseBodyDedicatedHosts build(java.util.Map<String, ?> map) throws Exception {
            DescribeEvaluateDedicatedHostsForInstanceResponseBodyDedicatedHosts self = new DescribeEvaluateDedicatedHostsForInstanceResponseBodyDedicatedHosts();
            return TeaModel.build(map, self);
        }

        public DescribeEvaluateDedicatedHostsForInstanceResponseBodyDedicatedHosts setIsContainReadOnlyInstance(Boolean isContainReadOnlyInstance) {
            this.isContainReadOnlyInstance = isContainReadOnlyInstance;
            return this;
        }
        public Boolean getIsContainReadOnlyInstance() {
            return this.isContainReadOnlyInstance;
        }

        public DescribeEvaluateDedicatedHostsForInstanceResponseBodyDedicatedHosts setHostAllocationStatus(Boolean hostAllocationStatus) {
            this.hostAllocationStatus = hostAllocationStatus;
            return this;
        }
        public Boolean getHostAllocationStatus() {
            return this.hostAllocationStatus;
        }

        public DescribeEvaluateDedicatedHostsForInstanceResponseBodyDedicatedHosts setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public DescribeEvaluateDedicatedHostsForInstanceResponseBodyDedicatedHosts setHostFreeMem(Integer hostFreeMem) {
            this.hostFreeMem = hostFreeMem;
            return this;
        }
        public Integer getHostFreeMem() {
            return this.hostFreeMem;
        }

        public DescribeEvaluateDedicatedHostsForInstanceResponseBodyDedicatedHosts setHostStatus(String hostStatus) {
            this.hostStatus = hostStatus;
            return this;
        }
        public String getHostStatus() {
            return this.hostStatus;
        }

        public DescribeEvaluateDedicatedHostsForInstanceResponseBodyDedicatedHosts setHostFreeCPU(Integer hostFreeCPU) {
            this.hostFreeCPU = hostFreeCPU;
            return this;
        }
        public Integer getHostFreeCPU() {
            return this.hostFreeCPU;
        }

        public DescribeEvaluateDedicatedHostsForInstanceResponseBodyDedicatedHosts setHostStorage(Integer hostStorage) {
            this.hostStorage = hostStorage;
            return this;
        }
        public Integer getHostStorage() {
            return this.hostStorage;
        }

        public DescribeEvaluateDedicatedHostsForInstanceResponseBodyDedicatedHosts setHostCPU(Integer hostCPU) {
            this.hostCPU = hostCPU;
            return this;
        }
        public Integer getHostCPU() {
            return this.hostCPU;
        }

        public DescribeEvaluateDedicatedHostsForInstanceResponseBodyDedicatedHosts setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeEvaluateDedicatedHostsForInstanceResponseBodyDedicatedHosts setHostFreeStorage(Integer hostFreeStorage) {
            this.hostFreeStorage = hostFreeStorage;
            return this;
        }
        public Integer getHostFreeStorage() {
            return this.hostFreeStorage;
        }

        public DescribeEvaluateDedicatedHostsForInstanceResponseBodyDedicatedHosts setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public DescribeEvaluateDedicatedHostsForInstanceResponseBodyDedicatedHosts setDedicatedHostName(String dedicatedHostName) {
            this.dedicatedHostName = dedicatedHostName;
            return this;
        }
        public String getDedicatedHostName() {
            return this.dedicatedHostName;
        }

        public DescribeEvaluateDedicatedHostsForInstanceResponseBodyDedicatedHosts setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

        public DescribeEvaluateDedicatedHostsForInstanceResponseBodyDedicatedHosts setDedicatedHostId(String dedicatedHostId) {
            this.dedicatedHostId = dedicatedHostId;
            return this;
        }
        public String getDedicatedHostId() {
            return this.dedicatedHostId;
        }

        public DescribeEvaluateDedicatedHostsForInstanceResponseBodyDedicatedHosts setEngine(String engine) {
            this.engine = engine;
            return this;
        }
        public String getEngine() {
            return this.engine;
        }

        public DescribeEvaluateDedicatedHostsForInstanceResponseBodyDedicatedHosts setIsCouldSSD(Boolean isCouldSSD) {
            this.isCouldSSD = isCouldSSD;
            return this;
        }
        public Boolean getIsCouldSSD() {
            return this.isCouldSSD;
        }

        public DescribeEvaluateDedicatedHostsForInstanceResponseBodyDedicatedHosts setIsAvailableForInstance(Boolean isAvailableForInstance) {
            this.isAvailableForInstance = isAvailableForInstance;
            return this;
        }
        public Boolean getIsAvailableForInstance() {
            return this.isAvailableForInstance;
        }

        public DescribeEvaluateDedicatedHostsForInstanceResponseBodyDedicatedHosts setHostMem(Integer hostMem) {
            this.hostMem = hostMem;
            return this;
        }
        public Integer getHostMem() {
            return this.hostMem;
        }

        public DescribeEvaluateDedicatedHostsForInstanceResponseBodyDedicatedHosts setCreatedTime(Long createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public Long getCreatedTime() {
            return this.createdTime;
        }

        public DescribeEvaluateDedicatedHostsForInstanceResponseBodyDedicatedHosts setIPAddress(String IPAddress) {
            this.IPAddress = IPAddress;
            return this;
        }
        public String getIPAddress() {
            return this.IPAddress;
        }

    }

}
