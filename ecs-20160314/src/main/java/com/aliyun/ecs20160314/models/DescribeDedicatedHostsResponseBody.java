// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class DescribeDedicatedHostsResponseBody extends TeaModel {
    @NameInMap("DedicatedHosts")
    public DedicatedHosts dedicatedHosts;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeDedicatedHostsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDedicatedHostsResponseBody self = new DescribeDedicatedHostsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDedicatedHostsResponseBody setDedicatedHosts(DedicatedHosts dedicatedHosts) {
        this.dedicatedHosts = dedicatedHosts;
        return this;
    }
    public DedicatedHosts getDedicatedHosts() {
        return this.dedicatedHosts;
    }

    public DescribeDedicatedHostsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
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

    public DescribeDedicatedHostsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class SchedulerOptions extends TeaModel {
        @NameInMap("ManagedPrivateSpaceId")
        public String managedPrivateSpaceId;

        public static SchedulerOptions build(java.util.Map<String, ?> map) throws Exception {
            SchedulerOptions self = new SchedulerOptions();
            return TeaModel.build(map, self);
        }

        public SchedulerOptions setManagedPrivateSpaceId(String managedPrivateSpaceId) {
            this.managedPrivateSpaceId = managedPrivateSpaceId;
            return this;
        }
        public String getManagedPrivateSpaceId() {
            return this.managedPrivateSpaceId;
        }

    }

    public static class Capacity extends TeaModel {
        @NameInMap("AvailableLocalStorage")
        public Integer availableLocalStorage;

        @NameInMap("AvailableMemory")
        public Float availableMemory;

        @NameInMap("AvailableVcpus")
        public Integer availableVcpus;

        @NameInMap("AvailableVgpus")
        public Integer availableVgpus;

        @NameInMap("LocalStorageCategory")
        public String localStorageCategory;

        @NameInMap("TotalLocalStorage")
        public Integer totalLocalStorage;

        @NameInMap("TotalMemory")
        public Float totalMemory;

        @NameInMap("TotalVcpus")
        public Integer totalVcpus;

        @NameInMap("TotalVgpus")
        public Integer totalVgpus;

        public static Capacity build(java.util.Map<String, ?> map) throws Exception {
            Capacity self = new Capacity();
            return TeaModel.build(map, self);
        }

        public Capacity setAvailableLocalStorage(Integer availableLocalStorage) {
            this.availableLocalStorage = availableLocalStorage;
            return this;
        }
        public Integer getAvailableLocalStorage() {
            return this.availableLocalStorage;
        }

        public Capacity setAvailableMemory(Float availableMemory) {
            this.availableMemory = availableMemory;
            return this;
        }
        public Float getAvailableMemory() {
            return this.availableMemory;
        }

        public Capacity setAvailableVcpus(Integer availableVcpus) {
            this.availableVcpus = availableVcpus;
            return this;
        }
        public Integer getAvailableVcpus() {
            return this.availableVcpus;
        }

        public Capacity setAvailableVgpus(Integer availableVgpus) {
            this.availableVgpus = availableVgpus;
            return this;
        }
        public Integer getAvailableVgpus() {
            return this.availableVgpus;
        }

        public Capacity setLocalStorageCategory(String localStorageCategory) {
            this.localStorageCategory = localStorageCategory;
            return this;
        }
        public String getLocalStorageCategory() {
            return this.localStorageCategory;
        }

        public Capacity setTotalLocalStorage(Integer totalLocalStorage) {
            this.totalLocalStorage = totalLocalStorage;
            return this;
        }
        public Integer getTotalLocalStorage() {
            return this.totalLocalStorage;
        }

        public Capacity setTotalMemory(Float totalMemory) {
            this.totalMemory = totalMemory;
            return this;
        }
        public Float getTotalMemory() {
            return this.totalMemory;
        }

        public Capacity setTotalVcpus(Integer totalVcpus) {
            this.totalVcpus = totalVcpus;
            return this;
        }
        public Integer getTotalVcpus() {
            return this.totalVcpus;
        }

        public Capacity setTotalVgpus(Integer totalVgpus) {
            this.totalVgpus = totalVgpus;
            return this;
        }
        public Integer getTotalVgpus() {
            return this.totalVgpus;
        }

    }

    public static class HostDetailInfo extends TeaModel {
        @NameInMap("SerialNumber")
        public String serialNumber;

        public static HostDetailInfo build(java.util.Map<String, ?> map) throws Exception {
            HostDetailInfo self = new HostDetailInfo();
            return TeaModel.build(map, self);
        }

        public HostDetailInfo setSerialNumber(String serialNumber) {
            this.serialNumber = serialNumber;
            return this;
        }
        public String getSerialNumber() {
            return this.serialNumber;
        }

    }

    public static class Instance extends TeaModel {
        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("InstanceType")
        public String instanceType;

        public static Instance build(java.util.Map<String, ?> map) throws Exception {
            Instance self = new Instance();
            return TeaModel.build(map, self);
        }

        public Instance setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public Instance setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

    }

    public static class Instances extends TeaModel {
        @NameInMap("Instance")
        public java.util.List<Instance> instance;

        public static Instances build(java.util.Map<String, ?> map) throws Exception {
            Instances self = new Instances();
            return TeaModel.build(map, self);
        }

        public Instances setInstance(java.util.List<Instance> instance) {
            this.instance = instance;
            return this;
        }
        public java.util.List<Instance> getInstance() {
            return this.instance;
        }

    }

    public static class NetworkAttributes extends TeaModel {
        @NameInMap("SlbUdpTimeout")
        public Integer slbUdpTimeout;

        @NameInMap("UdpTimeout")
        public Integer udpTimeout;

        public static NetworkAttributes build(java.util.Map<String, ?> map) throws Exception {
            NetworkAttributes self = new NetworkAttributes();
            return TeaModel.build(map, self);
        }

        public NetworkAttributes setSlbUdpTimeout(Integer slbUdpTimeout) {
            this.slbUdpTimeout = slbUdpTimeout;
            return this;
        }
        public Integer getSlbUdpTimeout() {
            return this.slbUdpTimeout;
        }

        public NetworkAttributes setUdpTimeout(Integer udpTimeout) {
            this.udpTimeout = udpTimeout;
            return this;
        }
        public Integer getUdpTimeout() {
            return this.udpTimeout;
        }

    }

    public static class OperationLock extends TeaModel {
        @NameInMap("LockReason")
        public String lockReason;

        public static OperationLock build(java.util.Map<String, ?> map) throws Exception {
            OperationLock self = new OperationLock();
            return TeaModel.build(map, self);
        }

        public OperationLock setLockReason(String lockReason) {
            this.lockReason = lockReason;
            return this;
        }
        public String getLockReason() {
            return this.lockReason;
        }

    }

    public static class OperationLocks extends TeaModel {
        @NameInMap("OperationLock")
        public java.util.List<OperationLock> operationLock;

        public static OperationLocks build(java.util.Map<String, ?> map) throws Exception {
            OperationLocks self = new OperationLocks();
            return TeaModel.build(map, self);
        }

        public OperationLocks setOperationLock(java.util.List<OperationLock> operationLock) {
            this.operationLock = operationLock;
            return this;
        }
        public java.util.List<OperationLock> getOperationLock() {
            return this.operationLock;
        }

    }

    public static class SupportInstanceTypeFamilies extends TeaModel {
        @NameInMap("SupportInstanceTypeFamily")
        public java.util.List<String> supportInstanceTypeFamily;

        public static SupportInstanceTypeFamilies build(java.util.Map<String, ?> map) throws Exception {
            SupportInstanceTypeFamilies self = new SupportInstanceTypeFamilies();
            return TeaModel.build(map, self);
        }

        public SupportInstanceTypeFamilies setSupportInstanceTypeFamily(java.util.List<String> supportInstanceTypeFamily) {
            this.supportInstanceTypeFamily = supportInstanceTypeFamily;
            return this;
        }
        public java.util.List<String> getSupportInstanceTypeFamily() {
            return this.supportInstanceTypeFamily;
        }

    }

    public static class SupportInstanceTypesList extends TeaModel {
        @NameInMap("SupportInstanceTypesList")
        public java.util.List<String> supportInstanceTypesList;

        public static SupportInstanceTypesList build(java.util.Map<String, ?> map) throws Exception {
            SupportInstanceTypesList self = new SupportInstanceTypesList();
            return TeaModel.build(map, self);
        }

        public SupportInstanceTypesList setSupportInstanceTypesList(java.util.List<String> supportInstanceTypesList) {
            this.supportInstanceTypesList = supportInstanceTypesList;
            return this;
        }
        public java.util.List<String> getSupportInstanceTypesList() {
            return this.supportInstanceTypesList;
        }

    }

    public static class SupportedCustomInstanceTypeFamilies extends TeaModel {
        @NameInMap("SupportedCustomInstanceTypeFamily")
        public java.util.List<String> supportedCustomInstanceTypeFamily;

        public static SupportedCustomInstanceTypeFamilies build(java.util.Map<String, ?> map) throws Exception {
            SupportedCustomInstanceTypeFamilies self = new SupportedCustomInstanceTypeFamilies();
            return TeaModel.build(map, self);
        }

        public SupportedCustomInstanceTypeFamilies setSupportedCustomInstanceTypeFamily(java.util.List<String> supportedCustomInstanceTypeFamily) {
            this.supportedCustomInstanceTypeFamily = supportedCustomInstanceTypeFamily;
            return this;
        }
        public java.util.List<String> getSupportedCustomInstanceTypeFamily() {
            return this.supportedCustomInstanceTypeFamily;
        }

    }

    public static class Tag extends TeaModel {
        @NameInMap("TagKey")
        public String tagKey;

        @NameInMap("TagValue")
        public String tagValue;

        public static Tag build(java.util.Map<String, ?> map) throws Exception {
            Tag self = new Tag();
            return TeaModel.build(map, self);
        }

        public Tag setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public Tag setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

    public static class Tags extends TeaModel {
        @NameInMap("Tag")
        public java.util.List<Tag> tag;

        public static Tags build(java.util.Map<String, ?> map) throws Exception {
            Tags self = new Tags();
            return TeaModel.build(map, self);
        }

        public Tags setTag(java.util.List<Tag> tag) {
            this.tag = tag;
            return this;
        }
        public java.util.List<Tag> getTag() {
            return this.tag;
        }

    }

    public static class DedicatedHost extends TeaModel {
        @NameInMap("SchedulerOptions")
        @Validation(required = true)
        public SchedulerOptions schedulerOptions;

        @NameInMap("ActionOnMaintenance")
        public String actionOnMaintenance;

        @NameInMap("AutoPlacement")
        public String autoPlacement;

        @NameInMap("AutoReleaseTime")
        public String autoReleaseTime;

        @NameInMap("Capacity")
        public Capacity capacity;

        @NameInMap("ChargeType")
        public String chargeType;

        @NameInMap("CpuOverCommitRatio")
        public Float cpuOverCommitRatio;

        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("DedicatedHostClusterId")
        public String dedicatedHostClusterId;

        @NameInMap("DedicatedHostId")
        public String dedicatedHostId;

        @NameInMap("DedicatedHostName")
        public String dedicatedHostName;

        @NameInMap("DedicatedHostType")
        public String dedicatedHostType;

        @NameInMap("Description")
        public String description;

        @NameInMap("ExpiredTime")
        public String expiredTime;

        @NameInMap("GPUSpec")
        public String GPUSpec;

        @NameInMap("HostDetailInfo")
        public HostDetailInfo hostDetailInfo;

        @NameInMap("Instances")
        public Instances instances;

        @NameInMap("MachineId")
        public String machineId;

        @NameInMap("NetworkAttributes")
        public NetworkAttributes networkAttributes;

        @NameInMap("OperationLocks")
        public OperationLocks operationLocks;

        @NameInMap("PhysicalGpus")
        public Integer physicalGpus;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        @NameInMap("SaleCycle")
        public String saleCycle;

        @NameInMap("Status")
        public String status;

        @NameInMap("SupportInstanceTypeFamilies")
        public SupportInstanceTypeFamilies supportInstanceTypeFamilies;

        @NameInMap("SupportInstanceTypesList")
        public SupportInstanceTypesList supportInstanceTypesList;

        @NameInMap("SupportedCustomInstanceTypeFamilies")
        public SupportedCustomInstanceTypeFamilies supportedCustomInstanceTypeFamilies;

        @NameInMap("Tags")
        public Tags tags;

        @NameInMap("TotalPhysicalCores")
        public Integer totalPhysicalCores;

        @NameInMap("TotalSockets")
        public Integer totalSockets;

        @NameInMap("ZoneId")
        public String zoneId;

        public static DedicatedHost build(java.util.Map<String, ?> map) throws Exception {
            DedicatedHost self = new DedicatedHost();
            return TeaModel.build(map, self);
        }

        public DedicatedHost setSchedulerOptions(SchedulerOptions schedulerOptions) {
            this.schedulerOptions = schedulerOptions;
            return this;
        }
        public SchedulerOptions getSchedulerOptions() {
            return this.schedulerOptions;
        }

        public DedicatedHost setActionOnMaintenance(String actionOnMaintenance) {
            this.actionOnMaintenance = actionOnMaintenance;
            return this;
        }
        public String getActionOnMaintenance() {
            return this.actionOnMaintenance;
        }

        public DedicatedHost setAutoPlacement(String autoPlacement) {
            this.autoPlacement = autoPlacement;
            return this;
        }
        public String getAutoPlacement() {
            return this.autoPlacement;
        }

        public DedicatedHost setAutoReleaseTime(String autoReleaseTime) {
            this.autoReleaseTime = autoReleaseTime;
            return this;
        }
        public String getAutoReleaseTime() {
            return this.autoReleaseTime;
        }

        public DedicatedHost setCapacity(Capacity capacity) {
            this.capacity = capacity;
            return this;
        }
        public Capacity getCapacity() {
            return this.capacity;
        }

        public DedicatedHost setChargeType(String chargeType) {
            this.chargeType = chargeType;
            return this;
        }
        public String getChargeType() {
            return this.chargeType;
        }

        public DedicatedHost setCpuOverCommitRatio(Float cpuOverCommitRatio) {
            this.cpuOverCommitRatio = cpuOverCommitRatio;
            return this;
        }
        public Float getCpuOverCommitRatio() {
            return this.cpuOverCommitRatio;
        }

        public DedicatedHost setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DedicatedHost setDedicatedHostClusterId(String dedicatedHostClusterId) {
            this.dedicatedHostClusterId = dedicatedHostClusterId;
            return this;
        }
        public String getDedicatedHostClusterId() {
            return this.dedicatedHostClusterId;
        }

        public DedicatedHost setDedicatedHostId(String dedicatedHostId) {
            this.dedicatedHostId = dedicatedHostId;
            return this;
        }
        public String getDedicatedHostId() {
            return this.dedicatedHostId;
        }

        public DedicatedHost setDedicatedHostName(String dedicatedHostName) {
            this.dedicatedHostName = dedicatedHostName;
            return this;
        }
        public String getDedicatedHostName() {
            return this.dedicatedHostName;
        }

        public DedicatedHost setDedicatedHostType(String dedicatedHostType) {
            this.dedicatedHostType = dedicatedHostType;
            return this;
        }
        public String getDedicatedHostType() {
            return this.dedicatedHostType;
        }

        public DedicatedHost setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DedicatedHost setExpiredTime(String expiredTime) {
            this.expiredTime = expiredTime;
            return this;
        }
        public String getExpiredTime() {
            return this.expiredTime;
        }

        public DedicatedHost setGPUSpec(String GPUSpec) {
            this.GPUSpec = GPUSpec;
            return this;
        }
        public String getGPUSpec() {
            return this.GPUSpec;
        }

        public DedicatedHost setHostDetailInfo(HostDetailInfo hostDetailInfo) {
            this.hostDetailInfo = hostDetailInfo;
            return this;
        }
        public HostDetailInfo getHostDetailInfo() {
            return this.hostDetailInfo;
        }

        public DedicatedHost setInstances(Instances instances) {
            this.instances = instances;
            return this;
        }
        public Instances getInstances() {
            return this.instances;
        }

        public DedicatedHost setMachineId(String machineId) {
            this.machineId = machineId;
            return this;
        }
        public String getMachineId() {
            return this.machineId;
        }

        public DedicatedHost setNetworkAttributes(NetworkAttributes networkAttributes) {
            this.networkAttributes = networkAttributes;
            return this;
        }
        public NetworkAttributes getNetworkAttributes() {
            return this.networkAttributes;
        }

        public DedicatedHost setOperationLocks(OperationLocks operationLocks) {
            this.operationLocks = operationLocks;
            return this;
        }
        public OperationLocks getOperationLocks() {
            return this.operationLocks;
        }

        public DedicatedHost setPhysicalGpus(Integer physicalGpus) {
            this.physicalGpus = physicalGpus;
            return this;
        }
        public Integer getPhysicalGpus() {
            return this.physicalGpus;
        }

        public DedicatedHost setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DedicatedHost setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DedicatedHost setSaleCycle(String saleCycle) {
            this.saleCycle = saleCycle;
            return this;
        }
        public String getSaleCycle() {
            return this.saleCycle;
        }

        public DedicatedHost setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DedicatedHost setSupportInstanceTypeFamilies(SupportInstanceTypeFamilies supportInstanceTypeFamilies) {
            this.supportInstanceTypeFamilies = supportInstanceTypeFamilies;
            return this;
        }
        public SupportInstanceTypeFamilies getSupportInstanceTypeFamilies() {
            return this.supportInstanceTypeFamilies;
        }

        public DedicatedHost setSupportInstanceTypesList(SupportInstanceTypesList supportInstanceTypesList) {
            this.supportInstanceTypesList = supportInstanceTypesList;
            return this;
        }
        public SupportInstanceTypesList getSupportInstanceTypesList() {
            return this.supportInstanceTypesList;
        }

        public DedicatedHost setSupportedCustomInstanceTypeFamilies(SupportedCustomInstanceTypeFamilies supportedCustomInstanceTypeFamilies) {
            this.supportedCustomInstanceTypeFamilies = supportedCustomInstanceTypeFamilies;
            return this;
        }
        public SupportedCustomInstanceTypeFamilies getSupportedCustomInstanceTypeFamilies() {
            return this.supportedCustomInstanceTypeFamilies;
        }

        public DedicatedHost setTags(Tags tags) {
            this.tags = tags;
            return this;
        }
        public Tags getTags() {
            return this.tags;
        }

        public DedicatedHost setTotalPhysicalCores(Integer totalPhysicalCores) {
            this.totalPhysicalCores = totalPhysicalCores;
            return this;
        }
        public Integer getTotalPhysicalCores() {
            return this.totalPhysicalCores;
        }

        public DedicatedHost setTotalSockets(Integer totalSockets) {
            this.totalSockets = totalSockets;
            return this;
        }
        public Integer getTotalSockets() {
            return this.totalSockets;
        }

        public DedicatedHost setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

    public static class DedicatedHosts extends TeaModel {
        @NameInMap("DedicatedHost")
        public java.util.List<DedicatedHost> dedicatedHost;

        public static DedicatedHosts build(java.util.Map<String, ?> map) throws Exception {
            DedicatedHosts self = new DedicatedHosts();
            return TeaModel.build(map, self);
        }

        public DedicatedHosts setDedicatedHost(java.util.List<DedicatedHost> dedicatedHost) {
            this.dedicatedHost = dedicatedHost;
            return this;
        }
        public java.util.List<DedicatedHost> getDedicatedHost() {
            return this.dedicatedHost;
        }

    }

}
