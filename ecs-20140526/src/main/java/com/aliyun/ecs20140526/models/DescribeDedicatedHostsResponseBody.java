// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeDedicatedHostsResponseBody extends TeaModel {
    // Details about the dedicated hosts.
    @NameInMap("DedicatedHosts")
    public DescribeDedicatedHostsResponseBodyDedicatedHosts dedicatedHosts;

    // The page number of the returned page.
    @NameInMap("PageNumber")
    public Integer pageNumber;

    // The number of entries returned per page.
    @NameInMap("PageSize")
    public Integer pageSize;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    // The total number of dedicated hosts.
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeDedicatedHostsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDedicatedHostsResponseBody self = new DescribeDedicatedHostsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDedicatedHostsResponseBody setDedicatedHosts(DescribeDedicatedHostsResponseBodyDedicatedHosts dedicatedHosts) {
        this.dedicatedHosts = dedicatedHosts;
        return this;
    }
    public DescribeDedicatedHostsResponseBodyDedicatedHosts getDedicatedHosts() {
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

    public static class DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostSchedulerOptions extends TeaModel {
        @NameInMap("ManagedPrivateSpaceId")
        public String managedPrivateSpaceId;

        public static DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostSchedulerOptions build(java.util.Map<String, ?> map) throws Exception {
            DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostSchedulerOptions self = new DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostSchedulerOptions();
            return TeaModel.build(map, self);
        }

        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostSchedulerOptions setManagedPrivateSpaceId(String managedPrivateSpaceId) {
            this.managedPrivateSpaceId = managedPrivateSpaceId;
            return this;
        }
        public String getManagedPrivateSpaceId() {
            return this.managedPrivateSpaceId;
        }

    }

    public static class DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostCapacity extends TeaModel {
        // The amount of available space on the local disks. Unit: GiB.
        @NameInMap("AvailableLocalStorage")
        public Integer availableLocalStorage;

        // The amount of available memory space. Unit: GiB.
        @NameInMap("AvailableMemory")
        public Float availableMemory;

        // The number of available vCPUs.
        @NameInMap("AvailableVcpus")
        public Integer availableVcpus;

        // The number of available vGPUs.
        @NameInMap("AvailableVgpus")
        public Integer availableVgpus;

        // The category of the local disks.
        @NameInMap("LocalStorageCategory")
        public String localStorageCategory;

        // The total capacity of the local disks. Unit: GiB.
        @NameInMap("TotalLocalStorage")
        public Integer totalLocalStorage;

        // The total capacity of the memory. Unit: GiB.
        @NameInMap("TotalMemory")
        public Float totalMemory;

        // The total number of vCPUs.
        @NameInMap("TotalVcpus")
        public Integer totalVcpus;

        // The total number of vGPUs.
        @NameInMap("TotalVgpus")
        public Integer totalVgpus;

        public static DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostCapacity build(java.util.Map<String, ?> map) throws Exception {
            DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostCapacity self = new DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostCapacity();
            return TeaModel.build(map, self);
        }

        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostCapacity setAvailableLocalStorage(Integer availableLocalStorage) {
            this.availableLocalStorage = availableLocalStorage;
            return this;
        }
        public Integer getAvailableLocalStorage() {
            return this.availableLocalStorage;
        }

        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostCapacity setAvailableMemory(Float availableMemory) {
            this.availableMemory = availableMemory;
            return this;
        }
        public Float getAvailableMemory() {
            return this.availableMemory;
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

        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostCapacity setLocalStorageCategory(String localStorageCategory) {
            this.localStorageCategory = localStorageCategory;
            return this;
        }
        public String getLocalStorageCategory() {
            return this.localStorageCategory;
        }

        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostCapacity setTotalLocalStorage(Integer totalLocalStorage) {
            this.totalLocalStorage = totalLocalStorage;
            return this;
        }
        public Integer getTotalLocalStorage() {
            return this.totalLocalStorage;
        }

        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostCapacity setTotalMemory(Float totalMemory) {
            this.totalMemory = totalMemory;
            return this;
        }
        public Float getTotalMemory() {
            return this.totalMemory;
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

    }

    public static class DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostHostDetailInfo extends TeaModel {
        // This parameter will be removed in the future. We recommend that you use other parameters to ensure future compatibility.
        @NameInMap("SerialNumber")
        public String serialNumber;

        public static DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostHostDetailInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostHostDetailInfo self = new DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostHostDetailInfo();
            return TeaModel.build(map, self);
        }

        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostHostDetailInfo setSerialNumber(String serialNumber) {
            this.serialNumber = serialNumber;
            return this;
        }
        public String getSerialNumber() {
            return this.serialNumber;
        }

    }

    public static class DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostInstancesInstance extends TeaModel {
        // The ID of the ECS instance created on the dedicated host.
        @NameInMap("InstanceId")
        public String instanceId;

        // The instance type of the ECS instance created on the dedicated host.
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
        // The timeout period of the UDP session that was established between Server Load Balancer (SLB) and the dedicated host. Unit: seconds. Valid value: 60.
        @NameInMap("SlbUdpTimeout")
        public Integer slbUdpTimeout;

        // The timeout period of the UDP session that was established between a user and an Alibaba Cloud service on the dedicated host. Unit: seconds. Valid value: 60.
        @NameInMap("UdpTimeout")
        public Integer udpTimeout;

        public static DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostNetworkAttributes build(java.util.Map<String, ?> map) throws Exception {
            DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostNetworkAttributes self = new DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostNetworkAttributes();
            return TeaModel.build(map, self);
        }

        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostNetworkAttributes setSlbUdpTimeout(Integer slbUdpTimeout) {
            this.slbUdpTimeout = slbUdpTimeout;
            return this;
        }
        public Integer getSlbUdpTimeout() {
            return this.slbUdpTimeout;
        }

        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostNetworkAttributes setUdpTimeout(Integer udpTimeout) {
            this.udpTimeout = udpTimeout;
            return this;
        }
        public Integer getUdpTimeout() {
            return this.udpTimeout;
        }

    }

    public static class DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostOperationLocksOperationLock extends TeaModel {
        // The reason why the dedicated host was locked. Valid values:
        // 
        // - financial: The dedicated host was locked due to overdue payments.
        // - security: The dedicated host was locked due to security reasons.
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

    public static class DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostTagsTag extends TeaModel {
        // The tag key of the dedicated host.
        @NameInMap("TagKey")
        public String tagKey;

        // The tag value of the dedicated host.
        @NameInMap("TagValue")
        public String tagValue;

        public static DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostTagsTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostTagsTag self = new DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostTagsTag();
            return TeaModel.build(map, self);
        }

        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostTagsTag setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostTagsTag setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
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

    public static class DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHost extends TeaModel {
        @NameInMap("SchedulerOptions")
        @Validation(required = true)
        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostSchedulerOptions schedulerOptions;

        // The policy used to migrate the instances deployed on the dedicated host when the dedicated host fails. Valid values:
        // 
        // *   Migrate: The instances are migrated to another physical server. Instances that are not in the Stopped state when the dedicated host fails are restarted after migration.
        // *   Stop: The instances are stopped. If the dedicated host cannot be repaired, the instances are migrated to another physical server and restarted.
        // 
        // If the dedicated host has cloud disks attached, the default value is Migrate. If the dedicated host has local disks attached, the default value is Stop.
        @NameInMap("ActionOnMaintenance")
        public String actionOnMaintenance;

        // Indicates whether the dedicated host was added to the resource pool for automatic deployment. Valid values:
        // 
        // *   on: The dedicated host was added to the resource pool for automatic deployment.
        // *   off: The dedicated host was not added to the resource pool for automatic deployment.
        // 
        // For more information about automatic deployment, see the "[Automatic deployment](~~118938~~)" section in the Functions and features topic.
        @NameInMap("AutoPlacement")
        public String autoPlacement;

        // The automatic release time of the dedicated host. The time follows the [ISO 8601](~~25696~~) standard in the `yyyy-MM-ddTHH:mmZ` format. The time is displayed in UTC.
        @NameInMap("AutoReleaseTime")
        public String autoReleaseTime;

        // The performance specifications of the dedicated host.
        @NameInMap("Capacity")
        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostCapacity capacity;

        // The billing method of the dedicated host.
        @NameInMap("ChargeType")
        public String chargeType;

        // The number of cores in a single CPU.
        @NameInMap("Cores")
        public Integer cores;

        // The CPU overcommit ratio.
        @NameInMap("CpuOverCommitRatio")
        public Float cpuOverCommitRatio;

        // The time when the dedicated host was created. The time follows the [ISO 8601](~~25696~~) standard in the `yyyy-MM-ddTHH:mmZ` format. The time is displayed in UTC.
        @NameInMap("CreationTime")
        public String creationTime;

        // The ID of the dedicated host cluster to which the dedicated host belongs.
        @NameInMap("DedicatedHostClusterId")
        public String dedicatedHostClusterId;

        // The ID of the dedicated host.
        @NameInMap("DedicatedHostId")
        public String dedicatedHostId;

        // The name of the dedicated host.
        @NameInMap("DedicatedHostName")
        public String dedicatedHostName;

        // The type of the dedicated host.
        @NameInMap("DedicatedHostType")
        public String dedicatedHostType;

        // The description of the dedicated host.
        @NameInMap("Description")
        public String description;

        // The expiration time of the subscription dedicated host. The time follows the [ISO 8601](~~25696~~) standard in the `yyyy-MM-ddTHH:mmZ` format. The time is displayed in UTC.
        @NameInMap("ExpiredTime")
        public String expiredTime;

        // The GPU model.
        @NameInMap("GPUSpec")
        public String GPUSpec;

        // This parameter will be removed in the future. We recommend that you use other parameters to ensure future compatibility.
        @NameInMap("HostDetailInfo")
        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostHostDetailInfo hostDetailInfo;

        // Details about the ECS instances that were created on the dedicated host.
        @NameInMap("Instances")
        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostInstances instances;

        // The machine code of the dedicated host.
        @NameInMap("MachineId")
        public String machineId;

        // The network attributes of the dedicated host.
        @NameInMap("NetworkAttributes")
        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostNetworkAttributes networkAttributes;

        // The reasons why the resources of the dedicated host were locked.
        @NameInMap("OperationLocks")
        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostOperationLocks operationLocks;

        // The number of physical GPUs.
        @NameInMap("PhysicalGpus")
        public Integer physicalGpus;

        // The region ID of the dedicated host.
        @NameInMap("RegionId")
        public String regionId;

        // The ID of the resource group to which the dedicated host belongs.
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        // The unit of the subscription period. Valid values:
        // 
        // *   Month
        // *   Year
        @NameInMap("SaleCycle")
        public String saleCycle;

        // The number of physical CPUs.
        @NameInMap("Sockets")
        public Integer sockets;

        // The service state of the dedicated host. Valid values:
        // 
        // *   Available: The dedicated host is running normally.
        // *   UnderAssessment: The dedicated host is at risk, which may cause issues to ECS instances on the dedicated host.
        // *   PermanentFailure: The dedicated host has permanent failures and is unusable.
        @NameInMap("Status")
        public String status;

        // The custom ECS instance families supported by the dedicated host.
        @NameInMap("SupportedCustomInstanceTypeFamilies")
        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostSupportedCustomInstanceTypeFamilies supportedCustomInstanceTypeFamilies;

        // The ECS instance families supported by the dedicated host.
        @NameInMap("SupportedInstanceTypeFamilies")
        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostSupportedInstanceTypeFamilies supportedInstanceTypeFamilies;

        // The ECS instance types supported by the dedicated host.
        @NameInMap("SupportedInstanceTypesList")
        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostSupportedInstanceTypesList supportedInstanceTypesList;

        // The tags of the dedicated host.
        @NameInMap("Tags")
        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostTags tags;

        // The zone ID of the dedicated host.
        @NameInMap("ZoneId")
        public String zoneId;

        public static DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHost build(java.util.Map<String, ?> map) throws Exception {
            DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHost self = new DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHost();
            return TeaModel.build(map, self);
        }

        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHost setSchedulerOptions(DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostSchedulerOptions schedulerOptions) {
            this.schedulerOptions = schedulerOptions;
            return this;
        }
        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostSchedulerOptions getSchedulerOptions() {
            return this.schedulerOptions;
        }

        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHost setActionOnMaintenance(String actionOnMaintenance) {
            this.actionOnMaintenance = actionOnMaintenance;
            return this;
        }
        public String getActionOnMaintenance() {
            return this.actionOnMaintenance;
        }

        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHost setAutoPlacement(String autoPlacement) {
            this.autoPlacement = autoPlacement;
            return this;
        }
        public String getAutoPlacement() {
            return this.autoPlacement;
        }

        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHost setAutoReleaseTime(String autoReleaseTime) {
            this.autoReleaseTime = autoReleaseTime;
            return this;
        }
        public String getAutoReleaseTime() {
            return this.autoReleaseTime;
        }

        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHost setCapacity(DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostCapacity capacity) {
            this.capacity = capacity;
            return this;
        }
        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostCapacity getCapacity() {
            return this.capacity;
        }

        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHost setChargeType(String chargeType) {
            this.chargeType = chargeType;
            return this;
        }
        public String getChargeType() {
            return this.chargeType;
        }

        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHost setCores(Integer cores) {
            this.cores = cores;
            return this;
        }
        public Integer getCores() {
            return this.cores;
        }

        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHost setCpuOverCommitRatio(Float cpuOverCommitRatio) {
            this.cpuOverCommitRatio = cpuOverCommitRatio;
            return this;
        }
        public Float getCpuOverCommitRatio() {
            return this.cpuOverCommitRatio;
        }

        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHost setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHost setDedicatedHostClusterId(String dedicatedHostClusterId) {
            this.dedicatedHostClusterId = dedicatedHostClusterId;
            return this;
        }
        public String getDedicatedHostClusterId() {
            return this.dedicatedHostClusterId;
        }

        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHost setDedicatedHostId(String dedicatedHostId) {
            this.dedicatedHostId = dedicatedHostId;
            return this;
        }
        public String getDedicatedHostId() {
            return this.dedicatedHostId;
        }

        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHost setDedicatedHostName(String dedicatedHostName) {
            this.dedicatedHostName = dedicatedHostName;
            return this;
        }
        public String getDedicatedHostName() {
            return this.dedicatedHostName;
        }

        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHost setDedicatedHostType(String dedicatedHostType) {
            this.dedicatedHostType = dedicatedHostType;
            return this;
        }
        public String getDedicatedHostType() {
            return this.dedicatedHostType;
        }

        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHost setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHost setExpiredTime(String expiredTime) {
            this.expiredTime = expiredTime;
            return this;
        }
        public String getExpiredTime() {
            return this.expiredTime;
        }

        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHost setGPUSpec(String GPUSpec) {
            this.GPUSpec = GPUSpec;
            return this;
        }
        public String getGPUSpec() {
            return this.GPUSpec;
        }

        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHost setHostDetailInfo(DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostHostDetailInfo hostDetailInfo) {
            this.hostDetailInfo = hostDetailInfo;
            return this;
        }
        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostHostDetailInfo getHostDetailInfo() {
            return this.hostDetailInfo;
        }

        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHost setInstances(DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostInstances instances) {
            this.instances = instances;
            return this;
        }
        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostInstances getInstances() {
            return this.instances;
        }

        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHost setMachineId(String machineId) {
            this.machineId = machineId;
            return this;
        }
        public String getMachineId() {
            return this.machineId;
        }

        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHost setNetworkAttributes(DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostNetworkAttributes networkAttributes) {
            this.networkAttributes = networkAttributes;
            return this;
        }
        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostNetworkAttributes getNetworkAttributes() {
            return this.networkAttributes;
        }

        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHost setOperationLocks(DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostOperationLocks operationLocks) {
            this.operationLocks = operationLocks;
            return this;
        }
        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostOperationLocks getOperationLocks() {
            return this.operationLocks;
        }

        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHost setPhysicalGpus(Integer physicalGpus) {
            this.physicalGpus = physicalGpus;
            return this;
        }
        public Integer getPhysicalGpus() {
            return this.physicalGpus;
        }

        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHost setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHost setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHost setSaleCycle(String saleCycle) {
            this.saleCycle = saleCycle;
            return this;
        }
        public String getSaleCycle() {
            return this.saleCycle;
        }

        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHost setSockets(Integer sockets) {
            this.sockets = sockets;
            return this;
        }
        public Integer getSockets() {
            return this.sockets;
        }

        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHost setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHost setSupportedCustomInstanceTypeFamilies(DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostSupportedCustomInstanceTypeFamilies supportedCustomInstanceTypeFamilies) {
            this.supportedCustomInstanceTypeFamilies = supportedCustomInstanceTypeFamilies;
            return this;
        }
        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostSupportedCustomInstanceTypeFamilies getSupportedCustomInstanceTypeFamilies() {
            return this.supportedCustomInstanceTypeFamilies;
        }

        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHost setSupportedInstanceTypeFamilies(DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostSupportedInstanceTypeFamilies supportedInstanceTypeFamilies) {
            this.supportedInstanceTypeFamilies = supportedInstanceTypeFamilies;
            return this;
        }
        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostSupportedInstanceTypeFamilies getSupportedInstanceTypeFamilies() {
            return this.supportedInstanceTypeFamilies;
        }

        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHost setSupportedInstanceTypesList(DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostSupportedInstanceTypesList supportedInstanceTypesList) {
            this.supportedInstanceTypesList = supportedInstanceTypesList;
            return this;
        }
        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostSupportedInstanceTypesList getSupportedInstanceTypesList() {
            return this.supportedInstanceTypesList;
        }

        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHost setTags(DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostTags tags) {
            this.tags = tags;
            return this;
        }
        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostTags getTags() {
            return this.tags;
        }

        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHost setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
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
