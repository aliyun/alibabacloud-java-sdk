// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class RunWritingShrinkRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>3f7045e099474ba28ceca1b4eb6d6e21</p>
     */
    @NameInMap("OriginSessionId")
    public String originSessionId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>提示词</p>
     */
    @NameInMap("Prompt")
    public String prompt;

    @NameInMap("ReferenceData")
    public String referenceDataShrink;

    /**
     * <strong>example:</strong>
     * <p>3f7045e099474ba28ceca1b4eb6d6e21</p>
     */
    @NameInMap("SessionId")
    public String sessionId;

    /**
     * <strong>example:</strong>
     * <p>3f7045e099474ba28ceca1b4eb6d6e21</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>xxxx</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    @NameInMap("WritingConfig")
    public String writingConfigShrink;

    public static RunWritingShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        RunWritingShrinkRequest self = new RunWritingShrinkRequest();
        return TeaModel.build(map, self);
    }

    public RunWritingShrinkRequest setOriginSessionId(String originSessionId) {
        this.originSessionId = originSessionId;
        return this;
    }
    public String getOriginSessionId() {
        return this.originSessionId;
    }

    public RunWritingShrinkRequest setPrompt(String prompt) {
        this.prompt = prompt;
        return this;
    }
    public String getPrompt() {
        return this.prompt;
    }

    public RunWritingShrinkRequest setReferenceDataShrink(String referenceDataShrink) {
        this.referenceDataShrink = referenceDataShrink;
        return this;
    }
    public String getReferenceDataShrink() {
        return this.referenceDataShrink;
    }

    public RunWritingShrinkRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public RunWritingShrinkRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public RunWritingShrinkRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public RunWritingShrinkRequest setWritingConfigShrink(String writingConfigShrink) {
        this.writingConfigShrink = writingConfigShrink;
        return this;
    }
    public String getWritingConfigShrink() {
        return this.writingConfigShrink;
    }

}
