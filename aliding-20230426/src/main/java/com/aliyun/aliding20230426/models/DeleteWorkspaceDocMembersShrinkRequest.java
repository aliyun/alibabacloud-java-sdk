// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class DeleteWorkspaceDocMembersShrinkRequest extends TeaModel {
    @NameInMap("Members")
    public String membersShrink;

    @NameInMap("NodeId")
    public String nodeId;

    @NameInMap("TenantContext")
    public String tenantContextShrink;

    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static DeleteWorkspaceDocMembersShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteWorkspaceDocMembersShrinkRequest self = new DeleteWorkspaceDocMembersShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DeleteWorkspaceDocMembersShrinkRequest setMembersShrink(String membersShrink) {
        this.membersShrink = membersShrink;
        return this;
    }
    public String getMembersShrink() {
        return this.membersShrink;
    }

    public DeleteWorkspaceDocMembersShrinkRequest setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public String getNodeId() {
        return this.nodeId;
    }

    public DeleteWorkspaceDocMembersShrinkRequest setTenantContextShrink(String tenantContextShrink) {
        this.tenantContextShrink = tenantContextShrink;
        return this;
    }
    public String getTenantContextShrink() {
        return this.tenantContextShrink;
    }

    public DeleteWorkspaceDocMembersShrinkRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
