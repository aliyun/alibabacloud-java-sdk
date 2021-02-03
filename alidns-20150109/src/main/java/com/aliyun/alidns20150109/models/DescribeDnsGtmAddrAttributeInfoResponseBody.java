// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeDnsGtmAddrAttributeInfoResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Addr")
    public DescribeDnsGtmAddrAttributeInfoResponseBodyAddr addr;

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

    public DescribeDnsGtmAddrAttributeInfoResponseBody setAddr(DescribeDnsGtmAddrAttributeInfoResponseBodyAddr addr) {
        this.addr = addr;
        return this;
    }
    public DescribeDnsGtmAddrAttributeInfoResponseBodyAddr getAddr() {
        return this.addr;
    }

    public static class DescribeDnsGtmAddrAttributeInfoResponseBodyAddrAddrAttributeInfo extends TeaModel {
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

        public static DescribeDnsGtmAddrAttributeInfoResponseBodyAddrAddrAttributeInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeDnsGtmAddrAttributeInfoResponseBodyAddrAddrAttributeInfo self = new DescribeDnsGtmAddrAttributeInfoResponseBodyAddrAddrAttributeInfo();
            return TeaModel.build(map, self);
        }

        public DescribeDnsGtmAddrAttributeInfoResponseBodyAddrAddrAttributeInfo setFatherCode(String fatherCode) {
            this.fatherCode = fatherCode;
            return this;
        }
        public String getFatherCode() {
            return this.fatherCode;
        }

        public DescribeDnsGtmAddrAttributeInfoResponseBodyAddrAddrAttributeInfo setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public DescribeDnsGtmAddrAttributeInfoResponseBodyAddrAddrAttributeInfo setLineCode(String lineCode) {
            this.lineCode = lineCode;
            return this;
        }
        public String getLineCode() {
            return this.lineCode;
        }

        public DescribeDnsGtmAddrAttributeInfoResponseBodyAddrAddrAttributeInfo setLineName(String lineName) {
            this.lineName = lineName;
            return this;
        }
        public String getLineName() {
            return this.lineName;
        }

        public DescribeDnsGtmAddrAttributeInfoResponseBodyAddrAddrAttributeInfo setGroupCode(String groupCode) {
            this.groupCode = groupCode;
            return this;
        }
        public String getGroupCode() {
            return this.groupCode;
        }

    }

    public static class DescribeDnsGtmAddrAttributeInfoResponseBodyAddrAddr extends TeaModel {
        @NameInMap("AttributeInfo")
        public DescribeDnsGtmAddrAttributeInfoResponseBodyAddrAddrAttributeInfo attributeInfo;

        @NameInMap("Addr")
        public String addr;

        public static DescribeDnsGtmAddrAttributeInfoResponseBodyAddrAddr build(java.util.Map<String, ?> map) throws Exception {
            DescribeDnsGtmAddrAttributeInfoResponseBodyAddrAddr self = new DescribeDnsGtmAddrAttributeInfoResponseBodyAddrAddr();
            return TeaModel.build(map, self);
        }

        public DescribeDnsGtmAddrAttributeInfoResponseBodyAddrAddr setAttributeInfo(DescribeDnsGtmAddrAttributeInfoResponseBodyAddrAddrAttributeInfo attributeInfo) {
            this.attributeInfo = attributeInfo;
            return this;
        }
        public DescribeDnsGtmAddrAttributeInfoResponseBodyAddrAddrAttributeInfo getAttributeInfo() {
            return this.attributeInfo;
        }

        public DescribeDnsGtmAddrAttributeInfoResponseBodyAddrAddr setAddr(String addr) {
            this.addr = addr;
            return this;
        }
        public String getAddr() {
            return this.addr;
        }

    }

    public static class DescribeDnsGtmAddrAttributeInfoResponseBodyAddr extends TeaModel {
        @NameInMap("Addr")
        public java.util.List<DescribeDnsGtmAddrAttributeInfoResponseBodyAddrAddr> addr;

        public static DescribeDnsGtmAddrAttributeInfoResponseBodyAddr build(java.util.Map<String, ?> map) throws Exception {
            DescribeDnsGtmAddrAttributeInfoResponseBodyAddr self = new DescribeDnsGtmAddrAttributeInfoResponseBodyAddr();
            return TeaModel.build(map, self);
        }

        public DescribeDnsGtmAddrAttributeInfoResponseBodyAddr setAddr(java.util.List<DescribeDnsGtmAddrAttributeInfoResponseBodyAddrAddr> addr) {
            this.addr = addr;
            return this;
        }
        public java.util.List<DescribeDnsGtmAddrAttributeInfoResponseBodyAddrAddr> getAddr() {
            return this.addr;
        }

    }

}
