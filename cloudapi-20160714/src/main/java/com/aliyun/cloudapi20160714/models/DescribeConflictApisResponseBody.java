// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeConflictApisResponseBody extends TeaModel {
    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("ConflictApis")
    public DescribeConflictApisResponseBodyConflictApis conflictApis;

    public static DescribeConflictApisResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeConflictApisResponseBody self = new DescribeConflictApisResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeConflictApisResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeConflictApisResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeConflictApisResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeConflictApisResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeConflictApisResponseBody setConflictApis(DescribeConflictApisResponseBodyConflictApis conflictApis) {
        this.conflictApis = conflictApis;
        return this;
    }
    public DescribeConflictApisResponseBodyConflictApis getConflictApis() {
        return this.conflictApis;
    }

    public static class DescribeConflictApisResponseBodyConflictApisConflictApiSource extends TeaModel {
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

        public static DescribeConflictApisResponseBodyConflictApisConflictApiSource build(java.util.Map<String, ?> map) throws Exception {
            DescribeConflictApisResponseBodyConflictApisConflictApiSource self = new DescribeConflictApisResponseBodyConflictApisConflictApiSource();
            return TeaModel.build(map, self);
        }

        public DescribeConflictApisResponseBodyConflictApisConflictApiSource setApiVersion(String apiVersion) {
            this.apiVersion = apiVersion;
            return this;
        }
        public String getApiVersion() {
            return this.apiVersion;
        }

        public DescribeConflictApisResponseBodyConflictApisConflictApiSource setApiId(String apiId) {
            this.apiId = apiId;
            return this;
        }
        public String getApiId() {
            return this.apiId;
        }

        public DescribeConflictApisResponseBodyConflictApisConflictApiSource setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public DescribeConflictApisResponseBodyConflictApisConflictApiSource setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public DescribeConflictApisResponseBodyConflictApisConflictApiSource setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public DescribeConflictApisResponseBodyConflictApisConflictApiSource setMethod(String method) {
            this.method = method;
            return this;
        }
        public String getMethod() {
            return this.method;
        }

        public DescribeConflictApisResponseBodyConflictApisConflictApiSource setStageName(String stageName) {
            this.stageName = stageName;
            return this;
        }
        public String getStageName() {
            return this.stageName;
        }

        public DescribeConflictApisResponseBodyConflictApisConflictApiSource setApiName(String apiName) {
            this.apiName = apiName;
            return this;
        }
        public String getApiName() {
            return this.apiName;
        }

        public DescribeConflictApisResponseBodyConflictApisConflictApiSource setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

    public static class DescribeConflictApisResponseBodyConflictApisConflictApiTarget extends TeaModel {
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

        public static DescribeConflictApisResponseBodyConflictApisConflictApiTarget build(java.util.Map<String, ?> map) throws Exception {
            DescribeConflictApisResponseBodyConflictApisConflictApiTarget self = new DescribeConflictApisResponseBodyConflictApisConflictApiTarget();
            return TeaModel.build(map, self);
        }

        public DescribeConflictApisResponseBodyConflictApisConflictApiTarget setApiId(String apiId) {
            this.apiId = apiId;
            return this;
        }
        public String getApiId() {
            return this.apiId;
        }

        public DescribeConflictApisResponseBodyConflictApisConflictApiTarget setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public DescribeConflictApisResponseBodyConflictApisConflictApiTarget setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public DescribeConflictApisResponseBodyConflictApisConflictApiTarget setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public DescribeConflictApisResponseBodyConflictApisConflictApiTarget setMethod(String method) {
            this.method = method;
            return this;
        }
        public String getMethod() {
            return this.method;
        }

        public DescribeConflictApisResponseBodyConflictApisConflictApiTarget setApiName(String apiName) {
            this.apiName = apiName;
            return this;
        }
        public String getApiName() {
            return this.apiName;
        }

        public DescribeConflictApisResponseBodyConflictApisConflictApiTarget setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

    public static class DescribeConflictApisResponseBodyConflictApisConflictApi extends TeaModel {
        @NameInMap("Source")
        public DescribeConflictApisResponseBodyConflictApisConflictApiSource source;

        @NameInMap("Target")
        public DescribeConflictApisResponseBodyConflictApisConflictApiTarget target;

        public static DescribeConflictApisResponseBodyConflictApisConflictApi build(java.util.Map<String, ?> map) throws Exception {
            DescribeConflictApisResponseBodyConflictApisConflictApi self = new DescribeConflictApisResponseBodyConflictApisConflictApi();
            return TeaModel.build(map, self);
        }

        public DescribeConflictApisResponseBodyConflictApisConflictApi setSource(DescribeConflictApisResponseBodyConflictApisConflictApiSource source) {
            this.source = source;
            return this;
        }
        public DescribeConflictApisResponseBodyConflictApisConflictApiSource getSource() {
            return this.source;
        }

        public DescribeConflictApisResponseBodyConflictApisConflictApi setTarget(DescribeConflictApisResponseBodyConflictApisConflictApiTarget target) {
            this.target = target;
            return this;
        }
        public DescribeConflictApisResponseBodyConflictApisConflictApiTarget getTarget() {
            return this.target;
        }

    }

    public static class DescribeConflictApisResponseBodyConflictApis extends TeaModel {
        @NameInMap("ConflictApi")
        public java.util.List<DescribeConflictApisResponseBodyConflictApisConflictApi> conflictApi;

        public static DescribeConflictApisResponseBodyConflictApis build(java.util.Map<String, ?> map) throws Exception {
            DescribeConflictApisResponseBodyConflictApis self = new DescribeConflictApisResponseBodyConflictApis();
            return TeaModel.build(map, self);
        }

        public DescribeConflictApisResponseBodyConflictApis setConflictApi(java.util.List<DescribeConflictApisResponseBodyConflictApisConflictApi> conflictApi) {
            this.conflictApi = conflictApi;
            return this;
        }
        public java.util.List<DescribeConflictApisResponseBodyConflictApisConflictApi> getConflictApi() {
            return this.conflictApi;
        }

    }

}
