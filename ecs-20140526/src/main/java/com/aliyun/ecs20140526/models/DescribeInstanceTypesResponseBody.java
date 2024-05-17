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
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the request.</p>
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

    public static class DescribeInstanceTypesResponseBodyInstanceTypesInstanceTypeNetworkCardsNetworkCardInfo extends TeaModel {
        /**
         * <p>The index of the network card.</p>
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
        /**
         * <p>The baseline vCPU computing performance (overall baseline performance of all vCPUs) per t5 or t6 burstable instance.</p>
         */
        @NameInMap("BaselineCredit")
        public Integer baselineCredit;

        /**
         * <p>The CPU architecture. Valid values:</p>
         * <br>
         * <p>*   X86</p>
         * <p>*   ARM</p>
         */
        @NameInMap("CpuArchitecture")
        public String cpuArchitecture;

        /**
         * <p>The number of vCPUs.</p>
         */
        @NameInMap("CpuCoreCount")
        public Integer cpuCoreCount;

        /**
         * <p>The CPU base frequency. Unit: GHz.</p>
         */
        @NameInMap("CpuSpeedFrequency")
        public Float cpuSpeedFrequency;

        /**
         * <p>The CPU turbo frequency. Unit: GHz.</p>
         */
        @NameInMap("CpuTurboFrequency")
        public Float cpuTurboFrequency;

        /**
         * <p>The maximum number of cloud disks per instance.</p>
         */
        @NameInMap("DiskQuantity")
        public Integer diskQuantity;

        /**
         * <p>The maximum number of IPv6 addresses per ENI.</p>
         */
        @NameInMap("EniIpv6AddressQuantity")
        public Integer eniIpv6AddressQuantity;

        /**
         * <p>The maximum number of IPv4 addresses per ENI.</p>
         */
        @NameInMap("EniPrivateIpAddressQuantity")
        public Integer eniPrivateIpAddressQuantity;

        /**
         * <p>The maximum number of ENIs per instance.</p>
         */
        @NameInMap("EniQuantity")
        public Integer eniQuantity;

        /**
         * <p>The maximum number of ENIs, including primary, secondary, and trunk ENIs.</p>
         * <br>
         * <p>>  This parameter is in invitational preview and is not publicly available.</p>
         */
        @NameInMap("EniTotalQuantity")
        public Integer eniTotalQuantity;

        /**
         * <p>Indicates whether trunk ENIs are supported.</p>
         * <br>
         * <p>>  This parameter is in invitational preview and is not publicly available.</p>
         */
        @NameInMap("EniTrunkSupported")
        public Boolean eniTrunkSupported;

        /**
         * <p>The number of ERIs.</p>
         * <br>
         * <p>>  This parameter is in invitational preview and is not publicly available.</p>
         */
        @NameInMap("EriQuantity")
        public Integer eriQuantity;

        /**
         * <p>The number of GPUs.</p>
         */
        @NameInMap("GPUAmount")
        public Integer GPUAmount;

        /**
         * <p>The amount of GPU memory per GPU. Unit: GiB</p>
         */
        @NameInMap("GPUMemorySize")
        public Float GPUMemorySize;

        /**
         * <p>The GPU model.</p>
         */
        @NameInMap("GPUSpec")
        public String GPUSpec;

        /**
         * <p>The initial vCPU credits per t5 or t6 burstable instance.</p>
         */
        @NameInMap("InitialCredit")
        public Integer initialCredit;

        /**
         * <p>The maximum inbound internal bandwidth. Unit: Kbit/s.</p>
         */
        @NameInMap("InstanceBandwidthRx")
        public Integer instanceBandwidthRx;

        /**
         * <p>The maximum outbound internal bandwidth. Unit: Kbit/s.</p>
         */
        @NameInMap("InstanceBandwidthTx")
        public Integer instanceBandwidthTx;

        /**
         * <p>The category of the instance type. Valid values:</p>
         * <br>
         * <p>*   General-purpose</p>
         * <p>*   Compute-optimized</p>
         * <p>*   Memory-optimized</p>
         * <p>*   Big data</p>
         * <p>*   Local SSDs</p>
         * <p>*   High Clock Speed</p>
         * <p>*   Enhanced</p>
         * <p>*   Shared</p>
         * <p>*   Compute-optimized with GPU</p>
         * <p>*   Visual Compute-optimized</p>
         * <p>*   Heterogeneous Service</p>
         * <p>*   Compute-optimized with FPGA</p>
         * <p>*   Compute-optimized with NPU</p>
         * <p>*   ECS Bare Metal</p>
         * <p>*   Super Computing Cluster</p>
         * <p>*   High Performance Compute</p>
         */
        @NameInMap("InstanceCategory")
        public String instanceCategory;

        /**
         * <p>The level of the instance family. Valid values:</p>
         * <br>
         * <p>*   EntryLevel: entry level (shared).</p>
         * <p>*   EnterpriseLevel: enterprise level.</p>
         * <p>*   CreditEntryLevel: credit-based entry level. For more information, see [Overview](https://help.aliyun.com/document_detail/59977.html).</p>
         */
        @NameInMap("InstanceFamilyLevel")
        public String instanceFamilyLevel;

        /**
         * <p>The inbound packet forwarding rate over the internal network. Unit: pps.</p>
         */
        @NameInMap("InstancePpsRx")
        public Long instancePpsRx;

        /**
         * <p>The outbound packet forwarding rate over the internal network. Unit: pps.</p>
         */
        @NameInMap("InstancePpsTx")
        public Long instancePpsTx;

        /**
         * <p>The instance family.</p>
         */
        @NameInMap("InstanceTypeFamily")
        public String instanceTypeFamily;

        /**
         * <p>The ID of the instance type.</p>
         */
        @NameInMap("InstanceTypeId")
        public String instanceTypeId;

        /**
         * <p>The number of local disks per instance.</p>
         */
        @NameInMap("LocalStorageAmount")
        public Integer localStorageAmount;

        /**
         * <p>The capacity of each local disk. Unit: GiB</p>
         */
        @NameInMap("LocalStorageCapacity")
        public Long localStorageCapacity;

        /**
         * <p>The category of local disks. For more information, see [Local disks](https://help.aliyun.com/document_detail/63138.html). Valid values:</p>
         * <br>
         * <p>*   local_hdd_pro: local SATA HDDs, which are attached to d1ne or d1 instances</p>
         * <p>*   local_ssd_pro: local NVMe SSDs, which are attached to i2, i2g, i1, ga1, or gn5 instances</p>
         */
        @NameInMap("LocalStorageCategory")
        public String localStorageCategory;

        /**
         * <p>The maximum number of queues per ENI, including primary and secondary ENIs.</p>
         */
        @NameInMap("MaximumQueueNumberPerEni")
        public Integer maximumQueueNumberPerEni;

        /**
         * <p>The memory size. Unit: GiB</p>
         */
        @NameInMap("MemorySize")
        public Float memorySize;

        /**
         * <p>The maximum number of network cards that the instance type supports.</p>
         */
        @NameInMap("NetworkCardQuantity")
        public Integer networkCardQuantity;

        /**
         * <p>The information of the network cards.</p>
         */
        @NameInMap("NetworkCards")
        public DescribeInstanceTypesResponseBodyInstanceTypesInstanceTypeNetworkCards networkCards;

        /**
         * <p>Indicates whether to allow network traffic transmitted over virtual private clouds (VPCs) to be encrypted. Valid values:</p>
         * <br>
         * <p>*   true</p>
         * <p>*   false</p>
         */
        @NameInMap("NetworkEncryptionSupport")
        public Boolean networkEncryptionSupport;

        /**
         * <p>Indicates whether cloud disks can be attached by using the NVMe protocol. Valid values:</p>
         * <br>
         * <p>*   required: Cloud disks can be attached by using the NVMe protocol.</p>
         * <p>*   unsupported: Cloud disks cannot be attached by using the NVMe protocol.</p>
         */
        @NameInMap("NvmeSupport")
        public String nvmeSupport;

        /**
         * <p>The CPU model.</p>
         */
        @NameInMap("PhysicalProcessorModel")
        public String physicalProcessorModel;

        /**
         * <p>The default number of queues per primary ENI.</p>
         */
        @NameInMap("PrimaryEniQueueNumber")
        public Integer primaryEniQueueNumber;

        /**
         * <p>The maximum number of QPs per ERI.</p>
         */
        @NameInMap("QueuePairNumber")
        public Integer queuePairNumber;

        /**
         * <p>The default number of queues per secondary ENI.</p>
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
         */
        @NameInMap("TotalEniQueueQuantity")
        public Integer totalEniQueueQuantity;

        public static DescribeInstanceTypesResponseBodyInstanceTypesInstanceType build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceTypesResponseBodyInstanceTypesInstanceType self = new DescribeInstanceTypesResponseBodyInstanceTypesInstanceType();
            return TeaModel.build(map, self);
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
