// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeInstanceTypesResponseBody extends TeaModel {
    @NameInMap("InstanceTypes")
    public DescribeInstanceTypesResponseBodyInstanceTypes instanceTypes;

    /**
     * <p>The query token returned in this call.</p>
     * 
     * <strong>example:</strong>
     * <p>e71d8a535bd9cc11</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>00827261-20B7-4562-83F2-4DF39876A45A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeInstanceTypesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceTypesResponseBody self = new DescribeInstanceTypesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceTypesResponseBody setInstanceTypes(DescribeInstanceTypesResponseBodyInstanceTypes instanceTypes) {
        this.instanceTypes = instanceTypes;
        return this;
    }
    public DescribeInstanceTypesResponseBodyInstanceTypes getInstanceTypes() {
        return this.instanceTypes;
    }

    public DescribeInstanceTypesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeInstanceTypesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeInstanceTypesResponseBodyInstanceTypesInstanceTypeAttributesAttribute extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("Value")
        public String value;

        public static DescribeInstanceTypesResponseBodyInstanceTypesInstanceTypeAttributesAttribute build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceTypesResponseBodyInstanceTypesInstanceTypeAttributesAttribute self = new DescribeInstanceTypesResponseBodyInstanceTypesInstanceTypeAttributesAttribute();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceTypesResponseBodyInstanceTypesInstanceTypeAttributesAttribute setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeInstanceTypesResponseBodyInstanceTypesInstanceTypeAttributesAttribute setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeInstanceTypesResponseBodyInstanceTypesInstanceTypeAttributes extends TeaModel {
        @NameInMap("Attribute")
        public java.util.List<DescribeInstanceTypesResponseBodyInstanceTypesInstanceTypeAttributesAttribute> attribute;

        public static DescribeInstanceTypesResponseBodyInstanceTypesInstanceTypeAttributes build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceTypesResponseBodyInstanceTypesInstanceTypeAttributes self = new DescribeInstanceTypesResponseBodyInstanceTypesInstanceTypeAttributes();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceTypesResponseBodyInstanceTypesInstanceTypeAttributes setAttribute(java.util.List<DescribeInstanceTypesResponseBodyInstanceTypesInstanceTypeAttributesAttribute> attribute) {
            this.attribute = attribute;
            return this;
        }
        public java.util.List<DescribeInstanceTypesResponseBodyInstanceTypesInstanceTypeAttributesAttribute> getAttribute() {
            return this.attribute;
        }

    }

    public static class DescribeInstanceTypesResponseBodyInstanceTypesInstanceTypeClock extends TeaModel {
        @NameInMap("PtpSupport")
        public String ptpSupport;

        public static DescribeInstanceTypesResponseBodyInstanceTypesInstanceTypeClock build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceTypesResponseBodyInstanceTypesInstanceTypeClock self = new DescribeInstanceTypesResponseBodyInstanceTypesInstanceTypeClock();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceTypesResponseBodyInstanceTypesInstanceTypeClock setPtpSupport(String ptpSupport) {
            this.ptpSupport = ptpSupport;
            return this;
        }
        public String getPtpSupport() {
            return this.ptpSupport;
        }

    }

    public static class DescribeInstanceTypesResponseBodyInstanceTypesInstanceTypeCpuOptionsSupportedTopologyTypes extends TeaModel {
        @NameInMap("SupportedTopologyType")
        public java.util.List<String> supportedTopologyType;

        public static DescribeInstanceTypesResponseBodyInstanceTypesInstanceTypeCpuOptionsSupportedTopologyTypes build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceTypesResponseBodyInstanceTypesInstanceTypeCpuOptionsSupportedTopologyTypes self = new DescribeInstanceTypesResponseBodyInstanceTypesInstanceTypeCpuOptionsSupportedTopologyTypes();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceTypesResponseBodyInstanceTypesInstanceTypeCpuOptionsSupportedTopologyTypes setSupportedTopologyType(java.util.List<String> supportedTopologyType) {
            this.supportedTopologyType = supportedTopologyType;
            return this;
        }
        public java.util.List<String> getSupportedTopologyType() {
            return this.supportedTopologyType;
        }

    }

    public static class DescribeInstanceTypesResponseBodyInstanceTypesInstanceTypeCpuOptions extends TeaModel {
        @NameInMap("Core")
        public Integer core;

        @NameInMap("CoreFactor")
        public Integer coreFactor;

        @NameInMap("HyperThreadingAdjustable")
        public Boolean hyperThreadingAdjustable;

        @NameInMap("SupportedTopologyTypes")
        public DescribeInstanceTypesResponseBodyInstanceTypesInstanceTypeCpuOptionsSupportedTopologyTypes supportedTopologyTypes;

        @NameInMap("ThreadsPerCore")
        public Integer threadsPerCore;

        public static DescribeInstanceTypesResponseBodyInstanceTypesInstanceTypeCpuOptions build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceTypesResponseBodyInstanceTypesInstanceTypeCpuOptions self = new DescribeInstanceTypesResponseBodyInstanceTypesInstanceTypeCpuOptions();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceTypesResponseBodyInstanceTypesInstanceTypeCpuOptions setCore(Integer core) {
            this.core = core;
            return this;
        }
        public Integer getCore() {
            return this.core;
        }

        public DescribeInstanceTypesResponseBodyInstanceTypesInstanceTypeCpuOptions setCoreFactor(Integer coreFactor) {
            this.coreFactor = coreFactor;
            return this;
        }
        public Integer getCoreFactor() {
            return this.coreFactor;
        }

        public DescribeInstanceTypesResponseBodyInstanceTypesInstanceTypeCpuOptions setHyperThreadingAdjustable(Boolean hyperThreadingAdjustable) {
            this.hyperThreadingAdjustable = hyperThreadingAdjustable;
            return this;
        }
        public Boolean getHyperThreadingAdjustable() {
            return this.hyperThreadingAdjustable;
        }

        public DescribeInstanceTypesResponseBodyInstanceTypesInstanceTypeCpuOptions setSupportedTopologyTypes(DescribeInstanceTypesResponseBodyInstanceTypesInstanceTypeCpuOptionsSupportedTopologyTypes supportedTopologyTypes) {
            this.supportedTopologyTypes = supportedTopologyTypes;
            return this;
        }
        public DescribeInstanceTypesResponseBodyInstanceTypesInstanceTypeCpuOptionsSupportedTopologyTypes getSupportedTopologyTypes() {
            return this.supportedTopologyTypes;
        }

        public DescribeInstanceTypesResponseBodyInstanceTypesInstanceTypeCpuOptions setThreadsPerCore(Integer threadsPerCore) {
            this.threadsPerCore = threadsPerCore;
            return this;
        }
        public Integer getThreadsPerCore() {
            return this.threadsPerCore;
        }

    }

    public static class DescribeInstanceTypesResponseBodyInstanceTypesInstanceTypeEnhancedNetwork extends TeaModel {
        @NameInMap("RssSupport")
        public Boolean rssSupport;

        @NameInMap("SriovSupport")
        public Boolean sriovSupport;

        @NameInMap("VfQueueNumberPerEni")
        public Integer vfQueueNumberPerEni;

        public static DescribeInstanceTypesResponseBodyInstanceTypesInstanceTypeEnhancedNetwork build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceTypesResponseBodyInstanceTypesInstanceTypeEnhancedNetwork self = new DescribeInstanceTypesResponseBodyInstanceTypesInstanceTypeEnhancedNetwork();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceTypesResponseBodyInstanceTypesInstanceTypeEnhancedNetwork setRssSupport(Boolean rssSupport) {
            this.rssSupport = rssSupport;
            return this;
        }
        public Boolean getRssSupport() {
            return this.rssSupport;
        }

        public DescribeInstanceTypesResponseBodyInstanceTypesInstanceTypeEnhancedNetwork setSriovSupport(Boolean sriovSupport) {
            this.sriovSupport = sriovSupport;
            return this;
        }
        public Boolean getSriovSupport() {
            return this.sriovSupport;
        }

        public DescribeInstanceTypesResponseBodyInstanceTypesInstanceTypeEnhancedNetwork setVfQueueNumberPerEni(Integer vfQueueNumberPerEni) {
            this.vfQueueNumberPerEni = vfQueueNumberPerEni;
            return this;
        }
        public Integer getVfQueueNumberPerEni() {
            return this.vfQueueNumberPerEni;
        }

    }

    public static class DescribeInstanceTypesResponseBodyInstanceTypesInstanceTypeNetworkCardsNetworkCardInfo extends TeaModel {
        @NameInMap("NetworkCardIndex")
        public Integer networkCardIndex;

        public static DescribeInstanceTypesResponseBodyInstanceTypesInstanceTypeNetworkCardsNetworkCardInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceTypesResponseBodyInstanceTypesInstanceTypeNetworkCardsNetworkCardInfo self = new DescribeInstanceTypesResponseBodyInstanceTypesInstanceTypeNetworkCardsNetworkCardInfo();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceTypesResponseBodyInstanceTypesInstanceTypeNetworkCardsNetworkCardInfo setNetworkCardIndex(Integer networkCardIndex) {
            this.networkCardIndex = networkCardIndex;
            return this;
        }
        public Integer getNetworkCardIndex() {
            return this.networkCardIndex;
        }

    }

    public static class DescribeInstanceTypesResponseBodyInstanceTypesInstanceTypeNetworkCards extends TeaModel {
        @NameInMap("NetworkCardInfo")
        public java.util.List<DescribeInstanceTypesResponseBodyInstanceTypesInstanceTypeNetworkCardsNetworkCardInfo> networkCardInfo;

        public static DescribeInstanceTypesResponseBodyInstanceTypesInstanceTypeNetworkCards build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceTypesResponseBodyInstanceTypesInstanceTypeNetworkCards self = new DescribeInstanceTypesResponseBodyInstanceTypesInstanceTypeNetworkCards();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceTypesResponseBodyInstanceTypesInstanceTypeNetworkCards setNetworkCardInfo(java.util.List<DescribeInstanceTypesResponseBodyInstanceTypesInstanceTypeNetworkCardsNetworkCardInfo> networkCardInfo) {
            this.networkCardInfo = networkCardInfo;
            return this;
        }
        public java.util.List<DescribeInstanceTypesResponseBodyInstanceTypesInstanceTypeNetworkCardsNetworkCardInfo> getNetworkCardInfo() {
            return this.networkCardInfo;
        }

    }

    public static class DescribeInstanceTypesResponseBodyInstanceTypesInstanceTypeNetworkInfoBandwidthWeightingWeightingInfosWeightingInfo extends TeaModel {
        @NameInMap("EbsBandwidth")
        public Long ebsBandwidth;

        @NameInMap("EbsBurstBandwidth")
        public Long ebsBurstBandwidth;

        @NameInMap("Name")
        public String name;

        @NameInMap("VpcBandwidth")
        public Long vpcBandwidth;

        @NameInMap("VpcBurstBandwidth")
        public Long vpcBurstBandwidth;

        public static DescribeInstanceTypesResponseBodyInstanceTypesInstanceTypeNetworkInfoBandwidthWeightingWeightingInfosWeightingInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceTypesResponseBodyInstanceTypesInstanceTypeNetworkInfoBandwidthWeightingWeightingInfosWeightingInfo self = new DescribeInstanceTypesResponseBodyInstanceTypesInstanceTypeNetworkInfoBandwidthWeightingWeightingInfosWeightingInfo();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceTypesResponseBodyInstanceTypesInstanceTypeNetworkInfoBandwidthWeightingWeightingInfosWeightingInfo setEbsBandwidth(Long ebsBandwidth) {
            this.ebsBandwidth = ebsBandwidth;
            return this;
        }
        public Long getEbsBandwidth() {
            return this.ebsBandwidth;
        }

        public DescribeInstanceTypesResponseBodyInstanceTypesInstanceTypeNetworkInfoBandwidthWeightingWeightingInfosWeightingInfo setEbsBurstBandwidth(Long ebsBurstBandwidth) {
            this.ebsBurstBandwidth = ebsBurstBandwidth;
            return this;
        }
        public Long getEbsBurstBandwidth() {
            return this.ebsBurstBandwidth;
        }

        public DescribeInstanceTypesResponseBodyInstanceTypesInstanceTypeNetworkInfoBandwidthWeightingWeightingInfosWeightingInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeInstanceTypesResponseBodyInstanceTypesInstanceTypeNetworkInfoBandwidthWeightingWeightingInfosWeightingInfo setVpcBandwidth(Long vpcBandwidth) {
            this.vpcBandwidth = vpcBandwidth;
            return this;
        }
        public Long getVpcBandwidth() {
            return this.vpcBandwidth;
        }

        public DescribeInstanceTypesResponseBodyInstanceTypesInstanceTypeNetworkInfoBandwidthWeightingWeightingInfosWeightingInfo setVpcBurstBandwidth(Long vpcBurstBandwidth) {
            this.vpcBurstBandwidth = vpcBurstBandwidth;
            return this;
        }
        public Long getVpcBurstBandwidth() {
            return this.vpcBurstBandwidth;
        }

    }

    public static class DescribeInstanceTypesResponseBodyInstanceTypesInstanceTypeNetworkInfoBandwidthWeightingWeightingInfos extends TeaModel {
        @NameInMap("WeightingInfo")
        public java.util.List<DescribeInstanceTypesResponseBodyInstanceTypesInstanceTypeNetworkInfoBandwidthWeightingWeightingInfosWeightingInfo> weightingInfo;

        public static DescribeInstanceTypesResponseBodyInstanceTypesInstanceTypeNetworkInfoBandwidthWeightingWeightingInfos build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceTypesResponseBodyInstanceTypesInstanceTypeNetworkInfoBandwidthWeightingWeightingInfos self = new DescribeInstanceTypesResponseBodyInstanceTypesInstanceTypeNetworkInfoBandwidthWeightingWeightingInfos();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceTypesResponseBodyInstanceTypesInstanceTypeNetworkInfoBandwidthWeightingWeightingInfos setWeightingInfo(java.util.List<DescribeInstanceTypesResponseBodyInstanceTypesInstanceTypeNetworkInfoBandwidthWeightingWeightingInfosWeightingInfo> weightingInfo) {
            this.weightingInfo = weightingInfo;
            return this;
        }
        public java.util.List<DescribeInstanceTypesResponseBodyInstanceTypesInstanceTypeNetworkInfoBandwidthWeightingWeightingInfosWeightingInfo> getWeightingInfo() {
            return this.weightingInfo;
        }

    }

    public static class DescribeInstanceTypesResponseBodyInstanceTypesInstanceTypeNetworkInfoBandwidthWeighting extends TeaModel {
        @NameInMap("WeightingInfos")
        public DescribeInstanceTypesResponseBodyInstanceTypesInstanceTypeNetworkInfoBandwidthWeightingWeightingInfos weightingInfos;

        public static DescribeInstanceTypesResponseBodyInstanceTypesInstanceTypeNetworkInfoBandwidthWeighting build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceTypesResponseBodyInstanceTypesInstanceTypeNetworkInfoBandwidthWeighting self = new DescribeInstanceTypesResponseBodyInstanceTypesInstanceTypeNetworkInfoBandwidthWeighting();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceTypesResponseBodyInstanceTypesInstanceTypeNetworkInfoBandwidthWeighting setWeightingInfos(DescribeInstanceTypesResponseBodyInstanceTypesInstanceTypeNetworkInfoBandwidthWeightingWeightingInfos weightingInfos) {
            this.weightingInfos = weightingInfos;
            return this;
        }
        public DescribeInstanceTypesResponseBodyInstanceTypesInstanceTypeNetworkInfoBandwidthWeightingWeightingInfos getWeightingInfos() {
            return this.weightingInfos;
        }

    }

    public static class DescribeInstanceTypesResponseBodyInstanceTypesInstanceTypeNetworkInfo extends TeaModel {
        @NameInMap("BandwidthWeighting")
        public DescribeInstanceTypesResponseBodyInstanceTypesInstanceTypeNetworkInfoBandwidthWeighting bandwidthWeighting;

        public static DescribeInstanceTypesResponseBodyInstanceTypesInstanceTypeNetworkInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceTypesResponseBodyInstanceTypesInstanceTypeNetworkInfo self = new DescribeInstanceTypesResponseBodyInstanceTypesInstanceTypeNetworkInfo();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceTypesResponseBodyInstanceTypesInstanceTypeNetworkInfo setBandwidthWeighting(DescribeInstanceTypesResponseBodyInstanceTypesInstanceTypeNetworkInfoBandwidthWeighting bandwidthWeighting) {
            this.bandwidthWeighting = bandwidthWeighting;
            return this;
        }
        public DescribeInstanceTypesResponseBodyInstanceTypesInstanceTypeNetworkInfoBandwidthWeighting getBandwidthWeighting() {
            return this.bandwidthWeighting;
        }

    }

    public static class DescribeInstanceTypesResponseBodyInstanceTypesInstanceTypeSupportedBootModes extends TeaModel {
        @NameInMap("SupportedBootMode")
        public java.util.List<String> supportedBootMode;

        public static DescribeInstanceTypesResponseBodyInstanceTypesInstanceTypeSupportedBootModes build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceTypesResponseBodyInstanceTypesInstanceTypeSupportedBootModes self = new DescribeInstanceTypesResponseBodyInstanceTypesInstanceTypeSupportedBootModes();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceTypesResponseBodyInstanceTypesInstanceTypeSupportedBootModes setSupportedBootMode(java.util.List<String> supportedBootMode) {
            this.supportedBootMode = supportedBootMode;
            return this;
        }
        public java.util.List<String> getSupportedBootMode() {
            return this.supportedBootMode;
        }

    }

    public static class DescribeInstanceTypesResponseBodyInstanceTypesInstanceType extends TeaModel {
        @NameInMap("Attributes")
        public DescribeInstanceTypesResponseBodyInstanceTypesInstanceTypeAttributes attributes;

        @NameInMap("BaselineCredit")
        public Integer baselineCredit;

        @NameInMap("Clock")
        public DescribeInstanceTypesResponseBodyInstanceTypesInstanceTypeClock clock;

        @NameInMap("CpuArchitecture")
        public String cpuArchitecture;

        @NameInMap("CpuCoreCount")
        public Integer cpuCoreCount;

        @NameInMap("CpuOptions")
        public DescribeInstanceTypesResponseBodyInstanceTypesInstanceTypeCpuOptions cpuOptions;

        @NameInMap("CpuSpeedFrequency")
        public Float cpuSpeedFrequency;

        @NameInMap("CpuTurboFrequency")
        public Float cpuTurboFrequency;

        @NameInMap("DiskQuantity")
        public Integer diskQuantity;

        @NameInMap("EnhancedNetwork")
        public DescribeInstanceTypesResponseBodyInstanceTypesInstanceTypeEnhancedNetwork enhancedNetwork;

        @NameInMap("EniIpv6AddressQuantity")
        public Integer eniIpv6AddressQuantity;

        @NameInMap("EniPrivateIpAddressQuantity")
        public Integer eniPrivateIpAddressQuantity;

        @NameInMap("EniQuantity")
        public Integer eniQuantity;

        @NameInMap("EniTotalQuantity")
        public Integer eniTotalQuantity;

        @NameInMap("EniTrunkSupported")
        public Boolean eniTrunkSupported;

        @NameInMap("EriQuantity")
        public Integer eriQuantity;

        @NameInMap("GPUAmount")
        public Integer GPUAmount;

        @NameInMap("GPUMemorySize")
        public Float GPUMemorySize;

        @NameInMap("GPUSpec")
        public String GPUSpec;

        @NameInMap("InitialCredit")
        public Integer initialCredit;

        @NameInMap("InstanceBandwidthRx")
        public Integer instanceBandwidthRx;

        @NameInMap("InstanceBandwidthTx")
        public Integer instanceBandwidthTx;

        @NameInMap("InstanceCategory")
        public String instanceCategory;

        @NameInMap("InstanceFamilyLevel")
        public String instanceFamilyLevel;

        @NameInMap("InstancePpsRx")
        public Long instancePpsRx;

        @NameInMap("InstancePpsTx")
        public Long instancePpsTx;

        @NameInMap("InstanceTypeFamily")
        public String instanceTypeFamily;

        @NameInMap("InstanceTypeId")
        public String instanceTypeId;

        @NameInMap("JumboFrameSupport")
        public Boolean jumboFrameSupport;

        @NameInMap("LocalStorageAmount")
        public Integer localStorageAmount;

        @NameInMap("LocalStorageCapacity")
        public Long localStorageCapacity;

        @NameInMap("LocalStorageCategory")
        public String localStorageCategory;

        @NameInMap("MaximumQueueNumberPerEni")
        public Integer maximumQueueNumberPerEni;

        @NameInMap("MemorySize")
        public Float memorySize;

        @NameInMap("NetworkCardQuantity")
        public Integer networkCardQuantity;

        @NameInMap("NetworkCards")
        public DescribeInstanceTypesResponseBodyInstanceTypesInstanceTypeNetworkCards networkCards;

        @NameInMap("NetworkEncryptionSupport")
        public Boolean networkEncryptionSupport;

        @NameInMap("NetworkInfo")
        public DescribeInstanceTypesResponseBodyInstanceTypesInstanceTypeNetworkInfo networkInfo;

        @NameInMap("NvmeSupport")
        public String nvmeSupport;

        @NameInMap("PhysicalProcessorModel")
        public String physicalProcessorModel;

        @NameInMap("PrimaryEniQueueNumber")
        public Integer primaryEniQueueNumber;

        @NameInMap("QueuePairNumber")
        public Integer queuePairNumber;

        @NameInMap("SecondaryEniQueueNumber")
        public Integer secondaryEniQueueNumber;

        @NameInMap("SupportedBootModes")
        public DescribeInstanceTypesResponseBodyInstanceTypesInstanceTypeSupportedBootModes supportedBootModes;

        @NameInMap("TotalEniQueueQuantity")
        public Integer totalEniQueueQuantity;

        public static DescribeInstanceTypesResponseBodyInstanceTypesInstanceType build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceTypesResponseBodyInstanceTypesInstanceType self = new DescribeInstanceTypesResponseBodyInstanceTypesInstanceType();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceTypesResponseBodyInstanceTypesInstanceType setAttributes(DescribeInstanceTypesResponseBodyInstanceTypesInstanceTypeAttributes attributes) {
            this.attributes = attributes;
            return this;
        }
        public DescribeInstanceTypesResponseBodyInstanceTypesInstanceTypeAttributes getAttributes() {
            return this.attributes;
        }

        public DescribeInstanceTypesResponseBodyInstanceTypesInstanceType setBaselineCredit(Integer baselineCredit) {
            this.baselineCredit = baselineCredit;
            return this;
        }
        public Integer getBaselineCredit() {
            return this.baselineCredit;
        }

        public DescribeInstanceTypesResponseBodyInstanceTypesInstanceType setClock(DescribeInstanceTypesResponseBodyInstanceTypesInstanceTypeClock clock) {
            this.clock = clock;
            return this;
        }
        public DescribeInstanceTypesResponseBodyInstanceTypesInstanceTypeClock getClock() {
            return this.clock;
        }

        public DescribeInstanceTypesResponseBodyInstanceTypesInstanceType setCpuArchitecture(String cpuArchitecture) {
            this.cpuArchitecture = cpuArchitecture;
            return this;
        }
        public String getCpuArchitecture() {
            return this.cpuArchitecture;
        }

        public DescribeInstanceTypesResponseBodyInstanceTypesInstanceType setCpuCoreCount(Integer cpuCoreCount) {
            this.cpuCoreCount = cpuCoreCount;
            return this;
        }
        public Integer getCpuCoreCount() {
            return this.cpuCoreCount;
        }

        public DescribeInstanceTypesResponseBodyInstanceTypesInstanceType setCpuOptions(DescribeInstanceTypesResponseBodyInstanceTypesInstanceTypeCpuOptions cpuOptions) {
            this.cpuOptions = cpuOptions;
            return this;
        }
        public DescribeInstanceTypesResponseBodyInstanceTypesInstanceTypeCpuOptions getCpuOptions() {
            return this.cpuOptions;
        }

        public DescribeInstanceTypesResponseBodyInstanceTypesInstanceType setCpuSpeedFrequency(Float cpuSpeedFrequency) {
            this.cpuSpeedFrequency = cpuSpeedFrequency;
            return this;
        }
        public Float getCpuSpeedFrequency() {
            return this.cpuSpeedFrequency;
        }

        public DescribeInstanceTypesResponseBodyInstanceTypesInstanceType setCpuTurboFrequency(Float cpuTurboFrequency) {
            this.cpuTurboFrequency = cpuTurboFrequency;
            return this;
        }
        public Float getCpuTurboFrequency() {
            return this.cpuTurboFrequency;
        }

        public DescribeInstanceTypesResponseBodyInstanceTypesInstanceType setDiskQuantity(Integer diskQuantity) {
            this.diskQuantity = diskQuantity;
            return this;
        }
        public Integer getDiskQuantity() {
            return this.diskQuantity;
        }

        public DescribeInstanceTypesResponseBodyInstanceTypesInstanceType setEnhancedNetwork(DescribeInstanceTypesResponseBodyInstanceTypesInstanceTypeEnhancedNetwork enhancedNetwork) {
            this.enhancedNetwork = enhancedNetwork;
            return this;
        }
        public DescribeInstanceTypesResponseBodyInstanceTypesInstanceTypeEnhancedNetwork getEnhancedNetwork() {
            return this.enhancedNetwork;
        }

        public DescribeInstanceTypesResponseBodyInstanceTypesInstanceType setEniIpv6AddressQuantity(Integer eniIpv6AddressQuantity) {
            this.eniIpv6AddressQuantity = eniIpv6AddressQuantity;
            return this;
        }
        public Integer getEniIpv6AddressQuantity() {
            return this.eniIpv6AddressQuantity;
        }

        public DescribeInstanceTypesResponseBodyInstanceTypesInstanceType setEniPrivateIpAddressQuantity(Integer eniPrivateIpAddressQuantity) {
            this.eniPrivateIpAddressQuantity = eniPrivateIpAddressQuantity;
            return this;
        }
        public Integer getEniPrivateIpAddressQuantity() {
            return this.eniPrivateIpAddressQuantity;
        }

        public DescribeInstanceTypesResponseBodyInstanceTypesInstanceType setEniQuantity(Integer eniQuantity) {
            this.eniQuantity = eniQuantity;
            return this;
        }
        public Integer getEniQuantity() {
            return this.eniQuantity;
        }

        public DescribeInstanceTypesResponseBodyInstanceTypesInstanceType setEniTotalQuantity(Integer eniTotalQuantity) {
            this.eniTotalQuantity = eniTotalQuantity;
            return this;
        }
        public Integer getEniTotalQuantity() {
            return this.eniTotalQuantity;
        }

        public DescribeInstanceTypesResponseBodyInstanceTypesInstanceType setEniTrunkSupported(Boolean eniTrunkSupported) {
            this.eniTrunkSupported = eniTrunkSupported;
            return this;
        }
        public Boolean getEniTrunkSupported() {
            return this.eniTrunkSupported;
        }

        public DescribeInstanceTypesResponseBodyInstanceTypesInstanceType setEriQuantity(Integer eriQuantity) {
            this.eriQuantity = eriQuantity;
            return this;
        }
        public Integer getEriQuantity() {
            return this.eriQuantity;
        }

        public DescribeInstanceTypesResponseBodyInstanceTypesInstanceType setGPUAmount(Integer GPUAmount) {
            this.GPUAmount = GPUAmount;
            return this;
        }
        public Integer getGPUAmount() {
            return this.GPUAmount;
        }

        public DescribeInstanceTypesResponseBodyInstanceTypesInstanceType setGPUMemorySize(Float GPUMemorySize) {
            this.GPUMemorySize = GPUMemorySize;
            return this;
        }
        public Float getGPUMemorySize() {
            return this.GPUMemorySize;
        }

        public DescribeInstanceTypesResponseBodyInstanceTypesInstanceType setGPUSpec(String GPUSpec) {
            this.GPUSpec = GPUSpec;
            return this;
        }
        public String getGPUSpec() {
            return this.GPUSpec;
        }

        public DescribeInstanceTypesResponseBodyInstanceTypesInstanceType setInitialCredit(Integer initialCredit) {
            this.initialCredit = initialCredit;
            return this;
        }
        public Integer getInitialCredit() {
            return this.initialCredit;
        }

        public DescribeInstanceTypesResponseBodyInstanceTypesInstanceType setInstanceBandwidthRx(Integer instanceBandwidthRx) {
            this.instanceBandwidthRx = instanceBandwidthRx;
            return this;
        }
        public Integer getInstanceBandwidthRx() {
            return this.instanceBandwidthRx;
        }

        public DescribeInstanceTypesResponseBodyInstanceTypesInstanceType setInstanceBandwidthTx(Integer instanceBandwidthTx) {
            this.instanceBandwidthTx = instanceBandwidthTx;
            return this;
        }
        public Integer getInstanceBandwidthTx() {
            return this.instanceBandwidthTx;
        }

        public DescribeInstanceTypesResponseBodyInstanceTypesInstanceType setInstanceCategory(String instanceCategory) {
            this.instanceCategory = instanceCategory;
            return this;
        }
        public String getInstanceCategory() {
            return this.instanceCategory;
        }

        public DescribeInstanceTypesResponseBodyInstanceTypesInstanceType setInstanceFamilyLevel(String instanceFamilyLevel) {
            this.instanceFamilyLevel = instanceFamilyLevel;
            return this;
        }
        public String getInstanceFamilyLevel() {
            return this.instanceFamilyLevel;
        }

        public DescribeInstanceTypesResponseBodyInstanceTypesInstanceType setInstancePpsRx(Long instancePpsRx) {
            this.instancePpsRx = instancePpsRx;
            return this;
        }
        public Long getInstancePpsRx() {
            return this.instancePpsRx;
        }

        public DescribeInstanceTypesResponseBodyInstanceTypesInstanceType setInstancePpsTx(Long instancePpsTx) {
            this.instancePpsTx = instancePpsTx;
            return this;
        }
        public Long getInstancePpsTx() {
            return this.instancePpsTx;
        }

        public DescribeInstanceTypesResponseBodyInstanceTypesInstanceType setInstanceTypeFamily(String instanceTypeFamily) {
            this.instanceTypeFamily = instanceTypeFamily;
            return this;
        }
        public String getInstanceTypeFamily() {
            return this.instanceTypeFamily;
        }

        public DescribeInstanceTypesResponseBodyInstanceTypesInstanceType setInstanceTypeId(String instanceTypeId) {
            this.instanceTypeId = instanceTypeId;
            return this;
        }
        public String getInstanceTypeId() {
            return this.instanceTypeId;
        }

        public DescribeInstanceTypesResponseBodyInstanceTypesInstanceType setJumboFrameSupport(Boolean jumboFrameSupport) {
            this.jumboFrameSupport = jumboFrameSupport;
            return this;
        }
        public Boolean getJumboFrameSupport() {
            return this.jumboFrameSupport;
        }

        public DescribeInstanceTypesResponseBodyInstanceTypesInstanceType setLocalStorageAmount(Integer localStorageAmount) {
            this.localStorageAmount = localStorageAmount;
            return this;
        }
        public Integer getLocalStorageAmount() {
            return this.localStorageAmount;
        }

        public DescribeInstanceTypesResponseBodyInstanceTypesInstanceType setLocalStorageCapacity(Long localStorageCapacity) {
            this.localStorageCapacity = localStorageCapacity;
            return this;
        }
        public Long getLocalStorageCapacity() {
            return this.localStorageCapacity;
        }

        public DescribeInstanceTypesResponseBodyInstanceTypesInstanceType setLocalStorageCategory(String localStorageCategory) {
            this.localStorageCategory = localStorageCategory;
            return this;
        }
        public String getLocalStorageCategory() {
            return this.localStorageCategory;
        }

        public DescribeInstanceTypesResponseBodyInstanceTypesInstanceType setMaximumQueueNumberPerEni(Integer maximumQueueNumberPerEni) {
            this.maximumQueueNumberPerEni = maximumQueueNumberPerEni;
            return this;
        }
        public Integer getMaximumQueueNumberPerEni() {
            return this.maximumQueueNumberPerEni;
        }

        public DescribeInstanceTypesResponseBodyInstanceTypesInstanceType setMemorySize(Float memorySize) {
            this.memorySize = memorySize;
            return this;
        }
        public Float getMemorySize() {
            return this.memorySize;
        }

        public DescribeInstanceTypesResponseBodyInstanceTypesInstanceType setNetworkCardQuantity(Integer networkCardQuantity) {
            this.networkCardQuantity = networkCardQuantity;
            return this;
        }
        public Integer getNetworkCardQuantity() {
            return this.networkCardQuantity;
        }

        public DescribeInstanceTypesResponseBodyInstanceTypesInstanceType setNetworkCards(DescribeInstanceTypesResponseBodyInstanceTypesInstanceTypeNetworkCards networkCards) {
            this.networkCards = networkCards;
            return this;
        }
        public DescribeInstanceTypesResponseBodyInstanceTypesInstanceTypeNetworkCards getNetworkCards() {
            return this.networkCards;
        }

        public DescribeInstanceTypesResponseBodyInstanceTypesInstanceType setNetworkEncryptionSupport(Boolean networkEncryptionSupport) {
            this.networkEncryptionSupport = networkEncryptionSupport;
            return this;
        }
        public Boolean getNetworkEncryptionSupport() {
            return this.networkEncryptionSupport;
        }

        public DescribeInstanceTypesResponseBodyInstanceTypesInstanceType setNetworkInfo(DescribeInstanceTypesResponseBodyInstanceTypesInstanceTypeNetworkInfo networkInfo) {
            this.networkInfo = networkInfo;
            return this;
        }
        public DescribeInstanceTypesResponseBodyInstanceTypesInstanceTypeNetworkInfo getNetworkInfo() {
            return this.networkInfo;
        }

        public DescribeInstanceTypesResponseBodyInstanceTypesInstanceType setNvmeSupport(String nvmeSupport) {
            this.nvmeSupport = nvmeSupport;
            return this;
        }
        public String getNvmeSupport() {
            return this.nvmeSupport;
        }

        public DescribeInstanceTypesResponseBodyInstanceTypesInstanceType setPhysicalProcessorModel(String physicalProcessorModel) {
            this.physicalProcessorModel = physicalProcessorModel;
            return this;
        }
        public String getPhysicalProcessorModel() {
            return this.physicalProcessorModel;
        }

        public DescribeInstanceTypesResponseBodyInstanceTypesInstanceType setPrimaryEniQueueNumber(Integer primaryEniQueueNumber) {
            this.primaryEniQueueNumber = primaryEniQueueNumber;
            return this;
        }
        public Integer getPrimaryEniQueueNumber() {
            return this.primaryEniQueueNumber;
        }

        public DescribeInstanceTypesResponseBodyInstanceTypesInstanceType setQueuePairNumber(Integer queuePairNumber) {
            this.queuePairNumber = queuePairNumber;
            return this;
        }
        public Integer getQueuePairNumber() {
            return this.queuePairNumber;
        }

        public DescribeInstanceTypesResponseBodyInstanceTypesInstanceType setSecondaryEniQueueNumber(Integer secondaryEniQueueNumber) {
            this.secondaryEniQueueNumber = secondaryEniQueueNumber;
            return this;
        }
        public Integer getSecondaryEniQueueNumber() {
            return this.secondaryEniQueueNumber;
        }

        public DescribeInstanceTypesResponseBodyInstanceTypesInstanceType setSupportedBootModes(DescribeInstanceTypesResponseBodyInstanceTypesInstanceTypeSupportedBootModes supportedBootModes) {
            this.supportedBootModes = supportedBootModes;
            return this;
        }
        public DescribeInstanceTypesResponseBodyInstanceTypesInstanceTypeSupportedBootModes getSupportedBootModes() {
            return this.supportedBootModes;
        }

        public DescribeInstanceTypesResponseBodyInstanceTypesInstanceType setTotalEniQueueQuantity(Integer totalEniQueueQuantity) {
            this.totalEniQueueQuantity = totalEniQueueQuantity;
            return this;
        }
        public Integer getTotalEniQueueQuantity() {
            return this.totalEniQueueQuantity;
        }

    }

    public static class DescribeInstanceTypesResponseBodyInstanceTypes extends TeaModel {
        @NameInMap("InstanceType")
        public java.util.List<DescribeInstanceTypesResponseBodyInstanceTypesInstanceType> instanceType;

        public static DescribeInstanceTypesResponseBodyInstanceTypes build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceTypesResponseBodyInstanceTypes self = new DescribeInstanceTypesResponseBodyInstanceTypes();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceTypesResponseBodyInstanceTypes setInstanceType(java.util.List<DescribeInstanceTypesResponseBodyInstanceTypesInstanceType> instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public java.util.List<DescribeInstanceTypesResponseBodyInstanceTypesInstanceType> getInstanceType() {
            return this.instanceType;
        }

    }

}
