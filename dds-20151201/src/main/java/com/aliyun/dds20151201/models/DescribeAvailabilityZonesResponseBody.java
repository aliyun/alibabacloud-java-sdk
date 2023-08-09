// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class DescribeAvailabilityZonesResponseBody extends TeaModel {
    /**
     * <p>The details of the zones in which you can create ApsaraDB for MongoDB instances.</p>
     */
    @NameInMap("AvailableZones")
    public java.util.List<DescribeAvailabilityZonesResponseBodyAvailableZones> availableZones;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeAvailabilityZonesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAvailabilityZonesResponseBody self = new DescribeAvailabilityZonesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAvailabilityZonesResponseBody setAvailableZones(java.util.List<DescribeAvailabilityZonesResponseBodyAvailableZones> availableZones) {
        this.availableZones = availableZones;
        return this;
    }
    public java.util.List<DescribeAvailabilityZonesResponseBodyAvailableZones> getAvailableZones() {
        return this.availableZones;
    }

    public DescribeAvailabilityZonesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeAvailabilityZonesResponseBodyAvailableZones extends TeaModel {
        /**
         * <p>The ID of the region. You can call the [DescribeRegions](~~61933~~) operation to query the latest available regions.</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The ID of the zone.</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        /**
         * <p>The name of the zone.</p>
         * <br>
         * <p>The return value of the ZoneName parameter is in the language that is specified by the **AcceptLanguage** parameter. For example, if the value of the ZoneId parameter in the response is **cn-hangzhou-h**, the following values are returned for the ZoneName parameter:</p>
         * <br>
         * <p>*   If the value of the **AcceptLanguage** parameter is **zh**, ** H** is returned for the ZoneName parameter.</p>
         * <p>*   If the value of the **AcceptLanguage** parameter is **en**, **Hangzhou Zone H** is returned for the ZoneName parameter.</p>
         */
        @NameInMap("ZoneName")
        public String zoneName;

        public static DescribeAvailabilityZonesResponseBodyAvailableZones build(java.util.Map<String, ?> map) throws Exception {
            DescribeAvailabilityZonesResponseBodyAvailableZones self = new DescribeAvailabilityZonesResponseBodyAvailableZones();
            return TeaModel.build(map, self);
        }

        public DescribeAvailabilityZonesResponseBodyAvailableZones setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeAvailabilityZonesResponseBodyAvailableZones setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

        public DescribeAvailabilityZonesResponseBodyAvailableZones setZoneName(String zoneName) {
            this.zoneName = zoneName;
            return this;
        }
        public String getZoneName() {
            return this.zoneName;
        }

    }

}
