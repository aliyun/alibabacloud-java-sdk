// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emrstudio20240430.models;

import com.aliyun.tea.*;

public class DeleteWorkflowRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("workspaceId")
    public String workspaceId;

    public static DeleteWorkflowRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteWorkflowRequest self = new DeleteWorkflowRequest();
        return TeaModel.build(map, self);
    }

    public DeleteWorkflowRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
