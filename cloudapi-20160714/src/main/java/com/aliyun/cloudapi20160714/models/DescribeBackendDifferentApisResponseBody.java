// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeBackendDifferentApisResponseBody extends TeaModel {
    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("ConflictApis")
    public DescribeBackendDifferentApisResponseBodyConflictApis conflictApis;

    public static DescribeBackendDifferentApisResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeBackendDifferentApisResponseBody self = new DescribeBackendDifferentApisResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeBackendDifferentApisResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeBackendDifferentApisResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeBackendDifferentApisResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeBackendDifferentApisResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeBackendDifferentApisResponseBody setConflictApis(DescribeBackendDifferentApisResponseBodyConflictApis conflictApis) {
        this.conflictApis = conflictApis;
        return this;
    }
    public DescribeBackendDifferentApisResponseBodyConflictApis getConflictApis() {
        return this.conflictApis;
    }

    public static class DescribeBackendDifferentApisResponseBodyConflictApisConflictApiSource extends TeaModel {
        @NameInMap("ApiVersion")
        public String apiVersion;

        @NameInMap("ApiId")
        public String apiId;

        @NameInMap("VpcName")
        public String vpcName;

        @NameInMap("GroupName")
        public String groupName;

        @NameInMap("GroupId")
        public String groupId;

        @NameInMap("Path")
        public String path;

        @NameInMap("Method")
        public String method;

        @NameInMap("ApiName")
        public String apiName;

        @NameInMap("RegionId")
        public String regionId;

        public static DescribeBackendDifferentApisResponseBodyConflictApisConflictApiSource build(java.util.Map<String, ?> map) throws Exception {
            DescribeBackendDifferentApisResponseBodyConflictApisConflictApiSource self = new DescribeBackendDifferentApisResponseBodyConflictApisConflictApiSource();
            return TeaModel.build(map, self);
        }

        public DescribeBackendDifferentApisResponseBodyConflictApisConflictApiSource setApiVersion(String apiVersion) {
            this.apiVersion = apiVersion;
            return this;
        }
        public String getApiVersion() {
            return this.apiVersion;
        }

        public DescribeBackendDifferentApisResponseBodyConflictApisConflictApiSource setApiId(String apiId) {
            this.apiId = apiId;
            return this;
        }
        public String getApiId() {
            return this.apiId;
        }

        public DescribeBackendDifferentApisResponseBodyConflictApisConflictApiSource setVpcName(String vpcName) {
            this.vpcName = vpcName;
            return this;
        }
        public String getVpcName() {
            return this.vpcName;
        }

        public DescribeBackendDifferentApisResponseBodyConflictApisConflictApiSource setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public DescribeBackendDifferentApisResponseBodyConflictApisConflictApiSource setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public DescribeBackendDifferentApisResponseBodyConflictApisConflictApiSource setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public DescribeBackendDifferentApisResponseBodyConflictApisConflictApiSource setMethod(String method) {
            this.method = method;
            return this;
        }
        public String getMethod() {
            return this.method;
        }

        public DescribeBackendDifferentApisResponseBodyConflictApisConflictApiSource setApiName(String apiName) {
            this.apiName = apiName;
            return this;
        }
        public String getApiName() {
            return this.apiName;
        }

        public DescribeBackendDifferentApisResponseBodyConflictApisConflictApiSource setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

    public static class DescribeBackendDifferentApisResponseBodyConflictApisConflictApiTarget extends TeaModel {
        @NameInMap("ApiId")
        public String apiId;

        @NameInMap("VpcName")
        public String vpcName;

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

        public static DescribeBackendDifferentApisResponseBodyConflictApisConflictApiTarget build(java.util.Map<String, ?> map) throws Exception {
            DescribeBackendDifferentApisResponseBodyConflictApisConflictApiTarget self = new DescribeBackendDifferentApisResponseBodyConflictApisConflictApiTarget();
            return TeaModel.build(map, self);
        }

        public DescribeBackendDifferentApisResponseBodyConflictApisConflictApiTarget setApiId(String apiId) {
            this.apiId = apiId;
            return this;
        }
        public String getApiId() {
            return this.apiId;
        }

        public DescribeBackendDifferentApisResponseBodyConflictApisConflictApiTarget setVpcName(String vpcName) {
            this.vpcName = vpcName;
            return this;
        }
        public String getVpcName() {
            return this.vpcName;
        }

        public DescribeBackendDifferentApisResponseBodyConflictApisConflictApiTarget setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public DescribeBackendDifferentApisResponseBodyConflictApisConflictApiTarget setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public DescribeBackendDifferentApisResponseBodyConflictApisConflictApiTarget setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public DescribeBackendDifferentApisResponseBodyConflictApisConflictApiTarget setMethod(String method) {
            this.method = method;
            return this;
        }
        public String getMethod() {
            return this.method;
        }

        public DescribeBackendDifferentApisResponseBodyConflictApisConflictApiTarget setApiName(String apiName) {
            this.apiName = apiName;
            return this;
        }
        public String getApiName() {
            return this.apiName;
        }

        public DescribeBackendDifferentApisResponseBodyConflictApisConflictApiTarget setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

    public static class DescribeBackendDifferentApisResponseBodyConflictApisConflictApi extends TeaModel {
        @NameInMap("Source")
        public DescribeBackendDifferentApisResponseBodyConflictApisConflictApiSource source;

        @NameInMap("Target")
        public DescribeBackendDifferentApisResponseBodyConflictApisConflictApiTarget target;

        public static DescribeBackendDifferentApisResponseBodyConflictApisConflictApi build(java.util.Map<String, ?> map) throws Exception {
            DescribeBackendDifferentApisResponseBodyConflictApisConflictApi self = new DescribeBackendDifferentApisResponseBodyConflictApisConflictApi();
            return TeaModel.build(map, self);
        }

        public DescribeBackendDifferentApisResponseBodyConflictApisConflictApi setSource(DescribeBackendDifferentApisResponseBodyConflictApisConflictApiSource source) {
            this.source = source;
            return this;
        }
        public DescribeBackendDifferentApisResponseBodyConflictApisConflictApiSource getSource() {
            return this.source;
        }

        public DescribeBackendDifferentApisResponseBodyConflictApisConflictApi setTarget(DescribeBackendDifferentApisResponseBodyConflictApisConflictApiTarget target) {
            this.target = target;
            return this;
        }
        public DescribeBackendDifferentApisResponseBodyConflictApisConflictApiTarget getTarget() {
            return this.target;
        }

    }

    public static class DescribeBackendDifferentApisResponseBodyConflictApis extends TeaModel {
        @NameInMap("ConflictApi")
        public java.util.List<DescribeBackendDifferentApisResponseBodyConflictApisConflictApi> conflictApi;

        public static DescribeBackendDifferentApisResponseBodyConflictApis build(java.util.Map<String, ?> map) throws Exception {
            DescribeBackendDifferentApisResponseBodyConflictApis self = new DescribeBackendDifferentApisResponseBodyConflictApis();
            return TeaModel.build(map, self);
        }

        public DescribeBackendDifferentApisResponseBodyConflictApis setConflictApi(java.util.List<DescribeBackendDifferentApisResponseBodyConflictApisConflictApi> conflictApi) {
            this.conflictApi = conflictApi;
            return this;
        }
        public java.util.List<DescribeBackendDifferentApisResponseBodyConflictApisConflictApi> getConflictApi() {
            return this.conflictApi;
        }

    }

}
