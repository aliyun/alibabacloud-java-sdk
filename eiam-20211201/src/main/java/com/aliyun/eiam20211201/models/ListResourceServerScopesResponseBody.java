// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class ListResourceServerScopesResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>本次调用返回的查询凭证（Token）值，用于下一次翻页查询。</p>
     * 
     * <strong>example:</strong>
     * <p>NTxxxexample</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>PTxxxexample</p>
     */
    @NameInMap("PreviousToken")
    public String previousToken;

    /**
     * <strong>example:</strong>
     * <p>0441BD79-92F3-53AA-8657-F8CE4A2B912A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResourceServerScopes")
    public java.util.List<ListResourceServerScopesResponseBodyResourceServerScopes> resourceServerScopes;

    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListResourceServerScopesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListResourceServerScopesResponseBody self = new ListResourceServerScopesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListResourceServerScopesResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListResourceServerScopesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListResourceServerScopesResponseBody setPreviousToken(String previousToken) {
        this.previousToken = previousToken;
        return this;
    }
    public String getPreviousToken() {
        return this.previousToken;
    }

    public ListResourceServerScopesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListResourceServerScopesResponseBody setResourceServerScopes(java.util.List<ListResourceServerScopesResponseBodyResourceServerScopes> resourceServerScopes) {
        this.resourceServerScopes = resourceServerScopes;
        return this;
    }
    public java.util.List<ListResourceServerScopesResponseBodyResourceServerScopes> getResourceServerScopes() {
        return this.resourceServerScopes;
    }

    public ListResourceServerScopesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListResourceServerScopesResponseBodyResourceServerScopes extends TeaModel {
        /**
         * <p>IDaaS EIAM 应用Id</p>
         * 
         * <strong>example:</strong>
         * <p>app_xxxxxxxxxxx</p>
         */
        @NameInMap("ApplicationId")
        public String applicationId;

        /**
         * <strong>example:</strong>
         * <p>authorize_required</p>
         */
        @NameInMap("AuthorizationType")
        public String authorizationType;

        /**
         * <p>IDaaS EIAM 实例Id</p>
         * 
         * <strong>example:</strong>
         * <p>idaas_xxxxxxxxxxx</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>IDaaS EIAM ResourceServer下权限Id</p>
         * 
         * <strong>example:</strong>
         * <p>rss_xxxxxxxxxxx</p>
         */
        @NameInMap("ResourceServerScopeId")
        public String resourceServerScopeId;

        /**
         * <p>IDaaS EIAM ResourceServer下权限名称</p>
         * 
         * <strong>example:</strong>
         * <p>读取全部用户</p>
         */
        @NameInMap("ResourceServerScopeName")
        public String resourceServerScopeName;

        /**
         * <p>IDaaS EIAM ResourceServer下权限类型</p>
         * 
         * <strong>example:</strong>
         * <p>urn:alibaba:idaas:resourceserver:scope:delegated</p>
         */
        @NameInMap("ResourceServerScopeType")
        public String resourceServerScopeType;

        /**
         * <p>IDaaS EIAM ResourceServer下权限值</p>
         * 
         * <strong>example:</strong>
         * <p>User:Write:ALL</p>
         */
        @NameInMap("ResourceServerScopeValue")
        public String resourceServerScopeValue;

        public static ListResourceServerScopesResponseBodyResourceServerScopes build(java.util.Map<String, ?> map) throws Exception {
            ListResourceServerScopesResponseBodyResourceServerScopes self = new ListResourceServerScopesResponseBodyResourceServerScopes();
            return TeaModel.build(map, self);
        }

        public ListResourceServerScopesResponseBodyResourceServerScopes setApplicationId(String applicationId) {
            this.applicationId = applicationId;
            return this;
        }
        public String getApplicationId() {
            return this.applicationId;
        }

        public ListResourceServerScopesResponseBodyResourceServerScopes setAuthorizationType(String authorizationType) {
            this.authorizationType = authorizationType;
            return this;
        }
        public String getAuthorizationType() {
            return this.authorizationType;
        }

        public ListResourceServerScopesResponseBodyResourceServerScopes setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListResourceServerScopesResponseBodyResourceServerScopes setResourceServerScopeId(String resourceServerScopeId) {
            this.resourceServerScopeId = resourceServerScopeId;
            return this;
        }
        public String getResourceServerScopeId() {
            return this.resourceServerScopeId;
        }

        public ListResourceServerScopesResponseBodyResourceServerScopes setResourceServerScopeName(String resourceServerScopeName) {
            this.resourceServerScopeName = resourceServerScopeName;
            return this;
        }
        public String getResourceServerScopeName() {
            return this.resourceServerScopeName;
        }

        public ListResourceServerScopesResponseBodyResourceServerScopes setResourceServerScopeType(String resourceServerScopeType) {
            this.resourceServerScopeType = resourceServerScopeType;
            return this;
        }
        public String getResourceServerScopeType() {
            return this.resourceServerScopeType;
        }

        public ListResourceServerScopesResponseBodyResourceServerScopes setResourceServerScopeValue(String resourceServerScopeValue) {
            this.resourceServerScopeValue = resourceServerScopeValue;
            return this;
        }
        public String getResourceServerScopeValue() {
            return this.resourceServerScopeValue;
        }

    }

}
