// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenestsupplier20210521.models;

import com.aliyun.tea.*;

public class CreateServiceShrinkRequest extends TeaModel {
    /**
     * <p>The alert configurations of the service.</p>
     * <blockquote>
     * <p> This parameter takes effect only when you specify an alert policy for <strong>PolicyNames</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>{
     *   &quot;TemplateUrl&quot;: &quot;<a href="http://template.file.url">http://template.file.url</a>&quot;,
     *   // 应用分组级别告警元数据
     *   &quot;ApplicationGroups&quot;: [
     *     {
     *       &quot;Name&quot;: &quot;applicationGroup1&quot;,
     *       &quot;TemplateUrl&quot;: &quot;url1&quot;
     *     },
     *     {
     *       &quot;Name&quot;: &quot;applicationGroup2&quot;,
     *       &quot;TemplateUrl&quot;: &quot;url2&quot;
     *     }
     *   ]
     * }</p>
     */
    @NameInMap("AlarmMetadata")
    public String alarmMetadata;

    /**
     * <p>The approval type of the service usage application. Valid values:</p>
     * <ul>
     * <li>Manual: The application is manually approved.</li>
     * <li>AutoPass: The application is automatically approved.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Manual</p>
     */
    @NameInMap("ApprovalType")
    public String approvalType;

    /**
     * <p>The parameters for building the service</p>
     * 
     * <strong>example:</strong>
     * <p>{ &quot;ServiceTemplateId&quot;: &quot;st-xxxxx&quot;}</p>
     */
    @NameInMap("BuildParameters")
    public String buildParameters;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters.</p>
     * 
     * <strong>example:</strong>
     * <p>10CM943JP0EN9D51H</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("ComplianceMetadata")
    public String complianceMetadataShrink;

    /**
     * <p>The storage configurations of the service. The format in which the deployment information of a service is stored varies based on the deployment type of the service. In this case, the deployment information is stored in the JSON string format.</p>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;TemplateConfigs\&quot;:[{\&quot;Name\&quot;:\&quot;模板1\&quot;,\&quot;Url\&quot;:\&quot;oss://computenest-test/template&quot; 
     *             + &quot;.json?RegionId=cn-beijing\&quot;,\&quot;PredefinedParameters\&quot;:[{\&quot;Name\&quot;:\&quot;低配版\&quot;,&quot; 
     *             + &quot;\&quot;Parameters\&quot;:{\&quot;InstanceType\&quot;:\&quot;ecs.g5.large\&quot;,\&quot;DataDiskSize\&quot;:40}},{\&quot;Name\&quot;:\&quot;高配版\&quot;,&quot; 
     *             + &quot;\&quot;Parameters\&quot;:{\&quot;InstanceType\&quot;:\&quot;ecs.g5.large\&quot;,\&quot;DataDiskSize\&quot;:200}}]}]}</p>
     */
    @NameInMap("DeployMetadata")
    public String deployMetadata;

    /**
     * <p>The deployment type of the service. Valid values:</p>
     * <ul>
     * <li>ros: The service is deployed by using Resource Orchestration Service (ROS).</li>
     * <li>terraform: The service is deployed by using Terraform.</li>
     * <li>ack: The service is deployed by using Container Service for Kubernetes (ACK).</li>
     * <li>spi: The service is deployed by calling a service provider interface (SPI).</li>
     * <li>operation: The service is deployed by using a hosted O\&amp;M service.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ros</p>
     */
    @NameInMap("DeployType")
    public String deployType;

    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The duration for which hosted O\&amp;M is implemented. Unit: seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Duration")
    public Long duration;

    /**
     * <p>Specifies whether to enable the hosted O\&amp;M feature for the service. Default value: false. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * <blockquote>
     * <p> This parameter is required if you set <strong>ServiceType</strong> to <strong>private</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("IsSupportOperated")
    public Boolean isSupportOperated;

    /**
     * <p>The license metadata.</p>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;RetentionDays\&quot;:3}</p>
     */
    @NameInMap("LicenseMetadata")
    public String licenseMetadata;

    /**
     * <p>The logging configurations.</p>
     * 
     * <strong>example:</strong>
     * <p>{ &quot;Logstores&quot;: [ { &quot;LogstoreName&quot;: &quot;access-log&quot;, &quot;LogPath&quot;: &quot;/home/admin/app/logs&quot;, # This parameter is not required for containers. Configure the parameter in the YAML file. &quot;FilePattern&quot;: &quot;access.log\*&quot; # This parameter is not required for containers. Configure the parameter in the YAML file. } ] }</p>
     */
    @NameInMap("LogMetadata")
    public String logMetadata;

