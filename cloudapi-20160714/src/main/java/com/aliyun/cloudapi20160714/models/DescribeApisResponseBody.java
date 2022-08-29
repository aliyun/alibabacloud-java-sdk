// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeApisResponseBody extends TeaModel {
    @NameInMap("ApiSummarys")
    public DescribeApisResponseBodyApiSummarys apiSummarys;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeApisResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeApisResponseBody self = new DescribeApisResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeApisResponseBody setApiSummarys(DescribeApisResponseBodyApiSummarys apiSummarys) {
        this.apiSummarys = apiSummarys;
        return this;
    }
    public DescribeApisResponseBodyApiSummarys getApiSummarys() {
        return this.apiSummarys;
    }

    public DescribeApisResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeApisResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeApisResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeApisResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeApisResponseBodyApiSummarysApiSummary extends TeaModel {
        @NameInMap("ApiId")
        public String apiId;

        @NameInMap("ApiMethod")
        public String apiMethod;

        @NameInMap("ApiName")
        public String apiName;

        @NameInMap("ApiPath")
        public String apiPath;

        @NameInMap("CreatedTime")
        public String createdTime;

        @NameInMap("Description")
        public String description;

        @NameInMap("GroupId")
        public String groupId;

        @NameInMap("GroupName")
        public String groupName;

        @NameInMap("ModifiedTime")
        public String modifiedTime;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("Visibility")
        public String visibility;

        public static DescribeApisResponseBodyApiSummarysApiSummary build(java.util.Map<String, ?> map) throws Exception {
            DescribeApisResponseBodyApiSummarysApiSummary self = new DescribeApisResponseBodyApiSummarysApiSummary();
            return TeaModel.build(map, self);
        }

        public DescribeApisResponseBodyApiSummarysApiSummary setApiId(String apiId) {
            this.apiId = apiId;
            return this;
        }
        public String getApiId() {
            return this.apiId;
        }

        public DescribeApisResponseBodyApiSummarysApiSummary setApiMethod(String apiMethod) {
            this.apiMethod = apiMethod;
            return this;
        }
        public String getApiMethod() {
            return this.apiMethod;
        }

        public DescribeApisResponseBodyApiSummarysApiSummary setApiName(String apiName) {
            this.apiName = apiName;
            return this;
        }
        public String getApiName() {
            return this.apiName;
        }

        public DescribeApisResponseBodyApiSummarysApiSummary setApiPath(String apiPath) {
            this.apiPath = apiPath;
            return this;
        }
        public String getApiPath() {
            return this.apiPath;
        }

        public DescribeApisResponseBodyApiSummarysApiSummary setCreatedTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public String getCreatedTime() {
            return this.createdTime;
        }

        public DescribeApisResponseBodyApiSummarysApiSummary setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeApisResponseBodyApiSummarysApiSummary setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public DescribeApisResponseBodyApiSummarysApiSummary setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public DescribeApisResponseBodyApiSummarysApiSummary setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public DescribeApisResponseBodyApiSummarysApiSummary setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeApisResponseBodyApiSummarysApiSummary setVisibility(String visibility) {
            this.visibility = visibility;
            return this;
        }
        public String getVisibility() {
            return this.visibility;
        }

    }

    public static class DescribeApisResponseBodyApiSummarys extends TeaModel {
        @NameInMap("ApiSummary")
        public java.util.List<DescribeApisResponseBodyApiSummarysApiSummary> apiSummary;

        public static DescribeApisResponseBodyApiSummarys build(java.util.Map<String, ?> map) throws Exception {
            DescribeApisResponseBodyApiSummarys self = new DescribeApisResponseBodyApiSummarys();
            return TeaModel.build(map, self);
        }

        public DescribeApisResponseBodyApiSummarys setApiSummary(java.util.List<DescribeApisResponseBodyApiSummarysApiSummary> apiSummary) {
            this.apiSummary = apiSummary;
            return this;
        }
        public java.util.List<DescribeApisResponseBodyApiSummarysApiSummary> getApiSummary() {
            return this.apiSummary;
        }

    }

}
