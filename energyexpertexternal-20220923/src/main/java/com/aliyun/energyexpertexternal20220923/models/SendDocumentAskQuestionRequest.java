// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.energyexpertexternal20220923.models;

import com.aliyun.tea.*;

public class SendDocumentAskQuestionRequest extends TeaModel {
    /**
     * <p>Folder ID, used to specify the range of documents for the query. If it is empty, it indicates that all documents under the tenant will be queried.</p>
     * 
     * <strong>example:</strong>
     * <p>1a851c4a-1d65-11ef-99a7-ssfsfdd</p>
     */
    @NameInMap("folderId")
    public String folderId;

    /**
     * <p>The question queried by the user</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Total carbon emissions in 2023</p>
     */
    @NameInMap("prompt")
    public String prompt;

    /**
     * <p>Q&amp;A session ID, used to record multiple Q&amp;A interactions of the same user. If it is empty, it indicates that sessions are not distinguished.</p>
     * 
     * <strong>example:</strong>
     * <p>bfce2248-1546-4298-8bcf-70ac26e69646</p>
     */
    @NameInMap("sessionId")
    public String sessionId;

    public static SendDocumentAskQuestionRequest build(java.util.Map<String, ?> map) throws Exception {
        SendDocumentAskQuestionRequest self = new SendDocumentAskQuestionRequest();
        return TeaModel.build(map, self);
    }

    public SendDocumentAskQuestionRequest setFolderId(String folderId) {
        this.folderId = folderId;
        return this;
    }
    public String getFolderId() {
        return this.folderId;
    }

    public SendDocumentAskQuestionRequest setPrompt(String prompt) {
        this.prompt = prompt;
        return this;
    }
    public String getPrompt() {
        return this.prompt;
    }

    public SendDocumentAskQuestionRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

}
