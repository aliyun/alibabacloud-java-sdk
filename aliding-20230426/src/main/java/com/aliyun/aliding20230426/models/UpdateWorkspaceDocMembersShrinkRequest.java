// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class UpdateWorkspaceDocMembersShrinkRequest extends TeaModel {
    @NameInMap("Members")
    public String membersShrink;

    @NameInMap("NodeId")
    public String nodeId;

    @NameInMap("TenantContext")
    public String tenantContextShrink;

    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static UpdateWorkspaceDocMembersShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateWorkspaceDocMembersShrinkRequest self = new UpdateWorkspaceDocMembersShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateWorkspaceDocMembersShrinkRequest setMembersShrink(String membersShrink) {
        this.membersShrink = membersShrink;
        return this;
    }
    public String getMembersShrink() {
        return this.membersShrink;
    }

    public UpdateWorkspaceDocMembersShrinkRequest setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public String getNodeId() {
        return this.nodeId;
    }

    public UpdateWorkspaceDocMembersShrinkRequest setTenantContextShrink(String tenantContextShrink) {
        this.tenantContextShrink = tenantContextShrink;
        return this;
    }
    public String getTenantContextShrink() {
        return this.tenantContextShrink;
    }

    public UpdateWorkspaceDocMembersShrinkRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
