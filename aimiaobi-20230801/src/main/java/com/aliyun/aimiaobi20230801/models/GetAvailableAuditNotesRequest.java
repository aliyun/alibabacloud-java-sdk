// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class GetAvailableAuditNotesRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>llm-xx</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static GetAvailableAuditNotesRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAvailableAuditNotesRequest self = new GetAvailableAuditNotesRequest();
        return TeaModel.build(map, self);
    }

    public GetAvailableAuditNotesRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
