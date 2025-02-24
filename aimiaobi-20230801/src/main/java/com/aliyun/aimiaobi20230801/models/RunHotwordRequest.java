// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class RunHotwordRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>84ufBYEeLMZOjRFo84HJ7ySL3Efr55</p>
     */
    @NameInMap("DocId")
    public String docId;

    @NameInMap("Prompt")
    public String prompt;

    @NameInMap("ReferenceContent")
    public String referenceContent;

    /**
     * <strong>example:</strong>
     * <p>e32a1a3f-1f7e-41dd-b888-ef1d91b96d1e</p>
     */
    @NameInMap("SessionId")
    public String sessionId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>llm-baw8as25ll3wnzjr</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static RunHotwordRequest build(java.util.Map<String, ?> map) throws Exception {
        RunHotwordRequest self = new RunHotwordRequest();
        return TeaModel.build(map, self);
    }

    public RunHotwordRequest setDocId(String docId) {
        this.docId = docId;
        return this;
    }
    public String getDocId() {
        return this.docId;
    }

    public RunHotwordRequest setPrompt(String prompt) {
        this.prompt = prompt;
        return this;
    }
    public String getPrompt() {
        return this.prompt;
    }

    public RunHotwordRequest setReferenceContent(String referenceContent) {
        this.referenceContent = referenceContent;
        return this;
    }
    public String getReferenceContent() {
        return this.referenceContent;
    }

    public RunHotwordRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public RunHotwordRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
