// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenestsupplier20210521.models;

import com.aliyun.tea.*;

public class ListServicesResponseBody extends TeaModel {
    /**
     * <p>The number of entries per page. Valid values: 1 to 100. Default value: 20.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>A pagination token.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAfu+XtuBE55iRLHEYYuojI4=</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>51945B04-6AA6-410D-93BA-236E0248B104</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The services.</p>
     */
    @NameInMap("Services")
    public java.util.List<ListServicesResponseBodyServices> services;

    /**
     * <p>The total number of entries returned.</p>
     * 
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
        /**
         * <p>The commodity code.</p>
         * 
         * <strong>example:</strong>
         * <p>cmjj00xxxx</p>
         */
        @NameInMap("CommodityCode")
        public String commodityCode;

        /**
         * <p>The configuration metadata related to Saas Boost.</p>
         * 
         * <strong>example:</strong>
         * <p>{ // Specifies whether to associate the service with the SaaS Boost commodity. Default value: false. &quot;Enabled&quot;:true/false // The public endpoint of the SaaS Boost instance. &quot;PublicAccessUrl&quot;:&quot;<a href="https://example.com">https://example.com</a>&quot; }</p>
         */
        @NameInMap("SaasBoostMetadata")
        public String saasBoostMetadata;

        /**
         * <p>The platform type. Valid values:</p>
         * <ul>
         * <li>marketplace: Alibaba Cloud Marketplace.</li>
         * <li>Css: Lingxiao.</li>
         * <li>SaasBoost: Saas Boost.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Marketplace</p>
         */
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
         * <li>zh-CN: Chinese.</li>
         * <li>en-US: English.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh-CN</p>
         */
        @NameInMap("Locale")
        public String locale;

        /**
         * <p>The name of the service.</p>
         * 
         * <strong>example:</strong>
         * <p>SpringBoot-ECS容器版</p>
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
         * <p>The approval type for applications for using the service. Valid values:</p>
         * <ul>
         * <li>Manual: The applications are manual reviewed.</li>
         * <li>AutoPass: The applications are automatically approved.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>AutoPass</p>
         */
        @NameInMap("ApprovalType")
        public String approvalType;

        /**
         * <p>The ID of the artifact.</p>
         * 
         * <strong>example:</strong>
         * <p>artifact-21ca53ac16a643xxxxxx</p>
         */
        @NameInMap("ArtifactId")
        public String artifactId;

        /**
         * <p>The version of the artifact.</p>
         * 
         * <strong>example:</strong>
         * <p>draft</p>
         */
        @NameInMap("ArtifactVersion")
        public String artifactVersion;

        /**
         * <p>The informathon for build service.</p>
         * 
         * <strong>example:</strong>
         * <p>{ &quot;RepoUrl&quot;: &quot;<a href="https://github.com/user/repo.git">https://github.com/user/repo.git</a>&quot;, &quot;Brancn&quot;: &quot;main&quot;}</p>
         */
        @NameInMap("BuildInfo")
        public String buildInfo;

        /**
         * <p>The category of the service.</p>
         * 
         * <strong>example:</strong>
         * <p>OpenSource</p>
         */
        @NameInMap("Categories")
        public String categories;

        /**
         * <p>The commodity details.</p>
         */
        @NameInMap("Commodity")
        public ListServicesResponseBodyServicesCommodity commodity;

        /**
         * <p>The commodity code of the service in Alibaba Cloud Marketplace.</p>
         * 
         * <strong>example:</strong>
         * <p>cmjj00xxxx</p>
         */
        @NameInMap("CommodityCode")
        public String commodityCode;

        /**
         * <p>The time when the service was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-05-20T00:00:00Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>Indicates whether the version is the default version. Valid values:</p>
         * <ul>
         * <li>false</li>
         * <li>true</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("DefaultVersion")
        public Boolean defaultVersion;

        /**
         * <p>The deployment type of the service. Valid values:</p>
         * <ul>
         * <li>ros: The service is deployed by using Resource Orchestration Service (ROS).</li>
         * <li>terraform: The service is deployed by using Terraform.</li>
         * <li>spi: The service is deployed by calling the Service Provider Interface (SPI).</li>
         * <li>operation: The service is deployed by using a hosted O\&amp;M service.</li>
         * <li>container: The service is deployed by using a container.</li>
         * <li></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ros</p>
         */
        @NameInMap("DeployType")
        public String deployType;

        /**
         * <p>Indicates whether the service has a beta version. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("HasBeta")
        public Boolean hasBeta;

        /**
         * <p>Indicates whether the service has a draft version. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("HasDraft")
        public Boolean hasDraft;

        /**
         * <p>The latest version of the distribution source service.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("LatestResellSourceServiceVersion")
        public String latestResellSourceServiceVersion;

        /**
         * <p>The time when the service was published.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-05-21T00:00:00Z</p>
         */
        @NameInMap("PublishTime")
        public String publishTime;

