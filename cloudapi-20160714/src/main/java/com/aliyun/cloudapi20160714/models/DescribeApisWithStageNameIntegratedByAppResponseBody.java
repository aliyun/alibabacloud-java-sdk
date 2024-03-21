// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeApisWithStageNameIntegratedByAppResponseBody extends TeaModel {
    /**
     * <p>The authorization information of the API.</p>
     */
    @NameInMap("AppApiRelationInfos")
    public DescribeApisWithStageNameIntegratedByAppResponseBodyAppApiRelationInfos appApiRelationInfos;

    /**
     * <p>The page number of the returned page.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeApisWithStageNameIntegratedByAppResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeApisWithStageNameIntegratedByAppResponseBody self = new DescribeApisWithStageNameIntegratedByAppResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeApisWithStageNameIntegratedByAppResponseBody setAppApiRelationInfos(DescribeApisWithStageNameIntegratedByAppResponseBodyAppApiRelationInfos appApiRelationInfos) {
        this.appApiRelationInfos = appApiRelationInfos;
        return this;
    }
    public DescribeApisWithStageNameIntegratedByAppResponseBodyAppApiRelationInfos getAppApiRelationInfos() {
        return this.appApiRelationInfos;
    }

    public DescribeApisWithStageNameIntegratedByAppResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeApisWithStageNameIntegratedByAppResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeApisWithStageNameIntegratedByAppResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeApisWithStageNameIntegratedByAppResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeApisWithStageNameIntegratedByAppResponseBodyAppApiRelationInfosAppApiRelationInfo extends TeaModel {
        /**
         * <p>The API ID.</p>
         */
        @NameInMap("ApiId")
        public String apiId;

        /**
         * <p>The API name.</p>
         */
        @NameInMap("ApiName")
        public String apiName;

        /**
         * <p>The authorization source.</p>
         */
        @NameInMap("AuthorizationSource")
        public String authorizationSource;

        /**
         * <p>The time when the authorization was created.</p>
         */
        @NameInMap("CreatedTime")
        public String createdTime;

        /**
         * <p>The API description.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The ID of the API group.</p>
         */
        @NameInMap("GroupId")
        public String groupId;

        /**
         * <p>The name of the API group.</p>
         */
        @NameInMap("GroupName")
        public String groupName;

        /**
         * <p>The request HTTP method of the API.</p>
         */
        @NameInMap("Method")
        public String method;

        /**
         * <p>The authorizer. Valid values:</p>
         * <br>
         * <p>*   **PROVIDER:** the API owner</p>
         * <p>*   **CONSUMER:** the API caller</p>
         */
        @NameInMap("Operator")
        public String operator;

        /**
         * <p>The request path of the API.</p>
         */
        @NameInMap("Path")
        public String path;

        /**
         * <p>The region ID.</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The mapping information between environments and authorizations.</p>
         */
        @NameInMap("StageNameAndAuth")
        public java.util.Map<String, String> stageNameAndAuth;

        public static DescribeApisWithStageNameIntegratedByAppResponseBodyAppApiRelationInfosAppApiRelationInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeApisWithStageNameIntegratedByAppResponseBodyAppApiRelationInfosAppApiRelationInfo self = new DescribeApisWithStageNameIntegratedByAppResponseBodyAppApiRelationInfosAppApiRelationInfo();
            return TeaModel.build(map, self);
        }

        public DescribeApisWithStageNameIntegratedByAppResponseBodyAppApiRelationInfosAppApiRelationInfo setApiId(String apiId) {
            this.apiId = apiId;
            return this;
        }
        public String getApiId() {
            return this.apiId;
        }

        public DescribeApisWithStageNameIntegratedByAppResponseBodyAppApiRelationInfosAppApiRelationInfo setApiName(String apiName) {
            this.apiName = apiName;
            return this;
        }
        public String getApiName() {
            return this.apiName;
        }

        public DescribeApisWithStageNameIntegratedByAppResponseBodyAppApiRelationInfosAppApiRelationInfo setAuthorizationSource(String authorizationSource) {
            this.authorizationSource = authorizationSource;
            return this;
        }
        public String getAuthorizationSource() {
            return this.authorizationSource;
        }

        public DescribeApisWithStageNameIntegratedByAppResponseBodyAppApiRelationInfosAppApiRelationInfo setCreatedTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public String getCreatedTime() {
            return this.createdTime;
        }

        public DescribeApisWithStageNameIntegratedByAppResponseBodyAppApiRelationInfosAppApiRelationInfo setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeApisWithStageNameIntegratedByAppResponseBodyAppApiRelationInfosAppApiRelationInfo setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public DescribeApisWithStageNameIntegratedByAppResponseBodyAppApiRelationInfosAppApiRelationInfo setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public DescribeApisWithStageNameIntegratedByAppResponseBodyAppApiRelationInfosAppApiRelationInfo setMethod(String method) {
            this.method = method;
            return this;
        }
        public String getMethod() {
            return this.method;
        }

        public DescribeApisWithStageNameIntegratedByAppResponseBodyAppApiRelationInfosAppApiRelationInfo setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public DescribeApisWithStageNameIntegratedByAppResponseBodyAppApiRelationInfosAppApiRelationInfo setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public DescribeApisWithStageNameIntegratedByAppResponseBodyAppApiRelationInfosAppApiRelationInfo setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeApisWithStageNameIntegratedByAppResponseBodyAppApiRelationInfosAppApiRelationInfo setStageNameAndAuth(java.util.Map<String, String> stageNameAndAuth) {
            this.stageNameAndAuth = stageNameAndAuth;
            return this;
        }
        public java.util.Map<String, String> getStageNameAndAuth() {
            return this.stageNameAndAuth;
        }

    }

    public static class DescribeApisWithStageNameIntegratedByAppResponseBodyAppApiRelationInfos extends TeaModel {
        @NameInMap("AppApiRelationInfo")
        public java.util.List<DescribeApisWithStageNameIntegratedByAppResponseBodyAppApiRelationInfosAppApiRelationInfo> appApiRelationInfo;

        public static DescribeApisWithStageNameIntegratedByAppResponseBodyAppApiRelationInfos build(java.util.Map<String, ?> map) throws Exception {
            DescribeApisWithStageNameIntegratedByAppResponseBodyAppApiRelationInfos self = new DescribeApisWithStageNameIntegratedByAppResponseBodyAppApiRelationInfos();
            return TeaModel.build(map, self);
        }

        public DescribeApisWithStageNameIntegratedByAppResponseBodyAppApiRelationInfos setAppApiRelationInfo(java.util.List<DescribeApisWithStageNameIntegratedByAppResponseBodyAppApiRelationInfosAppApiRelationInfo> appApiRelationInfo) {
            this.appApiRelationInfo = appApiRelationInfo;
            return this;
        }
        public java.util.List<DescribeApisWithStageNameIntegratedByAppResponseBodyAppApiRelationInfosAppApiRelationInfo> getAppApiRelationInfo() {
            return this.appApiRelationInfo;
        }

    }

}
