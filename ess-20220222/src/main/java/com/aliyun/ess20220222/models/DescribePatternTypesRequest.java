// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class DescribePatternTypesRequest extends TeaModel {
    /**
     * <p>The architecture type of the instance type. Valid values:</p>
     * <ul>
     * <li>X86: x86 computing</li>
     * <li>Heterogeneous: heterogeneous computing, such as GPU or FPGA</li>
     * <li>BareMental: Elastic Compute Service Bare Metal Server</li>
     * <li>Arm: Arm computing</li>
     * </ul>
     * <p>Default value: all architecture types.</p>
     */
    @NameInMap("Architecture")
    public java.util.List<String> architecture;

    /**
     * <p>Specifies whether the instance type is a burstable instance type. Valid values:</p>
     * <ul>
     * <li>Exclude: Burstable instance types are excluded.</li>
     * <li>Include: Burstable instance types are included.</li>
     * <li>Required: Only burstable instance types are included.</li>
     * </ul>
     * <p>Default value: Include.</p>
     * 
     * <strong>example:</strong>
     * <p>Include</p>
     */
    @NameInMap("BurstablePerformance")
    public String burstablePerformance;

    /**
     * <p>The channel ID. This parameter is reserved for internal use.</p>
     * 
     * <strong>example:</strong>
     * <p>79425074</p>
     */
    @NameInMap("ChannelId")
    public Long channelId;

    /**
     * <p>The number of vCPUs for the instance type.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("Cores")
    public Integer cores;

    /**
     * <p>The number of vCPUs for the instance type. You can specify multiple values.</p>
     */
    @NameInMap("CoresList")
    public java.util.List<Integer> coresList;

    /**
     * <p>The CPU architecture of the instance type. Valid values:</p>
     * <blockquote>
     * <p>N specifies the number of CPU architectures that you can set. Valid values of N: 1 to 2.</p>
     * </blockquote>
     * <ul>
     * <li>X86</li>
     * <li>ARM</li>
     * </ul>
     */
    @NameInMap("CpuArchitectures")
    public java.util.List<String> cpuArchitectures;

    @NameInMap("ExcludedInstanceType")
    public java.util.List<String> excludedInstanceType;

    /**
     * <p>The GPU type.</p>
     */
    @NameInMap("GpuSpecs")
    public java.util.List<String> gpuSpecs;

    /**
     * <p>The categorization of the instance type. Valid values:</p>
     * <ul>
     * <li>General-purpose: general-purpose</li>
     * <li>Compute-optimized: compute-optimized</li>
     * <li>Memory-optimized: memory-optimized</li>
     * <li>Big data: big data</li>
     * <li>Local SSDs: local SSD</li>
     * <li>High Clock Speed: high frequency</li>
     * <li>Enhanced: enhanced</li>
     * <li>Shared: shared</li>
     * <li>Compute-optimized with GPU: GPU-accelerated compute-optimized</li>
     * <li>Visual Compute-optimized: visual compute-optimized</li>
     * <li>Heterogeneous Service: heterogeneous service</li>
     * <li>Compute-optimized with FPGA: FPGA-accelerated compute-optimized</li>
     * <li>Compute-optimized with NPU: NPU-accelerated compute-optimized</li>
     * <li>ECS Bare Metal: Elastic Compute Service Bare Metal Server</li>
     * <li>High Performance Compute: high-performance computing (HPC)</li>
     * </ul>
     */
    @NameInMap("InstanceCategories")
    public java.util.List<String> instanceCategories;

    /**
     * <p>The level of the instance family. Valid values:</p>
     * <ul>
     * <li>EntryLevel: Entry-level instance family.</li>
     * <li>EnterpriseLevel: Enterprise-level instance family.</li>
     * <li>CreditEntryLevel: Credit entry-level instance family. For more information, see <a href="https://help.aliyun.com/document_detail/59977.html">Burstable instances</a>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>EnterpriseLevel</p>
     */
    @NameInMap("InstanceFamilyLevel")
    public String instanceFamilyLevel;

    /**
     * <p>The instance families to be queried. N specifies the number of instance families that you can set. Valid values of N: 1 to 10.</p>
     */
    @NameInMap("InstanceTypeFamilies")
    public java.util.List<String> instanceTypeFamilies;

    /**
     * <p>The maximum acceptable hourly price for the pay-as-you-go or spot instance.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("MaxPrice")
    public Float maxPrice;

    /**
     * <p>The maximum number of vCPUs for the instance type.</p>
     * 
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("MaximumCpuCoreCount")
    public Integer maximumCpuCoreCount;

    /**
     * <p>The maximum number of GPUs for the instance. Valid values: positive integers.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("MaximumGpuAmount")
    public Integer maximumGpuAmount;

    /**
     * <p>The maximum memory size of the instance. Unit: GiB.</p>
     * 
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("MaximumMemorySize")
    public Float maximumMemorySize;

    /**
     * <p>The memory size of the instance type. Unit: GiB.</p>
     * 
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("Memory")
    public Float memory;

    /**
     * <p>The memory size of the instance type. Unit: GiB. You can specify multiple values.</p>
     */
    @NameInMap("MemoryList")
    public java.util.List<Float> memoryList;

    /**
     * <p>The minimum baseline vCPU computing performance (sum of all vCPUs) for burstable instances of the t5 and t6 instance types.</p>
     * 
     * <strong>example:</strong>
     * <p>12</p>
     */
    @NameInMap("MinimumBaselineCredit")
    public Integer minimumBaselineCredit;

    /**
     * <p>The minimum number of vCPUs for the instance type.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("MinimumCpuCoreCount")
    public Integer minimumCpuCoreCount;

    /**
     * <p>The minimum upper limit on the number of IPv6 addresses per elastic network interface controller (NIC) for the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("MinimumEniIpv6AddressQuantity")
    public Integer minimumEniIpv6AddressQuantity;

    /**
     * <p>The minimum upper limit on the number of IPv4 addresses per elastic network interface controller (NIC) for the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("MinimumEniPrivateIpAddressQuantity")
    public Integer minimumEniPrivateIpAddressQuantity;

    /**
     * <p>The minimum upper limit on the number of elastic network interfaces (ENIs) that can be bound to the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("MinimumEniQuantity")
    public Integer minimumEniQuantity;

    /**
     * <p>The minimum number of GPUs for the instance. Valid values: positive integers.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("MinimumGpuAmount")
    public Integer minimumGpuAmount;

    /**
     * <p>The minimum initial vCPU credit for burstable instances of the t5 and t6 instance types.</p>
     * 
     * <strong>example:</strong>
     * <p>12</p>
     */
    @NameInMap("MinimumInitialCredit")
    public Integer minimumInitialCredit;

    /**
     * <p>The minimum memory size of the instance. Unit: GiB.</p>
     * 
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("MinimumMemorySize")
    public Float minimumMemorySize;

    /**
     * <p>The processor model of the instance. N specifies the number of processor models that you can set. Valid values of N: 1 to 10.</p>
     */
    @NameInMap("PhysicalProcessorModels")
    public java.util.List<String> physicalProcessorModels;

    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The preemption policy for the pay-as-you-go instance. Valid values:</p>
     * <ul>
     * <li>NoSpot: regular pay-as-you-go instance</li>
     * <li>SpotWithPriceLimit: spot instance with a maximum price limit</li>
     * <li>SpotAsPriceGo: spot instance whose price is automatically offered by the system based on the current market price</li>
     * </ul>
     * <p>Default value: NoSpot.</p>
     * 
     * <strong>example:</strong>
     * <p>NoSpot</p>
     */
    @NameInMap("SpotStrategy")
    public String spotStrategy;

    /**
     * <p>The list of vSwitch IDs. You must specify at least one of VSwitchId and ZoneId.</p>
     */
    @NameInMap("VSwitchId")
    public java.util.List<String> vSwitchId;

    /**
     * <p>The list of zone IDs. This parameter is invalid if a vSwitch ID is specified. You must specify at least one of VSwitchId and ZoneId.</p>
     */
    @NameInMap("ZoneId")
    public java.util.List<String> zoneId;

    public static DescribePatternTypesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribePatternTypesRequest self = new DescribePatternTypesRequest();
        return TeaModel.build(map, self);
    }

    public DescribePatternTypesRequest setArchitecture(java.util.List<String> architecture) {
        this.architecture = architecture;
        return this;
    }
    public java.util.List<String> getArchitecture() {
        return this.architecture;
    }

    public DescribePatternTypesRequest setBurstablePerformance(String burstablePerformance) {
        this.burstablePerformance = burstablePerformance;
        return this;
    }
    public String getBurstablePerformance() {
        return this.burstablePerformance;
    }

    public DescribePatternTypesRequest setChannelId(Long channelId) {
        this.channelId = channelId;
        return this;
    }
    public Long getChannelId() {
        return this.channelId;
    }

    public DescribePatternTypesRequest setCores(Integer cores) {
        this.cores = cores;
        return this;
    }
    public Integer getCores() {
        return this.cores;
    }

    public DescribePatternTypesRequest setCoresList(java.util.List<Integer> coresList) {
        this.coresList = coresList;
        return this;
    }
    public java.util.List<Integer> getCoresList() {
        return this.coresList;
    }

    public DescribePatternTypesRequest setCpuArchitectures(java.util.List<String> cpuArchitectures) {
        this.cpuArchitectures = cpuArchitectures;
        return this;
    }
    public java.util.List<String> getCpuArchitectures() {
        return this.cpuArchitectures;
    }

    public DescribePatternTypesRequest setExcludedInstanceType(java.util.List<String> excludedInstanceType) {
        this.excludedInstanceType = excludedInstanceType;
        return this;
    }
    public java.util.List<String> getExcludedInstanceType() {
        return this.excludedInstanceType;
    }

    public DescribePatternTypesRequest setGpuSpecs(java.util.List<String> gpuSpecs) {
        this.gpuSpecs = gpuSpecs;
        return this;
    }
    public java.util.List<String> getGpuSpecs() {
        return this.gpuSpecs;
    }

    public DescribePatternTypesRequest setInstanceCategories(java.util.List<String> instanceCategories) {
        this.instanceCategories = instanceCategories;
        return this;
    }
    public java.util.List<String> getInstanceCategories() {
        return this.instanceCategories;
    }

    public DescribePatternTypesRequest setInstanceFamilyLevel(String instanceFamilyLevel) {
        this.instanceFamilyLevel = instanceFamilyLevel;
        return this;
    }
    public String getInstanceFamilyLevel() {
        return this.instanceFamilyLevel;
    }

    public DescribePatternTypesRequest setInstanceTypeFamilies(java.util.List<String> instanceTypeFamilies) {
        this.instanceTypeFamilies = instanceTypeFamilies;
        return this;
    }
    public java.util.List<String> getInstanceTypeFamilies() {
        return this.instanceTypeFamilies;
    }

    public DescribePatternTypesRequest setMaxPrice(Float maxPrice) {
        this.maxPrice = maxPrice;
        return this;
    }
    public Float getMaxPrice() {
        return this.maxPrice;
    }

    public DescribePatternTypesRequest setMaximumCpuCoreCount(Integer maximumCpuCoreCount) {
        this.maximumCpuCoreCount = maximumCpuCoreCount;
        return this;
    }
    public Integer getMaximumCpuCoreCount() {
        return this.maximumCpuCoreCount;
    }

    public DescribePatternTypesRequest setMaximumGpuAmount(Integer maximumGpuAmount) {
        this.maximumGpuAmount = maximumGpuAmount;
        return this;
    }
    public Integer getMaximumGpuAmount() {
        return this.maximumGpuAmount;
    }

    public DescribePatternTypesRequest setMaximumMemorySize(Float maximumMemorySize) {
        this.maximumMemorySize = maximumMemorySize;
        return this;
    }
    public Float getMaximumMemorySize() {
        return this.maximumMemorySize;
    }

    public DescribePatternTypesRequest setMemory(Float memory) {
        this.memory = memory;
        return this;
    }
    public Float getMemory() {
        return this.memory;
    }

    public DescribePatternTypesRequest setMemoryList(java.util.List<Float> memoryList) {
        this.memoryList = memoryList;
        return this;
    }
    public java.util.List<Float> getMemoryList() {
        return this.memoryList;
    }

    public DescribePatternTypesRequest setMinimumBaselineCredit(Integer minimumBaselineCredit) {
        this.minimumBaselineCredit = minimumBaselineCredit;
        return this;
    }
    public Integer getMinimumBaselineCredit() {
        return this.minimumBaselineCredit;
    }

    public DescribePatternTypesRequest setMinimumCpuCoreCount(Integer minimumCpuCoreCount) {
        this.minimumCpuCoreCount = minimumCpuCoreCount;
        return this;
    }
    public Integer getMinimumCpuCoreCount() {
        return this.minimumCpuCoreCount;
    }

    public DescribePatternTypesRequest setMinimumEniIpv6AddressQuantity(Integer minimumEniIpv6AddressQuantity) {
        this.minimumEniIpv6AddressQuantity = minimumEniIpv6AddressQuantity;
        return this;
    }
    public Integer getMinimumEniIpv6AddressQuantity() {
        return this.minimumEniIpv6AddressQuantity;
    }

    public DescribePatternTypesRequest setMinimumEniPrivateIpAddressQuantity(Integer minimumEniPrivateIpAddressQuantity) {
        this.minimumEniPrivateIpAddressQuantity = minimumEniPrivateIpAddressQuantity;
        return this;
    }
    public Integer getMinimumEniPrivateIpAddressQuantity() {
        return this.minimumEniPrivateIpAddressQuantity;
    }

    public DescribePatternTypesRequest setMinimumEniQuantity(Integer minimumEniQuantity) {
        this.minimumEniQuantity = minimumEniQuantity;
        return this;
    }
    public Integer getMinimumEniQuantity() {
        return this.minimumEniQuantity;
    }

    public DescribePatternTypesRequest setMinimumGpuAmount(Integer minimumGpuAmount) {
        this.minimumGpuAmount = minimumGpuAmount;
        return this;
    }
    public Integer getMinimumGpuAmount() {
        return this.minimumGpuAmount;
    }

    public DescribePatternTypesRequest setMinimumInitialCredit(Integer minimumInitialCredit) {
        this.minimumInitialCredit = minimumInitialCredit;
        return this;
    }
    public Integer getMinimumInitialCredit() {
        return this.minimumInitialCredit;
    }

    public DescribePatternTypesRequest setMinimumMemorySize(Float minimumMemorySize) {
        this.minimumMemorySize = minimumMemorySize;
        return this;
    }
    public Float getMinimumMemorySize() {
        return this.minimumMemorySize;
    }

    public DescribePatternTypesRequest setPhysicalProcessorModels(java.util.List<String> physicalProcessorModels) {
        this.physicalProcessorModels = physicalProcessorModels;
        return this;
    }
    public java.util.List<String> getPhysicalProcessorModels() {
        return this.physicalProcessorModels;
    }

    public DescribePatternTypesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribePatternTypesRequest setSpotStrategy(String spotStrategy) {
        this.spotStrategy = spotStrategy;
        return this;
    }
    public String getSpotStrategy() {
        return this.spotStrategy;
    }

    public DescribePatternTypesRequest setVSwitchId(java.util.List<String> vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public java.util.List<String> getVSwitchId() {
        return this.vSwitchId;
    }

    public DescribePatternTypesRequest setZoneId(java.util.List<String> zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public java.util.List<String> getZoneId() {
        return this.zoneId;
    }

}
