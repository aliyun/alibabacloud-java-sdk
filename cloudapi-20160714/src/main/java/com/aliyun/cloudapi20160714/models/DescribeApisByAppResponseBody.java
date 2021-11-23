// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeApisByAppResponseBody extends TeaModel {
    @NameInMap("AppApiRelationInfos")
    public DescribeApisByAppResponseBodyAppApiRelationInfos appApiRelationInfos;

    // 当前页码
    @NameInMap("PageNumber")
    public Integer pageNumber;

    // 每页条目
    @NameInMap("PageSize")
    public Integer pageSize;

    // 请求ID
    @NameInMap("RequestId")
    public String requestId;

    // 总条目数
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeApisByAppResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeApisByAppResponseBody self = new DescribeApisByAppResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeApisByAppResponseBody setAppApiRelationInfos(DescribeApisByAppResponseBodyAppApiRelationInfos appApiRelationInfos) {
        this.appApiRelationInfos = appApiRelationInfos;
        return this;
    }
    public DescribeApisByAppResponseBodyAppApiRelationInfos getAppApiRelationInfos() {
        return this.appApiRelationInfos;
    }

    public DescribeApisByAppResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeApisByAppResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeApisByAppResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeApisByAppResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeApisByAppResponseBodyAppApiRelationInfosAppApiRelationInfo extends TeaModel {
        // API的ID
        @NameInMap("ApiId")
        public String apiId;

        // API名称
        @NameInMap("ApiName")
        public String apiName;

        // 授权有效时间
        @NameInMap("AuthVaildTime")
        public String authVaildTime;

        // 授权来源
        @NameInMap("AuthorizationSource")
        public String authorizationSource;

        // 授权时间
        @NameInMap("CreatedTime")
        public String createdTime;

        // 描述
        @NameInMap("Description")
        public String description;

        // 分组ID
        @NameInMap("GroupId")
        public String groupId;

        // 分组名称
        @NameInMap("GroupName")
        public String groupName;

        // API的请求HTTP Method
        @NameInMap("Method")
        public String method;

        @NameInMap("Operator")
        public String operator;

        // API的请求路径
        @NameInMap("Path")
        public String path;

        // 地区ID
        @NameInMap("RegionId")
        public String regionId;

        // 环境名称
        @NameInMap("StageName")
        public String stageName;

        public static DescribeApisByAppResponseBodyAppApiRelationInfosAppApiRelationInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeApisByAppResponseBodyAppApiRelationInfosAppApiRelationInfo self = new DescribeApisByAppResponseBodyAppApiRelationInfosAppApiRelationInfo();
            return TeaModel.build(map, self);
        }

        public DescribeApisByAppResponseBodyAppApiRelationInfosAppApiRelationInfo setApiId(String apiId) {
            this.apiId = apiId;
            return this;
        }
        public String getApiId() {
            return this.apiId;
        }

        public DescribeApisByAppResponseBodyAppApiRelationInfosAppApiRelationInfo setApiName(String apiName) {
            this.apiName = apiName;
            return this;
        }
        public String getApiName() {
            return this.apiName;
        }

        public DescribeApisByAppResponseBodyAppApiRelationInfosAppApiRelationInfo setAuthVaildTime(String authVaildTime) {
            this.authVaildTime = authVaildTime;
            return this;
        }
        public String getAuthVaildTime() {
            return this.authVaildTime;
        }

        public DescribeApisByAppResponseBodyAppApiRelationInfosAppApiRelationInfo setAuthorizationSource(String authorizationSource) {
            this.authorizationSource = authorizationSource;
            return this;
        }
        public String getAuthorizationSource() {
            return this.authorizationSource;
        }

        public DescribeApisByAppResponseBodyAppApiRelationInfosAppApiRelationInfo setCreatedTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public String getCreatedTime() {
            return this.createdTime;
        }

        public DescribeApisByAppResponseBodyAppApiRelationInfosAppApiRelationInfo setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeApisByAppResponseBodyAppApiRelationInfosAppApiRelationInfo setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public DescribeApisByAppResponseBodyAppApiRelationInfosAppApiRelationInfo setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public DescribeApisByAppResponseBodyAppApiRelationInfosAppApiRelationInfo setMethod(String method) {
            this.method = method;
            return this;
        }
        public String getMethod() {
            return this.method;
        }

        public DescribeApisByAppResponseBodyAppApiRelationInfosAppApiRelationInfo setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public DescribeApisByAppResponseBodyAppApiRelationInfosAppApiRelationInfo setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public DescribeApisByAppResponseBodyAppApiRelationInfosAppApiRelationInfo setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeApisByAppResponseBodyAppApiRelationInfosAppApiRelationInfo setStageName(String stageName) {
            this.stageName = stageName;
            return this;
        }
        public String getStageName() {
            return this.stageName;
        }

    }

    public static class DescribeApisByAppResponseBodyAppApiRelationInfos extends TeaModel {
        @NameInMap("AppApiRelationInfo")
        public java.util.List<DescribeApisByAppResponseBodyAppApiRelationInfosAppApiRelationInfo> appApiRelationInfo;

        public static DescribeApisByAppResponseBodyAppApiRelationInfos build(java.util.Map<String, ?> map) throws Exception {
            DescribeApisByAppResponseBodyAppApiRelationInfos self = new DescribeApisByAppResponseBodyAppApiRelationInfos();
            return TeaModel.build(map, self);
        }

        public DescribeApisByAppResponseBodyAppApiRelationInfos setAppApiRelationInfo(java.util.List<DescribeApisByAppResponseBodyAppApiRelationInfosAppApiRelationInfo> appApiRelationInfo) {
            this.appApiRelationInfo = appApiRelationInfo;
            return this;
        }
        public java.util.List<DescribeApisByAppResponseBodyAppApiRelationInfosAppApiRelationInfo> getAppApiRelationInfo() {
            return this.appApiRelationInfo;
        }

    }

}
