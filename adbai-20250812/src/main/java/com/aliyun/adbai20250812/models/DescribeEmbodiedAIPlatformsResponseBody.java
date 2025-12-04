// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adbai20250812.models;

import com.aliyun.tea.*;

public class DescribeEmbodiedAIPlatformsResponseBody extends TeaModel {
    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("Platforms")
    public java.util.List<DescribeEmbodiedAIPlatformsResponseBodyPlatforms> platforms;

    /**
     * <strong>example:</strong>
     * <p>B47EED99-BFA5-529D-8D85-A6642421D390</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static DescribeEmbodiedAIPlatformsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeEmbodiedAIPlatformsResponseBody self = new DescribeEmbodiedAIPlatformsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeEmbodiedAIPlatformsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeEmbodiedAIPlatformsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeEmbodiedAIPlatformsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeEmbodiedAIPlatformsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeEmbodiedAIPlatformsResponseBody setPlatforms(java.util.List<DescribeEmbodiedAIPlatformsResponseBodyPlatforms> platforms) {
        this.platforms = platforms;
        return this;
    }
    public java.util.List<DescribeEmbodiedAIPlatformsResponseBodyPlatforms> getPlatforms() {
        return this.platforms;
    }

    public DescribeEmbodiedAIPlatformsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeEmbodiedAIPlatformsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeEmbodiedAIPlatformsResponseBodyPlatformsEapConfig extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p><a href="http://amv-2z******-***-roboto.ads.example.com:80">http://amv-2z******-***-roboto.ads.example.com:80</a></p>
         */
        @NameInMap("WebserverAddress")
        public String webserverAddress;

        /**
         * <strong>example:</strong>
         * <p>large</p>
         */
        @NameInMap("WebserverSpecName")
        public String webserverSpecName;

