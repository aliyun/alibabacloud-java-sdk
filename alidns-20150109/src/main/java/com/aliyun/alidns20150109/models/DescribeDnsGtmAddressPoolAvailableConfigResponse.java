// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeDnsGtmAddressPoolAvailableConfigResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("AttributeInfos")
    @Validation(required = true)
    public DescribeDnsGtmAddressPoolAvailableConfigResponseAttributeInfos attributeInfos;

    public static DescribeDnsGtmAddressPoolAvailableConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDnsGtmAddressPoolAvailableConfigResponse self = new DescribeDnsGtmAddressPoolAvailableConfigResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDnsGtmAddressPoolAvailableConfigResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDnsGtmAddressPoolAvailableConfigResponse setAttributeInfos(DescribeDnsGtmAddressPoolAvailableConfigResponseAttributeInfos attributeInfos) {
        this.attributeInfos = attributeInfos;
        return this;
    }
    public DescribeDnsGtmAddressPoolAvailableConfigResponseAttributeInfos getAttributeInfos() {
        return this.attributeInfos;
    }

    public static class DescribeDnsGtmAddressPoolAvailableConfigResponseAttributeInfosAttributeInfo extends TeaModel {
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

        public static DescribeDnsGtmAddressPoolAvailableConfigResponseAttributeInfosAttributeInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeDnsGtmAddressPoolAvailableConfigResponseAttributeInfosAttributeInfo self = new DescribeDnsGtmAddressPoolAvailableConfigResponseAttributeInfosAttributeInfo();
            return TeaModel.build(map, self);
        }

        public DescribeDnsGtmAddressPoolAvailableConfigResponseAttributeInfosAttributeInfo setLineCode(String lineCode) {
            this.lineCode = lineCode;
            return this;
        }
        public String getLineCode() {
            return this.lineCode;
        }

        public DescribeDnsGtmAddressPoolAvailableConfigResponseAttributeInfosAttributeInfo setLineName(String lineName) {
            this.lineName = lineName;
            return this;
        }
        public String getLineName() {
            return this.lineName;
        }

        public DescribeDnsGtmAddressPoolAvailableConfigResponseAttributeInfosAttributeInfo setGroupCode(String groupCode) {
            this.groupCode = groupCode;
            return this;
        }
        public String getGroupCode() {
            return this.groupCode;
        }

        public DescribeDnsGtmAddressPoolAvailableConfigResponseAttributeInfosAttributeInfo setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public DescribeDnsGtmAddressPoolAvailableConfigResponseAttributeInfosAttributeInfo setFatherCode(String fatherCode) {
            this.fatherCode = fatherCode;
            return this;
        }
        public String getFatherCode() {
            return this.fatherCode;
        }

    }

    public static class DescribeDnsGtmAddressPoolAvailableConfigResponseAttributeInfos extends TeaModel {
        @NameInMap("AttributeInfo")
        @Validation(required = true)
        public java.util.List<DescribeDnsGtmAddressPoolAvailableConfigResponseAttributeInfosAttributeInfo> attributeInfo;

        public static DescribeDnsGtmAddressPoolAvailableConfigResponseAttributeInfos build(java.util.Map<String, ?> map) throws Exception {
            DescribeDnsGtmAddressPoolAvailableConfigResponseAttributeInfos self = new DescribeDnsGtmAddressPoolAvailableConfigResponseAttributeInfos();
            return TeaModel.build(map, self);
        }

        public DescribeDnsGtmAddressPoolAvailableConfigResponseAttributeInfos setAttributeInfo(java.util.List<DescribeDnsGtmAddressPoolAvailableConfigResponseAttributeInfosAttributeInfo> attributeInfo) {
            this.attributeInfo = attributeInfo;
            return this;
        }
        public java.util.List<DescribeDnsGtmAddressPoolAvailableConfigResponseAttributeInfosAttributeInfo> getAttributeInfo() {
            return this.attributeInfo;
        }

    }

}
