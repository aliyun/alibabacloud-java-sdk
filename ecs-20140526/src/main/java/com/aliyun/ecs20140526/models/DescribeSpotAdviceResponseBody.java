// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeSpotAdviceResponseBody extends TeaModel {
    /**
     * <p>Details about preemptible instances in the zones of the specified region.</p>
     * <br>
     * <p>> The return values are sorted based on the historical percentages of average prices of preemptible instances of the specified instance type relative to pay-as-you-go instance prices.</p>
     */
    @NameInMap("AvailableSpotZones")
    public DescribeSpotAdviceResponseBodyAvailableSpotZones availableSpotZones;

    /**
     * <p>The region ID.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The request ID.</p>
     */
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
        /**
         * <p>The percentage of the average preemptible instance price relative to the pay-as-you-go instance price in the last 30 days. Unit: %. Valid values: 1 to 100.</p>
         * <br>
         * <p>You can calculate the average preemptible instance price based on the return value. For example, if the pay-as-you-go instance price is 1 and the return value of this parameter is 20, the average preemptible instance price in the last 30 days is 0.2.</p>
         */
        @NameInMap("AverageSpotDiscount")
        public Integer averageSpotDiscount;

        /**
         * <p>The instance type.</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        /**
         * <p>The release rate range of preemptible instances in the last 30 days, which corresponds to the value of the `InterruptionRate` parameter. Valid values:</p>
         * <br>
         * <p>*   0-3%</p>
         * <p>*   3-5%</p>
         * <p>*   5-10%</p>
         * <p>*   10-100%</p>
         */
        @NameInMap("InterruptRateDesc")
        public String interruptRateDesc;

        /**
         * <p>The average release rate of preemptible instances in the last 30 days. Unit: %.</p>
         */
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
        /**
         * <p>Details about preemptible instances in the last 30 days, including the release rate of preemptible instances and percentages of average prices of preemptible instances relative to pay-as-you-go instance prices.</p>
         */
        @NameInMap("AvailableSpotResources")
        public DescribeSpotAdviceResponseBodyAvailableSpotZonesAvailableSpotZoneAvailableSpotResources availableSpotResources;

        /**
         * <p>The zone ID.</p>
         */
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