        public static DescribeEmbodiedAIPlatformsResponseBodyPlatformsEapConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeEmbodiedAIPlatformsResponseBodyPlatformsEapConfig self = new DescribeEmbodiedAIPlatformsResponseBodyPlatformsEapConfig();
            return TeaModel.build(map, self);
        }

        public DescribeEmbodiedAIPlatformsResponseBodyPlatformsEapConfig setWebserverAddress(String webserverAddress) {
            this.webserverAddress = webserverAddress;
            return this;
        }
        public String getWebserverAddress() {
            return this.webserverAddress;
        }

        public DescribeEmbodiedAIPlatformsResponseBodyPlatformsEapConfig setWebserverSpecName(String webserverSpecName) {
            this.webserverSpecName = webserverSpecName;
            return this;
        }
        public String getWebserverSpecName() {
            return this.webserverSpecName;
        }

    }

    public static class DescribeEmbodiedAIPlatformsResponseBodyPlatformsRayConfigWorkerGroups extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("AllocateUnit")
        public String allocateUnit;

        /**
         * <strong>example:</strong>
         * <p>worker1</p>
         */
        @NameInMap("GroupName")
        public String groupName;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("MaxWorkerQuantity")
        public Integer maxWorkerQuantity;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("MinWorkerQuantity")
        public Integer minWorkerQuantity;

        /**
         * <strong>example:</strong>
         * <p>100G</p>
         */
        @NameInMap("WorkerDiskCapacity")
        public String workerDiskCapacity;

        /**
         * <strong>example:</strong>
         * <p>large</p>
         */
        @NameInMap("WorkerSpecName")
        public String workerSpecName;

        /**
         * <strong>example:</strong>
         * <p>CPU</p>
         */
        @NameInMap("WorkerSpecType")
        public String workerSpecType;

        public static DescribeEmbodiedAIPlatformsResponseBodyPlatformsRayConfigWorkerGroups build(java.util.Map<String, ?> map) throws Exception {
            DescribeEmbodiedAIPlatformsResponseBodyPlatformsRayConfigWorkerGroups self = new DescribeEmbodiedAIPlatformsResponseBodyPlatformsRayConfigWorkerGroups();
            return TeaModel.build(map, self);
        }

        public DescribeEmbodiedAIPlatformsResponseBodyPlatformsRayConfigWorkerGroups setAllocateUnit(String allocateUnit) {
            this.allocateUnit = allocateUnit;
            return this;
        }
        public String getAllocateUnit() {
            return this.allocateUnit;
        }

        public DescribeEmbodiedAIPlatformsResponseBodyPlatformsRayConfigWorkerGroups setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public DescribeEmbodiedAIPlatformsResponseBodyPlatformsRayConfigWorkerGroups setMaxWorkerQuantity(Integer maxWorkerQuantity) {
            this.maxWorkerQuantity = maxWorkerQuantity;
            return this;
        }
        public Integer getMaxWorkerQuantity() {
            return this.maxWorkerQuantity;
        }

        public DescribeEmbodiedAIPlatformsResponseBodyPlatformsRayConfigWorkerGroups setMinWorkerQuantity(Integer minWorkerQuantity) {
            this.minWorkerQuantity = minWorkerQuantity;
            return this;
        }
        public Integer getMinWorkerQuantity() {
            return this.minWorkerQuantity;
        }

        public DescribeEmbodiedAIPlatformsResponseBodyPlatformsRayConfigWorkerGroups setWorkerDiskCapacity(String workerDiskCapacity) {
            this.workerDiskCapacity = workerDiskCapacity;
            return this;
        }
        public String getWorkerDiskCapacity() {
            return this.workerDiskCapacity;
        }

        public DescribeEmbodiedAIPlatformsResponseBodyPlatformsRayConfigWorkerGroups setWorkerSpecName(String workerSpecName) {
            this.workerSpecName = workerSpecName;
            return this;
        }
        public String getWorkerSpecName() {
            return this.workerSpecName;
        }

        public DescribeEmbodiedAIPlatformsResponseBodyPlatformsRayConfigWorkerGroups setWorkerSpecType(String workerSpecType) {
            this.workerSpecType = workerSpecType;
            return this;
        }
        public String getWorkerSpecType() {
            return this.workerSpecType;
        }

    }

    public static class DescribeEmbodiedAIPlatformsResponseBodyPlatformsRayConfig extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>BASIC</p>
         */
        @NameInMap("Category")
        public String category;

        /**
         * <strong>example:</strong>
         * <p>100G</p>
         */
        @NameInMap("HeadDiskCapacity")
        public String headDiskCapacity;

        /**
         * <strong>example:</strong>
         * <p>large</p>
         */
        @NameInMap("HeadSpec")
        public String headSpec;

        /**
         * <strong>example:</strong>
         * <p>CPU</p>
         */
        @NameInMap("HeadSpecType")
        public String headSpecType;

        /**
         * <strong>example:</strong>
         * <p><a href="http://ray-cluster-address.example.com">http://ray-cluster-address.example.com</a></p>
         */
        @NameInMap("RayClusterAddress")
        public String rayClusterAddress;

        /**
         * <strong>example:</strong>
         * <p><a href="http://ray-dashboard-address.example.com">http://ray-dashboard-address.example.com</a></p>
         */
        @NameInMap("RayDashboardAddress")
        public String rayDashboardAddress;

        /**
         * <strong>example:</strong>
         * <p><a href="http://ray-grafana-address.example.com">http://ray-grafana-address.example.com</a></p>
         */
        @NameInMap("RayGrafanaAddress")
        public String rayGrafanaAddress;

        @NameInMap("WorkerGroups")
        public java.util.List<DescribeEmbodiedAIPlatformsResponseBodyPlatformsRayConfigWorkerGroups> workerGroups;

        public static DescribeEmbodiedAIPlatformsResponseBodyPlatformsRayConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeEmbodiedAIPlatformsResponseBodyPlatformsRayConfig self = new DescribeEmbodiedAIPlatformsResponseBodyPlatformsRayConfig();
            return TeaModel.build(map, self);
        }

        public DescribeEmbodiedAIPlatformsResponseBodyPlatformsRayConfig setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public DescribeEmbodiedAIPlatformsResponseBodyPlatformsRayConfig setHeadDiskCapacity(String headDiskCapacity) {
            this.headDiskCapacity = headDiskCapacity;
            return this;
        }
        public String getHeadDiskCapacity() {
            return this.headDiskCapacity;
        }

        public DescribeEmbodiedAIPlatformsResponseBodyPlatformsRayConfig setHeadSpec(String headSpec) {
            this.headSpec = headSpec;
            return this;
        }
        public String getHeadSpec() {
            return this.headSpec;
        }

        public DescribeEmbodiedAIPlatformsResponseBodyPlatformsRayConfig setHeadSpecType(String headSpecType) {
            this.headSpecType = headSpecType;
            return this;
        }
        public String getHeadSpecType() {
            return this.headSpecType;
        }

        public DescribeEmbodiedAIPlatformsResponseBodyPlatformsRayConfig setRayClusterAddress(String rayClusterAddress) {
            this.rayClusterAddress = rayClusterAddress;
            return this;
        }
        public String getRayClusterAddress() {
            return this.rayClusterAddress;
        }

        public DescribeEmbodiedAIPlatformsResponseBodyPlatformsRayConfig setRayDashboardAddress(String rayDashboardAddress) {
            this.rayDashboardAddress = rayDashboardAddress;
            return this;
        }
        public String getRayDashboardAddress() {
            return this.rayDashboardAddress;
        }

        public DescribeEmbodiedAIPlatformsResponseBodyPlatformsRayConfig setRayGrafanaAddress(String rayGrafanaAddress) {
            this.rayGrafanaAddress = rayGrafanaAddress;
            return this;
        }
        public String getRayGrafanaAddress() {
            return this.rayGrafanaAddress;
        }

        public DescribeEmbodiedAIPlatformsResponseBodyPlatformsRayConfig setWorkerGroups(java.util.List<DescribeEmbodiedAIPlatformsResponseBodyPlatformsRayConfigWorkerGroups> workerGroups) {
            this.workerGroups = workerGroups;
            return this;
        }
        public java.util.List<DescribeEmbodiedAIPlatformsResponseBodyPlatformsRayConfigWorkerGroups> getWorkerGroups() {
            return this.workerGroups;
        }

    }

    public static class DescribeEmbodiedAIPlatformsResponseBodyPlatforms extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2025-12-01 14:55:36</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("EapConfig")
        public DescribeEmbodiedAIPlatformsResponseBodyPlatformsEapConfig eapConfig;

        /**
         * <strong>example:</strong>
         * <p>adb-lake-cn-beijing-5q1w******</p>
         */
        @NameInMap("OssBucketName")
        public String ossBucketName;

        /**
         * <strong>example:</strong>
         * <p>platform1</p>
         */
        @NameInMap("PlatformName")
        public String platformName;

        @NameInMap("RayConfig")
        public DescribeEmbodiedAIPlatformsResponseBodyPlatformsRayConfig rayConfig;

        /**
         * <strong>example:</strong>
         * <p>running</p>
         */
        @NameInMap("State")
        public String state;

        public static DescribeEmbodiedAIPlatformsResponseBodyPlatforms build(java.util.Map<String, ?> map) throws Exception {
            DescribeEmbodiedAIPlatformsResponseBodyPlatforms self = new DescribeEmbodiedAIPlatformsResponseBodyPlatforms();
            return TeaModel.build(map, self);
        }

        public DescribeEmbodiedAIPlatformsResponseBodyPlatforms setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public DescribeEmbodiedAIPlatformsResponseBodyPlatforms setEapConfig(DescribeEmbodiedAIPlatformsResponseBodyPlatformsEapConfig eapConfig) {
            this.eapConfig = eapConfig;
            return this;
        }
        public DescribeEmbodiedAIPlatformsResponseBodyPlatformsEapConfig getEapConfig() {
            return this.eapConfig;
        }

        public DescribeEmbodiedAIPlatformsResponseBodyPlatforms setOssBucketName(String ossBucketName) {
            this.ossBucketName = ossBucketName;
            return this;
        }
        public String getOssBucketName() {
            return this.ossBucketName;
        }

        public DescribeEmbodiedAIPlatformsResponseBodyPlatforms setPlatformName(String platformName) {
            this.platformName = platformName;
            return this;
        }
        public String getPlatformName() {
            return this.platformName;
        }

        public DescribeEmbodiedAIPlatformsResponseBodyPlatforms setRayConfig(DescribeEmbodiedAIPlatformsResponseBodyPlatformsRayConfig rayConfig) {
            this.rayConfig = rayConfig;
            return this;
        }
        public DescribeEmbodiedAIPlatformsResponseBodyPlatformsRayConfig getRayConfig() {
            return this.rayConfig;
        }

        public DescribeEmbodiedAIPlatformsResponseBodyPlatforms setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

    }

}