        /**
         * <p>The purpose of the artifact. Valid values:</p>
         * <ul>
         * <li>ServiceDeployment: The artifact is used to create service instances.</li>
         * <li>ServiceUpgrade: The artifact is used to upgrade service instances.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ServiceDeployment</p>
         */
        @NameInMap("RelationType")
        public String relationType;

        /**
         * <p>The state of distribution authorization of the service. Valid values:</p>
         * <ul>
         * <li>CanApply: Distributors can apply for distribution permissions.</li>
         * <li>Applied: The application for distribution permissions is submitted.</li>
         * <li>Approved: The application for distribution permissions is approved.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CanApply</p>
         */
        @NameInMap("ResellApplyStatus")
        public String resellApplyStatus;

        /**
         * <p>The ID of the distribution service.</p>
         * 
         * <strong>example:</strong>
         * <p>service-70a3b15bb62643xxxxxx</p>
         */
        @NameInMap("ResellServiceId")
        public String resellServiceId;

        /**
         * <p>The resource group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-aekz5b555xxxxxx</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>Indicates whether the service is visible. Valid values:</p>
         * <ul>
         * <li>INVISIBLE</li>
         * <li>DISCOVERABLE</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>INVISIBLE</p>
         */
        @NameInMap("ServiceDiscoverable")
        public String serviceDiscoverable;

        /**
         * <p>The service ID.</p>
         * 
         * <strong>example:</strong>
         * <p>service-70a3b15bb62643xxxxxx</p>
         */
        @NameInMap("ServiceId")
        public String serviceId;

        /**
         * <p>The information about the service.</p>
         */
        @NameInMap("ServiceInfos")
        public java.util.List<ListServicesResponseBodyServicesServiceInfos> serviceInfos;

        /**
         * <p>The type of the service. Valid values:</p>
         * <ul>
         * <li>private: The service is a private service and is deployed within the account of a customer.</li>
         * <li>managed: The service is a fully managed service and is deployed within the account of a service provider.</li>
         * <li>operation: The service is a hosted O\&amp;M service.</li>
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
         * <li>Public: All users can go to the URL to create a formal service instance or a trial service instance.</li>
         * <li>Restricted: Only users in the whitelist can go to the URL to create a formal service instance or a trial service instance.</li>
         * <li>OnlyFormalRestricted: Only users in the whitelist can go to the URL to create a formal service instance.</li>
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
         * <p>The source image.</p>
         * 
         * <strong>example:</strong>
         * <p>centos_7</p>
         */
        @NameInMap("SourceImage")
        public String sourceImage;

        /**
         * <p>The ID of the distribution source service.</p>
         * 
         * <strong>example:</strong>
         * <p>service-70a3b15bb62643xxxxxx</p>
         */
        @NameInMap("SourceServiceId")
        public String sourceServiceId;

        /**
         * <p>The version of the distribution source service.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("SourceServiceVersion")
        public String sourceServiceVersion;

        /**
         * <p>The name of the distribution source service provider.</p>
         * 
         * <strong>example:</strong>
         * <p>SourceSupplier</p>
         */
        @NameInMap("SourceSupplierName")
        public String sourceSupplierName;

        /**
         * <p>The state of the service. Valid values:</p>
         * <ul>
         * <li>Draft: The service is a draft.</li>
         * <li>Submitted: The service is submitted for review. You cannot modify services in this state.</li>
         * <li>Approved: The service is approved. You cannot modify services in this state. You can publish services in this state.</li>
         * <li>Launching: The service is being published.</li>
         * <li>Online: The service is published.</li>
         * <li>Offline: The service is unpublished.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Online</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The name of the service provider.</p>
         * 
         * <strong>example:</strong>
         * <p>Alibaba Cloud</p>
         */
        @NameInMap("SupplierName")
        public String supplierName;

        /**
         * <p>The URL of the service provider.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://example.com">http://example.com</a></p>
         */
        @NameInMap("SupplierUrl")
        public String supplierUrl;

        /**
         * <p>The service tags.</p>
         */
        @NameInMap("Tags")
        public java.util.List<ListServicesResponseBodyServicesTags> tags;

        /**
         * <p>The tenant type of the managed service. Valid values:</p>
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
         * <p>The time when the service was modified.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-05-21T00:00:00Z</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        /**
         * <p>The version of the service.</p>
         * 
         * <strong>example:</strong>
         * <p>1.0</p>
         */
        @NameInMap("Version")
        public String version;

        /**
         * <p>The custom version name defined by the service provider.</p>
         * 
         * <strong>example:</strong>
         * <p>v2.0.0</p>
         */
        @NameInMap("VersionName")
        public String versionName;

        /**
         * <p>Indicates whether the service is a virtual Internet service. Valid values:</p>
         * <ul>
         * <li>false</li>
         * <li>true</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
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
