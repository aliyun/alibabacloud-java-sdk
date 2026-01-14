// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.energyexpertexternal20220923.models;

import com.aliyun.tea.*;

public class ChatStreamRequest extends TeaModel {
    @NameInMap("documentIds")
    public java.util.List<Long> documentIds;

    /**
     * <p>Q&amp;A content.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>How to access knowledge base Q&amp;A documents.</p>
     */
    @NameInMap("question")
    public String question;

    /**
     * <ul>
     * <li>Q&amp;A session ID.</li>
     * <li>Historical sessions can be retrieved through GetSessionList.</li>
     * <li>A new session can also be created via CreateChatSession.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>bfce2248-1546-4298-8bcf-70ac26e69646</p>
     */
    @NameInMap("sessionId")
    public String sessionId;

    public static ChatStreamRequest build(java.util.Map<String, ?> map) throws Exception {
        ChatStreamRequest self = new ChatStreamRequest();
        return TeaModel.build(map, self);
    }

    public ChatStreamRequest setDocumentIds(java.util.List<Long> documentIds) {
        this.documentIds = documentIds;
        return this;
    }
    public java.util.List<Long> getDocumentIds() {
        return this.documentIds;
    }

    public ChatStreamRequest setQuestion(String question) {
        this.question = question;
        return this;
    }
    public String getQuestion() {
        return this.question;
    }

    public ChatStreamRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

}
