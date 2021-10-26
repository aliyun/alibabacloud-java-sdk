// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeSyncFailApiTaskResponseBody extends TeaModel {
    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("Apis")
    public DescribeSyncFailApiTaskResponseBodyApis apis;

    public static DescribeSyncFailApiTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSyncFailApiTaskResponseBody self = new DescribeSyncFailApiTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSyncFailApiTaskResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeSyncFailApiTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSyncFailApiTaskResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeSyncFailApiTaskResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeSyncFailApiTaskResponseBody setApis(DescribeSyncFailApiTaskResponseBodyApis apis) {
        this.apis = apis;
        return this;
    }
    public DescribeSyncFailApiTaskResponseBodyApis getApis() {
        return this.apis;
    }

    public static class DescribeSyncFailApiTaskResponseBodyApisApiDigest extends TeaModel {
        @NameInMap("ApiId")
        public String apiId;

        @NameInMap("GroupName")
        public String groupName;

        @NameInMap("GroupId")
        public String groupId;

        @NameInMap("Version")
        public String version;

        @NameInMap("Path")
        public String path;

        @NameInMap("SynTime")
        public String synTime;

        @NameInMap("Method")
        public String method;

        @NameInMap("FailReason")
        public String failReason;

        @NameInMap("ApiName")
        public String apiName;

        @NameInMap("RegionId")
        public String regionId;

        public static DescribeSyncFailApiTaskResponseBodyApisApiDigest build(java.util.Map<String, ?> map) throws Exception {
            DescribeSyncFailApiTaskResponseBodyApisApiDigest self = new DescribeSyncFailApiTaskResponseBodyApisApiDigest();
            return TeaModel.build(map, self);
        }

        public DescribeSyncFailApiTaskResponseBodyApisApiDigest setApiId(String apiId) {
            this.apiId = apiId;
            return this;
        }
        public String getApiId() {
            return this.apiId;
        }

        public DescribeSyncFailApiTaskResponseBodyApisApiDigest setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public DescribeSyncFailApiTaskResponseBodyApisApiDigest setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public DescribeSyncFailApiTaskResponseBodyApisApiDigest setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public DescribeSyncFailApiTaskResponseBodyApisApiDigest setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public DescribeSyncFailApiTaskResponseBodyApisApiDigest setSynTime(String synTime) {
            this.synTime = synTime;
            return this;
        }
        public String getSynTime() {
            return this.synTime;
        }

        public DescribeSyncFailApiTaskResponseBodyApisApiDigest setMethod(String method) {
            this.method = method;
            return this;
        }
        public String getMethod() {
            return this.method;
        }

        public DescribeSyncFailApiTaskResponseBodyApisApiDigest setFailReason(String failReason) {
            this.failReason = failReason;
            return this;
        }
        public String getFailReason() {
            return this.failReason;
        }

        public DescribeSyncFailApiTaskResponseBodyApisApiDigest setApiName(String apiName) {
            this.apiName = apiName;
            return this;
        }
        public String getApiName() {
            return this.apiName;
        }

        public DescribeSyncFailApiTaskResponseBodyApisApiDigest setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

    public static class DescribeSyncFailApiTaskResponseBodyApis extends TeaModel {
        @NameInMap("ApiDigest")
        public java.util.List<DescribeSyncFailApiTaskResponseBodyApisApiDigest> apiDigest;

        public static DescribeSyncFailApiTaskResponseBodyApis build(java.util.Map<String, ?> map) throws Exception {
            DescribeSyncFailApiTaskResponseBodyApis self = new DescribeSyncFailApiTaskResponseBodyApis();
            return TeaModel.build(map, self);
        }

        public DescribeSyncFailApiTaskResponseBodyApis setApiDigest(java.util.List<DescribeSyncFailApiTaskResponseBodyApisApiDigest> apiDigest) {
            this.apiDigest = apiDigest;
            return this;
        }
        public java.util.List<DescribeSyncFailApiTaskResponseBodyApisApiDigest> getApiDigest() {
            return this.apiDigest;
        }

    }

}
