// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenest20210601.models;

import com.aliyun.tea.*;

public class GetServiceResponseBody extends TeaModel {
    /**
     * <p>The alert configuration of the service.</p>
     * <blockquote>
     * <p>This configuration takes effect only if you configure an alert policy in <strong>PolicyNames</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>{ &quot;TemplateUrl&quot;: &quot;<a href="http://template.file.url">http://template.file.url</a>&quot;, // Application group level alarm metadata &quot;ApplicationGroups&quot;: [ { &quot;Name&quot;: &quot;applicationGroup1&quot;, &quot;TemplateUrl&quot;: &quot;url1&quot; }, { &quot;Name&quot;: &quot;applicationGroup2&quot;, &quot;TemplateUrl&quot;: &quot;url2&quot; } ] }</p>
     */
    @NameInMap("AlarmMetadata")
    public String alarmMetadata;

    /**
     * <p>The service category name.</p>
     * 
     * <strong>example:</strong>
     * <p>AI</p>
     */
    @NameInMap("Categories")
    public String categories;

    /**
     * <p>The commodity specifications.</p>
     */
    @NameInMap("Commodity")
    public GetServiceResponseBodyCommodity commodity;

    /**
     * <p>The compliance package metadata.</p>
     */
    @NameInMap("ComplianceMetadata")
    public GetServiceResponseBodyComplianceMetadata complianceMetadata;

    /**
     * <p>The deployment channel. Valid values:</p>
     * <ul>
     * <li><p>NoWhere: The service has no deployment channel.</p>
     * </li>
     * <li><p>Marketplace: The service is deployed from Alibaba Cloud Marketplace.</p>
     * </li>
     * <li><p>ComputeNest: The service is deployed from Compute Nest.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Marketplace</p>
     */
    @NameInMap("DeployFrom")
    public String deployFrom;

    /**
     * <p>The deployment configuration of the service. The configuration is stored as a JSON string. The data format of the string varies based on the deployment type.</p>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;TemplateUrl\&quot;: \&quot;<a href="http://tidbRosFile%5C%5C%22%7D">http://tidbRosFile\\&quot;}</a></p>
     */
    @NameInMap("DeployMetadata")
    public String deployMetadata;

    /**
     * <p>The deployment type. Valid values:</p>
     * <ul>
     * <li><p>ros: The service is deployed using ROS.</p>
     * </li>
     * <li><p>terraform: The service is deployed using Terraform.</p>
     * </li>
     * <li><p>spi: The service is deployed by calling a Service Provider Interface (SPI).</p>
     * </li>
     * <li><p>operation: The service is an Alibaba Cloud Managed Services deployment.</p>
     * </li>
     * <li><p>container: The service is deployed using a container.</p>
     * </li>
     * <li><p>pkg: The service is a package service.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ros</p>
     */
    @NameInMap("DeployType")
    public String deployType;

    /**
     * <p>The duration of the Alibaba Cloud Managed Services. Unit: seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>259200</p>
     */
    @NameInMap("Duration")
    public Long duration;

    /**
     * <p>The information about the roles that are created in the service template.</p>
     */
    @NameInMap("InstanceRoleInfos")
    public java.util.List<GetServiceResponseBodyInstanceRoleInfos> instanceRoleInfos;

    /**
     * <p>Specifies whether to enable Alibaba Cloud Managed Services. Default value: false. Valid values:</p>
     * <ul>
     * <li><p>true: enabled.</p>
     * </li>
     * <li><p>false: disabled.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>This parameter is required when <strong>ServiceType</strong> is set to <strong>private</strong>.</p>
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
     * <p>{\&quot;PayType\&quot;:\&quot;CustomFixTime\&quot;,\&quot;DefaultLicenseDays\&quot;:7,\&quot;CustomMetadata\&quot;:[{\&quot;TemplateName\&quot;:\&quot; template1\&quot;,\&quot;SpecificationName\&quot;:\&quot;bandwith-0\&quot;,\&quot;CustomData\&quot;:\&quot;1\&quot;}]}</p>
     */
    @NameInMap("LicenseMetadata")
    public String licenseMetadata;

    /**
     * <p>The application log configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;Logstores\&quot;:[]}</p>
     */
    @NameInMap("LogMetadata")
    public String logMetadata;

    /**
     * <p>The O\&amp;M configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;PrometheusConfigMap\&quot;:{\&quot;New_Vpc_Ack_And_Jumpserver\&quot;:{}}}</p>
     */
    @NameInMap("OperationMetadata")
    public String operationMetadata;

    /**
     * <p>The permission type. Valid values:</p>
     * <ul>
     * <li><p>Deployable: The service is deployable.</p>
     * </li>
     * <li><p>Accessible: The service is accessible.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Deployable</p>
     */
    @NameInMap("Permission")
    public String permission;

    /**
     * <p>The policy names. A single policy name can be up to 128 characters in length. Separate multiple names with commas (,). Only policies related to Alibaba Cloud Managed Services are supported.</p>
     * 
     * <strong>example:</strong>
     * <p>policyName1, policyName2</p>
     */
    @NameInMap("PolicyNames")
    public String policyNames;

