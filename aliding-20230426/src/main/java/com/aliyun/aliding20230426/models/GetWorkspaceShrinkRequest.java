// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetWorkspaceShrinkRequest extends TeaModel {
    @NameInMap("TenantContext")
    public String tenantContextShrink;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("WithPermissionRole")
    public Boolean withPermissionRole;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>MJ0pDSKMV9dO20E4</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static GetWorkspaceShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GetWorkspaceShrinkRequest self = new GetWorkspaceShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GetWorkspaceShrinkRequest setTenantContextShrink(String tenantContextShrink) {
        this.tenantContextShrink = tenantContextShrink;
        return this;
    }
    public String getTenantContextShrink() {
        return this.tenantContextShrink;
    }

    public GetWorkspaceShrinkRequest setWithPermissionRole(Boolean withPermissionRole) {
        this.withPermissionRole = withPermissionRole;
        return this;
    }
    public Boolean getWithPermissionRole() {
        return this.withPermissionRole;
    }

    public GetWorkspaceShrinkRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
