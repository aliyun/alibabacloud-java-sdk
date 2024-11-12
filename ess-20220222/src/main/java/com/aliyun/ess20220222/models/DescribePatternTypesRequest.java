// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class DescribePatternTypesRequest extends TeaModel {
    /**
     * <p>The architectures of instance types. Valid values:</p>
     * <ul>
     * <li>X86: x86</li>
     * <li>Heterogeneous: heterogeneous computing, such as GPU-accelerated or FPGA-accelerated</li>
     * <li>BareMetal: ECS Bare Metal Instance</li>
     * <li>Arm: Arm</li>
     * <li>SuperComputeCluster: Super Computing Cluster</li>
     * </ul>
     * <p>By default, all values are selected.</p>
     */
    @NameInMap("Architecture")
    public java.util.List<String> architecture;

    /**
     * <p>Specifies whether to include burstable instance types. Valid values:</p>
     * <ul>
     * <li>Exclude: does not include burstable instance types.</li>
     * <li>Include: includes burstable instance types.</li>
     * <li>Required: includes only burstable instance types.</li>
     * </ul>
     * <p>Default value: Include.</p>
     * 
     * <strong>example:</strong>
     * <p>Include</p>
     */
    @NameInMap("BurstablePerformance")
    public String burstablePerformance;

    /**
     * <p>The channel ID. This parameter is not for public use.</p>
     * 
     * <strong>example:</strong>
     * <p>79425074</p>
     */
    @NameInMap("ChannelId")
    public Long channelId;

    /**
     * <p>The number of vCPUs that you want to assign to the instance type.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("Cores")
    public Integer cores;

    /**
     * <p>The number of vCPUs that you want to assign to the instance type. You can specify multiple vCPUs.</p>
     */
    @NameInMap("CoresList")
    public java.util.List<Integer> coresList;

    /**
     * <p>The CPU architectures of the instance types. Valid values:</p>
     * <blockquote>
     * <p> You can specify 1 to 2 CPU architectures.</p>
     * </blockquote>
     * <ul>
     * <li>x86</li>
     * <li>Arm</li>
     * </ul>
     */
    @NameInMap("CpuArchitectures")
    public java.util.List<String> cpuArchitectures;

    @NameInMap("ExcludedInstanceType")
    public java.util.List<String> excludedInstanceType;

    /**
     * <p>The GPU models.</p>
     */
    @NameInMap("GpuSpecs")
    public java.util.List<String> gpuSpecs;

    /**
     * <p>The categories of the instance types. Valid values:</p>
     * <ul>
     * <li>General-purpose</li>
     * <li>Compute-optimized</li>
     * <li>Memory-optimized</li>
     * <li>Big data</li>
     * <li>Local SSDs</li>
     * <li>High Clock Speed</li>
     * <li>Enhanced</li>
     * <li>Shared</li>
     * <li>Compute-optimized with GPU</li>
     * <li>Visual Compute-optimized</li>
     * <li>Heterogeneous Service</li>
     * <li>Compute-optimized with FPGA</li>
     * <li>Compute-optimized with NPU</li>
     * <li>ECS Bare Metal</li>
     * <li>Super Computing Cluster</li>
     * <li>High Performance Compute</li>
     * </ul>
     */
    @NameInMap("InstanceCategories")
    public java.util.List<String> instanceCategories;

    /**
     * <p>The level of the instance family. Valid values:</p>
     * <ul>
     * <li>EntryLevel: entry level</li>
     * <li>EnterpriseLevel: enterprise level</li>
     * <li>CreditEntryLevel: credit-based entry level For more information, see <a href="https://help.aliyun.com/document_detail/59977.html">Burstable instance families</a>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>EnterpriseLevel</p>
     */
    @NameInMap("InstanceFamilyLevel")
    public String instanceFamilyLevel;

    /**
     * <p>The instance families that you want to query. You can query 1 to 10 instance families in each call.</p>
     */
    @NameInMap("InstanceTypeFamilies")
    public java.util.List<String> instanceTypeFamilies;

    /**
     * <p>The maximum hourly price for pay-as-you-go or preemptible instances.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("MaxPrice")
    public Float maxPrice;

    /**
     * <p>The maximum number of vCPUs per instance type.</p>
     * 
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("MaximumCpuCoreCount")
    public Integer maximumCpuCoreCount;

    /**
     * <p>The maximum number of GPUs per instance. The value must be a positive integer.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("MaximumGpuAmount")
    public Integer maximumGpuAmount;

    /**
     * <p>The maximum memory size per instance. Unit: GiB.</p>
     * 
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("MaximumMemorySize")
    public Float maximumMemorySize;

    /**
     * <p>The memory size that you want to assign to the instance type. Unit: GiB.</p>
     * 
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("Memory")
    public Float memory;

    /**
     * <p>The memory size that you want to assign to the instance type. Unit: GiB. You can specify multiple memory sizes.</p>
     */
    @NameInMap("MemoryList")
    public java.util.List<Float> memoryList;

    /**
     * <p>The baseline vCPU computing performance (overall baseline performance of all vCPUs) per t5 or t6 burstable instance.</p>
     * 
     * <strong>example:</strong>
     * <p>12</p>
     */
    @NameInMap("MinimumBaselineCredit")
    public Integer minimumBaselineCredit;

    /**
     * <p>The minimum number of vCPUs per instance type.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("MinimumCpuCoreCount")
    public Integer minimumCpuCoreCount;

    /**
     * <p>The minimum number of IPv6 addresses per ENI.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("MinimumEniIpv6AddressQuantity")
    public Integer minimumEniIpv6AddressQuantity;

    /**
     * <p>The minimum number of IPv4 addresses per ENI.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("MinimumEniPrivateIpAddressQuantity")
    public Integer minimumEniPrivateIpAddressQuantity;

    /**
     * <p>The minimum number of elastic network interfaces (ENIs) per instance.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("MinimumEniQuantity")
    public Integer minimumEniQuantity;

    /**
     * <p>The minimum number of GPUs per instance. The value must be a positive integer.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("MinimumGpuAmount")
    public Integer minimumGpuAmount;

    /**
     * <p>The initial vCPU credits per t5 or t6 burstable instance.</p>
     * 
     * <strong>example:</strong>
     * <p>12</p>
     */
    @NameInMap("MinimumInitialCredit")
    public Integer minimumInitialCredit;

    /**
     * <p>The minimum memory size per instance. Unit: GiB.</p>
     * 
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("MinimumMemorySize")
    public Float minimumMemorySize;

    /**
     * <p>The processor models of the instance types. You can specify 1 to 10 processor models.</p>
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
     * <p>The preemption policy that you want to apply to pay-as-you-go instances. Valid values:</p>
     * <ul>
     * <li>NoSpot: The instances are created as regular pay-as-you-go instances.</li>
     * <li>SpotWithPriceLimit: The instances are created as preemptible instances that have a user-defined maximum hourly price.</li>
     * <li>SpotAsPriceGo: The instances are created as preemptible instances for which the market price at the time of purchase is automatically used as the bidding price.</li>
     * </ul>
     * <p>Default value: NoSpot.</p>
     * 
     * <strong>example:</strong>
     * <p>NoSpot</p>
     */
    @NameInMap("SpotStrategy")
    public String spotStrategy;

    /**
     * <p>The IDs of the vSwitches.</p>
     */
    @NameInMap("VSwitchId")
    public java.util.List<String> vSwitchId;

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
