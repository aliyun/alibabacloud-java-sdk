// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeReadyNewApisResponseBody extends TeaModel {
    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("Apis")
    public DescribeReadyNewApisResponseBodyApis apis;

    public static DescribeReadyNewApisResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeReadyNewApisResponseBody self = new DescribeReadyNewApisResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeReadyNewApisResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeReadyNewApisResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeReadyNewApisResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeReadyNewApisResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeReadyNewApisResponseBody setApis(DescribeReadyNewApisResponseBodyApis apis) {
        this.apis = apis;
        return this;
    }
    public DescribeReadyNewApisResponseBodyApis getApis() {
        return this.apis;
    }

    public static class DescribeReadyNewApisResponseBodyApisApiDigest extends TeaModel {
        @NameInMap("ApiVersion")
        public String apiVersion;

        @NameInMap("ApiId")
        public String apiId;

        @NameInMap("GroupName")
        public String groupName;

        @NameInMap("GroupId")
        public String groupId;

        @NameInMap("Path")
        public String path;

        @NameInMap("Method")
        public String method;

        @NameInMap("StageName")
        public String stageName;

        @NameInMap("ApiName")
        public String apiName;

        @NameInMap("RegionId")
        public String regionId;

        public static DescribeReadyNewApisResponseBodyApisApiDigest build(java.util.Map<String, ?> map) throws Exception {
            DescribeReadyNewApisResponseBodyApisApiDigest self = new DescribeReadyNewApisResponseBodyApisApiDigest();
            return TeaModel.build(map, self);
        }

        public DescribeReadyNewApisResponseBodyApisApiDigest setApiVersion(String apiVersion) {
            this.apiVersion = apiVersion;
            return this;
        }
        public String getApiVersion() {
            return this.apiVersion;
        }

        public DescribeReadyNewApisResponseBodyApisApiDigest setApiId(String apiId) {
            this.apiId = apiId;
            return this;
        }
        public String getApiId() {
            return this.apiId;
        }

        public DescribeReadyNewApisResponseBodyApisApiDigest setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public DescribeReadyNewApisResponseBodyApisApiDigest setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public DescribeReadyNewApisResponseBodyApisApiDigest setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public DescribeReadyNewApisResponseBodyApisApiDigest setMethod(String method) {
            this.method = method;
            return this;
        }
        public String getMethod() {
            return this.method;
        }

        public DescribeReadyNewApisResponseBodyApisApiDigest setStageName(String stageName) {
            this.stageName = stageName;
            return this;
        }
        public String getStageName() {
            return this.stageName;
        }

        public DescribeReadyNewApisResponseBodyApisApiDigest setApiName(String apiName) {
            this.apiName = apiName;
            return this;
        }
        public String getApiName() {
            return this.apiName;
        }

        public DescribeReadyNewApisResponseBodyApisApiDigest setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

    public static class DescribeReadyNewApisResponseBodyApis extends TeaModel {
        @NameInMap("ApiDigest")
        public java.util.List<DescribeReadyNewApisResponseBodyApisApiDigest> apiDigest;

        public static DescribeReadyNewApisResponseBodyApis build(java.util.Map<String, ?> map) throws Exception {
            DescribeReadyNewApisResponseBodyApis self = new DescribeReadyNewApisResponseBodyApis();
            return TeaModel.build(map, self);
        }

        public DescribeReadyNewApisResponseBodyApis setApiDigest(java.util.List<DescribeReadyNewApisResponseBodyApisApiDigest> apiDigest) {
            this.apiDigest = apiDigest;
            return this;
        }
        public java.util.List<DescribeReadyNewApisResponseBodyApisApiDigest> getApiDigest() {
            return this.apiDigest;
        }

    }

}
