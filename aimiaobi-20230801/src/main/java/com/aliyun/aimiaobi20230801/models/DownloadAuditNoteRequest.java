// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class DownloadAuditNoteRequest extends TeaModel {
    /**
     * <p>Rule library ID. If left blank, the default is Default.</p>
     */
    @NameInMap("NoteId")
    public String noteId;

    /**
     * <p>The task ID obtained by calling the SubmitAuditNote API. This is the unique identifier for the custom rule library task index. Store it securely when using it. When using this API, if the input parameters include \<code>taskId\\</code>, you can retrieve the structured rule library that you successfully uploaded via the SubmitAuditNote API but has not undergone post-processing by ConfirmAndProcessAuditNote. If the input parameters do not include \<code>taskId\\</code>, you can retrieve the structured rule library that has undergone post-processing and is available for auditing.</p>
     * 
     * <strong>example:</strong>
     * <p>xxx_Default_1241541251241</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    /**
     * <p>The unique identifier of the Alibaba Cloud Model Studio workspace. Get the <a href="https://help.aliyun.com/document_detail/2782167.html">Workspace ID</a>.</p>
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

    public DownloadAuditNoteRequest setNoteId(String noteId) {
        this.noteId = noteId;
        return this;
    }
    public String getNoteId() {
        return this.noteId;
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
