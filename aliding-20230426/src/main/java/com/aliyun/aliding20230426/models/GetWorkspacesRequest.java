// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetWorkspacesRequest extends TeaModel {
    @NameInMap("Option")
    public GetWorkspacesRequestOption option;

    @NameInMap("TenantContext")
    public GetWorkspacesRequestTenantContext tenantContext;

    @NameInMap("WorkspaceIds")
    public java.util.List<String> workspaceIds;

    public static GetWorkspacesRequest build(java.util.Map<String, ?> map) throws Exception {
        GetWorkspacesRequest self = new GetWorkspacesRequest();
        return TeaModel.build(map, self);
    }

    public GetWorkspacesRequest setOption(GetWorkspacesRequestOption option) {
        this.option = option;
        return this;
    }
    public GetWorkspacesRequestOption getOption() {
        return this.option;
    }

    public GetWorkspacesRequest setTenantContext(GetWorkspacesRequestTenantContext tenantContext) {
        this.tenantContext = tenantContext;
        return this;
    }
    public GetWorkspacesRequestTenantContext getTenantContext() {
        return this.tenantContext;
    }

    public GetWorkspacesRequest setWorkspaceIds(java.util.List<String> workspaceIds) {
        this.workspaceIds = workspaceIds;
        return this;
    }
    public java.util.List<String> getWorkspaceIds() {
        return this.workspaceIds;
    }

    public static class GetWorkspacesRequestOption extends TeaModel {
        @NameInMap("WithPermissionRole")
        public Boolean withPermissionRole;

        public static GetWorkspacesRequestOption build(java.util.Map<String, ?> map) throws Exception {
            GetWorkspacesRequestOption self = new GetWorkspacesRequestOption();
            return TeaModel.build(map, self);
        }

        public GetWorkspacesRequestOption setWithPermissionRole(Boolean withPermissionRole) {
            this.withPermissionRole = withPermissionRole;
            return this;
        }
        public Boolean getWithPermissionRole() {
            return this.withPermissionRole;
        }

    }

    public static class GetWorkspacesRequestTenantContext extends TeaModel {
        @NameInMap("tenantId")
        public String tenantId;

        public static GetWorkspacesRequestTenantContext build(java.util.Map<String, ?> map) throws Exception {
            GetWorkspacesRequestTenantContext self = new GetWorkspacesRequestTenantContext();
            return TeaModel.build(map, self);
        }

        public GetWorkspacesRequestTenantContext setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

}
