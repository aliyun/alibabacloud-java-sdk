// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeInstanceTypesRequest extends TeaModel {
    // The CPU architecture. Valid values:
    // 
    // *   X86: x86
    // *   ARM: ARM
    @NameInMap("CpuArchitecture")
    public String cpuArchitecture;

    // The GPU model.
    // 
    // > Fuzzy match is supported. For example, if an instance type provides NVIDIA V100 GPUs and you set this parameter to NVIDIA, information about the instance type is queried.
    @NameInMap("GPUSpec")
    public String GPUSpec;

    // The category of the instance type. Valid values:
    // 
    // *   General-purpose: general-purpose instance type
    // *   Compute-optimized: compute-optimized instance type
    // *   Memory-optimized: memory-optimized instance type
    // *   Big data: big data instance type
    // *   Local SSDs: instance type with local SSDs
    // *   High Clock Speed: instance type with high clock speeds
    // *   Enhanced: enhanced instance type
    // *   Shared: shared instance type
    // *   Compute-optimized with GPU: GPU-accelerated compute-optimized instance type
    // *   Visual Compute-optimized: visual compute-optimized instance type
    // *   Heterogeneous Service: heterogeneous service instance type
    // *   Compute-optimized with FPGA: FPGA-accelerated compute-optimized instance type
    // *   Compute-optimized with NPU: NPU-accelerated compute-optimized instance type
    // *   ECS Bare Metal: ECS Bare Metal Instance type
    // *   Super Computing Cluster: SCC instance type
    @NameInMap("InstanceCategory")
    public String instanceCategory;

    // The level of the instance family. Valid values:
    // 
    // *   EntryLevel
    // *   EnterpriseLevel
    // *   CreditEntryLevel
    @NameInMap("InstanceFamilyLevel")
    public String instanceFamilyLevel;

    // The instance family to which the instance type belongs. For information about the valid values of this parameter, see [DescribeInstanceTypeFamilies](~~25621~~).
    // 
    // For more information about instance families, see [Instance families](~~25378~~).
    @NameInMap("InstanceTypeFamily")
    public String instanceTypeFamily;

    // Instance type N. Valid values of N: 1 to 10 If this parameter is empty, information about all instance types is queried.
    @NameInMap("InstanceTypes")
    public java.util.List<String> instanceTypes;

    // The category of local disks. For more information, see [Local disks](~~63138#section_n2w\_8yc\_5u1~~). Valid values:
    // 
    // *   local_hdd_pro: local Serial Advanced Technology Attachment (SATA) HDDs, which are used by d1ne or d1 instances
    // *   local_ssd_pro: local NVMe SSDs, which are used by i2, i2g, i1, ga1, or gn5 instances
    @NameInMap("LocalStorageCategory")
    public String localStorageCategory;

    // The maximum number of entries to return on each page. Maximum value: 1600.
    // 
    // Default value: 1600.
    @NameInMap("MaxResults")
    public Long maxResults;

    // The maximum number of vCPUs. The value must be a positive integer.
    // 
    // > If an instance type has more vCPUs than the specified value, information about the instance type is not queried.
    @NameInMap("MaximumCpuCoreCount")
    public Integer maximumCpuCoreCount;

    // The maximum clock speed.
    // 
    // > If an instance type uses processors that have a higher clock speed than the specified value, information about the instance type is not queried.
    @NameInMap("MaximumCpuSpeedFrequency")
    public Float maximumCpuSpeedFrequency;

    // The maximum turbo frequency.
    // 
    // > If an instance type uses processors that deliver a higher turbo frequency than the specified value, information about the instance type is not queried.
    @NameInMap("MaximumCpuTurboFrequency")
    public Float maximumCpuTurboFrequency;

    // The maximum number of GPUs. The value must be a positive integer.
    // 
    // > If an instance type provides more GPUs than the specified value, information about the instance type is not queried.
    @NameInMap("MaximumGPUAmount")
    public Integer maximumGPUAmount;

    // The maximum memory size. Unit: GiB.
    // 
    // > If the memory size of an instance type is larger than the specified value, information about the instance type is not queried.
    @NameInMap("MaximumMemorySize")
    public Float maximumMemorySize;

    // The minimum baseline CPU performance (overall baseline performance of all vCPUs) per t5 or t6 burstable instance.
    // 
    // > If a t5 or t6 instance type provides baseline CPU performance that is lower than the specified value, information about the instance type is not queried.
    @NameInMap("MinimumBaselineCredit")
    public Integer minimumBaselineCredit;

    // The minimum number of vCPUs. The value must be a positive integer.
    // 
    // > If an instance type has fewer vCPUs than the specified value, information about the instance type is not queried.
    @NameInMap("MinimumCpuCoreCount")
    public Integer minimumCpuCoreCount;

    // The minimum clock speed.
    // 
    // > If an instance type uses processors that have a lower clock speed than the specified value, information about the instance type is not queried.
    @NameInMap("MinimumCpuSpeedFrequency")
    public Float minimumCpuSpeedFrequency;

    // The minimum turbo frequency.
    // 
    // > If an instance type uses processors that deliver a lower turbo frequency than the specified value, information about the instance type is not queried.
    @NameInMap("MinimumCpuTurboFrequency")
    public Float minimumCpuTurboFrequency;

    // The minimum number of cloud disks.
    // 
    // > If an instance type supports fewer cloud disks than the specified value, information about the instance type is not queried.
    @NameInMap("MinimumDiskQuantity")
    public Integer minimumDiskQuantity;

    // The minimum number of IPv6 addresses per ENI.
    // 
    // > If an instance type supports fewer IPv6 addresses per ENI than the specified value, information about the instance type is not queried.
    @NameInMap("MinimumEniIpv6AddressQuantity")
    public Integer minimumEniIpv6AddressQuantity;

    // The minimum number of IPv4 addresses per ENI.
    // 
    // > If an instance type supports fewer IPv4 addresses per ENI than the specified value, information about the instance type is not queried.
    @NameInMap("MinimumEniPrivateIpAddressQuantity")
    public Integer minimumEniPrivateIpAddressQuantity;

    // The minimum number of elastic network interfaces (ENIs).
    // 
    // > If an instance type supports fewer ENIs than the specified value, information about the instance type is not queried.
    @NameInMap("MinimumEniQuantity")
    public Integer minimumEniQuantity;

    // The minimum number of ERIs.
    // 
    // > If an instance type supports fewer ERIs than the specified value, information about the instance type is not queried.
    @NameInMap("MinimumEriQuantity")
    public Integer minimumEriQuantity;

    // The minimum number of GPUs. The value must be a positive integer.
    // 
    // > If an instance type provides fewer GPUs than the specified value, information about the instance type is not queried.
    @NameInMap("MinimumGPUAmount")
    public Integer minimumGPUAmount;

    // The minimum initial CPU credits per t5 or t6 burstable instance.
    // 
    // > If a t5 or t6 instance type provides less initial vCPU credits than the specified value, information about the instance type is not queried.
    @NameInMap("MinimumInitialCredit")
    public Integer minimumInitialCredit;

    // The minimum inbound internal bandwidth. Unit: Kbit/s.
    // 
    // > If an instance type provides an inbound internal bandwidth that is lower than the specified value, information about the instance type is not queried.
    @NameInMap("MinimumInstanceBandwidthRx")
    public Integer minimumInstanceBandwidthRx;

    // The minimum outbound internal bandwidth. Unit: Kbit/s.
    // 
    // > If an instance type provides an outbound internal bandwidth that is lower than the specified value, information about the instance type is not queried.
    @NameInMap("MinimumInstanceBandwidthTx")
    public Integer minimumInstanceBandwidthTx;

    // The minimum inbound packet forwarding rate over the internal network. Unit: pps.
    // 
    // > If an instance type provides an inbound packet forwarding rate over the internal network that is lower than the specified value, information about the instance type is not queried.
    @NameInMap("MinimumInstancePpsRx")
    public Long minimumInstancePpsRx;

    // The minimum outbound packet forwarding rate over the internal network. Unit: pps.
    // 
    // > If an instance type provides an outbound packet forwarding rate over the internal network that is lower than the specified value, information about the instance type is not queried.
    @NameInMap("MinimumInstancePpsTx")
    public Long minimumInstancePpsTx;

    // The minimum number of local disks.
    // 
    // > If an instance type supports fewer local disks than the specified value, information about the instance type is not queried.
    @NameInMap("MinimumLocalStorageAmount")
    public Integer minimumLocalStorageAmount;

    // The capacity of each local disk. Unit: GiB.
    @NameInMap("MinimumLocalStorageCapacity")
    public Long minimumLocalStorageCapacity;

    // The minimum memory size. Unit: GiB.
    // 
    // > If the memory size of an instance type is smaller than the specified value, information about the instance type is not queried.
    @NameInMap("MinimumMemorySize")
    public Float minimumMemorySize;

    // The minimum default number of queues per primary network interface controller (NIC).
    // 
    // > If an instance type supports fewer queues per primary NIC than the specified value, information about the instance type is not queried.
    @NameInMap("MinimumPrimaryEniQueueNumber")
    public Integer minimumPrimaryEniQueueNumber;

    // The minimum number of queue pair (QP) queues per elastic RDMA interface (ERI).
    // 
    // > If an instance type supports fewer QP queues per ERI than the specified value, information about the instance type is not queried.
    @NameInMap("MinimumQueuePairNumber")
    public Integer minimumQueuePairNumber;

    // The minimum default number of queues per secondary NIC.
    // 
    // > If an instance type supports fewer queues per secondary NIC than the specified value, information about the instance type is not queried.
    @NameInMap("MinimumSecondaryEniQueueNumber")
    public Integer minimumSecondaryEniQueueNumber;

    // The query token. Set the value to the NextToken value queried in the previous call to the DescribeInstanceTypes operation. Leave this parameter empty the first time you call this operation.
    @NameInMap("NextToken")
    public String nextToken;

    // Specifies whether cloud disks can be attached by using the NVMe protocol. Valid values:
    // 
    // *   required: Cloud disks can be attached by using the NVMe protocol.
    // *   unsupported: Cloud disk cannot be attached by using the NVMe protocol.
    @NameInMap("NvmeSupport")
    public String nvmeSupport;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    // The CPU model.
    // 
    // > Fuzzy match is supported. For example, if an instance type uses Intel Xeon (Ice Lake) Platinum 8369B processors and you set this parameter to Intel, information about the instance type is queried.
    @NameInMap("PhysicalProcessorModel")
    public String physicalProcessorModel;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static DescribeInstanceTypesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceTypesRequest self = new DescribeInstanceTypesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceTypesRequest setCpuArchitecture(String cpuArchitecture) {
        this.cpuArchitecture = cpuArchitecture;
        return this;
    }
    public String getCpuArchitecture() {
        return this.cpuArchitecture;
    }

    public DescribeInstanceTypesRequest setGPUSpec(String GPUSpec) {
        this.GPUSpec = GPUSpec;
        return this;
    }
    public String getGPUSpec() {
        return this.GPUSpec;
    }

    public DescribeInstanceTypesRequest setInstanceCategory(String instanceCategory) {
        this.instanceCategory = instanceCategory;
        return this;
    }
    public String getInstanceCategory() {
        return this.instanceCategory;
    }

    public DescribeInstanceTypesRequest setInstanceFamilyLevel(String instanceFamilyLevel) {
        this.instanceFamilyLevel = instanceFamilyLevel;
        return this;
    }
    public String getInstanceFamilyLevel() {
        return this.instanceFamilyLevel;
    }

    public DescribeInstanceTypesRequest setInstanceTypeFamily(String instanceTypeFamily) {
        this.instanceTypeFamily = instanceTypeFamily;
        return this;
    }
    public String getInstanceTypeFamily() {
        return this.instanceTypeFamily;
    }

    public DescribeInstanceTypesRequest setInstanceTypes(java.util.List<String> instanceTypes) {
        this.instanceTypes = instanceTypes;
        return this;
    }
    public java.util.List<String> getInstanceTypes() {
        return this.instanceTypes;
    }

    public DescribeInstanceTypesRequest setLocalStorageCategory(String localStorageCategory) {
        this.localStorageCategory = localStorageCategory;
        return this;
    }
    public String getLocalStorageCategory() {
        return this.localStorageCategory;
    }

    public DescribeInstanceTypesRequest setMaxResults(Long maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Long getMaxResults() {
        return this.maxResults;
    }

    public DescribeInstanceTypesRequest setMaximumCpuCoreCount(Integer maximumCpuCoreCount) {
        this.maximumCpuCoreCount = maximumCpuCoreCount;
        return this;
    }
    public Integer getMaximumCpuCoreCount() {
        return this.maximumCpuCoreCount;
    }

    public DescribeInstanceTypesRequest setMaximumCpuSpeedFrequency(Float maximumCpuSpeedFrequency) {
        this.maximumCpuSpeedFrequency = maximumCpuSpeedFrequency;
        return this;
    }
    public Float getMaximumCpuSpeedFrequency() {
        return this.maximumCpuSpeedFrequency;
    }

    public DescribeInstanceTypesRequest setMaximumCpuTurboFrequency(Float maximumCpuTurboFrequency) {
        this.maximumCpuTurboFrequency = maximumCpuTurboFrequency;
        return this;
    }
    public Float getMaximumCpuTurboFrequency() {
        return this.maximumCpuTurboFrequency;
    }

    public DescribeInstanceTypesRequest setMaximumGPUAmount(Integer maximumGPUAmount) {
        this.maximumGPUAmount = maximumGPUAmount;
        return this;
    }
    public Integer getMaximumGPUAmount() {
        return this.maximumGPUAmount;
    }

    public DescribeInstanceTypesRequest setMaximumMemorySize(Float maximumMemorySize) {
        this.maximumMemorySize = maximumMemorySize;
        return this;
    }
    public Float getMaximumMemorySize() {
        return this.maximumMemorySize;
    }

    public DescribeInstanceTypesRequest setMinimumBaselineCredit(Integer minimumBaselineCredit) {
        this.minimumBaselineCredit = minimumBaselineCredit;
        return this;
    }
    public Integer getMinimumBaselineCredit() {
        return this.minimumBaselineCredit;
    }

    public DescribeInstanceTypesRequest setMinimumCpuCoreCount(Integer minimumCpuCoreCount) {
        this.minimumCpuCoreCount = minimumCpuCoreCount;
        return this;
    }
    public Integer getMinimumCpuCoreCount() {
        return this.minimumCpuCoreCount;
    }

    public DescribeInstanceTypesRequest setMinimumCpuSpeedFrequency(Float minimumCpuSpeedFrequency) {
        this.minimumCpuSpeedFrequency = minimumCpuSpeedFrequency;
        return this;
    }
    public Float getMinimumCpuSpeedFrequency() {
        return this.minimumCpuSpeedFrequency;
    }

    public DescribeInstanceTypesRequest setMinimumCpuTurboFrequency(Float minimumCpuTurboFrequency) {
        this.minimumCpuTurboFrequency = minimumCpuTurboFrequency;
        return this;
    }
    public Float getMinimumCpuTurboFrequency() {
        return this.minimumCpuTurboFrequency;
    }

    public DescribeInstanceTypesRequest setMinimumDiskQuantity(Integer minimumDiskQuantity) {
        this.minimumDiskQuantity = minimumDiskQuantity;
        return this;
    }
    public Integer getMinimumDiskQuantity() {
        return this.minimumDiskQuantity;
    }

    public DescribeInstanceTypesRequest setMinimumEniIpv6AddressQuantity(Integer minimumEniIpv6AddressQuantity) {
        this.minimumEniIpv6AddressQuantity = minimumEniIpv6AddressQuantity;
        return this;
    }
    public Integer getMinimumEniIpv6AddressQuantity() {
        return this.minimumEniIpv6AddressQuantity;
    }

    public DescribeInstanceTypesRequest setMinimumEniPrivateIpAddressQuantity(Integer minimumEniPrivateIpAddressQuantity) {
        this.minimumEniPrivateIpAddressQuantity = minimumEniPrivateIpAddressQuantity;
        return this;
    }
    public Integer getMinimumEniPrivateIpAddressQuantity() {
        return this.minimumEniPrivateIpAddressQuantity;
    }

    public DescribeInstanceTypesRequest setMinimumEniQuantity(Integer minimumEniQuantity) {
        this.minimumEniQuantity = minimumEniQuantity;
        return this;
    }
    public Integer getMinimumEniQuantity() {
        return this.minimumEniQuantity;
    }

    public DescribeInstanceTypesRequest setMinimumEriQuantity(Integer minimumEriQuantity) {
        this.minimumEriQuantity = minimumEriQuantity;
        return this;
    }
    public Integer getMinimumEriQuantity() {
        return this.minimumEriQuantity;
    }

    public DescribeInstanceTypesRequest setMinimumGPUAmount(Integer minimumGPUAmount) {
        this.minimumGPUAmount = minimumGPUAmount;
        return this;
    }
    public Integer getMinimumGPUAmount() {
        return this.minimumGPUAmount;
    }

    public DescribeInstanceTypesRequest setMinimumInitialCredit(Integer minimumInitialCredit) {
        this.minimumInitialCredit = minimumInitialCredit;
        return this;
    }
    public Integer getMinimumInitialCredit() {
        return this.minimumInitialCredit;
    }

    public DescribeInstanceTypesRequest setMinimumInstanceBandwidthRx(Integer minimumInstanceBandwidthRx) {
        this.minimumInstanceBandwidthRx = minimumInstanceBandwidthRx;
        return this;
    }
    public Integer getMinimumInstanceBandwidthRx() {
        return this.minimumInstanceBandwidthRx;
    }

    public DescribeInstanceTypesRequest setMinimumInstanceBandwidthTx(Integer minimumInstanceBandwidthTx) {
        this.minimumInstanceBandwidthTx = minimumInstanceBandwidthTx;
        return this;
    }
    public Integer getMinimumInstanceBandwidthTx() {
        return this.minimumInstanceBandwidthTx;
    }

    public DescribeInstanceTypesRequest setMinimumInstancePpsRx(Long minimumInstancePpsRx) {
        this.minimumInstancePpsRx = minimumInstancePpsRx;
        return this;
    }
    public Long getMinimumInstancePpsRx() {
        return this.minimumInstancePpsRx;
    }

    public DescribeInstanceTypesRequest setMinimumInstancePpsTx(Long minimumInstancePpsTx) {
        this.minimumInstancePpsTx = minimumInstancePpsTx;
        return this;
    }
    public Long getMinimumInstancePpsTx() {
        return this.minimumInstancePpsTx;
    }

    public DescribeInstanceTypesRequest setMinimumLocalStorageAmount(Integer minimumLocalStorageAmount) {
        this.minimumLocalStorageAmount = minimumLocalStorageAmount;
        return this;
    }
    public Integer getMinimumLocalStorageAmount() {
        return this.minimumLocalStorageAmount;
    }

    public DescribeInstanceTypesRequest setMinimumLocalStorageCapacity(Long minimumLocalStorageCapacity) {
        this.minimumLocalStorageCapacity = minimumLocalStorageCapacity;
        return this;
    }
    public Long getMinimumLocalStorageCapacity() {
        return this.minimumLocalStorageCapacity;
    }

    public DescribeInstanceTypesRequest setMinimumMemorySize(Float minimumMemorySize) {
        this.minimumMemorySize = minimumMemorySize;
        return this;
    }
    public Float getMinimumMemorySize() {
        return this.minimumMemorySize;
    }

    public DescribeInstanceTypesRequest setMinimumPrimaryEniQueueNumber(Integer minimumPrimaryEniQueueNumber) {
        this.minimumPrimaryEniQueueNumber = minimumPrimaryEniQueueNumber;
        return this;
    }
    public Integer getMinimumPrimaryEniQueueNumber() {
        return this.minimumPrimaryEniQueueNumber;
    }

    public DescribeInstanceTypesRequest setMinimumQueuePairNumber(Integer minimumQueuePairNumber) {
        this.minimumQueuePairNumber = minimumQueuePairNumber;
        return this;
    }
    public Integer getMinimumQueuePairNumber() {
        return this.minimumQueuePairNumber;
    }

    public DescribeInstanceTypesRequest setMinimumSecondaryEniQueueNumber(Integer minimumSecondaryEniQueueNumber) {
        this.minimumSecondaryEniQueueNumber = minimumSecondaryEniQueueNumber;
        return this;
    }
    public Integer getMinimumSecondaryEniQueueNumber() {
        return this.minimumSecondaryEniQueueNumber;
    }

    public DescribeInstanceTypesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeInstanceTypesRequest setNvmeSupport(String nvmeSupport) {
        this.nvmeSupport = nvmeSupport;
        return this;
    }
    public String getNvmeSupport() {
        return this.nvmeSupport;
    }

    public DescribeInstanceTypesRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeInstanceTypesRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeInstanceTypesRequest setPhysicalProcessorModel(String physicalProcessorModel) {
        this.physicalProcessorModel = physicalProcessorModel;
        return this;
    }
    public String getPhysicalProcessorModel() {
        return this.physicalProcessorModel;
    }

    public DescribeInstanceTypesRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeInstanceTypesRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
