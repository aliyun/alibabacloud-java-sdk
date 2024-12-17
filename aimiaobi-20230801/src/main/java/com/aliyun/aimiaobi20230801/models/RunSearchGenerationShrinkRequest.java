// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class RunSearchGenerationShrinkRequest extends TeaModel {
    @NameInMap("AgentContext")
    public String agentContextShrink;

    /**
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("ChatConfig")
    public String chatConfigShrink;

    /**
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("OriginalSessionId")
    public String originalSessionId;

    /**
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("Prompt")
    public String prompt;

    /**
     * <strong>example:</strong>
     * <p>7AA2AE16-D873-5C5F-9708-15396C382EB1</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    /**
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
