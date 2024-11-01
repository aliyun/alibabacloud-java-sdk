// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class GetCustomHotTopicBroadcastJobRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2e27abb32cb64f80a0c6e829b6c87a09</p>
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

    public static GetCustomHotTopicBroadcastJobRequest build(java.util.Map<String, ?> map) throws Exception {
        GetCustomHotTopicBroadcastJobRequest self = new GetCustomHotTopicBroadcastJobRequest();
        return TeaModel.build(map, self);
    }

    public GetCustomHotTopicBroadcastJobRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public GetCustomHotTopicBroadcastJobRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
