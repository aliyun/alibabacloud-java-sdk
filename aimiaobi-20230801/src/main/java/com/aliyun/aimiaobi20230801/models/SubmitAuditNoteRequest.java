// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class SubmitAuditNoteRequest extends TeaModel {
    /**
     * <p>The FileKey of your rule library file stored in Alibaba Cloud OSS. For how to generate a FileKey, see <a href="https://next.api.aliyun.com/document/AiMiaoBi/2023-08-01/GenerateUploadConfig?spm=openapi-amp.newDocPublishment.0.0.18fc281fOiiBil">Common APIs: GenerateUploadConfig for File Upload and Download</a>. Your rule library file must be in DOCX, XLSX, or PDF format. If you use XLSX, it must have exactly two columns. The table header must be &quot;Proofreading Basis&quot; and &quot;Source&quot;. XLSX files give the best parsing results. DOCX and PDF files are also parsed automatically.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>oss://default/your/file/key</p>
     */
    @NameInMap("FileKey")
    public String fileKey;

    /**
     * <p>ID of the rule library. If you omit this parameter, the system uses Default.</p>
     * 
     * <strong>example:</strong>
     * <p>note_id_unique</p>
     */
    @NameInMap("NoteId")
    public String noteId;

    /**
     * <p>Unique identifier of your Model Studio workspace. To get this ID, see <a href="https://help.aliyun.com/document_detail/2782167.html">Get the Workspace ID</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>llm-xx</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static SubmitAuditNoteRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitAuditNoteRequest self = new SubmitAuditNoteRequest();
        return TeaModel.build(map, self);
    }

    public SubmitAuditNoteRequest setFileKey(String fileKey) {
        this.fileKey = fileKey;
        return this;
    }
    public String getFileKey() {
        return this.fileKey;
    }

    public SubmitAuditNoteRequest setNoteId(String noteId) {
        this.noteId = noteId;
        return this;
    }
    public String getNoteId() {
        return this.noteId;
    }

    public SubmitAuditNoteRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
