// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeSpotAdviceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("AvailableSpotZones")
    public DescribeSpotAdviceResponseBodyAvailableSpotZones availableSpotZones;

    @NameInMap("RegionId")
    public String regionId;

    public static DescribeSpotAdviceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSpotAdviceResponseBody self = new DescribeSpotAdviceResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSpotAdviceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSpotAdviceResponseBody setAvailableSpotZones(DescribeSpotAdviceResponseBodyAvailableSpotZones availableSpotZones) {
        this.availableSpotZones = availableSpotZones;
        return this;
    }
    public DescribeSpotAdviceResponseBodyAvailableSpotZones getAvailableSpotZones() {
        return this.availableSpotZones;
    }

    public DescribeSpotAdviceResponseBody setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public static class DescribeSpotAdviceResponseBodyAvailableSpotZonesAvailableSpotZoneAvailableSpotResourcesAvailableSpotResource extends TeaModel {
        @NameInMap("InterruptRateDesc")
        public String interruptRateDesc;

        @NameInMap("AverageSpotDiscount")
        public Integer averageSpotDiscount;

        @NameInMap("InstanceType")
        public String instanceType;

        @NameInMap("InterruptionRate")
        public Float interruptionRate;

        public static DescribeSpotAdviceResponseBodyAvailableSpotZonesAvailableSpotZoneAvailableSpotResourcesAvailableSpotResource build(java.util.Map<String, ?> map) throws Exception {
            DescribeSpotAdviceResponseBodyAvailableSpotZonesAvailableSpotZoneAvailableSpotResourcesAvailableSpotResource self = new DescribeSpotAdviceResponseBodyAvailableSpotZonesAvailableSpotZoneAvailableSpotResourcesAvailableSpotResource();
            return TeaModel.build(map, self);
        }

        public DescribeSpotAdviceResponseBodyAvailableSpotZonesAvailableSpotZoneAvailableSpotResourcesAvailableSpotResource setInterruptRateDesc(String interruptRateDesc) {
            this.interruptRateDesc = interruptRateDesc;
            return this;
        }
        public String getInterruptRateDesc() {
            return this.interruptRateDesc;
        }

        public DescribeSpotAdviceResponseBodyAvailableSpotZonesAvailableSpotZoneAvailableSpotResourcesAvailableSpotResource setAverageSpotDiscount(Integer averageSpotDiscount) {
            this.averageSpotDiscount = averageSpotDiscount;
            return this;
        }
        public Integer getAverageSpotDiscount() {
            return this.averageSpotDiscount;
        }

        public DescribeSpotAdviceResponseBodyAvailableSpotZonesAvailableSpotZoneAvailableSpotResourcesAvailableSpotResource setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public DescribeSpotAdviceResponseBodyAvailableSpotZonesAvailableSpotZoneAvailableSpotResourcesAvailableSpotResource setInterruptionRate(Float interruptionRate) {
            this.interruptionRate = interruptionRate;
            return this;
        }
        public Float getInterruptionRate() {
            return this.interruptionRate;
        }

    }

    public static class DescribeSpotAdviceResponseBodyAvailableSpotZonesAvailableSpotZoneAvailableSpotResources extends TeaModel {
        @NameInMap("AvailableSpotResource")
        public java.util.List<DescribeSpotAdviceResponseBodyAvailableSpotZonesAvailableSpotZoneAvailableSpotResourcesAvailableSpotResource> availableSpotResource;

        public static DescribeSpotAdviceResponseBodyAvailableSpotZonesAvailableSpotZoneAvailableSpotResources build(java.util.Map<String, ?> map) throws Exception {
            DescribeSpotAdviceResponseBodyAvailableSpotZonesAvailableSpotZoneAvailableSpotResources self = new DescribeSpotAdviceResponseBodyAvailableSpotZonesAvailableSpotZoneAvailableSpotResources();
            return TeaModel.build(map, self);
        }

        public DescribeSpotAdviceResponseBodyAvailableSpotZonesAvailableSpotZoneAvailableSpotResources setAvailableSpotResource(java.util.List<DescribeSpotAdviceResponseBodyAvailableSpotZonesAvailableSpotZoneAvailableSpotResourcesAvailableSpotResource> availableSpotResource) {
            this.availableSpotResource = availableSpotResource;
            return this;
        }
        public java.util.List<DescribeSpotAdviceResponseBodyAvailableSpotZonesAvailableSpotZoneAvailableSpotResourcesAvailableSpotResource> getAvailableSpotResource() {
            return this.availableSpotResource;
        }

    }

    public static class DescribeSpotAdviceResponseBodyAvailableSpotZonesAvailableSpotZone extends TeaModel {
        @NameInMap("AvailableSpotResources")
        public DescribeSpotAdviceResponseBodyAvailableSpotZonesAvailableSpotZoneAvailableSpotResources availableSpotResources;

        @NameInMap("ZoneId")
        public String zoneId;

        public static DescribeSpotAdviceResponseBodyAvailableSpotZonesAvailableSpotZone build(java.util.Map<String, ?> map) throws Exception {
            DescribeSpotAdviceResponseBodyAvailableSpotZonesAvailableSpotZone self = new DescribeSpotAdviceResponseBodyAvailableSpotZonesAvailableSpotZone();
            return TeaModel.build(map, self);
        }

        public DescribeSpotAdviceResponseBodyAvailableSpotZonesAvailableSpotZone setAvailableSpotResources(DescribeSpotAdviceResponseBodyAvailableSpotZonesAvailableSpotZoneAvailableSpotResources availableSpotResources) {
            this.availableSpotResources = availableSpotResources;
            return this;
        }
        public DescribeSpotAdviceResponseBodyAvailableSpotZonesAvailableSpotZoneAvailableSpotResources getAvailableSpotResources() {
            return this.availableSpotResources;
        }

        public DescribeSpotAdviceResponseBodyAvailableSpotZonesAvailableSpotZone setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

    public static class DescribeSpotAdviceResponseBodyAvailableSpotZones extends TeaModel {
        @NameInMap("AvailableSpotZone")
        public java.util.List<DescribeSpotAdviceResponseBodyAvailableSpotZonesAvailableSpotZone> availableSpotZone;

        public static DescribeSpotAdviceResponseBodyAvailableSpotZones build(java.util.Map<String, ?> map) throws Exception {
            DescribeSpotAdviceResponseBodyAvailableSpotZones self = new DescribeSpotAdviceResponseBodyAvailableSpotZones();
            return TeaModel.build(map, self);
        }

        public DescribeSpotAdviceResponseBodyAvailableSpotZones setAvailableSpotZone(java.util.List<DescribeSpotAdviceResponseBodyAvailableSpotZonesAvailableSpotZone> availableSpotZone) {
            this.availableSpotZone = availableSpotZone;
            return this;
        }
        public java.util.List<DescribeSpotAdviceResponseBodyAvailableSpotZonesAvailableSpotZone> getAvailableSpotZone() {
            return this.availableSpotZone;
        }

    }

}