    /**
     * <p>The time when the service was published.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-05-21T00:00:00Z</p>
     */
    @NameInMap("PublishTime")
    public String publishTime;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>06BF8F22-02DC-4750-83DF-3FFC11C065EA</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The service documents.</p>
     */
    @NameInMap("ServiceDocumentInfos")
    public java.util.List<GetServiceResponseBodyServiceDocumentInfos> serviceDocumentInfos;

    /**
     * <p>The service ID.</p>
     * 
     * <strong>example:</strong>
     * <p>service-0e6fca6a51a544xxxxxx</p>
     */
    @NameInMap("ServiceId")
    public String serviceId;

    /**
     * <p>The service information.</p>
     */
    @NameInMap("ServiceInfos")
    public java.util.List<GetServiceResponseBodyServiceInfos> serviceInfos;

    /**
     * <p>The multilingual configurations of the service.</p>
     */
    @NameInMap("ServiceLocaleConfigs")
    public java.util.List<GetServiceResponseBodyServiceLocaleConfigs> serviceLocaleConfigs;

    /**
     * <p>The URL of the product page.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://example1.com">http://example1.com</a></p>
     */
    @NameInMap("ServiceProductUrl")
    public String serviceProductUrl;

    /**
     * <p>The service type. Valid values:</p>
     * <ul>
     * <li><p>private: The service is deployed in the user\&quot;s account.</p>
     * </li>
     * <li><p>managed: The service is hosted in the service provider\&quot;s account.</p>
     * </li>
     * <li><p>operation: The service is an Alibaba Cloud Managed Service.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>private</p>
     */
    @NameInMap("ServiceType")
    public String serviceType;

    /**
     * <p>The share type. Valid values:</p>
     * <ul>
     * <li><p>Public: The service is public. Formal and trial deployments are not restricted.</p>
     * </li>
     * <li><p>Restricted: The service is restricted. Formal and trial deployments are restricted.</p>
     * </li>
     * <li><p>OnlyFormalRestricted: Only formal deployments are restricted.</p>
     * </li>
     * <li><p>OnlyTrialRestricted: Only trial deployments are restricted.</p>
     * </li>
     * <li><p>Hidden: The service is hidden, is not visible, and you cannot request permissions for deployment.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Public</p>
     */
    @NameInMap("ShareType")
    public String shareType;

    /**
     * <p>The status of the service. Valid values:</p>
     * <ul>
     * <li><p>Draft: The service is in the draft state.</p>
     * </li>
     * <li><p>Beta: The service is in a pre-release state. The service cannot be modified but can be shared with other users.</p>
     * </li>
     * <li><p>Submitted: The service is submitted for approval. The service cannot be modified.</p>
     * </li>
     * <li><p>Approved: The service is approved. The service cannot be modified but can be published.</p>
     * </li>
     * <li><p>Launching: The service is being published.</p>
     * </li>
     * <li><p>Online: The service is published.</p>
     * </li>
     * <li><p>Offline: The service is unpublished.</p>
     * </li>
     * <li><p>Creating: The service is being created.</p>
     * </li>
     * <li><p>CreateFailed: The service failed to be created.</p>
     * </li>
     * <li><p>Updating: The service is being updated.</p>
     * </li>
     * <li><p>UpdateFailed: The service failed to be updated.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Online</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The description of the service provider.</p>
     * 
     * <strong>example:</strong>
     * <p>Alibaba Cloud Compute Nest team</p>
     */
    @NameInMap("SupplierDesc")
    public String supplierDesc;

    /**
     * <p>The icon of the service provider.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://service-info-public.oss-cn-hangzhou.aliyuncs.com/xxx/service-image/xxx.png">https://service-info-public.oss-cn-hangzhou.aliyuncs.com/xxx/service-image/xxx.png</a></p>
     */
    @NameInMap("SupplierLogo")
    public String supplierLogo;

    /**
     * <p>The name of the service provider.</p>
     * 
     * <strong>example:</strong>
     * <p>Company A</p>
     */
    @NameInMap("SupplierName")
    public String supplierName;

    /**
     * <p>The Alibaba Cloud account ID of the service provider.</p>
     * 
     * <strong>example:</strong>
     * <p>158927391332*****</p>
     */
    @NameInMap("SupplierUid")
    public Long supplierUid;

    /**
     * <p>The URL of the service provider.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://example.com">http://example.com</a></p>
     */
    @NameInMap("SupplierUrl")
    public String supplierUrl;

    /**
     * <p>The contact information of the service provider.</p>
     */
    @NameInMap("SupportContacts")
    public java.util.List<GetServiceResponseBodySupportContacts> supportContacts;

    /**
     * <p>The service tags.</p>
     */
    @NameInMap("Tags")
    public java.util.List<GetServiceResponseBodyTags> tags;

    /**
     * <p>The tenant type. Valid values:</p>
     * <ul>
     * <li><p>SingleTenant: The service is a single-tenant service.</p>
     * </li>
     * <li><p>MultiTenant: The service is a multitenancy service.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>SingleTenant</p>
     */
    @NameInMap("TenantType")
    public String tenantType;

    /**
     * <p>The trial duration in days. The maximum trial duration is 30 days.</p>
     * 
     * <strong>example:</strong>
     * <p>7</p>
     */
    @NameInMap("TrialDuration")
    public Long trialDuration;

