// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeApisByAppResponseBody extends TeaModel {
    /**
     * <p>The API authorizations.</p>
     */
    @NameInMap("AppApiRelationInfos")
    public DescribeApisByAppResponseBodyAppApiRelationInfos appApiRelationInfos;

    /**
     * <p>The number of pages to return the results on.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>CEF72CEB-54B6-4AE8-B225-F876FF7BZ015</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of returned entries.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
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
        /**
         * <p>The API ID.</p>
         * 
         * <strong>example:</strong>
         * <p>c625795a1e664782a918eaa629e96ab5</p>
         */
        @NameInMap("ApiId")
        public String apiId;

        /**
         * <p>The API name.</p>
         * 
         * <strong>example:</strong>
         * <p>sd2_h5_player_history_competition</p>
         */
        @NameInMap("ApiName")
        public String apiName;

        /**
         * <p>The validity period of the authorization.</p>
         * 
         * <strong>example:</strong>
         * <p>Sun, 02 Jan 2022 16:00:00 GMT</p>
         */
        @NameInMap("AuthVaildTime")
        public String authVaildTime;

        /**
         * <p>The authorization source.</p>
         * 
         * <strong>example:</strong>
         * <p>SELF</p>
         */
        @NameInMap("AuthorizationSource")
        public String authorizationSource;

        /**
         * <p>The time when the authorization was created.</p>
         * 
         * <strong>example:</strong>
         * <p>Sun, 02 Jan 2022 16:00:00 GMT</p>
         */
        @NameInMap("CreatedTime")
        public String createdTime;

        /**
         * <p>The authorization description.</p>
         * 
         * <strong>example:</strong>
         * <p>b1008kz</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The ID of the API group.</p>
         * 
         * <strong>example:</strong>
         * <p>38bed48d664149e4b9b5ea576319673f</p>
         */
        @NameInMap("GroupId")
        public String groupId;

        /**
         * <p>The name of the API group.</p>
         * 
         * <strong>example:</strong>
         * <p>wb2022012101605749</p>
         */
        @NameInMap("GroupName")
        public String groupName;

        /**
         * <p>The HTTP method of the API.</p>
         * 
         * <strong>example:</strong>
         * <p>GET</p>
         */
        @NameInMap("Method")
        public String method;

        /**
         * <p>The authorizer. Valid values:</p>
         * <ul>
         * <li><strong>PROVIDER</strong>: API owner</li>
         * <li><strong>CONSUMER</strong>: API caller</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PROVIDER</p>
         */
        @NameInMap("Operator")
        public String operator;

        /**
         * <p>The request path of the API.</p>
         * 
         * <strong>example:</strong>
         * <p>/api/offline/cacheData</p>
         */
        @NameInMap("Path")
        public String path;

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The environment alias.</p>
         * 
         * <strong>example:</strong>
         * <p>Online</p>
         */
        @NameInMap("StageAlias")
        public String stageAlias;

        /**
         * <p>The environment name.</p>
         * 
         * <strong>example:</strong>
         * <p>RELEASE</p>
         */
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

        public DescribeApisByAppResponseBodyAppApiRelationInfosAppApiRelationInfo setStageAlias(String stageAlias) {
            this.stageAlias = stageAlias;
            return this;
        }
        public String getStageAlias() {
            return this.stageAlias;
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
