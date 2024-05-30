// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenestsupplier20210521.models;

import com.aliyun.tea.*;

public class UpdateServiceShrinkRequest extends TeaModel {
    @NameInMap("AlarmMetadata")
    public String alarmMetadata;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("DeployMetadata")
    public String deployMetadata;

    @NameInMap("DeployType")
    public String deployType;

    @NameInMap("Duration")
    public Long duration;

    @NameInMap("IsSupportOperated")
    public Boolean isSupportOperated;

    @NameInMap("LicenseMetadata")
    public String licenseMetadata;

    @NameInMap("LogMetadata")
    public String logMetadata;

    @NameInMap("OperationMetadata")
    public String operationMetadata;

    @NameInMap("PolicyNames")
    public String policyNames;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("Resellable")
    public Boolean resellable;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ServiceId")
    public String serviceId;

    @NameInMap("ServiceInfo")
    public java.util.List<UpdateServiceShrinkRequestServiceInfo> serviceInfo;

    @NameInMap("ServiceType")
    public String serviceType;

    @NameInMap("ServiceVersion")
    public String serviceVersion;

    @NameInMap("TenantType")
    public String tenantType;

    @NameInMap("TrialDuration")
    public Integer trialDuration;

    @NameInMap("UpdateOption")
    public String updateOptionShrink;

    @NameInMap("UpgradeMetadata")
    public String upgradeMetadata;

    @NameInMap("VersionName")
    public String versionName;

    public static UpdateServiceShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateServiceShrinkRequest self = new UpdateServiceShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateServiceShrinkRequest setAlarmMetadata(String alarmMetadata) {
        this.alarmMetadata = alarmMetadata;
        return this;
    }
    public String getAlarmMetadata() {
        return this.alarmMetadata;
    }

    public UpdateServiceShrinkRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateServiceShrinkRequest setDeployMetadata(String deployMetadata) {
        this.deployMetadata = deployMetadata;
        return this;
    }
    public String getDeployMetadata() {
        return this.deployMetadata;
    }

    public UpdateServiceShrinkRequest setDeployType(String deployType) {
        this.deployType = deployType;
        return this;
    }
    public String getDeployType() {
        return this.deployType;
    }

    public UpdateServiceShrinkRequest setDuration(Long duration) {
        this.duration = duration;
        return this;
    }
    public Long getDuration() {
        return this.duration;
    }

    public UpdateServiceShrinkRequest setIsSupportOperated(Boolean isSupportOperated) {
        this.isSupportOperated = isSupportOperated;
        return this;
    }
    public Boolean getIsSupportOperated() {
        return this.isSupportOperated;
    }

    public UpdateServiceShrinkRequest setLicenseMetadata(String licenseMetadata) {
        this.licenseMetadata = licenseMetadata;
        return this;
    }
    public String getLicenseMetadata() {
        return this.licenseMetadata;
    }

    public UpdateServiceShrinkRequest setLogMetadata(String logMetadata) {
        this.logMetadata = logMetadata;
        return this;
    }
    public String getLogMetadata() {
        return this.logMetadata;
    }

    public UpdateServiceShrinkRequest setOperationMetadata(String operationMetadata) {
        this.operationMetadata = operationMetadata;
        return this;
    }
    public String getOperationMetadata() {
        return this.operationMetadata;
    }

    public UpdateServiceShrinkRequest setPolicyNames(String policyNames) {
        this.policyNames = policyNames;
        return this;
    }
    public String getPolicyNames() {
        return this.policyNames;
    }

    public UpdateServiceShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateServiceShrinkRequest setResellable(Boolean resellable) {
        this.resellable = resellable;
        return this;
    }
    public Boolean getResellable() {
        return this.resellable;
    }

    public UpdateServiceShrinkRequest setServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public String getServiceId() {
        return this.serviceId;
    }

    public UpdateServiceShrinkRequest setServiceInfo(java.util.List<UpdateServiceShrinkRequestServiceInfo> serviceInfo) {
        this.serviceInfo = serviceInfo;
        return this;
    }
    public java.util.List<UpdateServiceShrinkRequestServiceInfo> getServiceInfo() {
        return this.serviceInfo;
    }

