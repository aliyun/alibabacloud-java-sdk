// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class GetAuditNotePostProcessingStatusRequest extends TeaModel {
    /**
     * <p>The task ID returned by the SubmitAuditNote operation. This is the unique identifier for the task index of the custom rule library. Save this ID for future use.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>xxx_Default_12847192741412</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    /**
     * <p>The unique ID of the Alibaba Cloud Model Studio workspace. For more information, see <a href="https://help.aliyun.com/document_detail/2782167.html">Get a Workspace ID</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>llm-xx</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static GetAuditNotePostProcessingStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAuditNotePostProcessingStatusRequest self = new GetAuditNotePostProcessingStatusRequest();
        return TeaModel.build(map, self);
    }

    public GetAuditNotePostProcessingStatusRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public GetAuditNotePostProcessingStatusRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
