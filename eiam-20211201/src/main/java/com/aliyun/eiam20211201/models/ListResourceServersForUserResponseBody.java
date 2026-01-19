// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class ListResourceServersForUserResponseBody extends TeaModel {
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
     * <p>0441BD79-92F3-53AA-8657-F8CE4A2B912A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResourceServers")
    public java.util.List<ListResourceServersForUserResponseBodyResourceServers> resourceServers;

    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListResourceServersForUserResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListResourceServersForUserResponseBody self = new ListResourceServersForUserResponseBody();
        return TeaModel.build(map, self);
    }

    public ListResourceServersForUserResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListResourceServersForUserResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListResourceServersForUserResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListResourceServersForUserResponseBody setResourceServers(java.util.List<ListResourceServersForUserResponseBodyResourceServers> resourceServers) {
        this.resourceServers = resourceServers;
        return this;
    }
    public java.util.List<ListResourceServersForUserResponseBodyResourceServers> getResourceServers() {
        return this.resourceServers;
    }

    public ListResourceServersForUserResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListResourceServersForUserResponseBodyResourceServersResourceServerScopes extends TeaModel {
        /**
         * <p>直接分配给当前用户的权限，视为直接授权。</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("HasDirectAuthorization")
        public Boolean hasDirectAuthorization;

        /**
         * <p>通过用户隶属的组织、组获取的权限，视为继承权限。</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("HasInheritAuthorization")
        public Boolean hasInheritAuthorization;

        /**
         * <p>ResourceServerScope唯一标识</p>
         * 
         * <strong>example:</strong>
         * <p>ress_nbte4bb3qqqnaq73rlmkqixxxx</p>
         */
        @NameInMap("ResourceServerScopeId")
        public String resourceServerScopeId;

        /**
         * <p>ResourceServerScope名称</p>
         * 
         * <strong>example:</strong>
         * <p>Read All User</p>
         */
        @NameInMap("ResourceServerScopeName")
        public String resourceServerScopeName;

        public static ListResourceServersForUserResponseBodyResourceServersResourceServerScopes build(java.util.Map<String, ?> map) throws Exception {
            ListResourceServersForUserResponseBodyResourceServersResourceServerScopes self = new ListResourceServersForUserResponseBodyResourceServersResourceServerScopes();
            return TeaModel.build(map, self);
        }

        public ListResourceServersForUserResponseBodyResourceServersResourceServerScopes setHasDirectAuthorization(Boolean hasDirectAuthorization) {
            this.hasDirectAuthorization = hasDirectAuthorization;
            return this;
        }
        public Boolean getHasDirectAuthorization() {
            return this.hasDirectAuthorization;
        }

        public ListResourceServersForUserResponseBodyResourceServersResourceServerScopes setHasInheritAuthorization(Boolean hasInheritAuthorization) {
            this.hasInheritAuthorization = hasInheritAuthorization;
            return this;
        }
        public Boolean getHasInheritAuthorization() {
            return this.hasInheritAuthorization;
        }

        public ListResourceServersForUserResponseBodyResourceServersResourceServerScopes setResourceServerScopeId(String resourceServerScopeId) {
            this.resourceServerScopeId = resourceServerScopeId;
            return this;
        }
        public String getResourceServerScopeId() {
            return this.resourceServerScopeId;
        }

        public ListResourceServersForUserResponseBodyResourceServersResourceServerScopes setResourceServerScopeName(String resourceServerScopeName) {
            this.resourceServerScopeName = resourceServerScopeName;
            return this;
        }
        public String getResourceServerScopeName() {
            return this.resourceServerScopeName;
        }

    }

    public static class ListResourceServersForUserResponseBodyResourceServers extends TeaModel {
        /**
         * <p>资源服务应用的唯一标识</p>
         * 
         * <strong>example:</strong>
         * <p>app_nbsomva32b6utec3hgi7scxxxx</p>
         */
        @NameInMap("ApplicationId")
        public String applicationId;

        /**
         * <p>实例唯一标识</p>
         * 
         * <strong>example:</strong>
         * <p>idaas_qsw77zl5vrllwzyrrfwbmpxxxx</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <strong>example:</strong>
         * <p>urn:idaas:test</p>
         */
        @NameInMap("ResourceServerIdentifier")
        public String resourceServerIdentifier;

        /**
         * <p>资源服务Scope权限集合</p>
         */
        @NameInMap("ResourceServerScopes")
        public java.util.List<ListResourceServersForUserResponseBodyResourceServersResourceServerScopes> resourceServerScopes;

        public static ListResourceServersForUserResponseBodyResourceServers build(java.util.Map<String, ?> map) throws Exception {
            ListResourceServersForUserResponseBodyResourceServers self = new ListResourceServersForUserResponseBodyResourceServers();
            return TeaModel.build(map, self);
        }

        public ListResourceServersForUserResponseBodyResourceServers setApplicationId(String applicationId) {
            this.applicationId = applicationId;
            return this;
        }
        public String getApplicationId() {
            return this.applicationId;
        }

        public ListResourceServersForUserResponseBodyResourceServers setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListResourceServersForUserResponseBodyResourceServers setResourceServerIdentifier(String resourceServerIdentifier) {
            this.resourceServerIdentifier = resourceServerIdentifier;
            return this;
        }
        public String getResourceServerIdentifier() {
            return this.resourceServerIdentifier;
        }

        public ListResourceServersForUserResponseBodyResourceServers setResourceServerScopes(java.util.List<ListResourceServersForUserResponseBodyResourceServersResourceServerScopes> resourceServerScopes) {
            this.resourceServerScopes = resourceServerScopes;
            return this;
        }
        public java.util.List<ListResourceServersForUserResponseBodyResourceServersResourceServerScopes> getResourceServerScopes() {
            return this.resourceServerScopes;
        }

    }

}