    /**
     * <p>The trial type. Valid values:</p>
     * <ul>
     * <li><p>Trial: The service supports trial.</p>
     * </li>
     * <li><p>NotTrial: The service does not support trial.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Trial</p>
     */
    @NameInMap("TrialType")
    public String trialType;

    /**
     * <p>The service version.</p>
     * 
     * <strong>example:</strong>
     * <p>1.0</p>
     */
    @NameInMap("Version")
    public String version;

    /**
     * <p>The version name.</p>
     * 
     * <strong>example:</strong>
     * <p>v1</p>
     */
    @NameInMap("VersionName")
    public String versionName;

    public static GetServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetServiceResponseBody self = new GetServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public GetServiceResponseBody setAlarmMetadata(String alarmMetadata) {
        this.alarmMetadata = alarmMetadata;
        return this;
    }
    public String getAlarmMetadata() {
        return this.alarmMetadata;
    }

    public GetServiceResponseBody setCategories(String categories) {
        this.categories = categories;
        return this;
    }
    public String getCategories() {
        return this.categories;
    }

    public GetServiceResponseBody setCommodity(GetServiceResponseBodyCommodity commodity) {
        this.commodity = commodity;
        return this;
    }
    public GetServiceResponseBodyCommodity getCommodity() {
        return this.commodity;
    }

    public GetServiceResponseBody setComplianceMetadata(GetServiceResponseBodyComplianceMetadata complianceMetadata) {
        this.complianceMetadata = complianceMetadata;
        return this;
    }
    public GetServiceResponseBodyComplianceMetadata getComplianceMetadata() {
        return this.complianceMetadata;
    }

    public GetServiceResponseBody setDeployFrom(String deployFrom) {
        this.deployFrom = deployFrom;
        return this;
    }
    public String getDeployFrom() {
        return this.deployFrom;
    }

    public GetServiceResponseBody setDeployMetadata(String deployMetadata) {
        this.deployMetadata = deployMetadata;
        return this;
    }
    public String getDeployMetadata() {
        return this.deployMetadata;
    }

    public GetServiceResponseBody setDeployType(String deployType) {
        this.deployType = deployType;
        return this;
    }
    public String getDeployType() {
        return this.deployType;
    }

    public GetServiceResponseBody setDuration(Long duration) {
        this.duration = duration;
        return this;
    }
    public Long getDuration() {
        return this.duration;
    }

    public GetServiceResponseBody setInstanceRoleInfos(java.util.List<GetServiceResponseBodyInstanceRoleInfos> instanceRoleInfos) {
        this.instanceRoleInfos = instanceRoleInfos;
        return this;
    }
    public java.util.List<GetServiceResponseBodyInstanceRoleInfos> getInstanceRoleInfos() {
        return this.instanceRoleInfos;
    }

    public GetServiceResponseBody setIsSupportOperated(Boolean isSupportOperated) {
        this.isSupportOperated = isSupportOperated;
        return this;
    }
    public Boolean getIsSupportOperated() {
        return this.isSupportOperated;
    }

    public GetServiceResponseBody setLicenseMetadata(String licenseMetadata) {
        this.licenseMetadata = licenseMetadata;
        return this;
    }
    public String getLicenseMetadata() {
        return this.licenseMetadata;
    }

    public GetServiceResponseBody setLogMetadata(String logMetadata) {
        this.logMetadata = logMetadata;
        return this;
    }
    public String getLogMetadata() {
        return this.logMetadata;
    }

    public GetServiceResponseBody setOperationMetadata(String operationMetadata) {
        this.operationMetadata = operationMetadata;
        return this;
    }
    public String getOperationMetadata() {
        return this.operationMetadata;
    }

    public GetServiceResponseBody setPermission(String permission) {
        this.permission = permission;
        return this;
    }
    public String getPermission() {
        return this.permission;
    }

    public GetServiceResponseBody setPolicyNames(String policyNames) {
        this.policyNames = policyNames;
        return this;
    }
    public String getPolicyNames() {
        return this.policyNames;
    }

    public GetServiceResponseBody setPublishTime(String publishTime) {
        this.publishTime = publishTime;
        return this;
    }
    public String getPublishTime() {
        return this.publishTime;
    }

    public GetServiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetServiceResponseBody setServiceDocumentInfos(java.util.List<GetServiceResponseBodyServiceDocumentInfos> serviceDocumentInfos) {
        this.serviceDocumentInfos = serviceDocumentInfos;
        return this;
    }
    public java.util.List<GetServiceResponseBodyServiceDocumentInfos> getServiceDocumentInfos() {
        return this.serviceDocumentInfos;
    }

    public GetServiceResponseBody setServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public String getServiceId() {
        return this.serviceId;
    }

    public GetServiceResponseBody setServiceInfos(java.util.List<GetServiceResponseBodyServiceInfos> serviceInfos) {
        this.serviceInfos = serviceInfos;
        return this;
    }
    public java.util.List<GetServiceResponseBodyServiceInfos> getServiceInfos() {
        return this.serviceInfos;
    }

    public GetServiceResponseBody setServiceLocaleConfigs(java.util.List<GetServiceResponseBodyServiceLocaleConfigs> serviceLocaleConfigs) {
        this.serviceLocaleConfigs = serviceLocaleConfigs;
        return this;
    }
    public java.util.List<GetServiceResponseBodyServiceLocaleConfigs> getServiceLocaleConfigs() {
        return this.serviceLocaleConfigs;
    }

