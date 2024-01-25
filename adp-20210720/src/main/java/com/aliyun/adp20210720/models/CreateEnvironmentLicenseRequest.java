// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720.models;

import com.aliyun.tea.*;

public class CreateEnvironmentLicenseRequest extends TeaModel {
    @NameInMap("companyName")
    public String companyName;

    @NameInMap("contact")
    public String contact;

    @NameInMap("description")
    public String description;

    @NameInMap("expireTime")
    public String expireTime;

    @NameInMap("licenseQuota")
    public CreateEnvironmentLicenseRequestLicenseQuota licenseQuota;

    @NameInMap("machineFingerprint")
    public String machineFingerprint;

    @NameInMap("name")
    public String name;

    @NameInMap("productVersionUID")
    public String productVersionUID;

    @NameInMap("scenario")
    public String scenario;

    @NameInMap("scope")
    public String scope;

    @NameInMap("type")
    public String type;

    public static CreateEnvironmentLicenseRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateEnvironmentLicenseRequest self = new CreateEnvironmentLicenseRequest();
        return TeaModel.build(map, self);
    }

    public CreateEnvironmentLicenseRequest setCompanyName(String companyName) {
        this.companyName = companyName;
        return this;
    }
    public String getCompanyName() {
        return this.companyName;
    }

    public CreateEnvironmentLicenseRequest setContact(String contact) {
        this.contact = contact;
        return this;
    }
    public String getContact() {
        return this.contact;
    }

    public CreateEnvironmentLicenseRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateEnvironmentLicenseRequest setExpireTime(String expireTime) {
        this.expireTime = expireTime;
        return this;
    }
    public String getExpireTime() {
        return this.expireTime;
    }

    public CreateEnvironmentLicenseRequest setLicenseQuota(CreateEnvironmentLicenseRequestLicenseQuota licenseQuota) {
        this.licenseQuota = licenseQuota;
        return this;
    }
    public CreateEnvironmentLicenseRequestLicenseQuota getLicenseQuota() {
        return this.licenseQuota;
    }

    public CreateEnvironmentLicenseRequest setMachineFingerprint(String machineFingerprint) {
        this.machineFingerprint = machineFingerprint;
        return this;
    }
    public String getMachineFingerprint() {
        return this.machineFingerprint;
    }

    public CreateEnvironmentLicenseRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateEnvironmentLicenseRequest setProductVersionUID(String productVersionUID) {
        this.productVersionUID = productVersionUID;
        return this;
    }
    public String getProductVersionUID() {
        return this.productVersionUID;
    }

    public CreateEnvironmentLicenseRequest setScenario(String scenario) {
        this.scenario = scenario;
        return this;
    }
    public String getScenario() {
        return this.scenario;
    }

    public CreateEnvironmentLicenseRequest setScope(String scope) {
        this.scope = scope;
        return this;
    }
    public String getScope() {
        return this.scope;
    }

    public CreateEnvironmentLicenseRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public static class CreateEnvironmentLicenseRequestLicenseQuotaClusterQuota extends TeaModel {
        @NameInMap("cpuCoreLimit")
        public Long cpuCoreLimit;

        public static CreateEnvironmentLicenseRequestLicenseQuotaClusterQuota build(java.util.Map<String, ?> map) throws Exception {
            CreateEnvironmentLicenseRequestLicenseQuotaClusterQuota self = new CreateEnvironmentLicenseRequestLicenseQuotaClusterQuota();
            return TeaModel.build(map, self);
        }

        public CreateEnvironmentLicenseRequestLicenseQuotaClusterQuota setCpuCoreLimit(Long cpuCoreLimit) {
            this.cpuCoreLimit = cpuCoreLimit;
            return this;
        }
        public Long getCpuCoreLimit() {
            return this.cpuCoreLimit;
        }

    }

    public static class CreateEnvironmentLicenseRequestLicenseQuotaCustomQuotas extends TeaModel {
        @NameInMap("description")
        public String description;

        @NameInMap("key")
        public String key;

        @NameInMap("value")
        public String value;

        public static CreateEnvironmentLicenseRequestLicenseQuotaCustomQuotas build(java.util.Map<String, ?> map) throws Exception {
            CreateEnvironmentLicenseRequestLicenseQuotaCustomQuotas self = new CreateEnvironmentLicenseRequestLicenseQuotaCustomQuotas();
            return TeaModel.build(map, self);
        }

        public CreateEnvironmentLicenseRequestLicenseQuotaCustomQuotas setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateEnvironmentLicenseRequestLicenseQuotaCustomQuotas setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateEnvironmentLicenseRequestLicenseQuotaCustomQuotas setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateEnvironmentLicenseRequestLicenseQuota extends TeaModel {
        @NameInMap("clusterQuota")
        public CreateEnvironmentLicenseRequestLicenseQuotaClusterQuota clusterQuota;

        @NameInMap("customQuotas")
        public java.util.List<CreateEnvironmentLicenseRequestLicenseQuotaCustomQuotas> customQuotas;

        public static CreateEnvironmentLicenseRequestLicenseQuota build(java.util.Map<String, ?> map) throws Exception {
            CreateEnvironmentLicenseRequestLicenseQuota self = new CreateEnvironmentLicenseRequestLicenseQuota();
            return TeaModel.build(map, self);
        }

        public CreateEnvironmentLicenseRequestLicenseQuota setClusterQuota(CreateEnvironmentLicenseRequestLicenseQuotaClusterQuota clusterQuota) {
            this.clusterQuota = clusterQuota;
            return this;
        }
        public CreateEnvironmentLicenseRequestLicenseQuotaClusterQuota getClusterQuota() {
            return this.clusterQuota;
        }

        public CreateEnvironmentLicenseRequestLicenseQuota setCustomQuotas(java.util.List<CreateEnvironmentLicenseRequestLicenseQuotaCustomQuotas> customQuotas) {
            this.customQuotas = customQuotas;
            return this;
        }
        public java.util.List<CreateEnvironmentLicenseRequestLicenseQuotaCustomQuotas> getCustomQuotas() {
            return this.customQuotas;
        }

    }

}
