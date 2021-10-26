// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeWillBeSyncApisResponseBody extends TeaModel {
    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("Apis")
    public DescribeWillBeSyncApisResponseBodyApis apis;

    public static DescribeWillBeSyncApisResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeWillBeSyncApisResponseBody self = new DescribeWillBeSyncApisResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeWillBeSyncApisResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeWillBeSyncApisResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeWillBeSyncApisResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeWillBeSyncApisResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeWillBeSyncApisResponseBody setApis(DescribeWillBeSyncApisResponseBodyApis apis) {
        this.apis = apis;
        return this;
    }
    public DescribeWillBeSyncApisResponseBodyApis getApis() {
        return this.apis;
    }

    public static class DescribeWillBeSyncApisResponseBodyApisApiDigest extends TeaModel {
        @NameInMap("VpcName")
        public String vpcName;

        @NameInMap("ApiId")
        public String apiId;

        @NameInMap("GroupName")
        public String groupName;

        @NameInMap("GroupId")
        public String groupId;

        @NameInMap("VpcSchema")
        public String vpcSchema;

        @NameInMap("Version")
        public String version;

        @NameInMap("Path")
        public String path;

        @NameInMap("Method")
        public String method;

        @NameInMap("VpcEnabled")
        public Boolean vpcEnabled;

        @NameInMap("ApiName")
        public String apiName;

        @NameInMap("RegionId")
        public String regionId;

        public static DescribeWillBeSyncApisResponseBodyApisApiDigest build(java.util.Map<String, ?> map) throws Exception {
            DescribeWillBeSyncApisResponseBodyApisApiDigest self = new DescribeWillBeSyncApisResponseBodyApisApiDigest();
            return TeaModel.build(map, self);
        }

        public DescribeWillBeSyncApisResponseBodyApisApiDigest setVpcName(String vpcName) {
            this.vpcName = vpcName;
            return this;
        }
        public String getVpcName() {
            return this.vpcName;
        }

        public DescribeWillBeSyncApisResponseBodyApisApiDigest setApiId(String apiId) {
            this.apiId = apiId;
            return this;
        }
        public String getApiId() {
            return this.apiId;
        }

        public DescribeWillBeSyncApisResponseBodyApisApiDigest setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public DescribeWillBeSyncApisResponseBodyApisApiDigest setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public DescribeWillBeSyncApisResponseBodyApisApiDigest setVpcSchema(String vpcSchema) {
            this.vpcSchema = vpcSchema;
            return this;
        }
        public String getVpcSchema() {
            return this.vpcSchema;
        }

        public DescribeWillBeSyncApisResponseBodyApisApiDigest setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public DescribeWillBeSyncApisResponseBodyApisApiDigest setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public DescribeWillBeSyncApisResponseBodyApisApiDigest setMethod(String method) {
            this.method = method;
            return this;
        }
        public String getMethod() {
            return this.method;
        }

        public DescribeWillBeSyncApisResponseBodyApisApiDigest setVpcEnabled(Boolean vpcEnabled) {
            this.vpcEnabled = vpcEnabled;
            return this;
        }
        public Boolean getVpcEnabled() {
            return this.vpcEnabled;
        }

        public DescribeWillBeSyncApisResponseBodyApisApiDigest setApiName(String apiName) {
            this.apiName = apiName;
            return this;
        }
        public String getApiName() {
            return this.apiName;
        }

        public DescribeWillBeSyncApisResponseBodyApisApiDigest setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

    public static class DescribeWillBeSyncApisResponseBodyApis extends TeaModel {
        @NameInMap("ApiDigest")
        public java.util.List<DescribeWillBeSyncApisResponseBodyApisApiDigest> apiDigest;

        public static DescribeWillBeSyncApisResponseBodyApis build(java.util.Map<String, ?> map) throws Exception {
            DescribeWillBeSyncApisResponseBodyApis self = new DescribeWillBeSyncApisResponseBodyApis();
            return TeaModel.build(map, self);
        }

        public DescribeWillBeSyncApisResponseBodyApis setApiDigest(java.util.List<DescribeWillBeSyncApisResponseBodyApisApiDigest> apiDigest) {
            this.apiDigest = apiDigest;
            return this;
        }
        public java.util.List<DescribeWillBeSyncApisResponseBodyApisApiDigest> getApiDigest() {
            return this.apiDigest;
        }

    }

}
