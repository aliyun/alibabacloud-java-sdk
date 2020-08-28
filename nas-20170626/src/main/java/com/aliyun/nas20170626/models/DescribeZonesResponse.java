// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class DescribeZonesResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Zones")
    @Validation(required = true)
    public DescribeZonesResponseZones zones;

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

    public DescribeZonesResponse setZones(DescribeZonesResponseZones zones) {
        this.zones = zones;
        return this;
    }
    public DescribeZonesResponseZones getZones() {
        return this.zones;
    }

    public static class DescribeZonesResponseZonesZoneCapacity extends TeaModel {
        // Protocol
        @NameInMap("Protocol")
        @Validation(required = true)
        public java.util.List<String> protocol;

        public static DescribeZonesResponseZonesZoneCapacity build(java.util.Map<String, ?> map) throws Exception {
            DescribeZonesResponseZonesZoneCapacity self = new DescribeZonesResponseZonesZoneCapacity();
            return TeaModel.build(map, self);
        }

        public DescribeZonesResponseZonesZoneCapacity setProtocol(java.util.List<String> protocol) {
            this.protocol = protocol;
            return this;
        }
        public java.util.List<String> getProtocol() {
            return this.protocol;
        }

    }

    public static class DescribeZonesResponseZonesZonePerformance extends TeaModel {
        // Protocol
        @NameInMap("Protocol")
        @Validation(required = true)
        public java.util.List<String> protocol;

        public static DescribeZonesResponseZonesZonePerformance build(java.util.Map<String, ?> map) throws Exception {
            DescribeZonesResponseZonesZonePerformance self = new DescribeZonesResponseZonesZonePerformance();
            return TeaModel.build(map, self);
        }

        public DescribeZonesResponseZonesZonePerformance setProtocol(java.util.List<String> protocol) {
            this.protocol = protocol;
            return this;
        }
        public java.util.List<String> getProtocol() {
            return this.protocol;
        }

    }

    public static class DescribeZonesResponseZonesZone extends TeaModel {
        @NameInMap("ZoneId")
        @Validation(required = true)
        public String zoneId;

        @NameInMap("Capacity")
        @Validation(required = true)
        public DescribeZonesResponseZonesZoneCapacity capacity;

        @NameInMap("Performance")
        @Validation(required = true)
        public DescribeZonesResponseZonesZonePerformance performance;

        public static DescribeZonesResponseZonesZone build(java.util.Map<String, ?> map) throws Exception {
            DescribeZonesResponseZonesZone self = new DescribeZonesResponseZonesZone();
            return TeaModel.build(map, self);
        }

        public DescribeZonesResponseZonesZone setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

        public DescribeZonesResponseZonesZone setCapacity(DescribeZonesResponseZonesZoneCapacity capacity) {
            this.capacity = capacity;
            return this;
        }
        public DescribeZonesResponseZonesZoneCapacity getCapacity() {
            return this.capacity;
        }

        public DescribeZonesResponseZonesZone setPerformance(DescribeZonesResponseZonesZonePerformance performance) {
            this.performance = performance;
            return this;
        }
        public DescribeZonesResponseZonesZonePerformance getPerformance() {
            return this.performance;
        }

    }

    public static class DescribeZonesResponseZones extends TeaModel {
        @NameInMap("Zone")
        @Validation(required = true)
        public java.util.List<DescribeZonesResponseZonesZone> zone;

        public static DescribeZonesResponseZones build(java.util.Map<String, ?> map) throws Exception {
            DescribeZonesResponseZones self = new DescribeZonesResponseZones();
            return TeaModel.build(map, self);
        }

        public DescribeZonesResponseZones setZone(java.util.List<DescribeZonesResponseZonesZone> zone) {
            this.zone = zone;
            return this;
        }
        public java.util.List<DescribeZonesResponseZonesZone> getZone() {
            return this.zone;
        }

    }

}
