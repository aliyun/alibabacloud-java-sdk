// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class RunSearchGenerationShrinkRequest extends TeaModel {
    /**
     * <p>Context.</p>
     */
    @NameInMap("AgentContext")
    public String agentContextShrink;

    /**
     * <p>Session configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("ChatConfig")
    public String chatConfigShrink;

    /**
     * <p>Image URL. Used for image search and hybrid text-and-image (prompt) search generation.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://xxxx">http://xxxx</a></p>
     */
    @NameInMap("FileUrl")
    public String fileUrl;

    /**
     * <p>Model ID:</p>
     * <ul>
     * <li><p>quanmiao-max: Quanmiao-Max</p>
     * </li>
     * <li><p>quanmiao-plus: Quanmiao-Plus</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>quanmiao-max</p>
     */
    @NameInMap("ModelId")
    public String modelId;

    /**
     * <p>Original session identifier. Usually empty. When non-empty, it indicates that the current conversation is based on the referenced session. The system loads parameters and search results from that session and replaces the generated result. Use this for re-generation, changing data sources, or adding new agents.</p>
     * 
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("OriginalSessionId")
    public String originalSessionId;

    /**
     * <p>Search query.</p>
     * 
     * <strong>example:</strong>
     * <p>杭州亚运会吉祥物是什么</p>
     */
    @NameInMap("Prompt")
    public String prompt;

    /**
     * <p>Unique identifier for the session task.</p>
     * <blockquote>
     * <p>By default, you do not need to provide a TaskId. The system generates one automatically. If you specify the same TaskId in subsequent requests, those tasks are grouped into the same conversation.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>7AA2AE16-D873-5C5F-9708-15396C382EB1</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    /**
     * <p>ID of the Alibaba Cloud Model Studio workspace. To learn how to obtain this ID, see <a href="https://help.aliyun.com/document_detail/2782167.html">How to use workspaces</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>llm-xxx</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static RunSearchGenerationShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        RunSearchGenerationShrinkRequest self = new RunSearchGenerationShrinkRequest();
        return TeaModel.build(map, self);
    }

    public RunSearchGenerationShrinkRequest setAgentContextShrink(String agentContextShrink) {
        this.agentContextShrink = agentContextShrink;
        return this;
    }
    public String getAgentContextShrink() {
        return this.agentContextShrink;
    }

    public RunSearchGenerationShrinkRequest setChatConfigShrink(String chatConfigShrink) {
        this.chatConfigShrink = chatConfigShrink;
        return this;
    }
    public String getChatConfigShrink() {
        return this.chatConfigShrink;
    }

    public RunSearchGenerationShrinkRequest setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
        return this;
    }
    public String getFileUrl() {
        return this.fileUrl;
    }

    public RunSearchGenerationShrinkRequest setModelId(String modelId) {
        this.modelId = modelId;
        return this;
    }
    public String getModelId() {
        return this.modelId;
    }

    public RunSearchGenerationShrinkRequest setOriginalSessionId(String originalSessionId) {
        this.originalSessionId = originalSessionId;
        return this;
    }
    public String getOriginalSessionId() {
        return this.originalSessionId;
    }

    public RunSearchGenerationShrinkRequest setPrompt(String prompt) {
        this.prompt = prompt;
        return this;
    }
    public String getPrompt() {
        return this.prompt;
    }

    public RunSearchGenerationShrinkRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public RunSearchGenerationShrinkRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
