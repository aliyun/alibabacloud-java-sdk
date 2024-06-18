// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class ListWorkspacesRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>123123</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>VIEW_TIME_DESC</p>
     */
    @NameInMap("OrderBy")
    public String orderBy;

    /**
     * <strong>example:</strong>
     * <p>qweqwe</p>
     */
    @NameInMap("TeamId")
    public String teamId;

    @NameInMap("TenantContext")
    public ListWorkspacesRequestTenantContext tenantContext;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("WithPermissionRole")
    public Boolean withPermissionRole;

    public static ListWorkspacesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListWorkspacesRequest self = new ListWorkspacesRequest();
        return TeaModel.build(map, self);
    }

    public ListWorkspacesRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListWorkspacesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListWorkspacesRequest setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }
    public String getOrderBy() {
        return this.orderBy;
    }

    public ListWorkspacesRequest setTeamId(String teamId) {
        this.teamId = teamId;
        return this;
    }
    public String getTeamId() {
        return this.teamId;
    }

    public ListWorkspacesRequest setTenantContext(ListWorkspacesRequestTenantContext tenantContext) {
        this.tenantContext = tenantContext;
        return this;
    }
    public ListWorkspacesRequestTenantContext getTenantContext() {
        return this.tenantContext;
    }

    public ListWorkspacesRequest setWithPermissionRole(Boolean withPermissionRole) {
        this.withPermissionRole = withPermissionRole;
        return this;
    }
    public Boolean getWithPermissionRole() {
        return this.withPermissionRole;
    }

    public static class ListWorkspacesRequestTenantContext extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("tenantId")
        public String tenantId;

        public static ListWorkspacesRequestTenantContext build(java.util.Map<String, ?> map) throws Exception {
            ListWorkspacesRequestTenantContext self = new ListWorkspacesRequestTenantContext();
            return TeaModel.build(map, self);
        }

        public ListWorkspacesRequestTenantContext setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

}
