// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class GetVpdResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Content")
    public GetVpdResponseBodyContent content;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static GetVpdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetVpdResponseBody self = new GetVpdResponseBody();
        return TeaModel.build(map, self);
    }

    public GetVpdResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetVpdResponseBody setContent(GetVpdResponseBodyContent content) {
        this.content = content;
        return this;
    }
    public GetVpdResponseBodyContent getContent() {
        return this.content;
    }

    public GetVpdResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetVpdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetVpdResponseBodyContentErInfos extends TeaModel {
        @NameInMap("Connections")
        public Long connections;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("Description")
        public String description;

        @NameInMap("ErId")
        public String erId;

        @NameInMap("ErName")
        public String erName;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("MasterZoneId")
        public String masterZoneId;

        @NameInMap("Message")
        public String message;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("RouteMaps")
        public Long routeMaps;

        @NameInMap("Status")
        public String status;

        @NameInMap("TenantId")
        public String tenantId;

        public static GetVpdResponseBodyContentErInfos build(java.util.Map<String, ?> map) throws Exception {
            GetVpdResponseBodyContentErInfos self = new GetVpdResponseBodyContentErInfos();
            return TeaModel.build(map, self);
        }

        public GetVpdResponseBodyContentErInfos setConnections(Long connections) {
            this.connections = connections;
            return this;
        }
        public Long getConnections() {
            return this.connections;
        }

        public GetVpdResponseBodyContentErInfos setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetVpdResponseBodyContentErInfos setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetVpdResponseBodyContentErInfos setErId(String erId) {
            this.erId = erId;
            return this;
        }
        public String getErId() {
            return this.erId;
        }

        public GetVpdResponseBodyContentErInfos setErName(String erName) {
            this.erName = erName;
            return this;
        }
        public String getErName() {
            return this.erName;
        }

        public GetVpdResponseBodyContentErInfos setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public GetVpdResponseBodyContentErInfos setMasterZoneId(String masterZoneId) {
            this.masterZoneId = masterZoneId;
            return this;
        }
        public String getMasterZoneId() {
            return this.masterZoneId;
        }

        public GetVpdResponseBodyContentErInfos setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public GetVpdResponseBodyContentErInfos setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public GetVpdResponseBodyContentErInfos setRouteMaps(Long routeMaps) {
            this.routeMaps = routeMaps;
            return this;
        }
        public Long getRouteMaps() {
            return this.routeMaps;
        }

        public GetVpdResponseBodyContentErInfos setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetVpdResponseBodyContentErInfos setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

    public static class GetVpdResponseBodyContentTags extends TeaModel {
        @NameInMap("TagKey")
        public String tagKey;

        @NameInMap("TagValue")
        public String tagValue;

        public static GetVpdResponseBodyContentTags build(java.util.Map<String, ?> map) throws Exception {
            GetVpdResponseBodyContentTags self = new GetVpdResponseBodyContentTags();
            return TeaModel.build(map, self);
        }

        public GetVpdResponseBodyContentTags setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public GetVpdResponseBodyContentTags setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

    public static class GetVpdResponseBodyContent extends TeaModel {
        @NameInMap("AttachErStatus")
        public Boolean attachErStatus;

        @NameInMap("Cidr")
        public String cidr;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("ErInfos")
        public java.util.List<GetVpdResponseBodyContentErInfos> erInfos;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("Message")
        public String message;

        @NameInMap("NcCount")
        public Long ncCount;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        @NameInMap("ServiceCidr")
        public String serviceCidr;

        @NameInMap("Status")
        public String status;

        @NameInMap("SubnetCount")
        public Long subnetCount;

        @NameInMap("Tags")
        public java.util.List<GetVpdResponseBodyContentTags> tags;

        @NameInMap("TenantId")
        public String tenantId;

        @NameInMap("VpdId")
        public String vpdId;

        @NameInMap("VpdName")
        public String vpdName;

        public static GetVpdResponseBodyContent build(java.util.Map<String, ?> map) throws Exception {
            GetVpdResponseBodyContent self = new GetVpdResponseBodyContent();
            return TeaModel.build(map, self);
        }

        public GetVpdResponseBodyContent setAttachErStatus(Boolean attachErStatus) {
            this.attachErStatus = attachErStatus;
            return this;
        }
        public Boolean getAttachErStatus() {
            return this.attachErStatus;
        }

        public GetVpdResponseBodyContent setCidr(String cidr) {
            this.cidr = cidr;
            return this;
        }
        public String getCidr() {
            return this.cidr;
        }

        public GetVpdResponseBodyContent setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetVpdResponseBodyContent setErInfos(java.util.List<GetVpdResponseBodyContentErInfos> erInfos) {
            this.erInfos = erInfos;
            return this;
        }
        public java.util.List<GetVpdResponseBodyContentErInfos> getErInfos() {
            return this.erInfos;
        }

        public GetVpdResponseBodyContent setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public GetVpdResponseBodyContent setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public GetVpdResponseBodyContent setNcCount(Long ncCount) {
            this.ncCount = ncCount;
            return this;
        }
        public Long getNcCount() {
            return this.ncCount;
        }

        public GetVpdResponseBodyContent setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public GetVpdResponseBodyContent setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public GetVpdResponseBodyContent setServiceCidr(String serviceCidr) {
            this.serviceCidr = serviceCidr;
            return this;
        }
        public String getServiceCidr() {
            return this.serviceCidr;
        }

        public GetVpdResponseBodyContent setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetVpdResponseBodyContent setSubnetCount(Long subnetCount) {
            this.subnetCount = subnetCount;
            return this;
        }
        public Long getSubnetCount() {
            return this.subnetCount;
        }

        public GetVpdResponseBodyContent setTags(java.util.List<GetVpdResponseBodyContentTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<GetVpdResponseBodyContentTags> getTags() {
            return this.tags;
        }

        public GetVpdResponseBodyContent setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public GetVpdResponseBodyContent setVpdId(String vpdId) {
            this.vpdId = vpdId;
            return this;
        }
        public String getVpdId() {
            return this.vpdId;
        }

        public GetVpdResponseBodyContent setVpdName(String vpdName) {
            this.vpdName = vpdName;
            return this;
        }
        public String getVpdName() {
            return this.vpdName;
        }

    }

}
