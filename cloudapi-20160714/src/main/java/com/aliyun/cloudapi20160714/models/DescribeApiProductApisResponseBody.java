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
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>03442A3D-3B7D-434C-8A95-A5FEB989B519</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of returned entries.</p>
     * 
     * <strong>example:</strong>
     * <p>4</p>
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
         * 
         * <strong>example:</strong>
         * <p>dd46297680014a7e8e318308f3345951</p>
         */
        @NameInMap("ApiId")
        public String apiId;

        /**
         * <p>The API name.</p>
         * 
         * <strong>example:</strong>
         * <p>testApi</p>
         */
        @NameInMap("ApiName")
        public String apiName;

        /**
         * <p>The API description.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The ID of the API group.</p>
         * 
         * <strong>example:</strong>
         * <p>1e377f18142345dfb700cd8911c2463a</p>
         */
        @NameInMap("GroupId")
        public String groupId;

        /**
         * <p>The name of the API group to which the API belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>testApiGroup</p>
         */
        @NameInMap("GroupName")
        public String groupName;

        /**
         * <p>The request method of the API.</p>
         * 
         * <strong>example:</strong>
         * <p>POST</p>
         */
        @NameInMap("Method")
        public String method;

        /**
         * <p>The request path of the API.</p>
         * 
         * <strong>example:</strong>
         * <p>/test</p>
         */
        @NameInMap("Path")
        public String path;

        /**
         * <p>The ID of the region where the API is deployed.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The environment to which the API is published. Valid values:</p>
         * <ul>
         * <li><strong>RELEASE</strong>: the production environment</li>
         * <li><strong>PRE</strong>: the staging environment</li>
         * <li><strong>TEST</strong>: the test environment</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>RELEASE</p>
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
