// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeApisByIpControlResponseBody extends TeaModel {
    /**
     * <p>Indicates whether the API is public. Valid values:</p>
     * <br>
     * <p>*   **PUBLIC**</p>
     * <p>*   **PRIVATE**</p>
     */
    @NameInMap("ApiInfos")
    public DescribeApisByIpControlResponseBodyApiInfos apiInfos;

    /**
     * <p>The number of entries returned per page.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The returned API information. It is an array consisting of ApiInfo data.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The total number of returned entries.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The binding time of the API.</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeApisByIpControlResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeApisByIpControlResponseBody self = new DescribeApisByIpControlResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeApisByIpControlResponseBody setApiInfos(DescribeApisByIpControlResponseBodyApiInfos apiInfos) {
        this.apiInfos = apiInfos;
        return this;
    }
    public DescribeApisByIpControlResponseBodyApiInfos getApiInfos() {
        return this.apiInfos;
    }

    public DescribeApisByIpControlResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeApisByIpControlResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeApisByIpControlResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeApisByIpControlResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeApisByIpControlResponseBodyApiInfosApiInfo extends TeaModel {
        /**
         * <p>Description</p>
         */
        @NameInMap("ApiId")
        public String apiId;

        /**
         * <p>*   This API is intended for API providers.</p>
         * <p>*   You can specify PageNumber to obtain the result on the specified page.</p>
         */
        @NameInMap("ApiName")
        public String apiName;

        /**
         * <p>The ID of the API.</p>
         */
        @NameInMap("BoundTime")
        public String boundTime;

        /**
         * <p>The name of the API group.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The API operation.</p>
         */
        @NameInMap("GroupId")
        public String groupId;

        /**
         * <p>The name of the runtime environment. Valid values:</p>
         * <br>
         * <p>*   **RELEASE**</p>
         * <p>*   **TEST**</p>
         */
        @NameInMap("GroupName")
        public String groupName;

        /**
         * <p>Queries the APIs that are bound to an access control list (ACL).</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The region where the API is located.</p>
         */
        @NameInMap("StageName")
        public String stageName;

        /**
         * <p>The description of the API.</p>
         */
        @NameInMap("Visibility")
        public String visibility;

        public static DescribeApisByIpControlResponseBodyApiInfosApiInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeApisByIpControlResponseBodyApiInfosApiInfo self = new DescribeApisByIpControlResponseBodyApiInfosApiInfo();
            return TeaModel.build(map, self);
        }

        public DescribeApisByIpControlResponseBodyApiInfosApiInfo setApiId(String apiId) {
            this.apiId = apiId;
            return this;
        }
        public String getApiId() {
            return this.apiId;
        }

        public DescribeApisByIpControlResponseBodyApiInfosApiInfo setApiName(String apiName) {
            this.apiName = apiName;
            return this;
        }
        public String getApiName() {
            return this.apiName;
        }

        public DescribeApisByIpControlResponseBodyApiInfosApiInfo setBoundTime(String boundTime) {
            this.boundTime = boundTime;
            return this;
        }
        public String getBoundTime() {
            return this.boundTime;
        }

        public DescribeApisByIpControlResponseBodyApiInfosApiInfo setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeApisByIpControlResponseBodyApiInfosApiInfo setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public DescribeApisByIpControlResponseBodyApiInfosApiInfo setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public DescribeApisByIpControlResponseBodyApiInfosApiInfo setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeApisByIpControlResponseBodyApiInfosApiInfo setStageName(String stageName) {
            this.stageName = stageName;
            return this;
        }
        public String getStageName() {
            return this.stageName;
        }

        public DescribeApisByIpControlResponseBodyApiInfosApiInfo setVisibility(String visibility) {
            this.visibility = visibility;
            return this;
        }
        public String getVisibility() {
            return this.visibility;
        }

    }

    public static class DescribeApisByIpControlResponseBodyApiInfos extends TeaModel {
        @NameInMap("ApiInfo")
        public java.util.List<DescribeApisByIpControlResponseBodyApiInfosApiInfo> apiInfo;

        public static DescribeApisByIpControlResponseBodyApiInfos build(java.util.Map<String, ?> map) throws Exception {
            DescribeApisByIpControlResponseBodyApiInfos self = new DescribeApisByIpControlResponseBodyApiInfos();
            return TeaModel.build(map, self);
        }

        public DescribeApisByIpControlResponseBodyApiInfos setApiInfo(java.util.List<DescribeApisByIpControlResponseBodyApiInfosApiInfo> apiInfo) {
            this.apiInfo = apiInfo;
            return this;
        }
        public java.util.List<DescribeApisByIpControlResponseBodyApiInfosApiInfo> getApiInfo() {
            return this.apiInfo;
        }

    }

}
