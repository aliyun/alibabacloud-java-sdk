// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class ListAvailableEcsTypesResponseBody extends TeaModel {
    @NameInMap("SupportSpotInstance")
    public Boolean supportSpotInstance;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("InstanceTypeFamilies")
    public java.util.List<ListAvailableEcsTypesResponseBodyInstanceTypeFamilies> instanceTypeFamilies;

    public static ListAvailableEcsTypesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAvailableEcsTypesResponseBody self = new ListAvailableEcsTypesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAvailableEcsTypesResponseBody setSupportSpotInstance(Boolean supportSpotInstance) {
        this.supportSpotInstance = supportSpotInstance;
        return this;
    }
    public Boolean getSupportSpotInstance() {
        return this.supportSpotInstance;
    }

    public ListAvailableEcsTypesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAvailableEcsTypesResponseBody setInstanceTypeFamilies(java.util.List<ListAvailableEcsTypesResponseBodyInstanceTypeFamilies> instanceTypeFamilies) {
        this.instanceTypeFamilies = instanceTypeFamilies;
        return this;
    }
    public java.util.List<ListAvailableEcsTypesResponseBodyInstanceTypeFamilies> getInstanceTypeFamilies() {
        return this.instanceTypeFamilies;
    }

    public static class ListAvailableEcsTypesResponseBodyInstanceTypeFamiliesTypes extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("InstanceTypeId")
        public String instanceTypeId;

        @NameInMap("InstanceBandwidthRx")
        public Integer instanceBandwidthRx;

        @NameInMap("GPUSpec")
        public String GPUSpec;

        @NameInMap("InstanceBandwidthTx")
        public Integer instanceBandwidthTx;

        @NameInMap("InstancePpsRx")
        public Integer instancePpsRx;

        @NameInMap("InstancePpsTx")
        public Integer instancePpsTx;

        @NameInMap("GPUAmount")
        public Integer GPUAmount;

        @NameInMap("CpuCoreCount")
        public Integer cpuCoreCount;

        @NameInMap("MemorySize")
        public Integer memorySize;

        @NameInMap("EniQuantity")
        public Integer eniQuantity;

        public static ListAvailableEcsTypesResponseBodyInstanceTypeFamiliesTypes build(java.util.Map<String, ?> map) throws Exception {
            ListAvailableEcsTypesResponseBodyInstanceTypeFamiliesTypes self = new ListAvailableEcsTypesResponseBodyInstanceTypeFamiliesTypes();
            return TeaModel.build(map, self);
        }

        public ListAvailableEcsTypesResponseBodyInstanceTypeFamiliesTypes setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListAvailableEcsTypesResponseBodyInstanceTypeFamiliesTypes setInstanceTypeId(String instanceTypeId) {
            this.instanceTypeId = instanceTypeId;
            return this;
        }
        public String getInstanceTypeId() {
            return this.instanceTypeId;
        }

        public ListAvailableEcsTypesResponseBodyInstanceTypeFamiliesTypes setInstanceBandwidthRx(Integer instanceBandwidthRx) {
            this.instanceBandwidthRx = instanceBandwidthRx;
            return this;
        }
        public Integer getInstanceBandwidthRx() {
            return this.instanceBandwidthRx;
        }

        public ListAvailableEcsTypesResponseBodyInstanceTypeFamiliesTypes setGPUSpec(String GPUSpec) {
            this.GPUSpec = GPUSpec;
            return this;
        }
        public String getGPUSpec() {
            return this.GPUSpec;
        }

        public ListAvailableEcsTypesResponseBodyInstanceTypeFamiliesTypes setInstanceBandwidthTx(Integer instanceBandwidthTx) {
            this.instanceBandwidthTx = instanceBandwidthTx;
            return this;
        }
        public Integer getInstanceBandwidthTx() {
            return this.instanceBandwidthTx;
        }

        public ListAvailableEcsTypesResponseBodyInstanceTypeFamiliesTypes setInstancePpsRx(Integer instancePpsRx) {
            this.instancePpsRx = instancePpsRx;
            return this;
        }
        public Integer getInstancePpsRx() {
            return this.instancePpsRx;
        }

        public ListAvailableEcsTypesResponseBodyInstanceTypeFamiliesTypes setInstancePpsTx(Integer instancePpsTx) {
            this.instancePpsTx = instancePpsTx;
            return this;
        }
        public Integer getInstancePpsTx() {
            return this.instancePpsTx;
        }

        public ListAvailableEcsTypesResponseBodyInstanceTypeFamiliesTypes setGPUAmount(Integer GPUAmount) {
            this.GPUAmount = GPUAmount;
            return this;
        }
        public Integer getGPUAmount() {
            return this.GPUAmount;
        }

        public ListAvailableEcsTypesResponseBodyInstanceTypeFamiliesTypes setCpuCoreCount(Integer cpuCoreCount) {
            this.cpuCoreCount = cpuCoreCount;
            return this;
        }
        public Integer getCpuCoreCount() {
            return this.cpuCoreCount;
        }

        public ListAvailableEcsTypesResponseBodyInstanceTypeFamiliesTypes setMemorySize(Integer memorySize) {
            this.memorySize = memorySize;
            return this;
        }
        public Integer getMemorySize() {
            return this.memorySize;
        }

        public ListAvailableEcsTypesResponseBodyInstanceTypeFamiliesTypes setEniQuantity(Integer eniQuantity) {
            this.eniQuantity = eniQuantity;
            return this;
        }
        public Integer getEniQuantity() {
            return this.eniQuantity;
        }

    }

    public static class ListAvailableEcsTypesResponseBodyInstanceTypeFamilies extends TeaModel {
        @NameInMap("InstanceTypeFamilyId")
        public String instanceTypeFamilyId;

        @NameInMap("Types")
        public java.util.List<ListAvailableEcsTypesResponseBodyInstanceTypeFamiliesTypes> types;

        @NameInMap("Generation")
        public String generation;

        public static ListAvailableEcsTypesResponseBodyInstanceTypeFamilies build(java.util.Map<String, ?> map) throws Exception {
            ListAvailableEcsTypesResponseBodyInstanceTypeFamilies self = new ListAvailableEcsTypesResponseBodyInstanceTypeFamilies();
            return TeaModel.build(map, self);
        }

        public ListAvailableEcsTypesResponseBodyInstanceTypeFamilies setInstanceTypeFamilyId(String instanceTypeFamilyId) {
            this.instanceTypeFamilyId = instanceTypeFamilyId;
            return this;
        }
        public String getInstanceTypeFamilyId() {
            return this.instanceTypeFamilyId;
        }

        public ListAvailableEcsTypesResponseBodyInstanceTypeFamilies setTypes(java.util.List<ListAvailableEcsTypesResponseBodyInstanceTypeFamiliesTypes> types) {
            this.types = types;
            return this;
        }
        public java.util.List<ListAvailableEcsTypesResponseBodyInstanceTypeFamiliesTypes> getTypes() {
            return this.types;
        }

        public ListAvailableEcsTypesResponseBodyInstanceTypeFamilies setGeneration(String generation) {
            this.generation = generation;
            return this;
        }
        public String getGeneration() {
            return this.generation;
        }

    }

}
