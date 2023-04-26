// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class GetSubnetResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Content")
    public GetSubnetResponseBodyContent content;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static GetSubnetResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSubnetResponseBody self = new GetSubnetResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSubnetResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetSubnetResponseBody setContent(GetSubnetResponseBodyContent content) {
        this.content = content;
        return this;
    }
    public GetSubnetResponseBodyContent getContent() {
        return this.content;
    }

    public GetSubnetResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetSubnetResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetSubnetResponseBodyContentTags extends TeaModel {
        @NameInMap("TagKey")
        public String tagKey;

        @NameInMap("TagValue")
        public String tagValue;

        public static GetSubnetResponseBodyContentTags build(java.util.Map<String, ?> map) throws Exception {
            GetSubnetResponseBodyContentTags self = new GetSubnetResponseBodyContentTags();
            return TeaModel.build(map, self);
        }

        public GetSubnetResponseBodyContentTags setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public GetSubnetResponseBodyContentTags setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

    public static class GetSubnetResponseBodyContentVpdBaseInfo extends TeaModel {
        @NameInMap("Cidr")
        public String cidr;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("VpdId")
        public String vpdId;

        @NameInMap("VpdName")
        public String vpdName;

        public static GetSubnetResponseBodyContentVpdBaseInfo build(java.util.Map<String, ?> map) throws Exception {
            GetSubnetResponseBodyContentVpdBaseInfo self = new GetSubnetResponseBodyContentVpdBaseInfo();
            return TeaModel.build(map, self);
        }

        public GetSubnetResponseBodyContentVpdBaseInfo setCidr(String cidr) {
            this.cidr = cidr;
            return this;
        }
        public String getCidr() {
            return this.cidr;
        }

        public GetSubnetResponseBodyContentVpdBaseInfo setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetSubnetResponseBodyContentVpdBaseInfo setVpdId(String vpdId) {
            this.vpdId = vpdId;
            return this;
        }
        public String getVpdId() {
            return this.vpdId;
        }

        public GetSubnetResponseBodyContentVpdBaseInfo setVpdName(String vpdName) {
            this.vpdName = vpdName;
            return this;
        }
        public String getVpdName() {
            return this.vpdName;
        }

    }

    public static class GetSubnetResponseBodyContent extends TeaModel {
        @NameInMap("AvailableIps")
        public Integer availableIps;

        @NameInMap("Cidr")
        public String cidr;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("LbCount")
        public Long lbCount;

        @NameInMap("Message")
        public String message;

        @NameInMap("NcCount")
        public Long ncCount;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        @NameInMap("Status")
        public String status;

        @NameInMap("SubnetId")
        public String subnetId;

        @NameInMap("SubnetName")
        public String subnetName;

        @NameInMap("Tags")
        public java.util.List<GetSubnetResponseBodyContentTags> tags;

        @NameInMap("TenantId")
        public String tenantId;

        @NameInMap("Type")
        public String type;

        @NameInMap("VpdBaseInfo")
        public GetSubnetResponseBodyContentVpdBaseInfo vpdBaseInfo;

        @NameInMap("VpdId")
        public String vpdId;

        @NameInMap("ZoneId")
        public String zoneId;

        public static GetSubnetResponseBodyContent build(java.util.Map<String, ?> map) throws Exception {
            GetSubnetResponseBodyContent self = new GetSubnetResponseBodyContent();
            return TeaModel.build(map, self);
        }

        public GetSubnetResponseBodyContent setAvailableIps(Integer availableIps) {
            this.availableIps = availableIps;
            return this;
        }
        public Integer getAvailableIps() {
            return this.availableIps;
        }

        public GetSubnetResponseBodyContent setCidr(String cidr) {
            this.cidr = cidr;
            return this;
        }
        public String getCidr() {
            return this.cidr;
        }

        public GetSubnetResponseBodyContent setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetSubnetResponseBodyContent setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public GetSubnetResponseBodyContent setLbCount(Long lbCount) {
            this.lbCount = lbCount;
            return this;
        }
        public Long getLbCount() {
            return this.lbCount;
        }

        public GetSubnetResponseBodyContent setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public GetSubnetResponseBodyContent setNcCount(Long ncCount) {
            this.ncCount = ncCount;
            return this;
        }
        public Long getNcCount() {
            return this.ncCount;
        }

        public GetSubnetResponseBodyContent setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public GetSubnetResponseBodyContent setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public GetSubnetResponseBodyContent setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetSubnetResponseBodyContent setSubnetId(String subnetId) {
            this.subnetId = subnetId;
            return this;
        }
        public String getSubnetId() {
            return this.subnetId;
        }

        public GetSubnetResponseBodyContent setSubnetName(String subnetName) {
            this.subnetName = subnetName;
            return this;
        }
        public String getSubnetName() {
            return this.subnetName;
        }

        public GetSubnetResponseBodyContent setTags(java.util.List<GetSubnetResponseBodyContentTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<GetSubnetResponseBodyContentTags> getTags() {
            return this.tags;
        }

        public GetSubnetResponseBodyContent setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public GetSubnetResponseBodyContent setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetSubnetResponseBodyContent setVpdBaseInfo(GetSubnetResponseBodyContentVpdBaseInfo vpdBaseInfo) {
            this.vpdBaseInfo = vpdBaseInfo;
            return this;
        }
        public GetSubnetResponseBodyContentVpdBaseInfo getVpdBaseInfo() {
            return this.vpdBaseInfo;
        }

        public GetSubnetResponseBodyContent setVpdId(String vpdId) {
            this.vpdId = vpdId;
            return this;
        }
        public String getVpdId() {
            return this.vpdId;
        }

        public GetSubnetResponseBodyContent setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

}