    /**
     * <p>The hosted O\&amp;M configurations.</p>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;PrometheusConfigMap\&quot;:{\&quot;New_Vpc_Ack_And_Jumpserver\&quot;:{}}}</p>
     */
    @NameInMap("OperationMetadata")
    public String operationMetadata;

    /**
     * <p>The policy name. The name can be up to 128 characters in length. Separate multiple names with commas (,). Only hosted O\&amp;M policies are supported.</p>
     * 
     * <strong>example:</strong>
     * <p>policyName1, policyName2</p>
     */
    @NameInMap("PolicyNames")
    public String policyNames;

    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>Whether resell is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Resellable")
    public Boolean resellable;

    /**
     * <p>The ID of the resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-aek25refu7r3opq</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The service ID.</p>
     * 
     * <strong>example:</strong>
     * <p>service-0e6fca6a51a544xxxxxx</p>
     */
    @NameInMap("ServiceId")
    public String serviceId;

    /**
     * <p>The service details.</p>
     */
    @NameInMap("ServiceInfo")
    public java.util.List<CreateServiceShrinkRequestServiceInfo> serviceInfo;

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
     * <p>private</p>
     */
    @NameInMap("ServiceType")
    public String serviceType;

    /**
     * <p>The permission type of the deployment URL. Valid values:</p>
     * <ul>
     * <li>Public: All users can go to the URL to create a service instance or a trial service instance.</li>
     * <li>Restricted: Only users in the whitelist can go to the URL to create a service instance or a trial service instance.</li>
     * <li>OnlyFormalRestricted: Only users in the whitelist can go to the URL to create a service instance.</li>
     * <li>OnlyTrailRestricted: Only users in the whitelist can go to the URL to create a trial service instance.</li>
     * <li>Hidden: Users not in the whitelist cannot see the service details page when they go to the URL and cannot request deployment permissions.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Public</p>
     */
    @NameInMap("ShareType")
    public String shareType;

    /**
     * <p>The source service ID for resell。</p>
     * 
     * <strong>example:</strong>
     * <p>service-70a3b15bb62643xxxxxx</p>
     */
    @NameInMap("SourceServiceId")
    public String sourceServiceId;

    /**
     * <p>The source service version for resell。</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("SourceServiceVersion")
    public String sourceServiceVersion;

    /**
     * <p>The custom tags.</p>
     */
    @NameInMap("Tag")
    public java.util.List<CreateServiceShrinkRequestTag> tag;

    /**
     * <p>The type of the tenant. Valid values:</p>
     * <ul>
     * <li>SingleTenant</li>
     * <li>MultiTenant</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>SingleTenant</p>
     */
    @NameInMap("TenantType")
    public String tenantType;

    /**
     * <p>The trial duration. Unit: day. The maximum trial duration cannot exceed 30 days.</p>
     * 
     * <strong>example:</strong>
     * <p>7</p>
     */
    @NameInMap("TrialDuration")
    public Long trialDuration;

    /**
     * <p>The metadata about the upgrade.</p>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;Description\&quot;:\&quot;xxx\&quot;,\&quot;SupportRollback\&quot;:true,\&quot;SupportUpgradeFromVersions\&quot;:[],\&quot;UpgradeComponents\&quot;:[\&quot;Configuration\&quot;]}</p>
     */
    @NameInMap("UpgradeMetadata")
    public String upgradeMetadata;

    /**
     * <p>The version name.</p>
     * 
     * <strong>example:</strong>
     * <p>Draft</p>
     */
    @NameInMap("VersionName")
    public String versionName;

    public static CreateServiceShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateServiceShrinkRequest self = new CreateServiceShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateServiceShrinkRequest setAlarmMetadata(String alarmMetadata) {
        this.alarmMetadata = alarmMetadata;
        return this;
    }
    public String getAlarmMetadata() {
        return this.alarmMetadata;
    }

    public CreateServiceShrinkRequest setApprovalType(String approvalType) {
        this.approvalType = approvalType;
        return this;
    }
    public String getApprovalType() {
        return this.approvalType;
    }

    public CreateServiceShrinkRequest setBuildParameters(String buildParameters) {
        this.buildParameters = buildParameters;
        return this;
    }
    public String getBuildParameters() {
        return this.buildParameters;
    }

    public CreateServiceShrinkRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateServiceShrinkRequest setComplianceMetadataShrink(String complianceMetadataShrink) {
        this.complianceMetadataShrink = complianceMetadataShrink;
        return this;
    }
    public String getComplianceMetadataShrink() {
        return this.complianceMetadataShrink;
    }

