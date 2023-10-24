// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class GetProjectResponseBody extends TeaModel {
    /**
     * <p>The returned data.</p>
     */
    @NameInMap("data")
    public GetProjectResponseBodyData data;

    /**
     * <p>Indicates whether the request was successful. If this parameter was not empty and the value of this parameter was not 200, the request failed.</p>
     */
    @NameInMap("httpCode")
    public Integer httpCode;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static GetProjectResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetProjectResponseBody self = new GetProjectResponseBody();
        return TeaModel.build(map, self);
    }

    public GetProjectResponseBody setData(GetProjectResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetProjectResponseBodyData getData() {
        return this.data;
    }

    public GetProjectResponseBody setHttpCode(Integer httpCode) {
        this.httpCode = httpCode;
        return this;
    }
    public Integer getHttpCode() {
        return this.httpCode;
    }

    public GetProjectResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetProjectResponseBodyDataIpWhiteList extends TeaModel {
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

        public static GetProjectResponseBodyDataIpWhiteList build(java.util.Map<String, ?> map) throws Exception {
            GetProjectResponseBodyDataIpWhiteList self = new GetProjectResponseBodyDataIpWhiteList();
            return TeaModel.build(map, self);
        }

        public GetProjectResponseBodyDataIpWhiteList setIpList(String ipList) {
            this.ipList = ipList;
            return this;
        }
        public String getIpList() {
            return this.ipList;
        }

        public GetProjectResponseBodyDataIpWhiteList setVpcIpList(String vpcIpList) {
            this.vpcIpList = vpcIpList;
            return this;
        }
        public String getVpcIpList() {
            return this.vpcIpList;
        }

    }

    public static class GetProjectResponseBodyDataPropertiesEncryption extends TeaModel {
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

        public static GetProjectResponseBodyDataPropertiesEncryption build(java.util.Map<String, ?> map) throws Exception {
            GetProjectResponseBodyDataPropertiesEncryption self = new GetProjectResponseBodyDataPropertiesEncryption();
            return TeaModel.build(map, self);
        }

        public GetProjectResponseBodyDataPropertiesEncryption setAlgorithm(String algorithm) {
            this.algorithm = algorithm;
            return this;
        }
        public String getAlgorithm() {
            return this.algorithm;
        }

        public GetProjectResponseBodyDataPropertiesEncryption setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public GetProjectResponseBodyDataPropertiesEncryption setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

    }

    public static class GetProjectResponseBodyDataPropertiesStorageTierInfoStorageTierSize extends TeaModel {
        /**
         * <p>The long-term storage.</p>
         */
        @NameInMap("longTermSize")
        public Long longTermSize;

        /**
         * <p>The IA storage.</p>
         */
        @NameInMap("lowFrequencySize")
        public Long lowFrequencySize;

        /**
         * <p>The standard storage.</p>
         */
        @NameInMap("standardSize")
        public Long standardSize;

        public static GetProjectResponseBodyDataPropertiesStorageTierInfoStorageTierSize build(java.util.Map<String, ?> map) throws Exception {
            GetProjectResponseBodyDataPropertiesStorageTierInfoStorageTierSize self = new GetProjectResponseBodyDataPropertiesStorageTierInfoStorageTierSize();
            return TeaModel.build(map, self);
        }

        public GetProjectResponseBodyDataPropertiesStorageTierInfoStorageTierSize setLongTermSize(Long longTermSize) {
            this.longTermSize = longTermSize;
            return this;
        }
        public Long getLongTermSize() {
            return this.longTermSize;
        }

        public GetProjectResponseBodyDataPropertiesStorageTierInfoStorageTierSize setLowFrequencySize(Long lowFrequencySize) {
            this.lowFrequencySize = lowFrequencySize;
            return this;
        }
        public Long getLowFrequencySize() {
            return this.lowFrequencySize;
        }

        public GetProjectResponseBodyDataPropertiesStorageTierInfoStorageTierSize setStandardSize(Long standardSize) {
            this.standardSize = standardSize;
            return this;
        }
        public Long getStandardSize() {
            return this.standardSize;
        }

    }

    public static class GetProjectResponseBodyDataPropertiesStorageTierInfo extends TeaModel {
        /**
         * <p>The backup storage.</p>
         */
        @NameInMap("projectBackupSize")
        public Long projectBackupSize;

        /**
         * <p>The tiered storage.</p>
         */
        @NameInMap("storageTierSize")
        public GetProjectResponseBodyDataPropertiesStorageTierInfoStorageTierSize storageTierSize;

        public static GetProjectResponseBodyDataPropertiesStorageTierInfo build(java.util.Map<String, ?> map) throws Exception {
            GetProjectResponseBodyDataPropertiesStorageTierInfo self = new GetProjectResponseBodyDataPropertiesStorageTierInfo();
            return TeaModel.build(map, self);
        }

        public GetProjectResponseBodyDataPropertiesStorageTierInfo setProjectBackupSize(Long projectBackupSize) {
            this.projectBackupSize = projectBackupSize;
            return this;
        }
        public Long getProjectBackupSize() {
            return this.projectBackupSize;
        }

        public GetProjectResponseBodyDataPropertiesStorageTierInfo setStorageTierSize(GetProjectResponseBodyDataPropertiesStorageTierInfoStorageTierSize storageTierSize) {
            this.storageTierSize = storageTierSize;
            return this;
        }
        public GetProjectResponseBodyDataPropertiesStorageTierInfoStorageTierSize getStorageTierSize() {
            return this.storageTierSize;
        }

    }

    public static class GetProjectResponseBodyDataPropertiesTableLifecycle extends TeaModel {
        /**
         * <p>The type of the lifecycle. Valid values: -**mandatory**: The lifecycle clause is required. You must configure a lifecycle for a table. -**optional**: The lifecycle clause is optional in a table creation statement. If you do not configure a lifecycle for a table, the table does not expire. -**inherit**: If you do not configure a lifecycle for a table when you create the table, the value of the odps.table.lifecycle.value parameter is used by default.</p>
         */
        @NameInMap("type")
        public String type;

        /**
         * <p>The retention period of a table. Unit: days.</p>
         */
        @NameInMap("value")
        public String value;

        public static GetProjectResponseBodyDataPropertiesTableLifecycle build(java.util.Map<String, ?> map) throws Exception {
            GetProjectResponseBodyDataPropertiesTableLifecycle self = new GetProjectResponseBodyDataPropertiesTableLifecycle();
            return TeaModel.build(map, self);
        }

        public GetProjectResponseBodyDataPropertiesTableLifecycle setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetProjectResponseBodyDataPropertiesTableLifecycle setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetProjectResponseBodyDataProperties extends TeaModel {
        /**
         * <p>Indicates whether a full table scan on the project is enabled.</p>
         */
        @NameInMap("allowFullScan")
        public Boolean allowFullScan;

        /**
         * <p>Indicates whether the DECIMAL data type in MaxCompute V2.0 is enabled.</p>
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
        public GetProjectResponseBodyDataPropertiesEncryption encryption;

        /**
         * <p>The number of days for which backup data can be retained.</p>
         */
        @NameInMap("retentionDays")
        public Long retentionDays;

        /**
         * <p>The upper limit for the resources that are consumed by an SQL statement.</p>
         */
        @NameInMap("sqlMeteringMax")
        public String sqlMeteringMax;

        /**
         * <p>The information about the tiered storage.</p>
         */
        @NameInMap("storageTierInfo")
        public GetProjectResponseBodyDataPropertiesStorageTierInfo storageTierInfo;

        /**
         * <p>The lifecycle of the table in the project.</p>
         */
        @NameInMap("tableLifecycle")
        public GetProjectResponseBodyDataPropertiesTableLifecycle tableLifecycle;

        /**
         * <p>The time zone of the project.</p>
         */
        @NameInMap("timezone")
        public String timezone;

        /**
         * <p>The name of the tunnel quota.</p>
         */
        @NameInMap("tunnelQuota")
        public String tunnelQuota;

        /**
         * <p>The data type edition. Valid values: -**1**: MaxCompute V1.0 data type edition. -**2**: MaxCompute V2.0 data type edition. -**hive**: Hive-compatible data type edition.</p>
         */
        @NameInMap("typeSystem")
        public String typeSystem;

        public static GetProjectResponseBodyDataProperties build(java.util.Map<String, ?> map) throws Exception {
            GetProjectResponseBodyDataProperties self = new GetProjectResponseBodyDataProperties();
            return TeaModel.build(map, self);
        }

        public GetProjectResponseBodyDataProperties setAllowFullScan(Boolean allowFullScan) {
            this.allowFullScan = allowFullScan;
            return this;
        }
        public Boolean getAllowFullScan() {
            return this.allowFullScan;
        }

        public GetProjectResponseBodyDataProperties setEnableDecimal2(Boolean enableDecimal2) {
            this.enableDecimal2 = enableDecimal2;
            return this;
        }
        public Boolean getEnableDecimal2() {
            return this.enableDecimal2;
        }

        public GetProjectResponseBodyDataProperties setEnableTunnelQuotaRoute(Boolean enableTunnelQuotaRoute) {
            this.enableTunnelQuotaRoute = enableTunnelQuotaRoute;
            return this;
        }
        public Boolean getEnableTunnelQuotaRoute() {
            return this.enableTunnelQuotaRoute;
        }

        public GetProjectResponseBodyDataProperties setEncryption(GetProjectResponseBodyDataPropertiesEncryption encryption) {
            this.encryption = encryption;
            return this;
        }
        public GetProjectResponseBodyDataPropertiesEncryption getEncryption() {
            return this.encryption;
        }

        public GetProjectResponseBodyDataProperties setRetentionDays(Long retentionDays) {
            this.retentionDays = retentionDays;
            return this;
        }
        public Long getRetentionDays() {
            return this.retentionDays;
        }

        public GetProjectResponseBodyDataProperties setSqlMeteringMax(String sqlMeteringMax) {
            this.sqlMeteringMax = sqlMeteringMax;
            return this;
        }
        public String getSqlMeteringMax() {
            return this.sqlMeteringMax;
        }

        public GetProjectResponseBodyDataProperties setStorageTierInfo(GetProjectResponseBodyDataPropertiesStorageTierInfo storageTierInfo) {
            this.storageTierInfo = storageTierInfo;
            return this;
        }
        public GetProjectResponseBodyDataPropertiesStorageTierInfo getStorageTierInfo() {
            return this.storageTierInfo;
        }

        public GetProjectResponseBodyDataProperties setTableLifecycle(GetProjectResponseBodyDataPropertiesTableLifecycle tableLifecycle) {
            this.tableLifecycle = tableLifecycle;
            return this;
        }
        public GetProjectResponseBodyDataPropertiesTableLifecycle getTableLifecycle() {
            return this.tableLifecycle;
        }

        public GetProjectResponseBodyDataProperties setTimezone(String timezone) {
            this.timezone = timezone;
            return this;
        }
        public String getTimezone() {
            return this.timezone;
        }

        public GetProjectResponseBodyDataProperties setTunnelQuota(String tunnelQuota) {
            this.tunnelQuota = tunnelQuota;
            return this;
        }
        public String getTunnelQuota() {
            return this.tunnelQuota;
        }

        public GetProjectResponseBodyDataProperties setTypeSystem(String typeSystem) {
            this.typeSystem = typeSystem;
            return this;
        }
        public String getTypeSystem() {
            return this.typeSystem;
        }

    }

    public static class GetProjectResponseBodyDataSaleTag extends TeaModel {
        /**
         * <p>The ID of the resource.</p>
         */
        @NameInMap("resourceId")
        public String resourceId;

        /**
         * <p>The type of the resource.</p>
         */
        @NameInMap("resourceType")
        public String resourceType;

        public static GetProjectResponseBodyDataSaleTag build(java.util.Map<String, ?> map) throws Exception {
            GetProjectResponseBodyDataSaleTag self = new GetProjectResponseBodyDataSaleTag();
            return TeaModel.build(map, self);
        }

        public GetProjectResponseBodyDataSaleTag setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public GetProjectResponseBodyDataSaleTag setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

    }

    public static class GetProjectResponseBodyDataSecurityPropertiesProjectProtection extends TeaModel {
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

        public static GetProjectResponseBodyDataSecurityPropertiesProjectProtection build(java.util.Map<String, ?> map) throws Exception {
            GetProjectResponseBodyDataSecurityPropertiesProjectProtection self = new GetProjectResponseBodyDataSecurityPropertiesProjectProtection();
            return TeaModel.build(map, self);
        }

        public GetProjectResponseBodyDataSecurityPropertiesProjectProtection setExceptionPolicy(String exceptionPolicy) {
            this.exceptionPolicy = exceptionPolicy;
            return this;
        }
        public String getExceptionPolicy() {
            return this.exceptionPolicy;
        }

        public GetProjectResponseBodyDataSecurityPropertiesProjectProtection set_protected(Boolean _protected) {
            this._protected = _protected;
            return this;
        }
        public Boolean get_protected() {
            return this._protected;
        }

    }

    public static class GetProjectResponseBodyDataSecurityProperties extends TeaModel {
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
        public GetProjectResponseBodyDataSecurityPropertiesProjectProtection projectProtection;

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

        public static GetProjectResponseBodyDataSecurityProperties build(java.util.Map<String, ?> map) throws Exception {
            GetProjectResponseBodyDataSecurityProperties self = new GetProjectResponseBodyDataSecurityProperties();
            return TeaModel.build(map, self);
        }

        public GetProjectResponseBodyDataSecurityProperties setEnableDownloadPrivilege(Boolean enableDownloadPrivilege) {
            this.enableDownloadPrivilege = enableDownloadPrivilege;
            return this;
        }
        public Boolean getEnableDownloadPrivilege() {
            return this.enableDownloadPrivilege;
        }

        public GetProjectResponseBodyDataSecurityProperties setLabelSecurity(Boolean labelSecurity) {
            this.labelSecurity = labelSecurity;
            return this;
        }
        public Boolean getLabelSecurity() {
            return this.labelSecurity;
        }

        public GetProjectResponseBodyDataSecurityProperties setObjectCreatorHasAccessPermission(Boolean objectCreatorHasAccessPermission) {
            this.objectCreatorHasAccessPermission = objectCreatorHasAccessPermission;
            return this;
        }
        public Boolean getObjectCreatorHasAccessPermission() {
            return this.objectCreatorHasAccessPermission;
        }

        public GetProjectResponseBodyDataSecurityProperties setObjectCreatorHasGrantPermission(Boolean objectCreatorHasGrantPermission) {
            this.objectCreatorHasGrantPermission = objectCreatorHasGrantPermission;
            return this;
        }
        public Boolean getObjectCreatorHasGrantPermission() {
            return this.objectCreatorHasGrantPermission;
        }

        public GetProjectResponseBodyDataSecurityProperties setProjectProtection(GetProjectResponseBodyDataSecurityPropertiesProjectProtection projectProtection) {
            this.projectProtection = projectProtection;
            return this;
        }
        public GetProjectResponseBodyDataSecurityPropertiesProjectProtection getProjectProtection() {
            return this.projectProtection;
        }

        public GetProjectResponseBodyDataSecurityProperties setUsingAcl(Boolean usingAcl) {
            this.usingAcl = usingAcl;
            return this;
        }
        public Boolean getUsingAcl() {
            return this.usingAcl;
        }

        public GetProjectResponseBodyDataSecurityProperties setUsingPolicy(Boolean usingPolicy) {
            this.usingPolicy = usingPolicy;
            return this;
        }
        public Boolean getUsingPolicy() {
            return this.usingPolicy;
        }

    }

    public static class GetProjectResponseBodyData extends TeaModel {
        /**
         * <p>The comment of the project.</p>
         */
        @NameInMap("comment")
        public String comment;

        /**
         * <p>The storage usage.</p>
         */
        @NameInMap("costStorage")
        public String costStorage;

        /**
         * <p>The default computing quota.</p>
         */
        @NameInMap("defaultQuota")
        public String defaultQuota;

        /**
         * <p>The IP address whitelist.</p>
         */
        @NameInMap("ipWhiteList")
        public GetProjectResponseBodyDataIpWhiteList ipWhiteList;

        /**
         * <p>The name of the MaxCompute project.</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The owner of the project.</p>
         */
        @NameInMap("owner")
        public String owner;

        /**
         * <p>The billing method of the project.</p>
         */
        @NameInMap("productType")
        public String productType;

        /**
         * <p>The properties of the project.</p>
         */
        @NameInMap("properties")
        public GetProjectResponseBodyDataProperties properties;

        /**
         * <p>The tag.</p>
         */
        @NameInMap("saleTag")
        public GetProjectResponseBodyDataSaleTag saleTag;

        /**
         * <p>The permission properties.</p>
         */
        @NameInMap("securityProperties")
        public GetProjectResponseBodyDataSecurityProperties securityProperties;

        /**
         * <p>The status of the project. Valid values: -**AVAILABLE**: The project was available. -**READONLY**: The project was read only. -**FROZEN**: The project was frozen. -**DELETING**: The project was being deleted.</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>The type of the project. Valid values: -**managed**: The project is an internal project. -**external**: The project is an external project.</p>
         */
        @NameInMap("type")
        public String type;

        public static GetProjectResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetProjectResponseBodyData self = new GetProjectResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetProjectResponseBodyData setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public GetProjectResponseBodyData setCostStorage(String costStorage) {
            this.costStorage = costStorage;
            return this;
        }
        public String getCostStorage() {
            return this.costStorage;
        }

        public GetProjectResponseBodyData setDefaultQuota(String defaultQuota) {
            this.defaultQuota = defaultQuota;
            return this;
        }
        public String getDefaultQuota() {
            return this.defaultQuota;
        }

        public GetProjectResponseBodyData setIpWhiteList(GetProjectResponseBodyDataIpWhiteList ipWhiteList) {
            this.ipWhiteList = ipWhiteList;
            return this;
        }
        public GetProjectResponseBodyDataIpWhiteList getIpWhiteList() {
            return this.ipWhiteList;
        }

        public GetProjectResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetProjectResponseBodyData setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public GetProjectResponseBodyData setProductType(String productType) {
            this.productType = productType;
            return this;
        }
        public String getProductType() {
            return this.productType;
        }

        public GetProjectResponseBodyData setProperties(GetProjectResponseBodyDataProperties properties) {
            this.properties = properties;
            return this;
        }
        public GetProjectResponseBodyDataProperties getProperties() {
            return this.properties;
        }

        public GetProjectResponseBodyData setSaleTag(GetProjectResponseBodyDataSaleTag saleTag) {
            this.saleTag = saleTag;
            return this;
        }
        public GetProjectResponseBodyDataSaleTag getSaleTag() {
            return this.saleTag;
        }

        public GetProjectResponseBodyData setSecurityProperties(GetProjectResponseBodyDataSecurityProperties securityProperties) {
            this.securityProperties = securityProperties;
            return this;
        }
        public GetProjectResponseBodyDataSecurityProperties getSecurityProperties() {
            return this.securityProperties;
        }

        public GetProjectResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetProjectResponseBodyData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
