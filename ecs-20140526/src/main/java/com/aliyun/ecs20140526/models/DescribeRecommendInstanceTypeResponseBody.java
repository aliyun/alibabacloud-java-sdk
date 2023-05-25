// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeRecommendInstanceTypeResponseBody extends TeaModel {
    /**
     * <p>The details of the recommended instance types.</p>
     */
    @NameInMap("Data")
    public DescribeRecommendInstanceTypeResponseBodyData data;

    /**
     * <p>The ID of the request.</p>
     */
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
        /**
         * <p>The number of vCPUs of the instance type.</p>
         */
        @NameInMap("Cores")
        public Integer cores;

        /**
         * <p>The generation of the instance family.</p>
         */
        @NameInMap("Generation")
        public String generation;

        /**
         * <p>The name of the instance type.</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        /**
         * <p>The instance family.</p>
         */
        @NameInMap("InstanceTypeFamily")
        public String instanceTypeFamily;

        /**
         * <p>The memory size of the instance type. Unit: MB.</p>
         */
        @NameInMap("Memory")
        public Integer memory;

        /**
         * <p>Indicates whether the instance type supports I/O optimization.</p>
         */
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
        /**
         * <p>The details of network types of instance types.</p>
         */
        @NameInMap("NetworkTypes")
        public DescribeRecommendInstanceTypeResponseBodyDataRecommendInstanceTypeZonesZoneNetworkTypes networkTypes;

        /**
         * <p>The ID of the zone where the instance type is available.</p>
         */
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
        /**
         * <p>The commodity code of the instance type.</p>
         */
        @NameInMap("CommodityCode")
        public String commodityCode;

        /**
         * <p>The billing method of the instance.</p>
         */
        @NameInMap("InstanceChargeType")
        public String instanceChargeType;

        /**
         * <p>The name of the instance type.</p>
         */
        @NameInMap("InstanceType")
        public DescribeRecommendInstanceTypeResponseBodyDataRecommendInstanceTypeInstanceType instanceType;

        /**
         * <p>The network type of the instance.</p>
         */
        @NameInMap("NetworkType")
        public String networkType;

        /**
         * <p>The priority based on which the system sorts the instance types.</p>
         */
        @NameInMap("Priority")
        public Integer priority;

        /**
         * <p>The region ID of the instance type.</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The scenarios in which the instance type is recommended.</p>
         */
        @NameInMap("Scene")
        public String scene;

        /**
         * <p>The bidding policy for the preemptible instance.</p>
         */
        @NameInMap("SpotStrategy")
        public String spotStrategy;

        /**
         * <p>The ID of the zone in which the instance type is available.</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        /**
         * <p>The details of the zones where the instance types resides.</p>
         */
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
