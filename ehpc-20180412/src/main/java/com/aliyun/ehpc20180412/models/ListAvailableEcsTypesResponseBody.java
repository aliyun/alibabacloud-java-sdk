// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class ListAvailableEcsTypesResponseBody extends TeaModel {
    @NameInMap("InstanceTypeFamilies")
    public ListAvailableEcsTypesResponseBodyInstanceTypeFamilies instanceTypeFamilies;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SupportSpotInstance")
    public Boolean supportSpotInstance;

    public static ListAvailableEcsTypesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAvailableEcsTypesResponseBody self = new ListAvailableEcsTypesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAvailableEcsTypesResponseBody setInstanceTypeFamilies(ListAvailableEcsTypesResponseBodyInstanceTypeFamilies instanceTypeFamilies) {
        this.instanceTypeFamilies = instanceTypeFamilies;
        return this;
    }
    public ListAvailableEcsTypesResponseBodyInstanceTypeFamilies getInstanceTypeFamilies() {
        return this.instanceTypeFamilies;
    }

    public ListAvailableEcsTypesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAvailableEcsTypesResponseBody setSupportSpotInstance(Boolean supportSpotInstance) {
        this.supportSpotInstance = supportSpotInstance;
        return this;
    }
    public Boolean getSupportSpotInstance() {
        return this.supportSpotInstance;
    }

    public static class ListAvailableEcsTypesResponseBodyInstanceTypeFamiliesInstanceTypeFamilyInfoTypesTypesInfoZoneIds extends TeaModel {
        @NameInMap("ZoneId")
        public java.util.List<String> zoneId;

        public static ListAvailableEcsTypesResponseBodyInstanceTypeFamiliesInstanceTypeFamilyInfoTypesTypesInfoZoneIds build(java.util.Map<String, ?> map) throws Exception {
            ListAvailableEcsTypesResponseBodyInstanceTypeFamiliesInstanceTypeFamilyInfoTypesTypesInfoZoneIds self = new ListAvailableEcsTypesResponseBodyInstanceTypeFamiliesInstanceTypeFamilyInfoTypesTypesInfoZoneIds();
            return TeaModel.build(map, self);
        }

        public ListAvailableEcsTypesResponseBodyInstanceTypeFamiliesInstanceTypeFamilyInfoTypesTypesInfoZoneIds setZoneId(java.util.List<String> zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public java.util.List<String> getZoneId() {
            return this.zoneId;
        }

    }

    public static class ListAvailableEcsTypesResponseBodyInstanceTypeFamiliesInstanceTypeFamilyInfoTypesTypesInfo extends TeaModel {
        @NameInMap("CpuCoreCount")
        public Integer cpuCoreCount;

        @NameInMap("EniQuantity")
        public Integer eniQuantity;

        @NameInMap("GPUAmount")
        public Integer GPUAmount;

        @NameInMap("GPUSpec")
        public String GPUSpec;

        @NameInMap("InstanceBandwidthRx")
        public Integer instanceBandwidthRx;

        @NameInMap("InstanceBandwidthTx")
        public Integer instanceBandwidthTx;

        @NameInMap("InstancePpsRx")
        public Integer instancePpsRx;

        @NameInMap("InstancePpsTx")
        public Integer instancePpsTx;

        @NameInMap("InstanceTypeId")
        public String instanceTypeId;

        @NameInMap("MemorySize")
        public Integer memorySize;

        @NameInMap("Status")
        public String status;

        @NameInMap("ZoneIds")
        public ListAvailableEcsTypesResponseBodyInstanceTypeFamiliesInstanceTypeFamilyInfoTypesTypesInfoZoneIds zoneIds;

        public static ListAvailableEcsTypesResponseBodyInstanceTypeFamiliesInstanceTypeFamilyInfoTypesTypesInfo build(java.util.Map<String, ?> map) throws Exception {
            ListAvailableEcsTypesResponseBodyInstanceTypeFamiliesInstanceTypeFamilyInfoTypesTypesInfo self = new ListAvailableEcsTypesResponseBodyInstanceTypeFamiliesInstanceTypeFamilyInfoTypesTypesInfo();
            return TeaModel.build(map, self);
        }

        public ListAvailableEcsTypesResponseBodyInstanceTypeFamiliesInstanceTypeFamilyInfoTypesTypesInfo setCpuCoreCount(Integer cpuCoreCount) {
            this.cpuCoreCount = cpuCoreCount;
            return this;
        }
        public Integer getCpuCoreCount() {
            return this.cpuCoreCount;
        }

        public ListAvailableEcsTypesResponseBodyInstanceTypeFamiliesInstanceTypeFamilyInfoTypesTypesInfo setEniQuantity(Integer eniQuantity) {
            this.eniQuantity = eniQuantity;
            return this;
        }
        public Integer getEniQuantity() {
            return this.eniQuantity;
        }

        public ListAvailableEcsTypesResponseBodyInstanceTypeFamiliesInstanceTypeFamilyInfoTypesTypesInfo setGPUAmount(Integer GPUAmount) {
            this.GPUAmount = GPUAmount;
            return this;
        }
        public Integer getGPUAmount() {
            return this.GPUAmount;
        }

        public ListAvailableEcsTypesResponseBodyInstanceTypeFamiliesInstanceTypeFamilyInfoTypesTypesInfo setGPUSpec(String GPUSpec) {
            this.GPUSpec = GPUSpec;
            return this;
        }
        public String getGPUSpec() {
            return this.GPUSpec;
        }

        public ListAvailableEcsTypesResponseBodyInstanceTypeFamiliesInstanceTypeFamilyInfoTypesTypesInfo setInstanceBandwidthRx(Integer instanceBandwidthRx) {
            this.instanceBandwidthRx = instanceBandwidthRx;
            return this;
        }
        public Integer getInstanceBandwidthRx() {
            return this.instanceBandwidthRx;
        }

        public ListAvailableEcsTypesResponseBodyInstanceTypeFamiliesInstanceTypeFamilyInfoTypesTypesInfo setInstanceBandwidthTx(Integer instanceBandwidthTx) {
            this.instanceBandwidthTx = instanceBandwidthTx;
            return this;
        }
        public Integer getInstanceBandwidthTx() {
            return this.instanceBandwidthTx;
        }

        public ListAvailableEcsTypesResponseBodyInstanceTypeFamiliesInstanceTypeFamilyInfoTypesTypesInfo setInstancePpsRx(Integer instancePpsRx) {
            this.instancePpsRx = instancePpsRx;
            return this;
        }
        public Integer getInstancePpsRx() {
            return this.instancePpsRx;
        }

        public ListAvailableEcsTypesResponseBodyInstanceTypeFamiliesInstanceTypeFamilyInfoTypesTypesInfo setInstancePpsTx(Integer instancePpsTx) {
            this.instancePpsTx = instancePpsTx;
            return this;
        }
        public Integer getInstancePpsTx() {
            return this.instancePpsTx;
        }

        public ListAvailableEcsTypesResponseBodyInstanceTypeFamiliesInstanceTypeFamilyInfoTypesTypesInfo setInstanceTypeId(String instanceTypeId) {
            this.instanceTypeId = instanceTypeId;
            return this;
        }
        public String getInstanceTypeId() {
            return this.instanceTypeId;
        }

        public ListAvailableEcsTypesResponseBodyInstanceTypeFamiliesInstanceTypeFamilyInfoTypesTypesInfo setMemorySize(Integer memorySize) {
            this.memorySize = memorySize;
            return this;
        }
        public Integer getMemorySize() {
            return this.memorySize;
        }

        public ListAvailableEcsTypesResponseBodyInstanceTypeFamiliesInstanceTypeFamilyInfoTypesTypesInfo setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListAvailableEcsTypesResponseBodyInstanceTypeFamiliesInstanceTypeFamilyInfoTypesTypesInfo setZoneIds(ListAvailableEcsTypesResponseBodyInstanceTypeFamiliesInstanceTypeFamilyInfoTypesTypesInfoZoneIds zoneIds) {
            this.zoneIds = zoneIds;
            return this;
        }
        public ListAvailableEcsTypesResponseBodyInstanceTypeFamiliesInstanceTypeFamilyInfoTypesTypesInfoZoneIds getZoneIds() {
            return this.zoneIds;
        }

    }

    public static class ListAvailableEcsTypesResponseBodyInstanceTypeFamiliesInstanceTypeFamilyInfoTypes extends TeaModel {
        @NameInMap("TypesInfo")
        public java.util.List<ListAvailableEcsTypesResponseBodyInstanceTypeFamiliesInstanceTypeFamilyInfoTypesTypesInfo> typesInfo;

        public static ListAvailableEcsTypesResponseBodyInstanceTypeFamiliesInstanceTypeFamilyInfoTypes build(java.util.Map<String, ?> map) throws Exception {
            ListAvailableEcsTypesResponseBodyInstanceTypeFamiliesInstanceTypeFamilyInfoTypes self = new ListAvailableEcsTypesResponseBodyInstanceTypeFamiliesInstanceTypeFamilyInfoTypes();
            return TeaModel.build(map, self);
        }

        public ListAvailableEcsTypesResponseBodyInstanceTypeFamiliesInstanceTypeFamilyInfoTypes setTypesInfo(java.util.List<ListAvailableEcsTypesResponseBodyInstanceTypeFamiliesInstanceTypeFamilyInfoTypesTypesInfo> typesInfo) {
            this.typesInfo = typesInfo;
            return this;
        }
        public java.util.List<ListAvailableEcsTypesResponseBodyInstanceTypeFamiliesInstanceTypeFamilyInfoTypesTypesInfo> getTypesInfo() {
            return this.typesInfo;
        }

    }

    public static class ListAvailableEcsTypesResponseBodyInstanceTypeFamiliesInstanceTypeFamilyInfo extends TeaModel {
        @NameInMap("Generation")
        public String generation;

        @NameInMap("InstanceTypeFamilyId")
        public String instanceTypeFamilyId;

        @NameInMap("Types")
        public ListAvailableEcsTypesResponseBodyInstanceTypeFamiliesInstanceTypeFamilyInfoTypes types;

        public static ListAvailableEcsTypesResponseBodyInstanceTypeFamiliesInstanceTypeFamilyInfo build(java.util.Map<String, ?> map) throws Exception {
            ListAvailableEcsTypesResponseBodyInstanceTypeFamiliesInstanceTypeFamilyInfo self = new ListAvailableEcsTypesResponseBodyInstanceTypeFamiliesInstanceTypeFamilyInfo();
            return TeaModel.build(map, self);
        }

        public ListAvailableEcsTypesResponseBodyInstanceTypeFamiliesInstanceTypeFamilyInfo setGeneration(String generation) {
            this.generation = generation;
            return this;
        }
        public String getGeneration() {
            return this.generation;
        }

        public ListAvailableEcsTypesResponseBodyInstanceTypeFamiliesInstanceTypeFamilyInfo setInstanceTypeFamilyId(String instanceTypeFamilyId) {
            this.instanceTypeFamilyId = instanceTypeFamilyId;
            return this;
        }
        public String getInstanceTypeFamilyId() {
            return this.instanceTypeFamilyId;
        }

        public ListAvailableEcsTypesResponseBodyInstanceTypeFamiliesInstanceTypeFamilyInfo setTypes(ListAvailableEcsTypesResponseBodyInstanceTypeFamiliesInstanceTypeFamilyInfoTypes types) {
            this.types = types;
            return this;
        }
        public ListAvailableEcsTypesResponseBodyInstanceTypeFamiliesInstanceTypeFamilyInfoTypes getTypes() {
            return this.types;
        }

    }

    public static class ListAvailableEcsTypesResponseBodyInstanceTypeFamilies extends TeaModel {
        @NameInMap("InstanceTypeFamilyInfo")
        public java.util.List<ListAvailableEcsTypesResponseBodyInstanceTypeFamiliesInstanceTypeFamilyInfo> instanceTypeFamilyInfo;

        public static ListAvailableEcsTypesResponseBodyInstanceTypeFamilies build(java.util.Map<String, ?> map) throws Exception {
            ListAvailableEcsTypesResponseBodyInstanceTypeFamilies self = new ListAvailableEcsTypesResponseBodyInstanceTypeFamilies();
            return TeaModel.build(map, self);
        }

        public ListAvailableEcsTypesResponseBodyInstanceTypeFamilies setInstanceTypeFamilyInfo(java.util.List<ListAvailableEcsTypesResponseBodyInstanceTypeFamiliesInstanceTypeFamilyInfo> instanceTypeFamilyInfo) {
            this.instanceTypeFamilyInfo = instanceTypeFamilyInfo;
            return this;
        }
        public java.util.List<ListAvailableEcsTypesResponseBodyInstanceTypeFamiliesInstanceTypeFamilyInfo> getInstanceTypeFamilyInfo() {
            return this.instanceTypeFamilyInfo;
        }

    }

}
