// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenestsupplier20210521.models;

import com.aliyun.tea.*;

public class UpdateServiceRequest extends TeaModel {
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
    public UpdateServiceRequestCommodity commodity;

    /**
     * <p>Compliance check metadata.</p>
     */
    @NameInMap("ComplianceMetadata")
    public UpdateServiceRequestComplianceMetadata complianceMetadata;

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

    /**
     * <p>Specifies whether to perform only a dry run for the request to check information such as the permissions and instance status. Valid values:</p>
     * <ul>
     * <li>true: performs a dry run for the request, but does not update a service.</li>
     * <li>false: performs a dry run for the request, and update a service if the request passes the dry run.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
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
    public java.util.List<UpdateServiceRequestServiceInfo> serviceInfo;

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
    public UpdateServiceRequestUpdateOption updateOption;

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

    public UpdateServiceRequest setComplianceMetadata(UpdateServiceRequestComplianceMetadata complianceMetadata) {
        this.complianceMetadata = complianceMetadata;
        return this;
    }
    public UpdateServiceRequestComplianceMetadata getComplianceMetadata() {
        return this.complianceMetadata;
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

    public UpdateServiceRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
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
        /**
         * <p>The language of the service. Valid values:</p>
         * <ul>
         * <li>zh-CN: Chinese</li>
         * <li>en-US: English</li>
         * </ul>
         */
        @NameInMap("Mappings")
        public java.util.Map<String, String> mappings;

        /**
         * <p>{ &quot;Logstores&quot;: [ { &quot;LogstoreName&quot;: &quot;access-log&quot;, &quot;LogPath&quot;: &quot;/home/admin/app/logs&quot;, # This parameter is not required for containers. Configure the parameter in the YAML file. &quot;FilePattern&quot;: &quot;access.log\*&quot; # This parameter is not required for containers. Configure the parameter in the YAML file. } ] }</p>
         * 
         * <strong>example:</strong>
         * <p>此参数不对外开放</p>
         */
        @NameInMap("TemplateName")
        public String templateName;

        public static UpdateServiceRequestCommodityComponentsMappings build(java.util.Map<String, ?> map) throws Exception {
            UpdateServiceRequestCommodityComponentsMappings self = new UpdateServiceRequestCommodityComponentsMappings();
            return TeaModel.build(map, self);
        }

