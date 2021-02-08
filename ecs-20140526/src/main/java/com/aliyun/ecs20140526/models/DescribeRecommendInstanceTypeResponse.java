// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeRecommendInstanceTypeResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public DescribeRecommendInstanceTypeResponseData data;

    public static DescribeRecommendInstanceTypeResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRecommendInstanceTypeResponse self = new DescribeRecommendInstanceTypeResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRecommendInstanceTypeResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeRecommendInstanceTypeResponse setData(DescribeRecommendInstanceTypeResponseData data) {
        this.data = data;
        return this;
    }
    public DescribeRecommendInstanceTypeResponseData getData() {
        return this.data;
    }

    public static class DescribeRecommendInstanceTypeResponseDataRecommendInstanceTypeZonesZoneNetworkTypes extends TeaModel {
        // NetworkType
        @NameInMap("NetworkType")
        @Validation(required = true)
        public java.util.List<String> networkType;

        public static DescribeRecommendInstanceTypeResponseDataRecommendInstanceTypeZonesZoneNetworkTypes build(java.util.Map<String, ?> map) throws Exception {
            DescribeRecommendInstanceTypeResponseDataRecommendInstanceTypeZonesZoneNetworkTypes self = new DescribeRecommendInstanceTypeResponseDataRecommendInstanceTypeZonesZoneNetworkTypes();
            return TeaModel.build(map, self);
        }

        public DescribeRecommendInstanceTypeResponseDataRecommendInstanceTypeZonesZoneNetworkTypes setNetworkType(java.util.List<String> networkType) {
            this.networkType = networkType;
            return this;
        }
        public java.util.List<String> getNetworkType() {
            return this.networkType;
        }

    }

    public static class DescribeRecommendInstanceTypeResponseDataRecommendInstanceTypeZonesZone extends TeaModel {
        @NameInMap("ZoneNo")
        @Validation(required = true)
        public String zoneNo;

        @NameInMap("NetworkTypes")
        @Validation(required = true)
        public DescribeRecommendInstanceTypeResponseDataRecommendInstanceTypeZonesZoneNetworkTypes networkTypes;

        public static DescribeRecommendInstanceTypeResponseDataRecommendInstanceTypeZonesZone build(java.util.Map<String, ?> map) throws Exception {
            DescribeRecommendInstanceTypeResponseDataRecommendInstanceTypeZonesZone self = new DescribeRecommendInstanceTypeResponseDataRecommendInstanceTypeZonesZone();
            return TeaModel.build(map, self);
        }

        public DescribeRecommendInstanceTypeResponseDataRecommendInstanceTypeZonesZone setZoneNo(String zoneNo) {
            this.zoneNo = zoneNo;
            return this;
        }
        public String getZoneNo() {
            return this.zoneNo;
        }

        public DescribeRecommendInstanceTypeResponseDataRecommendInstanceTypeZonesZone setNetworkTypes(DescribeRecommendInstanceTypeResponseDataRecommendInstanceTypeZonesZoneNetworkTypes networkTypes) {
            this.networkTypes = networkTypes;
            return this;
        }
        public DescribeRecommendInstanceTypeResponseDataRecommendInstanceTypeZonesZoneNetworkTypes getNetworkTypes() {
            return this.networkTypes;
        }

    }

    public static class DescribeRecommendInstanceTypeResponseDataRecommendInstanceTypeZones extends TeaModel {
        @NameInMap("zone")
        @Validation(required = true)
        public java.util.List<DescribeRecommendInstanceTypeResponseDataRecommendInstanceTypeZonesZone> zone;

        public static DescribeRecommendInstanceTypeResponseDataRecommendInstanceTypeZones build(java.util.Map<String, ?> map) throws Exception {
            DescribeRecommendInstanceTypeResponseDataRecommendInstanceTypeZones self = new DescribeRecommendInstanceTypeResponseDataRecommendInstanceTypeZones();
            return TeaModel.build(map, self);
        }

        public DescribeRecommendInstanceTypeResponseDataRecommendInstanceTypeZones setZone(java.util.List<DescribeRecommendInstanceTypeResponseDataRecommendInstanceTypeZonesZone> zone) {
            this.zone = zone;
            return this;
        }
        public java.util.List<DescribeRecommendInstanceTypeResponseDataRecommendInstanceTypeZonesZone> getZone() {
            return this.zone;
        }

    }

    public static class DescribeRecommendInstanceTypeResponseDataRecommendInstanceTypeInstanceType extends TeaModel {
        @NameInMap("Generation")
        @Validation(required = true)
        public String generation;

        @NameInMap("InstanceTypeFamily")
        @Validation(required = true)
        public String instanceTypeFamily;

        @NameInMap("InstanceType")
        @Validation(required = true)
        public String instanceType;

        @NameInMap("SupportIoOptimized")
        @Validation(required = true)
        public String supportIoOptimized;

        @NameInMap("Cores")
        @Validation(required = true)
        public Integer cores;

        @NameInMap("Memory")
        @Validation(required = true)
        public Integer memory;

        public static DescribeRecommendInstanceTypeResponseDataRecommendInstanceTypeInstanceType build(java.util.Map<String, ?> map) throws Exception {
            DescribeRecommendInstanceTypeResponseDataRecommendInstanceTypeInstanceType self = new DescribeRecommendInstanceTypeResponseDataRecommendInstanceTypeInstanceType();
            return TeaModel.build(map, self);
        }

        public DescribeRecommendInstanceTypeResponseDataRecommendInstanceTypeInstanceType setGeneration(String generation) {
            this.generation = generation;
            return this;
        }
        public String getGeneration() {
            return this.generation;
        }

        public DescribeRecommendInstanceTypeResponseDataRecommendInstanceTypeInstanceType setInstanceTypeFamily(String instanceTypeFamily) {
            this.instanceTypeFamily = instanceTypeFamily;
            return this;
        }
        public String getInstanceTypeFamily() {
            return this.instanceTypeFamily;
        }

        public DescribeRecommendInstanceTypeResponseDataRecommendInstanceTypeInstanceType setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public DescribeRecommendInstanceTypeResponseDataRecommendInstanceTypeInstanceType setSupportIoOptimized(String supportIoOptimized) {
            this.supportIoOptimized = supportIoOptimized;
            return this;
        }
        public String getSupportIoOptimized() {
            return this.supportIoOptimized;
        }

        public DescribeRecommendInstanceTypeResponseDataRecommendInstanceTypeInstanceType setCores(Integer cores) {
            this.cores = cores;
            return this;
        }
        public Integer getCores() {
            return this.cores;
        }

        public DescribeRecommendInstanceTypeResponseDataRecommendInstanceTypeInstanceType setMemory(Integer memory) {
            this.memory = memory;
            return this;
        }
        public Integer getMemory() {
            return this.memory;
        }

    }

    public static class DescribeRecommendInstanceTypeResponseDataRecommendInstanceType extends TeaModel {
        @NameInMap("RegionId")
        @Validation(required = true)
        public String regionId;

        @NameInMap("CommodityCode")
        @Validation(required = true)
        public String commodityCode;

        @NameInMap("Scene")
        @Validation(required = true)
        public String scene;

        @NameInMap("InstanceChargeType")
        @Validation(required = true)
        public String instanceChargeType;

        @NameInMap("SpotStrategy")
        @Validation(required = true)
        public String spotStrategy;

        @NameInMap("Priority")
        @Validation(required = true)
        public Integer priority;

        @NameInMap("ZoneId")
        @Validation(required = true)
        public String zoneId;

        @NameInMap("NetworkType")
        @Validation(required = true)
        public String networkType;

        @NameInMap("Zones")
        @Validation(required = true)
        public DescribeRecommendInstanceTypeResponseDataRecommendInstanceTypeZones zones;

        @NameInMap("InstanceType")
        @Validation(required = true)
        public DescribeRecommendInstanceTypeResponseDataRecommendInstanceTypeInstanceType instanceType;

        public static DescribeRecommendInstanceTypeResponseDataRecommendInstanceType build(java.util.Map<String, ?> map) throws Exception {
            DescribeRecommendInstanceTypeResponseDataRecommendInstanceType self = new DescribeRecommendInstanceTypeResponseDataRecommendInstanceType();
            return TeaModel.build(map, self);
        }

        public DescribeRecommendInstanceTypeResponseDataRecommendInstanceType setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeRecommendInstanceTypeResponseDataRecommendInstanceType setCommodityCode(String commodityCode) {
            this.commodityCode = commodityCode;
            return this;
        }
        public String getCommodityCode() {
            return this.commodityCode;
        }

        public DescribeRecommendInstanceTypeResponseDataRecommendInstanceType setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

        public DescribeRecommendInstanceTypeResponseDataRecommendInstanceType setInstanceChargeType(String instanceChargeType) {
            this.instanceChargeType = instanceChargeType;
            return this;
        }
        public String getInstanceChargeType() {
            return this.instanceChargeType;
        }

        public DescribeRecommendInstanceTypeResponseDataRecommendInstanceType setSpotStrategy(String spotStrategy) {
            this.spotStrategy = spotStrategy;
            return this;
        }
        public String getSpotStrategy() {
            return this.spotStrategy;
        }

        public DescribeRecommendInstanceTypeResponseDataRecommendInstanceType setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public DescribeRecommendInstanceTypeResponseDataRecommendInstanceType setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

        public DescribeRecommendInstanceTypeResponseDataRecommendInstanceType setNetworkType(String networkType) {
            this.networkType = networkType;
            return this;
        }
        public String getNetworkType() {
            return this.networkType;
        }

        public DescribeRecommendInstanceTypeResponseDataRecommendInstanceType setZones(DescribeRecommendInstanceTypeResponseDataRecommendInstanceTypeZones zones) {
            this.zones = zones;
            return this;
        }
        public DescribeRecommendInstanceTypeResponseDataRecommendInstanceTypeZones getZones() {
            return this.zones;
        }

        public DescribeRecommendInstanceTypeResponseDataRecommendInstanceType setInstanceType(DescribeRecommendInstanceTypeResponseDataRecommendInstanceTypeInstanceType instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public DescribeRecommendInstanceTypeResponseDataRecommendInstanceTypeInstanceType getInstanceType() {
            return this.instanceType;
        }

    }

    public static class DescribeRecommendInstanceTypeResponseData extends TeaModel {
        @NameInMap("RecommendInstanceType")
        @Validation(required = true)
        public java.util.List<DescribeRecommendInstanceTypeResponseDataRecommendInstanceType> recommendInstanceType;

        public static DescribeRecommendInstanceTypeResponseData build(java.util.Map<String, ?> map) throws Exception {
            DescribeRecommendInstanceTypeResponseData self = new DescribeRecommendInstanceTypeResponseData();
            return TeaModel.build(map, self);
        }

        public DescribeRecommendInstanceTypeResponseData setRecommendInstanceType(java.util.List<DescribeRecommendInstanceTypeResponseDataRecommendInstanceType> recommendInstanceType) {
            this.recommendInstanceType = recommendInstanceType;
            return this;
        }
        public java.util.List<DescribeRecommendInstanceTypeResponseDataRecommendInstanceType> getRecommendInstanceType() {
            return this.recommendInstanceType;
        }

    }

}
