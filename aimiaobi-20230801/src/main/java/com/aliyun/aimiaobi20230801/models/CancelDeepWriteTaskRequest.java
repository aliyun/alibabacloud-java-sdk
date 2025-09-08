// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class CancelDeepWriteTaskRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>xbabac91-fdad-44d6-95ce-******</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    /**
     * <strong>example:</strong>
     * <p>llm-xxxxx</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static CancelDeepWriteTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CancelDeepWriteTaskRequest self = new CancelDeepWriteTaskRequest();
        return TeaModel.build(map, self);
    }

    public CancelDeepWriteTaskRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public CancelDeepWriteTaskRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
