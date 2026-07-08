// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class RunDocBrainmapRequest extends TeaModel {
    /**
     * <p>Indicates whether to clear the previous cache.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("CleanCache")
    public Boolean cleanCache;

    /**
     * <p>The document ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>12345</p>
     */
    @NameInMap("DocId")
    public String docId;

    /**
     * <p>The name of the model to use.</p>
     * 
     * <strong>example:</strong>
     * <p>quanmiao-max、quanmiao-plus</p>
     */
    @NameInMap("ModelName")
    public String modelName;

    /**
     * <p>The number of nodes to generate at the second level of the mind map.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("NodeNumber")
    public Integer nodeNumber;

    /**
     * <p>A custom prompt to guide the mind map generation.</p>
     * 
     * <strong>example:</strong>
     * <p>请按英文输出</p>
     */
    @NameInMap("Prompt")
    public String prompt;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("ResponseFormat")
    public Integer responseFormat;

    /**
     * <p>The session ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>3f7045e099474ba28ceca1b4eb6d6e21</p>
     */
    @NameInMap("SessionId")
    public String sessionId;

    /**
     * <p>The maximum number of words in each node.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("WordNumber")
    public Integer wordNumber;

    /**
     * <p>The ID of the Model Studio workspace. For more information, see <a href="https://help.aliyun.com/document_detail/2782167.html">How to use a workspace</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>llm-xxx</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    /**
     * <p>The source content for generating the mind map. This parameter takes precedence over <code>DocId</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>要生成脑图的内容</p>
     */
    @NameInMap("referenceContent")
    public String referenceContent;

    public static RunDocBrainmapRequest build(java.util.Map<String, ?> map) throws Exception {
        RunDocBrainmapRequest self = new RunDocBrainmapRequest();
        return TeaModel.build(map, self);
    }

    public RunDocBrainmapRequest setCleanCache(Boolean cleanCache) {
        this.cleanCache = cleanCache;
        return this;
    }
    public Boolean getCleanCache() {
        return this.cleanCache;
    }

    public RunDocBrainmapRequest setDocId(String docId) {
        this.docId = docId;
        return this;
    }
    public String getDocId() {
        return this.docId;
    }

    public RunDocBrainmapRequest setModelName(String modelName) {
        this.modelName = modelName;
        return this;
    }
    public String getModelName() {
        return this.modelName;
    }

    public RunDocBrainmapRequest setNodeNumber(Integer nodeNumber) {
        this.nodeNumber = nodeNumber;
        return this;
    }
    public Integer getNodeNumber() {
        return this.nodeNumber;
    }

    public RunDocBrainmapRequest setPrompt(String prompt) {
        this.prompt = prompt;
        return this;
    }
    public String getPrompt() {
        return this.prompt;
    }

    public RunDocBrainmapRequest setResponseFormat(Integer responseFormat) {
        this.responseFormat = responseFormat;
        return this;
    }
    public Integer getResponseFormat() {
        return this.responseFormat;
    }

    public RunDocBrainmapRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public RunDocBrainmapRequest setWordNumber(Integer wordNumber) {
        this.wordNumber = wordNumber;
        return this;
    }
    public Integer getWordNumber() {
        return this.wordNumber;
    }

    public RunDocBrainmapRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public RunDocBrainmapRequest setReferenceContent(String referenceContent) {
        this.referenceContent = referenceContent;
        return this;
    }
    public String getReferenceContent() {
        return this.referenceContent;
    }

}
