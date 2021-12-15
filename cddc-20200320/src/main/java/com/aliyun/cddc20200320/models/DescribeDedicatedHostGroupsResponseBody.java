// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cddc20200320.models;

import com.aliyun.tea.*;

public class DescribeDedicatedHostGroupsResponseBody extends TeaModel {
    @NameInMap("DedicatedHostGroups")
    public DescribeDedicatedHostGroupsResponseBodyDedicatedHostGroups dedicatedHostGroups;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDedicatedHostGroupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDedicatedHostGroupsResponseBody self = new DescribeDedicatedHostGroupsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDedicatedHostGroupsResponseBody setDedicatedHostGroups(DescribeDedicatedHostGroupsResponseBodyDedicatedHostGroups dedicatedHostGroups) {
        this.dedicatedHostGroups = dedicatedHostGroups;
        return this;
    }
    public DescribeDedicatedHostGroupsResponseBodyDedicatedHostGroups getDedicatedHostGroups() {
        return this.dedicatedHostGroups;
    }

    public DescribeDedicatedHostGroupsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeDedicatedHostGroupsResponseBodyDedicatedHostGroupsDedicatedHostGroupsZoneIDList extends TeaModel {
        @NameInMap("ZoneIDList")
        public java.util.List<String> zoneIDList;

        public static DescribeDedicatedHostGroupsResponseBodyDedicatedHostGroupsDedicatedHostGroupsZoneIDList build(java.util.Map<String, ?> map) throws Exception {
            DescribeDedicatedHostGroupsResponseBodyDedicatedHostGroupsDedicatedHostGroupsZoneIDList self = new DescribeDedicatedHostGroupsResponseBodyDedicatedHostGroupsDedicatedHostGroupsZoneIDList();
            return TeaModel.build(map, self);
        }

        public DescribeDedicatedHostGroupsResponseBodyDedicatedHostGroupsDedicatedHostGroupsZoneIDList setZoneIDList(java.util.List<String> zoneIDList) {
            this.zoneIDList = zoneIDList;
            return this;
        }
        public java.util.List<String> getZoneIDList() {
            return this.zoneIDList;
        }

    }

    public static class DescribeDedicatedHostGroupsResponseBodyDedicatedHostGroupsDedicatedHostGroups extends TeaModel {
        @NameInMap("AllocationPolicy")
        public String allocationPolicy;

        @NameInMap("BastionInstanceId")
        public String bastionInstanceId;

        @NameInMap("CpuAllocateRation")
        public Float cpuAllocateRation;

        @NameInMap("CpuAllocatedAmount")
        public Float cpuAllocatedAmount;

        @NameInMap("CpuAllocationRatio")
        public Integer cpuAllocationRatio;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("DedicatedHostCountGroupByHostType")
        public java.util.Map<String, ?> dedicatedHostCountGroupByHostType;

        @NameInMap("DedicatedHostGroupDesc")
        public String dedicatedHostGroupDesc;

        @NameInMap("DedicatedHostGroupId")
        public String dedicatedHostGroupId;

        @NameInMap("DeployType")
        public String deployType;

        @NameInMap("DiskAllocateRation")
        public Float diskAllocateRation;

        @NameInMap("DiskAllocatedAmount")
        public Float diskAllocatedAmount;

        @NameInMap("DiskAllocationRatio")
        public Integer diskAllocationRatio;

        @NameInMap("DiskUsedAmount")
        public Float diskUsedAmount;

        @NameInMap("DiskUtility")
        public Float diskUtility;

        @NameInMap("Engine")
        public String engine;

        @NameInMap("HostNumber")
        public Integer hostNumber;

        @NameInMap("HostReplacePolicy")
        public String hostReplacePolicy;

        @NameInMap("InstanceNumber")
        public Integer instanceNumber;

        @NameInMap("MemAllocateRation")
        public Float memAllocateRation;

        @NameInMap("MemAllocatedAmount")
        public Float memAllocatedAmount;

        @NameInMap("MemAllocationRatio")
        public Integer memAllocationRatio;

        @NameInMap("MemUsedAmount")
        public Float memUsedAmount;

        @NameInMap("MemUtility")
        public Float memUtility;

        @NameInMap("OpenPermission")
        public String openPermission;

        @NameInMap("Text")
        public String text;

        @NameInMap("VPCId")
        public String VPCId;

        @NameInMap("ZoneIDList")
        public DescribeDedicatedHostGroupsResponseBodyDedicatedHostGroupsDedicatedHostGroupsZoneIDList zoneIDList;

        public static DescribeDedicatedHostGroupsResponseBodyDedicatedHostGroupsDedicatedHostGroups build(java.util.Map<String, ?> map) throws Exception {
            DescribeDedicatedHostGroupsResponseBodyDedicatedHostGroupsDedicatedHostGroups self = new DescribeDedicatedHostGroupsResponseBodyDedicatedHostGroupsDedicatedHostGroups();
            return TeaModel.build(map, self);
        }

