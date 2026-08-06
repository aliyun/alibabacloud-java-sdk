// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class GetPromptRequest extends TeaModel {
    /**
     * <p>The workspace ID. To obtain the workspace ID, refer to <a href="https://help.aliyun.com/document_detail/449124.html">ListWorkspaces</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>114243</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static GetPromptRequest build(java.util.Map<String, ?> map) throws Exception {
        GetPromptRequest self = new GetPromptRequest();
        return TeaModel.build(map, self);
    }

    public GetPromptRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
