// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class AddWorkspaceMembersShrinkRequest extends TeaModel {
    @NameInMap("Members")
    public String membersShrink;

    @NameInMap("TenantContext")
    public String tenantContextShrink;

    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static AddWorkspaceMembersShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        AddWorkspaceMembersShrinkRequest self = new AddWorkspaceMembersShrinkRequest();
        return TeaModel.build(map, self);
    }

    public AddWorkspaceMembersShrinkRequest setMembersShrink(String membersShrink) {
        this.membersShrink = membersShrink;
        return this;
    }
    public String getMembersShrink() {
        return this.membersShrink;
    }

    public AddWorkspaceMembersShrinkRequest setTenantContextShrink(String tenantContextShrink) {
        this.tenantContextShrink = tenantContextShrink;
        return this;
    }
    public String getTenantContextShrink() {
        return this.tenantContextShrink;
    }

    public AddWorkspaceMembersShrinkRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
