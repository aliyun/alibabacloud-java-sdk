// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeDedicatedHostsResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("DedicatedHosts")
    public DescribeDedicatedHostsResponseBodyDedicatedHosts dedicatedHosts;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    public static DescribeDedicatedHostsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDedicatedHostsResponseBody self = new DescribeDedicatedHostsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDedicatedHostsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeDedicatedHostsResponseBody setDedicatedHosts(DescribeDedicatedHostsResponseBodyDedicatedHosts dedicatedHosts) {
        this.dedicatedHosts = dedicatedHosts;
        return this;
    }
    public DescribeDedicatedHostsResponseBodyDedicatedHosts getDedicatedHosts() {
        return this.dedicatedHosts;
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

    public DescribeDedicatedHostsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public static class DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostCapacity extends TeaModel {
        @NameInMap("AvailableMemory")
        public Float availableMemory;

        @NameInMap("LocalStorageCategory")
        public String localStorageCategory;

        @NameInMap("TotalMemory")
        public Float totalMemory;

        @NameInMap("TotalLocalStorage")
        public Integer totalLocalStorage;

        @NameInMap("TotalVcpus")
        public Integer totalVcpus;

        @NameInMap("TotalVgpus")
        public Integer totalVgpus;

        @NameInMap("AvailableLocalStorage")
        public Integer availableLocalStorage;

        @NameInMap("AvailableVcpus")
        public Integer availableVcpus;

        @NameInMap("AvailableVgpus")
        public Integer availableVgpus;

        public static DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostCapacity build(java.util.Map<String, ?> map) throws Exception {
            DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostCapacity self = new DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostCapacity();
            return TeaModel.build(map, self);
        }

        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostCapacity setAvailableMemory(Float availableMemory) {
            this.availableMemory = availableMemory;
            return this;
        }
        public Float getAvailableMemory() {
            return this.availableMemory;
        }

        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostCapacity setLocalStorageCategory(String localStorageCategory) {
            this.localStorageCategory = localStorageCategory;
            return this;
        }
        public String getLocalStorageCategory() {
            return this.localStorageCategory;
        }

        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostCapacity setTotalMemory(Float totalMemory) {
            this.totalMemory = totalMemory;
            return this;
        }
        public Float getTotalMemory() {
            return this.totalMemory;
        }

        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostCapacity setTotalLocalStorage(Integer totalLocalStorage) {
            this.totalLocalStorage = totalLocalStorage;
            return this;
        }
        public Integer getTotalLocalStorage() {
            return this.totalLocalStorage;
        }

        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostCapacity setTotalVcpus(Integer totalVcpus) {
            this.totalVcpus = totalVcpus;
            return this;
        }
        public Integer getTotalVcpus() {
            return this.totalVcpus;
        }

        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostCapacity setTotalVgpus(Integer totalVgpus) {
            this.totalVgpus = totalVgpus;
            return this;
        }
        public Integer getTotalVgpus() {
            return this.totalVgpus;
        }

        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostCapacity setAvailableLocalStorage(Integer availableLocalStorage) {
            this.availableLocalStorage = availableLocalStorage;
            return this;
        }
        public Integer getAvailableLocalStorage() {
            return this.availableLocalStorage;
        }

        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostCapacity setAvailableVcpus(Integer availableVcpus) {
            this.availableVcpus = availableVcpus;
            return this;
        }
        public Integer getAvailableVcpus() {
            return this.availableVcpus;
        }

        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostCapacity setAvailableVgpus(Integer availableVgpus) {
            this.availableVgpus = availableVgpus;
            return this;
        }
        public Integer getAvailableVgpus() {
            return this.availableVgpus;
        }

    }

    public static class DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostOperationLocksOperationLock extends TeaModel {
        @NameInMap("LockReason")
        public String lockReason;

        public static DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostOperationLocksOperationLock build(java.util.Map<String, ?> map) throws Exception {
            DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostOperationLocksOperationLock self = new DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostOperationLocksOperationLock();
            return TeaModel.build(map, self);
        }

        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostOperationLocksOperationLock setLockReason(String lockReason) {
            this.lockReason = lockReason;
            return this;
        }
        public String getLockReason() {
            return this.lockReason;
        }

    }

    public static class DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostOperationLocks extends TeaModel {
        @NameInMap("OperationLock")
        public java.util.List<DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostOperationLocksOperationLock> operationLock;

        public static DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostOperationLocks build(java.util.Map<String, ?> map) throws Exception {
            DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostOperationLocks self = new DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostOperationLocks();
            return TeaModel.build(map, self);
        }

        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostOperationLocks setOperationLock(java.util.List<DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostOperationLocksOperationLock> operationLock) {
            this.operationLock = operationLock;
            return this;
        }
        public java.util.List<DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostOperationLocksOperationLock> getOperationLock() {
            return this.operationLock;
        }

    }

    public static class DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostTagsTag extends TeaModel {
        @NameInMap("TagValue")
        public String tagValue;

        @NameInMap("TagKey")
        public String tagKey;

        public static DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostTagsTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostTagsTag self = new DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostTagsTag();
            return TeaModel.build(map, self);
        }

        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostTagsTag setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostTagsTag setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

    }

    public static class DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostTags extends TeaModel {
        @NameInMap("Tag")
        public java.util.List<DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostTagsTag> tag;

        public static DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostTags self = new DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostTags();
            return TeaModel.build(map, self);
        }

        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostTags setTag(java.util.List<DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostTagsTag> tag) {
            this.tag = tag;
            return this;
        }
        public java.util.List<DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostTagsTag> getTag() {
            return this.tag;
        }

    }

    public static class DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostSupportedInstanceTypesList extends TeaModel {
        @NameInMap("SupportedInstanceTypesList")
        public java.util.List<String> supportedInstanceTypesList;

        public static DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostSupportedInstanceTypesList build(java.util.Map<String, ?> map) throws Exception {
            DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostSupportedInstanceTypesList self = new DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostSupportedInstanceTypesList();
            return TeaModel.build(map, self);
        }

        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostSupportedInstanceTypesList setSupportedInstanceTypesList(java.util.List<String> supportedInstanceTypesList) {
            this.supportedInstanceTypesList = supportedInstanceTypesList;
            return this;
        }
        public java.util.List<String> getSupportedInstanceTypesList() {
            return this.supportedInstanceTypesList;
        }

    }

    public static class DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostSupportedCustomInstanceTypeFamilies extends TeaModel {
        @NameInMap("SupportedCustomInstanceTypeFamily")
        public java.util.List<String> supportedCustomInstanceTypeFamily;

        public static DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostSupportedCustomInstanceTypeFamilies build(java.util.Map<String, ?> map) throws Exception {
            DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostSupportedCustomInstanceTypeFamilies self = new DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostSupportedCustomInstanceTypeFamilies();
            return TeaModel.build(map, self);
        }

        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostSupportedCustomInstanceTypeFamilies setSupportedCustomInstanceTypeFamily(java.util.List<String> supportedCustomInstanceTypeFamily) {
            this.supportedCustomInstanceTypeFamily = supportedCustomInstanceTypeFamily;
            return this;
        }
        public java.util.List<String> getSupportedCustomInstanceTypeFamily() {
            return this.supportedCustomInstanceTypeFamily;
        }

    }

    public static class DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostInstancesInstance extends TeaModel {
        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("InstanceType")
        public String instanceType;

        public static DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostInstancesInstance build(java.util.Map<String, ?> map) throws Exception {
            DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostInstancesInstance self = new DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostInstancesInstance();
            return TeaModel.build(map, self);
        }

        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostInstancesInstance setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostInstancesInstance setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

    }

    public static class DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostInstances extends TeaModel {
        @NameInMap("Instance")
        public java.util.List<DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostInstancesInstance> instance;

        public static DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostInstances build(java.util.Map<String, ?> map) throws Exception {
            DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostInstances self = new DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostInstances();
            return TeaModel.build(map, self);
        }

        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostInstances setInstance(java.util.List<DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostInstancesInstance> instance) {
            this.instance = instance;
            return this;
        }
        public java.util.List<DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostInstancesInstance> getInstance() {
            return this.instance;
        }

    }

    public static class DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostNetworkAttributes extends TeaModel {
        @NameInMap("UdpTimeout")
        public Integer udpTimeout;

        @NameInMap("SlbUdpTimeout")
        public Integer slbUdpTimeout;

        public static DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostNetworkAttributes build(java.util.Map<String, ?> map) throws Exception {
            DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostNetworkAttributes self = new DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostNetworkAttributes();
            return TeaModel.build(map, self);
        }

        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostNetworkAttributes setUdpTimeout(Integer udpTimeout) {
            this.udpTimeout = udpTimeout;
            return this;
        }
        public Integer getUdpTimeout() {
            return this.udpTimeout;
        }

        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostNetworkAttributes setSlbUdpTimeout(Integer slbUdpTimeout) {
            this.slbUdpTimeout = slbUdpTimeout;
            return this;
        }
        public Integer getSlbUdpTimeout() {
            return this.slbUdpTimeout;
        }

    }

    public static class DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostSupportedInstanceTypeFamilies extends TeaModel {
        @NameInMap("SupportedInstanceTypeFamily")
        public java.util.List<String> supportedInstanceTypeFamily;

        public static DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostSupportedInstanceTypeFamilies build(java.util.Map<String, ?> map) throws Exception {
            DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostSupportedInstanceTypeFamilies self = new DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostSupportedInstanceTypeFamilies();
            return TeaModel.build(map, self);
        }

        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostSupportedInstanceTypeFamilies setSupportedInstanceTypeFamily(java.util.List<String> supportedInstanceTypeFamily) {
            this.supportedInstanceTypeFamily = supportedInstanceTypeFamily;
            return this;
        }
        public java.util.List<String> getSupportedInstanceTypeFamily() {
            return this.supportedInstanceTypeFamily;
        }

    }

    public static class DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHost extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("Capacity")
        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostCapacity capacity;

        @NameInMap("AutoPlacement")
        public String autoPlacement;

        @NameInMap("OperationLocks")
        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostOperationLocks operationLocks;

        @NameInMap("ChargeType")
        public String chargeType;

        @NameInMap("Tags")
        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostTags tags;

        @NameInMap("ActionOnMaintenance")
        public String actionOnMaintenance;

        @NameInMap("PhysicalGpus")
        public Integer physicalGpus;

        @NameInMap("SaleCycle")
        public String saleCycle;

        @NameInMap("Description")
        public String description;

        @NameInMap("DedicatedHostType")
        public String dedicatedHostType;

        @NameInMap("DedicatedHostId")
        public String dedicatedHostId;

        @NameInMap("Sockets")
        public Integer sockets;

        @NameInMap("Cores")
        public Integer cores;

        @NameInMap("GPUSpec")
        public String GPUSpec;

        @NameInMap("AutoReleaseTime")
        public String autoReleaseTime;

        @NameInMap("CpuOverCommitRatio")
        public Float cpuOverCommitRatio;

        @NameInMap("SupportedInstanceTypesList")
        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostSupportedInstanceTypesList supportedInstanceTypesList;

        @NameInMap("SupportedCustomInstanceTypeFamilies")
        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostSupportedCustomInstanceTypeFamilies supportedCustomInstanceTypeFamilies;

        @NameInMap("Instances")
        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostInstances instances;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("NetworkAttributes")
        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostNetworkAttributes networkAttributes;

        @NameInMap("DedicatedHostName")
        public String dedicatedHostName;

        @NameInMap("ExpiredTime")
        public String expiredTime;

        @NameInMap("DedicatedHostClusterId")
        public String dedicatedHostClusterId;

        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        @NameInMap("ZoneId")
        public String zoneId;

        @NameInMap("SupportedInstanceTypeFamilies")
        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostSupportedInstanceTypeFamilies supportedInstanceTypeFamilies;

        @NameInMap("MachineId")
        public String machineId;

        public static DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHost build(java.util.Map<String, ?> map) throws Exception {
            DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHost self = new DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHost();
            return TeaModel.build(map, self);
        }

        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHost setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHost setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHost setCapacity(DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostCapacity capacity) {
            this.capacity = capacity;
            return this;
        }
        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostCapacity getCapacity() {
            return this.capacity;
        }

        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHost setAutoPlacement(String autoPlacement) {
            this.autoPlacement = autoPlacement;
            return this;
        }
        public String getAutoPlacement() {
            return this.autoPlacement;
        }

        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHost setOperationLocks(DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostOperationLocks operationLocks) {
            this.operationLocks = operationLocks;
            return this;
        }
        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostOperationLocks getOperationLocks() {
            return this.operationLocks;
        }

        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHost setChargeType(String chargeType) {
            this.chargeType = chargeType;
            return this;
        }
        public String getChargeType() {
            return this.chargeType;
        }

        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHost setTags(DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostTags tags) {
            this.tags = tags;
            return this;
        }
        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostTags getTags() {
            return this.tags;
        }

        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHost setActionOnMaintenance(String actionOnMaintenance) {
            this.actionOnMaintenance = actionOnMaintenance;
            return this;
        }
        public String getActionOnMaintenance() {
            return this.actionOnMaintenance;
        }

        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHost setPhysicalGpus(Integer physicalGpus) {
            this.physicalGpus = physicalGpus;
            return this;
        }
        public Integer getPhysicalGpus() {
            return this.physicalGpus;
        }

        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHost setSaleCycle(String saleCycle) {
            this.saleCycle = saleCycle;
            return this;
        }
        public String getSaleCycle() {
            return this.saleCycle;
        }

        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHost setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHost setDedicatedHostType(String dedicatedHostType) {
            this.dedicatedHostType = dedicatedHostType;
            return this;
        }
        public String getDedicatedHostType() {
            return this.dedicatedHostType;
        }

        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHost setDedicatedHostId(String dedicatedHostId) {
            this.dedicatedHostId = dedicatedHostId;
            return this;
        }
        public String getDedicatedHostId() {
            return this.dedicatedHostId;
        }

        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHost setSockets(Integer sockets) {
            this.sockets = sockets;
            return this;
        }
        public Integer getSockets() {
            return this.sockets;
        }

        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHost setCores(Integer cores) {
            this.cores = cores;
            return this;
        }
        public Integer getCores() {
            return this.cores;
        }

        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHost setGPUSpec(String GPUSpec) {
            this.GPUSpec = GPUSpec;
            return this;
        }
        public String getGPUSpec() {
            return this.GPUSpec;
        }

        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHost setAutoReleaseTime(String autoReleaseTime) {
            this.autoReleaseTime = autoReleaseTime;
            return this;
        }
        public String getAutoReleaseTime() {
            return this.autoReleaseTime;
        }

        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHost setCpuOverCommitRatio(Float cpuOverCommitRatio) {
            this.cpuOverCommitRatio = cpuOverCommitRatio;
            return this;
        }
        public Float getCpuOverCommitRatio() {
            return this.cpuOverCommitRatio;
        }

        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHost setSupportedInstanceTypesList(DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostSupportedInstanceTypesList supportedInstanceTypesList) {
            this.supportedInstanceTypesList = supportedInstanceTypesList;
            return this;
        }
        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostSupportedInstanceTypesList getSupportedInstanceTypesList() {
            return this.supportedInstanceTypesList;
        }

        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHost setSupportedCustomInstanceTypeFamilies(DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostSupportedCustomInstanceTypeFamilies supportedCustomInstanceTypeFamilies) {
            this.supportedCustomInstanceTypeFamilies = supportedCustomInstanceTypeFamilies;
            return this;
        }
        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostSupportedCustomInstanceTypeFamilies getSupportedCustomInstanceTypeFamilies() {
            return this.supportedCustomInstanceTypeFamilies;
        }

        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHost setInstances(DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostInstances instances) {
            this.instances = instances;
            return this;
        }
        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostInstances getInstances() {
            return this.instances;
        }

        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHost setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHost setNetworkAttributes(DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostNetworkAttributes networkAttributes) {
            this.networkAttributes = networkAttributes;
            return this;
        }
        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostNetworkAttributes getNetworkAttributes() {
            return this.networkAttributes;
        }

        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHost setDedicatedHostName(String dedicatedHostName) {
            this.dedicatedHostName = dedicatedHostName;
            return this;
        }
        public String getDedicatedHostName() {
            return this.dedicatedHostName;
        }

        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHost setExpiredTime(String expiredTime) {
            this.expiredTime = expiredTime;
            return this;
        }
        public String getExpiredTime() {
            return this.expiredTime;
        }

        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHost setDedicatedHostClusterId(String dedicatedHostClusterId) {
            this.dedicatedHostClusterId = dedicatedHostClusterId;
            return this;
        }
        public String getDedicatedHostClusterId() {
            return this.dedicatedHostClusterId;
        }

        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHost setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHost setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHost setSupportedInstanceTypeFamilies(DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostSupportedInstanceTypeFamilies supportedInstanceTypeFamilies) {
            this.supportedInstanceTypeFamilies = supportedInstanceTypeFamilies;
            return this;
        }
        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostSupportedInstanceTypeFamilies getSupportedInstanceTypeFamilies() {
            return this.supportedInstanceTypeFamilies;
        }

        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHost setMachineId(String machineId) {
            this.machineId = machineId;
            return this;
        }
        public String getMachineId() {
            return this.machineId;
        }

    }

    public static class DescribeDedicatedHostsResponseBodyDedicatedHosts extends TeaModel {
        @NameInMap("DedicatedHost")
        public java.util.List<DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHost> dedicatedHost;

        public static DescribeDedicatedHostsResponseBodyDedicatedHosts build(java.util.Map<String, ?> map) throws Exception {
            DescribeDedicatedHostsResponseBodyDedicatedHosts self = new DescribeDedicatedHostsResponseBodyDedicatedHosts();
            return TeaModel.build(map, self);
        }

        public DescribeDedicatedHostsResponseBodyDedicatedHosts setDedicatedHost(java.util.List<DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHost> dedicatedHost) {
            this.dedicatedHost = dedicatedHost;
            return this;
        }
        public java.util.List<DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHost> getDedicatedHost() {
            return this.dedicatedHost;
        }

    }

}
