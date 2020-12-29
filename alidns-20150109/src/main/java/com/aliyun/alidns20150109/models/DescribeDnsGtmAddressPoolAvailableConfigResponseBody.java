// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeDnsGtmAddressPoolAvailableConfigResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("AttributeInfos")
    public java.util.List<DescribeDnsGtmAddressPoolAvailableConfigResponseBodyAttributeInfos> attributeInfos;

    public static DescribeDnsGtmAddressPoolAvailableConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDnsGtmAddressPoolAvailableConfigResponseBody self = new DescribeDnsGtmAddressPoolAvailableConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDnsGtmAddressPoolAvailableConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDnsGtmAddressPoolAvailableConfigResponseBody setAttributeInfos(java.util.List<DescribeDnsGtmAddressPoolAvailableConfigResponseBodyAttributeInfos> attributeInfos) {
        this.attributeInfos = attributeInfos;
        return this;
    }
    public java.util.List<DescribeDnsGtmAddressPoolAvailableConfigResponseBodyAttributeInfos> getAttributeInfos() {
        return this.attributeInfos;
    }

    public static class DescribeDnsGtmAddressPoolAvailableConfigResponseBodyAttributeInfos extends TeaModel {
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

        public static DescribeDnsGtmAddressPoolAvailableConfigResponseBodyAttributeInfos build(java.util.Map<String, ?> map) throws Exception {
            DescribeDnsGtmAddressPoolAvailableConfigResponseBodyAttributeInfos self = new DescribeDnsGtmAddressPoolAvailableConfigResponseBodyAttributeInfos();
            return TeaModel.build(map, self);
        }

        public DescribeDnsGtmAddressPoolAvailableConfigResponseBodyAttributeInfos setFatherCode(String fatherCode) {
            this.fatherCode = fatherCode;
            return this;
        }
        public String getFatherCode() {
            return this.fatherCode;
        }

        public DescribeDnsGtmAddressPoolAvailableConfigResponseBodyAttributeInfos setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public DescribeDnsGtmAddressPoolAvailableConfigResponseBodyAttributeInfos setLineCode(String lineCode) {
            this.lineCode = lineCode;
            return this;
        }
        public String getLineCode() {
            return this.lineCode;
        }

        public DescribeDnsGtmAddressPoolAvailableConfigResponseBodyAttributeInfos setLineName(String lineName) {
            this.lineName = lineName;
            return this;
        }
        public String getLineName() {
            return this.lineName;
        }

        public DescribeDnsGtmAddressPoolAvailableConfigResponseBodyAttributeInfos setGroupCode(String groupCode) {
            this.groupCode = groupCode;
            return this;
        }
        public String getGroupCode() {
            return this.groupCode;
        }

    }

}
