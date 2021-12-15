// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cddc20200320.models;

import com.aliyun.tea.*;

public class DescribeDedicatedHostAttributeResponseBody extends TeaModel {
    @NameInMap("AccountName")
    public String accountName;

    @NameInMap("AccountType")
    public String accountType;

    @NameInMap("AllocationStatus")
    public String allocationStatus;

    @NameInMap("AutoRenew")
    public String autoRenew;

    @NameInMap("CPUAllocationRatio")
    public String CPUAllocationRatio;

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

    @NameInMap("EcsClassCode")
    public String ecsClassCode;

    @NameInMap("ExpiredTime")
    public String expiredTime;

    @NameInMap("HostCPU")
    public Integer hostCPU;

    @NameInMap("HostClass")
    public String hostClass;

    @NameInMap("HostMem")
    public Integer hostMem;

    @NameInMap("HostName")
    public String hostName;

    @NameInMap("HostStatus")
    public String hostStatus;

    @NameInMap("HostStorage")
    public Integer hostStorage;

    @NameInMap("HostType")
    public String hostType;

    @NameInMap("IPAddress")
    public String IPAddress;

    @NameInMap("ImageCategory")
    public String imageCategory;

    @NameInMap("InstanceNumber")
    public Integer instanceNumber;

    @NameInMap("InstanceNumberMaster")
    public Integer instanceNumberMaster;

    @NameInMap("InstanceNumberROMaster")
    public Integer instanceNumberROMaster;

    @NameInMap("InstanceNumberROSlave")
    public Integer instanceNumberROSlave;

    @NameInMap("InstanceNumberSlave")
    public Integer instanceNumberSlave;

    @NameInMap("MemAllocationRatio")
    public String memAllocationRatio;

    @NameInMap("MemoryUsed")
    public String memoryUsed;

    @NameInMap("OpenPermission")
    public String openPermission;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("StorageUsed")
    public String storageUsed;

    @NameInMap("VPCId")
    public String VPCId;

    @NameInMap("VSwitchId")
    public String vSwitchId;

    @NameInMap("ZoneId")
    public String zoneId;

