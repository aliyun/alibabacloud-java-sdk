// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeDnsGtmAddrAttributeInfoResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Addr")
    public java.util.List<DescribeDnsGtmAddrAttributeInfoResponseBodyAddr> addr;

    public static DescribeDnsGtmAddrAttributeInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDnsGtmAddrAttributeInfoResponseBody self = new DescribeDnsGtmAddrAttributeInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDnsGtmAddrAttributeInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDnsGtmAddrAttributeInfoResponseBody setAddr(java.util.List<DescribeDnsGtmAddrAttributeInfoResponseBodyAddr> addr) {
        this.addr = addr;
        return this;
    }
    public java.util.List<DescribeDnsGtmAddrAttributeInfoResponseBodyAddr> getAddr() {
        return this.addr;
    }

    public static class DescribeDnsGtmAddrAttributeInfoResponseBodyAddrAttributeInfo extends TeaModel {
        @NameInMap("FatherCode")
        public String fatherCode;

        @NameInMap("GroupName")
        public String groupName;

        @NameInMap("LineCode")
        public String lineCode;

        @NameInMap("LineName")
        public String lineName;

        @NameInMap("GroupCode")
        public String groupCode;

        public static DescribeDnsGtmAddrAttributeInfoResponseBodyAddrAttributeInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeDnsGtmAddrAttributeInfoResponseBodyAddrAttributeInfo self = new DescribeDnsGtmAddrAttributeInfoResponseBodyAddrAttributeInfo();
            return TeaModel.build(map, self);
        }

        public DescribeDnsGtmAddrAttributeInfoResponseBodyAddrAttributeInfo setFatherCode(String fatherCode) {
            this.fatherCode = fatherCode;
            return this;
        }
        public String getFatherCode() {
            return this.fatherCode;
        }

        public DescribeDnsGtmAddrAttributeInfoResponseBodyAddrAttributeInfo setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public DescribeDnsGtmAddrAttributeInfoResponseBodyAddrAttributeInfo setLineCode(String lineCode) {
            this.lineCode = lineCode;
            return this;
        }
        public String getLineCode() {
            return this.lineCode;
        }

        public DescribeDnsGtmAddrAttributeInfoResponseBodyAddrAttributeInfo setLineName(String lineName) {
            this.lineName = lineName;
            return this;
        }
        public String getLineName() {
            return this.lineName;
        }

        public DescribeDnsGtmAddrAttributeInfoResponseBodyAddrAttributeInfo setGroupCode(String groupCode) {
            this.groupCode = groupCode;
            return this;
        }
        public String getGroupCode() {
            return this.groupCode;
        }

    }

    public static class DescribeDnsGtmAddrAttributeInfoResponseBodyAddr extends TeaModel {
        @NameInMap("AttributeInfo")
        public DescribeDnsGtmAddrAttributeInfoResponseBodyAddrAttributeInfo attributeInfo;

        @NameInMap("Addr")
        public String addr;

        public static DescribeDnsGtmAddrAttributeInfoResponseBodyAddr build(java.util.Map<String, ?> map) throws Exception {
            DescribeDnsGtmAddrAttributeInfoResponseBodyAddr self = new DescribeDnsGtmAddrAttributeInfoResponseBodyAddr();
            return TeaModel.build(map, self);
        }

        public DescribeDnsGtmAddrAttributeInfoResponseBodyAddr setAttributeInfo(DescribeDnsGtmAddrAttributeInfoResponseBodyAddrAttributeInfo attributeInfo) {
            this.attributeInfo = attributeInfo;
            return this;
        }
        public DescribeDnsGtmAddrAttributeInfoResponseBodyAddrAttributeInfo getAttributeInfo() {
            return this.attributeInfo;
        }

        public DescribeDnsGtmAddrAttributeInfoResponseBodyAddr setAddr(String addr) {
            this.addr = addr;
            return this;
        }
        public String getAddr() {
            return this.addr;
        }

    }

}
