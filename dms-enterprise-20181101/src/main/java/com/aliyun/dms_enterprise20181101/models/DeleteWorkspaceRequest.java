// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class DeleteWorkspaceRequest extends TeaModel {
    /**
     * <p>The ID of the DMS workspace.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>12****</p>
     */
    @NameInMap("WorkspaceId")
    public Long workspaceId;

    public static DeleteWorkspaceRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteWorkspaceRequest self = new DeleteWorkspaceRequest();
        return TeaModel.build(map, self);
    }

    public DeleteWorkspaceRequest setWorkspaceId(Long workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public Long getWorkspaceId() {
        return this.workspaceId;
    }

}
