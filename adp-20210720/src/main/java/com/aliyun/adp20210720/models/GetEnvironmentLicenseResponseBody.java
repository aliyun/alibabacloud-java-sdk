// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720.models;

import com.aliyun.tea.*;

public class GetEnvironmentLicenseResponseBody extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public GetEnvironmentLicenseResponseBodyData data;

    @NameInMap("msg")
    public String msg;

    public static GetEnvironmentLicenseResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetEnvironmentLicenseResponseBody self = new GetEnvironmentLicenseResponseBody();
        return TeaModel.build(map, self);
    }

    public GetEnvironmentLicenseResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetEnvironmentLicenseResponseBody setData(GetEnvironmentLicenseResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetEnvironmentLicenseResponseBodyData getData() {
        return this.data;
    }

    public GetEnvironmentLicenseResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public static class GetEnvironmentLicenseResponseBodyDataLicenseQuotaClusterQuota extends TeaModel {
        @NameInMap("cpuCoreLimit")
        public Long cpuCoreLimit;

        public static GetEnvironmentLicenseResponseBodyDataLicenseQuotaClusterQuota build(java.util.Map<String, ?> map) throws Exception {
            GetEnvironmentLicenseResponseBodyDataLicenseQuotaClusterQuota self = new GetEnvironmentLicenseResponseBodyDataLicenseQuotaClusterQuota();
            return TeaModel.build(map, self);
        }

        public GetEnvironmentLicenseResponseBodyDataLicenseQuotaClusterQuota setCpuCoreLimit(Long cpuCoreLimit) {
            this.cpuCoreLimit = cpuCoreLimit;
            return this;
        }
        public Long getCpuCoreLimit() {
            return this.cpuCoreLimit;
        }

    }

    public static class GetEnvironmentLicenseResponseBodyDataLicenseQuotaComponentQuotas extends TeaModel {
        @NameInMap("componentName")
        public String componentName;

        @NameInMap("componentSource")
        public String componentSource;

        @NameInMap("instanceLimit")
        public Long instanceLimit;

        public static GetEnvironmentLicenseResponseBodyDataLicenseQuotaComponentQuotas build(java.util.Map<String, ?> map) throws Exception {
            GetEnvironmentLicenseResponseBodyDataLicenseQuotaComponentQuotas self = new GetEnvironmentLicenseResponseBodyDataLicenseQuotaComponentQuotas();
            return TeaModel.build(map, self);
        }

        public GetEnvironmentLicenseResponseBodyDataLicenseQuotaComponentQuotas setComponentName(String componentName) {
            this.componentName = componentName;
            return this;
        }
        public String getComponentName() {
            return this.componentName;
        }

        public GetEnvironmentLicenseResponseBodyDataLicenseQuotaComponentQuotas setComponentSource(String componentSource) {
            this.componentSource = componentSource;
            return this;
        }
        public String getComponentSource() {
            return this.componentSource;
        }

        public GetEnvironmentLicenseResponseBodyDataLicenseQuotaComponentQuotas setInstanceLimit(Long instanceLimit) {
            this.instanceLimit = instanceLimit;
            return this;
        }
        public Long getInstanceLimit() {
            return this.instanceLimit;
        }

    }

    public static class GetEnvironmentLicenseResponseBodyDataLicenseQuotaCustomQuotas extends TeaModel {
        @NameInMap("description")
        public String description;

        @NameInMap("key")
        public String key;

        @NameInMap("value")
        public String value;

        public static GetEnvironmentLicenseResponseBodyDataLicenseQuotaCustomQuotas build(java.util.Map<String, ?> map) throws Exception {
            GetEnvironmentLicenseResponseBodyDataLicenseQuotaCustomQuotas self = new GetEnvironmentLicenseResponseBodyDataLicenseQuotaCustomQuotas();
            return TeaModel.build(map, self);
        }

        public GetEnvironmentLicenseResponseBodyDataLicenseQuotaCustomQuotas setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetEnvironmentLicenseResponseBodyDataLicenseQuotaCustomQuotas setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetEnvironmentLicenseResponseBodyDataLicenseQuotaCustomQuotas setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetEnvironmentLicenseResponseBodyDataLicenseQuota extends TeaModel {
        @NameInMap("clusterQuota")
        public GetEnvironmentLicenseResponseBodyDataLicenseQuotaClusterQuota clusterQuota;

        @NameInMap("componentQuotas")
        public java.util.List<GetEnvironmentLicenseResponseBodyDataLicenseQuotaComponentQuotas> componentQuotas;

        @NameInMap("customQuotas")
        public java.util.List<GetEnvironmentLicenseResponseBodyDataLicenseQuotaCustomQuotas> customQuotas;

        public static GetEnvironmentLicenseResponseBodyDataLicenseQuota build(java.util.Map<String, ?> map) throws Exception {
            GetEnvironmentLicenseResponseBodyDataLicenseQuota self = new GetEnvironmentLicenseResponseBodyDataLicenseQuota();
            return TeaModel.build(map, self);
        }

        public GetEnvironmentLicenseResponseBodyDataLicenseQuota setClusterQuota(GetEnvironmentLicenseResponseBodyDataLicenseQuotaClusterQuota clusterQuota) {
            this.clusterQuota = clusterQuota;
            return this;
        }
        public GetEnvironmentLicenseResponseBodyDataLicenseQuotaClusterQuota getClusterQuota() {
            return this.clusterQuota;
        }

        public GetEnvironmentLicenseResponseBodyDataLicenseQuota setComponentQuotas(java.util.List<GetEnvironmentLicenseResponseBodyDataLicenseQuotaComponentQuotas> componentQuotas) {
            this.componentQuotas = componentQuotas;
            return this;
        }
        public java.util.List<GetEnvironmentLicenseResponseBodyDataLicenseQuotaComponentQuotas> getComponentQuotas() {
            return this.componentQuotas;
        }

        public GetEnvironmentLicenseResponseBodyDataLicenseQuota setCustomQuotas(java.util.List<GetEnvironmentLicenseResponseBodyDataLicenseQuotaCustomQuotas> customQuotas) {
            this.customQuotas = customQuotas;
            return this;
        }
        public java.util.List<GetEnvironmentLicenseResponseBodyDataLicenseQuotaCustomQuotas> getCustomQuotas() {
            return this.customQuotas;
        }

    }

    public static class GetEnvironmentLicenseResponseBodyData extends TeaModel {
        @NameInMap("expireTime")
        public String expireTime;

        @NameInMap("licenseKey")
        public String licenseKey;

        @NameInMap("licenseQuota")
        public GetEnvironmentLicenseResponseBodyDataLicenseQuota licenseQuota;

        @NameInMap("productVersionUID")
        public String productVersionUID;

        @NameInMap("rejectReason")
        public String rejectReason;

        @NameInMap("scope")
        public String scope;

        /**
         * <p>kubernetes secret yaml。</p>
         */
        @NameInMap("secretYAML")
        public String secretYAML;

        @NameInMap("status")
        public String status;

        @NameInMap("type")
        public String type;

        @NameInMap("uid")
        public String uid;

        public static GetEnvironmentLicenseResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetEnvironmentLicenseResponseBodyData self = new GetEnvironmentLicenseResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetEnvironmentLicenseResponseBodyData setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public GetEnvironmentLicenseResponseBodyData setLicenseKey(String licenseKey) {
            this.licenseKey = licenseKey;
            return this;
        }
        public String getLicenseKey() {
            return this.licenseKey;
        }

        public GetEnvironmentLicenseResponseBodyData setLicenseQuota(GetEnvironmentLicenseResponseBodyDataLicenseQuota licenseQuota) {
            this.licenseQuota = licenseQuota;
            return this;
        }
        public GetEnvironmentLicenseResponseBodyDataLicenseQuota getLicenseQuota() {
            return this.licenseQuota;
        }

        public GetEnvironmentLicenseResponseBodyData setProductVersionUID(String productVersionUID) {
            this.productVersionUID = productVersionUID;
            return this;
        }
        public String getProductVersionUID() {
            return this.productVersionUID;
        }

        public GetEnvironmentLicenseResponseBodyData setRejectReason(String rejectReason) {
            this.rejectReason = rejectReason;
            return this;
        }
        public String getRejectReason() {
            return this.rejectReason;
        }

        public GetEnvironmentLicenseResponseBodyData setScope(String scope) {
            this.scope = scope;
            return this;
        }
        public String getScope() {
            return this.scope;
        }

        public GetEnvironmentLicenseResponseBodyData setSecretYAML(String secretYAML) {
            this.secretYAML = secretYAML;
            return this;
        }
        public String getSecretYAML() {
            return this.secretYAML;
        }

        public GetEnvironmentLicenseResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetEnvironmentLicenseResponseBodyData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetEnvironmentLicenseResponseBodyData setUid(String uid) {
            this.uid = uid;
            return this;
        }
        public String getUid() {
            return this.uid;
        }

    }

}
