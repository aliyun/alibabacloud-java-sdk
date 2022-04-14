// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cc5g20220314.models;

import com.aliyun.tea.*;

public class ListZonesResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    // 数组，返回示例目录。
    @NameInMap("Zones")
    public java.util.List<ListZonesResponseBodyZones> zones;

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

    public ListZonesResponseBody setZones(java.util.List<ListZonesResponseBodyZones> zones) {
        this.zones = zones;
        return this;
    }
    public java.util.List<ListZonesResponseBodyZones> getZones() {
        return this.zones;
    }

    public static class ListZonesResponseBodyZones extends TeaModel {
        // 创建时间
        @NameInMap("LocalName")
        public String localName;

        // 资源名称
        @NameInMap("ZoneId")
        public String zoneId;

        public static ListZonesResponseBodyZones build(java.util.Map<String, ?> map) throws Exception {
            ListZonesResponseBodyZones self = new ListZonesResponseBodyZones();
            return TeaModel.build(map, self);
        }

        public ListZonesResponseBodyZones setLocalName(String localName) {
            this.localName = localName;
            return this;
        }
        public String getLocalName() {
            return this.localName;
        }

        public ListZonesResponseBodyZones setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

}
