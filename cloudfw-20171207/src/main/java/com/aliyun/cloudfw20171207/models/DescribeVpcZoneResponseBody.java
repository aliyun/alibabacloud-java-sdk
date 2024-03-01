// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeVpcZoneResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ZoneList")
    public java.util.List<DescribeVpcZoneResponseBodyZoneList> zoneList;

    public static DescribeVpcZoneResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeVpcZoneResponseBody self = new DescribeVpcZoneResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeVpcZoneResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeVpcZoneResponseBody setZoneList(java.util.List<DescribeVpcZoneResponseBodyZoneList> zoneList) {
        this.zoneList = zoneList;
        return this;
    }
    public java.util.List<DescribeVpcZoneResponseBodyZoneList> getZoneList() {
        return this.zoneList;
    }

    public static class DescribeVpcZoneResponseBodyZoneList extends TeaModel {
        @NameInMap("LocalName")
        public String localName;

        @NameInMap("ZoneId")
        public String zoneId;

        @NameInMap("ZoneType")
        public String zoneType;

        public static DescribeVpcZoneResponseBodyZoneList build(java.util.Map<String, ?> map) throws Exception {
            DescribeVpcZoneResponseBodyZoneList self = new DescribeVpcZoneResponseBodyZoneList();
            return TeaModel.build(map, self);
        }

        public DescribeVpcZoneResponseBodyZoneList setLocalName(String localName) {
            this.localName = localName;
            return this;
        }
        public String getLocalName() {
            return this.localName;
        }

        public DescribeVpcZoneResponseBodyZoneList setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

        public DescribeVpcZoneResponseBodyZoneList setZoneType(String zoneType) {
            this.zoneType = zoneType;
            return this;
        }
        public String getZoneType() {
            return this.zoneType;
        }

    }

}