        public UpdateServiceRequestCommodityComponentsMappings setMappings(java.util.Map<String, String> mappings) {
            this.mappings = mappings;
            return this;
        }
        public java.util.Map<String, String> getMappings() {
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
        /**
         * <p>The description of the service.</p>
         * 
         * <strong>example:</strong>
         * <p>cmgj0006xxxx-Memory-1</p>
         */
        @NameInMap("EntityId")
        public String entityId;

        /**
         * <p>Metering Item Configuration Information (Cloud Marketplace - Pay-As-You-Go Use)</p>
         * 
         * <strong>example:</strong>
         * <p>VirtualCpu/ecs.InstanceType</p>
         */
        @NameInMap("MetricName")
        public String metricName;

        /**
         * <p>The service details.</p>
         * 
         * <strong>example:</strong>
         * <p>avg_over_time(sum(rate(container_cpu_usage_seconds_total{namespace=~&quot;ALIYUN::StackName&quot;}[2m]))[1h:10s])</p>
         */
        @NameInMap("Promql")
        public String promql;

        /**
         * <p>Product Specifications and Template/specification mapping Relationships (Cloud Marketplace - Pay-As-You-Go Use)</p>
         * 
         * <strong>example:</strong>
         * <p>Custom</p>
         */
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
        /**
         * <p>计量项ID</p>
         */
        @NameInMap("EntityIds")
        public java.util.List<String> entityIds;

        /**
         * <p>套餐名称</p>
         * 
         * <strong>example:</strong>
         * <p>This parameter is not publicly accessible.</p>
         */
        @NameInMap("SpecificationName")
        public String specificationName;

        /**
         * <p>模板名称</p>
         * 
         * <strong>example:</strong>
         * <p>The service ID.</p>
         */
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
        /**
         * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>yuncode5767800001</p>
         */
        @NameInMap("SpecificationCode")
        public String specificationCode;

        /**
         * <p>套餐名称</p>
         * 
         * <strong>example:</strong>
         * <p>Type, value：</p>
         * <ul>
         * <li><strong>Custom</strong></li>
         * <li><strong>ComputeNestBill</strong></li>
         * <li><strong>ComputeNestPrometheus</strong></li>
         * <li><strong>ComputeNestTime</strong></li>
         * </ul>
         */
        @NameInMap("SpecificationName")
        public String specificationName;

        /**
         * <p>模板名称</p>
         * 
         * <strong>example:</strong>
         * <p>Product Specifications and Template/specification mapping Relationships (Cloud Marketplace - Subscription/Permanent Use)</p>
         */
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
        /**
         * <p>The ID of the entity.</p>
         */
        @NameInMap("ComponentsMappings")
        public java.util.List<UpdateServiceRequestCommodityComponentsMappings> componentsMappings;

        /**
         * <p>This parameter is not publicly accessible.</p>
         */
        @NameInMap("MeteringEntityExtraInfos")
        public java.util.List<UpdateServiceRequestCommodityMeteringEntityExtraInfos> meteringEntityExtraInfos;

        /**
         * <p>The template name.</p>
         */
        @NameInMap("MeteringEntityMappings")
        public java.util.List<UpdateServiceRequestCommodityMeteringEntityMappings> meteringEntityMappings;

        /**
         * <p>SaaS Boost配置信息</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("SaasBoostConfig")
        public String saasBoostConfig;

        /**
         * <p>avg_over_time(sum(rate(container_cpu_usage_seconds_total{namespace=~&quot;ALIYUN::StackName&quot;}[2m]))[1h:10s])</p>
         */
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

    public static class UpdateServiceRequestComplianceMetadata extends TeaModel {
        /**
         * <p>The compliance package is selected.</p>
         */
        @NameInMap("CompliancePacks")
        public java.util.List<String> compliancePacks;

        public static UpdateServiceRequestComplianceMetadata build(java.util.Map<String, ?> map) throws Exception {
            UpdateServiceRequestComplianceMetadata self = new UpdateServiceRequestComplianceMetadata();
            return TeaModel.build(map, self);
        }

        public UpdateServiceRequestComplianceMetadata setCompliancePacks(java.util.List<String> compliancePacks) {
            this.compliancePacks = compliancePacks;
            return this;
        }
        public java.util.List<String> getCompliancePacks() {
            return this.compliancePacks;
        }

    }

    public static class UpdateServiceRequestServiceInfoAgreements extends TeaModel {
        @NameInMap("Name")
        public String name;

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

    public static class UpdateServiceRequestServiceInfoSoftwares extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("Version")
        public String version;

        public static UpdateServiceRequestServiceInfoSoftwares build(java.util.Map<String, ?> map) throws Exception {
            UpdateServiceRequestServiceInfoSoftwares self = new UpdateServiceRequestServiceInfoSoftwares();
            return TeaModel.build(map, self);
        }

        public UpdateServiceRequestServiceInfoSoftwares setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateServiceRequestServiceInfoSoftwares setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class UpdateServiceRequestServiceInfo extends TeaModel {
        @NameInMap("Agreements")
        public java.util.List<UpdateServiceRequestServiceInfoAgreements> agreements;

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
        public java.util.List<UpdateServiceRequestServiceInfoSoftwares> softwares;

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

        public UpdateServiceRequestServiceInfo setSoftwares(java.util.List<UpdateServiceRequestServiceInfoSoftwares> softwares) {
            this.softwares = softwares;
            return this;
        }
        public java.util.List<UpdateServiceRequestServiceInfoSoftwares> getSoftwares() {
            return this.softwares;
        }

    }

    public static class UpdateServiceRequestUpdateOption extends TeaModel {
        @NameInMap("UpdateArtifact")
        public Boolean updateArtifact;

        @NameInMap("UpdateFrom")
        public String updateFrom;

        public static UpdateServiceRequestUpdateOption build(java.util.Map<String, ?> map) throws Exception {
            UpdateServiceRequestUpdateOption self = new UpdateServiceRequestUpdateOption();
            return TeaModel.build(map, self);
        }

        public UpdateServiceRequestUpdateOption setUpdateArtifact(Boolean updateArtifact) {
            this.updateArtifact = updateArtifact;
            return this;
        }
        public Boolean getUpdateArtifact() {
            return this.updateArtifact;
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