    public CreateServiceShrinkRequest setDeployMetadata(String deployMetadata) {
        this.deployMetadata = deployMetadata;
        return this;
    }
    public String getDeployMetadata() {
        return this.deployMetadata;
    }

    public CreateServiceShrinkRequest setDeployType(String deployType) {
        this.deployType = deployType;
        return this;
    }
    public String getDeployType() {
        return this.deployType;
    }

    public CreateServiceShrinkRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public CreateServiceShrinkRequest setDuration(Long duration) {
        this.duration = duration;
        return this;
    }
    public Long getDuration() {
        return this.duration;
    }

    public CreateServiceShrinkRequest setIsSupportOperated(Boolean isSupportOperated) {
        this.isSupportOperated = isSupportOperated;
        return this;
    }
    public Boolean getIsSupportOperated() {
        return this.isSupportOperated;
    }

    public CreateServiceShrinkRequest setLicenseMetadata(String licenseMetadata) {
        this.licenseMetadata = licenseMetadata;
        return this;
    }
    public String getLicenseMetadata() {
        return this.licenseMetadata;
    }

    public CreateServiceShrinkRequest setLogMetadata(String logMetadata) {
        this.logMetadata = logMetadata;
        return this;
    }
    public String getLogMetadata() {
        return this.logMetadata;
    }

    public CreateServiceShrinkRequest setOperationMetadata(String operationMetadata) {
        this.operationMetadata = operationMetadata;
        return this;
    }
    public String getOperationMetadata() {
        return this.operationMetadata;
    }

    public CreateServiceShrinkRequest setPolicyNames(String policyNames) {
        this.policyNames = policyNames;
        return this;
    }
    public String getPolicyNames() {
        return this.policyNames;
    }

    public CreateServiceShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateServiceShrinkRequest setResellable(Boolean resellable) {
        this.resellable = resellable;
        return this;
    }
    public Boolean getResellable() {
        return this.resellable;
    }

    public CreateServiceShrinkRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateServiceShrinkRequest setServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public String getServiceId() {
        return this.serviceId;
    }

    public CreateServiceShrinkRequest setServiceInfo(java.util.List<CreateServiceShrinkRequestServiceInfo> serviceInfo) {
        this.serviceInfo = serviceInfo;
        return this;
    }
    public java.util.List<CreateServiceShrinkRequestServiceInfo> getServiceInfo() {
        return this.serviceInfo;
    }

    public CreateServiceShrinkRequest setServiceType(String serviceType) {
        this.serviceType = serviceType;
        return this;
    }
    public String getServiceType() {
        return this.serviceType;
    }

    public CreateServiceShrinkRequest setShareType(String shareType) {
        this.shareType = shareType;
        return this;
    }
    public String getShareType() {
        return this.shareType;
    }

    public CreateServiceShrinkRequest setSourceServiceId(String sourceServiceId) {
        this.sourceServiceId = sourceServiceId;
        return this;
    }
    public String getSourceServiceId() {
        return this.sourceServiceId;
    }

    public CreateServiceShrinkRequest setSourceServiceVersion(String sourceServiceVersion) {
        this.sourceServiceVersion = sourceServiceVersion;
        return this;
    }
    public String getSourceServiceVersion() {
        return this.sourceServiceVersion;
    }

