// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeApisBySignatureResponseBody extends TeaModel {
    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("ApiInfos")
    public DescribeApisBySignatureResponseBodyApiInfos apiInfos;

    public static DescribeApisBySignatureResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeApisBySignatureResponseBody self = new DescribeApisBySignatureResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeApisBySignatureResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeApisBySignatureResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeApisBySignatureResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeApisBySignatureResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeApisBySignatureResponseBody setApiInfos(DescribeApisBySignatureResponseBodyApiInfos apiInfos) {
        this.apiInfos = apiInfos;
        return this;
    }
    public DescribeApisBySignatureResponseBodyApiInfos getApiInfos() {
        return this.apiInfos;
    }

    public static class DescribeApisBySignatureResponseBodyApiInfosApiInfo extends TeaModel {
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

        public static DescribeApisBySignatureResponseBodyApiInfosApiInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeApisBySignatureResponseBodyApiInfosApiInfo self = new DescribeApisBySignatureResponseBodyApiInfosApiInfo();
            return TeaModel.build(map, self);
        }

        public DescribeApisBySignatureResponseBodyApiInfosApiInfo setBoundTime(String boundTime) {
            this.boundTime = boundTime;
            return this;
        }
        public String getBoundTime() {
            return this.boundTime;
        }

        public DescribeApisBySignatureResponseBodyApiInfosApiInfo setVisibility(String visibility) {
            this.visibility = visibility;
            return this;
        }
        public String getVisibility() {
            return this.visibility;
        }

        public DescribeApisBySignatureResponseBodyApiInfosApiInfo setApiId(String apiId) {
            this.apiId = apiId;
            return this;
        }
        public String getApiId() {
            return this.apiId;
        }

        public DescribeApisBySignatureResponseBodyApiInfosApiInfo setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeApisBySignatureResponseBodyApiInfosApiInfo setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public DescribeApisBySignatureResponseBodyApiInfosApiInfo setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public DescribeApisBySignatureResponseBodyApiInfosApiInfo setStageName(String stageName) {
            this.stageName = stageName;
            return this;
        }
        public String getStageName() {
            return this.stageName;
        }

        public DescribeApisBySignatureResponseBodyApiInfosApiInfo setApiName(String apiName) {
            this.apiName = apiName;
            return this;
        }
        public String getApiName() {
            return this.apiName;
        }

        public DescribeApisBySignatureResponseBodyApiInfosApiInfo setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

    public static class DescribeApisBySignatureResponseBodyApiInfos extends TeaModel {
        @NameInMap("ApiInfo")
        public java.util.List<DescribeApisBySignatureResponseBodyApiInfosApiInfo> apiInfo;

        public static DescribeApisBySignatureResponseBodyApiInfos build(java.util.Map<String, ?> map) throws Exception {
            DescribeApisBySignatureResponseBodyApiInfos self = new DescribeApisBySignatureResponseBodyApiInfos();
            return TeaModel.build(map, self);
        }

        public DescribeApisBySignatureResponseBodyApiInfos setApiInfo(java.util.List<DescribeApisBySignatureResponseBodyApiInfosApiInfo> apiInfo) {
            this.apiInfo = apiInfo;
            return this;
        }
        public java.util.List<DescribeApisBySignatureResponseBodyApiInfosApiInfo> getApiInfo() {
            return this.apiInfo;
        }

    }

}
