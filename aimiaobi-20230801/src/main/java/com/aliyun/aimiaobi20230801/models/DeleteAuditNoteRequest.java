// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class DeleteAuditNoteRequest extends TeaModel {
    /**
     * <p>Rule library ID. If left blank, the default is used.</p>
     */
    @NameInMap("NoteId")
    public String noteId;

    /**
     * <p>The unique identifier for an Alibaba Cloud Model Studio workspace: Get the <a href="https://help.aliyun.com/document_detail/2782167.html">Workspace ID</a></p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>llm-xx</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static DeleteAuditNoteRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAuditNoteRequest self = new DeleteAuditNoteRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAuditNoteRequest setNoteId(String noteId) {
        this.noteId = noteId;
        return this;
    }
    public String getNoteId() {
        return this.noteId;
    }

    public DeleteAuditNoteRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
