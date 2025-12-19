// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class InitiatePptCreationRequest extends TeaModel {
    @NameInMap("Outline")
    public String outline;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>95c2fbe6-5a20-4fc2-8a93-376ed05fbe13</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    /**
     * <strong>example:</strong>
     * <p>llm-3fy94b2rtadt01qa</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static InitiatePptCreationRequest build(java.util.Map<String, ?> map) throws Exception {
        InitiatePptCreationRequest self = new InitiatePptCreationRequest();
        return TeaModel.build(map, self);
    }

    public InitiatePptCreationRequest setOutline(String outline) {
        this.outline = outline;
        return this;
    }
    public String getOutline() {
        return this.outline;
    }

    public InitiatePptCreationRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public InitiatePptCreationRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
