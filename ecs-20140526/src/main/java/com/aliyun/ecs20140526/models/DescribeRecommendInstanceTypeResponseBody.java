// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeRecommendInstanceTypeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public java.util.List<DescribeRecommendInstanceTypeResponseBodyData> data;

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

    public DescribeRecommendInstanceTypeResponseBody setData(java.util.List<DescribeRecommendInstanceTypeResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribeRecommendInstanceTypeResponseBodyData> getData() {
        return this.data;
    }

    public static class DescribeRecommendInstanceTypeResponseBodyDataZones extends TeaModel {
        @NameInMap("ZoneNo")
        public String zoneNo;

        @NameInMap("NetworkTypes")
        public java.util.List<String> networkTypes;

        public static DescribeRecommendInstanceTypeResponseBodyDataZones build(java.util.Map<String, ?> map) throws Exception {
            DescribeRecommendInstanceTypeResponseBodyDataZones self = new DescribeRecommendInstanceTypeResponseBodyDataZones();
            return TeaModel.build(map, self);
        }

        public DescribeRecommendInstanceTypeResponseBodyDataZones setZoneNo(String zoneNo) {
            this.zoneNo = zoneNo;
            return this;
        }
        public String getZoneNo() {
            return this.zoneNo;
        }

        public DescribeRecommendInstanceTypeResponseBodyDataZones setNetworkTypes(java.util.List<String> networkTypes) {
            this.networkTypes = networkTypes;
            return this;
        }
        public java.util.List<String> getNetworkTypes() {
            return this.networkTypes;
        }

    }

    public static class DescribeRecommendInstanceTypeResponseBodyDataInstanceType extends TeaModel {
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

        public static DescribeRecommendInstanceTypeResponseBodyDataInstanceType build(java.util.Map<String, ?> map) throws Exception {
            DescribeRecommendInstanceTypeResponseBodyDataInstanceType self = new DescribeRecommendInstanceTypeResponseBodyDataInstanceType();
            return TeaModel.build(map, self);
        }

        public DescribeRecommendInstanceTypeResponseBodyDataInstanceType setSupportIoOptimized(String supportIoOptimized) {
            this.supportIoOptimized = supportIoOptimized;
            return this;
        }
        public String getSupportIoOptimized() {
            return this.supportIoOptimized;
        }

        public DescribeRecommendInstanceTypeResponseBodyDataInstanceType setCores(Integer cores) {
            this.cores = cores;
            return this;
        }
        public Integer getCores() {
            return this.cores;
        }

        public DescribeRecommendInstanceTypeResponseBodyDataInstanceType setMemory(Integer memory) {
            this.memory = memory;
            return this;
        }
        public Integer getMemory() {
            return this.memory;
        }

        public DescribeRecommendInstanceTypeResponseBodyDataInstanceType setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public DescribeRecommendInstanceTypeResponseBodyDataInstanceType setInstanceTypeFamily(String instanceTypeFamily) {
            this.instanceTypeFamily = instanceTypeFamily;
            return this;
        }
        public String getInstanceTypeFamily() {
            return this.instanceTypeFamily;
        }

        public DescribeRecommendInstanceTypeResponseBodyDataInstanceType setGeneration(String generation) {
            this.generation = generation;
            return this;
        }
        public String getGeneration() {
            return this.generation;
        }

    }

    public static class DescribeRecommendInstanceTypeResponseBodyData extends TeaModel {
        @NameInMap("Zones")
        public java.util.List<DescribeRecommendInstanceTypeResponseBodyDataZones> zones;

        @NameInMap("CommodityCode")
        public String commodityCode;

        @NameInMap("Priority")
        public Integer priority;

        @NameInMap("InstanceType")
        public DescribeRecommendInstanceTypeResponseBodyDataInstanceType instanceType;

        @NameInMap("Scene")
        public String scene;

        @NameInMap("SpotStrategy")
        public String spotStrategy;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("InstanceChargeType")
        public String instanceChargeType;

        public static DescribeRecommendInstanceTypeResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeRecommendInstanceTypeResponseBodyData self = new DescribeRecommendInstanceTypeResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeRecommendInstanceTypeResponseBodyData setZones(java.util.List<DescribeRecommendInstanceTypeResponseBodyDataZones> zones) {
            this.zones = zones;
            return this;
        }
        public java.util.List<DescribeRecommendInstanceTypeResponseBodyDataZones> getZones() {
            return this.zones;
        }

        public DescribeRecommendInstanceTypeResponseBodyData setCommodityCode(String commodityCode) {
            this.commodityCode = commodityCode;
            return this;
        }
        public String getCommodityCode() {
            return this.commodityCode;
        }

        public DescribeRecommendInstanceTypeResponseBodyData setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public DescribeRecommendInstanceTypeResponseBodyData setInstanceType(DescribeRecommendInstanceTypeResponseBodyDataInstanceType instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public DescribeRecommendInstanceTypeResponseBodyDataInstanceType getInstanceType() {
            return this.instanceType;
        }

        public DescribeRecommendInstanceTypeResponseBodyData setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

        public DescribeRecommendInstanceTypeResponseBodyData setSpotStrategy(String spotStrategy) {
            this.spotStrategy = spotStrategy;
            return this;
        }
        public String getSpotStrategy() {
            return this.spotStrategy;
        }

        public DescribeRecommendInstanceTypeResponseBodyData setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeRecommendInstanceTypeResponseBodyData setInstanceChargeType(String instanceChargeType) {
            this.instanceChargeType = instanceChargeType;
            return this;
        }
        public String getInstanceChargeType() {
            return this.instanceChargeType;
        }

    }

}
