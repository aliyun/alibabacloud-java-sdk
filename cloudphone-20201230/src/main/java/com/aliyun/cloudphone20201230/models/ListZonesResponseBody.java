// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudphone20201230.models;

import com.aliyun.tea.*;

public class ListZonesResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The zones available in the current region.</p>
     */
    @NameInMap("Zones")
    public ListZonesResponseBodyZones zones;

    public static ListZonesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListZonesResponseBody self = new ListZonesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListZonesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListZonesResponseBody setZones(ListZonesResponseBodyZones zones) {
        this.zones = zones;
        return this;
    }
    public ListZonesResponseBodyZones getZones() {
        return this.zones;
    }

    public static class ListZonesResponseBodyZonesZone extends TeaModel {
        /**
         * <p>The zone ID.</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        public static ListZonesResponseBodyZonesZone build(java.util.Map<String, ?> map) throws Exception {
            ListZonesResponseBodyZonesZone self = new ListZonesResponseBodyZonesZone();
            return TeaModel.build(map, self);
        }

        public ListZonesResponseBodyZonesZone setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

    public static class ListZonesResponseBodyZones extends TeaModel {
        @NameInMap("Zone")
        public java.util.List<ListZonesResponseBodyZonesZone> zone;

        public static ListZonesResponseBodyZones build(java.util.Map<String, ?> map) throws Exception {
            ListZonesResponseBodyZones self = new ListZonesResponseBodyZones();
            return TeaModel.build(map, self);
        }

        public ListZonesResponseBodyZones setZone(java.util.List<ListZonesResponseBodyZonesZone> zone) {
            this.zone = zone;
            return this;
        }
        public java.util.List<ListZonesResponseBodyZonesZone> getZone() {
            return this.zone;
        }

    }

}
