// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class ListNetworkAccessEndpointAvailableZonesResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0441BD79-92F3-53AA-8657-F8CE4A2B912A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The list of zones that support network endpoints in the current region.</p>
     */
    @NameInMap("Zones")
    public java.util.List<ListNetworkAccessEndpointAvailableZonesResponseBodyZones> zones;

    public static ListNetworkAccessEndpointAvailableZonesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListNetworkAccessEndpointAvailableZonesResponseBody self = new ListNetworkAccessEndpointAvailableZonesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListNetworkAccessEndpointAvailableZonesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListNetworkAccessEndpointAvailableZonesResponseBody setZones(java.util.List<ListNetworkAccessEndpointAvailableZonesResponseBodyZones> zones) {
        this.zones = zones;
        return this;
    }
    public java.util.List<ListNetworkAccessEndpointAvailableZonesResponseBodyZones> getZones() {
        return this.zones;
    }

    public static class ListNetworkAccessEndpointAvailableZonesResponseBodyZones extends TeaModel {
        /**
         * <p>The zone name.</p>
         * 
         * <strong>example:</strong>
         * <p>China (Hangzhou) Zone J</p>
         */
        @NameInMap("LocalName")
        public String localName;

        /**
         * <p>The zone ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-j</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        public static ListNetworkAccessEndpointAvailableZonesResponseBodyZones build(java.util.Map<String, ?> map) throws Exception {
            ListNetworkAccessEndpointAvailableZonesResponseBodyZones self = new ListNetworkAccessEndpointAvailableZonesResponseBodyZones();
            return TeaModel.build(map, self);
        }

        public ListNetworkAccessEndpointAvailableZonesResponseBodyZones setLocalName(String localName) {
            this.localName = localName;
            return this;
        }
        public String getLocalName() {
            return this.localName;
        }

        public ListNetworkAccessEndpointAvailableZonesResponseBodyZones setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

}