        public DescribeDedicatedHostGroupsResponseBodyDedicatedHostGroupsDedicatedHostGroups setAllocationPolicy(String allocationPolicy) {
            this.allocationPolicy = allocationPolicy;
            return this;
        }
        public String getAllocationPolicy() {
            return this.allocationPolicy;
        }

        public DescribeDedicatedHostGroupsResponseBodyDedicatedHostGroupsDedicatedHostGroups setBastionInstanceId(String bastionInstanceId) {
            this.bastionInstanceId = bastionInstanceId;
            return this;
        }
        public String getBastionInstanceId() {
            return this.bastionInstanceId;
        }

        public DescribeDedicatedHostGroupsResponseBodyDedicatedHostGroupsDedicatedHostGroups setCpuAllocateRation(Float cpuAllocateRation) {
            this.cpuAllocateRation = cpuAllocateRation;
            return this;
        }
        public Float getCpuAllocateRation() {
            return this.cpuAllocateRation;
        }

        public DescribeDedicatedHostGroupsResponseBodyDedicatedHostGroupsDedicatedHostGroups setCpuAllocatedAmount(Float cpuAllocatedAmount) {
            this.cpuAllocatedAmount = cpuAllocatedAmount;
            return this;
        }
        public Float getCpuAllocatedAmount() {
            return this.cpuAllocatedAmount;
        }

        public DescribeDedicatedHostGroupsResponseBodyDedicatedHostGroupsDedicatedHostGroups setCpuAllocationRatio(Integer cpuAllocationRatio) {
            this.cpuAllocationRatio = cpuAllocationRatio;
            return this;
        }
        public Integer getCpuAllocationRatio() {
            return this.cpuAllocationRatio;
        }

        public DescribeDedicatedHostGroupsResponseBodyDedicatedHostGroupsDedicatedHostGroups setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeDedicatedHostGroupsResponseBodyDedicatedHostGroupsDedicatedHostGroups setDedicatedHostCountGroupByHostType(java.util.Map<String, ?> dedicatedHostCountGroupByHostType) {
            this.dedicatedHostCountGroupByHostType = dedicatedHostCountGroupByHostType;
            return this;
        }
        public java.util.Map<String, ?> getDedicatedHostCountGroupByHostType() {
            return this.dedicatedHostCountGroupByHostType;
        }

        public DescribeDedicatedHostGroupsResponseBodyDedicatedHostGroupsDedicatedHostGroups setDedicatedHostGroupDesc(String dedicatedHostGroupDesc) {
            this.dedicatedHostGroupDesc = dedicatedHostGroupDesc;
            return this;
        }
        public String getDedicatedHostGroupDesc() {
            return this.dedicatedHostGroupDesc;
        }

        public DescribeDedicatedHostGroupsResponseBodyDedicatedHostGroupsDedicatedHostGroups setDedicatedHostGroupId(String dedicatedHostGroupId) {
            this.dedicatedHostGroupId = dedicatedHostGroupId;
            return this;
        }
        public String getDedicatedHostGroupId() {
            return this.dedicatedHostGroupId;
        }

        public DescribeDedicatedHostGroupsResponseBodyDedicatedHostGroupsDedicatedHostGroups setDeployType(String deployType) {
            this.deployType = deployType;
            return this;
        }
        public String getDeployType() {
            return this.deployType;
        }

        public DescribeDedicatedHostGroupsResponseBodyDedicatedHostGroupsDedicatedHostGroups setDiskAllocateRation(Float diskAllocateRation) {
            this.diskAllocateRation = diskAllocateRation;
            return this;
        }
        public Float getDiskAllocateRation() {
            return this.diskAllocateRation;
        }

        public DescribeDedicatedHostGroupsResponseBodyDedicatedHostGroupsDedicatedHostGroups setDiskAllocatedAmount(Float diskAllocatedAmount) {
            this.diskAllocatedAmount = diskAllocatedAmount;
            return this;
        }
        public Float getDiskAllocatedAmount() {
            return this.diskAllocatedAmount;
        }

        public DescribeDedicatedHostGroupsResponseBodyDedicatedHostGroupsDedicatedHostGroups setDiskAllocationRatio(Integer diskAllocationRatio) {
            this.diskAllocationRatio = diskAllocationRatio;
            return this;
        }
        public Integer getDiskAllocationRatio() {
            return this.diskAllocationRatio;
        }

        public DescribeDedicatedHostGroupsResponseBodyDedicatedHostGroupsDedicatedHostGroups setDiskUsedAmount(Float diskUsedAmount) {
            this.diskUsedAmount = diskUsedAmount;
            return this;
        }
        public Float getDiskUsedAmount() {
            return this.diskUsedAmount;
        }

        public DescribeDedicatedHostGroupsResponseBodyDedicatedHostGroupsDedicatedHostGroups setDiskUtility(Float diskUtility) {
            this.diskUtility = diskUtility;
            return this;
        }
        public Float getDiskUtility() {
            return this.diskUtility;
        }

        public DescribeDedicatedHostGroupsResponseBodyDedicatedHostGroupsDedicatedHostGroups setEngine(String engine) {
            this.engine = engine;
            return this;
        }
        public String getEngine() {
            return this.engine;
        }

