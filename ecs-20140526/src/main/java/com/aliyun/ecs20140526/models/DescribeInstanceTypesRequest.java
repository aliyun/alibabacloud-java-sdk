// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeInstanceTypesRequest extends TeaModel {
    /**
     * <p>The list of advanced features to return for instance types.</p>
     */
    @NameInMap("AdditionalAttributes")
    public java.util.List<String> additionalAttributes;

    /**
     * <p>The CPU architecture. Valid values:</p>
     * <ul>
     * <li>X86.</li>
     * <li>ARM.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>X86</p>
     */
    @NameInMap("CpuArchitecture")
    public String cpuArchitecture;

    /**
     * <p>The specified CPU architectures to query. Array length: 1 to 2.</p>
     */
    @NameInMap("CpuArchitectures")
    public java.util.List<String> cpuArchitectures;

    /**
     * <p>The GPU type.</p>
     * <blockquote>
     * <p>Fuzzy matching is supported. For example, if the GPU type of an instance type is NVIDIA V100, you can enter NVIDIA to query information about that instance type.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>NVIDIA V100</p>
     */
    @NameInMap("GPUSpec")
    public String GPUSpec;

    /**
     * <p>The specified GPU types to query. Array length: 1 to 10.</p>
     */
    @NameInMap("GpuSpecs")
    public java.util.List<String> gpuSpecs;

    /**
     * <p>The specified instance type categories to query. Array length: 1 to 10.</p>
     */
    @NameInMap("InstanceCategories")
    public java.util.List<String> instanceCategories;

    /**
     * <p>The categorization of the instance type. Valid values:</p>
     * <ul>
     * <li>General-purpose: general-purpose.</li>
     * <li>Compute-optimized: compute-optimized.</li>
     * <li>Memory-optimized: memory-optimized.</li>
     * <li>Big data: big data.</li>
     * <li>Local SSDs: instance families with local SSDs.</li>
     * <li>High Clock Speed: high frequency.</li>
     * <li>Enhanced: enhanced instance families.</li>
     * <li>Shared: shared.</li>
     * <li>Compute-optimized with GPU: GPU computing.</li>
     * <li>Visual Compute-optimized: visual compute-optimized.</li>
     * <li>Heterogeneous Service: heterogeneous service.</li>
     * <li>Compute-optimized with FPGA: FPGA-accelerated compute-optimized.</li>
     * <li>Compute-optimized with NPU: NPU compute-optimized.</li>
     * <li>ECS Bare Metal: ECS Bare Metal server.</li>
     * <li>Super Computing Cluster: Super Computing Cluster (SCC).</li>
     * <li>High Performance Compute: high-performance computing (HPC).</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Big data</p>
     */
    @NameInMap("InstanceCategory")
    public String instanceCategory;

    /**
     * <p>The level of the instance family. Valid values:</p>
     * <ul>
     * <li>EntryLevel: entry level (shared).</li>
     * <li>EnterpriseLevel: enterprise level.</li>
     * <li>CreditEntryLevel: credit-based entry level.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>EntryLevel</p>
     */
    @NameInMap("InstanceFamilyLevel")
    public String instanceFamilyLevel;

    /**
     * <p>The specified instance families to query. Array length: 1 to 10.</p>
     */
    @NameInMap("InstanceTypeFamilies")
    public java.util.List<String> instanceTypeFamilies;

    /**
     * <p>The instance family to which the instance type belongs. For more information about valid values, see <a href="https://help.aliyun.com/document_detail/25621.html">DescribeInstanceTypeFamilies</a>.</p>
     * <p>For more information about instance families, see <a href="https://help.aliyun.com/document_detail/25378.html">Instance families</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>ecs.g6</p>
     */
    @NameInMap("InstanceTypeFamily")
    public String instanceTypeFamily;

    /**
     * <p>The specified instance types. Array length: 1 to 10. If this parameter is not specified, information about all instance types is queried by default.</p>
     * 
     * <strong>example:</strong>
     * <p>ecs.g6.large</p>
     */
    @NameInMap("InstanceTypes")
    public java.util.List<String> instanceTypes;

    /**
     * <p>The specified local disk categories. Array length: 1 to 2.</p>
     */
    @NameInMap("LocalStorageCategories")
    public java.util.List<String> localStorageCategories;

    /**
     * <p>The category of local disks. For more information, see <a href="~~63138#section_n2w_8yc_5u1~~">Local disks</a>. Valid values:</p>
     * <ul>
     * <li>local_hdd_pro: SATA HDDs used by the d1ne and d1 instance families.</li>
     * <li>local_ssd_pro: NVMe SSDs used by the i2, i2g, i1, ga1, and gn5 instance families.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>local_ssd_pro</p>
     */
    @NameInMap("LocalStorageCategory")
    public String localStorageCategory;

    /**
     * <p>The maximum number of entries per page for paging. Maximum value: 1600.</p>
     * <p>Default value: 1600.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     * 
     * <strong>if can be null:</strong>
     * <p>false</p>
     */
    @NameInMap("MaxResults")
    public Long maxResults;

    /**
     * <p>The expected maximum number of vCPU cores when querying instance types. Valid values: positive integers.</p>
     * <blockquote>
     * <p>If the number of vCPU cores of a queried instance type is greater than the specified value, the system does not return information about that instance type.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaximumCpuCoreCount")
    public Integer maximumCpuCoreCount;

    /**
     * <p>The expected maximum clock speed when querying instance types.</p>
     * <blockquote>
     * <p>If the clock speed of a queried instance type is greater than the specified value, the system does not return information about that instance type.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>3.2</p>
     */
    @NameInMap("MaximumCpuSpeedFrequency")
    public Float maximumCpuSpeedFrequency;

    /**
     * <p>The expected maximum turbo frequency when querying instance types.</p>
     * <blockquote>
     * <p>If the turbo frequency of a queried instance type is greater than the specified value, the system does not return information about that instance type.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>4.1</p>
     */
    @NameInMap("MaximumCpuTurboFrequency")
    public Float maximumCpuTurboFrequency;

    /**
     * <p>The expected maximum number of GPUs when querying instance types. Valid values: positive integers.</p>
     * <blockquote>
     * <p>If the number of GPUs of a queried instance type is greater than the specified value, the system does not return information about that instance type.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaximumGPUAmount")
    public Integer maximumGPUAmount;

    /**
     * <p>The expected maximum memory size when querying instance types. Unit: GiB.</p>
     * <blockquote>
     * <p>If the memory size of a queried instance type is greater than the specified value, the system does not return information about that instance type.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("MaximumMemorySize")
    public Float maximumMemorySize;

    /**
     * <p>The expected minimum baseline vCPU computing performance (sum of all vCPUs) of burstable instances t5 and t6 when querying instance types.</p>
     * <blockquote>
     * <p>If the baseline vCPU computing performance (sum of all vCPUs) of burstable instances t5 and t6 of a queried instance type is less than the specified value, the system does not return information about that instance type.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>12</p>
     */
    @NameInMap("MinimumBaselineCredit")
    public Integer minimumBaselineCredit;

    /**
     * <p>The expected minimum number of vCPU cores when querying instance types. Valid values: positive integers.</p>
     * <blockquote>
     * <p>If the number of vCPU cores of a queried instance type is less than the specified value, the system does not return information about that instance type.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("MinimumCpuCoreCount")
    public Integer minimumCpuCoreCount;

    /**
     * <p>The expected minimum clock speed when querying instance types.</p>
     * <blockquote>
     * <p>If the clock speed of a queried instance type is less than the specified value, the system does not return information about that instance type.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2.5</p>
     */
    @NameInMap("MinimumCpuSpeedFrequency")
    public Float minimumCpuSpeedFrequency;

    /**
     * <p>The expected minimum turbo frequency when querying instance types.</p>
     * <blockquote>
     * <p>If the turbo frequency of a queried instance type is less than the specified value, the system does not return information about that instance type.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>3.2</p>
     */
    @NameInMap("MinimumCpuTurboFrequency")
    public Float minimumCpuTurboFrequency;

    /**
     * <p>The expected minimum number of cloud disks that can be attached when querying instance types.</p>
     * <blockquote>
     * <p>If the maximum number of cloud disks that can be attached to a queried instance type is less than the specified value, the system does not return information about that instance type.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("MinimumDiskQuantity")
    public Integer minimumDiskQuantity;

    /**
     * <p>The expected minimum number of IPv6 addresses per network interface controller (NIC) when querying instance types.</p>
     * <blockquote>
     * <p>If the maximum number of IPv6 addresses per network interface controller (NIC) of a queried instance type is less than the specified value, the system does not return information about that instance type.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("MinimumEniIpv6AddressQuantity")
    public Integer minimumEniIpv6AddressQuantity;

    /**
     * <p>The expected minimum number of IPv4 addresses per network interface controller (NIC) when querying instance types.</p>
     * <blockquote>
     * <p>If the maximum number of IPv4 addresses per network interface controller (NIC) of a queried instance type is less than the specified value, the system does not return information about that instance type.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("MinimumEniPrivateIpAddressQuantity")
    public Integer minimumEniPrivateIpAddressQuantity;

    /**
     * <p>The expected minimum number of Elastic Network Interfaces (ENIs) that can be attached when querying instance types.</p>
     * <blockquote>
     * <p>If the maximum number of network interface controllers (NICs) that can be attached to a queried instance type is less than the specified value, the system does not return information about that instance type.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("MinimumEniQuantity")
    public Integer minimumEniQuantity;

    /**
     * <p>The expected minimum number of Elastic RDMA Interfaces (ERIs) when querying instance types.</p>
     * <blockquote>
     * <p>If the number of Elastic RDMA Interfaces (ERIs) of a queried instance type is less than the specified value, the system does not return information about that instance type.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("MinimumEriQuantity")
    public Integer minimumEriQuantity;

    /**
     * <p>The expected minimum number of GPUs when querying instance types. Valid values: positive integers.</p>
     * <blockquote>
     * <p>If the number of GPUs of a queried instance type is less than the specified value, the system does not return information about that instance type.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("MinimumGPUAmount")
    public Integer minimumGPUAmount;

    /**
     * <p>The expected minimum initial vCPU CPU credits value of burstable instances t5 and t6 when querying instance types.</p>
     * <blockquote>
     * <p>If the initial vCPU CPU credits value of burstable instances t5 and t6 of a queried instance type is less than the specified value, the system does not return information about that instance type.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>12</p>
     */
    @NameInMap("MinimumInitialCredit")
    public Integer minimumInitialCredit;

    /**
     * <p>The expected minimum inbound internal bandwidth when querying instance types. Unit: kbit/s.</p>
     * <blockquote>
     * <p>If the inbound internal bandwidth of a queried instance type is less than the specified value, the system does not return information about that instance type.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>12288</p>
     */
    @NameInMap("MinimumInstanceBandwidthRx")
    public Integer minimumInstanceBandwidthRx;

    /**
     * <p>The expected minimum outbound internal bandwidth when querying instance types. Unit: kbit/s.</p>
     * <blockquote>
     * <p>If the outbound internal bandwidth of a queried instance type is less than the specified value, the system does not return information about that instance type.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>12288</p>
     */
    @NameInMap("MinimumInstanceBandwidthTx")
    public Integer minimumInstanceBandwidthTx;

    /**
     * <p>The expected minimum inbound packet forwarding rate over the internal network when querying instance types. Unit: pps.</p>
     * <blockquote>
     * <p>If the inbound packet forwarding rate over the internal network of a queried instance type is less than the specified value, the system does not return information about that instance type.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>15</p>
     */
    @NameInMap("MinimumInstancePpsRx")
    public Long minimumInstancePpsRx;

    /**
     * <p>The expected minimum outbound packet forwarding rate over the internal network when querying instance types. Unit: pps.</p>
     * <blockquote>
     * <p>If the outbound packet forwarding rate over the internal network of a queried instance type is less than the specified value, the system does not return information about that instance type.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>15</p>
     */
    @NameInMap("MinimumInstancePpsTx")
    public Long minimumInstancePpsTx;

    /**
     * <p>The expected minimum number of local disks attached to the instance when querying instance types.</p>
     * <blockquote>
     * <p>If the number of local disks attached to a queried instance type is less than the specified value, the system does not return information about that instance type.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("MinimumLocalStorageAmount")
    public Integer minimumLocalStorageAmount;

    /**
     * <p>The capacity of a single local disk attached to the instance. Unit: GiB.</p>
     * 
     * <strong>example:</strong>
     * <p>40</p>
     */
    @NameInMap("MinimumLocalStorageCapacity")
    public Long minimumLocalStorageCapacity;

    /**
     * <p>The expected minimum memory size when querying instance types. Unit: GiB.</p>
     * <blockquote>
     * <p>If the memory size of a queried instance type is less than the specified value, the system does not return information about that instance type.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MinimumMemorySize")
    public Float minimumMemorySize;

    /**
     * <p>The expected minimum default queue number of the primary ENI when querying instance types.</p>
     * <blockquote>
     * <p>If the default queue number of the primary ENI of a queried instance type is less than the specified value, the system does not return information about that instance type.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>8</p>
     */
    @NameInMap("MinimumPrimaryEniQueueNumber")
    public Integer minimumPrimaryEniQueueNumber;

    /**
     * <p>The expected minimum number of QueuePair (QP) queues per Elastic RDMA Interface (ERI) when querying instance types.</p>
     * <blockquote>
     * <p>If the maximum number of QP queues per ERI of a queried instance type is less than the specified value, the system does not return information about that instance type.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>8</p>
     */
    @NameInMap("MinimumQueuePairNumber")
    public Integer minimumQueuePairNumber;

    /**
     * <p>The expected minimum default queue number of secondary Elastic Network Interfaces (ENIs) when querying instance types.</p>
     * <blockquote>
     * <p>If the default queue number of secondary network interface controllers (NICs) of a queried instance type is less than the specified value, the system does not return information about that instance type.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("MinimumSecondaryEniQueueNumber")
    public Integer minimumSecondaryEniQueueNumber;

    /**
     * <p>The pagination token. Set this parameter to the NextToken value returned in the previous call. You do not need to set this parameter for the first request.</p>
     * 
     * <strong>example:</strong>
     * <p>e71d8a535bd9cc11</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>Specifies whether the cloud disks attached to the instance type support NVMe. Valid values:</p>
     * <ul>
     * <li>required: Supported. Cloud disks are attached in NVMe mode.</li>
     * <li>unsupported: Not supported. Cloud disks are not attached in NVMe mode.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>required</p>
     */
    @NameInMap("NvmeSupport")
    public String nvmeSupport;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The processor model.</p>
     * <blockquote>
     * <p>Fuzzy matching is supported. For example, if the processor model of an instance type is Intel Xeon(Ice Lake) Platinum 8369B, you can enter Intel to query information about that instance type.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Intel Xeon(Ice Lake) Platinum 8369B</p>
     */
    @NameInMap("PhysicalProcessorModel")
    public String physicalProcessorModel;

    /**
     * <p>The specified processor models to query. Array length: 1 to 10.</p>
     */
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

    public DescribeInstanceTypesRequest setAdditionalAttributes(java.util.List<String> additionalAttributes) {
        this.additionalAttributes = additionalAttributes;
        return this;
    }
    public java.util.List<String> getAdditionalAttributes() {
        return this.additionalAttributes;
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
