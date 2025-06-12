// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeSpotAdviceResponseBody extends TeaModel {
    /**
     * <p>Details about spot instances in the zones of the specified region.</p>
     * <blockquote>
     * <p> The return values are sorted based on the historical percentages of average spot instance prices relative to pay-as-you-go instance prices for instance types.</p>
     * </blockquote>
     */
    @NameInMap("AvailableSpotZones")
    public DescribeSpotAdviceResponseBodyAvailableSpotZones availableSpotZones;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
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
         * <p>The percentage of the average spot instance price relative to the pay-as-you-go instance price in the previous 30 days. Unit: %. Valid values: 1 to 100.</p>
         * <p>You can calculate the average spot instance price based on the return value. For example, if the pay-as-you-go instance price is 1 and the return value of this parameter is 20, the average spot instance price in the previous 30 days is 0.2.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("AverageSpotDiscount")
        public Integer averageSpotDiscount;

        /**
         * <p>The instance type.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs.c5.large</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        /**
         * <p>The release rate range of spot instances in the previous 30 days, which corresponds to the <code>InterruptionRate</code> value. Valid values:</p>
         * <ul>
         * <li>0-3%</li>
         * <li>3-5%</li>
         * <li>5-10%</li>
         * <li>10-100%</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0-3%</p>
         */
        @NameInMap("InterruptRateDesc")
        public String interruptRateDesc;

        /**
         * <p>The average release rate of spot instances in the previous 30 days. Unit: %.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
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
         * <p>Details about spot instances in the previous 30 days, including the release rate of spot instances and percentages of average spot instance prices relative to pay-as-you-go instance prices.</p>
         */
        @NameInMap("AvailableSpotResources")
        public DescribeSpotAdviceResponseBodyAvailableSpotZonesAvailableSpotZoneAvailableSpotResources availableSpotResources;

        /**
         * <p>The zone ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-i</p>
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
