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

    @NameInMap("CpuArchitectures")
    public java.util.List<String> cpuArchitectures;

    @NameInMap("ExcludedInstanceType")
    public java.util.List<String> excludedInstanceType;

    @NameInMap("GpuSpecs")
    public java.util.List<String> gpuSpecs;

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
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("MaximumCpuCoreCount")
    public Integer maximumCpuCoreCount;

    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("MaximumGpuAmount")
    public Integer maximumGpuAmount;

    /**
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
     * <strong>example:</strong>
     * <p>12</p>
     */
    @NameInMap("MinimumBaselineCredit")
    public Integer minimumBaselineCredit;

    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("MinimumCpuCoreCount")
    public Integer minimumCpuCoreCount;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("MinimumEniIpv6AddressQuantity")
    public Integer minimumEniIpv6AddressQuantity;

    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("MinimumEniPrivateIpAddressQuantity")
    public Integer minimumEniPrivateIpAddressQuantity;

    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("MinimumEniQuantity")
    public Integer minimumEniQuantity;

    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("MinimumGpuAmount")
    public Integer minimumGpuAmount;

    /**
     * <strong>example:</strong>
     * <p>12</p>
     */
    @NameInMap("MinimumInitialCredit")
    public Integer minimumInitialCredit;

    /**
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("MinimumMemorySize")
    public Float minimumMemorySize;

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
     * <p>The vSwitch IDs.</p>
     */
    @NameInMap("VSwitchId")
    public java.util.List<String> vSwitchId;

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

}
