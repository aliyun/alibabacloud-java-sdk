// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class ConfirmAndPostProcessAuditNoteRequest extends TeaModel {
    /**
     * <p>The TaskId obtained from the SubmitAuditNote interface. This is the unique identifier for the custom rule library task index. Store it securely when using it.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>xxx_Default_1241541251241</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    /**
     * <p>Alibaba Cloud Model Studio workspace unique identifier: Get <a href="https://help.aliyun.com/document_detail/2782167.html">Workspace ID</a></p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>llm-xx</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static ConfirmAndPostProcessAuditNoteRequest build(java.util.Map<String, ?> map) throws Exception {
        ConfirmAndPostProcessAuditNoteRequest self = new ConfirmAndPostProcessAuditNoteRequest();
        return TeaModel.build(map, self);
    }

    public ConfirmAndPostProcessAuditNoteRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public ConfirmAndPostProcessAuditNoteRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
