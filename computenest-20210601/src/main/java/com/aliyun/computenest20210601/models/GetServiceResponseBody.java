// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenest20210601.models;

import com.aliyun.tea.*;

public class GetServiceResponseBody extends TeaModel {
    /**
     * <p>The alert configurations of the service.</p>
     * <blockquote>
     * <p> This parameter takes effect only when you specify an alert policy for <strong>PolicyNames</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>{ &quot;TemplateUrl&quot;: &quot;<a href="http://template.file.url">http://template.file.url</a>&quot;, &quot;ApplicationGroups&quot;: [ { &quot;Name&quot;: &quot;applicationGroup1&quot;, &quot;TemplateUrl&quot;: &quot;url1&quot; }, { &quot;Name&quot;: &quot;applicationGroup2&quot;, &quot;TemplateUrl&quot;: &quot;url2&quot; } ] }</p>
     */
    @NameInMap("AlarmMetadata")
    public String alarmMetadata;

    /**
     * <p>The categories of the Flow.</p>
     * 
     * <strong>example:</strong>
     * <p>AI</p>
     */
    @NameInMap("Categories")
    public String categories;

    /**
     * <p>The information about the order placed in Alibaba Cloud Marketplace.</p>
     */
    @NameInMap("Commodity")
    public GetServiceResponseBodyCommodity commodity;

    /**
     * <p>Service deployment approach, Valid values：</p>
     * <ul>
     * <li>NoWhere</li>
     * <li>Marketplace</li>
     * <li>ComputeNest</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Marketplace</p>
     */
    @NameInMap("DeployFrom")
    public String deployFrom;

    /**
     * <p>The storage configurations of the service. The format in which the deployment information of a service is stored varies based on the deployment type of the service. In this case, the deployment information is stored in the JSON string format.</p>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;TemplateUrl\&quot;: \&quot;<a href="http://tidbRosFile%5C%5C%22%7D">http://tidbRosFile\\&quot;}</a></p>
     */
    @NameInMap("DeployMetadata")
    public String deployMetadata;

    /**
     * <p>The deployment type of the service. Valid values:</p>
     * <ul>
     * <li>ros: The service is deployed by using Resource Orchestration Service (ROS).</li>
     * <li>terraform: The service is deployed by using Terraform.</li>
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
     * <p>Information about the ram role created in the service template.</p>
     */
    @NameInMap("InstanceRoleInfos")
    public java.util.List<GetServiceResponseBodyInstanceRoleInfos> instanceRoleInfos;

    /**
     * <p>Indicates whether the hosted O\&amp;M feature is enabled for the service. Default value: false. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * <blockquote>
     * <p> This parameter is returned if you set <strong>ServiceType</strong> to <strong>private</strong>.</p>
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
     * <p>{\&quot;PayType\&quot;:\&quot;CustomFixTime\&quot;,\&quot;DefaultLicenseDays\&quot;:7,\&quot;CustomMetadata\&quot;:[{\&quot;TemplateName\&quot;:\&quot;ECS\&quot;,\&quot;SpecificationName\&quot;:\&quot;bandwith-0\&quot;,\&quot;CustomData\&quot;:\&quot;1\&quot;}]}</p>
     */
    @NameInMap("LicenseMetadata")
    public String licenseMetadata;

    /**
     * <p>The logging configurations.</p>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;Logstores\&quot;:[]}</p>
     */
    @NameInMap("LogMetadata")
    public String logMetadata;

    /**
     * <p>The operation metadata.</p>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;PrometheusConfigMap\&quot;:{\&quot;New_Vpc_Ack_And_Jumpserver\&quot;:{}}}</p>
     */
    @NameInMap("OperationMetadata")
    public String operationMetadata;

    /**
     * <p>The permissions on the service. Valid values:</p>
     * <ul>
     * <li>Deployable: Permissions to deploy the service.</li>
     * <li>Accessible: Permissions to access the service.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Deployable</p>
     */
    @NameInMap("Permission")
    public String permission;

    /**
     * <p>The policy name. The name can be up to 128 characters in length. Separate multiple names with commas (,). Only hosted O\&amp;M policies are supported.</p>
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
     * <p>Service document information.</p>
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
     * <p>The information about the service.</p>
     */
    @NameInMap("ServiceInfos")
    public java.util.List<GetServiceResponseBodyServiceInfos> serviceInfos;

    /**
     * <p>The URL of the service page.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://example1.com">http://example1.com</a></p>
     */
    @NameInMap("ServiceProductUrl")
    public String serviceProductUrl;

    /**
     * <p>The type of the service. Valid values:</p>
     * <ul>
     * <li>private: The service is a private service and is deployed within the account of a customer.</li>
     * <li>managed: The service is a fully managed service and is deployed within the account of a service provider.</li>
     * <li>operation: The service is a hosted O&amp;M service.</li>
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
     * <p>The deploy status of the service. Valid values:</p>
     * <ul>
     * <li>Draft</li>
     * <li>Beta</li>
     * <li>Submitted</li>
     * <li>Approved</li>
     * <li>Launching</li>
     * <li>Online</li>
     * <li>Offline</li>
     * <li>Creating</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Online</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The description of service provider.</p>
     * 
     * <strong>example:</strong>
     * <p>Computing Nest Community service</p>
     */
    @NameInMap("SupplierDesc")
    public String supplierDesc;

    /**
     * <p>The Logo of service provider.</p>
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
     * <p>Alibaba Cloud</p>
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
     * <p>Contact information of the service provider</p>
     */
    @NameInMap("SupportContacts")
    public java.util.List<GetServiceResponseBodySupportContacts> supportContacts;

