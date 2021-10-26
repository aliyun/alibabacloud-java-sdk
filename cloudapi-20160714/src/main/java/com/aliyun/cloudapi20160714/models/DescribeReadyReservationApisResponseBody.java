// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeReadyReservationApisResponseBody extends TeaModel {
    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("Apis")
    public DescribeReadyReservationApisResponseBodyApis apis;

    public static DescribeReadyReservationApisResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeReadyReservationApisResponseBody self = new DescribeReadyReservationApisResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeReadyReservationApisResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeReadyReservationApisResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeReadyReservationApisResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeReadyReservationApisResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeReadyReservationApisResponseBody setApis(DescribeReadyReservationApisResponseBodyApis apis) {
        this.apis = apis;
        return this;
    }
    public DescribeReadyReservationApisResponseBodyApis getApis() {
        return this.apis;
    }

    public static class DescribeReadyReservationApisResponseBodyApisApiDigest extends TeaModel {
        @NameInMap("ApiId")
        public String apiId;

        @NameInMap("GroupId")
        public String groupId;

        @NameInMap("GroupName")
        public String groupName;

        @NameInMap("Path")
        public String path;

        @NameInMap("Method")
        public String method;

        @NameInMap("ApiName")
        public String apiName;

        @NameInMap("RegionId")
        public String regionId;

        public static DescribeReadyReservationApisResponseBodyApisApiDigest build(java.util.Map<String, ?> map) throws Exception {
            DescribeReadyReservationApisResponseBodyApisApiDigest self = new DescribeReadyReservationApisResponseBodyApisApiDigest();
            return TeaModel.build(map, self);
        }

        public DescribeReadyReservationApisResponseBodyApisApiDigest setApiId(String apiId) {
            this.apiId = apiId;
            return this;
        }
        public String getApiId() {
            return this.apiId;
        }

        public DescribeReadyReservationApisResponseBodyApisApiDigest setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public DescribeReadyReservationApisResponseBodyApisApiDigest setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public DescribeReadyReservationApisResponseBodyApisApiDigest setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public DescribeReadyReservationApisResponseBodyApisApiDigest setMethod(String method) {
            this.method = method;
            return this;
        }
        public String getMethod() {
            return this.method;
        }

        public DescribeReadyReservationApisResponseBodyApisApiDigest setApiName(String apiName) {
            this.apiName = apiName;
            return this;
        }
        public String getApiName() {
            return this.apiName;
        }

        public DescribeReadyReservationApisResponseBodyApisApiDigest setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

    public static class DescribeReadyReservationApisResponseBodyApis extends TeaModel {
        @NameInMap("ApiDigest")
        public java.util.List<DescribeReadyReservationApisResponseBodyApisApiDigest> apiDigest;

        public static DescribeReadyReservationApisResponseBodyApis build(java.util.Map<String, ?> map) throws Exception {
            DescribeReadyReservationApisResponseBodyApis self = new DescribeReadyReservationApisResponseBodyApis();
            return TeaModel.build(map, self);
        }

        public DescribeReadyReservationApisResponseBodyApis setApiDigest(java.util.List<DescribeReadyReservationApisResponseBodyApisApiDigest> apiDigest) {
            this.apiDigest = apiDigest;
            return this;
        }
        public java.util.List<DescribeReadyReservationApisResponseBodyApisApiDigest> getApiDigest() {
            return this.apiDigest;
        }

    }

}
