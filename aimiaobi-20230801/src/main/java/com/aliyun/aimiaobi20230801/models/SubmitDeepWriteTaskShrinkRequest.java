// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class SubmitDeepWriteTaskShrinkRequest extends TeaModel {
    /**
     * <p>The agent orchestration options.</p>
     */
    @NameInMap("AgentOrchestration")
    public String agentOrchestrationShrink;

    /**
     * <p>A list of attachments.</p>
     */
    @NameInMap("Files")
    public String filesShrink;

    /**
     * <p>The user\&quot;s question.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>北京2025年新能源汽车发展趋势</p>
     * 
     * <strong>if can be null:</strong>
     * <p>false</p>
     */
    @NameInMap("Input")
    public String input;

    /**
     * <p>The instructions.</p>
     * 
     * <strong>example:</strong>
     * <p>请根据北京新能源汽车在汽车品牌、新车发布、能源等方面进行分析</p>
     */
    @NameInMap("Instructions")
    public String instructions;

    /**
     * <p><a href="https://help.aliyun.com/document_detail/2782167.html">The workspace ID.</a></p>
     * 
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
