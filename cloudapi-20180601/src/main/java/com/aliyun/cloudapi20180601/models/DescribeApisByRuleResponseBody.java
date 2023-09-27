// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20180601.models;

import com.aliyun.tea.*;

public class DescribeApisByRuleResponseBody extends TeaModel {
    @NameInMap("ApiInfos")
    public DescribeApisByRuleResponseBodyApiInfos apiInfos;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeApisByRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeApisByRuleResponseBody self = new DescribeApisByRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeApisByRuleResponseBody setApiInfos(DescribeApisByRuleResponseBodyApiInfos apiInfos) {
        this.apiInfos = apiInfos;
        return this;
    }
    public DescribeApisByRuleResponseBodyApiInfos getApiInfos() {
        return this.apiInfos;
    }

    public DescribeApisByRuleResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeApisByRuleResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeApisByRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeApisByRuleResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeApisByRuleResponseBodyApiInfosApiInfo extends TeaModel {
        @NameInMap("ApiId")
        public String apiId;

        @NameInMap("ApiName")
        public String apiName;

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

        @NameInMap("StageName")
        public String stageName;

        @NameInMap("Visibility")
        public String visibility;

        public static DescribeApisByRuleResponseBodyApiInfosApiInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeApisByRuleResponseBodyApiInfosApiInfo self = new DescribeApisByRuleResponseBodyApiInfosApiInfo();
            return TeaModel.build(map, self);
        }

        public DescribeApisByRuleResponseBodyApiInfosApiInfo setApiId(String apiId) {
            this.apiId = apiId;
            return this;
        }
        public String getApiId() {
            return this.apiId;
        }

        public DescribeApisByRuleResponseBodyApiInfosApiInfo setApiName(String apiName) {
            this.apiName = apiName;
            return this;
        }
        public String getApiName() {
            return this.apiName;
        }

        public DescribeApisByRuleResponseBodyApiInfosApiInfo setCreatedTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public String getCreatedTime() {
            return this.createdTime;
        }

        public DescribeApisByRuleResponseBodyApiInfosApiInfo setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeApisByRuleResponseBodyApiInfosApiInfo setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public DescribeApisByRuleResponseBodyApiInfosApiInfo setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public DescribeApisByRuleResponseBodyApiInfosApiInfo setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public DescribeApisByRuleResponseBodyApiInfosApiInfo setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeApisByRuleResponseBodyApiInfosApiInfo setStageName(String stageName) {
            this.stageName = stageName;
            return this;
        }
        public String getStageName() {
            return this.stageName;
        }

        public DescribeApisByRuleResponseBodyApiInfosApiInfo setVisibility(String visibility) {
            this.visibility = visibility;
            return this;
        }
        public String getVisibility() {
            return this.visibility;
        }

    }

    public static class DescribeApisByRuleResponseBodyApiInfos extends TeaModel {
        @NameInMap("ApiInfo")
        public java.util.List<DescribeApisByRuleResponseBodyApiInfosApiInfo> apiInfo;

        public static DescribeApisByRuleResponseBodyApiInfos build(java.util.Map<String, ?> map) throws Exception {
            DescribeApisByRuleResponseBodyApiInfos self = new DescribeApisByRuleResponseBodyApiInfos();
            return TeaModel.build(map, self);
        }

        public DescribeApisByRuleResponseBodyApiInfos setApiInfo(java.util.List<DescribeApisByRuleResponseBodyApiInfosApiInfo> apiInfo) {
            this.apiInfo = apiInfo;
            return this;
        }
        public java.util.List<DescribeApisByRuleResponseBodyApiInfosApiInfo> getApiInfo() {
            return this.apiInfo;
        }

    }

}
