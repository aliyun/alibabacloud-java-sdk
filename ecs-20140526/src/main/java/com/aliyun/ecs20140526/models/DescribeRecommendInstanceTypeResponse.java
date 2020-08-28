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

    public static class DescribeRecommendInstanceTypeResponseDataRecommendInstanceTypeZonesZoneNetworkTypes extends TeaModel {
        // NetworkType
        @NameInMap("NetworkType")
        @Validation(required = true)
        public java.util.List<String> networkType;

        public static DescribeRecommendInstanceTypeResponseDataRecommendInstanceTypeZonesZoneNetworkTypes build(java.util.Map<String, ?> map) throws Exception {
            DescribeRecommendInstanceTypeResponseDataRecommendInstanceTypeZonesZoneNetworkTypes self = new DescribeRecommendInstanceTypeResponseDataRecommendInstanceTypeZonesZoneNetworkTypes();
            return TeaModel.build(map, self);
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

    }

    public static class DescribeRecommendInstanceTypeResponseDataRecommendInstanceTypeZones extends TeaModel {
        @NameInMap("zone")
        @Validation(required = true)
        public java.util.List<DescribeRecommendInstanceTypeResponseDataRecommendInstanceTypeZonesZone> zone;

        public static DescribeRecommendInstanceTypeResponseDataRecommendInstanceTypeZones build(java.util.Map<String, ?> map) throws Exception {
            DescribeRecommendInstanceTypeResponseDataRecommendInstanceTypeZones self = new DescribeRecommendInstanceTypeResponseDataRecommendInstanceTypeZones();
            return TeaModel.build(map, self);
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

    }

    public static class DescribeRecommendInstanceTypeResponseData extends TeaModel {
        @NameInMap("RecommendInstanceType")
        @Validation(required = true)
        public java.util.List<DescribeRecommendInstanceTypeResponseDataRecommendInstanceType> recommendInstanceType;

        public static DescribeRecommendInstanceTypeResponseData build(java.util.Map<String, ?> map) throws Exception {
            DescribeRecommendInstanceTypeResponseData self = new DescribeRecommendInstanceTypeResponseData();
            return TeaModel.build(map, self);
        }

    }

}
