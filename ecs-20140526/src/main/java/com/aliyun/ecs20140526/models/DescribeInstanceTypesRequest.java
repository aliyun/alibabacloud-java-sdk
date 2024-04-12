// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeInstanceTypesRequest extends TeaModel {
    /**
     * <p>The CPU architecture. Valid values:</p>
     * <br>
     * <p>*   X86: x86</p>
     * <p>*   ARM: ARM</p>
     */
    @NameInMap("CpuArchitecture")
    public String cpuArchitecture;

    @NameInMap("CpuArchitectures")
    public java.util.List<String> cpuArchitectures;

    /**
     * <p>The GPU model.</p>
     * <br>
     * <p>>  Fuzzy match is supported. For example, if an instance type provides NVIDIA V100 GPUs and you set this parameter to NVIDIA, information about the instance type is queried.</p>
     */
    @NameInMap("GPUSpec")
    public String GPUSpec;

    @NameInMap("GpuSpecs")
    public java.util.List<String> gpuSpecs;

    @NameInMap("InstanceCategories")
    public java.util.List<String> instanceCategories;

    /**
     * <p>The category of the instance type. Valid values:</p>
     * <br>
     * <p>*   General-purpose: general-purpose instance type</p>
     * <p>*   Compute-optimized: compute-optimized instance type</p>
     * <p>*   Memory-optimized: memory-optimized instance type</p>
     * <p>*   Big data: big data instance type</p>
     * <p>*   Local SSDs: instance type with local SSDs</p>
     * <p>*   High Clock Speed: instance type with high clock speeds</p>
     * <p>*   Enhanced: enhanced instance type</p>
     * <p>*   Shared: shared instance type</p>
     * <p>*   Compute-optimized with GPU: GPU-accelerated compute-optimized instance type</p>
     * <p>*   Visual Compute-optimized: visual compute-optimized instance type</p>
     * <p>*   Heterogeneous Service: heterogeneous service instance type</p>
     * <p>*   Compute-optimized with FPGA: FPGA-accelerated compute-optimized instance type</p>
     * <p>*   Compute-optimized with NPU: NPU-accelerated compute-optimized instance type</p>
     * <p>*   ECS Bare Metal: ECS Bare Metal Instance type</p>
     * <p>*   Super Computing Cluster: Super Computing Cluster (SCC) instance type</p>
     * <p>- High Performance Compute.</p>
     * <p>- Cloud Physical Server.</p>
     */
    @NameInMap("InstanceCategory")
    public String instanceCategory;

    /**
     * <p>The level of the instance family. Valid values:</p>
     * <br>
     * <p>*   EntryLevel: entry level (shared)</p>
     * <p>*   EnterpriseLevel: enterprise level</p>
     * <p>*   CreditEntryLevel: credit-based entry level</p>
     */
    @NameInMap("InstanceFamilyLevel")
    public String instanceFamilyLevel;

    @NameInMap("InstanceTypeFamilies")
    public java.util.List<String> instanceTypeFamilies;

    /**
     * <p>The instance family to which the instance type belongs. For information about the valid values of this parameter, see [DescribeInstanceTypeFamilies](~~25621~~).</p>
     * <br>
     * <p>For more information about instance families, see [Instance families](~~25378~~).</p>
     */
    @NameInMap("InstanceTypeFamily")
    public String instanceTypeFamily;

    /**
     * <p>Instance type N. Valid values of N: 1 to 10. If this parameter is left empty, information about all instance types is queried.</p>
     */
    @NameInMap("InstanceTypes")
    public java.util.List<String> instanceTypes;

    @NameInMap("LocalStorageCategories")
    public java.util.List<String> localStorageCategories;

    /**
     * <p>The category of local disks. For more information, see [Local disks](~~63138#section_n2w\_8yc\_5u1~~). Valid values:</p>
     * <br>
     * <p>*   local_hdd_pro: local Serial Advanced Technology Attachment (SATA) HDDs, which are used by d1ne or d1 instances</p>
     * <p>*   local_ssd_pro: local Non-Volatile Memory Express (NVMe) SSDs, which are used by i2, i2g, i1, ga1, or gn5 instances</p>
     */
    @NameInMap("LocalStorageCategory")
    public String localStorageCategory;

    /**
     * <p>The maximum number of entries to return on each page. Maximum value: 1600.</p>
     * <br>
     * <p>Default value: 1600.</p>
     */
    @NameInMap("MaxResults")
    public Long maxResults;

    /**
     * <p>The maximum number of vCPUs. The value must be a positive integer.</p>
     * <br>
     * <p>>  If an instance type has more vCPUs than the specified value, information about the instance type is not queried.</p>
     */
    @NameInMap("MaximumCpuCoreCount")
    public Integer maximumCpuCoreCount;

    /**
     * <p>The maximum clock speed.</p>
     * <br>
     * <p>>  If an instance type uses processors that have a higher clock speed than the specified value, information about the instance type is not queried.</p>
     */
    @NameInMap("MaximumCpuSpeedFrequency")
    public Float maximumCpuSpeedFrequency;

    /**
     * <p>The maximum turbo frequency.</p>
     * <br>
     * <p>>  If an instance type uses processors that deliver a higher turbo frequency than the specified value, information about the instance type is not queried.</p>
     */
    @NameInMap("MaximumCpuTurboFrequency")
    public Float maximumCpuTurboFrequency;

    /**
     * <p>The maximum number of GPUs. The value must be a positive integer.</p>
     * <br>
     * <p>>  If an instance type provides more GPUs than the specified value, information about the instance type is not queried.</p>
     */
    @NameInMap("MaximumGPUAmount")
    public Integer maximumGPUAmount;

    /**
     * <p>The maximum memory size. Unit: GiB.</p>
     * <br>
     * <p>>  If the memory size of an instance type is larger than the specified value, information about the instance type is not queried.</p>
     */
    @NameInMap("MaximumMemorySize")
    public Float maximumMemorySize;

    /**
     * <p>The minimum baseline CPU performance (overall baseline performance of all vCPUs) of a t5 or t6 burstable instance.</p>
     * <br>
     * <p>>  If a t5 or t6 instance type provides baseline CPU performance lower than the specified value, information about the instance type is not queried.</p>
     */
    @NameInMap("MinimumBaselineCredit")
    public Integer minimumBaselineCredit;

    /**
     * <p>The minimum number of vCPUs. The value must be a positive integer.</p>
     * <br>
     * <p>>  If an instance type has fewer vCPUs than the specified value, information about the instance type is not queried.</p>
     */
    @NameInMap("MinimumCpuCoreCount")
    public Integer minimumCpuCoreCount;

    /**
     * <p>The minimum clock speed.</p>
     * <br>
     * <p>>  If an instance type uses processors that have a lower clock speed than the specified value, information about the instance type is not queried.</p>
     */
    @NameInMap("MinimumCpuSpeedFrequency")
    public Float minimumCpuSpeedFrequency;

    /**
     * <p>The minimum turbo frequency.</p>
     * <br>
     * <p>>  If an instance type uses processors that deliver a lower turbo frequency than the specified value, information about the instance type is not queried.</p>
     */
    @NameInMap("MinimumCpuTurboFrequency")
    public Float minimumCpuTurboFrequency;

    /**
     * <p>The minimum number of cloud disks per instance.</p>
     * <br>
     * <p>>  If an instance type supports fewer cloud disks than the specified value, information about the instance type is not queried.</p>
     */
    @NameInMap("MinimumDiskQuantity")
    public Integer minimumDiskQuantity;

    /**
     * <p>The minimum number of IPv6 addresses per ENI.</p>
     * <br>
     * <p>>  If an instance type supports fewer IPv6 addresses per ENI than the specified value, information about the instance type is not queried.</p>
     */
    @NameInMap("MinimumEniIpv6AddressQuantity")
    public Integer minimumEniIpv6AddressQuantity;

    /**
     * <p>The minimum number of IPv4 addresses per ENI.</p>
     * <br>
     * <p>>  If an instance type supports fewer IPv4 addresses per ENI than the specified value, information about the instance type is not queried.</p>
     */
    @NameInMap("MinimumEniPrivateIpAddressQuantity")
    public Integer minimumEniPrivateIpAddressQuantity;

    /**
     * <p>The minimum number of elastic network interfaces (ENIs) per instance.</p>
     * <br>
     * <p>>  If an instance type supports fewer ENIs than the specified value, information about the instance type is not queried.</p>
     */
    @NameInMap("MinimumEniQuantity")
    public Integer minimumEniQuantity;

    /**
     * <p>The minimum number of ERIs per instance.</p>
     * <br>
     * <p>>  If an instance type supports fewer ERIs than the specified value, information about the instance type is not queried.</p>
     */
    @NameInMap("MinimumEriQuantity")
    public Integer minimumEriQuantity;

    /**
     * <p>The minimum number of GPUs. The value must be a positive integer.</p>
     * <br>
     * <p>>  If an instance type provides fewer GPUs than the specified value, information about the instance type is not queried.</p>
     */
    @NameInMap("MinimumGPUAmount")
    public Integer minimumGPUAmount;

    /**
     * <p>The minimum initial CPU credits of a t5 or t6 burstable instance.</p>
     * <br>
     * <p>>  If a t5 or t6 instance type provides less initial vCPU credits than the specified value, information about the instance type is not queried.</p>
     */
    @NameInMap("MinimumInitialCredit")
    public Integer minimumInitialCredit;

    /**
     * <p>The minimum inbound internal bandwidth. Unit: Kbit/s.</p>
     * <br>
     * <p>>  If an instance type provides an inbound internal bandwidth that is lower than the specified value, information about the instance type is not queried.</p>
     */
    @NameInMap("MinimumInstanceBandwidthRx")
    public Integer minimumInstanceBandwidthRx;

    /**
     * <p>The minimum outbound internal bandwidth. Unit: Kbit/s.</p>
     * <br>
     * <p>>  If an instance type provides an outbound internal bandwidth that is lower than the specified value, information about the instance type is not queried.</p>
     */
    @NameInMap("MinimumInstanceBandwidthTx")
    public Integer minimumInstanceBandwidthTx;

    /**
     * <p>The minimum inbound packet forwarding rate over the internal network. Unit: pps.</p>
     * <br>
     * <p>>  If an instance type provides an inbound packet forwarding rate over the internal network that is lower than the specified value, information about the instance type is not queried.</p>
     */
    @NameInMap("MinimumInstancePpsRx")
    public Long minimumInstancePpsRx;

    /**
     * <p>The minimum outbound packet forwarding rate over the internal network. Unit: pps.</p>
     * <br>
     * <p>>  If an instance type provides an outbound packet forwarding rate over the internal network that is lower than the specified value, information about the instance type is not queried.</p>
     */
    @NameInMap("MinimumInstancePpsTx")
    public Long minimumInstancePpsTx;

    /**
     * <p>The minimum number of local disks per instance.</p>
     * <br>
     * <p>>  If an instance type supports fewer local disks than the specified value, information about the instance type is not queried.</p>
     */
    @NameInMap("MinimumLocalStorageAmount")
    public Integer minimumLocalStorageAmount;

    /**
     * <p>The capacity of each local disk attached per instance. Unit: GiB.</p>
     */
    @NameInMap("MinimumLocalStorageCapacity")
    public Long minimumLocalStorageCapacity;

    /**
     * <p>The minimum memory size. Unit: GiB.</p>
     * <br>
     * <p>>  If the memory size of an instance type is smaller than the specified value, information about the instance type is not queried.</p>
     */
    @NameInMap("MinimumMemorySize")
    public Float minimumMemorySize;

    /**
     * <p>The minimum default number of queues per primary network interface controller (NIC).</p>
     * <br>
     * <p>>  If an instance type supports fewer queues per primary NIC than the specified value, information about the instance type is not queried.</p>
     */
    @NameInMap("MinimumPrimaryEniQueueNumber")
    public Integer minimumPrimaryEniQueueNumber;

    /**
     * <p>The minimum number of queue pair (QP) queues per elastic RDMA interface (ERI).</p>
     * <br>
     * <p>>  If an instance type supports fewer QP queues per ERI than the specified value, information about the instance type is not queried.</p>
     */
    @NameInMap("MinimumQueuePairNumber")
    public Integer minimumQueuePairNumber;

    /**
     * <p>The minimum default number of queues per secondary NIC.</p>
     * <br>
     * <p>>  If an instance type supports fewer queues per secondary NIC than the specified value, information about the instance type is not queried.</p>
     */
    @NameInMap("MinimumSecondaryEniQueueNumber")
    public Integer minimumSecondaryEniQueueNumber;

    /**
     * <p>The query token. Set the value to the NextToken value returned in the previous call to the DescribeInstanceTypes operation. You do not need to specify this parameter for the first request.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>Specifies whether cloud disks can be attached by using the NVMe protocol. Valid values:</p>
     * <br>
     * <p>*   required: The cloud disk can be attached by using the NVMe protocol.</p>
     * <p>*   unsupported: The cloud disk cannot be attached by using the NVMe protocol.</p>
     */
    @NameInMap("NvmeSupport")
    public String nvmeSupport;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The CPU model.</p>
     * <br>
     * <p>>  Fuzzy match is supported. For example, if an instance type uses Intel Xeon (Ice Lake) Platinum 8369B processors and you set this parameter to Intel, information about the instance type is queried.</p>
     */
    @NameInMap("PhysicalProcessorModel")
    public String physicalProcessorModel;

    @NameInMap("PhysicalProcessorModels")
    public java.util.List<String> physicalProcessorModels;

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

    public DescribeInstanceTypesRequest setCpuArchitectures(java.util.List<String> cpuArchitectures) {
        this.cpuArchitectures = cpuArchitectures;
        return this;
    }
    public java.util.List<String> getCpuArchitectures() {
        return this.cpuArchitectures;
    }

    public DescribeInstanceTypesRequest setGPUSpec(String GPUSpec) {
        this.GPUSpec = GPUSpec;
        return this;
    }
    public String getGPUSpec() {
        return this.GPUSpec;
    }

    public DescribeInstanceTypesRequest setGpuSpecs(java.util.List<String> gpuSpecs) {
        this.gpuSpecs = gpuSpecs;
        return this;
    }
    public java.util.List<String> getGpuSpecs() {
        return this.gpuSpecs;
    }

    public DescribeInstanceTypesRequest setInstanceCategories(java.util.List<String> instanceCategories) {
        this.instanceCategories = instanceCategories;
        return this;
    }
    public java.util.List<String> getInstanceCategories() {
        return this.instanceCategories;
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

    public DescribeInstanceTypesRequest setInstanceTypeFamilies(java.util.List<String> instanceTypeFamilies) {
        this.instanceTypeFamilies = instanceTypeFamilies;
        return this;
    }
    public java.util.List<String> getInstanceTypeFamilies() {
        return this.instanceTypeFamilies;
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

    public DescribeInstanceTypesRequest setLocalStorageCategories(java.util.List<String> localStorageCategories) {
        this.localStorageCategories = localStorageCategories;
        return this;
    }
    public java.util.List<String> getLocalStorageCategories() {
        return this.localStorageCategories;
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

    public DescribeInstanceTypesRequest setPhysicalProcessorModels(java.util.List<String> physicalProcessorModels) {
        this.physicalProcessorModels = physicalProcessorModels;
        return this;
    }
    public java.util.List<String> getPhysicalProcessorModels() {
        return this.physicalProcessorModels;
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