    public static DescribeDedicatedHostAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDedicatedHostAttributeResponseBody self = new DescribeDedicatedHostAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDedicatedHostAttributeResponseBody setAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }
    public String getAccountName() {
        return this.accountName;
    }

    public DescribeDedicatedHostAttributeResponseBody setAccountType(String accountType) {
        this.accountType = accountType;
        return this;
    }
    public String getAccountType() {
        return this.accountType;
    }

    public DescribeDedicatedHostAttributeResponseBody setAllocationStatus(String allocationStatus) {
        this.allocationStatus = allocationStatus;
        return this;
    }
    public String getAllocationStatus() {
        return this.allocationStatus;
    }

    public DescribeDedicatedHostAttributeResponseBody setAutoRenew(String autoRenew) {
        this.autoRenew = autoRenew;
        return this;
    }
    public String getAutoRenew() {
        return this.autoRenew;
    }

    public DescribeDedicatedHostAttributeResponseBody setCPUAllocationRatio(String CPUAllocationRatio) {
        this.CPUAllocationRatio = CPUAllocationRatio;
        return this;
    }
    public String getCPUAllocationRatio() {
        return this.CPUAllocationRatio;
    }

    public DescribeDedicatedHostAttributeResponseBody setCpuUsed(String cpuUsed) {
        this.cpuUsed = cpuUsed;
        return this;
    }
    public String getCpuUsed() {
        return this.cpuUsed;
    }

    public DescribeDedicatedHostAttributeResponseBody setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }
    public String getCreatedTime() {
        return this.createdTime;
    }

    public DescribeDedicatedHostAttributeResponseBody setDedicatedHostGroupId(String dedicatedHostGroupId) {
        this.dedicatedHostGroupId = dedicatedHostGroupId;
        return this;
    }
    public String getDedicatedHostGroupId() {
        return this.dedicatedHostGroupId;
    }

    public DescribeDedicatedHostAttributeResponseBody setDedicatedHostId(String dedicatedHostId) {
        this.dedicatedHostId = dedicatedHostId;
        return this;
    }
    public String getDedicatedHostId() {
        return this.dedicatedHostId;
    }

    public DescribeDedicatedHostAttributeResponseBody setDiskAllocationRatio(String diskAllocationRatio) {
        this.diskAllocationRatio = diskAllocationRatio;
        return this;
    }
    public String getDiskAllocationRatio() {
        return this.diskAllocationRatio;
    }

    public DescribeDedicatedHostAttributeResponseBody setEcsClassCode(String ecsClassCode) {
        this.ecsClassCode = ecsClassCode;
        return this;
    }
    public String getEcsClassCode() {
        return this.ecsClassCode;
    }

    public DescribeDedicatedHostAttributeResponseBody setExpiredTime(String expiredTime) {
        this.expiredTime = expiredTime;
        return this;
    }
    public String getExpiredTime() {
        return this.expiredTime;
    }

    public DescribeDedicatedHostAttributeResponseBody setHostCPU(Integer hostCPU) {
        this.hostCPU = hostCPU;
        return this;
    }
    public Integer getHostCPU() {
        return this.hostCPU;
    }

    public DescribeDedicatedHostAttributeResponseBody setHostClass(String hostClass) {
        this.hostClass = hostClass;
        return this;
    }
    public String getHostClass() {
        return this.hostClass;
    }

    public DescribeDedicatedHostAttributeResponseBody setHostMem(Integer hostMem) {
        this.hostMem = hostMem;
        return this;
    }
    public Integer getHostMem() {
        return this.hostMem;
    }

    public DescribeDedicatedHostAttributeResponseBody setHostName(String hostName) {
        this.hostName = hostName;
        return this;
    }
    public String getHostName() {
        return this.hostName;
    }

    public DescribeDedicatedHostAttributeResponseBody setHostStatus(String hostStatus) {
        this.hostStatus = hostStatus;
        return this;
    }
    public String getHostStatus() {
        return this.hostStatus;
    }

    public DescribeDedicatedHostAttributeResponseBody setHostStorage(Integer hostStorage) {
        this.hostStorage = hostStorage;
        return this;
    }
    public Integer getHostStorage() {
        return this.hostStorage;
    }

    public DescribeDedicatedHostAttributeResponseBody setHostType(String hostType) {
        this.hostType = hostType;
        return this;
    }
    public String getHostType() {
        return this.hostType;
    }

    public DescribeDedicatedHostAttributeResponseBody setIPAddress(String IPAddress) {
        this.IPAddress = IPAddress;
        return this;
    }
    public String getIPAddress() {
        return this.IPAddress;
    }

    public DescribeDedicatedHostAttributeResponseBody setImageCategory(String imageCategory) {
        this.imageCategory = imageCategory;
        return this;
    }
    public String getImageCategory() {
        return this.imageCategory;
    }

    public DescribeDedicatedHostAttributeResponseBody setInstanceNumber(Integer instanceNumber) {
        this.instanceNumber = instanceNumber;
        return this;
    }
    public Integer getInstanceNumber() {
        return this.instanceNumber;
    }

    public DescribeDedicatedHostAttributeResponseBody setInstanceNumberMaster(Integer instanceNumberMaster) {
        this.instanceNumberMaster = instanceNumberMaster;
        return this;
    }
    public Integer getInstanceNumberMaster() {
        return this.instanceNumberMaster;
    }

    public DescribeDedicatedHostAttributeResponseBody setInstanceNumberROMaster(Integer instanceNumberROMaster) {
        this.instanceNumberROMaster = instanceNumberROMaster;
        return this;
    }
    public Integer getInstanceNumberROMaster() {
        return this.instanceNumberROMaster;
    }

    public DescribeDedicatedHostAttributeResponseBody setInstanceNumberROSlave(Integer instanceNumberROSlave) {
        this.instanceNumberROSlave = instanceNumberROSlave;
        return this;
    }
    public Integer getInstanceNumberROSlave() {
        return this.instanceNumberROSlave;
    }

    public DescribeDedicatedHostAttributeResponseBody setInstanceNumberSlave(Integer instanceNumberSlave) {
        this.instanceNumberSlave = instanceNumberSlave;
        return this;
    }
    public Integer getInstanceNumberSlave() {
        return this.instanceNumberSlave;
    }

    public DescribeDedicatedHostAttributeResponseBody setMemAllocationRatio(String memAllocationRatio) {
        this.memAllocationRatio = memAllocationRatio;
        return this;
    }
    public String getMemAllocationRatio() {
        return this.memAllocationRatio;
    }

    public DescribeDedicatedHostAttributeResponseBody setMemoryUsed(String memoryUsed) {
        this.memoryUsed = memoryUsed;
        return this;
    }
    public String getMemoryUsed() {
        return this.memoryUsed;
    }

    public DescribeDedicatedHostAttributeResponseBody setOpenPermission(String openPermission) {
        this.openPermission = openPermission;
        return this;
    }
    public String getOpenPermission() {
        return this.openPermission;
    }

    public DescribeDedicatedHostAttributeResponseBody setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeDedicatedHostAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDedicatedHostAttributeResponseBody setStorageUsed(String storageUsed) {
        this.storageUsed = storageUsed;
        return this;
    }
    public String getStorageUsed() {
        return this.storageUsed;
    }

    public DescribeDedicatedHostAttributeResponseBody setVPCId(String VPCId) {
        this.VPCId = VPCId;
        return this;
    }
    public String getVPCId() {
        return this.VPCId;
    }

    public DescribeDedicatedHostAttributeResponseBody setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public DescribeDedicatedHostAttributeResponseBody setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

}
