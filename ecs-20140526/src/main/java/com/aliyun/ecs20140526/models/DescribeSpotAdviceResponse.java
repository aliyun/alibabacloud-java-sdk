// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeSpotAdviceResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("AvailableSpotZones")
    @Validation(required = true)
    public DescribeSpotAdviceResponseAvailableSpotZones availableSpotZones;

    public static DescribeSpotAdviceResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSpotAdviceResponse self = new DescribeSpotAdviceResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSpotAdviceResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSpotAdviceResponse setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeSpotAdviceResponse setAvailableSpotZones(DescribeSpotAdviceResponseAvailableSpotZones availableSpotZones) {
        this.availableSpotZones = availableSpotZones;
        return this;
    }
    public DescribeSpotAdviceResponseAvailableSpotZones getAvailableSpotZones() {
        return this.availableSpotZones;
    }

    public static class DescribeSpotAdviceResponseAvailableSpotZonesAvailableSpotZoneAvailableSpotResourcesAvailableSpotResource extends TeaModel {
        @NameInMap("InstanceType")
        @Validation(required = true)
        public String instanceType;

        @NameInMap("InterruptionRate")
        @Validation(required = true)
        public Float interruptionRate;

        @NameInMap("InterruptRateDesc")
        @Validation(required = true)
        public String interruptRateDesc;

        @NameInMap("AverageSpotDiscount")
        @Validation(required = true)
        public Integer averageSpotDiscount;

        public static DescribeSpotAdviceResponseAvailableSpotZonesAvailableSpotZoneAvailableSpotResourcesAvailableSpotResource build(java.util.Map<String, ?> map) throws Exception {
            DescribeSpotAdviceResponseAvailableSpotZonesAvailableSpotZoneAvailableSpotResourcesAvailableSpotResource self = new DescribeSpotAdviceResponseAvailableSpotZonesAvailableSpotZoneAvailableSpotResourcesAvailableSpotResource();
            return TeaModel.build(map, self);
        }

        public DescribeSpotAdviceResponseAvailableSpotZonesAvailableSpotZoneAvailableSpotResourcesAvailableSpotResource setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public DescribeSpotAdviceResponseAvailableSpotZonesAvailableSpotZoneAvailableSpotResourcesAvailableSpotResource setInterruptionRate(Float interruptionRate) {
            this.interruptionRate = interruptionRate;
            return this;
        }
        public Float getInterruptionRate() {
            return this.interruptionRate;
        }

        public DescribeSpotAdviceResponseAvailableSpotZonesAvailableSpotZoneAvailableSpotResourcesAvailableSpotResource setInterruptRateDesc(String interruptRateDesc) {
            this.interruptRateDesc = interruptRateDesc;
            return this;
        }
        public String getInterruptRateDesc() {
            return this.interruptRateDesc;
        }

        public DescribeSpotAdviceResponseAvailableSpotZonesAvailableSpotZoneAvailableSpotResourcesAvailableSpotResource setAverageSpotDiscount(Integer averageSpotDiscount) {
            this.averageSpotDiscount = averageSpotDiscount;
            return this;
        }
        public Integer getAverageSpotDiscount() {
            return this.averageSpotDiscount;
        }

    }

    public static class DescribeSpotAdviceResponseAvailableSpotZonesAvailableSpotZoneAvailableSpotResources extends TeaModel {
        @NameInMap("AvailableSpotResource")
        @Validation(required = true)
        public java.util.List<DescribeSpotAdviceResponseAvailableSpotZonesAvailableSpotZoneAvailableSpotResourcesAvailableSpotResource> availableSpotResource;

        public static DescribeSpotAdviceResponseAvailableSpotZonesAvailableSpotZoneAvailableSpotResources build(java.util.Map<String, ?> map) throws Exception {
            DescribeSpotAdviceResponseAvailableSpotZonesAvailableSpotZoneAvailableSpotResources self = new DescribeSpotAdviceResponseAvailableSpotZonesAvailableSpotZoneAvailableSpotResources();
            return TeaModel.build(map, self);
        }

        public DescribeSpotAdviceResponseAvailableSpotZonesAvailableSpotZoneAvailableSpotResources setAvailableSpotResource(java.util.List<DescribeSpotAdviceResponseAvailableSpotZonesAvailableSpotZoneAvailableSpotResourcesAvailableSpotResource> availableSpotResource) {
            this.availableSpotResource = availableSpotResource;
            return this;
        }
        public java.util.List<DescribeSpotAdviceResponseAvailableSpotZonesAvailableSpotZoneAvailableSpotResourcesAvailableSpotResource> getAvailableSpotResource() {
            return this.availableSpotResource;
        }

    }

    public static class DescribeSpotAdviceResponseAvailableSpotZonesAvailableSpotZone extends TeaModel {
        @NameInMap("ZoneId")
        @Validation(required = true)
        public String zoneId;

        @NameInMap("AvailableSpotResources")
        @Validation(required = true)
        public DescribeSpotAdviceResponseAvailableSpotZonesAvailableSpotZoneAvailableSpotResources availableSpotResources;

        public static DescribeSpotAdviceResponseAvailableSpotZonesAvailableSpotZone build(java.util.Map<String, ?> map) throws Exception {
            DescribeSpotAdviceResponseAvailableSpotZonesAvailableSpotZone self = new DescribeSpotAdviceResponseAvailableSpotZonesAvailableSpotZone();
            return TeaModel.build(map, self);
        }

        public DescribeSpotAdviceResponseAvailableSpotZonesAvailableSpotZone setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

        public DescribeSpotAdviceResponseAvailableSpotZonesAvailableSpotZone setAvailableSpotResources(DescribeSpotAdviceResponseAvailableSpotZonesAvailableSpotZoneAvailableSpotResources availableSpotResources) {
            this.availableSpotResources = availableSpotResources;
            return this;
        }
        public DescribeSpotAdviceResponseAvailableSpotZonesAvailableSpotZoneAvailableSpotResources getAvailableSpotResources() {
            return this.availableSpotResources;
        }

    }

    public static class DescribeSpotAdviceResponseAvailableSpotZones extends TeaModel {
        @NameInMap("AvailableSpotZone")
        @Validation(required = true)
        public java.util.List<DescribeSpotAdviceResponseAvailableSpotZonesAvailableSpotZone> availableSpotZone;

        public static DescribeSpotAdviceResponseAvailableSpotZones build(java.util.Map<String, ?> map) throws Exception {
            DescribeSpotAdviceResponseAvailableSpotZones self = new DescribeSpotAdviceResponseAvailableSpotZones();
            return TeaModel.build(map, self);
        }

        public DescribeSpotAdviceResponseAvailableSpotZones setAvailableSpotZone(java.util.List<DescribeSpotAdviceResponseAvailableSpotZonesAvailableSpotZone> availableSpotZone) {
            this.availableSpotZone = availableSpotZone;
            return this;
        }
        public java.util.List<DescribeSpotAdviceResponseAvailableSpotZonesAvailableSpotZone> getAvailableSpotZone() {
            return this.availableSpotZone;
        }

    }

}
