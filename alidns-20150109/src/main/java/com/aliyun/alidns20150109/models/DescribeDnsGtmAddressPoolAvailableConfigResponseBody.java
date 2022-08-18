// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeDnsGtmAddressPoolAvailableConfigResponseBody extends TeaModel {
    @NameInMap("AttributeInfos")
    public DescribeDnsGtmAddressPoolAvailableConfigResponseBodyAttributeInfos attributeInfos;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDnsGtmAddressPoolAvailableConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDnsGtmAddressPoolAvailableConfigResponseBody self = new DescribeDnsGtmAddressPoolAvailableConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDnsGtmAddressPoolAvailableConfigResponseBody setAttributeInfos(DescribeDnsGtmAddressPoolAvailableConfigResponseBodyAttributeInfos attributeInfos) {
        this.attributeInfos = attributeInfos;
        return this;
    }
    public DescribeDnsGtmAddressPoolAvailableConfigResponseBodyAttributeInfos getAttributeInfos() {
        return this.attributeInfos;
    }

    public DescribeDnsGtmAddressPoolAvailableConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeDnsGtmAddressPoolAvailableConfigResponseBodyAttributeInfosAttributeInfo extends TeaModel {
        @NameInMap("FatherCode")
        public String fatherCode;

        @NameInMap("GroupCode")
        public String groupCode;

        @NameInMap("GroupName")
        public String groupName;

        @NameInMap("LineCode")
        public String lineCode;

        @NameInMap("LineName")
        public String lineName;

        public static DescribeDnsGtmAddressPoolAvailableConfigResponseBodyAttributeInfosAttributeInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeDnsGtmAddressPoolAvailableConfigResponseBodyAttributeInfosAttributeInfo self = new DescribeDnsGtmAddressPoolAvailableConfigResponseBodyAttributeInfosAttributeInfo();
            return TeaModel.build(map, self);
        }

        public DescribeDnsGtmAddressPoolAvailableConfigResponseBodyAttributeInfosAttributeInfo setFatherCode(String fatherCode) {
            this.fatherCode = fatherCode;
            return this;
        }
        public String getFatherCode() {
            return this.fatherCode;
        }

        public DescribeDnsGtmAddressPoolAvailableConfigResponseBodyAttributeInfosAttributeInfo setGroupCode(String groupCode) {
            this.groupCode = groupCode;
            return this;
        }
        public String getGroupCode() {
            return this.groupCode;
        }

        public DescribeDnsGtmAddressPoolAvailableConfigResponseBodyAttributeInfosAttributeInfo setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public DescribeDnsGtmAddressPoolAvailableConfigResponseBodyAttributeInfosAttributeInfo setLineCode(String lineCode) {
            this.lineCode = lineCode;
            return this;
        }
        public String getLineCode() {
            return this.lineCode;
        }

        public DescribeDnsGtmAddressPoolAvailableConfigResponseBodyAttributeInfosAttributeInfo setLineName(String lineName) {
            this.lineName = lineName;
            return this;
        }
        public String getLineName() {
            return this.lineName;
        }

    }

    public static class DescribeDnsGtmAddressPoolAvailableConfigResponseBodyAttributeInfos extends TeaModel {
        @NameInMap("AttributeInfo")
        public java.util.List<DescribeDnsGtmAddressPoolAvailableConfigResponseBodyAttributeInfosAttributeInfo> attributeInfo;

        public static DescribeDnsGtmAddressPoolAvailableConfigResponseBodyAttributeInfos build(java.util.Map<String, ?> map) throws Exception {
            DescribeDnsGtmAddressPoolAvailableConfigResponseBodyAttributeInfos self = new DescribeDnsGtmAddressPoolAvailableConfigResponseBodyAttributeInfos();
            return TeaModel.build(map, self);
        }

        public DescribeDnsGtmAddressPoolAvailableConfigResponseBodyAttributeInfos setAttributeInfo(java.util.List<DescribeDnsGtmAddressPoolAvailableConfigResponseBodyAttributeInfosAttributeInfo> attributeInfo) {
            this.attributeInfo = attributeInfo;
            return this;
        }
        public java.util.List<DescribeDnsGtmAddressPoolAvailableConfigResponseBodyAttributeInfosAttributeInfo> getAttributeInfo() {
            return this.attributeInfo;
        }

    }

}
