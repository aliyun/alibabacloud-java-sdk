// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class RunDocIntroductionRequest extends TeaModel {
    /**
     * <p>Purge cache</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("CleanCache")
    public Boolean cleanCache;

    /**
     * <p>Document ID</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>12345</p>
     */
    @NameInMap("DocId")
    public String docId;

    /**
     * <p>Custom requirements for the document summary</p>
     * 
     * <strong>example:</strong>
     * <p>用英文输出</p>
     */
    @NameInMap("IntroductionPrompt")
    public String introductionPrompt;

    /**
     * <p>Custom requirements for key points</p>
     * 
     * <strong>example:</strong>
     * <p>用英文输出</p>
     */
    @NameInMap("KeyPointPrompt")
    public String keyPointPrompt;

    /**
     * <p>User-defined model name</p>
     * 
     * <strong>example:</strong>
     * <p>quanmiao-max、quanmiao-plus</p>
     */
    @NameInMap("ModelName")
    public String modelName;

    /**
     * <p>Conversation ID</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>a3b5eb35-6b28-4cf9-ac09-1dec25ab4df6</p>
     */
    @NameInMap("SessionId")
    public String sessionId;

    /**
     * <p>Custom requirements for the summary content</p>
     * 
     * <strong>example:</strong>
     * <p>用英文输出</p>
     */
    @NameInMap("SummaryPrompt")
    public String summaryPrompt;

    /**
     * <p>Unique identifier (UUID) of the Alibaba Cloud Model Studio workspace. For more information, see <a href="https://help.aliyun.com/document_detail/2587495.html">Workspace ID</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>xxxx</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    /**
     * <p>Content to generate the summary from. If not empty, this value takes precedence over docId.</p>
     * 
     * <strong>example:</strong>
     * <p>要进行导读的内容</p>
     */
    @NameInMap("referenceContent")
    public String referenceContent;

    public static RunDocIntroductionRequest build(java.util.Map<String, ?> map) throws Exception {
        RunDocIntroductionRequest self = new RunDocIntroductionRequest();
        return TeaModel.build(map, self);
    }

    public RunDocIntroductionRequest setCleanCache(Boolean cleanCache) {
        this.cleanCache = cleanCache;
        return this;
    }
    public Boolean getCleanCache() {
        return this.cleanCache;
    }

    public RunDocIntroductionRequest setDocId(String docId) {
        this.docId = docId;
        return this;
    }
    public String getDocId() {
        return this.docId;
    }

    public RunDocIntroductionRequest setIntroductionPrompt(String introductionPrompt) {
        this.introductionPrompt = introductionPrompt;
        return this;
    }
    public String getIntroductionPrompt() {
        return this.introductionPrompt;
    }

    public RunDocIntroductionRequest setKeyPointPrompt(String keyPointPrompt) {
        this.keyPointPrompt = keyPointPrompt;
        return this;
    }
    public String getKeyPointPrompt() {
        return this.keyPointPrompt;
    }

    public RunDocIntroductionRequest setModelName(String modelName) {
        this.modelName = modelName;
        return this;
    }
    public String getModelName() {
        return this.modelName;
    }

    public RunDocIntroductionRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public RunDocIntroductionRequest setSummaryPrompt(String summaryPrompt) {
        this.summaryPrompt = summaryPrompt;
        return this;
    }
    public String getSummaryPrompt() {
        return this.summaryPrompt;
    }

    public RunDocIntroductionRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public RunDocIntroductionRequest setReferenceContent(String referenceContent) {
        this.referenceContent = referenceContent;
        return this;
    }
    public String getReferenceContent() {
        return this.referenceContent;
    }

}
