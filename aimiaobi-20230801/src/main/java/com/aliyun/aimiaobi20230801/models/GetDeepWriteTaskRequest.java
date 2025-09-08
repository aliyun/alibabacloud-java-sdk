// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class GetDeepWriteTaskRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>6d3c0bc9-7561-41a4-be4c-d906abdb40a9</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    /**
     * <strong>example:</strong>
     * <p>llm-odl2p61i4vfbph4g</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static GetDeepWriteTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDeepWriteTaskRequest self = new GetDeepWriteTaskRequest();
        return TeaModel.build(map, self);
    }

    public GetDeepWriteTaskRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public GetDeepWriteTaskRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
