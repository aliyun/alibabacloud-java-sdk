// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class ListUsersForResourceServerResponseBody extends TeaModel {
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

    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    @NameInMap("Users")
    public java.util.List<ListUsersForResourceServerResponseBodyUsers> users;

    public static ListUsersForResourceServerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListUsersForResourceServerResponseBody self = new ListUsersForResourceServerResponseBody();
        return TeaModel.build(map, self);
    }

    public ListUsersForResourceServerResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListUsersForResourceServerResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListUsersForResourceServerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListUsersForResourceServerResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public ListUsersForResourceServerResponseBody setUsers(java.util.List<ListUsersForResourceServerResponseBodyUsers> users) {
        this.users = users;
        return this;
    }
    public java.util.List<ListUsersForResourceServerResponseBodyUsers> getUsers() {
        return this.users;
    }

    public static class ListUsersForResourceServerResponseBodyUsersResourceServerScopes extends TeaModel {
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

        public static ListUsersForResourceServerResponseBodyUsersResourceServerScopes build(java.util.Map<String, ?> map) throws Exception {
            ListUsersForResourceServerResponseBodyUsersResourceServerScopes self = new ListUsersForResourceServerResponseBodyUsersResourceServerScopes();
            return TeaModel.build(map, self);
        }

        public ListUsersForResourceServerResponseBodyUsersResourceServerScopes setResourceServerScopeId(String resourceServerScopeId) {
            this.resourceServerScopeId = resourceServerScopeId;
            return this;
        }
        public String getResourceServerScopeId() {
            return this.resourceServerScopeId;
        }

        public ListUsersForResourceServerResponseBodyUsersResourceServerScopes setResourceServerScopeName(String resourceServerScopeName) {
            this.resourceServerScopeName = resourceServerScopeName;
            return this;
        }
        public String getResourceServerScopeName() {
            return this.resourceServerScopeName;
        }

    }

    public static class ListUsersForResourceServerResponseBodyUsers extends TeaModel {
        /**
         * <p>实例唯一标识</p>
         * 
         * <strong>example:</strong>
         * <p>idaas_qsw77zl5vrllwzyrrfwbmpxxxx</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>资源服务Scope权限集合</p>
         */
        @NameInMap("ResourceServerScopes")
        public java.util.List<ListUsersForResourceServerResponseBodyUsersResourceServerScopes> resourceServerScopes;

        /**
         * <p>用户的唯一标识</p>
         * 
         * <strong>example:</strong>
         * <p>user_nbsomva32b6utec3hgi7scxxxx</p>
         */
        @NameInMap("UserId")
        public String userId;

        public static ListUsersForResourceServerResponseBodyUsers build(java.util.Map<String, ?> map) throws Exception {
            ListUsersForResourceServerResponseBodyUsers self = new ListUsersForResourceServerResponseBodyUsers();
            return TeaModel.build(map, self);
        }

        public ListUsersForResourceServerResponseBodyUsers setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListUsersForResourceServerResponseBodyUsers setResourceServerScopes(java.util.List<ListUsersForResourceServerResponseBodyUsersResourceServerScopes> resourceServerScopes) {
            this.resourceServerScopes = resourceServerScopes;
            return this;
        }
        public java.util.List<ListUsersForResourceServerResponseBodyUsersResourceServerScopes> getResourceServerScopes() {
            return this.resourceServerScopes;
        }

        public ListUsersForResourceServerResponseBodyUsers setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
