// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160701.models;

import com.aliyun.tea.*;

public class DescribeAppsByApiResponseBody extends TeaModel {
    @NameInMap("AppApiRelationInfos")
    public DescribeAppsByApiResponseBodyAppApiRelationInfos appApiRelationInfos;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeAppsByApiResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAppsByApiResponseBody self = new DescribeAppsByApiResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAppsByApiResponseBody setAppApiRelationInfos(DescribeAppsByApiResponseBodyAppApiRelationInfos appApiRelationInfos) {
        this.appApiRelationInfos = appApiRelationInfos;
        return this;
    }
    public DescribeAppsByApiResponseBodyAppApiRelationInfos getAppApiRelationInfos() {
        return this.appApiRelationInfos;
    }

    public DescribeAppsByApiResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeAppsByApiResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeAppsByApiResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAppsByApiResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeAppsByApiResponseBodyAppApiRelationInfosAppApiRelationInfo extends TeaModel {
        @NameInMap("AppId")
        public String appId;

        @NameInMap("AppName")
        public String appName;

        @NameInMap("AuthVaildTime")
        public String authVaildTime;

        @NameInMap("AuthorizationSource")
        public String authorizationSource;

        @NameInMap("CreatedTime")
        public String createdTime;

        @NameInMap("Description")
        public String description;

        @NameInMap("Operator")
        public String operator;

        @NameInMap("StageName")
        public String stageName;

        public static DescribeAppsByApiResponseBodyAppApiRelationInfosAppApiRelationInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeAppsByApiResponseBodyAppApiRelationInfosAppApiRelationInfo self = new DescribeAppsByApiResponseBodyAppApiRelationInfosAppApiRelationInfo();
            return TeaModel.build(map, self);
        }

        public DescribeAppsByApiResponseBodyAppApiRelationInfosAppApiRelationInfo setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public DescribeAppsByApiResponseBodyAppApiRelationInfosAppApiRelationInfo setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public DescribeAppsByApiResponseBodyAppApiRelationInfosAppApiRelationInfo setAuthVaildTime(String authVaildTime) {
            this.authVaildTime = authVaildTime;
            return this;
        }
        public String getAuthVaildTime() {
            return this.authVaildTime;
        }

        public DescribeAppsByApiResponseBodyAppApiRelationInfosAppApiRelationInfo setAuthorizationSource(String authorizationSource) {
            this.authorizationSource = authorizationSource;
            return this;
        }
        public String getAuthorizationSource() {
            return this.authorizationSource;
        }

        public DescribeAppsByApiResponseBodyAppApiRelationInfosAppApiRelationInfo setCreatedTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public String getCreatedTime() {
            return this.createdTime;
        }

        public DescribeAppsByApiResponseBodyAppApiRelationInfosAppApiRelationInfo setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeAppsByApiResponseBodyAppApiRelationInfosAppApiRelationInfo setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public DescribeAppsByApiResponseBodyAppApiRelationInfosAppApiRelationInfo setStageName(String stageName) {
            this.stageName = stageName;
            return this;
        }
        public String getStageName() {
            return this.stageName;
        }

    }

    public static class DescribeAppsByApiResponseBodyAppApiRelationInfos extends TeaModel {
        @NameInMap("AppApiRelationInfo")
        public java.util.List<DescribeAppsByApiResponseBodyAppApiRelationInfosAppApiRelationInfo> appApiRelationInfo;

        public static DescribeAppsByApiResponseBodyAppApiRelationInfos build(java.util.Map<String, ?> map) throws Exception {
            DescribeAppsByApiResponseBodyAppApiRelationInfos self = new DescribeAppsByApiResponseBodyAppApiRelationInfos();
            return TeaModel.build(map, self);
        }

        public DescribeAppsByApiResponseBodyAppApiRelationInfos setAppApiRelationInfo(java.util.List<DescribeAppsByApiResponseBodyAppApiRelationInfosAppApiRelationInfo> appApiRelationInfo) {
            this.appApiRelationInfo = appApiRelationInfo;
            return this;
        }
        public java.util.List<DescribeAppsByApiResponseBodyAppApiRelationInfosAppApiRelationInfo> getAppApiRelationInfo() {
            return this.appApiRelationInfo;
        }

    }

}
