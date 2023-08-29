// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class ListWorkspacesShrinkRequest extends TeaModel {
    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("OrderBy")
    public String orderBy;

    @NameInMap("TeamId")
    public String teamId;

    @NameInMap("TenantContext")
    public String tenantContextShrink;

    @NameInMap("WithPermissionRole")
    public Boolean withPermissionRole;

    public static ListWorkspacesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListWorkspacesShrinkRequest self = new ListWorkspacesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListWorkspacesShrinkRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListWorkspacesShrinkRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListWorkspacesShrinkRequest setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }
    public String getOrderBy() {
        return this.orderBy;
    }

    public ListWorkspacesShrinkRequest setTeamId(String teamId) {
        this.teamId = teamId;
        return this;
    }
    public String getTeamId() {
        return this.teamId;
    }

    public ListWorkspacesShrinkRequest setTenantContextShrink(String tenantContextShrink) {
        this.tenantContextShrink = tenantContextShrink;
        return this;
    }
    public String getTenantContextShrink() {
        return this.tenantContextShrink;
    }

    public ListWorkspacesShrinkRequest setWithPermissionRole(Boolean withPermissionRole) {
        this.withPermissionRole = withPermissionRole;
        return this;
    }
    public Boolean getWithPermissionRole() {
        return this.withPermissionRole;
    }

}
