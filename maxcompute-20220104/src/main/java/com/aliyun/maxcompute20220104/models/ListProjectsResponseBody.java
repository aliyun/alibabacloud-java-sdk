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
     * 
     * <strong>example:</strong>
     * <p>0b16399216671970335563173e2340</p>
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

    public static class ListProjectsResponseBodyDataProjectsIpWhiteList extends TeaModel {
        /**
         * <p>The IP whitelist for access over the public network and from other Alibaba Cloud services.</p>
         * <blockquote>
         * <p>If you configure only this IP whitelist, access over the public network and from other Alibaba Cloud services is restricted based on the whitelist, and all access from VPCs is denied.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>10.88.111.3</p>
         */
        @NameInMap("ipList")
        public String ipList;

        /**
         * <p>The IP whitelist for access from VPCs.</p>
         * <blockquote>
         * <p>If you configure only the VPC IP whitelist, access from VPCs is restricted based on the whitelist, and all access over the public network and from other Alibaba Cloud services is denied.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>10.88.111.3</p>
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
         * <p>The data encryption algorithm. Supported algorithms include AES256, AESCTR, and RC4.</p>
         * 
         * <strong>example:</strong>
         * <p>AES256</p>
         */
        @NameInMap("algorithm")
        public String algorithm;

        /**
         * <p>Specifies whether to enable storage encryption for the project. For more information, see
         * &lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/help/zh/maxcompute/security-and-compliance/storage-encryption">Storage encryption</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("enable")
        public Boolean enable;

        /**
         * <p>The key for data encryption. You can use the default MaxCompute-managed key or a custom key with the Bring Your Own Key (BYOK) feature.</p>
         * 
         * <strong>example:</strong>
         * <p>dafault</p>
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

    public static class ListProjectsResponseBodyDataProjectsPropertiesExternalProjectProperties extends TeaModel {
        /**
         * <p>Specifies whether the project is an external project for &lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/help/zh/maxcompute/user-guide/lake-warehouse-integrated-2-0-use-guide">Integrated Lakehouse</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("isExternalCatalogBound")
        public String isExternalCatalogBound;

        public static ListProjectsResponseBodyDataProjectsPropertiesExternalProjectProperties build(java.util.Map<String, ?> map) throws Exception {
            ListProjectsResponseBodyDataProjectsPropertiesExternalProjectProperties self = new ListProjectsResponseBodyDataProjectsPropertiesExternalProjectProperties();
            return TeaModel.build(map, self);
        }

        public ListProjectsResponseBodyDataProjectsPropertiesExternalProjectProperties setIsExternalCatalogBound(String isExternalCatalogBound) {
            this.isExternalCatalogBound = isExternalCatalogBound;
            return this;
        }
        public String getIsExternalCatalogBound() {
            return this.isExternalCatalogBound;
        }

    }

    public static class ListProjectsResponseBodyDataProjectsPropertiesTableLifecycle extends TeaModel {
        /**
         * <p>The type of the lifecycle. Valid values:</p>
         * <ul>
         * <li><p><strong>mandatory</strong>: A lifecycle must be configured for each table.</p>
         * </li>
         * <li><p><strong>optional</strong>: The lifecycle is optional. If unspecified for a table, the table does not expire.</p>
         * </li>
         * <li><p><strong>inherit</strong>: If no lifecycle is specified for a table, the table inherits its lifecycle from the <code>odps.table.lifecycle.value</code> property.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>optional</p>
         */
        @NameInMap("type")
        public String type;

        /**
         * <p>The lifecycle of the table, in days. Valid values: <code>1</code> to <code>37231</code>. Default value: <code>37231</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>37231</p>
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
         * <p>Specifies whether to allow a full table scan in the project. This feature is disabled by default because a full table scan can consume a large amount of computing resources.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("allowFullScan")
        public Boolean allowFullScan;

        /**
         * <p>Specifies whether to enable the MaxCompute 2.0 Decimal data type in the project.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("enableDecimal2")
        public Boolean enableDecimal2;

        /**
         * <p>Specifies whether to enable routing for the Data Transmission Service resource group.</p>
         * <ul>
         * <li><p>true: Data transmission jobs submitted by default from the project use the bound Data Transmission Service resource group.</p>
         * </li>
         * <li><p>false: Data transmission jobs submitted by default from the project use the shared Data Transmission Service resource group.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("enableTunnelQuotaRoute")
        public Boolean enableTunnelQuotaRoute;

        /**
         * <p>The storage encryption properties.</p>
         */
        @NameInMap("encryption")
        public ListProjectsResponseBodyDataProjectsPropertiesEncryption encryption;

        /**
         * <p>The properties of the external project.</p>
         */
        @NameInMap("externalProjectProperties")
        public ListProjectsResponseBodyDataProjectsPropertiesExternalProjectProperties externalProjectProperties;

        /**
         * <p>The number of retention days for backup data. You can restore data to any backup version that is created within the retention period. Valid values: <code>0</code> to <code>30</code>. Default value: <code>1</code>. A value of <code>0</code> indicates that the backup feature is disabled.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("retentionDays")
        public Long retentionDays;

        /**
         * <p>The maximum metered cost for a single SQL statement. The cost is calculated by using the formula: (scanned data in GB) × (complexity).</p>
         * 
         * <strong>example:</strong>
         * <p>1500</p>
         */
        @NameInMap("sqlMeteringMax")
        public String sqlMeteringMax;

        /**
         * <p>The table lifecycle properties.</p>
         */
        @NameInMap("tableLifecycle")
        public ListProjectsResponseBodyDataProjectsPropertiesTableLifecycle tableLifecycle;

        /**
         * <p>The time zone of the project. This parameter corresponds to the <code>odps.sql.timezone</code> property.</p>
         * 
         * <strong>example:</strong>
         * <p>Asia/Shanghai</p>
         */
        @NameInMap("timezone")
        public String timezone;

        /**
         * <p>The &lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/help/zh/maxcompute/user-guide/overview-of-dts">Data Transmission Service</a> resource group that is bound to the project.</p>
         * <ul>
         * <li><p>Default (shared Data Transmission Service resource group): The project cannot use subscription Data Transmission Service resource groups. Data Transmission Service jobs submitted from this project automatically use the Default resource group, regardless of the default setting for the Data Transmission Service resource group.</p>
         * </li>
         * <li><p>Subscription Data Transmission Service resource group: The project can use a subscription Data Transmission Service resource group.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Default</p>
         */
        @NameInMap("tunnelQuota")
        public String tunnelQuota;

        /**
         * <p>The data type version. Valid values:</p>
         * <ul>
         * <li><p><strong>1</strong>: Version 1.0.</p>
         * </li>
         * <li><p><strong>2</strong>: Version 2.0.</p>
         * </li>
         * <li><p><strong>hive</strong>: A Hive-compatible type.</p>
         * </li>
         * </ul>
         * <p>For more information about the differences between the data type versions, see &lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/help/zh/maxcompute/user-guide/data-type-editions">Data type versions</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
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

        public ListProjectsResponseBodyDataProjectsProperties setExternalProjectProperties(ListProjectsResponseBodyDataProjectsPropertiesExternalProjectProperties externalProjectProperties) {
            this.externalProjectProperties = externalProjectProperties;
            return this;
        }
        public ListProjectsResponseBodyDataProjectsPropertiesExternalProjectProperties getExternalProjectProperties() {
            return this.externalProjectProperties;
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
         * <p>The instance ID of the default compute quota.</p>
         * 
         * <strong>example:</strong>
         * <p>b7afb7d1-<strong><strong>-</strong></strong>-****-c393669c307b</p>
         */
        @NameInMap("resourceId")
        public String resourceId;

        /**
         * <p>The billing method of the default compute quota.</p>
         * 
         * <strong>example:</strong>
         * <p>PayAsYouGo</p>
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
         * <p>If project data protection is enabled, you can configure an exception policy. This policy allows specified users to export data from specified objects to trusted projects, bypassing the data protection mechanism.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *       &quot;Version&quot;: &quot;1&quot;,
         *       &quot;Statement&quot;: [
         *             {
         *                   &quot;Effect&quot;: &quot;Allow&quot;,
         *                   &quot;Principal&quot;: &quot;&quot;,
         *                   &quot;Action&quot;: [
         *                         &quot;odps:[, , ...]&quot;
         *                   ],
         *                   &quot;Resource&quot;: &quot;acs:odps:*:&quot;,
         *                   &quot;Condition&quot;: {
         *                         &quot;StringEquals&quot;: {
         *                               &quot;odps:TaskType&quot;: [
         *                                     &quot;&quot;
         *                               ]
         *                         }
         *                   }
         *             }
         *       ]
         * }</p>
         */
        @NameInMap("exceptionPolicy")
        public String exceptionPolicy;

        /**
         * <p>Specifies whether to enable &lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/help/zh/maxcompute/security-and-compliance/project-data-protection">project data protection</a> to prevent data from being exported from the project. Default value: <code>false</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
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
         * <p>Specifies whether to enable &lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/help/zh/maxcompute/user-guide/label-based-access-control">download control</a>. Default value: <code>false</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("enableDownloadPrivilege")
        public Boolean enableDownloadPrivilege;

        /**
         * <p>Specifies whether to enable &lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/help/zh/maxcompute/user-guide/label-based-access-control">label-based access control</a>. Default value: <code>false</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("labelSecurity")
        public Boolean labelSecurity;

        /**
         * <p>Specifies whether the creator of an object can access it. Default value: <code>true</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("objectCreatorHasAccessPermission")
        public Boolean objectCreatorHasAccessPermission;

        /**
         * <p>Specifies whether the creator of an object can grant other users permissions on it. Default value: <code>true</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("objectCreatorHasGrantPermission")
        public Boolean objectCreatorHasGrantPermission;

        /**
         * <p>The &lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/help/zh/maxcompute/security-and-compliance/project-data-protection">project data protection</a> properties.</p>
         */
        @NameInMap("projectProtection")
        public ListProjectsResponseBodyDataProjectsSecurityPropertiesProjectProtection projectProtection;

        /**
         * <p>Specifies whether to enable &lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/help/zh/maxcompute/user-guide/acl-based-access-control">ACL-based access control</a>. Default value: <code>true</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("usingAcl")
        public Boolean usingAcl;

        /**
         * <p>Specifies whether to enable &lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/help/zh/maxcompute/user-guide/policy-based-access-control-1">policy-based access control</a>. Default value: <code>true</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
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
         * <p>The description of the project.</p>
         * 
         * <strong>example:</strong>
         * <p>BI_Analysis</p>
         */
        @NameInMap("comment")
        public String comment;

        /**
         * <p>The total storage usage of the project, which represents the compressed, logical data size used for metering.</p>
         * 
         * <strong>example:</strong>
         * <p>16489027</p>
         */
        @NameInMap("costStorage")
        public String costStorage;

        /**
         * <p>The time when the project was created, as a Unix timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1704380838000</p>
         */
        @NameInMap("createdTime")
        public Long createdTime;

        /**
         * <p>The default compute quota. If you do not specify a quota for a job, the job consumes computing resources from this default quota. For more information about how to use computing resources, see &lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/help/zh/maxcompute/user-guide/use-of-computing-resources">Use of computing resources</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>os_PayAsYouGoQuota</p>
         */
        @NameInMap("defaultQuota")
        public String defaultQuota;

        /**
         * <p>The IP whitelist.</p>
         */
        @NameInMap("ipWhiteList")
        public ListProjectsResponseBodyDataProjectsIpWhiteList ipWhiteList;

        /**
         * <p>The name of the project.</p>
         * 
         * <strong>example:</strong>
         * <p>odps_project</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The owner of the project.</p>
         * 
         * <strong>example:</strong>
         * <p>ALIYUN$odps****@aliyunid.com</p>
         */
        @NameInMap("owner")
        public String owner;

        /**
         * <p>The basic properties of the project.</p>
         */
        @NameInMap("properties")
        public ListProjectsResponseBodyDataProjectsProperties properties;

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        @NameInMap("regionId")
        public String regionId;

        /**
         * <p>The instance ID and billing method of the default compute quota.</p>
         */
        @NameInMap("saleTag")
        public ListProjectsResponseBodyDataProjectsSaleTag saleTag;

        /**
         * <p>The security-related properties.</p>
         */
        @NameInMap("securityProperties")
        public ListProjectsResponseBodyDataProjectsSecurityProperties securityProperties;

        /**
         * <p>The status of the project. Valid values:</p>
         * <ul>
         * <li><p><strong>AVAILABLE</strong>: The project is running as expected.</p>
         * </li>
         * <li><p><strong>READONLY</strong>: The project is read-only.</p>
         * </li>
         * <li><p><strong>FROZEN</strong>: The project is frozen.</p>
         * </li>
         * <li><p><strong>DELETING</strong>: The project is being deleted.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>AVAILABLE</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>Specifies whether the project uses a three-tier model (project &gt; schema &gt; object). In this model, schemas are used within a project to organize objects such as tables, resources, and user-defined functions (UDFs). For more information, see &lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/help/zh/maxcompute/user-guide/schema-related-operations">Schema operations</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("threeTierModel")
        public Boolean threeTierModel;

        /**
         * <p>The type of the project. Valid values:</p>
         * <ul>
         * <li><p><strong>managed</strong>: An internal project.</p>
         * </li>
         * <li><p><strong>external</strong>: An external project.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>managed</p>
         */
        @NameInMap("type")
        public String type;

        public static ListProjectsResponseBodyDataProjects build(java.util.Map<String, ?> map) throws Exception {
            ListProjectsResponseBodyDataProjects self = new ListProjectsResponseBodyDataProjects();
            return TeaModel.build(map, self);
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
         * <p>The token for retrieving the next page of results. If this parameter is empty, all results have been returned.</p>
         * 
         * <strong>example:</strong>
         * <p>AAAAAV3MpHK1AP0pfERHZN5pu6kvikyUl3ChyRxN+qLPvtOb</p>
         */
        @NameInMap("NextToken")
        public String nextToken;

        /**
         * <p>A pagination marker used to retrieve the next page of results. This parameter is returned when the response is truncated.</p>
         * 
         * <strong>example:</strong>
         * <p>cHlvZHBzX3VkZl8xMDExNV8xNDU3NDI4NDkzKg==</p>
         */
        @NameInMap("marker")
        public String marker;

        /**
         * <p>The maximum number of entries returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("maxItem")
        public Integer maxItem;

        /**
         * <p>The list of projects.</p>
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
