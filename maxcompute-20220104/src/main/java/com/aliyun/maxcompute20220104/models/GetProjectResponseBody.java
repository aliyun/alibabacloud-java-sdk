// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class GetProjectResponseBody extends TeaModel {
    @NameInMap("data")
    public GetProjectResponseBodyData data;

    @NameInMap("httpCode")
    public Integer httpCode;

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
        @NameInMap("ipList")
        public String ipList;

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
        @NameInMap("algorithm")
        public String algorithm;

        @NameInMap("enable")
        public Boolean enable;

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

    public static class GetProjectResponseBodyDataPropertiesTableLifecycle extends TeaModel {
        @NameInMap("type")
        public String type;

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
        @NameInMap("allowFullScan")
        public Boolean allowFullScan;

        @NameInMap("elderTunnelQuota")
        public String elderTunnelQuota;

        @NameInMap("enableDecimal2")
        public Boolean enableDecimal2;

        @NameInMap("enableTunnelQuotaRoute")
        public Boolean enableTunnelQuotaRoute;

        @NameInMap("encryption")
        public GetProjectResponseBodyDataPropertiesEncryption encryption;

        @NameInMap("retentionDays")
        public Long retentionDays;

        @NameInMap("sqlMeteringMax")
        public String sqlMeteringMax;

        @NameInMap("tableLifecycle")
        public GetProjectResponseBodyDataPropertiesTableLifecycle tableLifecycle;

        @NameInMap("timezone")
        public String timezone;

        @NameInMap("tunnelQuota")
        public String tunnelQuota;

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

        public GetProjectResponseBodyDataProperties setElderTunnelQuota(String elderTunnelQuota) {
            this.elderTunnelQuota = elderTunnelQuota;
            return this;
        }
        public String getElderTunnelQuota() {
            return this.elderTunnelQuota;
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
        @NameInMap("resourceId")
        public String resourceId;

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
        @NameInMap("exceptionPolicy")
        public String exceptionPolicy;

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
        @NameInMap("enableDownloadPrivilege")
        public Boolean enableDownloadPrivilege;

        @NameInMap("labelSecurity")
        public Boolean labelSecurity;

        @NameInMap("objectCreatorHasAccessPermission")
        public Boolean objectCreatorHasAccessPermission;

        @NameInMap("objectCreatorHasGrantPermission")
        public Boolean objectCreatorHasGrantPermission;

        @NameInMap("projectProtection")
        public GetProjectResponseBodyDataSecurityPropertiesProjectProtection projectProtection;

        @NameInMap("usingAcl")
        public Boolean usingAcl;

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
        @NameInMap("comment")
        public String comment;

        @NameInMap("costStorage")
        public String costStorage;

        @NameInMap("defaultQuota")
        public String defaultQuota;

        @NameInMap("ipWhiteList")
        public GetProjectResponseBodyDataIpWhiteList ipWhiteList;

        @NameInMap("name")
        public String name;

        @NameInMap("owner")
        public String owner;

        @NameInMap("productType")
        public String productType;

        @NameInMap("properties")
        public GetProjectResponseBodyDataProperties properties;

        @NameInMap("saleTag")
        public GetProjectResponseBodyDataSaleTag saleTag;

        @NameInMap("securityProperties")
        public GetProjectResponseBodyDataSecurityProperties securityProperties;

        @NameInMap("status")
        public String status;

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
