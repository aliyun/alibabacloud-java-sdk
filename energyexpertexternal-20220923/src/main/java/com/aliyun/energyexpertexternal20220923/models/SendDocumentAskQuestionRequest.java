// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.energyexpertexternal20220923.models;

import com.aliyun.tea.*;

public class SendDocumentAskQuestionRequest extends TeaModel {
    @NameInMap("folderId")
    public String folderId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("prompt")
    public String prompt;

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
