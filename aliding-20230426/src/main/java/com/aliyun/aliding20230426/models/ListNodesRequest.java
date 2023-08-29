// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class ListNodesRequest extends TeaModel {
    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("ParentNodeId")
    public String parentNodeId;

    @NameInMap("TenantContext")
    public ListNodesRequestTenantContext tenantContext;

    @NameInMap("WithPermissionRole")
    public Boolean withPermissionRole;

    public static ListNodesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListNodesRequest self = new ListNodesRequest();
        return TeaModel.build(map, self);
    }

    public ListNodesRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListNodesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListNodesRequest setParentNodeId(String parentNodeId) {
        this.parentNodeId = parentNodeId;
        return this;
    }
    public String getParentNodeId() {
        return this.parentNodeId;
    }

    public ListNodesRequest setTenantContext(ListNodesRequestTenantContext tenantContext) {
        this.tenantContext = tenantContext;
        return this;
    }
    public ListNodesRequestTenantContext getTenantContext() {
        return this.tenantContext;
    }

    public ListNodesRequest setWithPermissionRole(Boolean withPermissionRole) {
        this.withPermissionRole = withPermissionRole;
        return this;
    }
    public Boolean getWithPermissionRole() {
        return this.withPermissionRole;
    }

    public static class ListNodesRequestTenantContext extends TeaModel {
        @NameInMap("tenantId")
        public String tenantId;

        public static ListNodesRequestTenantContext build(java.util.Map<String, ?> map) throws Exception {
            ListNodesRequestTenantContext self = new ListNodesRequestTenantContext();
            return TeaModel.build(map, self);
        }

        public ListNodesRequestTenantContext setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

}
