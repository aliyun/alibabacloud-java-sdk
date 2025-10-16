// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeAccessInstanceZoneListResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>31306819-C4BC-56F3-BBE6-*****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ZoneList")
    public java.util.List<String> zoneList;

    @NameInMap("Zones")
    public java.util.List<DescribeAccessInstanceZoneListResponseBodyZones> zones;

    public static DescribeAccessInstanceZoneListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAccessInstanceZoneListResponseBody self = new DescribeAccessInstanceZoneListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAccessInstanceZoneListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAccessInstanceZoneListResponseBody setZoneList(java.util.List<String> zoneList) {
        this.zoneList = zoneList;
        return this;
    }
    public java.util.List<String> getZoneList() {
        return this.zoneList;
    }

    public DescribeAccessInstanceZoneListResponseBody setZones(java.util.List<DescribeAccessInstanceZoneListResponseBodyZones> zones) {
        this.zones = zones;
        return this;
    }
    public java.util.List<DescribeAccessInstanceZoneListResponseBodyZones> getZones() {
        return this.zones;
    }

    public static class DescribeAccessInstanceZoneListResponseBodyZones extends TeaModel {
        @NameInMap("LocalName")
        public String localName;

        /**
         * <strong>example:</strong>
         * <p>cn-beijing-g</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        public static DescribeAccessInstanceZoneListResponseBodyZones build(java.util.Map<String, ?> map) throws Exception {
            DescribeAccessInstanceZoneListResponseBodyZones self = new DescribeAccessInstanceZoneListResponseBodyZones();
            return TeaModel.build(map, self);
        }

        public DescribeAccessInstanceZoneListResponseBodyZones setLocalName(String localName) {
            this.localName = localName;
            return this;
        }
        public String getLocalName() {
            return this.localName;
        }

        public DescribeAccessInstanceZoneListResponseBodyZones setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

}
