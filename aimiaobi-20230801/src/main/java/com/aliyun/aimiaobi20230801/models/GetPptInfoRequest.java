// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class GetPptInfoRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1f178f22-ec52-467d-8489-eef4468x0240</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    /**
     * <strong>example:</strong>
     * <p>llm-2setzb9xb8mx6vss</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static GetPptInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        GetPptInfoRequest self = new GetPptInfoRequest();
        return TeaModel.build(map, self);
    }

    public GetPptInfoRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public GetPptInfoRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
