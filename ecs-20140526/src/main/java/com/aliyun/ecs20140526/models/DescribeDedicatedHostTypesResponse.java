// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeDedicatedHostTypesResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("DedicatedHostTypes")
    @Validation(required = true)
    public DescribeDedicatedHostTypesResponseDedicatedHostTypes dedicatedHostTypes;

    public static DescribeDedicatedHostTypesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDedicatedHostTypesResponse self = new DescribeDedicatedHostTypesResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeDedicatedHostTypesResponseDedicatedHostTypesDedicatedHostTypeSupportedInstanceTypeFamilies extends TeaModel {
        // SupportedInstanceTypeFamily
        @NameInMap("SupportedInstanceTypeFamily")
        @Validation(required = true)
        public java.util.List<String> supportedInstanceTypeFamily;

        public static DescribeDedicatedHostTypesResponseDedicatedHostTypesDedicatedHostTypeSupportedInstanceTypeFamilies build(java.util.Map<String, ?> map) throws Exception {
            DescribeDedicatedHostTypesResponseDedicatedHostTypesDedicatedHostTypeSupportedInstanceTypeFamilies self = new DescribeDedicatedHostTypesResponseDedicatedHostTypesDedicatedHostTypeSupportedInstanceTypeFamilies();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeDedicatedHostTypesResponseDedicatedHostTypesDedicatedHostTypeSupportedInstanceTypesList extends TeaModel {
        // SupportedInstanceTypesList
        @NameInMap("SupportedInstanceTypesList")
        @Validation(required = true)
        public java.util.List<String> supportedInstanceTypesList;

        public static DescribeDedicatedHostTypesResponseDedicatedHostTypesDedicatedHostTypeSupportedInstanceTypesList build(java.util.Map<String, ?> map) throws Exception {
            DescribeDedicatedHostTypesResponseDedicatedHostTypesDedicatedHostTypeSupportedInstanceTypesList self = new DescribeDedicatedHostTypesResponseDedicatedHostTypesDedicatedHostTypeSupportedInstanceTypesList();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeDedicatedHostTypesResponseDedicatedHostTypesDedicatedHostType extends TeaModel {
        @NameInMap("DedicatedHostType")
        @Validation(required = true)
        public String dedicatedHostType;

        @NameInMap("Sockets")
        @Validation(required = true)
        public Integer sockets;

        @NameInMap("TotalVcpus")
        @Validation(required = true)
        public Integer totalVcpus;

        @NameInMap("TotalVgpus")
        @Validation(required = true)
        public Integer totalVgpus;

        @NameInMap("Cores")
        @Validation(required = true)
        public Integer cores;

        @NameInMap("PhysicalGpus")
        @Validation(required = true)
        public Integer physicalGpus;

        @NameInMap("MemorySize")
        @Validation(required = true)
        public Double memorySize;

        @NameInMap("LocalStorageCapacity")
        @Validation(required = true)
        public Long localStorageCapacity;

        @NameInMap("LocalStorageAmount")
        @Validation(required = true)
        public Integer localStorageAmount;

        @NameInMap("LocalStorageCategory")
        @Validation(required = true)
        public String localStorageCategory;

        @NameInMap("GPUSpec")
        @Validation(required = true)
        public String GPUSpec;

        @NameInMap("SupportedInstanceTypeFamilies")
        @Validation(required = true)
        public DescribeDedicatedHostTypesResponseDedicatedHostTypesDedicatedHostTypeSupportedInstanceTypeFamilies supportedInstanceTypeFamilies;

        @NameInMap("SupportedInstanceTypesList")
        @Validation(required = true)
        public DescribeDedicatedHostTypesResponseDedicatedHostTypesDedicatedHostTypeSupportedInstanceTypesList supportedInstanceTypesList;

        public static DescribeDedicatedHostTypesResponseDedicatedHostTypesDedicatedHostType build(java.util.Map<String, ?> map) throws Exception {
            DescribeDedicatedHostTypesResponseDedicatedHostTypesDedicatedHostType self = new DescribeDedicatedHostTypesResponseDedicatedHostTypesDedicatedHostType();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeDedicatedHostTypesResponseDedicatedHostTypes extends TeaModel {
        @NameInMap("DedicatedHostType")
        @Validation(required = true)
        public java.util.List<DescribeDedicatedHostTypesResponseDedicatedHostTypesDedicatedHostType> dedicatedHostType;

        public static DescribeDedicatedHostTypesResponseDedicatedHostTypes build(java.util.Map<String, ?> map) throws Exception {
            DescribeDedicatedHostTypesResponseDedicatedHostTypes self = new DescribeDedicatedHostTypesResponseDedicatedHostTypes();
            return TeaModel.build(map, self);
        }

    }

}
