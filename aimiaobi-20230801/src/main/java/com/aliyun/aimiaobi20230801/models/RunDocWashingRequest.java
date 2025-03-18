// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class RunDocWashingRequest extends TeaModel {
    @NameInMap("Prompt")
    public String prompt;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ReferenceContent")
    public String referenceContent;

    @NameInMap("SessionId")
    public String sessionId;

    @NameInMap("Topic")
    public String topic;

    /**
     * <strong>example:</strong>
     * <p>500</p>
     */
    @NameInMap("WordNumber")
    public Integer wordNumber;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>llm-2setzb9x4ewsd</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    @NameInMap("WritingTypeName")
    public String writingTypeName;

    @NameInMap("WritingTypeRefDoc")
    public String writingTypeRefDoc;

    public static RunDocWashingRequest build(java.util.Map<String, ?> map) throws Exception {
        RunDocWashingRequest self = new RunDocWashingRequest();
        return TeaModel.build(map, self);
    }

    public RunDocWashingRequest setPrompt(String prompt) {
        this.prompt = prompt;
        return this;
    }
    public String getPrompt() {
        return this.prompt;
    }

    public RunDocWashingRequest setReferenceContent(String referenceContent) {
        this.referenceContent = referenceContent;
        return this;
    }
    public String getReferenceContent() {
        return this.referenceContent;
    }

    public RunDocWashingRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public RunDocWashingRequest setTopic(String topic) {
        this.topic = topic;
        return this;
    }
    public String getTopic() {
        return this.topic;
    }

    public RunDocWashingRequest setWordNumber(Integer wordNumber) {
        this.wordNumber = wordNumber;
        return this;
    }
    public Integer getWordNumber() {
        return this.wordNumber;
    }

    public RunDocWashingRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public RunDocWashingRequest setWritingTypeName(String writingTypeName) {
        this.writingTypeName = writingTypeName;
        return this;
    }
    public String getWritingTypeName() {
        return this.writingTypeName;
    }

    public RunDocWashingRequest setWritingTypeRefDoc(String writingTypeRefDoc) {
        this.writingTypeRefDoc = writingTypeRefDoc;
        return this;
    }
    public String getWritingTypeRefDoc() {
        return this.writingTypeRefDoc;
    }

}
