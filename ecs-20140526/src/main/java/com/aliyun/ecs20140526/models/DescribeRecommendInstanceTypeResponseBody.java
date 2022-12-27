// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeRecommendInstanceTypeResponseBody extends TeaModel {
    // Details of recommended instance types.
    @NameInMap("Data")
    public DescribeRecommendInstanceTypeResponseBodyData data;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeRecommendInstanceTypeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRecommendInstanceTypeResponseBody self = new DescribeRecommendInstanceTypeResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRecommendInstanceTypeResponseBody setData(DescribeRecommendInstanceTypeResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeRecommendInstanceTypeResponseBodyData getData() {
        return this.data;
    }

    public DescribeRecommendInstanceTypeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeRecommendInstanceTypeResponseBodyDataRecommendInstanceTypeInstanceType extends TeaModel {
        // The number of vCPUs of the instance type.
        @NameInMap("Cores")
        public Integer cores;

        // The generation of the instance family.
        @NameInMap("Generation")
        public String generation;

        // The name of the instance type.
        @NameInMap("InstanceType")
        public String instanceType;

        // The instance family.
        @NameInMap("InstanceTypeFamily")
        public String instanceTypeFamily;

        // The memory size of the instance type. Unit: MB.
        @NameInMap("Memory")
        public Integer memory;

        // Indicates whether the instance type supports I/O optimization.
        @NameInMap("SupportIoOptimized")
        public String supportIoOptimized;

        public static DescribeRecommendInstanceTypeResponseBodyDataRecommendInstanceTypeInstanceType build(java.util.Map<String, ?> map) throws Exception {
            DescribeRecommendInstanceTypeResponseBodyDataRecommendInstanceTypeInstanceType self = new DescribeRecommendInstanceTypeResponseBodyDataRecommendInstanceTypeInstanceType();
            return TeaModel.build(map, self);
        }

        public DescribeRecommendInstanceTypeResponseBodyDataRecommendInstanceTypeInstanceType setCores(Integer cores) {
            this.cores = cores;
            return this;
        }
        public Integer getCores() {
            return this.cores;
        }

        public DescribeRecommendInstanceTypeResponseBodyDataRecommendInstanceTypeInstanceType setGeneration(String generation) {
            this.generation = generation;
            return this;
        }
        public String getGeneration() {
            return this.generation;
        }

        public DescribeRecommendInstanceTypeResponseBodyDataRecommendInstanceTypeInstanceType setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public DescribeRecommendInstanceTypeResponseBodyDataRecommendInstanceTypeInstanceType setInstanceTypeFamily(String instanceTypeFamily) {
            this.instanceTypeFamily = instanceTypeFamily;
            return this;
        }
        public String getInstanceTypeFamily() {
            return this.instanceTypeFamily;
        }

        public DescribeRecommendInstanceTypeResponseBodyDataRecommendInstanceTypeInstanceType setMemory(Integer memory) {
            this.memory = memory;
            return this;
        }
        public Integer getMemory() {
            return this.memory;
        }

        public DescribeRecommendInstanceTypeResponseBodyDataRecommendInstanceTypeInstanceType setSupportIoOptimized(String supportIoOptimized) {
            this.supportIoOptimized = supportIoOptimized;
            return this;
        }
        public String getSupportIoOptimized() {
            return this.supportIoOptimized;
        }

    }

    public static class DescribeRecommendInstanceTypeResponseBodyDataRecommendInstanceTypeZonesZoneNetworkTypes extends TeaModel {
        @NameInMap("NetworkType")
        public java.util.List<String> networkType;

        public static DescribeRecommendInstanceTypeResponseBodyDataRecommendInstanceTypeZonesZoneNetworkTypes build(java.util.Map<String, ?> map) throws Exception {
            DescribeRecommendInstanceTypeResponseBodyDataRecommendInstanceTypeZonesZoneNetworkTypes self = new DescribeRecommendInstanceTypeResponseBodyDataRecommendInstanceTypeZonesZoneNetworkTypes();
            return TeaModel.build(map, self);
        }

        public DescribeRecommendInstanceTypeResponseBodyDataRecommendInstanceTypeZonesZoneNetworkTypes setNetworkType(java.util.List<String> networkType) {
            this.networkType = networkType;
            return this;
        }
        public java.util.List<String> getNetworkType() {
            return this.networkType;
        }

    }

    public static class DescribeRecommendInstanceTypeResponseBodyDataRecommendInstanceTypeZonesZone extends TeaModel {
        // Details of network types of the alternative instance types.
        @NameInMap("NetworkTypes")
        public DescribeRecommendInstanceTypeResponseBodyDataRecommendInstanceTypeZonesZoneNetworkTypes networkTypes;

        // The zone ID of the specified instance type.
        @NameInMap("ZoneNo")
        public String zoneNo;

        public static DescribeRecommendInstanceTypeResponseBodyDataRecommendInstanceTypeZonesZone build(java.util.Map<String, ?> map) throws Exception {
            DescribeRecommendInstanceTypeResponseBodyDataRecommendInstanceTypeZonesZone self = new DescribeRecommendInstanceTypeResponseBodyDataRecommendInstanceTypeZonesZone();
            return TeaModel.build(map, self);
        }

        public DescribeRecommendInstanceTypeResponseBodyDataRecommendInstanceTypeZonesZone setNetworkTypes(DescribeRecommendInstanceTypeResponseBodyDataRecommendInstanceTypeZonesZoneNetworkTypes networkTypes) {
            this.networkTypes = networkTypes;
            return this;
        }
        public DescribeRecommendInstanceTypeResponseBodyDataRecommendInstanceTypeZonesZoneNetworkTypes getNetworkTypes() {
            return this.networkTypes;
        }

        public DescribeRecommendInstanceTypeResponseBodyDataRecommendInstanceTypeZonesZone setZoneNo(String zoneNo) {
            this.zoneNo = zoneNo;
            return this;
        }
        public String getZoneNo() {
            return this.zoneNo;
        }

    }

    public static class DescribeRecommendInstanceTypeResponseBodyDataRecommendInstanceTypeZones extends TeaModel {
        @NameInMap("zone")
        public java.util.List<DescribeRecommendInstanceTypeResponseBodyDataRecommendInstanceTypeZonesZone> zone;

        public static DescribeRecommendInstanceTypeResponseBodyDataRecommendInstanceTypeZones build(java.util.Map<String, ?> map) throws Exception {
            DescribeRecommendInstanceTypeResponseBodyDataRecommendInstanceTypeZones self = new DescribeRecommendInstanceTypeResponseBodyDataRecommendInstanceTypeZones();
            return TeaModel.build(map, self);
        }

        public DescribeRecommendInstanceTypeResponseBodyDataRecommendInstanceTypeZones setZone(java.util.List<DescribeRecommendInstanceTypeResponseBodyDataRecommendInstanceTypeZonesZone> zone) {
            this.zone = zone;
            return this;
        }
        public java.util.List<DescribeRecommendInstanceTypeResponseBodyDataRecommendInstanceTypeZonesZone> getZone() {
            return this.zone;
        }

    }

    public static class DescribeRecommendInstanceTypeResponseBodyDataRecommendInstanceType extends TeaModel {
        // The commodity code of the instance type.
        @NameInMap("CommodityCode")
        public String commodityCode;

        // The billing method of the instances of the instance type.
        @NameInMap("InstanceChargeType")
        public String instanceChargeType;

        // The name of the instance type.
        @NameInMap("InstanceType")
        public DescribeRecommendInstanceTypeResponseBodyDataRecommendInstanceTypeInstanceType instanceType;

        // The network type of the ECS instance.
        @NameInMap("NetworkType")
        public String networkType;

        // The sorting priority.
        @NameInMap("Priority")
        public Integer priority;

        // The region ID of the instance type.
        @NameInMap("RegionId")
        public String regionId;

        // Indicates the scenario in which the instance type was recommended.
        @NameInMap("Scene")
        public String scene;

        // The preemption policy for the preemptible instance.
        @NameInMap("SpotStrategy")
        public String spotStrategy;

        // The zone ID of the instance type.
        @NameInMap("ZoneId")
        public String zoneId;

        // Details of the zones where the alternative instance types are available.
        @NameInMap("Zones")
        public DescribeRecommendInstanceTypeResponseBodyDataRecommendInstanceTypeZones zones;

        public static DescribeRecommendInstanceTypeResponseBodyDataRecommendInstanceType build(java.util.Map<String, ?> map) throws Exception {
            DescribeRecommendInstanceTypeResponseBodyDataRecommendInstanceType self = new DescribeRecommendInstanceTypeResponseBodyDataRecommendInstanceType();
            return TeaModel.build(map, self);
        }

        public DescribeRecommendInstanceTypeResponseBodyDataRecommendInstanceType setCommodityCode(String commodityCode) {
            this.commodityCode = commodityCode;
            return this;
        }
        public String getCommodityCode() {
            return this.commodityCode;
        }

        public DescribeRecommendInstanceTypeResponseBodyDataRecommendInstanceType setInstanceChargeType(String instanceChargeType) {
            this.instanceChargeType = instanceChargeType;
            return this;
        }
        public String getInstanceChargeType() {
            return this.instanceChargeType;
        }

        public DescribeRecommendInstanceTypeResponseBodyDataRecommendInstanceType setInstanceType(DescribeRecommendInstanceTypeResponseBodyDataRecommendInstanceTypeInstanceType instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public DescribeRecommendInstanceTypeResponseBodyDataRecommendInstanceTypeInstanceType getInstanceType() {
            return this.instanceType;
        }

        public DescribeRecommendInstanceTypeResponseBodyDataRecommendInstanceType setNetworkType(String networkType) {
            this.networkType = networkType;
            return this;
        }
        public String getNetworkType() {
            return this.networkType;
        }

        public DescribeRecommendInstanceTypeResponseBodyDataRecommendInstanceType setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public DescribeRecommendInstanceTypeResponseBodyDataRecommendInstanceType setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeRecommendInstanceTypeResponseBodyDataRecommendInstanceType setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

        public DescribeRecommendInstanceTypeResponseBodyDataRecommendInstanceType setSpotStrategy(String spotStrategy) {
            this.spotStrategy = spotStrategy;
            return this;
        }
        public String getSpotStrategy() {
            return this.spotStrategy;
        }

        public DescribeRecommendInstanceTypeResponseBodyDataRecommendInstanceType setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

        public DescribeRecommendInstanceTypeResponseBodyDataRecommendInstanceType setZones(DescribeRecommendInstanceTypeResponseBodyDataRecommendInstanceTypeZones zones) {
            this.zones = zones;
            return this;
        }
        public DescribeRecommendInstanceTypeResponseBodyDataRecommendInstanceTypeZones getZones() {
            return this.zones;
        }

    }

    public static class DescribeRecommendInstanceTypeResponseBodyData extends TeaModel {
        @NameInMap("RecommendInstanceType")
        public java.util.List<DescribeRecommendInstanceTypeResponseBodyDataRecommendInstanceType> recommendInstanceType;

        public static DescribeRecommendInstanceTypeResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeRecommendInstanceTypeResponseBodyData self = new DescribeRecommendInstanceTypeResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeRecommendInstanceTypeResponseBodyData setRecommendInstanceType(java.util.List<DescribeRecommendInstanceTypeResponseBodyDataRecommendInstanceType> recommendInstanceType) {
            this.recommendInstanceType = recommendInstanceType;
            return this;
        }
        public java.util.List<DescribeRecommendInstanceTypeResponseBodyDataRecommendInstanceType> getRecommendInstanceType() {
            return this.recommendInstanceType;
        }

    }

}
