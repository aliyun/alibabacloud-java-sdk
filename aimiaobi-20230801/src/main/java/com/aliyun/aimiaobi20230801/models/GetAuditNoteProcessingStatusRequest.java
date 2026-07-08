// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class GetAuditNoteProcessingStatusRequest extends TeaModel {
    /**
     * <p>Task ID returned by the SubmitAuditNote operation. Save this ID securely. It uniquely identifies your custom rule library task.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>xxx_Default_129873419274</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    /**
     * <p>Unique identifier of your Model Studio workspace. To get this ID, see <a href="https://help.aliyun.com/document_detail/2782167.html">Workspace ID</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>llm-xx</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static GetAuditNoteProcessingStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAuditNoteProcessingStatusRequest self = new GetAuditNoteProcessingStatusRequest();
        return TeaModel.build(map, self);
    }

    public GetAuditNoteProcessingStatusRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public GetAuditNoteProcessingStatusRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
