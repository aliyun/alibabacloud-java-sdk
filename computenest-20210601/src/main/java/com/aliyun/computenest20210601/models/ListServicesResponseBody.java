// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenest20210601.models;

import com.aliyun.tea.*;

public class ListServicesResponseBody extends TeaModel {
    /**
     * <p>The number of entries returned per page. Maximum value: 100. Default value: 20.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token for the next query.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAfu+XtuBE55iRLHEYYuojI41</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>3F976EF8-C10A-57DC-917C-BB7BEB508FFB</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The list of services.</p>
     */
    @NameInMap("Services")
    public java.util.List<ListServicesResponseBodyServices> services;

    /**
     * <p>The total number of results.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
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
         * <p>The commodity specification code.</p>
         * 
         * <strong>example:</strong>
         * <p>cmjj00****</p>
         */
        @NameInMap("CommodityCode")
        public String commodityCode;

        /**
         * <p>The deployment page.</p>
         * 
         * <strong>example:</strong>
         * <p>Order: Order page
         * Detail: Details page</p>
         */
        @NameInMap("DeployPage")
        public String deployPage;

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

        public ListServicesResponseBodyServicesCommodity setDeployPage(String deployPage) {
            this.deployPage = deployPage;
            return this;
        }
        public String getDeployPage() {
            return this.deployPage;
        }

    }

    public static class ListServicesResponseBodyServicesServiceInfosSoftwares extends TeaModel {
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

        public static ListServicesResponseBodyServicesServiceInfosSoftwares build(java.util.Map<String, ?> map) throws Exception {
            ListServicesResponseBodyServicesServiceInfosSoftwares self = new ListServicesResponseBodyServicesServiceInfosSoftwares();
            return TeaModel.build(map, self);
        }

        public ListServicesResponseBodyServicesServiceInfosSoftwares setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListServicesResponseBodyServicesServiceInfosSoftwares setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
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
         * <p>The service overview.</p>
         * 
         * <strong>example:</strong>
         * <p>B is an open-source distributed relational database independently designed and developed by Company A.</p>
         */
        @NameInMap("ShortDescription")
        public String shortDescription;

        /**
         * <p>The software information of the service.</p>
         */
        @NameInMap("Softwares")
        public java.util.List<ListServicesResponseBodyServicesServiceInfosSoftwares> softwares;

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

        public ListServicesResponseBodyServicesServiceInfos setSoftwares(java.util.List<ListServicesResponseBodyServicesServiceInfosSoftwares> softwares) {
            this.softwares = softwares;
            return this;
        }
        public java.util.List<ListServicesResponseBodyServicesServiceInfosSoftwares> getSoftwares() {
            return this.softwares;
        }

    }

    public static class ListServicesResponseBodyServicesServiceLocaleConfigs extends TeaModel {
        /**
         * <p>The English value of the business information.</p>
         * 
         * <strong>example:</strong>
         * <p>Service Name</p>
         */
        @NameInMap("EnValue")
        public String enValue;

        /**
         * <p>The raw data value of the business information.</p>
         * 
         * <strong>example:</strong>
         * <p>Service Name</p>
         */
        @NameInMap("OriginalValue")
        public String originalValue;

        /**
         * <p>The Chinese value of the business information.</p>
         * 
         * <strong>example:</strong>
         * <p>服务名称</p>
         */
        @NameInMap("ZhValue")
        public String zhValue;

        public static ListServicesResponseBodyServicesServiceLocaleConfigs build(java.util.Map<String, ?> map) throws Exception {
            ListServicesResponseBodyServicesServiceLocaleConfigs self = new ListServicesResponseBodyServicesServiceLocaleConfigs();
            return TeaModel.build(map, self);
        }

        public ListServicesResponseBodyServicesServiceLocaleConfigs setEnValue(String enValue) {
            this.enValue = enValue;
            return this;
        }
        public String getEnValue() {
            return this.enValue;
        }

        public ListServicesResponseBodyServicesServiceLocaleConfigs setOriginalValue(String originalValue) {
            this.originalValue = originalValue;
            return this;
        }
        public String getOriginalValue() {
            return this.originalValue;
        }

        public ListServicesResponseBodyServicesServiceLocaleConfigs setZhValue(String zhValue) {
            this.zhValue = zhValue;
            return this;
        }
        public String getZhValue() {
            return this.zhValue;
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
         * <p>The category of the data disk. Valid values:</p>
         * <ul>
         * <li><p>cloud_efficiency: ultra disk.</p>
         * </li>
         * <li><p>cloud_ssd: standard SSD.</p>
         * </li>
         * <li><p>cloud_essd: ESSD.</p>
         * </li>
         * <li><p>cloud: basic disk.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cloud_ssd</p>
         */
        @NameInMap("Categories")
        public String categories;

        /**
         * <p>The commodity specifications.</p>
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
         * <p>The deployment source of the service. Valid values:</p>
         * <ul>
         * <li><p>NoWhere: The service has no deployment source.</p>
         * </li>
         * <li><p>Marketplace: The service is deployed from Alibaba Cloud Marketplace.</p>
         * </li>
         * <li><p>ComputeNest: The service is deployed from Compute Nest.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ComputeNest</p>
         */
        @NameInMap("DeployFrom")
        public String deployFrom;

        /**
         * <p>The deployment type. Valid values:</p>
         * <ul>
         * <li><p>ros: The service is deployed using ROS.</p>
         * </li>
         * <li><p>terraform: The service is deployed using Terraform.</p>
         * </li>
         * <li><p>spi: The service is deployed by calling SPI.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ros</p>
         */
        @NameInMap("DeployType")
        public String deployType;

        /**
         * <p>The time when the service was published.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-01-21T10:35:44Z</p>
         */
        @NameInMap("PublishTime")
        public String publishTime;

        /**
         * <p>The service score.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("Score")
        public Integer score;

        /**
         * <p>The service ID.</p>
         * 
         * <strong>example:</strong>
         * <p>service-6b5d632edd394dxxxxxx</p>
         */
        @NameInMap("ServiceId")
        public String serviceId;

        /**
         * <p>The service information.</p>
         */
        @NameInMap("ServiceInfos")
        public java.util.List<ListServicesResponseBodyServicesServiceInfos> serviceInfos;

        /**
         * <p>The multi-language configurations of the service.</p>
         */
        @NameInMap("ServiceLocaleConfigs")
        public java.util.List<ListServicesResponseBodyServicesServiceLocaleConfigs> serviceLocaleConfigs;

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
         * <p>The service status. Valid values:</p>
         * <ul>
         * <li><p>Draft: The service is in the draft state.</p>
         * </li>
         * <li><p>Submitted: The service is submitted for review. You cannot modify the service.</p>
         * </li>
         * <li><p>Approved: The service is approved. You cannot modify the service, but you can publish it.</p>
         * </li>
         * <li><p>Launching: The service is being published.</p>
         * </li>
         * <li><p>Online: The service is published.</p>
         * </li>
         * <li><p>Offline: The service is unpublished.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Online</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The service provider name.</p>
         * 
         * <strong>example:</strong>
         * <p>Company A Ltd.</p>
         */
        @NameInMap("SupplierName")
        public String supplierName;

        /**
         * <p>The English name of the service provider.</p>
         * 
         * <strong>example:</strong>
         * <p>Alibaba Cloud</p>
         */
        @NameInMap("SupplierNameEng")
        public String supplierNameEng;

        /**
         * <p>The Alibaba Cloud account ID of the service provider.</p>
         * 
         * <strong>example:</strong>
         * <p>1436322xxxxx</p>
         */
        @NameInMap("SupplierUid")
        public Long supplierUid;

        /**
         * <p>The service provider\&quot;s URL.</p>
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
         * <p>The tenant type. Valid values:</p>
         * <ul>
         * <li><p>SingleTenant: single-tenant.</p>
         * </li>
         * <li><p>MultiTenant: multi-tenant.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SingleTenant</p>
         */
        @NameInMap("TenantType")
        public String tenantType;

        /**
         * <p>The trial duration. Unit: days. The maximum trial duration is 30 days.</p>
         * 
         * <strong>example:</strong>
         * <p>7</p>
         */
        @NameInMap("TrialDuration")
        public String trialDuration;

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
         * <p>4</p>
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
         * <li><p>false: No.</p>
         * </li>
         * <li><p>true: Yes.</p>
         * </li>
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

        public ListServicesResponseBodyServices setDeployFrom(String deployFrom) {
            this.deployFrom = deployFrom;
            return this;
        }
        public String getDeployFrom() {
            return this.deployFrom;
        }

        public ListServicesResponseBodyServices setDeployType(String deployType) {
            this.deployType = deployType;
            return this;
        }
        public String getDeployType() {
            return this.deployType;
        }

        public ListServicesResponseBodyServices setPublishTime(String publishTime) {
            this.publishTime = publishTime;
            return this;
        }
        public String getPublishTime() {
            return this.publishTime;
        }

        public ListServicesResponseBodyServices setScore(Integer score) {
            this.score = score;
            return this;
        }
        public Integer getScore() {
            return this.score;
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

        public ListServicesResponseBodyServices setServiceLocaleConfigs(java.util.List<ListServicesResponseBodyServicesServiceLocaleConfigs> serviceLocaleConfigs) {
            this.serviceLocaleConfigs = serviceLocaleConfigs;
            return this;
        }
        public java.util.List<ListServicesResponseBodyServicesServiceLocaleConfigs> getServiceLocaleConfigs() {
            return this.serviceLocaleConfigs;
        }

        public ListServicesResponseBodyServices setServiceProductUrl(String serviceProductUrl) {
            this.serviceProductUrl = serviceProductUrl;
            return this;
        }
        public String getServiceProductUrl() {
            return this.serviceProductUrl;
        }

        public ListServicesResponseBodyServices setServiceType(String serviceType) {
            this.serviceType = serviceType;
            return this;
        }
        public String getServiceType() {
            return this.serviceType;
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

        public ListServicesResponseBodyServices setSupplierNameEng(String supplierNameEng) {
            this.supplierNameEng = supplierNameEng;
            return this;
        }
        public String getSupplierNameEng() {
            return this.supplierNameEng;
        }

        public ListServicesResponseBodyServices setSupplierUid(Long supplierUid) {
            this.supplierUid = supplierUid;
            return this;
        }
        public Long getSupplierUid() {
            return this.supplierUid;
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

        public ListServicesResponseBodyServices setTrialDuration(String trialDuration) {
            this.trialDuration = trialDuration;
            return this;
        }
        public String getTrialDuration() {
            return this.trialDuration;
        }

        public ListServicesResponseBodyServices setTrialType(String trialType) {
            this.trialType = trialType;
            return this;
        }
        public String getTrialType() {
            return this.trialType;
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