    public GetServiceResponseBody setServiceProductUrl(String serviceProductUrl) {
        this.serviceProductUrl = serviceProductUrl;
        return this;
    }
    public String getServiceProductUrl() {
        return this.serviceProductUrl;
    }

    public GetServiceResponseBody setServiceType(String serviceType) {
        this.serviceType = serviceType;
        return this;
    }
    public String getServiceType() {
        return this.serviceType;
    }

    public GetServiceResponseBody setShareType(String shareType) {
        this.shareType = shareType;
        return this;
    }
    public String getShareType() {
        return this.shareType;
    }

    public GetServiceResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public GetServiceResponseBody setSupplierDesc(String supplierDesc) {
        this.supplierDesc = supplierDesc;
        return this;
    }
    public String getSupplierDesc() {
        return this.supplierDesc;
    }

    public GetServiceResponseBody setSupplierLogo(String supplierLogo) {
        this.supplierLogo = supplierLogo;
        return this;
    }
    public String getSupplierLogo() {
        return this.supplierLogo;
    }

    public GetServiceResponseBody setSupplierName(String supplierName) {
        this.supplierName = supplierName;
        return this;
    }
    public String getSupplierName() {
        return this.supplierName;
    }

    public GetServiceResponseBody setSupplierUid(Long supplierUid) {
        this.supplierUid = supplierUid;
        return this;
    }
    public Long getSupplierUid() {
        return this.supplierUid;
    }

    public GetServiceResponseBody setSupplierUrl(String supplierUrl) {
        this.supplierUrl = supplierUrl;
        return this;
    }
    public String getSupplierUrl() {
        return this.supplierUrl;
    }

    public GetServiceResponseBody setSupportContacts(java.util.List<GetServiceResponseBodySupportContacts> supportContacts) {
        this.supportContacts = supportContacts;
        return this;
    }
    public java.util.List<GetServiceResponseBodySupportContacts> getSupportContacts() {
        return this.supportContacts;
    }

