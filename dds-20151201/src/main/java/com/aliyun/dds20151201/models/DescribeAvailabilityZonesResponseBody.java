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
     * 
     * <strong>example:</strong>
     * <p>19A13A33-0FAD-5120-8AE1-B1636F74DD80</p>
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
         * <p>The ID of the region. You can call the <a href="https://help.aliyun.com/document_detail/61933.html">DescribeRegions</a> operation to query the latest available regions.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The ID of the zone.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing-f</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        /**
         * <p>The name of the zone.</p>
         * <p>The return value of the ZoneName parameter is in the language that is specified by the <strong>AcceptLanguage</strong> parameter. For example, if the value of the ZoneId parameter in the response is <strong>cn-hangzhou-h</strong>, the following values are returned for the ZoneName parameter:</p>
         * <ul>
         * <li>If the value of the <strong>AcceptLanguage</strong> parameter is <strong>zh</strong>, <strong>H</strong> is returned for the ZoneName parameter.</li>
         * <li>If the value of the <strong>AcceptLanguage</strong> parameter is <strong>en</strong>, <strong>Hangzhou Zone H</strong> is returned for the ZoneName parameter.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Hangzhou Zone H</p>
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
