// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenestsupplier20210521.models;

import com.aliyun.tea.*;

public class GetServiceResponseBody extends TeaModel {
    @NameInMap("AlarmMetadata")
    public String alarmMetadata;

    @NameInMap("ApprovalType")
    public String approvalType;

    @NameInMap("BillEntityMappings")
    public GetServiceResponseBodyBillEntityMappings billEntityMappings;

    @NameInMap("Categories")
    public String categories;

    @NameInMap("Commodity")
    public GetServiceResponseBodyCommodity commodity;

    @NameInMap("CommodityCode")
    public String commodityCode;

    @NameInMap("CommodityEntities")
    public java.util.List<GetServiceResponseBodyCommodityEntities> commodityEntities;

    @NameInMap("CommoditySpecifications")
    public java.util.List<GetServiceResponseBodyCommoditySpecifications> commoditySpecifications;

    @NameInMap("ComponentsConfigs")
    public java.util.List<GetServiceResponseBodyComponentsConfigs> componentsConfigs;

    @NameInMap("CreateTime")
    public String createTime;

    @NameInMap("CrossRegionConnectionStatus")
    public String crossRegionConnectionStatus;

    @NameInMap("DefaultLicenseDays")
    public Long defaultLicenseDays;

    @NameInMap("DeployMetadata")
    public String deployMetadata;

    @NameInMap("DeployType")
    public String deployType;

    @NameInMap("Duration")
    public Long duration;

    @NameInMap("EntityAdditionalInfo")
    public java.util.Map<String, EntityAdditionalInfoValue> entityAdditionalInfo;

    @NameInMap("EntitySource")
    public java.util.Map<String, String> entitySource;

    @NameInMap("IsSupportOperated")
    public Boolean isSupportOperated;

    @NameInMap("LicenseMetadata")
    public String licenseMetadata;

    @NameInMap("LogMetadata")
    public String logMetadata;

    @NameInMap("OperationMetadata")
    public String operationMetadata;

    @NameInMap("PayFromType")
    public String payFromType;

    @NameInMap("PayType")
    public String payType;

    @NameInMap("Permission")
    public String permission;

    @NameInMap("PolicyNames")
    public String policyNames;

    @NameInMap("Progress")
    public Long progress;

    @NameInMap("PublishTime")
    public String publishTime;

    @NameInMap("RegistrationId")
    public String registrationId;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Resellable")
    public Boolean resellable;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ServiceAuditDocumentUrl")
    public String serviceAuditDocumentUrl;

    @NameInMap("ServiceDiscoverable")
    public String serviceDiscoverable;

    @NameInMap("ServiceDocUrl")
    public String serviceDocUrl;

    @NameInMap("ServiceId")
    public String serviceId;

    @NameInMap("ServiceInfos")
    public java.util.List<GetServiceResponseBodyServiceInfos> serviceInfos;

    @NameInMap("ServiceProductUrl")
    public String serviceProductUrl;

    @NameInMap("ServiceType")
    public String serviceType;

    @NameInMap("ShareType")
    public String shareType;

    @NameInMap("ShareTypeStatus")
    public String shareTypeStatus;

    @NameInMap("SourceServiceId")
    public String sourceServiceId;

    @NameInMap("SourceServiceVersion")
    public String sourceServiceVersion;

    @NameInMap("SourceSupplierName")
    public String sourceSupplierName;

    @NameInMap("Statistic")
    public GetServiceResponseBodyStatistic statistic;

    @NameInMap("Status")
    public String status;

    @NameInMap("StatusDetail")
    public String statusDetail;

    @NameInMap("SupplierName")
    public String supplierName;

    @NameInMap("SupplierUrl")
    public String supplierUrl;

    @NameInMap("Tags")
    public java.util.List<GetServiceResponseBodyTags> tags;

    @NameInMap("TenantType")
    public String tenantType;

    @NameInMap("TestStatus")
    public String testStatus;

    @NameInMap("TrialDuration")
    public Long trialDuration;

    @NameInMap("TrialType")
    public String trialType;

    @NameInMap("UpdateTime")
    public String updateTime;

