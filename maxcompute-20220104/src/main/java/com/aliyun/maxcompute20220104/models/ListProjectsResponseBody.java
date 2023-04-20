// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class ListProjectsResponseBody extends TeaModel {
    @NameInMap("data")
    public ListProjectsResponseBodyData data;

    @NameInMap("requestId")
    public String requestId;

    public static ListProjectsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListProjectsResponseBody self = new ListProjectsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListProjectsResponseBody setData(ListProjectsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListProjectsResponseBodyData getData() {
        return this.data;
    }

    public ListProjectsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListProjectsResponseBodyDataProjectsTags extends TeaModel {
        @NameInMap("TagKey")
        public String tagKey;

        @NameInMap("TagValue")
        public String tagValue;

        public static ListProjectsResponseBodyDataProjectsTags build(java.util.Map<String, ?> map) throws Exception {
            ListProjectsResponseBodyDataProjectsTags self = new ListProjectsResponseBodyDataProjectsTags();
            return TeaModel.build(map, self);
        }

        public ListProjectsResponseBodyDataProjectsTags setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public ListProjectsResponseBodyDataProjectsTags setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

    public static class ListProjectsResponseBodyDataProjectsIpWhiteList extends TeaModel {
        @NameInMap("ipList")
        public String ipList;

        @NameInMap("vpcIpList")
        public String vpcIpList;

        public static ListProjectsResponseBodyDataProjectsIpWhiteList build(java.util.Map<String, ?> map) throws Exception {
            ListProjectsResponseBodyDataProjectsIpWhiteList self = new ListProjectsResponseBodyDataProjectsIpWhiteList();
            return TeaModel.build(map, self);
        }

        public ListProjectsResponseBodyDataProjectsIpWhiteList setIpList(String ipList) {
            this.ipList = ipList;
            return this;
        }
        public String getIpList() {
            return this.ipList;
        }

        public ListProjectsResponseBodyDataProjectsIpWhiteList setVpcIpList(String vpcIpList) {
            this.vpcIpList = vpcIpList;
            return this;
        }
        public String getVpcIpList() {
            return this.vpcIpList;
        }

    }

    public static class ListProjectsResponseBodyDataProjectsPropertiesEncryption extends TeaModel {
        @NameInMap("algorithm")
        public String algorithm;

        @NameInMap("enable")
        public Boolean enable;

        @NameInMap("key")
        public String key;

        public static ListProjectsResponseBodyDataProjectsPropertiesEncryption build(java.util.Map<String, ?> map) throws Exception {
            ListProjectsResponseBodyDataProjectsPropertiesEncryption self = new ListProjectsResponseBodyDataProjectsPropertiesEncryption();
            return TeaModel.build(map, self);
        }

        public ListProjectsResponseBodyDataProjectsPropertiesEncryption setAlgorithm(String algorithm) {
            this.algorithm = algorithm;
            return this;
        }
        public String getAlgorithm() {
            return this.algorithm;
        }

        public ListProjectsResponseBodyDataProjectsPropertiesEncryption setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public ListProjectsResponseBodyDataProjectsPropertiesEncryption setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

    }

    public static class ListProjectsResponseBodyDataProjectsPropertiesTableLifecycle extends TeaModel {
        @NameInMap("type")
        public String type;

        @NameInMap("value")
        public String value;

        public static ListProjectsResponseBodyDataProjectsPropertiesTableLifecycle build(java.util.Map<String, ?> map) throws Exception {
            ListProjectsResponseBodyDataProjectsPropertiesTableLifecycle self = new ListProjectsResponseBodyDataProjectsPropertiesTableLifecycle();
            return TeaModel.build(map, self);
        }

        public ListProjectsResponseBodyDataProjectsPropertiesTableLifecycle setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListProjectsResponseBodyDataProjectsPropertiesTableLifecycle setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListProjectsResponseBodyDataProjectsProperties extends TeaModel {
        @NameInMap("allowFullScan")
        public Boolean allowFullScan;

        @NameInMap("elderTunnelQuota")
        public String elderTunnelQuota;

        @NameInMap("enableDecimal2")
        public Boolean enableDecimal2;

        @NameInMap("enableTunnelQuotaRoute")
        public Boolean enableTunnelQuotaRoute;

        @NameInMap("encryption")
        public ListProjectsResponseBodyDataProjectsPropertiesEncryption encryption;

        @NameInMap("retentionDays")
        public Long retentionDays;

        @NameInMap("sqlMeteringMax")
        public String sqlMeteringMax;

        @NameInMap("tableLifecycle")
        public ListProjectsResponseBodyDataProjectsPropertiesTableLifecycle tableLifecycle;

        @NameInMap("timezone")
        public String timezone;

        @NameInMap("tunnelQuota")
        public String tunnelQuota;

        @NameInMap("typeSystem")
        public String typeSystem;

        public static ListProjectsResponseBodyDataProjectsProperties build(java.util.Map<String, ?> map) throws Exception {
            ListProjectsResponseBodyDataProjectsProperties self = new ListProjectsResponseBodyDataProjectsProperties();
            return TeaModel.build(map, self);
        }

        public ListProjectsResponseBodyDataProjectsProperties setAllowFullScan(Boolean allowFullScan) {
            this.allowFullScan = allowFullScan;
            return this;
        }
        public Boolean getAllowFullScan() {
            return this.allowFullScan;
        }

        public ListProjectsResponseBodyDataProjectsProperties setElderTunnelQuota(String elderTunnelQuota) {
            this.elderTunnelQuota = elderTunnelQuota;
            return this;
        }
        public String getElderTunnelQuota() {
            return this.elderTunnelQuota;
        }

        public ListProjectsResponseBodyDataProjectsProperties setEnableDecimal2(Boolean enableDecimal2) {
            this.enableDecimal2 = enableDecimal2;
            return this;
        }
        public Boolean getEnableDecimal2() {
            return this.enableDecimal2;
        }

        public ListProjectsResponseBodyDataProjectsProperties setEnableTunnelQuotaRoute(Boolean enableTunnelQuotaRoute) {
            this.enableTunnelQuotaRoute = enableTunnelQuotaRoute;
            return this;
        }
        public Boolean getEnableTunnelQuotaRoute() {
            return this.enableTunnelQuotaRoute;
        }

        public ListProjectsResponseBodyDataProjectsProperties setEncryption(ListProjectsResponseBodyDataProjectsPropertiesEncryption encryption) {
            this.encryption = encryption;
            return this;
        }
        public ListProjectsResponseBodyDataProjectsPropertiesEncryption getEncryption() {
            return this.encryption;
        }

        public ListProjectsResponseBodyDataProjectsProperties setRetentionDays(Long retentionDays) {
            this.retentionDays = retentionDays;
            return this;
        }
        public Long getRetentionDays() {
            return this.retentionDays;
        }

        public ListProjectsResponseBodyDataProjectsProperties setSqlMeteringMax(String sqlMeteringMax) {
            this.sqlMeteringMax = sqlMeteringMax;
            return this;
        }
        public String getSqlMeteringMax() {
            return this.sqlMeteringMax;
        }

        public ListProjectsResponseBodyDataProjectsProperties setTableLifecycle(ListProjectsResponseBodyDataProjectsPropertiesTableLifecycle tableLifecycle) {
            this.tableLifecycle = tableLifecycle;
            return this;
        }
        public ListProjectsResponseBodyDataProjectsPropertiesTableLifecycle getTableLifecycle() {
            return this.tableLifecycle;
        }

        public ListProjectsResponseBodyDataProjectsProperties setTimezone(String timezone) {
            this.timezone = timezone;
            return this;
        }
        public String getTimezone() {
            return this.timezone;
        }

        public ListProjectsResponseBodyDataProjectsProperties setTunnelQuota(String tunnelQuota) {
            this.tunnelQuota = tunnelQuota;
            return this;
        }
        public String getTunnelQuota() {
            return this.tunnelQuota;
        }

        public ListProjectsResponseBodyDataProjectsProperties setTypeSystem(String typeSystem) {
            this.typeSystem = typeSystem;
            return this;
        }
        public String getTypeSystem() {
            return this.typeSystem;
        }

    }

    public static class ListProjectsResponseBodyDataProjectsSaleTag extends TeaModel {
        @NameInMap("resourceId")
        public String resourceId;

        @NameInMap("resourceType")
        public String resourceType;

        public static ListProjectsResponseBodyDataProjectsSaleTag build(java.util.Map<String, ?> map) throws Exception {
            ListProjectsResponseBodyDataProjectsSaleTag self = new ListProjectsResponseBodyDataProjectsSaleTag();
            return TeaModel.build(map, self);
        }

        public ListProjectsResponseBodyDataProjectsSaleTag setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public ListProjectsResponseBodyDataProjectsSaleTag setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

    }

    public static class ListProjectsResponseBodyDataProjectsSecurityPropertiesProjectProtection extends TeaModel {
        @NameInMap("exceptionPolicy")
        public String exceptionPolicy;

        @NameInMap("protected")
        public Boolean _protected;

        public static ListProjectsResponseBodyDataProjectsSecurityPropertiesProjectProtection build(java.util.Map<String, ?> map) throws Exception {
            ListProjectsResponseBodyDataProjectsSecurityPropertiesProjectProtection self = new ListProjectsResponseBodyDataProjectsSecurityPropertiesProjectProtection();
            return TeaModel.build(map, self);
        }

        public ListProjectsResponseBodyDataProjectsSecurityPropertiesProjectProtection setExceptionPolicy(String exceptionPolicy) {
            this.exceptionPolicy = exceptionPolicy;
            return this;
        }
        public String getExceptionPolicy() {
            return this.exceptionPolicy;
        }

        public ListProjectsResponseBodyDataProjectsSecurityPropertiesProjectProtection set_protected(Boolean _protected) {
            this._protected = _protected;
            return this;
        }
        public Boolean get_protected() {
            return this._protected;
        }

    }

    public static class ListProjectsResponseBodyDataProjectsSecurityProperties extends TeaModel {
        @NameInMap("enableDownloadPrivilege")
        public Boolean enableDownloadPrivilege;

        @NameInMap("labelSecurity")
        public Boolean labelSecurity;

        @NameInMap("objectCreatorHasAccessPermission")
        public Boolean objectCreatorHasAccessPermission;

        @NameInMap("objectCreatorHasGrantPermission")
        public Boolean objectCreatorHasGrantPermission;

        @NameInMap("projectProtection")
        public ListProjectsResponseBodyDataProjectsSecurityPropertiesProjectProtection projectProtection;

        @NameInMap("usingAcl")
        public Boolean usingAcl;

        @NameInMap("usingPolicy")
        public Boolean usingPolicy;

        public static ListProjectsResponseBodyDataProjectsSecurityProperties build(java.util.Map<String, ?> map) throws Exception {
            ListProjectsResponseBodyDataProjectsSecurityProperties self = new ListProjectsResponseBodyDataProjectsSecurityProperties();
            return TeaModel.build(map, self);
        }

        public ListProjectsResponseBodyDataProjectsSecurityProperties setEnableDownloadPrivilege(Boolean enableDownloadPrivilege) {
            this.enableDownloadPrivilege = enableDownloadPrivilege;
            return this;
        }
        public Boolean getEnableDownloadPrivilege() {
            return this.enableDownloadPrivilege;
        }

        public ListProjectsResponseBodyDataProjectsSecurityProperties setLabelSecurity(Boolean labelSecurity) {
            this.labelSecurity = labelSecurity;
            return this;
        }
        public Boolean getLabelSecurity() {
            return this.labelSecurity;
        }

        public ListProjectsResponseBodyDataProjectsSecurityProperties setObjectCreatorHasAccessPermission(Boolean objectCreatorHasAccessPermission) {
            this.objectCreatorHasAccessPermission = objectCreatorHasAccessPermission;
            return this;
        }
        public Boolean getObjectCreatorHasAccessPermission() {
            return this.objectCreatorHasAccessPermission;
        }

        public ListProjectsResponseBodyDataProjectsSecurityProperties setObjectCreatorHasGrantPermission(Boolean objectCreatorHasGrantPermission) {
            this.objectCreatorHasGrantPermission = objectCreatorHasGrantPermission;
            return this;
        }
        public Boolean getObjectCreatorHasGrantPermission() {
            return this.objectCreatorHasGrantPermission;
        }

        public ListProjectsResponseBodyDataProjectsSecurityProperties setProjectProtection(ListProjectsResponseBodyDataProjectsSecurityPropertiesProjectProtection projectProtection) {
            this.projectProtection = projectProtection;
            return this;
        }
        public ListProjectsResponseBodyDataProjectsSecurityPropertiesProjectProtection getProjectProtection() {
            return this.projectProtection;
        }

        public ListProjectsResponseBodyDataProjectsSecurityProperties setUsingAcl(Boolean usingAcl) {
            this.usingAcl = usingAcl;
            return this;
        }
        public Boolean getUsingAcl() {
            return this.usingAcl;
        }

        public ListProjectsResponseBodyDataProjectsSecurityProperties setUsingPolicy(Boolean usingPolicy) {
            this.usingPolicy = usingPolicy;
            return this;
        }
        public Boolean getUsingPolicy() {
            return this.usingPolicy;
        }

    }

    public static class ListProjectsResponseBodyDataProjects extends TeaModel {
        @NameInMap("Tags")
        public java.util.List<ListProjectsResponseBodyDataProjectsTags> tags;

        @NameInMap("comment")
        public String comment;

        @NameInMap("costStorage")
        public String costStorage;

        @NameInMap("defaultQuota")
        public String defaultQuota;

        @NameInMap("ipWhiteList")
        public ListProjectsResponseBodyDataProjectsIpWhiteList ipWhiteList;

        @NameInMap("name")
        public String name;

        @NameInMap("owner")
        public String owner;

        @NameInMap("properties")
        public ListProjectsResponseBodyDataProjectsProperties properties;

        @NameInMap("saleTag")
        public ListProjectsResponseBodyDataProjectsSaleTag saleTag;

        @NameInMap("securityProperties")
        public ListProjectsResponseBodyDataProjectsSecurityProperties securityProperties;

        @NameInMap("status")
        public String status;

        @NameInMap("type")
        public String type;

        public static ListProjectsResponseBodyDataProjects build(java.util.Map<String, ?> map) throws Exception {
            ListProjectsResponseBodyDataProjects self = new ListProjectsResponseBodyDataProjects();
            return TeaModel.build(map, self);
        }

        public ListProjectsResponseBodyDataProjects setTags(java.util.List<ListProjectsResponseBodyDataProjectsTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<ListProjectsResponseBodyDataProjectsTags> getTags() {
            return this.tags;
        }

        public ListProjectsResponseBodyDataProjects setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public ListProjectsResponseBodyDataProjects setCostStorage(String costStorage) {
            this.costStorage = costStorage;
            return this;
        }
        public String getCostStorage() {
            return this.costStorage;
        }

        public ListProjectsResponseBodyDataProjects setDefaultQuota(String defaultQuota) {
            this.defaultQuota = defaultQuota;
            return this;
        }
        public String getDefaultQuota() {
            return this.defaultQuota;
        }

        public ListProjectsResponseBodyDataProjects setIpWhiteList(ListProjectsResponseBodyDataProjectsIpWhiteList ipWhiteList) {
            this.ipWhiteList = ipWhiteList;
            return this;
        }
        public ListProjectsResponseBodyDataProjectsIpWhiteList getIpWhiteList() {
            return this.ipWhiteList;
        }

        public ListProjectsResponseBodyDataProjects setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListProjectsResponseBodyDataProjects setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public ListProjectsResponseBodyDataProjects setProperties(ListProjectsResponseBodyDataProjectsProperties properties) {
            this.properties = properties;
            return this;
        }
        public ListProjectsResponseBodyDataProjectsProperties getProperties() {
            return this.properties;
        }

        public ListProjectsResponseBodyDataProjects setSaleTag(ListProjectsResponseBodyDataProjectsSaleTag saleTag) {
            this.saleTag = saleTag;
            return this;
        }
        public ListProjectsResponseBodyDataProjectsSaleTag getSaleTag() {
            return this.saleTag;
        }

        public ListProjectsResponseBodyDataProjects setSecurityProperties(ListProjectsResponseBodyDataProjectsSecurityProperties securityProperties) {
            this.securityProperties = securityProperties;
            return this;
        }
        public ListProjectsResponseBodyDataProjectsSecurityProperties getSecurityProperties() {
            return this.securityProperties;
        }

        public ListProjectsResponseBodyDataProjects setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListProjectsResponseBodyDataProjects setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListProjectsResponseBodyData extends TeaModel {
        @NameInMap("NextToken")
        public String nextToken;

        @NameInMap("marker")
        public String marker;

        @NameInMap("maxItem")
        public Integer maxItem;

        @NameInMap("projects")
        public java.util.List<ListProjectsResponseBodyDataProjects> projects;

        public static ListProjectsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListProjectsResponseBodyData self = new ListProjectsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListProjectsResponseBodyData setNextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }
        public String getNextToken() {
            return this.nextToken;
        }

        public ListProjectsResponseBodyData setMarker(String marker) {
            this.marker = marker;
            return this;
        }
        public String getMarker() {
            return this.marker;
        }

        public ListProjectsResponseBodyData setMaxItem(Integer maxItem) {
            this.maxItem = maxItem;
            return this;
        }
        public Integer getMaxItem() {
            return this.maxItem;
        }

        public ListProjectsResponseBodyData setProjects(java.util.List<ListProjectsResponseBodyDataProjects> projects) {
            this.projects = projects;
            return this;
        }
        public java.util.List<ListProjectsResponseBodyDataProjects> getProjects() {
            return this.projects;
        }

    }

}
