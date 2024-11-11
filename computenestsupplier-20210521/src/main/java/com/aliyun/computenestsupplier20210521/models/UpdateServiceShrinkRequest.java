// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenestsupplier20210521.models;

import com.aliyun.tea.*;

public class UpdateServiceShrinkRequest extends TeaModel {
    /**
     * <p>Is need to update the artifacts</p>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;CmsTemplateId\&quot;:1162921,\&quot;TemplateUrl\&quot;:\&quot;<a href="https://service-info-private.oss-cn-hangzhou.aliyuncs.com/1760465342xxxxxx/template/c072ef50-6c03-4d9c-8f0e-d1c440xxxxxx.json%5C%5C%22%7D">https://service-info-private.oss-cn-hangzhou.aliyuncs.com/1760465342xxxxxx/template/c072ef50-6c03-4d9c-8f0e-d1c440xxxxxx.json\\&quot;}</a></p>
     */
    @NameInMap("AlarmMetadata")
    public String alarmMetadata;

    /**
     * <p>The service type. Valid values:</p>
     * <ul>
     * <li>private: The service is a private service and is deployed within the account of a customer.</li>
     * <li>managed: The service is a fully managed service and is deployed within the account of a service provider.</li>
     * <li>operation: The service is a hosted O\&amp;M service.</li>
     * <li>poc: The service is a trial service.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Manual</p>
     */
    @NameInMap("ApprovalType")
    public String approvalType;

    /**
     * <p>The options for update the service.</p>
     * 
     * <strong>example:</strong>
     * <p>788E7CP0EN9D51P</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>This parameter is not publicly accessible.</p>
     */
    @NameInMap("Commodity")
    public String commodityShrink;

    @NameInMap("ComplianceMetadata")
    public String complianceMetadataShrink;

    /**
     * <p>The policy name. The name can be up to 128 characters in length. Separate multiple names with commas (,). Only hosted O\&amp;M policies are supported.</p>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;EstimateTime\&quot;:null,\&quot;SupplierDeployMetadata\&quot;:{\&quot;DeployTimeout\&quot;:7200},\&quot;EnableVnc\&quot;:false}</p>
     */
    @NameInMap("DeployMetadata")
    public String deployMetadata;

    /**
     * <p>WB01286039</p>
     * 
     * <strong>example:</strong>
     * <p>ros</p>
     */
    @NameInMap("DeployType")
    public String deployType;

    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The deployment type of the service. Valid values:</p>
     * <ul>
     * <li>ros: The service is deployed by using Resource Orchestration Service (ROS).</li>
     * <li>terraform: The service is deployed by using Terraform.</li>
     * <li>spi: The service is deployed by calling a service provider interface (SPI).</li>
     * <li>operation: The service is deployed by using a hosted O\&amp;M service.</li>
     * <li>container: The service is deployed by using a container.</li>
     * <li>pkg: The service is deployed by using a package.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>259200</p>
     */
    @NameInMap("Duration")
    public Long duration;

    /**
     * <p>The version name.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("IsSupportOperated")
    public Boolean isSupportOperated;

    /**
     * <p>The duration for which hosted O\&amp;M is implemented. Unit: seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>Metering Item Configuration Information (Cloud Marketplace - Pay-As-You-Go Use)</p>
     */
    @NameInMap("LicenseMetadata")
    public String licenseMetadata;

    /**
     * <p>This parameter is not publicly accessible.</p>
     * 
     * <strong>example:</strong>
     * <p>Specifies whether to support distribution. Valid values:</p>
     * <ul>
     * <li>false</li>
     * <li>true</li>
     * </ul>
     */
    @NameInMap("LogMetadata")
    public String logMetadata;

    /**
     * <p>{\&quot;RetentionDays\&quot;:3}</p>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;PrometheusConfigMap\&quot;:{\&quot;Custom_Image_Ecs\&quot;:{\&quot;EnablePrometheus\&quot;:false}}}</p>
     */
    @NameInMap("OperationMetadata")
    public String operationMetadata;

    /**
     * <p>The package name.</p>
     * 
     * <strong>example:</strong>
     * <p>policyName1, policyName2</p>
     */
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

    @NameInMap("ShareType")
    public String shareType;

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

    public UpdateServiceShrinkRequest setApprovalType(String approvalType) {
        this.approvalType = approvalType;
        return this;
    }
    public String getApprovalType() {
        return this.approvalType;
    }

    public UpdateServiceShrinkRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateServiceShrinkRequest setCommodityShrink(String commodityShrink) {
        this.commodityShrink = commodityShrink;
        return this;
    }
    public String getCommodityShrink() {
        return this.commodityShrink;
    }

    public UpdateServiceShrinkRequest setComplianceMetadataShrink(String complianceMetadataShrink) {
        this.complianceMetadataShrink = complianceMetadataShrink;
        return this;
    }
    public String getComplianceMetadataShrink() {
        return this.complianceMetadataShrink;
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

    public UpdateServiceShrinkRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
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

    public UpdateServiceShrinkRequest setShareType(String shareType) {
        this.shareType = shareType;
        return this;
    }
    public String getShareType() {
        return this.shareType;
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

    public static class UpdateServiceShrinkRequestServiceInfoSoftwares extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("Version")
        public String version;

        public static UpdateServiceShrinkRequestServiceInfoSoftwares build(java.util.Map<String, ?> map) throws Exception {
            UpdateServiceShrinkRequestServiceInfoSoftwares self = new UpdateServiceShrinkRequestServiceInfoSoftwares();
            return TeaModel.build(map, self);
        }

        public UpdateServiceShrinkRequestServiceInfoSoftwares setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateServiceShrinkRequestServiceInfoSoftwares setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
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

        @NameInMap("Softwares")
        public java.util.List<UpdateServiceShrinkRequestServiceInfoSoftwares> softwares;

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

        public UpdateServiceShrinkRequestServiceInfo setSoftwares(java.util.List<UpdateServiceShrinkRequestServiceInfoSoftwares> softwares) {
            this.softwares = softwares;
            return this;
        }
        public java.util.List<UpdateServiceShrinkRequestServiceInfoSoftwares> getSoftwares() {
            return this.softwares;
        }

    }

}
