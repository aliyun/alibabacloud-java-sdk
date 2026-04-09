// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class DeleteDataPermissionsRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Ids")
    public java.util.List<Long> ids;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>llm-xxx</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static DeleteDataPermissionsRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDataPermissionsRequest self = new DeleteDataPermissionsRequest();
        return TeaModel.build(map, self);
    }

    public DeleteDataPermissionsRequest setIds(java.util.List<Long> ids) {
        this.ids = ids;
        return this;
    }
    public java.util.List<Long> getIds() {
        return this.ids;
    }

    public DeleteDataPermissionsRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
