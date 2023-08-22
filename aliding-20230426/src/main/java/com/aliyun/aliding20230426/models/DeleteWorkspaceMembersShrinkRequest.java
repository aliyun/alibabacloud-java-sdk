// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class DeleteWorkspaceMembersShrinkRequest extends TeaModel {
    @NameInMap("Members")
    public String membersShrink;

    @NameInMap("TenantContext")
    public String tenantContextShrink;

    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static DeleteWorkspaceMembersShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteWorkspaceMembersShrinkRequest self = new DeleteWorkspaceMembersShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DeleteWorkspaceMembersShrinkRequest setMembersShrink(String membersShrink) {
        this.membersShrink = membersShrink;
        return this;
    }
    public String getMembersShrink() {
        return this.membersShrink;
    }

    public DeleteWorkspaceMembersShrinkRequest setTenantContextShrink(String tenantContextShrink) {
        this.tenantContextShrink = tenantContextShrink;
        return this;
    }
    public String getTenantContextShrink() {
        return this.tenantContextShrink;
    }

    public DeleteWorkspaceMembersShrinkRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
