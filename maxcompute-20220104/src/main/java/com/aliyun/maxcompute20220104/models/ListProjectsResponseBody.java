// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class ListProjectsResponseBody extends TeaModel {
    /**
     * <p>The returned results.</p>
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
         * <p>The IP address whitelist for the Internet and cloud service interconnection network.</p>
         * <blockquote>
         * <p>If you configure only the IP address whitelist for the Internet and cloud service interconnection network, access from the Internet and cloud service interconnection network is restricted by the configuration, and all access from VPCs is prohibited.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>10.88.111.3</p>
         */
        @NameInMap("ipList")
        public String ipList;

        /**
         * <p>The IP address whitelist for VPCs.</p>
         * <blockquote>
         * <p>If you configure only the IP address whitelist for VPCs, access from VPCs is restricted by the configuration, and all access from the Internet and cloud service interconnection network is prohibited.</p>
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
         * <p>The data encryption algorithm. The encryption algorithms supported by the key include AES256, AESCTR, and RC4.</p>
         * 
         * <strong>example:</strong>
         * <p>AES256</p>
         */
        @NameInMap("algorithm")
        public String algorithm;

        /**
         * <p>Specifies whether to enable data encryption for the project. For more information about data encryption, see 
         * &lt;props=&quot;china&quot;&gt;<a href="https://www.alibabacloud.com/help/zh/maxcompute/security-and-compliance/storage-encryption">Storage encryption</a>
         * &lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/help/en/maxcompute/security-and-compliance/storage-encryption">Storage encryption</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("enable")
        public Boolean enable;

        /**
         * <p>The type of the key used for data encryption. Valid values include the default key (MaxCompute Default Key) and Bring Your Own Key (BYOK). The default key is a default key created internally by MaxCompute.</p>
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
         * <p>Specifies whether the project is an external project of &lt;props=&quot;china&quot;&gt;<a href="https://www.alibabacloud.com/help/zh/maxcompute/user-guide/lake-warehouse-integrated-2-0-use-guide">Data Lakehouse Solution 2.0</a>
         * &lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/help/en/maxcompute/user-guide/lake-warehouse-integrated-2-0-use-guide">Data Lakehouse Solution 2.0</a>.</p>
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
         * <li><strong>mandatory</strong>: The LIFECYCLE clause is required. You must specify a lifecycle for the table.</li>
         * <li><strong>optional</strong>: The LIFECYCLE clause is optional when you create a table. If you do not specify a lifecycle for the table, the table never expires.</li>
         * <li><strong>inherit</strong>: If you do not specify a lifecycle for a table when you create the table, the lifecycle of the table is the value of the odps.table.lifecycle.value parameter.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>optional</p>
         */
        @NameInMap("type")
        public String type;

        /**
         * <p>The lifecycle of the table. Unit: days. Valid values: 1 to 37231. Default value: 37231.</p>
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
         * <p>Specifies whether to allow full table scans in the project. Full table scans consume a large amount of resources. To improve processing efficiency, this feature is disabled by default.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("allowFullScan")
        public Boolean allowFullScan;

        /**
         * <p>Specifies whether to enable the DECIMAL data type of MaxCompute V2.0 for the project.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("enableDecimal2")
        public Boolean enableDecimal2;

        /**
         * <p>Specifies whether to enable EPS resource group routing for the data transfer service.</p>
         * <ul>
         * <li>true: Data transfer tasks submitted by default in the project use the bound EPS resource group for the data transfer service.</li>
         * <li>false: Data transfer tasks submitted by default in the project use the shared EPS resource group for the data transfer service.</li>
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
         * <p>The retention period of backup data in days. During this period, you can restore the current version to any backed-up data version. Valid values: 0 to 30. Default value: 1. A value of 0 indicates that the backup feature is disabled.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("retentionDays")
        public Long retentionDays;

        /**
         * <p>The maximum threshold for the consumption of a single SQL statement. Unit: scanned data volume (GB) × complexity.</p>
         * 
         * <strong>example:</strong>
         * <p>1500</p>
         */
        @NameInMap("sqlMeteringMax")
        public String sqlMeteringMax;

        /**
         * <p>The lifecycle properties of tables.</p>
         */
        @NameInMap("tableLifecycle")
        public ListProjectsResponseBodyDataProjectsPropertiesTableLifecycle tableLifecycle;

        /**
         * <p>The time zone of the project, which is the odps.sql.timezone property.</p>
         * 
         * <strong>example:</strong>
         * <p>Asia/Shanghai</p>
         */
        @NameInMap("timezone")
        public String timezone;

        /**
         * <p>The EPS resource group of the &lt;props=&quot;china&quot;&gt;<a href="https://www.alibabacloud.com/help/zh/maxcompute/user-guide/overview-of-dts">data transfer service</a>
         * &lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/help/en/maxcompute/user-guide/overview-of-dts">data transfer service</a> bound to the project.</p>
         * <ul>
         * <li><p>Default (shared EPS resource group for the data transfer service): The project is not allowed to use the subscription EPS resource group for the data transfer service. Regardless of the default EPS resource group setting, data transfer tasks submitted by default in this project automatically use the Default EPS resource group.</p>
         * </li>
         * <li><p>Subscription EPS resource group for the data transfer service: The project is allowed to use the subscription EPS resource group for the data transfer service.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Default</p>
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
         * <p>For more information about the differences among the three data type editions, see &lt;props=&quot;china&quot;&gt;<a href="https://www.alibabacloud.com/help/zh/maxcompute/user-guide/data-type-editions">Data type editions</a>
         * &lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/help/en/maxcompute/user-guide/data-type-editions">Data type editions</a>.</p>
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
         * <p>If you enable data protection for the project, you can configure exceptions or trusted projects to allow specified users to transfer data of specified objects to specified projects. All scenarios described in the exception policy can bypass the data protection mechanism.</p>
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
         * <p>Specifies whether to enable the &lt;props=&quot;china&quot;&gt;<a href="https://www.alibabacloud.com/help/zh/maxcompute/security-and-compliance/project-data-protection">data protection mechanism</a>
         * &lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/help/en/maxcompute/security-and-compliance/project-data-protection">data protection mechanism</a> for the project to prohibit or allow data stream out of the project. The default enabling status is disabled.</p>
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
         * <p>Specifies whether to use the &lt;props=&quot;china&quot;&gt;<a href="https://www.alibabacloud.com/help/zh/maxcompute/user-guide/download-control">download control</a>
         * &lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/help/en/maxcompute/user-guide/label-based-access-control">download control</a> feature. By default, this feature is disabled.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("enableDownloadPrivilege")
        public Boolean enableDownloadPrivilege;

        /**
         * <p>Specifies whether to use the &lt;props=&quot;china&quot;&gt;<a href="https://www.alibabacloud.com/help/zh/maxcompute/user-guide/label-based-access-control">label-based access control</a>
         * &lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/help/en/maxcompute/user-guide/label-based-access-control">label-based access control</a> feature. By default, this feature is disabled.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("labelSecurity")
        public Boolean labelSecurity;

        /**
         * <p>Specifies whether to allow object creators to have access permissions on the objects. By default, this is allowed.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("objectCreatorHasAccessPermission")
        public Boolean objectCreatorHasAccessPermission;

        /**
         * <p>Specifies whether to allow object creators to have authorization permissions on the objects. By default, this is allowed.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("objectCreatorHasGrantPermission")
        public Boolean objectCreatorHasGrantPermission;

        /**
         * <p>The &lt;props=&quot;china&quot;&gt;<a href="https://www.alibabacloud.com/help/zh/maxcompute/security-and-compliance/project-data-protection">data protection mechanism</a>
         * &lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/help/en/maxcompute/security-and-compliance/project-data-protection">data protection mechanism</a> properties.</p>
         */
        @NameInMap("projectProtection")
        public ListProjectsResponseBodyDataProjectsSecurityPropertiesProjectProtection projectProtection;

        /**
         * <p>Specifies whether to use the &lt;props=&quot;china&quot;&gt;<a href="https://www.alibabacloud.com/help/zh/maxcompute/user-guide/acl-based-access-control">ACL-based access control</a>
         * &lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/help/en/maxcompute/user-guide/acl-based-access-control">ACL-based access control</a> feature. By default, this feature is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("usingAcl")
        public Boolean usingAcl;

        /**
         * <p>Specifies whether to use the &lt;props=&quot;china&quot;&gt;<a href="https://www.alibabacloud.com/help/zh/maxcompute/user-guide/policy-based-access-control-1">policy-based access control</a>
         * &lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/help/en/maxcompute/user-guide/policy-based-access-control-1">policy-based access control</a> feature. By default, this feature is enabled.</p>
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
         * <p>BI_Analysis</p>
         */
        @NameInMap("comment")
        public String comment;

        /**
         * <p>The total storage size. This value indicates the current storage size of the project and is consistent with the billing metric. It represents the logical storage size after data compression at the project level.</p>
         * 
         * <strong>example:</strong>
         * <p>16489027</p>
         */
        @NameInMap("costStorage")
        public String costStorage;

        /**
         * <p>The creation time. The time is a UNIX timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1704380838000</p>
         */
        @NameInMap("createdTime")
        public Long createdTime;

        /**
         * <p>The default compute quota.
         * This is used to allocate compute resources. If no compute quota is specified, jobs initiated in the project consume resources from the default quota. For more information about how to use compute resources, see &lt;props=&quot;china&quot;&gt;<a href="https://www.alibabacloud.com/help/zh/maxcompute/user-guide/use-of-computing-resources">Use of computing resources</a>
         * &lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/help/en/maxcompute/user-guide/use-of-computing-resources">Use of computing resources</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>os_PayAsYouGoQuota</p>
         */
        @NameInMap("defaultQuota")
        public String defaultQuota;

        /**
         * <p>The IP address whitelist.</p>
         */
        @NameInMap("ipWhiteList")
        public ListProjectsResponseBodyDataProjectsIpWhiteList ipWhiteList;

        /**
         * <p>The project names.</p>
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
         * <p>The security properties.</p>
         */
        @NameInMap("securityProperties")
        public ListProjectsResponseBodyDataProjectsSecurityProperties securityProperties;

        /**
         * <p>The project status. Valid values:</p>
         * <ul>
         * <li><strong>AVAILABLE</strong>: normal</li>
         * <li><strong>READONLY</strong>: read-only</li>
         * <li><strong>FROZEN</strong>: frozen</li>
         * <li><strong>DELETING</strong>: deleting</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>AVAILABLE</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>Specifies whether to support schema-based storage.
         * MaxCompute supports schemas, which are located under projects and used to classify objects such as tables, resources, and UDFs. A project can contain multiple schemas. For more information, see &lt;props=&quot;china&quot;&gt;<a href="https://www.alibabacloud.com/help/zh/maxcompute/user-guide/schema-related-operations">Schema-related operations</a>
         * &lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/help/en/maxcompute/user-guide/schema-related-operations">Schema-related operations</a>.</p>
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
         * <p>The pagination token. The current operation only supports sequential pagination. A non-empty nextToken value indicates that more data is available. You can use the nextToken value as a parameter to query the next page.</p>
         * 
         * <strong>example:</strong>
         * <p>AAAAAV3MpHK1AP0pfERHZN5pu6kvikyUl3ChyRxN+qLPvtOb</p>
         */
        @NameInMap("NextToken")
        public String nextToken;

        /**
         * <p>The marker used to specify the starting point of the returned results. The results are sorted in alphabetical order and returned starting from the first item after the marker.</p>
         * 
         * <strong>example:</strong>
         * <p>cHlvZHBzX3VkZl8xMDExNV8xNDU3NDI4NDkzKg==</p>
         */
        @NameInMap("marker")
        public String marker;

        /**
         * <p>The maximum number of results to return per page.</p>
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
