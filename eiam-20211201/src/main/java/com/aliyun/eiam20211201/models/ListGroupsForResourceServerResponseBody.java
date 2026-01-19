// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class ListGroupsForResourceServerResponseBody extends TeaModel {
    @NameInMap("Groups")
    public java.util.List<ListGroupsForResourceServerResponseBodyGroups> groups;

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

    public static ListGroupsForResourceServerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListGroupsForResourceServerResponseBody self = new ListGroupsForResourceServerResponseBody();
        return TeaModel.build(map, self);
    }

    public ListGroupsForResourceServerResponseBody setGroups(java.util.List<ListGroupsForResourceServerResponseBodyGroups> groups) {
        this.groups = groups;
        return this;
    }
    public java.util.List<ListGroupsForResourceServerResponseBodyGroups> getGroups() {
        return this.groups;
    }

    public ListGroupsForResourceServerResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListGroupsForResourceServerResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListGroupsForResourceServerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListGroupsForResourceServerResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListGroupsForResourceServerResponseBodyGroupsResourceServerScopes extends TeaModel {
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
         * <p>获取资源信息</p>
         */
        @NameInMap("ResourceServerScopeName")
        public String resourceServerScopeName;

        public static ListGroupsForResourceServerResponseBodyGroupsResourceServerScopes build(java.util.Map<String, ?> map) throws Exception {
            ListGroupsForResourceServerResponseBodyGroupsResourceServerScopes self = new ListGroupsForResourceServerResponseBodyGroupsResourceServerScopes();
            return TeaModel.build(map, self);
        }

        public ListGroupsForResourceServerResponseBodyGroupsResourceServerScopes setResourceServerScopeId(String resourceServerScopeId) {
            this.resourceServerScopeId = resourceServerScopeId;
            return this;
        }
        public String getResourceServerScopeId() {
            return this.resourceServerScopeId;
        }

        public ListGroupsForResourceServerResponseBodyGroupsResourceServerScopes setResourceServerScopeName(String resourceServerScopeName) {
            this.resourceServerScopeName = resourceServerScopeName;
            return this;
        }
        public String getResourceServerScopeName() {
            return this.resourceServerScopeName;
        }

    }

    public static class ListGroupsForResourceServerResponseBodyGroups extends TeaModel {
        /**
         * <p>用户组的唯一标识</p>
         * 
         * <strong>example:</strong>
         * <p>group_nbsomva32b6utec3hgi7scxxxx</p>
         */
        @NameInMap("GroupId")
        public String groupId;

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
        public java.util.List<ListGroupsForResourceServerResponseBodyGroupsResourceServerScopes> resourceServerScopes;

        public static ListGroupsForResourceServerResponseBodyGroups build(java.util.Map<String, ?> map) throws Exception {
            ListGroupsForResourceServerResponseBodyGroups self = new ListGroupsForResourceServerResponseBodyGroups();
            return TeaModel.build(map, self);
        }

        public ListGroupsForResourceServerResponseBodyGroups setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public ListGroupsForResourceServerResponseBodyGroups setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListGroupsForResourceServerResponseBodyGroups setResourceServerScopes(java.util.List<ListGroupsForResourceServerResponseBodyGroupsResourceServerScopes> resourceServerScopes) {
            this.resourceServerScopes = resourceServerScopes;
            return this;
        }
        public java.util.List<ListGroupsForResourceServerResponseBodyGroupsResourceServerScopes> getResourceServerScopes() {
            return this.resourceServerScopes;
        }

    }

}
