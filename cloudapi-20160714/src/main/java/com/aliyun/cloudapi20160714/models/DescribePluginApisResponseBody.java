// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribePluginApisResponseBody extends TeaModel {
    /**
     * <p>The information about APIs.</p>
     */
    @NameInMap("ApiSummarys")
    public DescribePluginApisResponseBodyApiSummarys apiSummarys;

    /**
     * <p>The page number of the page to return.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned per page.</p>
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
     * <p>F9C5C4A5-BC6C-57A3-839F-AB08********</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of returned entries.</p>
     * 
     * <strong>example:</strong>
     * <p>7</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribePluginApisResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePluginApisResponseBody self = new DescribePluginApisResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePluginApisResponseBody setApiSummarys(DescribePluginApisResponseBodyApiSummarys apiSummarys) {
        this.apiSummarys = apiSummarys;
        return this;
    }
    public DescribePluginApisResponseBodyApiSummarys getApiSummarys() {
        return this.apiSummarys;
    }

    public DescribePluginApisResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribePluginApisResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribePluginApisResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribePluginApisResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribePluginApisResponseBodyApiSummarysApiPluginSummary extends TeaModel {
        /**
         * <p>The API ID.</p>
         * 
         * <strong>example:</strong>
         * <p>accc8c68b7294b1cb4928741********</p>
         */
        @NameInMap("ApiId")
        public String apiId;

        /**
         * <p>The API name.</p>
         * 
         * <strong>example:</strong>
         * <p>fhosQueryDayOfStock_V2</p>
         */
        @NameInMap("ApiName")
        public String apiName;

        /**
         * <p>The API description.</p>
         * 
         * <strong>example:</strong>
         * <p>API description</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The ID of the API group.</p>
         * 
         * <strong>example:</strong>
         * <p>5f51f89261854fd9ad5116be********</p>
         */
        @NameInMap("GroupId")
        public String groupId;

        /**
         * <p>The API group to which the API belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>myGroup2</p>
         */
        @NameInMap("GroupName")
        public String groupName;

        /**
         * <p>The HTTP method of the API.</p>
         * 
         * <strong>example:</strong>
         * <p>GET</p>
         */
        @NameInMap("Method")
        public String method;

        /**
         * <p>The request path of the API.</p>
         * 
         * <strong>example:</strong>
         * <p>/mqTest</p>
         */
        @NameInMap("Path")
        public String path;

        /**
         * <p>The ID of the region in which the API resides.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The environment alias.</p>
         * 
         * <strong>example:</strong>
         * <p>Production</p>
         */
        @NameInMap("StageAlias")
        public String stageAlias;

        /**
         * <p>The environment to which the API is published. Valid values:</p>
         * <ul>
         * <li><strong>RELEASE</strong>: the production environment</li>
         * <li><strong>PRE</strong>: the pre-release environment</li>
         * <li><strong>TEST</strong>: the test environment</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>RELEASE</p>
         */
        @NameInMap("StageName")
        public String stageName;

        public static DescribePluginApisResponseBodyApiSummarysApiPluginSummary build(java.util.Map<String, ?> map) throws Exception {
            DescribePluginApisResponseBodyApiSummarysApiPluginSummary self = new DescribePluginApisResponseBodyApiSummarysApiPluginSummary();
            return TeaModel.build(map, self);
        }

        public DescribePluginApisResponseBodyApiSummarysApiPluginSummary setApiId(String apiId) {
            this.apiId = apiId;
            return this;
        }
        public String getApiId() {
            return this.apiId;
        }

        public DescribePluginApisResponseBodyApiSummarysApiPluginSummary setApiName(String apiName) {
            this.apiName = apiName;
            return this;
        }
        public String getApiName() {
            return this.apiName;
        }

        public DescribePluginApisResponseBodyApiSummarysApiPluginSummary setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribePluginApisResponseBodyApiSummarysApiPluginSummary setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public DescribePluginApisResponseBodyApiSummarysApiPluginSummary setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public DescribePluginApisResponseBodyApiSummarysApiPluginSummary setMethod(String method) {
            this.method = method;
            return this;
        }
        public String getMethod() {
            return this.method;
        }

        public DescribePluginApisResponseBodyApiSummarysApiPluginSummary setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public DescribePluginApisResponseBodyApiSummarysApiPluginSummary setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribePluginApisResponseBodyApiSummarysApiPluginSummary setStageAlias(String stageAlias) {
            this.stageAlias = stageAlias;
            return this;
        }
        public String getStageAlias() {
            return this.stageAlias;
        }

        public DescribePluginApisResponseBodyApiSummarysApiPluginSummary setStageName(String stageName) {
            this.stageName = stageName;
            return this;
        }
        public String getStageName() {
            return this.stageName;
        }

    }

    public static class DescribePluginApisResponseBodyApiSummarys extends TeaModel {
        @NameInMap("ApiPluginSummary")
        public java.util.List<DescribePluginApisResponseBodyApiSummarysApiPluginSummary> apiPluginSummary;

        public static DescribePluginApisResponseBodyApiSummarys build(java.util.Map<String, ?> map) throws Exception {
            DescribePluginApisResponseBodyApiSummarys self = new DescribePluginApisResponseBodyApiSummarys();
            return TeaModel.build(map, self);
        }

        public DescribePluginApisResponseBodyApiSummarys setApiPluginSummary(java.util.List<DescribePluginApisResponseBodyApiSummarysApiPluginSummary> apiPluginSummary) {
            this.apiPluginSummary = apiPluginSummary;
            return this;
        }
        public java.util.List<DescribePluginApisResponseBodyApiSummarysApiPluginSummary> getApiPluginSummary() {
            return this.apiPluginSummary;
        }

    }

}
