// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeApisByIpControlResponseBody extends TeaModel {
    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("ApiInfos")
    public DescribeApisByIpControlResponseBodyApiInfos apiInfos;

    public static DescribeApisByIpControlResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeApisByIpControlResponseBody self = new DescribeApisByIpControlResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeApisByIpControlResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeApisByIpControlResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeApisByIpControlResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeApisByIpControlResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeApisByIpControlResponseBody setApiInfos(DescribeApisByIpControlResponseBodyApiInfos apiInfos) {
        this.apiInfos = apiInfos;
        return this;
    }
    public DescribeApisByIpControlResponseBodyApiInfos getApiInfos() {
        return this.apiInfos;
    }

    public static class DescribeApisByIpControlResponseBodyApiInfosApiInfo extends TeaModel {
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

        public static DescribeApisByIpControlResponseBodyApiInfosApiInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeApisByIpControlResponseBodyApiInfosApiInfo self = new DescribeApisByIpControlResponseBodyApiInfosApiInfo();
            return TeaModel.build(map, self);
        }

        public DescribeApisByIpControlResponseBodyApiInfosApiInfo setBoundTime(String boundTime) {
            this.boundTime = boundTime;
            return this;
        }
        public String getBoundTime() {
            return this.boundTime;
        }

        public DescribeApisByIpControlResponseBodyApiInfosApiInfo setVisibility(String visibility) {
            this.visibility = visibility;
            return this;
        }
        public String getVisibility() {
            return this.visibility;
        }

        public DescribeApisByIpControlResponseBodyApiInfosApiInfo setApiId(String apiId) {
            this.apiId = apiId;
            return this;
        }
        public String getApiId() {
            return this.apiId;
        }

        public DescribeApisByIpControlResponseBodyApiInfosApiInfo setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeApisByIpControlResponseBodyApiInfosApiInfo setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public DescribeApisByIpControlResponseBodyApiInfosApiInfo setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public DescribeApisByIpControlResponseBodyApiInfosApiInfo setStageName(String stageName) {
            this.stageName = stageName;
            return this;
        }
        public String getStageName() {
            return this.stageName;
        }

        public DescribeApisByIpControlResponseBodyApiInfosApiInfo setApiName(String apiName) {
            this.apiName = apiName;
            return this;
        }
        public String getApiName() {
            return this.apiName;
        }

        public DescribeApisByIpControlResponseBodyApiInfosApiInfo setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
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
