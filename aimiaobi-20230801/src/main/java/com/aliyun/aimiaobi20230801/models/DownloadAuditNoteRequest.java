// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class DownloadAuditNoteRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>xxx_Default_1241541251241</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>llm-xx</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static DownloadAuditNoteRequest build(java.util.Map<String, ?> map) throws Exception {
        DownloadAuditNoteRequest self = new DownloadAuditNoteRequest();
        return TeaModel.build(map, self);
    }

    public DownloadAuditNoteRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public DownloadAuditNoteRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
