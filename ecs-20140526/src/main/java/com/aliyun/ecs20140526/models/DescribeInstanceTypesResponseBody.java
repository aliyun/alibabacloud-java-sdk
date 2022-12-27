// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeInstanceTypesResponseBody extends TeaModel {
    // Details about the instance types.
    @NameInMap("InstanceTypes")
    public DescribeInstanceTypesResponseBodyInstanceTypes instanceTypes;

    // The query token returned in this call.
    @NameInMap("NextToken")
    public String nextToken;

    // The ID of the request.
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
        // The index of the network card.
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

    public static class DescribeInstanceTypesResponseBodyInstanceTypesInstanceType extends TeaModel {
        // The baseline CPU performance (overall baseline performance of all vCPUs) per t5 or t6 burstable instance.
        @NameInMap("BaselineCredit")
        public Integer baselineCredit;

        // The CPU architecture. Valid values:
        // 
        // *   X86: x86
        // *   ARM: ARM
        @NameInMap("CpuArchitecture")
        public String cpuArchitecture;

        // The number of vCPUs.
        @NameInMap("CpuCoreCount")
        public Integer cpuCoreCount;

        // The CPU base frequency. Unit: GHz.
        @NameInMap("CpuSpeedFrequency")
        public Float cpuSpeedFrequency;

        // The CPU turbo frequency. Unit: GHz.
        @NameInMap("CpuTurboFrequency")
        public Float cpuTurboFrequency;

        // The maximum number of cloud disks.
        @NameInMap("DiskQuantity")
        public Integer diskQuantity;

        // The maximum number of IPv6 addresses per ENI.
        @NameInMap("EniIpv6AddressQuantity")
        public Integer eniIpv6AddressQuantity;

        // The maximum number of IPv4 addresses per ENI.
        @NameInMap("EniPrivateIpAddressQuantity")
        public Integer eniPrivateIpAddressQuantity;

        // The maximum number of ENIs.
        @NameInMap("EniQuantity")
        public Integer eniQuantity;

        // The maximum number of NICs, including the primary NIC, ENIs, and trunk NICs.
        // 
        // > This parameter is in invitational preview and is unavailable.
        @NameInMap("EniTotalQuantity")
        public Integer eniTotalQuantity;

        // Indicates whether NICs on instances of the instance type support trunking.
        // 
        // > This parameter is in invitational preview and is unavailable.
        @NameInMap("EniTrunkSupported")
        public Boolean eniTrunkSupported;

        // The number of ERIs.
        // 
        // > This parameter is in invitational preview and is unavailable.
        @NameInMap("EriQuantity")
        public Integer eriQuantity;

        // The number of GPUs.
        @NameInMap("GPUAmount")
        public Integer GPUAmount;

        // The amount of GPU memory per GPU. Unit: GiB.
        @NameInMap("GPUMemorySize")
        public Float GPUMemorySize;

        // The type of the GPU.
        @NameInMap("GPUSpec")
        public String GPUSpec;

        // The initial vCPU credits per t5 or t6 burstable instance.
        @NameInMap("InitialCredit")
        public Integer initialCredit;

        // The maximum inbound internal bandwidth. Unit: Kbit/s.
        @NameInMap("InstanceBandwidthRx")
        public Integer instanceBandwidthRx;

        // The maximum outbound internal bandwidth. Unit: Kbit/s.
        @NameInMap("InstanceBandwidthTx")
        public Integer instanceBandwidthTx;

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
        // *   CreditEntryLevel For more information, see [Overview](~~59977~~).
        @NameInMap("InstanceFamilyLevel")
        public String instanceFamilyLevel;

        // The inbound packet forwarding rate over the internal network. Unit: pps.
        @NameInMap("InstancePpsRx")
        public Long instancePpsRx;

        // The outbound packet forwarding rate over the internal network. Unit: pps.
        @NameInMap("InstancePpsTx")
        public Long instancePpsTx;

        // The instance family.
        @NameInMap("InstanceTypeFamily")
        public String instanceTypeFamily;

        // The ID of the instance type.
        @NameInMap("InstanceTypeId")
        public String instanceTypeId;

        // The number of local disks.
        @NameInMap("LocalStorageAmount")
        public Integer localStorageAmount;

        // The capacity of each local disk. Unit: GiB.
        @NameInMap("LocalStorageCapacity")
        public Long localStorageCapacity;

        // The category of local disks. For more information, see [Local disks](~~63138~~). Valid values:
        // 
        // *   local_hdd_pro: local SATA HDDs, which are used by d1ne or d1 instances
        // *   local_ssd_pro: local NVMe SSDs, which are used by i2, i2g, i1, ga1, or gn5 instances
        @NameInMap("LocalStorageCategory")
        public String localStorageCategory;

        // The maximum number of queues per ENI (including primary ENI and secondary ENI).
        @NameInMap("MaximumQueueNumberPerEni")
        public Integer maximumQueueNumberPerEni;

        // The memory size. Unit: GiB.
        @NameInMap("MemorySize")
        public Float memorySize;

        // The quantity of network cards.
        @NameInMap("NetworkCardQuantity")
        public Integer networkCardQuantity;

        // The list of network cards.
        @NameInMap("NetworkCards")
        public DescribeInstanceTypesResponseBodyInstanceTypesInstanceTypeNetworkCards networkCards;

        // Indicates whether to allow network traffic transmitted over virtual private clouds (VPCs) to be encrypted. Valid values:
        // 
        // *   true: allows network traffic transmitted over VPCs to be encrypted.
        // *   false: does not allow network traffic transmitted over VPCs to be encrypted.
        @NameInMap("NetworkEncryptionSupport")
        public Boolean networkEncryptionSupport;

        // Indicates whether cloud disks can be attached by using the NVMe protocol. Valid values:
        // 
        // *   required: Cloud disks can be attached by using the NVMe protocol.
        // *   unsupported: Cloud disk cannot be attached by using the NVMe protocol.
        @NameInMap("NvmeSupport")
        public String nvmeSupport;

        // The CPU model.
        @NameInMap("PhysicalProcessorModel")
        public String physicalProcessorModel;

        // The default number of queues per primary NIC.
        @NameInMap("PrimaryEniQueueNumber")
        public Integer primaryEniQueueNumber;

        // The maximum number of QP queues per ERI.
        @NameInMap("QueuePairNumber")
        public Integer queuePairNumber;

        // The default number of queues per secondary ENI.
        @NameInMap("SecondaryEniQueueNumber")
        public Integer secondaryEniQueueNumber;

        // The maximum number of queues on ENIs that the instance type supports.
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
