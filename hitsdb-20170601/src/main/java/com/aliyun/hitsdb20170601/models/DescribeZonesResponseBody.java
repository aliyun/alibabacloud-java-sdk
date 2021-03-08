// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hitsdb20170601.models;

import com.aliyun.tea.*;

public class DescribeZonesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ZoneList")
    public DescribeZonesResponseBodyZoneList zoneList;

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

    public DescribeZonesResponseBody setZoneList(DescribeZonesResponseBodyZoneList zoneList) {
        this.zoneList = zoneList;
        return this;
    }
    public DescribeZonesResponseBodyZoneList getZoneList() {
        return this.zoneList;
    }

    public static class DescribeZonesResponseBodyZoneListZoneModel extends TeaModel {
        @NameInMap("LocalName")
        public String localName;

        @NameInMap("ZoneId")
        public String zoneId;

        public static DescribeZonesResponseBodyZoneListZoneModel build(java.util.Map<String, ?> map) throws Exception {
            DescribeZonesResponseBodyZoneListZoneModel self = new DescribeZonesResponseBodyZoneListZoneModel();
            return TeaModel.build(map, self);
        }

        public DescribeZonesResponseBodyZoneListZoneModel setLocalName(String localName) {
            this.localName = localName;
            return this;
        }
        public String getLocalName() {
            return this.localName;
        }

        public DescribeZonesResponseBodyZoneListZoneModel setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

    public static class DescribeZonesResponseBodyZoneList extends TeaModel {
        @NameInMap("ZoneModel")
        public java.util.List<DescribeZonesResponseBodyZoneListZoneModel> zoneModel;

        public static DescribeZonesResponseBodyZoneList build(java.util.Map<String, ?> map) throws Exception {
            DescribeZonesResponseBodyZoneList self = new DescribeZonesResponseBodyZoneList();
            return TeaModel.build(map, self);
        }

        public DescribeZonesResponseBodyZoneList setZoneModel(java.util.List<DescribeZonesResponseBodyZoneListZoneModel> zoneModel) {
            this.zoneModel = zoneModel;
            return this;
        }
        public java.util.List<DescribeZonesResponseBodyZoneListZoneModel> getZoneModel() {
            return this.zoneModel;
        }

    }

}
