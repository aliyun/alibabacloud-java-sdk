// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class DescribeZonesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

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

    public static class DescribeZonesResponseBodyZonesZonePerformance extends TeaModel {
        @NameInMap("Protocol")
        public java.util.List<String> protocol;

        public static DescribeZonesResponseBodyZonesZonePerformance build(java.util.Map<String, ?> map) throws Exception {
            DescribeZonesResponseBodyZonesZonePerformance self = new DescribeZonesResponseBodyZonesZonePerformance();
            return TeaModel.build(map, self);
        }

        public DescribeZonesResponseBodyZonesZonePerformance setProtocol(java.util.List<String> protocol) {
            this.protocol = protocol;
            return this;
        }
        public java.util.List<String> getProtocol() {
            return this.protocol;
        }

    }

    public static class DescribeZonesResponseBodyZonesZoneCapacity extends TeaModel {
        @NameInMap("Protocol")
        public java.util.List<String> protocol;

        public static DescribeZonesResponseBodyZonesZoneCapacity build(java.util.Map<String, ?> map) throws Exception {
            DescribeZonesResponseBodyZonesZoneCapacity self = new DescribeZonesResponseBodyZonesZoneCapacity();
            return TeaModel.build(map, self);
        }

        public DescribeZonesResponseBodyZonesZoneCapacity setProtocol(java.util.List<String> protocol) {
            this.protocol = protocol;
            return this;
        }
        public java.util.List<String> getProtocol() {
            return this.protocol;
        }

    }

    public static class DescribeZonesResponseBodyZonesZone extends TeaModel {
        @NameInMap("Performance")
        public DescribeZonesResponseBodyZonesZonePerformance performance;

        @NameInMap("Capacity")
        public DescribeZonesResponseBodyZonesZoneCapacity capacity;

        @NameInMap("ZoneId")
        public String zoneId;

        public static DescribeZonesResponseBodyZonesZone build(java.util.Map<String, ?> map) throws Exception {
            DescribeZonesResponseBodyZonesZone self = new DescribeZonesResponseBodyZonesZone();
            return TeaModel.build(map, self);
        }

        public DescribeZonesResponseBodyZonesZone setPerformance(DescribeZonesResponseBodyZonesZonePerformance performance) {
            this.performance = performance;
            return this;
        }
        public DescribeZonesResponseBodyZonesZonePerformance getPerformance() {
            return this.performance;
        }

        public DescribeZonesResponseBodyZonesZone setCapacity(DescribeZonesResponseBodyZonesZoneCapacity capacity) {
            this.capacity = capacity;
            return this;
        }
        public DescribeZonesResponseBodyZonesZoneCapacity getCapacity() {
            return this.capacity;
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
