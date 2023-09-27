// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20180601.models;

import com.aliyun.tea.*;

public class DescribeApiDocsResponseBody extends TeaModel {
    @NameInMap("ApiInfos")
    public DescribeApiDocsResponseBodyApiInfos apiInfos;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeApiDocsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeApiDocsResponseBody self = new DescribeApiDocsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeApiDocsResponseBody setApiInfos(DescribeApiDocsResponseBodyApiInfos apiInfos) {
        this.apiInfos = apiInfos;
        return this;
    }
    public DescribeApiDocsResponseBodyApiInfos getApiInfos() {
        return this.apiInfos;
    }

    public DescribeApiDocsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeApiDocsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeApiDocsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeApiDocsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeApiDocsResponseBodyApiInfosApiInfo extends TeaModel {
        @NameInMap("ApiId")
        public String apiId;

        @NameInMap("ApiName")
        public String apiName;

        @NameInMap("DeployedTime")
        public String deployedTime;

        @NameInMap("Description")
        public String description;

        @NameInMap("GroupDescription")
        public String groupDescription;

        @NameInMap("GroupId")
        public String groupId;

        @NameInMap("GroupName")
        public String groupName;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("StageName")
        public String stageName;

        public static DescribeApiDocsResponseBodyApiInfosApiInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeApiDocsResponseBodyApiInfosApiInfo self = new DescribeApiDocsResponseBodyApiInfosApiInfo();
            return TeaModel.build(map, self);
        }

        public DescribeApiDocsResponseBodyApiInfosApiInfo setApiId(String apiId) {
            this.apiId = apiId;
            return this;
        }
        public String getApiId() {
            return this.apiId;
        }

        public DescribeApiDocsResponseBodyApiInfosApiInfo setApiName(String apiName) {
            this.apiName = apiName;
            return this;
        }
        public String getApiName() {
            return this.apiName;
        }

        public DescribeApiDocsResponseBodyApiInfosApiInfo setDeployedTime(String deployedTime) {
            this.deployedTime = deployedTime;
            return this;
        }
        public String getDeployedTime() {
            return this.deployedTime;
        }

        public DescribeApiDocsResponseBodyApiInfosApiInfo setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeApiDocsResponseBodyApiInfosApiInfo setGroupDescription(String groupDescription) {
            this.groupDescription = groupDescription;
            return this;
        }
        public String getGroupDescription() {
            return this.groupDescription;
        }

        public DescribeApiDocsResponseBodyApiInfosApiInfo setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public DescribeApiDocsResponseBodyApiInfosApiInfo setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public DescribeApiDocsResponseBodyApiInfosApiInfo setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeApiDocsResponseBodyApiInfosApiInfo setStageName(String stageName) {
            this.stageName = stageName;
            return this;
        }
        public String getStageName() {
            return this.stageName;
        }

    }

    public static class DescribeApiDocsResponseBodyApiInfos extends TeaModel {
        @NameInMap("ApiInfo")
        public java.util.List<DescribeApiDocsResponseBodyApiInfosApiInfo> apiInfo;

        public static DescribeApiDocsResponseBodyApiInfos build(java.util.Map<String, ?> map) throws Exception {
            DescribeApiDocsResponseBodyApiInfos self = new DescribeApiDocsResponseBodyApiInfos();
            return TeaModel.build(map, self);
        }

        public DescribeApiDocsResponseBodyApiInfos setApiInfo(java.util.List<DescribeApiDocsResponseBodyApiInfosApiInfo> apiInfo) {
            this.apiInfo = apiInfo;
            return this;
        }
        public java.util.List<DescribeApiDocsResponseBodyApiInfosApiInfo> getApiInfo() {
            return this.apiInfo;
        }

    }

}
