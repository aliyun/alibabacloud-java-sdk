// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class ListProjectsResponseBody extends TeaModel {
    /**
     * <p>The returned data.</p>
     */
    @NameInMap("data")
    public ListProjectsResponseBodyData data;

    /**
     * <p>The request ID.</p>
     */
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
        /**
         * <p>The tag key.</p>
         */
        @NameInMap("TagKey")
        public String tagKey;

        /**
         * <p>The tag value.</p>
         */
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
        /**
         * <p>The list of IP addresses.</p>
         */
        @NameInMap("ipList")
        public String ipList;

        /**
         * <p>The list of virtual private cloud (VPC) IP addresses.</p>
         */
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
        /**
         * <p>The name of the encryption algorithm.</p>
         */
        @NameInMap("algorithm")
        public String algorithm;

        /**
         * <p>Indicates whether data encryption is enabled. Valid values: true and false.</p>
         */
        @NameInMap("enable")
        public Boolean enable;

        /**
         * <p>The key of the encryption algorithm.</p>
         */
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
        /**
         * <p>The type of the lifecycle. Valid values: -mandatory: The lifecycle clause is required. You must configure a lifecycle for a table. -optional: The lifecycle clause is optional in a table creation statement. If you do not configure a lifecycle for a table, the table does not expire. -inherit: If you do not configure a lifecycle for a table when you create the table, the value of odps.table.lifecycle.value is used by default.</p>
         */
        @NameInMap("type")
        public String type;

        /**
         * <p>The retention period of a table. Unit: days.</p>
         */
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
        /**
         * <p>Indicates whether a full table scan on the project is enabled.</p>
         */
        @NameInMap("allowFullScan")
        public Boolean allowFullScan;

        /**
         * <p>Indicates whether the DECIMAL data type in the MaxCompute V2.0 data type edition is enabled.</p>
         */
        @NameInMap("enableDecimal2")
        public Boolean enableDecimal2;

        /**
         * <p>Indicates whether tunnel quota routing is enabled.</p>
         */
        @NameInMap("enableTunnelQuotaRoute")
        public Boolean enableTunnelQuotaRoute;

        /**
         * <p>The encryption information.</p>
         */
        @NameInMap("encryption")
        public ListProjectsResponseBodyDataProjectsPropertiesEncryption encryption;

        /**
         * <p>The maximum number of days for which backup data can be retained.</p>
         */
        @NameInMap("retentionDays")
        public Long retentionDays;

        /**
         * <p>The upper limit for the resources that are consumed by an SQL statement.</p>
         */
        @NameInMap("sqlMeteringMax")
        public String sqlMeteringMax;

        /**
         * <p>The lifecycle of a table in the project.</p>
         */
        @NameInMap("tableLifecycle")
        public ListProjectsResponseBodyDataProjectsPropertiesTableLifecycle tableLifecycle;

        /**
         * <p>The time zone of the instance.</p>
         */
        @NameInMap("timezone")
        public String timezone;

        /**
         * <p>The name of the tunnel quota.</p>
         */
        @NameInMap("tunnelQuota")
        public String tunnelQuota;

        /**
         * <p>The data type edition. Valid values: -1: MaxCompute V1.0 data type edition. -2: MaxCompute V2.0 data type edition. -hive: Hive-compatible data type edition.</p>
         */
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
        /**
         * <p>The identifier of an object in a MaxCompute quota. This identifier is the same as the identifier in the sales bill of Alibaba Cloud. This parameter is used for tags.</p>
         */
        @NameInMap("resourceId")
        public String resourceId;

        /**
         * <p>The type of the object. Valid values: quota and project.</p>
         */
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
        /**
         * <p>The exception policy. If cross-project data access operations are required, the project owner must configure an exception policy in advance to allow the specified user to transfer data of a specified object from the current project to a specified project. After the exception policy is configured, data of the object can be transferred to the specified project even if the project data protection feature is enabled.</p>
         */
        @NameInMap("exceptionPolicy")
        public String exceptionPolicy;

        /**
         * <p>Indicates whether project data protection is enabled.</p>
         */
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
        /**
         * <p>Indicates whether Download control is enabled.</p>
         */
        @NameInMap("enableDownloadPrivilege")
        public Boolean enableDownloadPrivilege;

        /**
         * <p>Indicates whether label-based access control is enabled.</p>
         */
        @NameInMap("labelSecurity")
        public Boolean labelSecurity;

        /**
         * <p>Indicates whether the object creator is allowed to perform operations on objects.</p>
         */
        @NameInMap("objectCreatorHasAccessPermission")
        public Boolean objectCreatorHasAccessPermission;

        /**
         * <p>Indicates whether the object creator is allowed to authorize other users to perform operations on objects.</p>
         */
        @NameInMap("objectCreatorHasGrantPermission")
        public Boolean objectCreatorHasGrantPermission;

        /**
         * <p>Indicates whether project data protection is enabled.</p>
         */
        @NameInMap("projectProtection")
        public ListProjectsResponseBodyDataProjectsSecurityPropertiesProjectProtection projectProtection;

        /**
         * <p>Indicates whether ACL-based access control is enabled.</p>
         */
        @NameInMap("usingAcl")
        public Boolean usingAcl;

        /**
         * <p>Indicates whether policy-based access control is enabled.</p>
         */
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
        /**
         * <p>The tags.</p>
         */
        @NameInMap("Tags")
        public java.util.List<ListProjectsResponseBodyDataProjectsTags> tags;

        /**
         * <p>The remarks.</p>
         */
        @NameInMap("comment")
        public String comment;

        /**
         * <p>The storage usage.</p>
         */
        @NameInMap("costStorage")
        public String costStorage;

        /**
         * <p>Create time</p>
         */
        @NameInMap("createdTime")
        public Long createdTime;

        /**
         * <p>The default computing quota.</p>
         */
        @NameInMap("defaultQuota")
        public String defaultQuota;

        /**
         * <p>The IP address whitelist.</p>
         */
        @NameInMap("ipWhiteList")
        public ListProjectsResponseBodyDataProjectsIpWhiteList ipWhiteList;

        /**
         * <p>The name of the project.</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The owner of the project.</p>
         */
        @NameInMap("owner")
        public String owner;

        /**
         * <p>The properties of the project.</p>
         */
        @NameInMap("properties")
        public ListProjectsResponseBodyDataProjectsProperties properties;

        /**
         * <p>Region Id</p>
         */
        @NameInMap("regionId")
        public String regionId;

        /**
         * <p>The identifier of an object in a MaxCompute quota. This identifier is the same as the identifier in the sales bill of Alibaba Cloud. This parameter is used for tags.</p>
         */
        @NameInMap("saleTag")
        public ListProjectsResponseBodyDataProjectsSaleTag saleTag;

        /**
         * <p>The permission properties.</p>
         */
        @NameInMap("securityProperties")
        public ListProjectsResponseBodyDataProjectsSecurityProperties securityProperties;

        /**
         * <p>The status of the project. Valid values: -AVAILABLE: The project is available. -READONLY: The project is read-only. -FROZEN: The project is frozen. -DELETING: The project is being deleted.</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>Indicates whether the current project supports the MaxCompute three-layer model.</p>
         * <br>
         * <p>Valid values:</p>
         * <br>
         * <p>*   true</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>*   false</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         */
        @NameInMap("threeTierModel")
        public Boolean threeTierModel;

        /**
         * <p>The project type. Valid values: -managed: The project is an internal project. -external: The project is an external project.</p>
         */
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

        public ListProjectsResponseBodyDataProjects setCreatedTime(Long createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public Long getCreatedTime() {
            return this.createdTime;
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

        public ListProjectsResponseBodyDataProjects setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
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

        public ListProjectsResponseBodyDataProjects setThreeTierModel(Boolean threeTierModel) {
            this.threeTierModel = threeTierModel;
            return this;
        }
        public Boolean getThreeTierModel() {
            return this.threeTierModel;
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
        /**
         * <p>A pagination token. Only continuous page turning is supported. If NextToken is not empty, the next page exists. The value of NextToken can be used in the next request to retrieve a new page of results.</p>
         */
        @NameInMap("NextToken")
        public String nextToken;

        /**
         * <p>Indicates the marker after which the returned list begins.</p>
         */
        @NameInMap("marker")
        public String marker;

        /**
         * <p>The maximum number of entries returned per page.</p>
         */
        @NameInMap("maxItem")
        public Integer maxItem;

        /**
         * <p>The description of the project.</p>
         */
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
