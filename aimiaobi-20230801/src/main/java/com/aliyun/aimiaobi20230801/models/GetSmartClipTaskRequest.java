// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class GetSmartClipTaskRequest extends TeaModel {
    /**
     * <p>Unique identifier of the task.</p>
     * <blockquote>
     * <p>You do not need to specify TaskId. The system generates it automatically. If you use the same TaskId for multiple tasks, those tasks belong to the same conversation group.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>task-03d46184ee7d8749</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    /**
     * <p>Unique identifier of your Alibaba Cloud Model Studio workspace. To get the workspace ID, see <a href="https://help.aliyun.com/document_detail/2782167.html">Get the workspace ID</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>xxxx</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static GetSmartClipTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSmartClipTaskRequest self = new GetSmartClipTaskRequest();
        return TeaModel.build(map, self);
    }

    public GetSmartClipTaskRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public GetSmartClipTaskRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