    public GetServiceResponseBody setTags(java.util.List<GetServiceResponseBodyTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<GetServiceResponseBodyTags> getTags() {
        return this.tags;
    }

    public GetServiceResponseBody setTenantType(String tenantType) {
        this.tenantType = tenantType;
        return this;
    }
    public String getTenantType() {
        return this.tenantType;
    }

    public GetServiceResponseBody setTrialDuration(Long trialDuration) {
        this.trialDuration = trialDuration;
        return this;
    }
    public Long getTrialDuration() {
        return this.trialDuration;
    }

    public GetServiceResponseBody setTrialType(String trialType) {
        this.trialType = trialType;
        return this;
    }
    public String getTrialType() {
        return this.trialType;
    }

    public GetServiceResponseBody setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

    public GetServiceResponseBody setVersionName(String versionName) {
        this.versionName = versionName;
        return this;
    }
    public String getVersionName() {
        return this.versionName;
    }

    public static class GetServiceResponseBodyCommodityCssMetadataComponentsMappings extends TeaModel {
        /**
         * <p>The mappings.</p>
         */
        @NameInMap("Mappings")
        public java.util.Map<String, String> mappings;

        /**
         * <p>The template name.</p>
         * 
         * <strong>example:</strong>
         * <p>单机版</p>
         */
        @NameInMap("TemplateName")
        public String templateName;

        public static GetServiceResponseBodyCommodityCssMetadataComponentsMappings build(java.util.Map<String, ?> map) throws Exception {
            GetServiceResponseBodyCommodityCssMetadataComponentsMappings self = new GetServiceResponseBodyCommodityCssMetadataComponentsMappings();
            return TeaModel.build(map, self);
        }

        public GetServiceResponseBodyCommodityCssMetadataComponentsMappings setMappings(java.util.Map<String, String> mappings) {
            this.mappings = mappings;
            return this;
        }
        public java.util.Map<String, String> getMappings() {
            return this.mappings;
        }

        public GetServiceResponseBodyCommodityCssMetadataComponentsMappings setTemplateName(String templateName) {
            this.templateName = templateName;
            return this;
        }
        public String getTemplateName() {
            return this.templateName;
        }

    }

    public static class GetServiceResponseBodyCommodityCssMetadata extends TeaModel {
        /**
         * <p>The billing item mappings.</p>
         */
        @NameInMap("ComponentsMappings")
        public java.util.List<GetServiceResponseBodyCommodityCssMetadataComponentsMappings> componentsMappings;

        public static GetServiceResponseBodyCommodityCssMetadata build(java.util.Map<String, ?> map) throws Exception {
            GetServiceResponseBodyCommodityCssMetadata self = new GetServiceResponseBodyCommodityCssMetadata();
            return TeaModel.build(map, self);
        }

        public GetServiceResponseBodyCommodityCssMetadata setComponentsMappings(java.util.List<GetServiceResponseBodyCommodityCssMetadataComponentsMappings> componentsMappings) {
            this.componentsMappings = componentsMappings;
            return this;
        }
        public java.util.List<GetServiceResponseBodyCommodityCssMetadataComponentsMappings> getComponentsMappings() {
            return this.componentsMappings;
        }

    }

    public static class GetServiceResponseBodyCommodityMarketplaceMetadataSpecificationMappings extends TeaModel {
        /**
         * <p>The specification code of the Alibaba Cloud Marketplace commodity.</p>
         * 
         * <strong>example:</strong>
         * <p>cmjj00****</p>
         */
        @NameInMap("SpecificationCode")
        public String specificationCode;

        /**
         * <p>The package name.</p>
         * 
         * <strong>example:</strong>
         * <p>Package 1</p>
         */
        @NameInMap("SpecificationName")
        public String specificationName;

        /**
         * <p>The template name.</p>
         * 
         * <strong>example:</strong>
         * <p>Standalone edition</p>
         */
        @NameInMap("TemplateName")
        public String templateName;

        public static GetServiceResponseBodyCommodityMarketplaceMetadataSpecificationMappings build(java.util.Map<String, ?> map) throws Exception {
            GetServiceResponseBodyCommodityMarketplaceMetadataSpecificationMappings self = new GetServiceResponseBodyCommodityMarketplaceMetadataSpecificationMappings();
            return TeaModel.build(map, self);
        }

        public GetServiceResponseBodyCommodityMarketplaceMetadataSpecificationMappings setSpecificationCode(String specificationCode) {
            this.specificationCode = specificationCode;
            return this;
        }
        public String getSpecificationCode() {
            return this.specificationCode;
        }

        public GetServiceResponseBodyCommodityMarketplaceMetadataSpecificationMappings setSpecificationName(String specificationName) {
            this.specificationName = specificationName;
            return this;
        }
        public String getSpecificationName() {
            return this.specificationName;
        }

        public GetServiceResponseBodyCommodityMarketplaceMetadataSpecificationMappings setTemplateName(String templateName) {
            this.templateName = templateName;
            return this;
        }
        public String getTemplateName() {
            return this.templateName;
        }

    }

    public static class GetServiceResponseBodyCommodityMarketplaceMetadata extends TeaModel {
        /**
         * <p>The mapping between commodity specifications and templates or packages.</p>
         */
        @NameInMap("SpecificationMappings")
        public java.util.List<GetServiceResponseBodyCommodityMarketplaceMetadataSpecificationMappings> specificationMappings;

        public static GetServiceResponseBodyCommodityMarketplaceMetadata build(java.util.Map<String, ?> map) throws Exception {
            GetServiceResponseBodyCommodityMarketplaceMetadata self = new GetServiceResponseBodyCommodityMarketplaceMetadata();
            return TeaModel.build(map, self);
        }

        public GetServiceResponseBodyCommodityMarketplaceMetadata setSpecificationMappings(java.util.List<GetServiceResponseBodyCommodityMarketplaceMetadataSpecificationMappings> specificationMappings) {
            this.specificationMappings = specificationMappings;
            return this;
        }
        public java.util.List<GetServiceResponseBodyCommodityMarketplaceMetadataSpecificationMappings> getSpecificationMappings() {
            return this.specificationMappings;
        }

    }

    public static class GetServiceResponseBodyCommoditySpecifications extends TeaModel {
        /**
         * <p>The commodity code.</p>
         * 
         * <strong>example:</strong>
         * <p>cmjj00****</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>The specification name.</p>
         * 
         * <strong>example:</strong>
         * <p>specifications1</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The purchasable duration. Unit: week or year.</p>
         */
        @NameInMap("Times")
        public java.util.List<String> times;

        public static GetServiceResponseBodyCommoditySpecifications build(java.util.Map<String, ?> map) throws Exception {
            GetServiceResponseBodyCommoditySpecifications self = new GetServiceResponseBodyCommoditySpecifications();
            return TeaModel.build(map, self);
        }

        public GetServiceResponseBodyCommoditySpecifications setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public GetServiceResponseBodyCommoditySpecifications setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetServiceResponseBodyCommoditySpecifications setTimes(java.util.List<String> times) {
            this.times = times;
            return this;
        }
        public java.util.List<String> getTimes() {
            return this.times;
        }

    }

    public static class GetServiceResponseBodyCommodity extends TeaModel {
        /**
         * <p>The billing method.</p>
         * <p>Valid values:</p>
         * <p><strong>PREPAY</strong> (default): subscription.</p>
         * <p><strong>POSTPAY</strong>: pay-as-you-go.</p>
         * 
         * <strong>example:</strong>
         * <p>POSTPAY</p>
         */
        @NameInMap("ChargeType")
        public String chargeType;

        /**
         * <p>The commodity code.</p>
         * 
         * <strong>example:</strong>
         * <p>cmjj00****</p>
         */
        @NameInMap("CommodityCode")
        public String commodityCode;

        /**
         * <p>The Lingxiao configuration metadata.</p>
         */
        @NameInMap("CssMetadata")
        public GetServiceResponseBodyCommodityCssMetadata cssMetadata;

        /**
         * <p>The deployment page.</p>
         * 
         * <strong>example:</strong>
         * <p>Order: Order page
         * Detail: Details page</p>
         */
        @NameInMap("DeployPage")
        public String deployPage;

        /**
         * <p>The Alibaba Cloud Marketplace metadata.</p>
         */
        @NameInMap("MarketplaceMetadata")
        public GetServiceResponseBodyCommodityMarketplaceMetadata marketplaceMetadata;

        /**
         * <p>The order time.</p>
         */
        @NameInMap("OrderTime")
        public java.util.Map<String, java.util.List<String>> orderTime;

        /**
         * <p>The SaasBoost configuration metadata.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *     &quot;Enabled&quot;:false
         *     //Public access URL
         *     &quot;PublicAccessUrl&quot;:&quot;<a href="https://example.com">https://example.com</a>&quot;
         * }</p>
         */
        @NameInMap("SaasBoostMetadata")
        public String saasBoostMetadata;

        /**
         * <p>The Alibaba Cloud Marketplace specification details.</p>
         */
        @NameInMap("Specifications")
        public java.util.List<GetServiceResponseBodyCommoditySpecifications> specifications;

        /**
         * <p>The type.</p>
         * <p>Valid values:</p>
         * <p>Marketplace: Alibaba Cloud Marketplace.</p>
         * <p>Css: Lingxiao.</p>
         * 
         * <strong>example:</strong>
         * <p>Marketplace</p>
         */
        @NameInMap("Type")
        public String type;

        public static GetServiceResponseBodyCommodity build(java.util.Map<String, ?> map) throws Exception {
            GetServiceResponseBodyCommodity self = new GetServiceResponseBodyCommodity();
            return TeaModel.build(map, self);
        }

        public GetServiceResponseBodyCommodity setChargeType(String chargeType) {
            this.chargeType = chargeType;
            return this;
        }
        public String getChargeType() {
            return this.chargeType;
        }

        public GetServiceResponseBodyCommodity setCommodityCode(String commodityCode) {
            this.commodityCode = commodityCode;
            return this;
        }
        public String getCommodityCode() {
            return this.commodityCode;
        }

        public GetServiceResponseBodyCommodity setCssMetadata(GetServiceResponseBodyCommodityCssMetadata cssMetadata) {
            this.cssMetadata = cssMetadata;
            return this;
        }
        public GetServiceResponseBodyCommodityCssMetadata getCssMetadata() {
            return this.cssMetadata;
        }

        public GetServiceResponseBodyCommodity setDeployPage(String deployPage) {
            this.deployPage = deployPage;
            return this;
        }
        public String getDeployPage() {
            return this.deployPage;
        }

        public GetServiceResponseBodyCommodity setMarketplaceMetadata(GetServiceResponseBodyCommodityMarketplaceMetadata marketplaceMetadata) {
            this.marketplaceMetadata = marketplaceMetadata;
            return this;
        }
        public GetServiceResponseBodyCommodityMarketplaceMetadata getMarketplaceMetadata() {
            return this.marketplaceMetadata;
        }

        public GetServiceResponseBodyCommodity setOrderTime(java.util.Map<String, java.util.List<String>> orderTime) {
            this.orderTime = orderTime;
            return this;
        }
        public java.util.Map<String, java.util.List<String>> getOrderTime() {
            return this.orderTime;
        }

        public GetServiceResponseBodyCommodity setSaasBoostMetadata(String saasBoostMetadata) {
            this.saasBoostMetadata = saasBoostMetadata;
            return this;
        }
        public String getSaasBoostMetadata() {
            return this.saasBoostMetadata;
        }

        public GetServiceResponseBodyCommodity setSpecifications(java.util.List<GetServiceResponseBodyCommoditySpecifications> specifications) {
            this.specifications = specifications;
            return this;
        }
        public java.util.List<GetServiceResponseBodyCommoditySpecifications> getSpecifications() {
            return this.specifications;
        }

        public GetServiceResponseBodyCommodity setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetServiceResponseBodyComplianceMetadata extends TeaModel {
        /**
         * <p>The list of compliance packages.</p>
         */
        @NameInMap("CompliancePacks")
        public java.util.List<String> compliancePacks;

        public static GetServiceResponseBodyComplianceMetadata build(java.util.Map<String, ?> map) throws Exception {
            GetServiceResponseBodyComplianceMetadata self = new GetServiceResponseBodyComplianceMetadata();
            return TeaModel.build(map, self);
        }

        public GetServiceResponseBodyComplianceMetadata setCompliancePacks(java.util.List<String> compliancePacks) {
            this.compliancePacks = compliancePacks;
            return this;
        }
        public java.util.List<String> getCompliancePacks() {
            return this.compliancePacks;
        }

    }

    public static class GetServiceResponseBodyInstanceRoleInfos extends TeaModel {
        /**
         * <p>The content of the control policy.</p>
         * 
         * <strong>example:</strong>
         * <p>{\n  \&quot;Version\&quot;: \&quot;1\&quot;,\n  \&quot;Statement\&quot;: [\n    {\n      \&quot;Effect\&quot;: \&quot;Allow\&quot;,\n      \&quot;Action\&quot;: \&quot;<em>\&quot;,\n      \&quot;Principal\&quot;: \&quot;</em>\&quot;,\n      \&quot;Resource\&quot;: \&quot;*\&quot;\n    }\n  ]\n}</p>
         */
        @NameInMap("PolicyDocument")
        public String policyDocument;

        /**
         * <p>The information about the RAM entity.</p>
         */
        @NameInMap("Principals")
        public java.util.List<String> principals;

        /**
         * <p>The role name.</p>
         * 
         * <strong>example:</strong>
         * <p>ram-for-dts</p>
         */
        @NameInMap("RoleName")
        public String roleName;

        /**
         * <p>The template name.</p>
         * 
         * <strong>example:</strong>
         * <p>Template 1</p>
         */
        @NameInMap("TemplateName")
        public String templateName;

        public static GetServiceResponseBodyInstanceRoleInfos build(java.util.Map<String, ?> map) throws Exception {
            GetServiceResponseBodyInstanceRoleInfos self = new GetServiceResponseBodyInstanceRoleInfos();
            return TeaModel.build(map, self);
        }

        public GetServiceResponseBodyInstanceRoleInfos setPolicyDocument(String policyDocument) {
            this.policyDocument = policyDocument;
            return this;
        }
        public String getPolicyDocument() {
            return this.policyDocument;
        }

        public GetServiceResponseBodyInstanceRoleInfos setPrincipals(java.util.List<String> principals) {
            this.principals = principals;
            return this;
        }
        public java.util.List<String> getPrincipals() {
            return this.principals;
        }

        public GetServiceResponseBodyInstanceRoleInfos setRoleName(String roleName) {
            this.roleName = roleName;
            return this;
        }
        public String getRoleName() {
            return this.roleName;
        }

        public GetServiceResponseBodyInstanceRoleInfos setTemplateName(String templateName) {
            this.templateName = templateName;
            return this;
        }
        public String getTemplateName() {
            return this.templateName;
        }

    }

    public static class GetServiceResponseBodyServiceDocumentInfos extends TeaModel {
        /**
         * <p>The document URL.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://help.aliyun.com/zh/compute-nest/use-cases/deploy-an-sd-painting-service-instance?spm=a2c4g.11186623.0.i2">https://help.aliyun.com/zh/compute-nest/use-cases/deploy-an-sd-painting-service-instance?spm=a2c4g.11186623.0.i2</a></p>
         */
        @NameInMap("DocumentUrl")
        public String documentUrl;

        /**
         * <p>The language of the service document. Valid values:</p>
         * <ul>
         * <li><p>zh-CN: Chinese.</p>
         * </li>
         * <li><p>en-US: English.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh-CN</p>
         */
        @NameInMap("Locale")
        public String locale;

        /**
         * <p>The template name.</p>
         * 
         * <strong>example:</strong>
         * <p>单机版</p>
         */
        @NameInMap("TemplateName")
        public String templateName;

        public static GetServiceResponseBodyServiceDocumentInfos build(java.util.Map<String, ?> map) throws Exception {
            GetServiceResponseBodyServiceDocumentInfos self = new GetServiceResponseBodyServiceDocumentInfos();
            return TeaModel.build(map, self);
        }

        public GetServiceResponseBodyServiceDocumentInfos setDocumentUrl(String documentUrl) {
            this.documentUrl = documentUrl;
            return this;
        }
        public String getDocumentUrl() {
            return this.documentUrl;
        }

        public GetServiceResponseBodyServiceDocumentInfos setLocale(String locale) {
            this.locale = locale;
            return this;
        }
        public String getLocale() {
            return this.locale;
        }

        public GetServiceResponseBodyServiceDocumentInfos setTemplateName(String templateName) {
            this.templateName = templateName;
            return this;
        }
        public String getTemplateName() {
            return this.templateName;
        }

    }

    public static class GetServiceResponseBodyServiceInfosAgreements extends TeaModel {
        /**
         * <p>The agreement name.</p>
         * 
         * <strong>example:</strong>
         * <p>User agreement</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The agreement URL.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://url">https://url</a></p>
         */
        @NameInMap("Url")
        public String url;

        public static GetServiceResponseBodyServiceInfosAgreements build(java.util.Map<String, ?> map) throws Exception {
            GetServiceResponseBodyServiceInfosAgreements self = new GetServiceResponseBodyServiceInfosAgreements();
            return TeaModel.build(map, self);
        }

        public GetServiceResponseBodyServiceInfosAgreements setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetServiceResponseBodyServiceInfosAgreements setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class GetServiceResponseBodyServiceInfosSoftwares extends TeaModel {
        /**
         * <p>The software name.</p>
         * 
         * <strong>example:</strong>
         * <p>wordpress</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The software version.</p>
         * 
         * <strong>example:</strong>
         * <p>6.0.1</p>
         */
        @NameInMap("Version")
        public String version;

        public static GetServiceResponseBodyServiceInfosSoftwares build(java.util.Map<String, ?> map) throws Exception {
            GetServiceResponseBodyServiceInfosSoftwares self = new GetServiceResponseBodyServiceInfosSoftwares();
            return TeaModel.build(map, self);
        }

        public GetServiceResponseBodyServiceInfosSoftwares setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetServiceResponseBodyServiceInfosSoftwares setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class GetServiceResponseBodyServiceInfos extends TeaModel {
        /**
         * <p>The service agreements.</p>
         */
        @NameInMap("Agreements")
        public java.util.List<GetServiceResponseBodyServiceInfosAgreements> agreements;

        /**
         * <p>The URL of the service icon.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.com/service-image/c1c4a559-cc60-4af1-b976-98f356602462.png">https://example.com/service-image/c1c4a559-cc60-4af1-b976-98f356602462.png</a></p>
         */
        @NameInMap("Image")
        public String image;

        /**
         * <p>The language of the service configuration. Valid values:</p>
         * <ul>
         * <li><p>zh-CN: Chinese.</p>
         * </li>
         * <li><p>en-US: English.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh-CN</p>
         */
        @NameInMap("Locale")
        public String locale;

        /**
         * <p>The service name.</p>
         * 
         * <strong>example:</strong>
         * <p>Database B</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The summary of the service.</p>
         * 
         * <strong>example:</strong>
         * <p>B is an open-source distributed relational database independently designed and developed by Company A.</p>
         */
        @NameInMap("ShortDescription")
        public String shortDescription;

        /**
         * <p>The service software.</p>
         */
        @NameInMap("Softwares")
        public java.util.List<GetServiceResponseBodyServiceInfosSoftwares> softwares;

        public static GetServiceResponseBodyServiceInfos build(java.util.Map<String, ?> map) throws Exception {
            GetServiceResponseBodyServiceInfos self = new GetServiceResponseBodyServiceInfos();
            return TeaModel.build(map, self);
        }

        public GetServiceResponseBodyServiceInfos setAgreements(java.util.List<GetServiceResponseBodyServiceInfosAgreements> agreements) {
            this.agreements = agreements;
            return this;
        }
        public java.util.List<GetServiceResponseBodyServiceInfosAgreements> getAgreements() {
            return this.agreements;
        }

        public GetServiceResponseBodyServiceInfos setImage(String image) {
            this.image = image;
            return this;
        }
        public String getImage() {
            return this.image;
        }

        public GetServiceResponseBodyServiceInfos setLocale(String locale) {
            this.locale = locale;
            return this;
        }
        public String getLocale() {
            return this.locale;
        }

        public GetServiceResponseBodyServiceInfos setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetServiceResponseBodyServiceInfos setShortDescription(String shortDescription) {
            this.shortDescription = shortDescription;
            return this;
        }
        public String getShortDescription() {
            return this.shortDescription;
        }

        public GetServiceResponseBodyServiceInfos setSoftwares(java.util.List<GetServiceResponseBodyServiceInfosSoftwares> softwares) {
            this.softwares = softwares;
            return this;
        }
        public java.util.List<GetServiceResponseBodyServiceInfosSoftwares> getSoftwares() {
            return this.softwares;
        }

    }

    public static class GetServiceResponseBodyServiceLocaleConfigs extends TeaModel {
        /**
         * <p>The English value of the service information.</p>
         * 
         * <strong>example:</strong>
         * <p>Service Name</p>
         */
        @NameInMap("EnValue")
        public String enValue;

        /**
         * <p>The raw data value of the service information.</p>
         * 
         * <strong>example:</strong>
         * <p>Service Name</p>
         */
        @NameInMap("OriginalValue")
        public String originalValue;

        /**
         * <p>The Chinese value of the service information.</p>
         * 
         * <strong>example:</strong>
         * <p>服务名称</p>
         */
        @NameInMap("ZhValue")
        public String zhValue;

        public static GetServiceResponseBodyServiceLocaleConfigs build(java.util.Map<String, ?> map) throws Exception {
            GetServiceResponseBodyServiceLocaleConfigs self = new GetServiceResponseBodyServiceLocaleConfigs();
            return TeaModel.build(map, self);
        }

        public GetServiceResponseBodyServiceLocaleConfigs setEnValue(String enValue) {
            this.enValue = enValue;
            return this;
        }
        public String getEnValue() {
            return this.enValue;
        }

        public GetServiceResponseBodyServiceLocaleConfigs setOriginalValue(String originalValue) {
            this.originalValue = originalValue;
            return this;
        }
        public String getOriginalValue() {
            return this.originalValue;
        }

        public GetServiceResponseBodyServiceLocaleConfigs setZhValue(String zhValue) {
            this.zhValue = zhValue;
            return this;
        }
        public String getZhValue() {
            return this.zhValue;
        }

    }

    public static class GetServiceResponseBodySupportContacts extends TeaModel {
        /**
         * <p>The type of the contact information.</p>
         * 
         * <strong>example:</strong>
         * <p>Email</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The contact information.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="mailto:supplier@example.com">supplier@example.com</a></p>
         */
        @NameInMap("Value")
        public String value;

        public static GetServiceResponseBodySupportContacts build(java.util.Map<String, ?> map) throws Exception {
            GetServiceResponseBodySupportContacts self = new GetServiceResponseBodySupportContacts();
            return TeaModel.build(map, self);
        }

        public GetServiceResponseBodySupportContacts setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetServiceResponseBodySupportContacts setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetServiceResponseBodyTags extends TeaModel {
        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>key1</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>value1</p>
         */
        @NameInMap("Value")
        public String value;

        public static GetServiceResponseBodyTags build(java.util.Map<String, ?> map) throws Exception {
            GetServiceResponseBodyTags self = new GetServiceResponseBodyTags();
            return TeaModel.build(map, self);
        }

        public GetServiceResponseBodyTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetServiceResponseBodyTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
