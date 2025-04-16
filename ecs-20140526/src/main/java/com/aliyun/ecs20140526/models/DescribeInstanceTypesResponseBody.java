// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeInstanceTypesResponseBody extends TeaModel {
    /**
     * <p>Details about the instance types.</p>
     */
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
        /**
         * <p>The number of CPU cores.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Core")
        public Integer core;

        /**
         * <p>The CPU option step size.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("CoreFactor")
        public Integer coreFactor;

        /**
         * <p>Indicates whether HT can be enabled or disabled.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("HyperThreadingAdjustable")
        public Boolean hyperThreadingAdjustable;

        /**
         * <p>The CPU topology types of the instance type.</p>
         */
        @NameInMap("SupportedTopologyTypes")
        public DescribeInstanceTypesResponseBodyInstanceTypesInstanceTypeCpuOptionsSupportedTopologyTypes supportedTopologyTypes;

        /**
         * <p>The number of threads per CPU core.</p>
         * <blockquote>
         * <p> <code>If the value of CpuOptions.ThreadPerCore is 1, Hyper-Threading (HT) is disabled.</code></p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
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
        /**
         * <blockquote>
         * <p> This parameter is not publicly available.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("RssSupport")
        public Boolean rssSupport;

        /**
         * <blockquote>
         * <p> This parameter is not publicly available.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("SriovSupport")
        public Boolean sriovSupport;

        /**
         * <blockquote>
         * <p> This parameter is not publicly available.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
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
        /**
         * <p>The index of the network card.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
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

        /**
         * <p>The baseline vCPU computing performance (overall baseline performance of all vCPUs) per t5 or t6 burstable instance.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("BaselineCredit")
        public Integer baselineCredit;

        /**
         * <p>The CPU architecture. Valid values:</p>
         * <ul>
         * <li>X86</li>
         * <li>ARM</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>X86</p>
         */
        @NameInMap("CpuArchitecture")
        public String cpuArchitecture;

        /**
         * <p>The number of vCPUs.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("CpuCoreCount")
        public Integer cpuCoreCount;

        /**
         * <p>The CPU options.</p>
         */
        @NameInMap("CpuOptions")
        public DescribeInstanceTypesResponseBodyInstanceTypesInstanceTypeCpuOptions cpuOptions;

        /**
         * <p>The CPU base frequency. Unit: GHz.</p>
         * 
         * <strong>example:</strong>
         * <p>2.7</p>
         */
        @NameInMap("CpuSpeedFrequency")
        public Float cpuSpeedFrequency;

        /**
         * <p>The CPU turbo frequency. Unit: GHz.</p>
         * 
         * <strong>example:</strong>
         * <p>3.5</p>
         */
        @NameInMap("CpuTurboFrequency")
        public Float cpuTurboFrequency;

        /**
         * <p>The maximum number of cloud disks per instance.</p>
         * 
         * <strong>example:</strong>
         * <p>17</p>
         */
        @NameInMap("DiskQuantity")
        public Integer diskQuantity;

        /**
         * <blockquote>
         * <p> This parameter is not publicly available.</p>
         * </blockquote>
         */
        @NameInMap("EnhancedNetwork")
        public DescribeInstanceTypesResponseBodyInstanceTypesInstanceTypeEnhancedNetwork enhancedNetwork;

        /**
         * <p>The maximum number of IPv6 addresses per ENI.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("EniIpv6AddressQuantity")
        public Integer eniIpv6AddressQuantity;

        /**
         * <p>The maximum number of IPv4 addresses per ENI.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("EniPrivateIpAddressQuantity")
        public Integer eniPrivateIpAddressQuantity;

        /**
         * <p>The maximum number of ENIs per instance.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("EniQuantity")
        public Integer eniQuantity;

        /**
         * <p>The maximum number of ENIs, including primary, secondary, and trunk ENIs.</p>
         * <blockquote>
         * <p> This parameter is in invitational preview and is not publicly available.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("EniTotalQuantity")
        public Integer eniTotalQuantity;

        /**
         * <p>Indicates whether trunk ENIs are supported.</p>
         * <blockquote>
         * <p> This parameter is in invitational preview and is not publicly available.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EniTrunkSupported")
        public Boolean eniTrunkSupported;

        /**
         * <p>The number of ERIs.</p>
         * <blockquote>
         * <p> This parameter is in invitational preview and is not publicly available.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("EriQuantity")
        public Integer eriQuantity;

        /**
         * <p>The number of GPUs.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("GPUAmount")
        public Integer GPUAmount;

        /**
         * <p>The amount of GPU memory per GPU. Unit: GiB</p>
         * 
         * <strong>example:</strong>
         * <p>32</p>
         */
        @NameInMap("GPUMemorySize")
        public Float GPUMemorySize;

        /**
         * <p>The GPU model.</p>
         * 
         * <strong>example:</strong>
         * <p>NVIDIA V100</p>
         */
        @NameInMap("GPUSpec")
        public String GPUSpec;

        /**
         * <p>The initial vCPU credits per t5 or t6 burstable instance.</p>
         * 
         * <strong>example:</strong>
         * <p>120</p>
         */
        @NameInMap("InitialCredit")
        public Integer initialCredit;

        /**
         * <p>The maximum inbound internal bandwidth. Unit: Kbit/s.</p>
         * 
         * <strong>example:</strong>
         * <p>1024000</p>
         */
        @NameInMap("InstanceBandwidthRx")
        public Integer instanceBandwidthRx;

        /**
         * <p>The maximum outbound internal bandwidth. Unit: Kbit/s.</p>
         * 
         * <strong>example:</strong>
         * <p>1024000</p>
         */
        @NameInMap("InstanceBandwidthTx")
        public Integer instanceBandwidthTx;

        /**
         * <p>The category of the instance type. Valid values:</p>
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
         * <li>CreditEntryLevel: credit-based entry level. For more information, see <a href="https://help.aliyun.com/document_detail/59977.html">Overview</a>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>EnterpriseLevel</p>
         */
        @NameInMap("InstanceFamilyLevel")
        public String instanceFamilyLevel;

        /**
         * <p>The inbound packet forwarding rate over the internal network. Unit: pps.</p>
         * 
         * <strong>example:</strong>
         * <p>500000</p>
         */
        @NameInMap("InstancePpsRx")
        public Long instancePpsRx;

        /**
         * <p>The outbound packet forwarding rate over the internal network. Unit: pps.</p>
         * 
         * <strong>example:</strong>
         * <p>500000</p>
         */
        @NameInMap("InstancePpsTx")
        public Long instancePpsTx;

        /**
         * <p>The instance family.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs.g6</p>
         */
        @NameInMap("InstanceTypeFamily")
        public String instanceTypeFamily;

        /**
         * <p>The ID of the instance type.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs.g6.large</p>
         */
        @NameInMap("InstanceTypeId")
        public String instanceTypeId;

        /**
         * <p>Indicates whether jumbo frames are supported.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("JumboFrameSupport")
        public Boolean jumboFrameSupport;

        /**
         * <p>The number of local disks per instance.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("LocalStorageAmount")
        public Integer localStorageAmount;

        /**
         * <p>The capacity of each local disk. Unit: GiB</p>
         * 
         * <strong>example:</strong>
         * <p>5000</p>
         */
        @NameInMap("LocalStorageCapacity")
        public Long localStorageCapacity;

        /**
         * <p>The category of local disks. For more information, see <a href="https://help.aliyun.com/document_detail/63138.html">Local disks</a>. Valid values:</p>
         * <ul>
         * <li>local_hdd_pro: local SATA HDDs, which are attached to d1ne or d1 instances</li>
         * <li>local_ssd_pro: local NVMe SSDs, which are attached to i2, i2g, i1, ga1, or gn5 instances</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>local_ssd_pro</p>
         */
        @NameInMap("LocalStorageCategory")
        public String localStorageCategory;

        /**
         * <p>The maximum number of queues per ENI, including primary and secondary ENIs.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("MaximumQueueNumberPerEni")
        public Integer maximumQueueNumberPerEni;

        /**
         * <p>The memory size. Unit: GiB</p>
         * 
         * <strong>example:</strong>
         * <p>16</p>
         */
        @NameInMap("MemorySize")
        public Float memorySize;

        /**
         * <p>The maximum number of network cards that the instance type supports.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("NetworkCardQuantity")
        public Integer networkCardQuantity;

        /**
         * <p>The information about the network cards.</p>
         */
        @NameInMap("NetworkCards")
        public DescribeInstanceTypesResponseBodyInstanceTypesInstanceTypeNetworkCards networkCards;

        /**
         * <p>Indicates whether to allow network traffic transmitted over virtual private clouds (VPCs) to be encrypted. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("NetworkEncryptionSupport")
        public Boolean networkEncryptionSupport;

        /**
         * <p>Indicates whether cloud disks can be attached by using the NVMe protocol. Valid values:</p>
         * <ul>
         * <li>required: Cloud disks can be attached by using the NVMe protocol.</li>
         * <li>unsupported: Cloud disks cannot be attached by using the NVMe protocol.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>unsupported</p>
         */
        @NameInMap("NvmeSupport")
        public String nvmeSupport;

        /**
         * <p>The CPU model.</p>
         * 
         * <strong>example:</strong>
         * <p>Intel Xeon(Ice Lake) Platinum 8369B</p>
         */
        @NameInMap("PhysicalProcessorModel")
        public String physicalProcessorModel;

        /**
         * <p>The default number of queues per primary ENI.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("PrimaryEniQueueNumber")
        public Integer primaryEniQueueNumber;

        /**
         * <p>The maximum number of QPs per instance, which varies based on the instance type.</p>
         * <ul>
         * <li>For enterprise-level CPU-based instance types, the value of <code>QueuePairNumber</code> is the maximum number of QPs per instance.</li>
         * <li>For GPU-accelerated instance types, the maximum number of QPs per instance is calculated by using the following formula: Value of <code>QueuePairNumber</code> × Value of NetworkCardQuantity.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>22</p>
         */
        @NameInMap("QueuePairNumber")
        public Integer queuePairNumber;

        /**
         * <p>The default number of queues per secondary ENI.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("SecondaryEniQueueNumber")
        public Integer secondaryEniQueueNumber;

        /**
         * <p>The boot modes supported by the instance type.</p>
         */
        @NameInMap("SupportedBootModes")
        public DescribeInstanceTypesResponseBodyInstanceTypesInstanceTypeSupportedBootModes supportedBootModes;

        /**
         * <p>The maximum number of queues on ENIs that the instance type supports.</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
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