        public DescribeDedicatedHostGroupsResponseBodyDedicatedHostGroupsDedicatedHostGroups setHostNumber(Integer hostNumber) {
            this.hostNumber = hostNumber;
            return this;
        }
        public Integer getHostNumber() {
            return this.hostNumber;
        }

        public DescribeDedicatedHostGroupsResponseBodyDedicatedHostGroupsDedicatedHostGroups setHostReplacePolicy(String hostReplacePolicy) {
            this.hostReplacePolicy = hostReplacePolicy;
            return this;
        }
        public String getHostReplacePolicy() {
            return this.hostReplacePolicy;
        }

        public DescribeDedicatedHostGroupsResponseBodyDedicatedHostGroupsDedicatedHostGroups setInstanceNumber(Integer instanceNumber) {
            this.instanceNumber = instanceNumber;
            return this;
        }
        public Integer getInstanceNumber() {
            return this.instanceNumber;
        }

        public DescribeDedicatedHostGroupsResponseBodyDedicatedHostGroupsDedicatedHostGroups setMemAllocateRation(Float memAllocateRation) {
            this.memAllocateRation = memAllocateRation;
            return this;
        }
        public Float getMemAllocateRation() {
            return this.memAllocateRation;
        }

        public DescribeDedicatedHostGroupsResponseBodyDedicatedHostGroupsDedicatedHostGroups setMemAllocatedAmount(Float memAllocatedAmount) {
            this.memAllocatedAmount = memAllocatedAmount;
            return this;
        }
        public Float getMemAllocatedAmount() {
            return this.memAllocatedAmount;
        }

        public DescribeDedicatedHostGroupsResponseBodyDedicatedHostGroupsDedicatedHostGroups setMemAllocationRatio(Integer memAllocationRatio) {
            this.memAllocationRatio = memAllocationRatio;
            return this;
        }
        public Integer getMemAllocationRatio() {
            return this.memAllocationRatio;
        }

        public DescribeDedicatedHostGroupsResponseBodyDedicatedHostGroupsDedicatedHostGroups setMemUsedAmount(Float memUsedAmount) {
            this.memUsedAmount = memUsedAmount;
            return this;
        }
        public Float getMemUsedAmount() {
            return this.memUsedAmount;
        }

        public DescribeDedicatedHostGroupsResponseBodyDedicatedHostGroupsDedicatedHostGroups setMemUtility(Float memUtility) {
            this.memUtility = memUtility;
            return this;
        }
        public Float getMemUtility() {
            return this.memUtility;
        }

        public DescribeDedicatedHostGroupsResponseBodyDedicatedHostGroupsDedicatedHostGroups setOpenPermission(String openPermission) {
            this.openPermission = openPermission;
            return this;
        }
        public String getOpenPermission() {
            return this.openPermission;
        }

        public DescribeDedicatedHostGroupsResponseBodyDedicatedHostGroupsDedicatedHostGroups setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

        public DescribeDedicatedHostGroupsResponseBodyDedicatedHostGroupsDedicatedHostGroups setVPCId(String VPCId) {
            this.VPCId = VPCId;
            return this;
        }
        public String getVPCId() {
            return this.VPCId;
        }

        public DescribeDedicatedHostGroupsResponseBodyDedicatedHostGroupsDedicatedHostGroups setZoneIDList(DescribeDedicatedHostGroupsResponseBodyDedicatedHostGroupsDedicatedHostGroupsZoneIDList zoneIDList) {
            this.zoneIDList = zoneIDList;
            return this;
        }
        public DescribeDedicatedHostGroupsResponseBodyDedicatedHostGroupsDedicatedHostGroupsZoneIDList getZoneIDList() {
            return this.zoneIDList;
        }

    }

    public static class DescribeDedicatedHostGroupsResponseBodyDedicatedHostGroups extends TeaModel {
        @NameInMap("DedicatedHostGroups")
        public java.util.List<DescribeDedicatedHostGroupsResponseBodyDedicatedHostGroupsDedicatedHostGroups> dedicatedHostGroups;

        public static DescribeDedicatedHostGroupsResponseBodyDedicatedHostGroups build(java.util.Map<String, ?> map) throws Exception {
            DescribeDedicatedHostGroupsResponseBodyDedicatedHostGroups self = new DescribeDedicatedHostGroupsResponseBodyDedicatedHostGroups();
            return TeaModel.build(map, self);
        }

        public DescribeDedicatedHostGroupsResponseBodyDedicatedHostGroups setDedicatedHostGroups(java.util.List<DescribeDedicatedHostGroupsResponseBodyDedicatedHostGroupsDedicatedHostGroups> dedicatedHostGroups) {
            this.dedicatedHostGroups = dedicatedHostGroups;
            return this;
        }
        public java.util.List<DescribeDedicatedHostGroupsResponseBodyDedicatedHostGroupsDedicatedHostGroups> getDedicatedHostGroups() {
            return this.dedicatedHostGroups;
        }

    }

}
