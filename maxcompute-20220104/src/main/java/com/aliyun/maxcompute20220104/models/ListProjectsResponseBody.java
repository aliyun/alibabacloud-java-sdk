// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class ListProjectsResponseBody extends TeaModel {
    /**
     * <p>The data returned.</p>
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
         * <p>The IP address whitelist for access over the Internet or the network for interconnecting with other Alibaba Cloud services.</p>
         * <blockquote>
         * <p> If you configure only the IP address whitelist for access over the Internet or the network for interconnecting with other Alibaba Cloud services, the access over the Internet or the network for interconnecting with other Alibaba Cloud services is subject to configurations, and access over a virtual private cloud (VPC) is not allowed.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>10.88.111.3</p>
         */
        @NameInMap("ipList")
        public String ipList;

        /**
         * <p>The IP address whitelist for access over a VPC.</p>
         * <blockquote>
         * <p> If you configure only the IP address whitelist for access over a VPC, the access over a VPC is subject to configurations, and the access over the Internet or the network for interconnecting with other Alibaba Cloud services is not allowed.</p>
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
         * <p>The data encryption algorithm that is supported by the key. Valid values: AES256, AESCTR, and RC4.</p>
         * 
         * <strong>example:</strong>
         * <p>SHA1</p>
         */
        @NameInMap("algorithm")
        public String algorithm;

        /**
         * <p>Indicates whether the data encryption feature needs to be enabled for the project. For more information about data encryption, see</p>
         * <p><a href="https://www.alibabacloud.com/help/zh/maxcompute/security-and-compliance/storage-encryption">Storage encryption</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("enable")
        public Boolean enable;

        /**
         * <p>The type of key that is used for data encryption. You can select MaxCompute Default Key or Bring Your Own Key (BYOK) as the key type. If you select MaxCompute Default Key, the default key that is created by MaxCompute is used.</p>
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
         * <p>Indicates whether the external project is an external project for <a href="https://www.alibabacloud.com/help/zh/maxcompute/user-guide/lake-warehouse-integrated-2-0-use-guide">data lakehouse solution 2.0</a>.</p>
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
         * <p>The lifecycle type. Valid values:</p>
         * <ul>
         * <li><strong>mandatory</strong>: The lifecycle clause is required in a table creation statement.</li>
         * <li><strong>optional</strong>: The lifecycle clause is optional in a table creation statement. If you do not configure a lifecycle for a table, the table does not expire.</li>
         * <li><strong>inherit</strong>: If you do not configure a lifecycle for a table when you create the table, the value of the odps.table.lifecycle.value parameter is used as the table lifecycle by default.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>optional</p>
         */
        @NameInMap("type")
        public String type;

        /**
         * <p>The table lifecycle. Unit: days. Valid values: 1 to 37231. Default value: 37231.</p>
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
         * <p>Indicates whether a full table scan is allowed in the project. A full table scan occupies a large number of resources, which reduces data processing efficiency. By default, the full table scan feature is disabled.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("allowFullScan")
        public Boolean allowFullScan;

        /**
         * <p>Indicates whether the DECIMAL type of the MaxCompute V2.0 data type edition is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("enableDecimal2")
        public Boolean enableDecimal2;

        /**
         * <p>Indicates whether the routing of the Tunnel resource group is enabled.</p>
         * <ul>
         * <li>true: The data transfer tasks that are submitted by the project by default use the Tunnel resource group that is bound to the project.</li>
         * <li>false: The data transfer tasks that are submitted by the project by default use the Tunnel shared resource group.</li>
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
         * <p>The retention period for backup data. Unit: days. During the retention period, you can restore data of the version in use to the backup data of any version. Valid values: [0,30]. Default value: 1. The value 0 indicates that the backup feature is disabled.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("retentionDays")
        public Long retentionDays;

        /**
         * <p>The maximum consumption threshold of a single SQL statement. Formula: Amount of scanned data (GB) × Complexity.</p>
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
         * <p>The time zone that is used by your project. The time zone is the same as the time zone specified by <code>odps.sql.timezone</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>Asia/Shanghai</p>
         */
        @NameInMap("timezone")
        public String timezone;

        /**
         * <p>The <a href="https://www.alibabacloud.com/help/zh/maxcompute/user-guide/overview-of-dts">Tunnel</a> resource group that is bound to the project.</p>
         * <ul>
         * <li>Default resource group: The Tunnel shared resource group is used. You cannot use the subscription-based Tunnel resource group for the project. The default resource group is automatically used by the Tunnel service of your project, regardless of the parameter setting.</li>
         * <li>Subscription-based Tunnel resource group: You can use the subscription-based Tunnel resource group for the project.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>quota_tunnel</p>
         */
        @NameInMap("tunnelQuota")
        public String tunnelQuota;

        /**
         * <p>The data type edition. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: MaxCompute V1.0 data type edition</li>
         * <li><strong>2</strong>: MaxCompute V2.0 data type edition</li>
         * <li><strong>hive</strong>: Hive-compatible data type edition</li>
         * </ul>
         * <p>For more information about the differences among the three data type editions, see <a href="https://www.alibabacloud.com/help/zh/maxcompute/user-guide/data-type-editions">Data type editions</a>.</p>
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
         * <p>The instance ID of the default computing quota.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;aaaa-bbbb&quot;</p>
         */
        @NameInMap("resourceId")
        public String resourceId;

        /**
         * <p>The billing method of the default computing quota.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;project&quot;</p>
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
         * <p>If you enable the project data protection mechanism, you can configure exception or trusted projects. This allows specified users to transfer data of a specified object to a specified project. The project data protection mechanism does not take effect in all the situations that are specified in the exception policy.</p>
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
         * <p>Indicates whether the <a href="https://www.alibabacloud.com/help/zh/maxcompute/security-and-compliance/project-data-protection">data protection mechanism</a> is enabled for the project. This allows or denies data transfer across projects. By default, the data protection mechanism is disabled.</p>
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
         * <p>Indicates whether the <a href="https://www.alibabacloud.com/help/zh/maxcompute/user-guide/label-based-access-control">download control</a> feature is enabled. By default, this feature is disabled.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("enableDownloadPrivilege")
        public Boolean enableDownloadPrivilege;

        /**
         * <p>Indicates whether the <a href="https://www.alibabacloud.com/help/zh/maxcompute/user-guide/label-based-access-control">label-based access control</a> feature is enabled. By default, this feature is disabled.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("labelSecurity")
        public Boolean labelSecurity;

        /**
         * <p>Indicates whether to allow the object creator to have the access permissions on the object. The default value is true, which indicates that the object creator has the access permissions on the object.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("objectCreatorHasAccessPermission")
        public Boolean objectCreatorHasAccessPermission;

        /**
         * <p>Indicates whether the object creator has the authorization permissions on the object. The default value is true, which indicates that the object creator has the authorization permissions on the object.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("objectCreatorHasGrantPermission")
        public Boolean objectCreatorHasGrantPermission;

        /**
         * <p>The properties of the <a href="https://www.alibabacloud.com/help/zh/maxcompute/security-and-compliance/project-data-protection">data protection mechanism</a>.</p>
         */
        @NameInMap("projectProtection")
        public ListProjectsResponseBodyDataProjectsSecurityPropertiesProjectProtection projectProtection;

        /**
         * <p>Indicates whether the <a href="https://www.alibabacloud.com/help/zh/maxcompute/user-guide/acl-based-access-control">ACL-based access control</a> feature is enabled. By default, this feature is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("usingAcl")
        public Boolean usingAcl;

        /**
         * <p>Indicates whether the <a href="https://www.alibabacloud.com/help/zh/maxcompute/user-guide/policy-based-access-control-1">policy-based access control</a> feature is enabled. By default, this feature is enabled.</p>
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
         * <p>The project description.</p>
         * 
         * <strong>example:</strong>
         * <p>maxcompute projects</p>
         */
        @NameInMap("comment")
        public String comment;

        /**
         * <p>The total storage usage. The storage space that is occupied by your project, which is the logical storage space after your project data is collected and compressed.</p>
         * 
         * <strong>example:</strong>
         * <p>16489027</p>
         */
        @NameInMap("costStorage")
        public String costStorage;

        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>1704380838000</p>
         */
        @NameInMap("createdTime")
        public Long createdTime;

        /**
         * <p>The default computing quota that is used to allocate computing resources. If you do not specify a computing quota for your project, the jobs that are initiated by your project consume the computing resources in the default quota. For more information about how to use computing resources, see <a href="https://www.alibabacloud.com/help/zh/maxcompute/user-guide/use-of-computing-resources">Use quota groups for computing resources</a></p>
         * 
         * <strong>example:</strong>
         * <p>quotaA</p>
         */
        @NameInMap("defaultQuota")
        public String defaultQuota;

        /**
         * <p>The information about the IP address whitelist.</p>
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
         * <p>The account information of the project owner.</p>
         * 
         * <strong>example:</strong>
         * <p>1139815775606813</p>
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
         * <p>The instance ID and billing method of the default computing quota.</p>
         */
        @NameInMap("saleTag")
        public ListProjectsResponseBodyDataProjectsSaleTag saleTag;

        /**
         * <p>The permission properties.</p>
         */
        @NameInMap("securityProperties")
        public ListProjectsResponseBodyDataProjectsSecurityProperties securityProperties;

        /**
         * <p>The project status. Valid values:</p>
         * <ul>
         * <li><strong>AVAILABLE</strong></li>
         * <li><strong>READONLY</strong></li>
         * <li><strong>FROZEN</strong></li>
         * <li><strong>DELETING</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>AVAILABLE</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>Indicates whether data storage by schema is supported. MaxCompute supports the schema feature. This feature allows you to classify objects such as tables, resources, and user-defined functions (UDFs) in a project by schema. You can create multiple schemas in a project. For more information, see <a href="https://www.alibabacloud.com/help/zh/maxcompute/user-guide/schema-related-operations">Schema-related operations</a>.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>true: supported</li>
         * <li>false: not supported</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("threeTierModel")
        public Boolean threeTierModel;

        /**
         * <p>The project type. Valid values:</p>
         * <ul>
         * <li><strong>managed</strong>: internal project</li>
         * <li><strong>external</strong>: external project</li>
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
         * <p>A pagination token. Only continuous page turning is supported. If NextToken is not empty, the next page exists. The value of NextToken can be used in the next request to retrieve a new page of results.</p>
         * 
         * <strong>example:</strong>
         * <p>AAAAAV3MpHK1AP0pfERHZN5pu6kvikyUl3ChyRxN+qLPvtOb</p>
         */
        @NameInMap("NextToken")
        public String nextToken;

        /**
         * <p>Indicates the marker after which the returned list begins.</p>
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
