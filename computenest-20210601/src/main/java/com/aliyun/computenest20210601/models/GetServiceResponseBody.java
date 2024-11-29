// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenest20210601.models;

import com.aliyun.tea.*;

public class GetServiceResponseBody extends TeaModel {
    @NameInMap("AlarmMetadata")
    public String alarmMetadata;

    @NameInMap("Categories")
    public String categories;

    @NameInMap("Commodity")
    public GetServiceResponseBodyCommodity commodity;

    @NameInMap("DeployFrom")
    public String deployFrom;

    /**
     * <strong>example:</strong>
     * <p>{\&quot;TemplateUrl\&quot;: \&quot;<a href="http://tidbRosFile%5C%5C%22%7D">http://tidbRosFile\\&quot;}</a></p>
     */
    @NameInMap("DeployMetadata")
    public String deployMetadata;

    /**
     * <strong>example:</strong>
     * <p>ros</p>
     */
    @NameInMap("DeployType")
    public String deployType;

    /**
     * <strong>example:</strong>
     * <p>259200</p>
     */
    @NameInMap("Duration")
    public Long duration;

    @NameInMap("InstanceRoleInfos")
    public java.util.List<GetServiceResponseBodyInstanceRoleInfos> instanceRoleInfos;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("IsSupportOperated")
    public Boolean isSupportOperated;

    @NameInMap("LicenseMetadata")
    public String licenseMetadata;

    @NameInMap("LogMetadata")
    public String logMetadata;

    /**
     * <strong>example:</strong>
     * <p>{\&quot;PrometheusConfigMap\&quot;:{\&quot;New_Vpc_Ack_And_Jumpserver\&quot;:{}}}</p>
     */
    @NameInMap("OperationMetadata")
    public String operationMetadata;

    /**
     * <strong>example:</strong>
     * <p>Deployable</p>
     */
    @NameInMap("Permission")
    public String permission;

    /**
     * <strong>example:</strong>
     * <p>policyName1, policyName2</p>
     */
    @NameInMap("PolicyNames")
    public String policyNames;

    /**
     * <strong>example:</strong>
     * <p>2021-05-21T00:00:00Z</p>
     */
    @NameInMap("PublishTime")
    public String publishTime;

    /**
     * <strong>example:</strong>
     * <p>06BF8F22-02DC-4750-83DF-3FFC11C065EA</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ServiceDocumentInfos")
    public java.util.List<GetServiceResponseBodyServiceDocumentInfos> serviceDocumentInfos;

    /**
     * <strong>example:</strong>
     * <p>service-0e6fca6a51a544xxxxxx</p>
     */
    @NameInMap("ServiceId")
    public String serviceId;

    @NameInMap("ServiceInfos")
    public java.util.List<GetServiceResponseBodyServiceInfos> serviceInfos;

    /**
     * <strong>example:</strong>
     * <p><a href="http://example1.com">http://example1.com</a></p>
     */
    @NameInMap("ServiceProductUrl")
    public String serviceProductUrl;

    /**
     * <strong>example:</strong>
     * <p>private</p>
     */
    @NameInMap("ServiceType")
    public String serviceType;

    /**
     * <strong>example:</strong>
     * <p>Public</p>
     */
    @NameInMap("ShareType")
    public String shareType;

    /**
     * <strong>example:</strong>
     * <p>Online</p>
     */
    @NameInMap("Status")
    public String status;

    @NameInMap("SupplierDesc")
    public String supplierDesc;

    @NameInMap("SupplierLogo")
    public String supplierLogo;

    @NameInMap("SupplierName")
    public String supplierName;

    @NameInMap("SupplierUid")
    public Long supplierUid;

    /**
     * <strong>example:</strong>
     * <p><a href="http://example.com">http://example.com</a></p>
     */
    @NameInMap("SupplierUrl")
    public String supplierUrl;

    @NameInMap("Tags")
    public java.util.List<GetServiceResponseBodyTags> tags;

    /**
     * <strong>example:</strong>
     * <p>SingleTenant</p>
     */
    @NameInMap("TenantType")
    public String tenantType;

    /**
     * <strong>example:</strong>
     * <p>7</p>
     */
    @NameInMap("TrialDuration")
    public Long trialDuration;

    /**
     * <strong>example:</strong>
     * <p>Trial</p>
     */
    @NameInMap("TrialType")
    public String trialType;

    /**
     * <strong>example:</strong>
     * <p>1.0</p>
     */
    @NameInMap("Version")
    public String version;

    /**
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
        @NameInMap("Mappings")
        public java.util.Map<String, String> mappings;

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
        @NameInMap("SpecificationCode")
        public String specificationCode;

        @NameInMap("SpecificationName")
        public String specificationName;

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
        @NameInMap("Code")
        public String code;

        @NameInMap("Name")
        public String name;

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
        @NameInMap("ChargeType")
        public String chargeType;

        @NameInMap("CommodityCode")
        public String commodityCode;

        @NameInMap("CssMetadata")
        public GetServiceResponseBodyCommodityCssMetadata cssMetadata;

        @NameInMap("DeployPage")
        public String deployPage;

        @NameInMap("MarketplaceMetadata")
        public GetServiceResponseBodyCommodityMarketplaceMetadata marketplaceMetadata;

        @NameInMap("OrderTime")
        public java.util.Map<String, java.util.List<String>> orderTime;

        @NameInMap("SaasBoostMetadata")
        public String saasBoostMetadata;

        @NameInMap("Specifications")
        public java.util.List<GetServiceResponseBodyCommoditySpecifications> specifications;

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
        @NameInMap("PolicyDocument")
        public String policyDocument;

        @NameInMap("Principals")
        public java.util.List<String> principals;

        @NameInMap("RoleName")
        public String roleName;

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
        @NameInMap("DocumentUrl")
        public String documentUrl;

        @NameInMap("Locale")
        public String locale;

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
        @NameInMap("Name")
        public String name;

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
        @NameInMap("Name")
        public String name;

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
        @NameInMap("Agreements")
        public java.util.List<GetServiceResponseBodyServiceInfosAgreements> agreements;

        /**
         * <strong>example:</strong>
         * <p><a href="https://example.com/service-image/c1c4a559-cc60-4af1-b976-98f356602462.png">https://example.com/service-image/c1c4a559-cc60-4af1-b976-98f356602462.png</a></p>
         */
        @NameInMap("Image")
        public String image;

        /**
         * <strong>example:</strong>
         * <p>zh-CN</p>
         */
        @NameInMap("Locale")
        public String locale;

        @NameInMap("Name")
        public String name;

        @NameInMap("ShortDescription")
        public String shortDescription;

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

    public static class GetServiceResponseBodyTags extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>key1</p>
         */
        @NameInMap("Key")
        public String key;

        /**
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
