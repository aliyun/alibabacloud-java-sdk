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

    public static class DescribeInstanceTypesResponseInstanceTypesInstanceType extends TeaModel {
        @NameInMap("InstanceTypeId")
        @Validation(required = true)
        public String instanceTypeId;

        @NameInMap("CpuCoreCount")
        @Validation(required = true)
        public Integer cpuCoreCount;

        @NameInMap("MemorySize")
        @Validation(required = true)
        public Double memorySize;

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

        public static DescribeInstanceTypesResponseInstanceTypesInstanceType build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceTypesResponseInstanceTypesInstanceType self = new DescribeInstanceTypesResponseInstanceTypesInstanceType();
            return TeaModel.build(map, self);
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

    }

}
