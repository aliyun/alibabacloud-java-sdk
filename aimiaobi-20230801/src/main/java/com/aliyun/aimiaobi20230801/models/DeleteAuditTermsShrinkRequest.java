// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class DeleteAuditTermsShrinkRequest extends TeaModel {
    @NameInMap("IdList")
    public String idListShrink;

    /**
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
