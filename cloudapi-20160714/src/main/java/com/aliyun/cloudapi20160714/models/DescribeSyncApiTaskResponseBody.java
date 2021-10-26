// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeSyncApiTaskResponseBody extends TeaModel {
    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("Apis")
    public DescribeSyncApiTaskResponseBodyApis apis;

    public static DescribeSyncApiTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSyncApiTaskResponseBody self = new DescribeSyncApiTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSyncApiTaskResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeSyncApiTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSyncApiTaskResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeSyncApiTaskResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeSyncApiTaskResponseBody setApis(DescribeSyncApiTaskResponseBodyApis apis) {
        this.apis = apis;
        return this;
    }
    public DescribeSyncApiTaskResponseBodyApis getApis() {
        return this.apis;
    }

    public static class DescribeSyncApiTaskResponseBodyApisApiDigest extends TeaModel {
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

        @NameInMap("ApiName")
        public String apiName;

        @NameInMap("RegionId")
        public String regionId;

        public static DescribeSyncApiTaskResponseBodyApisApiDigest build(java.util.Map<String, ?> map) throws Exception {
            DescribeSyncApiTaskResponseBodyApisApiDigest self = new DescribeSyncApiTaskResponseBodyApisApiDigest();
            return TeaModel.build(map, self);
        }

        public DescribeSyncApiTaskResponseBodyApisApiDigest setApiId(String apiId) {
            this.apiId = apiId;
            return this;
        }
        public String getApiId() {
            return this.apiId;
        }

        public DescribeSyncApiTaskResponseBodyApisApiDigest setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public DescribeSyncApiTaskResponseBodyApisApiDigest setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public DescribeSyncApiTaskResponseBodyApisApiDigest setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public DescribeSyncApiTaskResponseBodyApisApiDigest setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public DescribeSyncApiTaskResponseBodyApisApiDigest setSynTime(String synTime) {
            this.synTime = synTime;
            return this;
        }
        public String getSynTime() {
            return this.synTime;
        }

        public DescribeSyncApiTaskResponseBodyApisApiDigest setMethod(String method) {
            this.method = method;
            return this;
        }
        public String getMethod() {
            return this.method;
        }

        public DescribeSyncApiTaskResponseBodyApisApiDigest setApiName(String apiName) {
            this.apiName = apiName;
            return this;
        }
        public String getApiName() {
            return this.apiName;
        }

        public DescribeSyncApiTaskResponseBodyApisApiDigest setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

    public static class DescribeSyncApiTaskResponseBodyApis extends TeaModel {
        @NameInMap("ApiDigest")
        public java.util.List<DescribeSyncApiTaskResponseBodyApisApiDigest> apiDigest;

        public static DescribeSyncApiTaskResponseBodyApis build(java.util.Map<String, ?> map) throws Exception {
            DescribeSyncApiTaskResponseBodyApis self = new DescribeSyncApiTaskResponseBodyApis();
            return TeaModel.build(map, self);
        }

        public DescribeSyncApiTaskResponseBodyApis setApiDigest(java.util.List<DescribeSyncApiTaskResponseBodyApisApiDigest> apiDigest) {
            this.apiDigest = apiDigest;
            return this;
        }
        public java.util.List<DescribeSyncApiTaskResponseBodyApisApiDigest> getApiDigest() {
            return this.apiDigest;
        }

    }

}
