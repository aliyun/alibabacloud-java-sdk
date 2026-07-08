// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class DeleteAuditTermsShrinkRequest extends TeaModel {
    /**
     * <p>List of rule IDs for user logon audit terms to delete.</p>
     */
    @NameInMap("IdList")
    public String idListShrink;

    /**
     * <p>Unique identifier for the Alibaba Cloud Model Studio workspace. Get the <a href="https://help.aliyun.com/document_detail/2782167.html">Workspace ID</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>llm-xx</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static DeleteAuditTermsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAuditTermsShrinkRequest self = new DeleteAuditTermsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAuditTermsShrinkRequest setIdListShrink(String idListShrink) {
        this.idListShrink = idListShrink;
        return this;
    }
    public String getIdListShrink() {
        return this.idListShrink;
    }

    public DeleteAuditTermsShrinkRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
