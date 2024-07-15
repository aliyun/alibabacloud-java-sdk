// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenestsupplier20210521.models;

import com.aliyun.tea.*;

public class UpdateServiceRequest extends TeaModel {
    /**
     * <p>The alert configurations of the service.</p>
     * <blockquote>
     * <p> This parameter takes effect only when you specify an alert policy for <strong>PolicyNames</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;CmsTemplateId\&quot;:1162921,\&quot;TemplateUrl\&quot;:\&quot;<a href="https://service-info-private.oss-cn-hangzhou.aliyuncs.com/1760465342xxxxxx/template/c072ef50-6c03-4d9c-8f0e-d1c440xxxxxx.json%5C%5C%22%7D">https://service-info-private.oss-cn-hangzhou.aliyuncs.com/1760465342xxxxxx/template/c072ef50-6c03-4d9c-8f0e-d1c440xxxxxx.json\\&quot;}</a></p>
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
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>788E7CP0EN9D51P</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("Commodity")
    public UpdateServiceRequestCommodity commodity;

    /**
     * <p>The storage configurations of the service. The format in which the deployment information of a service is stored varies based on the deployment type of the service. In this case, the deployment information is stored in the JSON string format.</p>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;EstimateTime\&quot;:null,\&quot;SupplierDeployMetadata\&quot;:{\&quot;DeployTimeout\&quot;:7200},\&quot;EnableVnc\&quot;:false}</p>
     */
    @NameInMap("DeployMetadata")
    public String deployMetadata;

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
     * <p>ros</p>
     */
    @NameInMap("DeployType")
    public String deployType;

    /**
     * <p>The duration for which hosted O\&amp;M is implemented. Unit: seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>259200</p>
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
     * <p>{\&quot;PrometheusConfigMap\&quot;:{\&quot;Custom_Image_Ecs\&quot;:{\&quot;EnablePrometheus\&quot;:false}}}</p>
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
     * <p>Specifies whether to support distribution. Valid values:</p>
     * <ul>
     * <li>false</li>
     * <li>true</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Resellable")
    public Boolean resellable;

    /**
     * <p>The service ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>service-1dda29c3eca648xxxxxx</p>
     */
    @NameInMap("ServiceId")
    public String serviceId;

    /**
     * <p>The service details.</p>
     */
    @NameInMap("ServiceInfo")
    public java.util.List<UpdateServiceRequestServiceInfo> serviceInfo;

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
     * <p>The service version.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ServiceVersion")
    public String serviceVersion;

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
    public Integer trialDuration;

    /**
     * <p>The options for update the service.</p>
     */
    @NameInMap("UpdateOption")
    public UpdateServiceRequestUpdateOption updateOption;

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

    public UpdateServiceRequest setApprovalType(String approvalType) {
        this.approvalType = approvalType;
        return this;
    }
    public String getApprovalType() {
        return this.approvalType;
    }

