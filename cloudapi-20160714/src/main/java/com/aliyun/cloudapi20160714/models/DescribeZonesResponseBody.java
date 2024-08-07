// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeZonesResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>9324B68F-9863-5722-A0FD-0798E2B02A0E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The zones available in the current region.</p>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;Zone\&quot;: [{\&quot;ZoneId\&quot;: \&quot;cn-hangzhou-i\&quot;}]}</p>
     */
    @NameInMap("Zones")
    public DescribeZonesResponseBodyZones zones;

    public static DescribeZonesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeZonesResponseBody self = new DescribeZonesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeZonesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeZonesResponseBody setZones(DescribeZonesResponseBodyZones zones) {
        this.zones = zones;
        return this;
    }
    public DescribeZonesResponseBodyZones getZones() {
        return this.zones;
    }

    public static class DescribeZonesResponseBodyZonesZone extends TeaModel {
        /**
         * <p>The name of the zone.</p>
         * 
         * <strong>example:</strong>
         * <p>China (Hangzhou) Multi-zone 2(j,g)</p>
         */
        @NameInMap("LocalName")
        public String localName;

        /**
         * <p>The ID of the zone.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-MAZ2(j,g)</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        public static DescribeZonesResponseBodyZonesZone build(java.util.Map<String, ?> map) throws Exception {
            DescribeZonesResponseBodyZonesZone self = new DescribeZonesResponseBodyZonesZone();
            return TeaModel.build(map, self);
        }

        public DescribeZonesResponseBodyZonesZone setLocalName(String localName) {
            this.localName = localName;
            return this;
        }
        public String getLocalName() {
            return this.localName;
        }

        public DescribeZonesResponseBodyZonesZone setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

    public static class DescribeZonesResponseBodyZones extends TeaModel {
        @NameInMap("Zone")
        public java.util.List<DescribeZonesResponseBodyZonesZone> zone;

        public static DescribeZonesResponseBodyZones build(java.util.Map<String, ?> map) throws Exception {
            DescribeZonesResponseBodyZones self = new DescribeZonesResponseBodyZones();
            return TeaModel.build(map, self);
        }

        public DescribeZonesResponseBodyZones setZone(java.util.List<DescribeZonesResponseBodyZonesZone> zone) {
            this.zone = zone;
            return this;
        }
        public java.util.List<DescribeZonesResponseBodyZonesZone> getZone() {
            return this.zone;
        }

    }

}
