// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeSpotAdviceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("AvailableSpotZones")
    public java.util.List<DescribeSpotAdviceResponseBodyAvailableSpotZones> availableSpotZones;

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

    public DescribeSpotAdviceResponseBody setAvailableSpotZones(java.util.List<DescribeSpotAdviceResponseBodyAvailableSpotZones> availableSpotZones) {
        this.availableSpotZones = availableSpotZones;
        return this;
    }
    public java.util.List<DescribeSpotAdviceResponseBodyAvailableSpotZones> getAvailableSpotZones() {
        return this.availableSpotZones;
    }

    public DescribeSpotAdviceResponseBody setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public static class DescribeSpotAdviceResponseBodyAvailableSpotZonesAvailableSpotResources extends TeaModel {
        @NameInMap("InterruptRateDesc")
        public String interruptRateDesc;

        @NameInMap("AverageSpotDiscount")
        public Integer averageSpotDiscount;

        @NameInMap("InstanceType")
        public String instanceType;

        @NameInMap("InterruptionRate")
        public Float interruptionRate;

        public static DescribeSpotAdviceResponseBodyAvailableSpotZonesAvailableSpotResources build(java.util.Map<String, ?> map) throws Exception {
            DescribeSpotAdviceResponseBodyAvailableSpotZonesAvailableSpotResources self = new DescribeSpotAdviceResponseBodyAvailableSpotZonesAvailableSpotResources();
            return TeaModel.build(map, self);
        }

        public DescribeSpotAdviceResponseBodyAvailableSpotZonesAvailableSpotResources setInterruptRateDesc(String interruptRateDesc) {
            this.interruptRateDesc = interruptRateDesc;
            return this;
        }
        public String getInterruptRateDesc() {
            return this.interruptRateDesc;
        }

        public DescribeSpotAdviceResponseBodyAvailableSpotZonesAvailableSpotResources setAverageSpotDiscount(Integer averageSpotDiscount) {
            this.averageSpotDiscount = averageSpotDiscount;
            return this;
        }
        public Integer getAverageSpotDiscount() {
            return this.averageSpotDiscount;
        }

        public DescribeSpotAdviceResponseBodyAvailableSpotZonesAvailableSpotResources setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public DescribeSpotAdviceResponseBodyAvailableSpotZonesAvailableSpotResources setInterruptionRate(Float interruptionRate) {
            this.interruptionRate = interruptionRate;
            return this;
        }
        public Float getInterruptionRate() {
            return this.interruptionRate;
        }

    }

    public static class DescribeSpotAdviceResponseBodyAvailableSpotZones extends TeaModel {
        @NameInMap("AvailableSpotResources")
        public java.util.List<DescribeSpotAdviceResponseBodyAvailableSpotZonesAvailableSpotResources> availableSpotResources;

        @NameInMap("ZoneId")
        public String zoneId;

        public static DescribeSpotAdviceResponseBodyAvailableSpotZones build(java.util.Map<String, ?> map) throws Exception {
            DescribeSpotAdviceResponseBodyAvailableSpotZones self = new DescribeSpotAdviceResponseBodyAvailableSpotZones();
            return TeaModel.build(map, self);
        }

        public DescribeSpotAdviceResponseBodyAvailableSpotZones setAvailableSpotResources(java.util.List<DescribeSpotAdviceResponseBodyAvailableSpotZonesAvailableSpotResources> availableSpotResources) {
            this.availableSpotResources = availableSpotResources;
            return this;
        }
        public java.util.List<DescribeSpotAdviceResponseBodyAvailableSpotZonesAvailableSpotResources> getAvailableSpotResources() {
            return this.availableSpotResources;
        }

        public DescribeSpotAdviceResponseBodyAvailableSpotZones setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

}