    public UpdateServiceShrinkRequest setServiceType(String serviceType) {
        this.serviceType = serviceType;
        return this;
    }
    public String getServiceType() {
        return this.serviceType;
    }

    public UpdateServiceShrinkRequest setServiceVersion(String serviceVersion) {
        this.serviceVersion = serviceVersion;
        return this;
    }
    public String getServiceVersion() {
        return this.serviceVersion;
    }

    public UpdateServiceShrinkRequest setTenantType(String tenantType) {
        this.tenantType = tenantType;
        return this;
    }
    public String getTenantType() {
        return this.tenantType;
    }

    public UpdateServiceShrinkRequest setTrialDuration(Integer trialDuration) {
        this.trialDuration = trialDuration;
        return this;
    }
    public Integer getTrialDuration() {
        return this.trialDuration;
    }

    public UpdateServiceShrinkRequest setUpdateOptionShrink(String updateOptionShrink) {
        this.updateOptionShrink = updateOptionShrink;
        return this;
    }
    public String getUpdateOptionShrink() {
        return this.updateOptionShrink;
    }

    public UpdateServiceShrinkRequest setUpgradeMetadata(String upgradeMetadata) {
        this.upgradeMetadata = upgradeMetadata;
        return this;
    }
    public String getUpgradeMetadata() {
        return this.upgradeMetadata;
    }

    public UpdateServiceShrinkRequest setVersionName(String versionName) {
        this.versionName = versionName;
        return this;
    }
    public String getVersionName() {
        return this.versionName;
    }

    public static class UpdateServiceShrinkRequestServiceInfoAgreements extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("Url")
        public String url;

        public static UpdateServiceShrinkRequestServiceInfoAgreements build(java.util.Map<String, ?> map) throws Exception {
            UpdateServiceShrinkRequestServiceInfoAgreements self = new UpdateServiceShrinkRequestServiceInfoAgreements();
            return TeaModel.build(map, self);
        }

        public UpdateServiceShrinkRequestServiceInfoAgreements setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateServiceShrinkRequestServiceInfoAgreements setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class UpdateServiceShrinkRequestServiceInfo extends TeaModel {
        @NameInMap("Agreements")
        public java.util.List<UpdateServiceShrinkRequestServiceInfoAgreements> agreements;

        @NameInMap("Image")
        public String image;

        @NameInMap("Locale")
        public String locale;

        @NameInMap("LongDescriptionUrl")
        public String longDescriptionUrl;

        @NameInMap("Name")
        public String name;

        @NameInMap("ShortDescription")
        public String shortDescription;

        public static UpdateServiceShrinkRequestServiceInfo build(java.util.Map<String, ?> map) throws Exception {
            UpdateServiceShrinkRequestServiceInfo self = new UpdateServiceShrinkRequestServiceInfo();
            return TeaModel.build(map, self);
        }

        public UpdateServiceShrinkRequestServiceInfo setAgreements(java.util.List<UpdateServiceShrinkRequestServiceInfoAgreements> agreements) {
            this.agreements = agreements;
            return this;
        }
        public java.util.List<UpdateServiceShrinkRequestServiceInfoAgreements> getAgreements() {
            return this.agreements;
        }

        public UpdateServiceShrinkRequestServiceInfo setImage(String image) {
            this.image = image;
            return this;
        }
        public String getImage() {
            return this.image;
        }

        public UpdateServiceShrinkRequestServiceInfo setLocale(String locale) {
            this.locale = locale;
            return this;
        }
        public String getLocale() {
            return this.locale;
        }

        public UpdateServiceShrinkRequestServiceInfo setLongDescriptionUrl(String longDescriptionUrl) {
            this.longDescriptionUrl = longDescriptionUrl;
            return this;
        }
        public String getLongDescriptionUrl() {
            return this.longDescriptionUrl;
        }

        public UpdateServiceShrinkRequestServiceInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateServiceShrinkRequestServiceInfo setShortDescription(String shortDescription) {
            this.shortDescription = shortDescription;
            return this;
        }
        public String getShortDescription() {
            return this.shortDescription;
        }

    }

}
