// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160201.models;

import com.aliyun.tea.*;

public class DescribeApiDocsForBackendResponseBody extends TeaModel {
    @NameInMap("ApiInfos")
    public DescribeApiDocsForBackendResponseBodyApiInfos apiInfos;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeApiDocsForBackendResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeApiDocsForBackendResponseBody self = new DescribeApiDocsForBackendResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeApiDocsForBackendResponseBody setApiInfos(DescribeApiDocsForBackendResponseBodyApiInfos apiInfos) {
        this.apiInfos = apiInfos;
        return this;
    }
    public DescribeApiDocsForBackendResponseBodyApiInfos getApiInfos() {
        return this.apiInfos;
    }

    public DescribeApiDocsForBackendResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeApiDocsForBackendResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeApiDocsForBackendResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeApiDocsForBackendResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeApiDocsForBackendResponseBodyApiInfosApiInfo extends TeaModel {
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

        public static DescribeApiDocsForBackendResponseBodyApiInfosApiInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeApiDocsForBackendResponseBodyApiInfosApiInfo self = new DescribeApiDocsForBackendResponseBodyApiInfosApiInfo();
            return TeaModel.build(map, self);
        }

        public DescribeApiDocsForBackendResponseBodyApiInfosApiInfo setApiId(String apiId) {
            this.apiId = apiId;
            return this;
        }
        public String getApiId() {
            return this.apiId;
        }

        public DescribeApiDocsForBackendResponseBodyApiInfosApiInfo setApiName(String apiName) {
            this.apiName = apiName;
            return this;
        }
        public String getApiName() {
            return this.apiName;
        }

        public DescribeApiDocsForBackendResponseBodyApiInfosApiInfo setDeployedTime(String deployedTime) {
            this.deployedTime = deployedTime;
            return this;
        }
        public String getDeployedTime() {
            return this.deployedTime;
        }

        public DescribeApiDocsForBackendResponseBodyApiInfosApiInfo setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeApiDocsForBackendResponseBodyApiInfosApiInfo setGroupDescription(String groupDescription) {
            this.groupDescription = groupDescription;
            return this;
        }
        public String getGroupDescription() {
            return this.groupDescription;
        }

        public DescribeApiDocsForBackendResponseBodyApiInfosApiInfo setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public DescribeApiDocsForBackendResponseBodyApiInfosApiInfo setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public DescribeApiDocsForBackendResponseBodyApiInfosApiInfo setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeApiDocsForBackendResponseBodyApiInfosApiInfo setStageName(String stageName) {
            this.stageName = stageName;
            return this;
        }
        public String getStageName() {
            return this.stageName;
        }

    }

    public static class DescribeApiDocsForBackendResponseBodyApiInfos extends TeaModel {
        @NameInMap("ApiInfo")
        public java.util.List<DescribeApiDocsForBackendResponseBodyApiInfosApiInfo> apiInfo;

        public static DescribeApiDocsForBackendResponseBodyApiInfos build(java.util.Map<String, ?> map) throws Exception {
            DescribeApiDocsForBackendResponseBodyApiInfos self = new DescribeApiDocsForBackendResponseBodyApiInfos();
            return TeaModel.build(map, self);
        }

        public DescribeApiDocsForBackendResponseBodyApiInfos setApiInfo(java.util.List<DescribeApiDocsForBackendResponseBodyApiInfosApiInfo> apiInfo) {
            this.apiInfo = apiInfo;
            return this;
        }
        public java.util.List<DescribeApiDocsForBackendResponseBodyApiInfosApiInfo> getApiInfo() {
            return this.apiInfo;
        }

    }

}