    @NameInMap("UpgradeMetadata")
    public String upgradeMetadata;

    @NameInMap("Version")
    public String version;

    @NameInMap("VersionName")
    public String versionName;

    @NameInMap("VirtualInternetService")
    public String virtualInternetService;

    @NameInMap("VirtualInternetServiceId")
    public String virtualInternetServiceId;

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

    public GetServiceResponseBody setApprovalType(String approvalType) {
        this.approvalType = approvalType;
        return this;
    }
    public String getApprovalType() {
        return this.approvalType;
    }

    public GetServiceResponseBody setBillEntityMappings(GetServiceResponseBodyBillEntityMappings billEntityMappings) {
        this.billEntityMappings = billEntityMappings;
        return this;
    }
    public GetServiceResponseBodyBillEntityMappings getBillEntityMappings() {
        return this.billEntityMappings;
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

    public GetServiceResponseBody setCommodityCode(String commodityCode) {
        this.commodityCode = commodityCode;
        return this;
    }
    public String getCommodityCode() {
        return this.commodityCode;
    }

    public GetServiceResponseBody setCommodityEntities(java.util.List<GetServiceResponseBodyCommodityEntities> commodityEntities) {
        this.commodityEntities = commodityEntities;
        return this;
    }
    public java.util.List<GetServiceResponseBodyCommodityEntities> getCommodityEntities() {
        return this.commodityEntities;
    }

    public GetServiceResponseBody setCommoditySpecifications(java.util.List<GetServiceResponseBodyCommoditySpecifications> commoditySpecifications) {
        this.commoditySpecifications = commoditySpecifications;
        return this;
    }
    public java.util.List<GetServiceResponseBodyCommoditySpecifications> getCommoditySpecifications() {
        return this.commoditySpecifications;
    }

    public GetServiceResponseBody setComponentsConfigs(java.util.List<GetServiceResponseBodyComponentsConfigs> componentsConfigs) {
        this.componentsConfigs = componentsConfigs;
        return this;
    }
    public java.util.List<GetServiceResponseBodyComponentsConfigs> getComponentsConfigs() {
        return this.componentsConfigs;
    }

    public GetServiceResponseBody setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public GetServiceResponseBody setCrossRegionConnectionStatus(String crossRegionConnectionStatus) {
        this.crossRegionConnectionStatus = crossRegionConnectionStatus;
        return this;
    }
    public String getCrossRegionConnectionStatus() {
        return this.crossRegionConnectionStatus;
    }

    public GetServiceResponseBody setDefaultLicenseDays(Long defaultLicenseDays) {
        this.defaultLicenseDays = defaultLicenseDays;
        return this;
    }
    public Long getDefaultLicenseDays() {
        return this.defaultLicenseDays;
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

    public GetServiceResponseBody setEntityAdditionalInfo(java.util.Map<String, EntityAdditionalInfoValue> entityAdditionalInfo) {
        this.entityAdditionalInfo = entityAdditionalInfo;
        return this;
    }
    public java.util.Map<String, EntityAdditionalInfoValue> getEntityAdditionalInfo() {
        return this.entityAdditionalInfo;
    }

    public GetServiceResponseBody setEntitySource(java.util.Map<String, String> entitySource) {
        this.entitySource = entitySource;
        return this;
    }
    public java.util.Map<String, String> getEntitySource() {
        return this.entitySource;
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

    public GetServiceResponseBody setPayFromType(String payFromType) {
        this.payFromType = payFromType;
        return this;
    }
    public String getPayFromType() {
        return this.payFromType;
    }

    public GetServiceResponseBody setPayType(String payType) {
        this.payType = payType;
        return this;
    }
    public String getPayType() {
        return this.payType;
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

    public GetServiceResponseBody setProgress(Long progress) {
        this.progress = progress;
        return this;
    }
    public Long getProgress() {
        return this.progress;
    }

    public GetServiceResponseBody setPublishTime(String publishTime) {
        this.publishTime = publishTime;
        return this;
    }
    public String getPublishTime() {
        return this.publishTime;
    }

    public GetServiceResponseBody setRegistrationId(String registrationId) {
        this.registrationId = registrationId;
        return this;
    }
    public String getRegistrationId() {
        return this.registrationId;
    }

    public GetServiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetServiceResponseBody setResellable(Boolean resellable) {
        this.resellable = resellable;
        return this;
    }
    public Boolean getResellable() {
        return this.resellable;
    }

    public GetServiceResponseBody setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public GetServiceResponseBody setServiceAuditDocumentUrl(String serviceAuditDocumentUrl) {
        this.serviceAuditDocumentUrl = serviceAuditDocumentUrl;
        return this;
    }
    public String getServiceAuditDocumentUrl() {
        return this.serviceAuditDocumentUrl;
    }

    public GetServiceResponseBody setServiceDiscoverable(String serviceDiscoverable) {
        this.serviceDiscoverable = serviceDiscoverable;
        return this;
    }
    public String getServiceDiscoverable() {
        return this.serviceDiscoverable;
    }

    public GetServiceResponseBody setServiceDocUrl(String serviceDocUrl) {
        this.serviceDocUrl = serviceDocUrl;
        return this;
    }
    public String getServiceDocUrl() {
        return this.serviceDocUrl;
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

    public GetServiceResponseBody setShareTypeStatus(String shareTypeStatus) {
        this.shareTypeStatus = shareTypeStatus;
        return this;
    }
    public String getShareTypeStatus() {
        return this.shareTypeStatus;
    }

    public GetServiceResponseBody setSourceServiceId(String sourceServiceId) {
        this.sourceServiceId = sourceServiceId;
        return this;
    }
    public String getSourceServiceId() {
        return this.sourceServiceId;
    }

    public GetServiceResponseBody setSourceServiceVersion(String sourceServiceVersion) {
        this.sourceServiceVersion = sourceServiceVersion;
        return this;
    }
    public String getSourceServiceVersion() {
        return this.sourceServiceVersion;
    }

    public GetServiceResponseBody setSourceSupplierName(String sourceSupplierName) {
        this.sourceSupplierName = sourceSupplierName;
        return this;
    }
    public String getSourceSupplierName() {
        return this.sourceSupplierName;
    }

    public GetServiceResponseBody setStatistic(GetServiceResponseBodyStatistic statistic) {
        this.statistic = statistic;
        return this;
    }
    public GetServiceResponseBodyStatistic getStatistic() {
        return this.statistic;
    }

    public GetServiceResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public GetServiceResponseBody setStatusDetail(String statusDetail) {
        this.statusDetail = statusDetail;
        return this;
    }
    public String getStatusDetail() {
        return this.statusDetail;
    }

    public GetServiceResponseBody setSupplierName(String supplierName) {
        this.supplierName = supplierName;
        return this;
    }
    public String getSupplierName() {
        return this.supplierName;
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

    public GetServiceResponseBody setTestStatus(String testStatus) {
        this.testStatus = testStatus;
        return this;
    }
    public String getTestStatus() {
        return this.testStatus;
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

    public GetServiceResponseBody setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public String getUpdateTime() {
        return this.updateTime;
    }

    public GetServiceResponseBody setUpgradeMetadata(String upgradeMetadata) {
        this.upgradeMetadata = upgradeMetadata;
        return this;
    }
    public String getUpgradeMetadata() {
        return this.upgradeMetadata;
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

    public GetServiceResponseBody setVirtualInternetService(String virtualInternetService) {
        this.virtualInternetService = virtualInternetService;
        return this;
    }
    public String getVirtualInternetService() {
        return this.virtualInternetService;
    }

    public GetServiceResponseBody setVirtualInternetServiceId(String virtualInternetServiceId) {
        this.virtualInternetServiceId = virtualInternetServiceId;
        return this;
    }
    public String getVirtualInternetServiceId() {
        return this.virtualInternetServiceId;
    }

    public static class GetServiceResponseBodyBillEntityMappingsMappingConfigMappings extends TeaModel {
        @NameInMap("BillCode")
        public String billCode;

        @NameInMap("Entity")
        public String entity;

        @NameInMap("MeteringAssist")
        public String meteringAssist;

        public static GetServiceResponseBodyBillEntityMappingsMappingConfigMappings build(java.util.Map<String, ?> map) throws Exception {
            GetServiceResponseBodyBillEntityMappingsMappingConfigMappings self = new GetServiceResponseBodyBillEntityMappingsMappingConfigMappings();
            return TeaModel.build(map, self);
        }

        public GetServiceResponseBodyBillEntityMappingsMappingConfigMappings setBillCode(String billCode) {
            this.billCode = billCode;
            return this;
        }
        public String getBillCode() {
            return this.billCode;
        }

        public GetServiceResponseBodyBillEntityMappingsMappingConfigMappings setEntity(String entity) {
            this.entity = entity;
            return this;
        }
        public String getEntity() {
            return this.entity;
        }

        public GetServiceResponseBodyBillEntityMappingsMappingConfigMappings setMeteringAssist(String meteringAssist) {
            this.meteringAssist = meteringAssist;
            return this;
        }
        public String getMeteringAssist() {
            return this.meteringAssist;
        }

    }

    public static class GetServiceResponseBodyBillEntityMappingsMappingConfig extends TeaModel {
        @NameInMap("Mappings")
        public java.util.List<GetServiceResponseBodyBillEntityMappingsMappingConfigMappings> mappings;

        @NameInMap("PredefinedParameters")
        public String predefinedParameters;

        @NameInMap("TemplateName")
        public String templateName;

        public static GetServiceResponseBodyBillEntityMappingsMappingConfig build(java.util.Map<String, ?> map) throws Exception {
            GetServiceResponseBodyBillEntityMappingsMappingConfig self = new GetServiceResponseBodyBillEntityMappingsMappingConfig();
            return TeaModel.build(map, self);
        }

        public GetServiceResponseBodyBillEntityMappingsMappingConfig setMappings(java.util.List<GetServiceResponseBodyBillEntityMappingsMappingConfigMappings> mappings) {
            this.mappings = mappings;
            return this;
        }
        public java.util.List<GetServiceResponseBodyBillEntityMappingsMappingConfigMappings> getMappings() {
            return this.mappings;
        }

        public GetServiceResponseBodyBillEntityMappingsMappingConfig setPredefinedParameters(String predefinedParameters) {
            this.predefinedParameters = predefinedParameters;
            return this;
        }
        public String getPredefinedParameters() {
            return this.predefinedParameters;
        }

        public GetServiceResponseBodyBillEntityMappingsMappingConfig setTemplateName(String templateName) {
            this.templateName = templateName;
            return this;
        }
        public String getTemplateName() {
            return this.templateName;
        }

    }

    public static class GetServiceResponseBodyBillEntityMappings extends TeaModel {
        @NameInMap("MappingConfig")
        public java.util.List<GetServiceResponseBodyBillEntityMappingsMappingConfig> mappingConfig;

        @NameInMap("Type")
        public String type;

        public static GetServiceResponseBodyBillEntityMappings build(java.util.Map<String, ?> map) throws Exception {
            GetServiceResponseBodyBillEntityMappings self = new GetServiceResponseBodyBillEntityMappings();
            return TeaModel.build(map, self);
        }

        public GetServiceResponseBodyBillEntityMappings setMappingConfig(java.util.List<GetServiceResponseBodyBillEntityMappingsMappingConfig> mappingConfig) {
            this.mappingConfig = mappingConfig;
            return this;
        }
        public java.util.List<GetServiceResponseBodyBillEntityMappingsMappingConfig> getMappingConfig() {
            return this.mappingConfig;
        }

        public GetServiceResponseBodyBillEntityMappings setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetServiceResponseBodyCommodity extends TeaModel {
        @NameInMap("ChargeType")
        public String chargeType;

        @NameInMap("Components")
        public java.util.List<String> components;

        @NameInMap("OrderTime")
        public java.util.Map<String, java.util.List<String>> orderTime;

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

        public GetServiceResponseBodyCommodity setComponents(java.util.List<String> components) {
            this.components = components;
            return this;
        }
        public java.util.List<String> getComponents() {
            return this.components;
        }

        public GetServiceResponseBodyCommodity setOrderTime(java.util.Map<String, java.util.List<String>> orderTime) {
            this.orderTime = orderTime;
            return this;
        }
        public java.util.Map<String, java.util.List<String>> getOrderTime() {
            return this.orderTime;
        }

        public GetServiceResponseBodyCommodity setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetServiceResponseBodyCommodityEntities extends TeaModel {
        @NameInMap("EntityIds")
        public java.util.List<String> entityIds;

        @NameInMap("PredefinedParameterName")
        public String predefinedParameterName;

        @NameInMap("TemplateName")
        public String templateName;

        public static GetServiceResponseBodyCommodityEntities build(java.util.Map<String, ?> map) throws Exception {
            GetServiceResponseBodyCommodityEntities self = new GetServiceResponseBodyCommodityEntities();
            return TeaModel.build(map, self);
        }

        public GetServiceResponseBodyCommodityEntities setEntityIds(java.util.List<String> entityIds) {
            this.entityIds = entityIds;
            return this;
        }
        public java.util.List<String> getEntityIds() {
            return this.entityIds;
        }

        public GetServiceResponseBodyCommodityEntities setPredefinedParameterName(String predefinedParameterName) {
            this.predefinedParameterName = predefinedParameterName;
            return this;
        }
        public String getPredefinedParameterName() {
            return this.predefinedParameterName;
        }

        public GetServiceResponseBodyCommodityEntities setTemplateName(String templateName) {
            this.templateName = templateName;
            return this;
        }
        public String getTemplateName() {
            return this.templateName;
        }

    }

    public static class GetServiceResponseBodyCommoditySpecifications extends TeaModel {
        @NameInMap("PredefinedParameterName")
        public String predefinedParameterName;

        @NameInMap("SpecificationCode")
        public String specificationCode;

        @NameInMap("TemplateName")
        public String templateName;

        public static GetServiceResponseBodyCommoditySpecifications build(java.util.Map<String, ?> map) throws Exception {
            GetServiceResponseBodyCommoditySpecifications self = new GetServiceResponseBodyCommoditySpecifications();
            return TeaModel.build(map, self);
        }

        public GetServiceResponseBodyCommoditySpecifications setPredefinedParameterName(String predefinedParameterName) {
            this.predefinedParameterName = predefinedParameterName;
            return this;
        }
        public String getPredefinedParameterName() {
            return this.predefinedParameterName;
        }

        public GetServiceResponseBodyCommoditySpecifications setSpecificationCode(String specificationCode) {
            this.specificationCode = specificationCode;
            return this;
        }
        public String getSpecificationCode() {
            return this.specificationCode;
        }

        public GetServiceResponseBodyCommoditySpecifications setTemplateName(String templateName) {
            this.templateName = templateName;
            return this;
        }
        public String getTemplateName() {
            return this.templateName;
        }

    }

    public static class GetServiceResponseBodyComponentsConfigs extends TeaModel {
        @NameInMap("ComponentsMappings")
        public java.util.Map<String, String> componentsMappings;

        @NameInMap("TemplateName")
        public String templateName;

        public static GetServiceResponseBodyComponentsConfigs build(java.util.Map<String, ?> map) throws Exception {
            GetServiceResponseBodyComponentsConfigs self = new GetServiceResponseBodyComponentsConfigs();
            return TeaModel.build(map, self);
        }

        public GetServiceResponseBodyComponentsConfigs setComponentsMappings(java.util.Map<String, String> componentsMappings) {
            this.componentsMappings = componentsMappings;
            return this;
        }
        public java.util.Map<String, String> getComponentsMappings() {
            return this.componentsMappings;
        }

        public GetServiceResponseBodyComponentsConfigs setTemplateName(String templateName) {
            this.templateName = templateName;
            return this;
        }
        public String getTemplateName() {
            return this.templateName;
        }

    }

    public static class GetServiceResponseBodyServiceInfos extends TeaModel {
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

        public static GetServiceResponseBodyServiceInfos build(java.util.Map<String, ?> map) throws Exception {
            GetServiceResponseBodyServiceInfos self = new GetServiceResponseBodyServiceInfos();
            return TeaModel.build(map, self);
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

        public GetServiceResponseBodyServiceInfos setLongDescriptionUrl(String longDescriptionUrl) {
            this.longDescriptionUrl = longDescriptionUrl;
            return this;
        }
        public String getLongDescriptionUrl() {
            return this.longDescriptionUrl;
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

    }

    public static class GetServiceResponseBodyStatistic extends TeaModel {
        @NameInMap("AccumulativeInstanceCount")
        public Integer accumulativeInstanceCount;

        @NameInMap("AccumulativePocAmount")
        public Double accumulativePocAmount;

        @NameInMap("AccumulativeUserCount")
        public Integer accumulativeUserCount;

        @NameInMap("AveragePocAmount")
        public Double averagePocAmount;

        @NameInMap("AveragePocDuration")
        public Double averagePocDuration;

        @NameInMap("AveragePocUnitAmount")
        public Double averagePocUnitAmount;

        @NameInMap("DeployedServiceInstanceCount")
        public Integer deployedServiceInstanceCount;

        @NameInMap("DeployedUserCount")
        public Integer deployedUserCount;

        @NameInMap("SubmittedUsageCount")
        public Integer submittedUsageCount;

        public static GetServiceResponseBodyStatistic build(java.util.Map<String, ?> map) throws Exception {
            GetServiceResponseBodyStatistic self = new GetServiceResponseBodyStatistic();
            return TeaModel.build(map, self);
        }

        public GetServiceResponseBodyStatistic setAccumulativeInstanceCount(Integer accumulativeInstanceCount) {
            this.accumulativeInstanceCount = accumulativeInstanceCount;
            return this;
        }
        public Integer getAccumulativeInstanceCount() {
            return this.accumulativeInstanceCount;
        }

        public GetServiceResponseBodyStatistic setAccumulativePocAmount(Double accumulativePocAmount) {
            this.accumulativePocAmount = accumulativePocAmount;
            return this;
        }
        public Double getAccumulativePocAmount() {
            return this.accumulativePocAmount;
        }

        public GetServiceResponseBodyStatistic setAccumulativeUserCount(Integer accumulativeUserCount) {
            this.accumulativeUserCount = accumulativeUserCount;
            return this;
        }
        public Integer getAccumulativeUserCount() {
            return this.accumulativeUserCount;
        }

        public GetServiceResponseBodyStatistic setAveragePocAmount(Double averagePocAmount) {
            this.averagePocAmount = averagePocAmount;
            return this;
        }
        public Double getAveragePocAmount() {
            return this.averagePocAmount;
        }

        public GetServiceResponseBodyStatistic setAveragePocDuration(Double averagePocDuration) {
            this.averagePocDuration = averagePocDuration;
            return this;
        }
        public Double getAveragePocDuration() {
            return this.averagePocDuration;
        }

        public GetServiceResponseBodyStatistic setAveragePocUnitAmount(Double averagePocUnitAmount) {
            this.averagePocUnitAmount = averagePocUnitAmount;
            return this;
        }
        public Double getAveragePocUnitAmount() {
            return this.averagePocUnitAmount;
        }

        public GetServiceResponseBodyStatistic setDeployedServiceInstanceCount(Integer deployedServiceInstanceCount) {
            this.deployedServiceInstanceCount = deployedServiceInstanceCount;
            return this;
        }
        public Integer getDeployedServiceInstanceCount() {
            return this.deployedServiceInstanceCount;
        }

        public GetServiceResponseBodyStatistic setDeployedUserCount(Integer deployedUserCount) {
            this.deployedUserCount = deployedUserCount;
            return this;
        }
        public Integer getDeployedUserCount() {
            return this.deployedUserCount;
        }

        public GetServiceResponseBodyStatistic setSubmittedUsageCount(Integer submittedUsageCount) {
            this.submittedUsageCount = submittedUsageCount;
            return this;
        }
        public Integer getSubmittedUsageCount() {
            return this.submittedUsageCount;
        }

    }

    public static class GetServiceResponseBodyTags extends TeaModel {
        @NameInMap("Key")
        public String key;

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
