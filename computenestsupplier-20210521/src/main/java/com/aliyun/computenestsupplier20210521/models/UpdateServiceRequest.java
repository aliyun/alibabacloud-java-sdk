// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenestsupplier20210521.models;

import com.aliyun.tea.*;

public class UpdateServiceRequest extends TeaModel {
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

    @NameInMap("OperationMetadata")
    public String operationMetadata;

    @NameInMap("PolicyNames")
    public String policyNames;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ServiceId")
    public String serviceId;

    @NameInMap("ServiceInfo")
    public java.util.List<UpdateServiceRequestServiceInfo> serviceInfo;

    @NameInMap("ServiceType")
    public String serviceType;

    @NameInMap("ServiceVersion")
    public String serviceVersion;

    @NameInMap("TenantType")
    public String tenantType;

    @NameInMap("TrialDuration")
    public Integer trialDuration;

    @NameInMap("UpgradeMetadata")
    public String upgradeMetadata;

    @NameInMap("VersionName")
    public String versionName;

    public static UpdateServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateServiceRequest self = new UpdateServiceRequest();
        return TeaModel.build(map, self);
    }

    public UpdateServiceRequest setAlarmMetadata(String alarmMetadata) {
        this.alarmMetadata = alarmMetadata;
        return this;
    }
    public String getAlarmMetadata() {
        return this.alarmMetadata;
    }

    public UpdateServiceRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateServiceRequest setDeployMetadata(String deployMetadata) {
        this.deployMetadata = deployMetadata;
        return this;
    }
    public String getDeployMetadata() {
        return this.deployMetadata;
    }

    public UpdateServiceRequest setDeployType(String deployType) {
        this.deployType = deployType;
        return this;
    }
    public String getDeployType() {
        return this.deployType;
    }

    public UpdateServiceRequest setDuration(Long duration) {
        this.duration = duration;
        return this;
    }
    public Long getDuration() {
        return this.duration;
    }

    public UpdateServiceRequest setIsSupportOperated(Boolean isSupportOperated) {
        this.isSupportOperated = isSupportOperated;
        return this;
    }
    public Boolean getIsSupportOperated() {
        return this.isSupportOperated;
    }

    public UpdateServiceRequest setLicenseMetadata(String licenseMetadata) {
        this.licenseMetadata = licenseMetadata;
        return this;
    }
    public String getLicenseMetadata() {
        return this.licenseMetadata;
    }

    public UpdateServiceRequest setOperationMetadata(String operationMetadata) {
        this.operationMetadata = operationMetadata;
        return this;
    }
    public String getOperationMetadata() {
        return this.operationMetadata;
    }

    public UpdateServiceRequest setPolicyNames(String policyNames) {
        this.policyNames = policyNames;
        return this;
    }
    public String getPolicyNames() {
        return this.policyNames;
    }

    public UpdateServiceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateServiceRequest setServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public String getServiceId() {
        return this.serviceId;
    }

    public UpdateServiceRequest setServiceInfo(java.util.List<UpdateServiceRequestServiceInfo> serviceInfo) {
        this.serviceInfo = serviceInfo;
        return this;
    }
    public java.util.List<UpdateServiceRequestServiceInfo> getServiceInfo() {
        return this.serviceInfo;
    }

    public UpdateServiceRequest setServiceType(String serviceType) {
        this.serviceType = serviceType;
        return this;
    }
    public String getServiceType() {
        return this.serviceType;
    }

    public UpdateServiceRequest setServiceVersion(String serviceVersion) {
        this.serviceVersion = serviceVersion;
        return this;
    }
    public String getServiceVersion() {
        return this.serviceVersion;
    }

    public UpdateServiceRequest setTenantType(String tenantType) {
        this.tenantType = tenantType;
        return this;
    }
    public String getTenantType() {
        return this.tenantType;
    }

    public UpdateServiceRequest setTrialDuration(Integer trialDuration) {
        this.trialDuration = trialDuration;
        return this;
    }
    public Integer getTrialDuration() {
        return this.trialDuration;
    }

    public UpdateServiceRequest setUpgradeMetadata(String upgradeMetadata) {
        this.upgradeMetadata = upgradeMetadata;
        return this;
    }
    public String getUpgradeMetadata() {
        return this.upgradeMetadata;
    }

    public UpdateServiceRequest setVersionName(String versionName) {
        this.versionName = versionName;
        return this;
    }
    public String getVersionName() {
        return this.versionName;
    }

    public static class UpdateServiceRequestServiceInfo extends TeaModel {
        @NameInMap("Image")
        public String image;

        @NameInMap("Locale")
        public String locale;

        @NameInMap("Name")
        public String name;

        @NameInMap("ShortDescription")
        public String shortDescription;

        public static UpdateServiceRequestServiceInfo build(java.util.Map<String, ?> map) throws Exception {
            UpdateServiceRequestServiceInfo self = new UpdateServiceRequestServiceInfo();
            return TeaModel.build(map, self);
        }

        public UpdateServiceRequestServiceInfo setImage(String image) {
            this.image = image;
            return this;
        }
        public String getImage() {
            return this.image;
        }

        public UpdateServiceRequestServiceInfo setLocale(String locale) {
            this.locale = locale;
            return this;
        }
        public String getLocale() {
            return this.locale;
        }

        public UpdateServiceRequestServiceInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateServiceRequestServiceInfo setShortDescription(String shortDescription) {
            this.shortDescription = shortDescription;
            return this;
        }
        public String getShortDescription() {
            return this.shortDescription;
        }

    }

}
