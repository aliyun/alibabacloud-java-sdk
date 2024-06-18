// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenestsupplier20210521.models;

import com.aliyun.tea.*;

public class ListServicesResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>AAAAAfu+XtuBE55iRLHEYYuojI4=</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>51945B04-6AA6-410D-93BA-236E0248B104</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Services")
    public java.util.List<ListServicesResponseBodyServices> services;

    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListServicesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListServicesResponseBody self = new ListServicesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListServicesResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListServicesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListServicesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListServicesResponseBody setServices(java.util.List<ListServicesResponseBodyServices> services) {
        this.services = services;
        return this;
    }
    public java.util.List<ListServicesResponseBodyServices> getServices() {
        return this.services;
    }

    public ListServicesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListServicesResponseBodyServicesCommodity extends TeaModel {
        @NameInMap("CommodityCode")
        public String commodityCode;

        @NameInMap("SaasBoostMetadata")
        public String saasBoostMetadata;

        @NameInMap("Type")
        public String type;

        public static ListServicesResponseBodyServicesCommodity build(java.util.Map<String, ?> map) throws Exception {
            ListServicesResponseBodyServicesCommodity self = new ListServicesResponseBodyServicesCommodity();
            return TeaModel.build(map, self);
        }

        public ListServicesResponseBodyServicesCommodity setCommodityCode(String commodityCode) {
            this.commodityCode = commodityCode;
            return this;
        }
        public String getCommodityCode() {
            return this.commodityCode;
        }

        public ListServicesResponseBodyServicesCommodity setSaasBoostMetadata(String saasBoostMetadata) {
            this.saasBoostMetadata = saasBoostMetadata;
            return this;
        }
        public String getSaasBoostMetadata() {
            return this.saasBoostMetadata;
        }

        public ListServicesResponseBodyServicesCommodity setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListServicesResponseBodyServicesServiceInfos extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p><a href="http://img.tidb.oss.url">http://img.tidb.oss.url</a></p>
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

        public static ListServicesResponseBodyServicesServiceInfos build(java.util.Map<String, ?> map) throws Exception {
            ListServicesResponseBodyServicesServiceInfos self = new ListServicesResponseBodyServicesServiceInfos();
            return TeaModel.build(map, self);
        }

        public ListServicesResponseBodyServicesServiceInfos setImage(String image) {
            this.image = image;
            return this;
        }
        public String getImage() {
            return this.image;
        }

        public ListServicesResponseBodyServicesServiceInfos setLocale(String locale) {
            this.locale = locale;
            return this;
        }
        public String getLocale() {
            return this.locale;
        }

        public ListServicesResponseBodyServicesServiceInfos setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListServicesResponseBodyServicesServiceInfos setShortDescription(String shortDescription) {
            this.shortDescription = shortDescription;
            return this;
        }
        public String getShortDescription() {
            return this.shortDescription;
        }

    }

    public static class ListServicesResponseBodyServicesTags extends TeaModel {
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

        public static ListServicesResponseBodyServicesTags build(java.util.Map<String, ?> map) throws Exception {
            ListServicesResponseBodyServicesTags self = new ListServicesResponseBodyServicesTags();
            return TeaModel.build(map, self);
        }

        public ListServicesResponseBodyServicesTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListServicesResponseBodyServicesTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListServicesResponseBodyServices extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>AutoPass</p>
         */
        @NameInMap("ApprovalType")
        public String approvalType;

        /**
         * <strong>example:</strong>
         * <p>artifact-21ca53ac16a643xxxxxx</p>
         */
        @NameInMap("ArtifactId")
        public String artifactId;

        /**
         * <strong>example:</strong>
         * <p>draft</p>
         */
        @NameInMap("ArtifactVersion")
        public String artifactVersion;

        @NameInMap("BuildInfo")
        public String buildInfo;

        @NameInMap("Categories")
        public String categories;

        @NameInMap("Commodity")
        public ListServicesResponseBodyServicesCommodity commodity;

        /**
         * <strong>example:</strong>
         * <p>cmjj00xxxx</p>
         */
        @NameInMap("CommodityCode")
        public String commodityCode;

        /**
         * <strong>example:</strong>
         * <p>2021-05-20T00:00:00Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("DefaultVersion")
        public Boolean defaultVersion;

        /**
         * <strong>example:</strong>
         * <p>ros</p>
         */
        @NameInMap("DeployType")
        public String deployType;

        @NameInMap("HasBeta")
        public Boolean hasBeta;

        @NameInMap("HasDraft")
        public Boolean hasDraft;

        @NameInMap("LatestResellSourceServiceVersion")
        public String latestResellSourceServiceVersion;

        /**
         * <strong>example:</strong>
         * <p>2021-05-21T00:00:00Z</p>
         */
        @NameInMap("PublishTime")
        public String publishTime;

        /**
         * <strong>example:</strong>
         * <p>ServiceDeployment</p>
         */
        @NameInMap("RelationType")
        public String relationType;

        @NameInMap("ResellApplyStatus")
        public String resellApplyStatus;

        @NameInMap("ResellServiceId")
        public String resellServiceId;

        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        @NameInMap("ServiceDiscoverable")
        public String serviceDiscoverable;

        /**
         * <strong>example:</strong>
         * <p>service-70a3b15bb62643xxxxxx</p>
         */
        @NameInMap("ServiceId")
        public String serviceId;

        @NameInMap("ServiceInfos")
        public java.util.List<ListServicesResponseBodyServicesServiceInfos> serviceInfos;

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
         * <p>centos_7</p>
         */
        @NameInMap("SourceImage")
        public String sourceImage;

        @NameInMap("SourceServiceId")
        public String sourceServiceId;

        @NameInMap("SourceServiceVersion")
        public String sourceServiceVersion;

        @NameInMap("SourceSupplierName")
        public String sourceSupplierName;

        /**
         * <strong>example:</strong>
         * <p>Online</p>
         */
        @NameInMap("Status")
        public String status;

        @NameInMap("SupplierName")
        public String supplierName;

        /**
         * <strong>example:</strong>
         * <p><a href="http://example.com">http://example.com</a></p>
         */
        @NameInMap("SupplierUrl")
        public String supplierUrl;

        @NameInMap("Tags")
        public java.util.List<ListServicesResponseBodyServicesTags> tags;

        /**
         * <strong>example:</strong>
         * <p>SingleTenant</p>
         */
        @NameInMap("TenantType")
        public String tenantType;

        /**
         * <strong>example:</strong>
         * <p>Trial</p>
         */
        @NameInMap("TrialType")
        public String trialType;

        /**
         * <strong>example:</strong>
         * <p>2021-05-21T00:00:00Z</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        /**
         * <strong>example:</strong>
         * <p>1.0</p>
         */
        @NameInMap("Version")
        public String version;

        /**
         * <strong>example:</strong>
         * <p>v2.0.0</p>
         */
        @NameInMap("VersionName")
        public String versionName;

        @NameInMap("VirtualInternetService")
        public String virtualInternetService;

        public static ListServicesResponseBodyServices build(java.util.Map<String, ?> map) throws Exception {
            ListServicesResponseBodyServices self = new ListServicesResponseBodyServices();
            return TeaModel.build(map, self);
        }

        public ListServicesResponseBodyServices setApprovalType(String approvalType) {
            this.approvalType = approvalType;
            return this;
        }
        public String getApprovalType() {
            return this.approvalType;
        }

        public ListServicesResponseBodyServices setArtifactId(String artifactId) {
            this.artifactId = artifactId;
            return this;
        }
        public String getArtifactId() {
            return this.artifactId;
        }

        public ListServicesResponseBodyServices setArtifactVersion(String artifactVersion) {
            this.artifactVersion = artifactVersion;
            return this;
        }
        public String getArtifactVersion() {
            return this.artifactVersion;
        }

        public ListServicesResponseBodyServices setBuildInfo(String buildInfo) {
            this.buildInfo = buildInfo;
            return this;
        }
        public String getBuildInfo() {
            return this.buildInfo;
        }

        public ListServicesResponseBodyServices setCategories(String categories) {
            this.categories = categories;
            return this;
        }
        public String getCategories() {
            return this.categories;
        }

        public ListServicesResponseBodyServices setCommodity(ListServicesResponseBodyServicesCommodity commodity) {
            this.commodity = commodity;
            return this;
        }
        public ListServicesResponseBodyServicesCommodity getCommodity() {
            return this.commodity;
        }

        public ListServicesResponseBodyServices setCommodityCode(String commodityCode) {
            this.commodityCode = commodityCode;
            return this;
        }
        public String getCommodityCode() {
            return this.commodityCode;
        }

        public ListServicesResponseBodyServices setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListServicesResponseBodyServices setDefaultVersion(Boolean defaultVersion) {
            this.defaultVersion = defaultVersion;
            return this;
        }
        public Boolean getDefaultVersion() {
            return this.defaultVersion;
        }

        public ListServicesResponseBodyServices setDeployType(String deployType) {
            this.deployType = deployType;
            return this;
        }
        public String getDeployType() {
            return this.deployType;
        }

        public ListServicesResponseBodyServices setHasBeta(Boolean hasBeta) {
            this.hasBeta = hasBeta;
            return this;
        }
        public Boolean getHasBeta() {
            return this.hasBeta;
        }

        public ListServicesResponseBodyServices setHasDraft(Boolean hasDraft) {
            this.hasDraft = hasDraft;
            return this;
        }
        public Boolean getHasDraft() {
            return this.hasDraft;
        }

        public ListServicesResponseBodyServices setLatestResellSourceServiceVersion(String latestResellSourceServiceVersion) {
            this.latestResellSourceServiceVersion = latestResellSourceServiceVersion;
            return this;
        }
        public String getLatestResellSourceServiceVersion() {
            return this.latestResellSourceServiceVersion;
        }

        public ListServicesResponseBodyServices setPublishTime(String publishTime) {
            this.publishTime = publishTime;
            return this;
        }
        public String getPublishTime() {
            return this.publishTime;
        }

        public ListServicesResponseBodyServices setRelationType(String relationType) {
            this.relationType = relationType;
            return this;
        }
        public String getRelationType() {
            return this.relationType;
        }

        public ListServicesResponseBodyServices setResellApplyStatus(String resellApplyStatus) {
            this.resellApplyStatus = resellApplyStatus;
            return this;
        }
        public String getResellApplyStatus() {
            return this.resellApplyStatus;
        }

        public ListServicesResponseBodyServices setResellServiceId(String resellServiceId) {
            this.resellServiceId = resellServiceId;
            return this;
        }
        public String getResellServiceId() {
            return this.resellServiceId;
        }

        public ListServicesResponseBodyServices setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public ListServicesResponseBodyServices setServiceDiscoverable(String serviceDiscoverable) {
            this.serviceDiscoverable = serviceDiscoverable;
            return this;
        }
        public String getServiceDiscoverable() {
            return this.serviceDiscoverable;
        }

        public ListServicesResponseBodyServices setServiceId(String serviceId) {
            this.serviceId = serviceId;
            return this;
        }
        public String getServiceId() {
            return this.serviceId;
        }

        public ListServicesResponseBodyServices setServiceInfos(java.util.List<ListServicesResponseBodyServicesServiceInfos> serviceInfos) {
            this.serviceInfos = serviceInfos;
            return this;
        }
        public java.util.List<ListServicesResponseBodyServicesServiceInfos> getServiceInfos() {
            return this.serviceInfos;
        }

        public ListServicesResponseBodyServices setServiceType(String serviceType) {
            this.serviceType = serviceType;
            return this;
        }
        public String getServiceType() {
            return this.serviceType;
        }

        public ListServicesResponseBodyServices setShareType(String shareType) {
            this.shareType = shareType;
            return this;
        }
        public String getShareType() {
            return this.shareType;
        }

        public ListServicesResponseBodyServices setSourceImage(String sourceImage) {
            this.sourceImage = sourceImage;
            return this;
        }
        public String getSourceImage() {
            return this.sourceImage;
        }

        public ListServicesResponseBodyServices setSourceServiceId(String sourceServiceId) {
            this.sourceServiceId = sourceServiceId;
            return this;
        }
        public String getSourceServiceId() {
            return this.sourceServiceId;
        }

        public ListServicesResponseBodyServices setSourceServiceVersion(String sourceServiceVersion) {
            this.sourceServiceVersion = sourceServiceVersion;
            return this;
        }
        public String getSourceServiceVersion() {
            return this.sourceServiceVersion;
        }

        public ListServicesResponseBodyServices setSourceSupplierName(String sourceSupplierName) {
            this.sourceSupplierName = sourceSupplierName;
            return this;
        }
        public String getSourceSupplierName() {
            return this.sourceSupplierName;
        }

        public ListServicesResponseBodyServices setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListServicesResponseBodyServices setSupplierName(String supplierName) {
            this.supplierName = supplierName;
            return this;
        }
        public String getSupplierName() {
            return this.supplierName;
        }

        public ListServicesResponseBodyServices setSupplierUrl(String supplierUrl) {
            this.supplierUrl = supplierUrl;
            return this;
        }
        public String getSupplierUrl() {
            return this.supplierUrl;
        }

        public ListServicesResponseBodyServices setTags(java.util.List<ListServicesResponseBodyServicesTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<ListServicesResponseBodyServicesTags> getTags() {
            return this.tags;
        }

        public ListServicesResponseBodyServices setTenantType(String tenantType) {
            this.tenantType = tenantType;
            return this;
        }
        public String getTenantType() {
            return this.tenantType;
        }

        public ListServicesResponseBodyServices setTrialType(String trialType) {
            this.trialType = trialType;
            return this;
        }
        public String getTrialType() {
            return this.trialType;
        }

        public ListServicesResponseBodyServices setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public ListServicesResponseBodyServices setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public ListServicesResponseBodyServices setVersionName(String versionName) {
            this.versionName = versionName;
            return this;
        }
        public String getVersionName() {
            return this.versionName;
        }

        public ListServicesResponseBodyServices setVirtualInternetService(String virtualInternetService) {
            this.virtualInternetService = virtualInternetService;
            return this;
        }
        public String getVirtualInternetService() {
            return this.virtualInternetService;
        }

    }

}
