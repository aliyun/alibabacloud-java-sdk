// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetWorkspaceRequest extends TeaModel {
    @NameInMap("TenantContext")
    public GetWorkspaceRequestTenantContext tenantContext;

    @NameInMap("WithPermissionRole")
    public Boolean withPermissionRole;

    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static GetWorkspaceRequest build(java.util.Map<String, ?> map) throws Exception {
        GetWorkspaceRequest self = new GetWorkspaceRequest();
        return TeaModel.build(map, self);
    }

    public GetWorkspaceRequest setTenantContext(GetWorkspaceRequestTenantContext tenantContext) {
        this.tenantContext = tenantContext;
        return this;
    }
    public GetWorkspaceRequestTenantContext getTenantContext() {
        return this.tenantContext;
    }

    public GetWorkspaceRequest setWithPermissionRole(Boolean withPermissionRole) {
        this.withPermissionRole = withPermissionRole;
        return this;
    }
    public Boolean getWithPermissionRole() {
        return this.withPermissionRole;
    }

    public GetWorkspaceRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static class GetWorkspaceRequestTenantContext extends TeaModel {
        @NameInMap("tenantId")
        public String tenantId;

        public static GetWorkspaceRequestTenantContext build(java.util.Map<String, ?> map) throws Exception {
            GetWorkspaceRequestTenantContext self = new GetWorkspaceRequestTenantContext();
            return TeaModel.build(map, self);
        }

        public GetWorkspaceRequestTenantContext setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

}
