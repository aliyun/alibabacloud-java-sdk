// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class ListVpdsResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Content")
    public ListVpdsResponseBodyContent content;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static ListVpdsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListVpdsResponseBody self = new ListVpdsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListVpdsResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ListVpdsResponseBody setContent(ListVpdsResponseBodyContent content) {
        this.content = content;
        return this;
    }
    public ListVpdsResponseBodyContent getContent() {
        return this.content;
    }

    public ListVpdsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListVpdsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListVpdsResponseBodyContentDataErInfos extends TeaModel {
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

        public static ListVpdsResponseBodyContentDataErInfos build(java.util.Map<String, ?> map) throws Exception {
            ListVpdsResponseBodyContentDataErInfos self = new ListVpdsResponseBodyContentDataErInfos();
            return TeaModel.build(map, self);
        }

        public ListVpdsResponseBodyContentDataErInfos setConnections(Long connections) {
            this.connections = connections;
            return this;
        }
        public Long getConnections() {
            return this.connections;
        }

        public ListVpdsResponseBodyContentDataErInfos setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListVpdsResponseBodyContentDataErInfos setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListVpdsResponseBodyContentDataErInfos setErId(String erId) {
            this.erId = erId;
            return this;
        }
        public String getErId() {
            return this.erId;
        }

        public ListVpdsResponseBodyContentDataErInfos setErName(String erName) {
            this.erName = erName;
            return this;
        }
        public String getErName() {
            return this.erName;
        }

        public ListVpdsResponseBodyContentDataErInfos setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListVpdsResponseBodyContentDataErInfos setMasterZoneId(String masterZoneId) {
            this.masterZoneId = masterZoneId;
            return this;
        }
        public String getMasterZoneId() {
            return this.masterZoneId;
        }

        public ListVpdsResponseBodyContentDataErInfos setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public ListVpdsResponseBodyContentDataErInfos setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListVpdsResponseBodyContentDataErInfos setRouteMaps(Long routeMaps) {
            this.routeMaps = routeMaps;
            return this;
        }
        public Long getRouteMaps() {
            return this.routeMaps;
        }

        public ListVpdsResponseBodyContentDataErInfos setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListVpdsResponseBodyContentDataErInfos setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

    public static class ListVpdsResponseBodyContentDataTags extends TeaModel {
        @NameInMap("TagKey")
        public String tagKey;

        @NameInMap("TagValue")
        public String tagValue;

        public static ListVpdsResponseBodyContentDataTags build(java.util.Map<String, ?> map) throws Exception {
            ListVpdsResponseBodyContentDataTags self = new ListVpdsResponseBodyContentDataTags();
            return TeaModel.build(map, self);
        }

        public ListVpdsResponseBodyContentDataTags setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public ListVpdsResponseBodyContentDataTags setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

    public static class ListVpdsResponseBodyContentData extends TeaModel {
        @NameInMap("Cidr")
        public String cidr;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("Dependence")
        public java.util.Map<String, ?> dependence;

        @NameInMap("ErInfos")
        public java.util.List<ListVpdsResponseBodyContentDataErInfos> erInfos;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("Message")
        public String message;

        @NameInMap("NcCount")
        public Integer ncCount;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        @NameInMap("ServiceCidr")
        public String serviceCidr;

        @NameInMap("Status")
        public String status;

        @NameInMap("SubnetCount")
        public Integer subnetCount;

        @NameInMap("Tags")
        public java.util.List<ListVpdsResponseBodyContentDataTags> tags;

        @NameInMap("TenantId")
        public String tenantId;

        /**
         * <p>vpd id</p>
         */
        @NameInMap("VpdId")
        public String vpdId;

        @NameInMap("VpdName")
        public String vpdName;

        public static ListVpdsResponseBodyContentData build(java.util.Map<String, ?> map) throws Exception {
            ListVpdsResponseBodyContentData self = new ListVpdsResponseBodyContentData();
            return TeaModel.build(map, self);
        }

        public ListVpdsResponseBodyContentData setCidr(String cidr) {
            this.cidr = cidr;
            return this;
        }
        public String getCidr() {
            return this.cidr;
        }

        public ListVpdsResponseBodyContentData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListVpdsResponseBodyContentData setDependence(java.util.Map<String, ?> dependence) {
            this.dependence = dependence;
            return this;
        }
        public java.util.Map<String, ?> getDependence() {
            return this.dependence;
        }

        public ListVpdsResponseBodyContentData setErInfos(java.util.List<ListVpdsResponseBodyContentDataErInfos> erInfos) {
            this.erInfos = erInfos;
            return this;
        }
        public java.util.List<ListVpdsResponseBodyContentDataErInfos> getErInfos() {
            return this.erInfos;
        }

        public ListVpdsResponseBodyContentData setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListVpdsResponseBodyContentData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public ListVpdsResponseBodyContentData setNcCount(Integer ncCount) {
            this.ncCount = ncCount;
            return this;
        }
        public Integer getNcCount() {
            return this.ncCount;
        }

        public ListVpdsResponseBodyContentData setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListVpdsResponseBodyContentData setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public ListVpdsResponseBodyContentData setServiceCidr(String serviceCidr) {
            this.serviceCidr = serviceCidr;
            return this;
        }
        public String getServiceCidr() {
            return this.serviceCidr;
        }

        public ListVpdsResponseBodyContentData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListVpdsResponseBodyContentData setSubnetCount(Integer subnetCount) {
            this.subnetCount = subnetCount;
            return this;
        }
        public Integer getSubnetCount() {
            return this.subnetCount;
        }

        public ListVpdsResponseBodyContentData setTags(java.util.List<ListVpdsResponseBodyContentDataTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<ListVpdsResponseBodyContentDataTags> getTags() {
            return this.tags;
        }

        public ListVpdsResponseBodyContentData setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public ListVpdsResponseBodyContentData setVpdId(String vpdId) {
            this.vpdId = vpdId;
            return this;
        }
        public String getVpdId() {
            return this.vpdId;
        }

        public ListVpdsResponseBodyContentData setVpdName(String vpdName) {
            this.vpdName = vpdName;
            return this;
        }
        public String getVpdName() {
            return this.vpdName;
        }

    }

    public static class ListVpdsResponseBodyContent extends TeaModel {
        @NameInMap("Data")
        public java.util.List<ListVpdsResponseBodyContentData> data;

        @NameInMap("Total")
        public Long total;

        public static ListVpdsResponseBodyContent build(java.util.Map<String, ?> map) throws Exception {
            ListVpdsResponseBodyContent self = new ListVpdsResponseBodyContent();
            return TeaModel.build(map, self);
        }

        public ListVpdsResponseBodyContent setData(java.util.List<ListVpdsResponseBodyContentData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<ListVpdsResponseBodyContentData> getData() {
            return this.data;
        }

        public ListVpdsResponseBodyContent setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

}