    public UpdateServiceRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateServiceRequest setCommodity(UpdateServiceRequestCommodity commodity) {
        this.commodity = commodity;
        return this;
    }
    public UpdateServiceRequestCommodity getCommodity() {
        return this.commodity;
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

    public UpdateServiceRequest setLogMetadata(String logMetadata) {
        this.logMetadata = logMetadata;
        return this;
    }
    public String getLogMetadata() {
        return this.logMetadata;
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

    public UpdateServiceRequest setResellable(Boolean resellable) {
        this.resellable = resellable;
        return this;
    }
    public Boolean getResellable() {
        return this.resellable;
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

    public UpdateServiceRequest setShareType(String shareType) {
        this.shareType = shareType;
        return this;
    }
    public String getShareType() {
        return this.shareType;
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

    public UpdateServiceRequest setUpdateOption(UpdateServiceRequestUpdateOption updateOption) {
        this.updateOption = updateOption;
        return this;
    }
    public UpdateServiceRequestUpdateOption getUpdateOption() {
        return this.updateOption;
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

    public static class UpdateServiceRequestCommodityComponentsMappings extends TeaModel {
        @NameInMap("Mappings")
        public String mappings;

        @NameInMap("TemplateName")
        public String templateName;

        public static UpdateServiceRequestCommodityComponentsMappings build(java.util.Map<String, ?> map) throws Exception {
            UpdateServiceRequestCommodityComponentsMappings self = new UpdateServiceRequestCommodityComponentsMappings();
            return TeaModel.build(map, self);
        }

        public UpdateServiceRequestCommodityComponentsMappings setMappings(String mappings) {
            this.mappings = mappings;
            return this;
        }
        public String getMappings() {
            return this.mappings;
        }

        public UpdateServiceRequestCommodityComponentsMappings setTemplateName(String templateName) {
            this.templateName = templateName;
            return this;
        }
        public String getTemplateName() {
            return this.templateName;
        }

    }

    public static class UpdateServiceRequestCommodityMeteringEntityExtraInfos extends TeaModel {
        @NameInMap("EntityId")
        public String entityId;

        @NameInMap("MetricName")
        public String metricName;

        @NameInMap("Promql")
        public String promql;

        @NameInMap("Type")
        public String type;

        public static UpdateServiceRequestCommodityMeteringEntityExtraInfos build(java.util.Map<String, ?> map) throws Exception {
            UpdateServiceRequestCommodityMeteringEntityExtraInfos self = new UpdateServiceRequestCommodityMeteringEntityExtraInfos();
            return TeaModel.build(map, self);
        }

        public UpdateServiceRequestCommodityMeteringEntityExtraInfos setEntityId(String entityId) {
            this.entityId = entityId;
            return this;
        }
        public String getEntityId() {
            return this.entityId;
        }

        public UpdateServiceRequestCommodityMeteringEntityExtraInfos setMetricName(String metricName) {
            this.metricName = metricName;
            return this;
        }
        public String getMetricName() {
            return this.metricName;
        }

        public UpdateServiceRequestCommodityMeteringEntityExtraInfos setPromql(String promql) {
            this.promql = promql;
            return this;
        }
        public String getPromql() {
            return this.promql;
        }

        public UpdateServiceRequestCommodityMeteringEntityExtraInfos setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class UpdateServiceRequestCommodityMeteringEntityMappings extends TeaModel {
        @NameInMap("EntityIds")
        public java.util.List<String> entityIds;

        @NameInMap("SpecificationName")
        public String specificationName;

        @NameInMap("TemplateName")
        public String templateName;

        public static UpdateServiceRequestCommodityMeteringEntityMappings build(java.util.Map<String, ?> map) throws Exception {
            UpdateServiceRequestCommodityMeteringEntityMappings self = new UpdateServiceRequestCommodityMeteringEntityMappings();
            return TeaModel.build(map, self);
        }

        public UpdateServiceRequestCommodityMeteringEntityMappings setEntityIds(java.util.List<String> entityIds) {
            this.entityIds = entityIds;
            return this;
        }
        public java.util.List<String> getEntityIds() {
            return this.entityIds;
        }

        public UpdateServiceRequestCommodityMeteringEntityMappings setSpecificationName(String specificationName) {
            this.specificationName = specificationName;
            return this;
        }
        public String getSpecificationName() {
            return this.specificationName;
        }

        public UpdateServiceRequestCommodityMeteringEntityMappings setTemplateName(String templateName) {
            this.templateName = templateName;
            return this;
        }
        public String getTemplateName() {
            return this.templateName;
        }

    }

    public static class UpdateServiceRequestCommoditySpecificationMappings extends TeaModel {
        @NameInMap("SpecificationCode")
        public String specificationCode;

        @NameInMap("SpecificationName")
        public String specificationName;

        @NameInMap("TemplateName")
        public String templateName;

        public static UpdateServiceRequestCommoditySpecificationMappings build(java.util.Map<String, ?> map) throws Exception {
            UpdateServiceRequestCommoditySpecificationMappings self = new UpdateServiceRequestCommoditySpecificationMappings();
            return TeaModel.build(map, self);
        }

        public UpdateServiceRequestCommoditySpecificationMappings setSpecificationCode(String specificationCode) {
            this.specificationCode = specificationCode;
            return this;
        }
        public String getSpecificationCode() {
            return this.specificationCode;
        }

        public UpdateServiceRequestCommoditySpecificationMappings setSpecificationName(String specificationName) {
            this.specificationName = specificationName;
            return this;
        }
        public String getSpecificationName() {
            return this.specificationName;
        }

        public UpdateServiceRequestCommoditySpecificationMappings setTemplateName(String templateName) {
            this.templateName = templateName;
            return this;
        }
        public String getTemplateName() {
            return this.templateName;
        }

    }

    public static class UpdateServiceRequestCommodity extends TeaModel {
        @NameInMap("ComponentsMappings")
        public java.util.List<UpdateServiceRequestCommodityComponentsMappings> componentsMappings;

        @NameInMap("MeteringEntityExtraInfos")
        public java.util.List<UpdateServiceRequestCommodityMeteringEntityExtraInfos> meteringEntityExtraInfos;

        @NameInMap("MeteringEntityMappings")
        public java.util.List<UpdateServiceRequestCommodityMeteringEntityMappings> meteringEntityMappings;

        @NameInMap("SaasBoostConfig")
        public String saasBoostConfig;

        @NameInMap("SpecificationMappings")
        public java.util.List<UpdateServiceRequestCommoditySpecificationMappings> specificationMappings;

        public static UpdateServiceRequestCommodity build(java.util.Map<String, ?> map) throws Exception {
            UpdateServiceRequestCommodity self = new UpdateServiceRequestCommodity();
            return TeaModel.build(map, self);
        }

        public UpdateServiceRequestCommodity setComponentsMappings(java.util.List<UpdateServiceRequestCommodityComponentsMappings> componentsMappings) {
            this.componentsMappings = componentsMappings;
            return this;
        }
        public java.util.List<UpdateServiceRequestCommodityComponentsMappings> getComponentsMappings() {
            return this.componentsMappings;
        }

        public UpdateServiceRequestCommodity setMeteringEntityExtraInfos(java.util.List<UpdateServiceRequestCommodityMeteringEntityExtraInfos> meteringEntityExtraInfos) {
            this.meteringEntityExtraInfos = meteringEntityExtraInfos;
            return this;
        }
        public java.util.List<UpdateServiceRequestCommodityMeteringEntityExtraInfos> getMeteringEntityExtraInfos() {
            return this.meteringEntityExtraInfos;
        }

        public UpdateServiceRequestCommodity setMeteringEntityMappings(java.util.List<UpdateServiceRequestCommodityMeteringEntityMappings> meteringEntityMappings) {
            this.meteringEntityMappings = meteringEntityMappings;
            return this;
        }
        public java.util.List<UpdateServiceRequestCommodityMeteringEntityMappings> getMeteringEntityMappings() {
            return this.meteringEntityMappings;
        }

        public UpdateServiceRequestCommodity setSaasBoostConfig(String saasBoostConfig) {
            this.saasBoostConfig = saasBoostConfig;
            return this;
        }
        public String getSaasBoostConfig() {
            return this.saasBoostConfig;
        }

        public UpdateServiceRequestCommodity setSpecificationMappings(java.util.List<UpdateServiceRequestCommoditySpecificationMappings> specificationMappings) {
            this.specificationMappings = specificationMappings;
            return this;
        }
        public java.util.List<UpdateServiceRequestCommoditySpecificationMappings> getSpecificationMappings() {
            return this.specificationMappings;
        }

    }

    public static class UpdateServiceRequestServiceInfoAgreements extends TeaModel {
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

        public static UpdateServiceRequestServiceInfoAgreements build(java.util.Map<String, ?> map) throws Exception {
            UpdateServiceRequestServiceInfoAgreements self = new UpdateServiceRequestServiceInfoAgreements();
            return TeaModel.build(map, self);
        }

        public UpdateServiceRequestServiceInfoAgreements setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateServiceRequestServiceInfoAgreements setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class UpdateServiceRequestServiceInfo extends TeaModel {
        /**
         * <p>Protocol document information about the service.</p>
         */
        @NameInMap("Agreements")
        public java.util.List<UpdateServiceRequestServiceInfoAgreements> agreements;

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
         * 
         * <strong>example:</strong>
         * <p>kodbox-fc</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The description of the service.</p>
         * 
         * <strong>example:</strong>
         * <p>B是A公司自主设计并研发的开源分布式的关系型数据库</p>
         */
        @NameInMap("ShortDescription")
        public String shortDescription;

        public static UpdateServiceRequestServiceInfo build(java.util.Map<String, ?> map) throws Exception {
            UpdateServiceRequestServiceInfo self = new UpdateServiceRequestServiceInfo();
            return TeaModel.build(map, self);
        }

        public UpdateServiceRequestServiceInfo setAgreements(java.util.List<UpdateServiceRequestServiceInfoAgreements> agreements) {
            this.agreements = agreements;
            return this;
        }
        public java.util.List<UpdateServiceRequestServiceInfoAgreements> getAgreements() {
            return this.agreements;
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

        public UpdateServiceRequestServiceInfo setLongDescriptionUrl(String longDescriptionUrl) {
            this.longDescriptionUrl = longDescriptionUrl;
            return this;
        }
        public String getLongDescriptionUrl() {
            return this.longDescriptionUrl;
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

    public static class UpdateServiceRequestUpdateOption extends TeaModel {
        /**
         * <p>The options for update the service. Valid values:</p>
         * <ul>
         * <li>CODE</li>
         * <li>PARAMETERS</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PARAMETERS</p>
         */
        @NameInMap("UpdateFrom")
        public String updateFrom;

        public static UpdateServiceRequestUpdateOption build(java.util.Map<String, ?> map) throws Exception {
            UpdateServiceRequestUpdateOption self = new UpdateServiceRequestUpdateOption();
            return TeaModel.build(map, self);
        }

        public UpdateServiceRequestUpdateOption setUpdateFrom(String updateFrom) {
            this.updateFrom = updateFrom;
            return this;
        }
        public String getUpdateFrom() {
            return this.updateFrom;
        }

    }

}
