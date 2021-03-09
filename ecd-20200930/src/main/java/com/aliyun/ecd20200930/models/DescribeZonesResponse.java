// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeZonesResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Zones")
    @Validation(required = true)
    public java.util.List<DescribeZonesResponseZones> zones;

    public static DescribeZonesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeZonesResponse self = new DescribeZonesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeZonesResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeZonesResponse setZones(java.util.List<DescribeZonesResponseZones> zones) {
        this.zones = zones;
        return this;
    }
    public java.util.List<DescribeZonesResponseZones> getZones() {
        return this.zones;
    }

    public static class DescribeZonesResponseZones extends TeaModel {
        @NameInMap("ZoneId")
        @Validation(required = true)
        public String zoneId;

        public static DescribeZonesResponseZones build(java.util.Map<String, ?> map) throws Exception {
            DescribeZonesResponseZones self = new DescribeZonesResponseZones();
            return TeaModel.build(map, self);
        }

        public DescribeZonesResponseZones setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

}
