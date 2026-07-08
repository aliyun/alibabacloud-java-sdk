// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class RunStepByStepWritingShrinkRequest extends TeaModel {
    /**
     * <p>The ID of the original conversation when regenerating content.</p>
     * 
     * <strong>example:</strong>
     * <p>3f7045e099474ba28ceca1b4eb6d6e21</p>
     */
    @NameInMap("OriginSessionId")
    public String originSessionId;

    /**
     * <p>The prompt.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>提示词</p>
     */
    @NameInMap("Prompt")
    public String prompt;

    /**
     * <p>The reference article data for writing.</p>
     */
    @NameInMap("ReferenceData")
    public String referenceDataShrink;

    /**
     * <p>The ID of a single-turn conversation.</p>
     * 
     * <strong>example:</strong>
     * <p>3f7045e099474ba28ceca1b4eb6d6e21</p>
     */
    @NameInMap("SessionId")
    public String sessionId;

    /**
     * <p>The task ID. You can reuse the same task ID for a multi-turn conversation.</p>
     * <blockquote>
     * <p>By default, you do not need to specify this parameter. The system automatically generates a task ID. If you specify the same TaskId for subsequent tasks, the tasks are considered part of the same conversation group.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>3f7045e099474ba28ceca1b4eb6d6e21</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    /**
     * <p>The unique ID of the Alibaba Cloud Model Studio workspace. For more information, see <a href="https://help.aliyun.com/document_detail/2782167.html">Obtain a Workspace ID</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>xxxx</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    /**
     * <p>The writing configuration.</p>
     */
    @NameInMap("WritingConfig")
    public String writingConfigShrink;

    public static RunStepByStepWritingShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        RunStepByStepWritingShrinkRequest self = new RunStepByStepWritingShrinkRequest();
        return TeaModel.build(map, self);
    }

    public RunStepByStepWritingShrinkRequest setOriginSessionId(String originSessionId) {
        this.originSessionId = originSessionId;
        return this;
    }
    public String getOriginSessionId() {
        return this.originSessionId;
    }

    public RunStepByStepWritingShrinkRequest setPrompt(String prompt) {
        this.prompt = prompt;
        return this;
    }
    public String getPrompt() {
        return this.prompt;
    }

    public RunStepByStepWritingShrinkRequest setReferenceDataShrink(String referenceDataShrink) {
        this.referenceDataShrink = referenceDataShrink;
        return this;
    }
    public String getReferenceDataShrink() {
        return this.referenceDataShrink;
    }

    public RunStepByStepWritingShrinkRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public RunStepByStepWritingShrinkRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public RunStepByStepWritingShrinkRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public RunStepByStepWritingShrinkRequest setWritingConfigShrink(String writingConfigShrink) {
        this.writingConfigShrink = writingConfigShrink;
        return this;
    }
    public String getWritingConfigShrink() {
        return this.writingConfigShrink;
    }

}
