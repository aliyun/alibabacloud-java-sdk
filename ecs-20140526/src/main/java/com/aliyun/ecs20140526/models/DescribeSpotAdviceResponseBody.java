// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeSpotAdviceResponseBody extends TeaModel {
    // Details about preemptible instances in the zones of the specified region.
    // 
    // >  The return values are sorted based on the historical percentages of average preemptible instance prices relative to pay-as-you-go instance prices for instance types.
    @NameInMap("AvailableSpotZones")
    public DescribeSpotAdviceResponseBodyAvailableSpotZones availableSpotZones;

    // The ID of the region.
    @NameInMap("RegionId")
    public String regionId;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeSpotAdviceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSpotAdviceResponseBody self = new DescribeSpotAdviceResponseBody();
        return TeaModel.build(map, self);
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

    public DescribeSpotAdviceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeSpotAdviceResponseBodyAvailableSpotZonesAvailableSpotZoneAvailableSpotResourcesAvailableSpotResource extends TeaModel {
        // The percentage of the average preemptible instance relative to the pay-as-you-go instance price in the last 30 days. Unit: percent (%). Valid values: 1 to 100.
        // 
        // You can calculate the average preemptible instance price based on the return value. For example, if the pay-as-you-go instance price is 1 and the return value of this parameter is 20, the average preemptible instance price in the last 30 days is 0.2.
        @NameInMap("AverageSpotDiscount")
        public Integer averageSpotDiscount;

        // The instance type.
        @NameInMap("InstanceType")
        public String instanceType;

        // The release rate range of preemptible instances in the last 30 days, which corresponds to the `InterruptionRate` value. Valid values:
        // 
        // *   0-3%
        // *   3-5%
        // *   5-10%
        // *   10-100%
        @NameInMap("InterruptRateDesc")
        public String interruptRateDesc;

        // The average release rate of preemptible instances in the last 30 days. Unit: percent (%).
        @NameInMap("InterruptionRate")
        public Float interruptionRate;

        public static DescribeSpotAdviceResponseBodyAvailableSpotZonesAvailableSpotZoneAvailableSpotResourcesAvailableSpotResource build(java.util.Map<String, ?> map) throws Exception {
            DescribeSpotAdviceResponseBodyAvailableSpotZonesAvailableSpotZoneAvailableSpotResourcesAvailableSpotResource self = new DescribeSpotAdviceResponseBodyAvailableSpotZonesAvailableSpotZoneAvailableSpotResourcesAvailableSpotResource();
            return TeaModel.build(map, self);
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

        public DescribeSpotAdviceResponseBodyAvailableSpotZonesAvailableSpotZoneAvailableSpotResourcesAvailableSpotResource setInterruptRateDesc(String interruptRateDesc) {
            this.interruptRateDesc = interruptRateDesc;
            return this;
        }
        public String getInterruptRateDesc() {
            return this.interruptRateDesc;
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
        // Details about preemptible instances in the last 30 days, including release rates and percentages of average preemptible instance prices relative to pay-as-you-go instance prices.
        @NameInMap("AvailableSpotResources")
        public DescribeSpotAdviceResponseBodyAvailableSpotZonesAvailableSpotZoneAvailableSpotResources availableSpotResources;

        // The ID of the zone.
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
