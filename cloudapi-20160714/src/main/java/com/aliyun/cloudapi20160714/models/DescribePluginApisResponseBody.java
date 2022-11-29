// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribePluginApisResponseBody extends TeaModel {
    @NameInMap("ApiSummarys")
    public DescribePluginApisResponseBodyApiSummarys apiSummarys;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("ApiId")
        public String apiId;

        @NameInMap("ApiName")
        public String apiName;

        @NameInMap("Description")
        public String description;

        @NameInMap("GroupId")
        public String groupId;

        @NameInMap("GroupName")
        public String groupName;

        @NameInMap("Method")
        public String method;

        @NameInMap("Path")
        public String path;

        @NameInMap("RegionId")
        public String regionId;

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
