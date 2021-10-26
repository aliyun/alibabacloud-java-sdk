// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeAccordanceApisResponseBody extends TeaModel {
    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("AccordanceApis")
    public DescribeAccordanceApisResponseBodyAccordanceApis accordanceApis;

    public static DescribeAccordanceApisResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAccordanceApisResponseBody self = new DescribeAccordanceApisResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAccordanceApisResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeAccordanceApisResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAccordanceApisResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeAccordanceApisResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeAccordanceApisResponseBody setAccordanceApis(DescribeAccordanceApisResponseBodyAccordanceApis accordanceApis) {
        this.accordanceApis = accordanceApis;
        return this;
    }
    public DescribeAccordanceApisResponseBodyAccordanceApis getAccordanceApis() {
        return this.accordanceApis;
    }

    public static class DescribeAccordanceApisResponseBodyAccordanceApisAccordanceApiSource extends TeaModel {
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

        @NameInMap("Method")
        public String method;

        @NameInMap("StageName")
        public String stageName;

        @NameInMap("ApiName")
        public String apiName;

        @NameInMap("RegionId")
        public String regionId;

        public static DescribeAccordanceApisResponseBodyAccordanceApisAccordanceApiSource build(java.util.Map<String, ?> map) throws Exception {
            DescribeAccordanceApisResponseBodyAccordanceApisAccordanceApiSource self = new DescribeAccordanceApisResponseBodyAccordanceApisAccordanceApiSource();
            return TeaModel.build(map, self);
        }

        public DescribeAccordanceApisResponseBodyAccordanceApisAccordanceApiSource setApiId(String apiId) {
            this.apiId = apiId;
            return this;
        }
        public String getApiId() {
            return this.apiId;
        }

        public DescribeAccordanceApisResponseBodyAccordanceApisAccordanceApiSource setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public DescribeAccordanceApisResponseBodyAccordanceApisAccordanceApiSource setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public DescribeAccordanceApisResponseBodyAccordanceApisAccordanceApiSource setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public DescribeAccordanceApisResponseBodyAccordanceApisAccordanceApiSource setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public DescribeAccordanceApisResponseBodyAccordanceApisAccordanceApiSource setMethod(String method) {
            this.method = method;
            return this;
        }
        public String getMethod() {
            return this.method;
        }

        public DescribeAccordanceApisResponseBodyAccordanceApisAccordanceApiSource setStageName(String stageName) {
            this.stageName = stageName;
            return this;
        }
        public String getStageName() {
            return this.stageName;
        }

        public DescribeAccordanceApisResponseBodyAccordanceApisAccordanceApiSource setApiName(String apiName) {
            this.apiName = apiName;
            return this;
        }
        public String getApiName() {
            return this.apiName;
        }

        public DescribeAccordanceApisResponseBodyAccordanceApisAccordanceApiSource setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

    public static class DescribeAccordanceApisResponseBodyAccordanceApisAccordanceApiTarget extends TeaModel {
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

        public static DescribeAccordanceApisResponseBodyAccordanceApisAccordanceApiTarget build(java.util.Map<String, ?> map) throws Exception {
            DescribeAccordanceApisResponseBodyAccordanceApisAccordanceApiTarget self = new DescribeAccordanceApisResponseBodyAccordanceApisAccordanceApiTarget();
            return TeaModel.build(map, self);
        }

        public DescribeAccordanceApisResponseBodyAccordanceApisAccordanceApiTarget setApiId(String apiId) {
            this.apiId = apiId;
            return this;
        }
        public String getApiId() {
            return this.apiId;
        }

        public DescribeAccordanceApisResponseBodyAccordanceApisAccordanceApiTarget setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public DescribeAccordanceApisResponseBodyAccordanceApisAccordanceApiTarget setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public DescribeAccordanceApisResponseBodyAccordanceApisAccordanceApiTarget setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public DescribeAccordanceApisResponseBodyAccordanceApisAccordanceApiTarget setMethod(String method) {
            this.method = method;
            return this;
        }
        public String getMethod() {
            return this.method;
        }

        public DescribeAccordanceApisResponseBodyAccordanceApisAccordanceApiTarget setApiName(String apiName) {
            this.apiName = apiName;
            return this;
        }
        public String getApiName() {
            return this.apiName;
        }

        public DescribeAccordanceApisResponseBodyAccordanceApisAccordanceApiTarget setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

    public static class DescribeAccordanceApisResponseBodyAccordanceApisAccordanceApi extends TeaModel {
        @NameInMap("Source")
        public DescribeAccordanceApisResponseBodyAccordanceApisAccordanceApiSource source;

        @NameInMap("Target")
        public DescribeAccordanceApisResponseBodyAccordanceApisAccordanceApiTarget target;

        public static DescribeAccordanceApisResponseBodyAccordanceApisAccordanceApi build(java.util.Map<String, ?> map) throws Exception {
            DescribeAccordanceApisResponseBodyAccordanceApisAccordanceApi self = new DescribeAccordanceApisResponseBodyAccordanceApisAccordanceApi();
            return TeaModel.build(map, self);
        }

        public DescribeAccordanceApisResponseBodyAccordanceApisAccordanceApi setSource(DescribeAccordanceApisResponseBodyAccordanceApisAccordanceApiSource source) {
            this.source = source;
            return this;
        }
        public DescribeAccordanceApisResponseBodyAccordanceApisAccordanceApiSource getSource() {
            return this.source;
        }

        public DescribeAccordanceApisResponseBodyAccordanceApisAccordanceApi setTarget(DescribeAccordanceApisResponseBodyAccordanceApisAccordanceApiTarget target) {
            this.target = target;
            return this;
        }
        public DescribeAccordanceApisResponseBodyAccordanceApisAccordanceApiTarget getTarget() {
            return this.target;
        }

    }

    public static class DescribeAccordanceApisResponseBodyAccordanceApis extends TeaModel {
        @NameInMap("AccordanceApi")
        public java.util.List<DescribeAccordanceApisResponseBodyAccordanceApisAccordanceApi> accordanceApi;

        public static DescribeAccordanceApisResponseBodyAccordanceApis build(java.util.Map<String, ?> map) throws Exception {
            DescribeAccordanceApisResponseBodyAccordanceApis self = new DescribeAccordanceApisResponseBodyAccordanceApis();
            return TeaModel.build(map, self);
        }

        public DescribeAccordanceApisResponseBodyAccordanceApis setAccordanceApi(java.util.List<DescribeAccordanceApisResponseBodyAccordanceApisAccordanceApi> accordanceApi) {
            this.accordanceApi = accordanceApi;
            return this;
        }
        public java.util.List<DescribeAccordanceApisResponseBodyAccordanceApisAccordanceApi> getAccordanceApi() {
            return this.accordanceApi;
        }

    }

}
