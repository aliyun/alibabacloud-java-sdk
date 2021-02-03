// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeDnsGtmAddrAttributeInfoResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Addr")
    @Validation(required = true)
    public DescribeDnsGtmAddrAttributeInfoResponseAddr addr;

    public static DescribeDnsGtmAddrAttributeInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDnsGtmAddrAttributeInfoResponse self = new DescribeDnsGtmAddrAttributeInfoResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDnsGtmAddrAttributeInfoResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDnsGtmAddrAttributeInfoResponse setAddr(DescribeDnsGtmAddrAttributeInfoResponseAddr addr) {
        this.addr = addr;
        return this;
    }
    public DescribeDnsGtmAddrAttributeInfoResponseAddr getAddr() {
        return this.addr;
    }

    public static class DescribeDnsGtmAddrAttributeInfoResponseAddrAddrAttributeInfo extends TeaModel {
        @NameInMap("LineCode")
        @Validation(required = true)
        public String lineCode;

        @NameInMap("LineName")
        @Validation(required = true)
        public String lineName;

        @NameInMap("GroupCode")
        @Validation(required = true)
        public String groupCode;

        @NameInMap("GroupName")
        @Validation(required = true)
        public String groupName;

        @NameInMap("FatherCode")
        @Validation(required = true)
        public String fatherCode;

        public static DescribeDnsGtmAddrAttributeInfoResponseAddrAddrAttributeInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeDnsGtmAddrAttributeInfoResponseAddrAddrAttributeInfo self = new DescribeDnsGtmAddrAttributeInfoResponseAddrAddrAttributeInfo();
            return TeaModel.build(map, self);
        }

        public DescribeDnsGtmAddrAttributeInfoResponseAddrAddrAttributeInfo setLineCode(String lineCode) {
            this.lineCode = lineCode;
            return this;
        }
        public String getLineCode() {
            return this.lineCode;
        }

        public DescribeDnsGtmAddrAttributeInfoResponseAddrAddrAttributeInfo setLineName(String lineName) {
            this.lineName = lineName;
            return this;
        }
        public String getLineName() {
            return this.lineName;
        }

        public DescribeDnsGtmAddrAttributeInfoResponseAddrAddrAttributeInfo setGroupCode(String groupCode) {
            this.groupCode = groupCode;
            return this;
        }
        public String getGroupCode() {
            return this.groupCode;
        }

        public DescribeDnsGtmAddrAttributeInfoResponseAddrAddrAttributeInfo setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public DescribeDnsGtmAddrAttributeInfoResponseAddrAddrAttributeInfo setFatherCode(String fatherCode) {
            this.fatherCode = fatherCode;
            return this;
        }
        public String getFatherCode() {
            return this.fatherCode;
        }

    }

    public static class DescribeDnsGtmAddrAttributeInfoResponseAddrAddr extends TeaModel {
        @NameInMap("Addr")
        @Validation(required = true)
        public String addr;

        @NameInMap("AttributeInfo")
        @Validation(required = true)
        public DescribeDnsGtmAddrAttributeInfoResponseAddrAddrAttributeInfo attributeInfo;

        public static DescribeDnsGtmAddrAttributeInfoResponseAddrAddr build(java.util.Map<String, ?> map) throws Exception {
            DescribeDnsGtmAddrAttributeInfoResponseAddrAddr self = new DescribeDnsGtmAddrAttributeInfoResponseAddrAddr();
            return TeaModel.build(map, self);
        }

        public DescribeDnsGtmAddrAttributeInfoResponseAddrAddr setAddr(String addr) {
            this.addr = addr;
            return this;
        }
        public String getAddr() {
            return this.addr;
        }

        public DescribeDnsGtmAddrAttributeInfoResponseAddrAddr setAttributeInfo(DescribeDnsGtmAddrAttributeInfoResponseAddrAddrAttributeInfo attributeInfo) {
            this.attributeInfo = attributeInfo;
            return this;
        }
        public DescribeDnsGtmAddrAttributeInfoResponseAddrAddrAttributeInfo getAttributeInfo() {
            return this.attributeInfo;
        }

    }

    public static class DescribeDnsGtmAddrAttributeInfoResponseAddr extends TeaModel {
        @NameInMap("Addr")
        @Validation(required = true)
        public java.util.List<DescribeDnsGtmAddrAttributeInfoResponseAddrAddr> addr;

        public static DescribeDnsGtmAddrAttributeInfoResponseAddr build(java.util.Map<String, ?> map) throws Exception {
            DescribeDnsGtmAddrAttributeInfoResponseAddr self = new DescribeDnsGtmAddrAttributeInfoResponseAddr();
            return TeaModel.build(map, self);
        }

        public DescribeDnsGtmAddrAttributeInfoResponseAddr setAddr(java.util.List<DescribeDnsGtmAddrAttributeInfoResponseAddrAddr> addr) {
            this.addr = addr;
            return this;
        }
        public java.util.List<DescribeDnsGtmAddrAttributeInfoResponseAddrAddr> getAddr() {
            return this.addr;
        }

    }

}
