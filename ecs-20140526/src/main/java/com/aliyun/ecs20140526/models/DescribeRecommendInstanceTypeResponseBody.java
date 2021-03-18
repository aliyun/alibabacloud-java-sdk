// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeRecommendInstanceTypeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public DescribeRecommendInstanceTypeResponseBodyData data;

    public static DescribeRecommendInstanceTypeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRecommendInstanceTypeResponseBody self = new DescribeRecommendInstanceTypeResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRecommendInstanceTypeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeRecommendInstanceTypeResponseBody setData(DescribeRecommendInstanceTypeResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeRecommendInstanceTypeResponseBodyData getData() {
        return this.data;
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
        @NameInMap("ZoneNo")
        public String zoneNo;

        @NameInMap("NetworkTypes")
        public DescribeRecommendInstanceTypeResponseBodyDataRecommendInstanceTypeZonesZoneNetworkTypes networkTypes;

        public static DescribeRecommendInstanceTypeResponseBodyDataRecommendInstanceTypeZonesZone build(java.util.Map<String, ?> map) throws Exception {
            DescribeRecommendInstanceTypeResponseBodyDataRecommendInstanceTypeZonesZone self = new DescribeRecommendInstanceTypeResponseBodyDataRecommendInstanceTypeZonesZone();
            return TeaModel.build(map, self);
        }

        public DescribeRecommendInstanceTypeResponseBodyDataRecommendInstanceTypeZonesZone setZoneNo(String zoneNo) {
            this.zoneNo = zoneNo;
            return this;
        }
        public String getZoneNo() {
            return this.zoneNo;
        }

        public DescribeRecommendInstanceTypeResponseBodyDataRecommendInstanceTypeZonesZone setNetworkTypes(DescribeRecommendInstanceTypeResponseBodyDataRecommendInstanceTypeZonesZoneNetworkTypes networkTypes) {
            this.networkTypes = networkTypes;
            return this;
        }
        public DescribeRecommendInstanceTypeResponseBodyDataRecommendInstanceTypeZonesZoneNetworkTypes getNetworkTypes() {
            return this.networkTypes;
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

    public static class DescribeRecommendInstanceTypeResponseBodyDataRecommendInstanceTypeInstanceType extends TeaModel {
        @NameInMap("SupportIoOptimized")
        public String supportIoOptimized;

        @NameInMap("Cores")
        public Integer cores;

        @NameInMap("Memory")
        public Integer memory;

        @NameInMap("InstanceType")
        public String instanceType;

        @NameInMap("InstanceTypeFamily")
        public String instanceTypeFamily;

        @NameInMap("Generation")
        public String generation;

        public static DescribeRecommendInstanceTypeResponseBodyDataRecommendInstanceTypeInstanceType build(java.util.Map<String, ?> map) throws Exception {
            DescribeRecommendInstanceTypeResponseBodyDataRecommendInstanceTypeInstanceType self = new DescribeRecommendInstanceTypeResponseBodyDataRecommendInstanceTypeInstanceType();
            return TeaModel.build(map, self);
        }

        public DescribeRecommendInstanceTypeResponseBodyDataRecommendInstanceTypeInstanceType setSupportIoOptimized(String supportIoOptimized) {
            this.supportIoOptimized = supportIoOptimized;
            return this;
        }
        public String getSupportIoOptimized() {
            return this.supportIoOptimized;
        }

        public DescribeRecommendInstanceTypeResponseBodyDataRecommendInstanceTypeInstanceType setCores(Integer cores) {
            this.cores = cores;
            return this;
        }
        public Integer getCores() {
            return this.cores;
        }

        public DescribeRecommendInstanceTypeResponseBodyDataRecommendInstanceTypeInstanceType setMemory(Integer memory) {
            this.memory = memory;
            return this;
        }
        public Integer getMemory() {
            return this.memory;
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

        public DescribeRecommendInstanceTypeResponseBodyDataRecommendInstanceTypeInstanceType setGeneration(String generation) {
            this.generation = generation;
            return this;
        }
        public String getGeneration() {
            return this.generation;
        }

    }

    public static class DescribeRecommendInstanceTypeResponseBodyDataRecommendInstanceType extends TeaModel {
        @NameInMap("Zones")
        public DescribeRecommendInstanceTypeResponseBodyDataRecommendInstanceTypeZones zones;

        @NameInMap("CommodityCode")
        public String commodityCode;

        @NameInMap("ZoneId")
        public String zoneId;

        @NameInMap("Priority")
        public Integer priority;

        @NameInMap("NetworkType")
        public String networkType;

        @NameInMap("InstanceType")
        public DescribeRecommendInstanceTypeResponseBodyDataRecommendInstanceTypeInstanceType instanceType;

        @NameInMap("Scene")
        public String scene;

        @NameInMap("SpotStrategy")
        public String spotStrategy;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("InstanceChargeType")
        public String instanceChargeType;

        public static DescribeRecommendInstanceTypeResponseBodyDataRecommendInstanceType build(java.util.Map<String, ?> map) throws Exception {
            DescribeRecommendInstanceTypeResponseBodyDataRecommendInstanceType self = new DescribeRecommendInstanceTypeResponseBodyDataRecommendInstanceType();
            return TeaModel.build(map, self);
        }

        public DescribeRecommendInstanceTypeResponseBodyDataRecommendInstanceType setZones(DescribeRecommendInstanceTypeResponseBodyDataRecommendInstanceTypeZones zones) {
            this.zones = zones;
            return this;
        }
        public DescribeRecommendInstanceTypeResponseBodyDataRecommendInstanceTypeZones getZones() {
            return this.zones;
        }

        public DescribeRecommendInstanceTypeResponseBodyDataRecommendInstanceType setCommodityCode(String commodityCode) {
            this.commodityCode = commodityCode;
            return this;
        }
        public String getCommodityCode() {
            return this.commodityCode;
        }

        public DescribeRecommendInstanceTypeResponseBodyDataRecommendInstanceType setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

        public DescribeRecommendInstanceTypeResponseBodyDataRecommendInstanceType setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public DescribeRecommendInstanceTypeResponseBodyDataRecommendInstanceType setNetworkType(String networkType) {
            this.networkType = networkType;
            return this;
        }
        public String getNetworkType() {
            return this.networkType;
        }

        public DescribeRecommendInstanceTypeResponseBodyDataRecommendInstanceType setInstanceType(DescribeRecommendInstanceTypeResponseBodyDataRecommendInstanceTypeInstanceType instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public DescribeRecommendInstanceTypeResponseBodyDataRecommendInstanceTypeInstanceType getInstanceType() {
            return this.instanceType;
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

        public DescribeRecommendInstanceTypeResponseBodyDataRecommendInstanceType setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeRecommendInstanceTypeResponseBodyDataRecommendInstanceType setInstanceChargeType(String instanceChargeType) {
            this.instanceChargeType = instanceChargeType;
            return this;
        }
        public String getInstanceChargeType() {
            return this.instanceChargeType;
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