    /**
     * <p>The tags.</p>
     */
    @NameInMap("Tags")
    public java.util.List<GetServiceResponseBodyTags> tags;

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
     * <p>The trial policy. Valid values:</p>
     * <ul>
     * <li>Trial: Trials are supported.</li>
     * <li>NotTrial: Trials are not supported.</li>
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
         * <p>Template one.</p>
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
         * <p>The mapping information about the billing items.</p>
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
         * <p>The specification code of the service in Alibaba Cloud Marketplace.</p>
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
         * <p>Package one.</p>
         */
        @NameInMap("SpecificationName")
        public String specificationName;

        /**
         * <p>The template name.</p>
         * 
         * <strong>example:</strong>
         * <p>Template one.</p>
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
         * <p>The mappings between the service specifications and the template or package.</p>
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
         * <p>The subscription duration. Unit: week or year.</p>
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
         * <p>The billing method of the service. Valid values:</p>
         * <ul>
         * <li><strong>PREPAY</strong> (default): subscription.</li>
         * <li><strong>POSTPAY</strong>: pay-as-you-go.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>POSTPAY</p>
         */
        @NameInMap("ChargeType")
        public String chargeType;

        /**
         * <p>The commodity code of the service in Alibaba Cloud Marketplace.</p>
         * 
         * <strong>example:</strong>
         * <p>cmjj00****</p>
         */
        @NameInMap("CommodityCode")
        public String commodityCode;

        /**
         * <p>The configuration metadata related to Lingxiao.</p>
         */
        @NameInMap("CssMetadata")
        public GetServiceResponseBodyCommodityCssMetadata cssMetadata;

        /**
         * <p>The deploy page.</p>
         * 
         * <strong>example:</strong>
         * <p>Order： Order page
         * Detail： Detail page</p>
         */
        @NameInMap("DeployPage")
        public String deployPage;

        /**
         * <p>The metadata of Alibaba Cloud Marketplace.</p>
         */
        @NameInMap("MarketplaceMetadata")
        public GetServiceResponseBodyCommodityMarketplaceMetadata marketplaceMetadata;

        /**
         * <p>The order time.</p>
         */
        @NameInMap("OrderTime")
        public java.util.Map<String, java.util.List<String>> orderTime;

        /**
         * <p>The configuration metadata related to Saas Boost.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *     &quot;Enabled&quot;:false    &quot;PublicAccessUrl&quot;:&quot;<a href="https://example.com">https://example.com</a>&quot;
         * }</p>
         */
        @NameInMap("SaasBoostMetadata")
        public String saasBoostMetadata;

        /**
         * <p>The specification details of the service in Alibaba Cloud Marketplace.</p>
         */
        @NameInMap("Specifications")
        public java.util.List<GetServiceResponseBodyCommoditySpecifications> specifications;

        /**
         * <p>The service type. Valid values:</p>
         * <ul>
         * <li>marketplace: Alibaba Cloud Marketplace.</li>
         * <li>Css: Lingxiao.</li>
         * </ul>
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

    public static class GetServiceResponseBodyInstanceRoleInfos extends TeaModel {
        /**
         * <p>The content of the policy.</p>
         * 
         * <strong>example:</strong>
         * <p>{\n  \&quot;Version\&quot;: \&quot;1\&quot;,\n  \&quot;Statement\&quot;: [\n    {\n      \&quot;Effect\&quot;: \&quot;Allow\&quot;,\n      \&quot;Action\&quot;: \&quot;<em>\&quot;,\n      \&quot;Principal\&quot;: \&quot;</em>\&quot;,\n      \&quot;Resource\&quot;: \&quot;*\&quot;\n    }\n  ]\n}</p>
         */
        @NameInMap("PolicyDocument")
        public String policyDocument;

        /**
         * <p>The information of the RAM entity.</p>
         */
        @NameInMap("Principals")
        public java.util.List<String> principals;

        /**
         * <p>The ram role name.</p>
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
         * <p>Template one.</p>
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
         * <p>The URL that is used to access the document.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://help.aliyun.com/zh/compute-nest/use-cases/deploy-an-sd-painting-service-instance?spm=a2c4g.11186623.0.i2">https://help.aliyun.com/zh/compute-nest/use-cases/deploy-an-sd-painting-service-instance?spm=a2c4g.11186623.0.i2</a></p>
         */
        @NameInMap("DocumentUrl")
        public String documentUrl;

        /**
         * <p>The language that you use for the query. Valid values: zh-CN and en-US.</p>
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
         * <p>Template one.</p>
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
         * <p>The name of the Software.</p>
         * 
         * <strong>example:</strong>
         * <p>wordpress</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The version of the software.</p>
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
         * <p>The agreement information about the service.</p>
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
         * <p>The service name.</p>
         * 
         * <strong>example:</strong>
         * <p>Service document information.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The description of the service.</p>
         * 
         * <strong>example:</strong>
         * <p>Docker Community Edition (CE) is a free version of the Docker project, aimed at developers, enthusiasts, and individuals and organizations who want to use container technology.</p>
         */
        @NameInMap("ShortDescription")
        public String shortDescription;

        /**
         * <p>The list of the software in the service.</p>
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

    public static class GetServiceResponseBodySupportContacts extends TeaModel {
        /**
         * <p>The type of contact information.</p>
         * 
         * <strong>example:</strong>
         * <p>Email</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The value of contact information.</p>
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
