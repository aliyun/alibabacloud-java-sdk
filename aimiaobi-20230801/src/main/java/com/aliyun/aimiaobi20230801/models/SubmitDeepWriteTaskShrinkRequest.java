// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class SubmitDeepWriteTaskShrinkRequest extends TeaModel {
    @NameInMap("AgentOrchestration")
    public String agentOrchestrationShrink;

    @NameInMap("Files")
    public String filesShrink;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>if can be null:</strong>
     * <p>false</p>
     */
    @NameInMap("Input")
    public String input;

    @NameInMap("Instructions")
    public String instructions;

    /**
     * <strong>example:</strong>
     * <p>llm-1setzb9xb8m11vrc</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static SubmitDeepWriteTaskShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitDeepWriteTaskShrinkRequest self = new SubmitDeepWriteTaskShrinkRequest();
        return TeaModel.build(map, self);
    }

    public SubmitDeepWriteTaskShrinkRequest setAgentOrchestrationShrink(String agentOrchestrationShrink) {
        this.agentOrchestrationShrink = agentOrchestrationShrink;
        return this;
    }
    public String getAgentOrchestrationShrink() {
        return this.agentOrchestrationShrink;
    }

    public SubmitDeepWriteTaskShrinkRequest setFilesShrink(String filesShrink) {
        this.filesShrink = filesShrink;
        return this;
    }
    public String getFilesShrink() {
        return this.filesShrink;
    }

    public SubmitDeepWriteTaskShrinkRequest setInput(String input) {
        this.input = input;
        return this;
    }
    public String getInput() {
        return this.input;
    }

    public SubmitDeepWriteTaskShrinkRequest setInstructions(String instructions) {
        this.instructions = instructions;
        return this;
    }
    public String getInstructions() {
        return this.instructions;
    }

    public SubmitDeepWriteTaskShrinkRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
