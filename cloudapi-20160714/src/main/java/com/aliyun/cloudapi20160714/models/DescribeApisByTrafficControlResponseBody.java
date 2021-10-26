// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeApisByTrafficControlResponseBody extends TeaModel {
    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("ApiInfos")
    public DescribeApisByTrafficControlResponseBodyApiInfos apiInfos;

    public static DescribeApisByTrafficControlResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeApisByTrafficControlResponseBody self = new DescribeApisByTrafficControlResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeApisByTrafficControlResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeApisByTrafficControlResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeApisByTrafficControlResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeApisByTrafficControlResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeApisByTrafficControlResponseBody setApiInfos(DescribeApisByTrafficControlResponseBodyApiInfos apiInfos) {
        this.apiInfos = apiInfos;
        return this;
    }
    public DescribeApisByTrafficControlResponseBodyApiInfos getApiInfos() {
        return this.apiInfos;
    }

    public static class DescribeApisByTrafficControlResponseBodyApiInfosApiInfo extends TeaModel {
        @NameInMap("BoundTime")
        public String boundTime;

        @NameInMap("Visibility")
        public String visibility;

        @NameInMap("ApiId")
        public String apiId;

        @NameInMap("Description")
        public String description;

        @NameInMap("GroupName")
        public String groupName;

        @NameInMap("GroupId")
        public String groupId;

        @NameInMap("StageName")
        public String stageName;

        @NameInMap("ApiName")
        public String apiName;

        @NameInMap("RegionId")
        public String regionId;

        public static DescribeApisByTrafficControlResponseBodyApiInfosApiInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeApisByTrafficControlResponseBodyApiInfosApiInfo self = new DescribeApisByTrafficControlResponseBodyApiInfosApiInfo();
            return TeaModel.build(map, self);
        }

        public DescribeApisByTrafficControlResponseBodyApiInfosApiInfo setBoundTime(String boundTime) {
            this.boundTime = boundTime;
            return this;
        }
        public String getBoundTime() {
            return this.boundTime;
        }

        public DescribeApisByTrafficControlResponseBodyApiInfosApiInfo setVisibility(String visibility) {
            this.visibility = visibility;
            return this;
        }
        public String getVisibility() {
            return this.visibility;
        }

        public DescribeApisByTrafficControlResponseBodyApiInfosApiInfo setApiId(String apiId) {
            this.apiId = apiId;
            return this;
        }
        public String getApiId() {
            return this.apiId;
        }

        public DescribeApisByTrafficControlResponseBodyApiInfosApiInfo setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeApisByTrafficControlResponseBodyApiInfosApiInfo setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public DescribeApisByTrafficControlResponseBodyApiInfosApiInfo setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public DescribeApisByTrafficControlResponseBodyApiInfosApiInfo setStageName(String stageName) {
            this.stageName = stageName;
            return this;
        }
        public String getStageName() {
            return this.stageName;
        }

        public DescribeApisByTrafficControlResponseBodyApiInfosApiInfo setApiName(String apiName) {
            this.apiName = apiName;
            return this;
        }
        public String getApiName() {
            return this.apiName;
        }

        public DescribeApisByTrafficControlResponseBodyApiInfosApiInfo setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

    public static class DescribeApisByTrafficControlResponseBodyApiInfos extends TeaModel {
        @NameInMap("ApiInfo")
        public java.util.List<DescribeApisByTrafficControlResponseBodyApiInfosApiInfo> apiInfo;

        public static DescribeApisByTrafficControlResponseBodyApiInfos build(java.util.Map<String, ?> map) throws Exception {
            DescribeApisByTrafficControlResponseBodyApiInfos self = new DescribeApisByTrafficControlResponseBodyApiInfos();
            return TeaModel.build(map, self);
        }

        public DescribeApisByTrafficControlResponseBodyApiInfos setApiInfo(java.util.List<DescribeApisByTrafficControlResponseBodyApiInfosApiInfo> apiInfo) {
            this.apiInfo = apiInfo;
            return this;
        }
        public java.util.List<DescribeApisByTrafficControlResponseBodyApiInfosApiInfo> getApiInfo() {
            return this.apiInfo;
        }

    }

}
