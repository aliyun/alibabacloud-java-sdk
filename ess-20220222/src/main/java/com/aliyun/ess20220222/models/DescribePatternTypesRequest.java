// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class DescribePatternTypesRequest extends TeaModel {
    @NameInMap("Architecture")
    public java.util.List<String> architecture;

    @NameInMap("BurstablePerformance")
    public String burstablePerformance;

    @NameInMap("ChannelId")
    public Long channelId;

    @NameInMap("Cores")
    public Integer cores;

    @NameInMap("CoresList")
    public java.util.List<Integer> coresList;

    @NameInMap("ExcludedInstanceType")
    public java.util.List<String> excludedInstanceType;

    @NameInMap("InstanceFamilyLevel")
    public String instanceFamilyLevel;

    @NameInMap("MaxPrice")
    public Float maxPrice;

    @NameInMap("Memory")
    public Float memory;

    @NameInMap("MemoryList")
    public java.util.List<Float> memoryList;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("SpotStrategy")
    public String spotStrategy;

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

    public DescribePatternTypesRequest setExcludedInstanceType(java.util.List<String> excludedInstanceType) {
        this.excludedInstanceType = excludedInstanceType;
        return this;
    }
    public java.util.List<String> getExcludedInstanceType() {
        return this.excludedInstanceType;
    }

    public DescribePatternTypesRequest setInstanceFamilyLevel(String instanceFamilyLevel) {
        this.instanceFamilyLevel = instanceFamilyLevel;
        return this;
    }
    public String getInstanceFamilyLevel() {
        return this.instanceFamilyLevel;
    }

    public DescribePatternTypesRequest setMaxPrice(Float maxPrice) {
        this.maxPrice = maxPrice;
        return this;
    }
    public Float getMaxPrice() {
        return this.maxPrice;
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
