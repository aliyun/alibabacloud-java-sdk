// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class RunGenerateQuestionsRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>oOgIwodFANW1u5MnqxysOh1rtld3xn</p>
     */
    @NameInMap("DocId")
    public String docId;

    @NameInMap("ReferenceContent")
    public String referenceContent;

    /**
     * <strong>example:</strong>
     * <p>f486c4e2-b773-4d65-88f8-2ba540610456</p>
     */
    @NameInMap("SessionId")
    public String sessionId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>llm-w335gauzlbba2vze</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static RunGenerateQuestionsRequest build(java.util.Map<String, ?> map) throws Exception {
        RunGenerateQuestionsRequest self = new RunGenerateQuestionsRequest();
        return TeaModel.build(map, self);
    }

    public RunGenerateQuestionsRequest setDocId(String docId) {
        this.docId = docId;
        return this;
    }
    public String getDocId() {
        return this.docId;
    }

    public RunGenerateQuestionsRequest setReferenceContent(String referenceContent) {
        this.referenceContent = referenceContent;
        return this;
    }
    public String getReferenceContent() {
        return this.referenceContent;
    }

    public RunGenerateQuestionsRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public RunGenerateQuestionsRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
