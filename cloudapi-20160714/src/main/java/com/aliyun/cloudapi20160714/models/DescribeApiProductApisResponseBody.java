// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeApiProductApisResponseBody extends TeaModel {
    /**
     * <p>The information about the returned APIs.</p>
     */
    @NameInMap("ApiInfoList")
    public DescribeApiProductApisResponseBodyApiInfoList apiInfoList;

    /**
     * <p>The page number.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of returned entries.</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeApiProductApisResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeApiProductApisResponseBody self = new DescribeApiProductApisResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeApiProductApisResponseBody setApiInfoList(DescribeApiProductApisResponseBodyApiInfoList apiInfoList) {
        this.apiInfoList = apiInfoList;
        return this;
    }
    public DescribeApiProductApisResponseBodyApiInfoList getApiInfoList() {
        return this.apiInfoList;
    }

    public DescribeApiProductApisResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeApiProductApisResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeApiProductApisResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeApiProductApisResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeApiProductApisResponseBodyApiInfoListApiInfo extends TeaModel {
        /**
         * <p>The API ID.</p>
         */
        @NameInMap("ApiId")
        public String apiId;

        /**
         * <p>The API name.</p>
         */
        @NameInMap("ApiName")
        public String apiName;

        /**
         * <p>The API description.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The ID of the API group.</p>
         */
        @NameInMap("GroupId")
        public String groupId;

        /**
         * <p>The name of the API group to which the API belongs.</p>
         */
        @NameInMap("GroupName")
        public String groupName;

        /**
         * <p>The request method of the API.</p>
         */
        @NameInMap("Method")
        public String method;

        /**
         * <p>The request path of the API.</p>
         */
        @NameInMap("Path")
        public String path;

        /**
         * <p>The ID of the region where the API is deployed.</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The environment to which the API is published. Valid values:</p>
         * <br>
         * <p>*   **RELEASE**: the production environment</p>
         * <p>*   **PRE**: the staging environment</p>
         * <p>*   **TEST**: the test environment</p>
         */
        @NameInMap("StageName")
        public String stageName;

        public static DescribeApiProductApisResponseBodyApiInfoListApiInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeApiProductApisResponseBodyApiInfoListApiInfo self = new DescribeApiProductApisResponseBodyApiInfoListApiInfo();
            return TeaModel.build(map, self);
        }

        public DescribeApiProductApisResponseBodyApiInfoListApiInfo setApiId(String apiId) {
            this.apiId = apiId;
            return this;
        }
        public String getApiId() {
            return this.apiId;
        }

        public DescribeApiProductApisResponseBodyApiInfoListApiInfo setApiName(String apiName) {
            this.apiName = apiName;
            return this;
        }
        public String getApiName() {
            return this.apiName;
        }

        public DescribeApiProductApisResponseBodyApiInfoListApiInfo setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeApiProductApisResponseBodyApiInfoListApiInfo setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public DescribeApiProductApisResponseBodyApiInfoListApiInfo setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public DescribeApiProductApisResponseBodyApiInfoListApiInfo setMethod(String method) {
            this.method = method;
            return this;
        }
        public String getMethod() {
            return this.method;
        }

        public DescribeApiProductApisResponseBodyApiInfoListApiInfo setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public DescribeApiProductApisResponseBodyApiInfoListApiInfo setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeApiProductApisResponseBodyApiInfoListApiInfo setStageName(String stageName) {
            this.stageName = stageName;
            return this;
        }
        public String getStageName() {
            return this.stageName;
        }

    }

    public static class DescribeApiProductApisResponseBodyApiInfoList extends TeaModel {
        @NameInMap("ApiInfo")
        public java.util.List<DescribeApiProductApisResponseBodyApiInfoListApiInfo> apiInfo;

        public static DescribeApiProductApisResponseBodyApiInfoList build(java.util.Map<String, ?> map) throws Exception {
            DescribeApiProductApisResponseBodyApiInfoList self = new DescribeApiProductApisResponseBodyApiInfoList();
            return TeaModel.build(map, self);
        }

        public DescribeApiProductApisResponseBodyApiInfoList setApiInfo(java.util.List<DescribeApiProductApisResponseBodyApiInfoListApiInfo> apiInfo) {
            this.apiInfo = apiInfo;
            return this;
        }
        public java.util.List<DescribeApiProductApisResponseBodyApiInfoListApiInfo> getApiInfo() {
            return this.apiInfo;
        }

    }

}
