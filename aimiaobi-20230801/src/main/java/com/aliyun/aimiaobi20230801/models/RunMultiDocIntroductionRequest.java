// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class RunMultiDocIntroductionRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("DocIds")
    public java.util.List<String> docIds;

    @NameInMap("KeyPointPrompt")
    public String keyPointPrompt;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>75bf82fa-b71b-45d7-ae40-0b00e496cd9e</p>
     */
    @NameInMap("SessionId")
    public String sessionId;

    @NameInMap("SummaryPrompt")
    public String summaryPrompt;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>llm-2setzb9x4ewsd</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static RunMultiDocIntroductionRequest build(java.util.Map<String, ?> map) throws Exception {
        RunMultiDocIntroductionRequest self = new RunMultiDocIntroductionRequest();
        return TeaModel.build(map, self);
    }

    public RunMultiDocIntroductionRequest setDocIds(java.util.List<String> docIds) {
        this.docIds = docIds;
        return this;
    }
    public java.util.List<String> getDocIds() {
        return this.docIds;
    }

    public RunMultiDocIntroductionRequest setKeyPointPrompt(String keyPointPrompt) {
        this.keyPointPrompt = keyPointPrompt;
        return this;
    }
    public String getKeyPointPrompt() {
        return this.keyPointPrompt;
    }

    public RunMultiDocIntroductionRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public RunMultiDocIntroductionRequest setSummaryPrompt(String summaryPrompt) {
        this.summaryPrompt = summaryPrompt;
        return this;
    }
    public String getSummaryPrompt() {
        return this.summaryPrompt;
    }

    public RunMultiDocIntroductionRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
