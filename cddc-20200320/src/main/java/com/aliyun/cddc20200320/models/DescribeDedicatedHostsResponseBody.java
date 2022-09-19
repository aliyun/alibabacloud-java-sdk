// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cddc20200320.models;

import com.aliyun.tea.*;

public class DescribeDedicatedHostsResponseBody extends TeaModel {
    @NameInMap("DedicatedHostGroupId")
    public String dedicatedHostGroupId;

    @NameInMap("DedicatedHosts")
    public DescribeDedicatedHostsResponseBodyDedicatedHosts dedicatedHosts;

    @NameInMap("MaxAutoScaleHostStorage")
    public Long maxAutoScaleHostStorage;

    @NameInMap("PageNumbers")
    public Integer pageNumbers;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalRecords")
    public Integer totalRecords;

    public static DescribeDedicatedHostsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDedicatedHostsResponseBody self = new DescribeDedicatedHostsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDedicatedHostsResponseBody setDedicatedHostGroupId(String dedicatedHostGroupId) {
        this.dedicatedHostGroupId = dedicatedHostGroupId;
        return this;
    }
    public String getDedicatedHostGroupId() {
        return this.dedicatedHostGroupId;
    }

    public DescribeDedicatedHostsResponseBody setDedicatedHosts(DescribeDedicatedHostsResponseBodyDedicatedHosts dedicatedHosts) {
        this.dedicatedHosts = dedicatedHosts;
        return this;
    }
    public DescribeDedicatedHostsResponseBodyDedicatedHosts getDedicatedHosts() {
        return this.dedicatedHosts;
    }

    public DescribeDedicatedHostsResponseBody setMaxAutoScaleHostStorage(Long maxAutoScaleHostStorage) {
        this.maxAutoScaleHostStorage = maxAutoScaleHostStorage;
        return this;
    }
    public Long getMaxAutoScaleHostStorage() {
        return this.maxAutoScaleHostStorage;
    }

    public DescribeDedicatedHostsResponseBody setPageNumbers(Integer pageNumbers) {
        this.pageNumbers = pageNumbers;
        return this;
    }
    public Integer getPageNumbers() {
        return this.pageNumbers;
    }

    public DescribeDedicatedHostsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeDedicatedHostsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDedicatedHostsResponseBody setTotalRecords(Integer totalRecords) {
        this.totalRecords = totalRecords;
        return this;
    }
    public Integer getTotalRecords() {
        return this.totalRecords;
    }

    public static class DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHosts extends TeaModel {
        @NameInMap("AccountName")
        public String accountName;

        @NameInMap("AccountType")
        public String accountType;

        @NameInMap("AllocationStatus")
        public String allocationStatus;

        @NameInMap("BastionInstanceId")
        public String bastionInstanceId;

        @NameInMap("CPUAllocationRatio")
        public String CPUAllocationRatio;

        @NameInMap("Category")
        public String category;

        @NameInMap("ChargeType")
        public String chargeType;

        @NameInMap("CpuUsed")
        public String cpuUsed;

        @NameInMap("CreatedTime")
        public String createdTime;

        @NameInMap("DedicatedHostGroupId")
        public String dedicatedHostGroupId;

        @NameInMap("DedicatedHostId")
        public String dedicatedHostId;

        @NameInMap("DiskAllocationRatio")
        public String diskAllocationRatio;

        @NameInMap("DiskInfo")
        public String diskInfo;

        @NameInMap("DistributionSymbol")
        public String distributionSymbol;

        @NameInMap("DistributionTag")
        public String distributionTag;

        @NameInMap("EcsClassCode")
        public String ecsClassCode;

        @NameInMap("EcsId")
        public String ecsId;

        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("Engine")
        public String engine;

        @NameInMap("HostCPU")
        public String hostCPU;

        @NameInMap("HostClass")
        public String hostClass;

        @NameInMap("HostMem")
        public String hostMem;

        @NameInMap("HostName")
        public String hostName;

        @NameInMap("HostStatus")
        public String hostStatus;

        @NameInMap("HostStorage")
        public String hostStorage;

