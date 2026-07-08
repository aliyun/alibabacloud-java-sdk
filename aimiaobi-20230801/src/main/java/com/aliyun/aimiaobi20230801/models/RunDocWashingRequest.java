// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class RunDocWashingRequest extends TeaModel {
    /**
     * <p>Model ID</p>
     * 
     * <strong>example:</strong>
     * <p>quanmiao-max、quanmiao-plus</p>
     */
    @NameInMap("ModelId")
    public String modelId;

    /**
     * <p>Additional prompt requirements</p>
     * 
     * <strong>example:</strong>
     * <p>按英文输出</p>
     */
    @NameInMap("Prompt")
    public String prompt;

    /**
     * <p>The article to rewrite</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>文章内容</p>
     */
    @NameInMap("ReferenceContent")
    public String referenceContent;

    /**
     * <p>Channel ID</p>
     * 
     * <strong>example:</strong>
     * <p>3f7045e099474ba28ceca1b4eb6d6e21</p>
     */
    @NameInMap("SessionId")
    public String sessionId;

    /**
     * <p>Topic of the rewritten article</p>
     * 
     * <strong>example:</strong>
     * <p>云南旅游主题</p>
     */
    @NameInMap("Topic")
    public String topic;

    /**
     * <p>Required word count after rewriting</p>
     * 
     * <strong>example:</strong>
     * <p>500</p>
     */
    @NameInMap("WordNumber")
    public Integer wordNumber;

    /**
     * <p>Unique identifier for Alibaba Cloud Model Studio workspace: Get <a href="https://help.aliyun.com/document_detail/2782167.html">Workspace ID</a></p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>llm-2setzb9x4ewsd</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    /**
     * <p>Writing style type name</p>
     * 
     * <strong>example:</strong>
     * <p>小红书文体
     * 朋友圈文体
     * 专业新闻文体
     * 政府公文文体
     * 报纸文章文体
     * 意见信文体</p>
     */
    @NameInMap("WritingTypeName")
    public String writingTypeName;

    /**
     * <p>Example article for writing style</p>
     * 
     * <strong>example:</strong>
     * <p>该值若不为空则按该值优先</p>
     */
    @NameInMap("WritingTypeRefDoc")
    public String writingTypeRefDoc;

    public static RunDocWashingRequest build(java.util.Map<String, ?> map) throws Exception {
        RunDocWashingRequest self = new RunDocWashingRequest();
        return TeaModel.build(map, self);
    }

    public RunDocWashingRequest setModelId(String modelId) {
        this.modelId = modelId;
        return this;
    }
    public String getModelId() {
        return this.modelId;
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