    public CreateServiceShrinkRequest setTag(java.util.List<CreateServiceShrinkRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<CreateServiceShrinkRequestTag> getTag() {
        return this.tag;
    }

    public CreateServiceShrinkRequest setTenantType(String tenantType) {
        this.tenantType = tenantType;
        return this;
    }
    public String getTenantType() {
        return this.tenantType;
    }

    public CreateServiceShrinkRequest setTrialDuration(Long trialDuration) {
        this.trialDuration = trialDuration;
        return this;
    }
    public Long getTrialDuration() {
        return this.trialDuration;
    }

    public CreateServiceShrinkRequest setUpgradeMetadata(String upgradeMetadata) {
        this.upgradeMetadata = upgradeMetadata;
        return this;
    }
    public String getUpgradeMetadata() {
        return this.upgradeMetadata;
    }

    public CreateServiceShrinkRequest setVersionName(String versionName) {
        this.versionName = versionName;
        return this;
    }
    public String getVersionName() {
        return this.versionName;
    }

    public static class CreateServiceShrinkRequestServiceInfoAgreements extends TeaModel {
        /**
         * <p>Protocol name.</p>
         * 
         * <strong>example:</strong>
         * <p>Name</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>Protocol url.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://aliyun.com/xxxxxxxx.html">https://aliyun.com/xxxxxxxx.html</a></p>
         */
        @NameInMap("Url")
        public String url;

        public static CreateServiceShrinkRequestServiceInfoAgreements build(java.util.Map<String, ?> map) throws Exception {
            CreateServiceShrinkRequestServiceInfoAgreements self = new CreateServiceShrinkRequestServiceInfoAgreements();
            return TeaModel.build(map, self);
        }

        public CreateServiceShrinkRequestServiceInfoAgreements setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateServiceShrinkRequestServiceInfoAgreements setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class CreateServiceShrinkRequestServiceInfoSoftwares extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("Version")
        public String version;

        public static CreateServiceShrinkRequestServiceInfoSoftwares build(java.util.Map<String, ?> map) throws Exception {
            CreateServiceShrinkRequestServiceInfoSoftwares self = new CreateServiceShrinkRequestServiceInfoSoftwares();
            return TeaModel.build(map, self);
        }

        public CreateServiceShrinkRequestServiceInfoSoftwares setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateServiceShrinkRequestServiceInfoSoftwares setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class CreateServiceShrinkRequestServiceInfo extends TeaModel {
        /**
         * <p>Protocol document information about the service.</p>
         */
        @NameInMap("Agreements")
        public java.util.List<CreateServiceShrinkRequestServiceInfoAgreements> agreements;

        /**
         * <p>The URL of the service icon.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://img.tidb.oss.url">http://img.tidb.oss.url</a></p>
         */
        @NameInMap("Image")
        public String image;

        /**
         * <p>The language of the service. Valid values:</p>
         * <ul>
         * <li>zh-CN: Chinese</li>
         * <li>en-US: English</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>zh-CN</p>
         */
        @NameInMap("Locale")
        public String locale;

        /**
         * <p>The URL of the detailed description of the service.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://description.tidb.oss.url">http://description.tidb.oss.url</a></p>
         */
        @NameInMap("LongDescriptionUrl")
        public String longDescriptionUrl;

        /**
         * <p>The service name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>TiDB Database</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The description of the service.</p>
         * 
         * <strong>example:</strong>
         * <p>TiDB是A公司自主设计、研发的开源分布式关系型数据库。</p>
         */
        @NameInMap("ShortDescription")
        public String shortDescription;

        @NameInMap("Softwares")
        public java.util.List<CreateServiceShrinkRequestServiceInfoSoftwares> softwares;

        public static CreateServiceShrinkRequestServiceInfo build(java.util.Map<String, ?> map) throws Exception {
            CreateServiceShrinkRequestServiceInfo self = new CreateServiceShrinkRequestServiceInfo();
            return TeaModel.build(map, self);
        }

        public CreateServiceShrinkRequestServiceInfo setAgreements(java.util.List<CreateServiceShrinkRequestServiceInfoAgreements> agreements) {
            this.agreements = agreements;
            return this;
        }
        public java.util.List<CreateServiceShrinkRequestServiceInfoAgreements> getAgreements() {
            return this.agreements;
        }

        public CreateServiceShrinkRequestServiceInfo setImage(String image) {
            this.image = image;
            return this;
        }
        public String getImage() {
            return this.image;
        }

        public CreateServiceShrinkRequestServiceInfo setLocale(String locale) {
            this.locale = locale;
            return this;
        }
        public String getLocale() {
            return this.locale;
        }

        public CreateServiceShrinkRequestServiceInfo setLongDescriptionUrl(String longDescriptionUrl) {
            this.longDescriptionUrl = longDescriptionUrl;
            return this;
        }
        public String getLongDescriptionUrl() {
            return this.longDescriptionUrl;
        }

        public CreateServiceShrinkRequestServiceInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateServiceShrinkRequestServiceInfo setShortDescription(String shortDescription) {
            this.shortDescription = shortDescription;
            return this;
        }
        public String getShortDescription() {
            return this.shortDescription;
        }

        public CreateServiceShrinkRequestServiceInfo setSoftwares(java.util.List<CreateServiceShrinkRequestServiceInfoSoftwares> softwares) {
            this.softwares = softwares;
            return this;
        }
        public java.util.List<CreateServiceShrinkRequestServiceInfoSoftwares> getSoftwares() {
            return this.softwares;
        }

    }

    public static class CreateServiceShrinkRequestTag extends TeaModel {
        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>Usage</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>Web</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateServiceShrinkRequestTag build(java.util.Map<String, ?> map) throws Exception {
            CreateServiceShrinkRequestTag self = new CreateServiceShrinkRequestTag();
            return TeaModel.build(map, self);
        }

        public CreateServiceShrinkRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateServiceShrinkRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
