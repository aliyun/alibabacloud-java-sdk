// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class DeleteDataPermissionsShrinkRequest extends TeaModel {
    /**
     * <p>The permission IDs.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Ids")
    public String idsShrink;

    /**
     * <p>The unique ID of the Alibaba Cloud Model Studio workspace. For more information, see <a href="https://help.aliyun.com/document_detail/2587495.html">Get a workspace ID</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>llm-xxx</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static DeleteDataPermissionsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDataPermissionsShrinkRequest self = new DeleteDataPermissionsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DeleteDataPermissionsShrinkRequest setIdsShrink(String idsShrink) {
        this.idsShrink = idsShrink;
        return this;
    }
    public String getIdsShrink() {
        return this.idsShrink;
    }

    public DeleteDataPermissionsShrinkRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
