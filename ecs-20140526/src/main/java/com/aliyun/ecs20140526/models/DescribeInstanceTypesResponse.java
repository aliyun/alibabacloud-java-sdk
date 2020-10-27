// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeInstanceTypesResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("InstanceTypes")
    @Validation(required = true)
    public DescribeInstanceTypesResponseInstanceTypes instanceTypes;

    public static DescribeInstanceTypesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceTypesResponse self = new DescribeInstanceTypesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceTypesResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeInstanceTypesResponse setInstanceTypes(DescribeInstanceTypesResponseInstanceTypes instanceTypes) {
        this.instanceTypes = instanceTypes;
        return this;
    }
    public DescribeInstanceTypesResponseInstanceTypes getInstanceTypes() {
        return this.instanceTypes;
    }

    public static class DescribeInstanceTypesResponseInstanceTypesInstanceType extends TeaModel {
        @NameInMap("InstanceTypeId")
        @Validation(required = true)
        public String instanceTypeId;

        @NameInMap("CpuCoreCount")
        @Validation(required = true)
        public Integer cpuCoreCount;

        @NameInMap("MemorySize")
        @Validation(required = true)
        public Float memorySize;

        @NameInMap("InstanceTypeFamily")
        @Validation(required = true)
        public String instanceTypeFamily;

        @NameInMap("LocalStorageCapacity")
        @Validation(required = true)
        public Long localStorageCapacity;

        @NameInMap("LocalStorageAmount")
        @Validation(required = true)
        public Integer localStorageAmount;

        @NameInMap("LocalStorageCategory")
        @Validation(required = true)
        public String localStorageCategory;

        @NameInMap("GPUAmount")
        @Validation(required = true)
        public Integer GPUAmount;

        @NameInMap("GPUSpec")
        @Validation(required = true)
        public String GPUSpec;

        @NameInMap("InitialCredit")
        @Validation(required = true)
        public Integer initialCredit;

        @NameInMap("BaselineCredit")
        @Validation(required = true)
        public Integer baselineCredit;

        @NameInMap("EniQuantity")
        @Validation(required = true)
        public Integer eniQuantity;

        @NameInMap("EniPrivateIpAddressQuantity")
        @Validation(required = true)
        public Integer eniPrivateIpAddressQuantity;

        @NameInMap("EniIpv6AddressQuantity")
        @Validation(required = true)
        public Integer eniIpv6AddressQuantity;

        @NameInMap("InstanceBandwidthRx")
        @Validation(required = true)
        public Integer instanceBandwidthRx;

        @NameInMap("InstanceBandwidthTx")
        @Validation(required = true)
        public Integer instanceBandwidthTx;

        @NameInMap("InstancePpsRx")
        @Validation(required = true)
        public Long instancePpsRx;

        @NameInMap("InstancePpsTx")
        @Validation(required = true)
        public Long instancePpsTx;

        @NameInMap("InstanceFamilyLevel")
        @Validation(required = true)
        public String instanceFamilyLevel;

        @NameInMap("TotalEniQueueQuantity")
        @Validation(required = true)
        public Integer totalEniQueueQuantity;

        @NameInMap("EniTrunkSupported")
        @Validation(required = true)
        public Boolean eniTrunkSupported;

        @NameInMap("EniTotalQuantity")
        @Validation(required = true)
        public Integer eniTotalQuantity;

        @NameInMap("MaximumQueueNumberPerEni")
        @Validation(required = true)
        public Integer maximumQueueNumberPerEni;

        @NameInMap("PrimaryEniQueueNumber")
        @Validation(required = true)
        public Integer primaryEniQueueNumber;

        @NameInMap("SecondaryEniQueueNumber")
        @Validation(required = true)
        public Integer secondaryEniQueueNumber;

        public static DescribeInstanceTypesResponseInstanceTypesInstanceType build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceTypesResponseInstanceTypesInstanceType self = new DescribeInstanceTypesResponseInstanceTypesInstanceType();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceTypesResponseInstanceTypesInstanceType setInstanceTypeId(String instanceTypeId) {
            this.instanceTypeId = instanceTypeId;
            return this;
        }
        public String getInstanceTypeId() {
            return this.instanceTypeId;
        }

        public DescribeInstanceTypesResponseInstanceTypesInstanceType setCpuCoreCount(Integer cpuCoreCount) {
            this.cpuCoreCount = cpuCoreCount;
            return this;
        }
        public Integer getCpuCoreCount() {
            return this.cpuCoreCount;
        }

        public DescribeInstanceTypesResponseInstanceTypesInstanceType setMemorySize(Float memorySize) {
            this.memorySize = memorySize;
            return this;
        }
        public Float getMemorySize() {
            return this.memorySize;
        }

        public DescribeInstanceTypesResponseInstanceTypesInstanceType setInstanceTypeFamily(String instanceTypeFamily) {
            this.instanceTypeFamily = instanceTypeFamily;
            return this;
        }
        public String getInstanceTypeFamily() {
            return this.instanceTypeFamily;
        }

        public DescribeInstanceTypesResponseInstanceTypesInstanceType setLocalStorageCapacity(Long localStorageCapacity) {
            this.localStorageCapacity = localStorageCapacity;
            return this;
        }
        public Long getLocalStorageCapacity() {
            return this.localStorageCapacity;
        }

        public DescribeInstanceTypesResponseInstanceTypesInstanceType setLocalStorageAmount(Integer localStorageAmount) {
            this.localStorageAmount = localStorageAmount;
            return this;
        }
        public Integer getLocalStorageAmount() {
            return this.localStorageAmount;
        }

        public DescribeInstanceTypesResponseInstanceTypesInstanceType setLocalStorageCategory(String localStorageCategory) {
            this.localStorageCategory = localStorageCategory;
            return this;
        }
        public String getLocalStorageCategory() {
            return this.localStorageCategory;
        }

        public DescribeInstanceTypesResponseInstanceTypesInstanceType setGPUAmount(Integer GPUAmount) {
            this.GPUAmount = GPUAmount;
            return this;
        }
        public Integer getGPUAmount() {
            return this.GPUAmount;
        }

        public DescribeInstanceTypesResponseInstanceTypesInstanceType setGPUSpec(String GPUSpec) {
            this.GPUSpec = GPUSpec;
            return this;
        }
        public String getGPUSpec() {
            return this.GPUSpec;
        }

        public DescribeInstanceTypesResponseInstanceTypesInstanceType setInitialCredit(Integer initialCredit) {
            this.initialCredit = initialCredit;
            return this;
        }
        public Integer getInitialCredit() {
            return this.initialCredit;
        }

        public DescribeInstanceTypesResponseInstanceTypesInstanceType setBaselineCredit(Integer baselineCredit) {
            this.baselineCredit = baselineCredit;
            return this;
        }
        public Integer getBaselineCredit() {
            return this.baselineCredit;
        }

        public DescribeInstanceTypesResponseInstanceTypesInstanceType setEniQuantity(Integer eniQuantity) {
            this.eniQuantity = eniQuantity;
            return this;
        }
        public Integer getEniQuantity() {
            return this.eniQuantity;
        }

        public DescribeInstanceTypesResponseInstanceTypesInstanceType setEniPrivateIpAddressQuantity(Integer eniPrivateIpAddressQuantity) {
            this.eniPrivateIpAddressQuantity = eniPrivateIpAddressQuantity;
            return this;
        }
        public Integer getEniPrivateIpAddressQuantity() {
            return this.eniPrivateIpAddressQuantity;
        }

        public DescribeInstanceTypesResponseInstanceTypesInstanceType setEniIpv6AddressQuantity(Integer eniIpv6AddressQuantity) {
            this.eniIpv6AddressQuantity = eniIpv6AddressQuantity;
            return this;
        }
        public Integer getEniIpv6AddressQuantity() {
            return this.eniIpv6AddressQuantity;
        }

        public DescribeInstanceTypesResponseInstanceTypesInstanceType setInstanceBandwidthRx(Integer instanceBandwidthRx) {
            this.instanceBandwidthRx = instanceBandwidthRx;
            return this;
        }
        public Integer getInstanceBandwidthRx() {
            return this.instanceBandwidthRx;
        }

        public DescribeInstanceTypesResponseInstanceTypesInstanceType setInstanceBandwidthTx(Integer instanceBandwidthTx) {
            this.instanceBandwidthTx = instanceBandwidthTx;
            return this;
        }
        public Integer getInstanceBandwidthTx() {
            return this.instanceBandwidthTx;
        }

        public DescribeInstanceTypesResponseInstanceTypesInstanceType setInstancePpsRx(Long instancePpsRx) {
            this.instancePpsRx = instancePpsRx;
            return this;
        }
        public Long getInstancePpsRx() {
            return this.instancePpsRx;
        }

        public DescribeInstanceTypesResponseInstanceTypesInstanceType setInstancePpsTx(Long instancePpsTx) {
            this.instancePpsTx = instancePpsTx;
            return this;
        }
        public Long getInstancePpsTx() {
            return this.instancePpsTx;
        }

        public DescribeInstanceTypesResponseInstanceTypesInstanceType setInstanceFamilyLevel(String instanceFamilyLevel) {
            this.instanceFamilyLevel = instanceFamilyLevel;
            return this;
        }
        public String getInstanceFamilyLevel() {
            return this.instanceFamilyLevel;
        }

        public DescribeInstanceTypesResponseInstanceTypesInstanceType setTotalEniQueueQuantity(Integer totalEniQueueQuantity) {
            this.totalEniQueueQuantity = totalEniQueueQuantity;
            return this;
        }
        public Integer getTotalEniQueueQuantity() {
            return this.totalEniQueueQuantity;
        }

        public DescribeInstanceTypesResponseInstanceTypesInstanceType setEniTrunkSupported(Boolean eniTrunkSupported) {
            this.eniTrunkSupported = eniTrunkSupported;
            return this;
        }
        public Boolean getEniTrunkSupported() {
            return this.eniTrunkSupported;
        }

        public DescribeInstanceTypesResponseInstanceTypesInstanceType setEniTotalQuantity(Integer eniTotalQuantity) {
            this.eniTotalQuantity = eniTotalQuantity;
            return this;
        }
        public Integer getEniTotalQuantity() {
            return this.eniTotalQuantity;
        }

        public DescribeInstanceTypesResponseInstanceTypesInstanceType setMaximumQueueNumberPerEni(Integer maximumQueueNumberPerEni) {
            this.maximumQueueNumberPerEni = maximumQueueNumberPerEni;
            return this;
        }
        public Integer getMaximumQueueNumberPerEni() {
            return this.maximumQueueNumberPerEni;
        }

        public DescribeInstanceTypesResponseInstanceTypesInstanceType setPrimaryEniQueueNumber(Integer primaryEniQueueNumber) {
            this.primaryEniQueueNumber = primaryEniQueueNumber;
            return this;
        }
        public Integer getPrimaryEniQueueNumber() {
            return this.primaryEniQueueNumber;
        }

        public DescribeInstanceTypesResponseInstanceTypesInstanceType setSecondaryEniQueueNumber(Integer secondaryEniQueueNumber) {
            this.secondaryEniQueueNumber = secondaryEniQueueNumber;
            return this;
        }
        public Integer getSecondaryEniQueueNumber() {
            return this.secondaryEniQueueNumber;
        }

    }

    public static class DescribeInstanceTypesResponseInstanceTypes extends TeaModel {
        @NameInMap("InstanceType")
        @Validation(required = true)
        public java.util.List<DescribeInstanceTypesResponseInstanceTypesInstanceType> instanceType;

        public static DescribeInstanceTypesResponseInstanceTypes build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceTypesResponseInstanceTypes self = new DescribeInstanceTypesResponseInstanceTypes();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceTypesResponseInstanceTypes setInstanceType(java.util.List<DescribeInstanceTypesResponseInstanceTypesInstanceType> instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public java.util.List<DescribeInstanceTypesResponseInstanceTypesInstanceType> getInstanceType() {
            return this.instanceType;
        }

    }

}
