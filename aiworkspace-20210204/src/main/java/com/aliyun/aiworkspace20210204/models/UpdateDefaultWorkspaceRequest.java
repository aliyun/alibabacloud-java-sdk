// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class UpdateDefaultWorkspaceRequest extends TeaModel {
    /**
     * <p>The workspace ID. You can call <a href="https://help.aliyun.com/document_detail/449124.html">ListWorkspaces</a> to obtain the workspace ID.</p>
     * 
     * <strong>example:</strong>
     * <p>12345</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static UpdateDefaultWorkspaceRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDefaultWorkspaceRequest self = new UpdateDefaultWorkspaceRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDefaultWorkspaceRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