        @NameInMap("HostType")
        public String hostType;

        @NameInMap("IPAddress")
        public String IPAddress;

        @NameInMap("ImageCategory")
        public String imageCategory;

        @NameInMap("InstanceNumber")
        public String instanceNumber;

        @NameInMap("MemAllocationRatio")
        public String memAllocationRatio;

        @NameInMap("MemoryUsed")
        public String memoryUsed;

        @NameInMap("MssqlSupportVersion")
        public String mssqlSupportVersion;

        @NameInMap("OpenPermission")
        public String openPermission;

        @NameInMap("StorageUsed")
        public String storageUsed;

        @NameInMap("VPCId")
        public String VPCId;

        @NameInMap("VSwitchId")
        public String vSwitchId;

        @NameInMap("ZoneId")
        public String zoneId;

        public static DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHosts build(java.util.Map<String, ?> map) throws Exception {
            DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHosts self = new DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHosts();
            return TeaModel.build(map, self);
        }

        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHosts setAccountName(String accountName) {
            this.accountName = accountName;
            return this;
        }
        public String getAccountName() {
            return this.accountName;
        }

        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHosts setAccountType(String accountType) {
            this.accountType = accountType;
            return this;
        }
        public String getAccountType() {
            return this.accountType;
        }

        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHosts setAllocationStatus(String allocationStatus) {
            this.allocationStatus = allocationStatus;
            return this;
        }
        public String getAllocationStatus() {
            return this.allocationStatus;
        }

        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHosts setBastionInstanceId(String bastionInstanceId) {
            this.bastionInstanceId = bastionInstanceId;
            return this;
        }
        public String getBastionInstanceId() {
            return this.bastionInstanceId;
        }

        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHosts setCPUAllocationRatio(String CPUAllocationRatio) {
            this.CPUAllocationRatio = CPUAllocationRatio;
            return this;
        }
        public String getCPUAllocationRatio() {
            return this.CPUAllocationRatio;
        }

        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHosts setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHosts setChargeType(String chargeType) {
            this.chargeType = chargeType;
            return this;
        }
        public String getChargeType() {
            return this.chargeType;
        }

        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHosts setCpuUsed(String cpuUsed) {
            this.cpuUsed = cpuUsed;
            return this;
        }
        public String getCpuUsed() {
            return this.cpuUsed;
        }

        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHosts setCreatedTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public String getCreatedTime() {
            return this.createdTime;
        }

        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHosts setDedicatedHostGroupId(String dedicatedHostGroupId) {
            this.dedicatedHostGroupId = dedicatedHostGroupId;
            return this;
        }
        public String getDedicatedHostGroupId() {
            return this.dedicatedHostGroupId;
        }

        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHosts setDedicatedHostId(String dedicatedHostId) {
            this.dedicatedHostId = dedicatedHostId;
            return this;
        }
        public String getDedicatedHostId() {
            return this.dedicatedHostId;
        }

        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHosts setDiskAllocationRatio(String diskAllocationRatio) {
            this.diskAllocationRatio = diskAllocationRatio;
            return this;
        }
        public String getDiskAllocationRatio() {
            return this.diskAllocationRatio;
        }

        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHosts setDiskInfo(String diskInfo) {
            this.diskInfo = diskInfo;
            return this;
        }
        public String getDiskInfo() {
            return this.diskInfo;
        }

        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHosts setDistributionSymbol(String distributionSymbol) {
            this.distributionSymbol = distributionSymbol;
            return this;
        }
        public String getDistributionSymbol() {
            return this.distributionSymbol;
        }

        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHosts setDistributionTag(String distributionTag) {
            this.distributionTag = distributionTag;
            return this;
        }
        public String getDistributionTag() {
            return this.distributionTag;
        }

        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHosts setEcsClassCode(String ecsClassCode) {
            this.ecsClassCode = ecsClassCode;
            return this;
        }
        public String getEcsClassCode() {
            return this.ecsClassCode;
        }

        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHosts setEcsId(String ecsId) {
            this.ecsId = ecsId;
            return this;
        }
        public String getEcsId() {
            return this.ecsId;
        }

        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHosts setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHosts setEngine(String engine) {
            this.engine = engine;
            return this;
        }
        public String getEngine() {
            return this.engine;
        }

        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHosts setHostCPU(String hostCPU) {
            this.hostCPU = hostCPU;
            return this;
        }
        public String getHostCPU() {
            return this.hostCPU;
        }

        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHosts setHostClass(String hostClass) {
            this.hostClass = hostClass;
            return this;
        }
        public String getHostClass() {
            return this.hostClass;
        }

        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHosts setHostMem(String hostMem) {
            this.hostMem = hostMem;
            return this;
        }
        public String getHostMem() {
            return this.hostMem;
        }

        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHosts setHostName(String hostName) {
            this.hostName = hostName;
            return this;
        }
        public String getHostName() {
            return this.hostName;
        }

        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHosts setHostStatus(String hostStatus) {
            this.hostStatus = hostStatus;
            return this;
        }
        public String getHostStatus() {
            return this.hostStatus;
        }

        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHosts setHostStorage(String hostStorage) {
            this.hostStorage = hostStorage;
            return this;
        }
        public String getHostStorage() {
            return this.hostStorage;
        }

        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHosts setHostType(String hostType) {
            this.hostType = hostType;
            return this;
        }
        public String getHostType() {
            return this.hostType;
        }

        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHosts setIPAddress(String IPAddress) {
            this.IPAddress = IPAddress;
            return this;
        }
        public String getIPAddress() {
            return this.IPAddress;
        }

        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHosts setImageCategory(String imageCategory) {
            this.imageCategory = imageCategory;
            return this;
        }
        public String getImageCategory() {
            return this.imageCategory;
        }

        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHosts setInstanceNumber(String instanceNumber) {
            this.instanceNumber = instanceNumber;
            return this;
        }
        public String getInstanceNumber() {
            return this.instanceNumber;
        }

        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHosts setMemAllocationRatio(String memAllocationRatio) {
            this.memAllocationRatio = memAllocationRatio;
            return this;
        }
        public String getMemAllocationRatio() {
            return this.memAllocationRatio;
        }

        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHosts setMemoryUsed(String memoryUsed) {
            this.memoryUsed = memoryUsed;
            return this;
        }
        public String getMemoryUsed() {
            return this.memoryUsed;
        }

        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHosts setMssqlSupportVersion(String mssqlSupportVersion) {
            this.mssqlSupportVersion = mssqlSupportVersion;
            return this;
        }
        public String getMssqlSupportVersion() {
            return this.mssqlSupportVersion;
        }

        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHosts setOpenPermission(String openPermission) {
            this.openPermission = openPermission;
            return this;
        }
        public String getOpenPermission() {
            return this.openPermission;
        }

        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHosts setStorageUsed(String storageUsed) {
            this.storageUsed = storageUsed;
            return this;
        }
        public String getStorageUsed() {
            return this.storageUsed;
        }

        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHosts setVPCId(String VPCId) {
            this.VPCId = VPCId;
            return this;
        }
        public String getVPCId() {
            return this.VPCId;
        }

        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHosts setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHosts setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

    public static class DescribeDedicatedHostsResponseBodyDedicatedHosts extends TeaModel {
        @NameInMap("DedicatedHosts")
        public java.util.List<DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHosts> dedicatedHosts;

        public static DescribeDedicatedHostsResponseBodyDedicatedHosts build(java.util.Map<String, ?> map) throws Exception {
            DescribeDedicatedHostsResponseBodyDedicatedHosts self = new DescribeDedicatedHostsResponseBodyDedicatedHosts();
            return TeaModel.build(map, self);
        }

        public DescribeDedicatedHostsResponseBodyDedicatedHosts setDedicatedHosts(java.util.List<DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHosts> dedicatedHosts) {
            this.dedicatedHosts = dedicatedHosts;
            return this;
        }
        public java.util.List<DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHosts> getDedicatedHosts() {
            return this.dedicatedHosts;
        }

    }

}
