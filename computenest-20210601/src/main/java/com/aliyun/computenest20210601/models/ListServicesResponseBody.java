// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenest20210601.models;

import com.aliyun.tea.*;

public class ListServicesResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>AAAAAfu+XtuBE55iRLHEYYuojI41</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>3F976EF8-C10A-57DC-917C-BB7BEB508FFB</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Services")
    public java.util.List<ListServicesResponseBodyServices> services;

    /**
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
        @NameInMap("CommodityCode")
        public String commodityCode;

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
         * <p>cloud_ssd</p>
         */
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
         * <p>ComputeNest</p>
         */
        @NameInMap("DeployFrom")
        public String deployFrom;

        /**
         * <strong>example:</strong>
         * <p>ros</p>
         */
        @NameInMap("DeployType")
        public String deployType;

        /**
         * <strong>example:</strong>
         * <p>2022-01-21T10:35:44Z</p>
         */
        @NameInMap("PublishTime")
        public String publishTime;

        /**
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("Score")
        public Integer score;

        /**
         * <strong>example:</strong>
         * <p>service-6b5d632edd394dxxxxxx</p>
         */
        @NameInMap("ServiceId")
        public String serviceId;

        @NameInMap("ServiceInfos")
        public java.util.List<ListServicesResponseBodyServicesServiceInfos> serviceInfos;

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
         * <p>Online</p>
         */
        @NameInMap("Status")
        public String status;

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
        public java.util.List<ListServicesResponseBodyServicesTags> tags;

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
        public String trialDuration;

        /**
         * <strong>example:</strong>
         * <p>Trial</p>
         */
        @NameInMap("TrialType")
        public String trialType;

        /**
         * <strong>example:</strong>
         * <p>4</p>
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
