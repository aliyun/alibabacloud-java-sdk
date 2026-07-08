// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class GetCategoriesByTaskIdRequest extends TeaModel {
    /**
     * <p>The unique ID of the task.</p>
     * <blockquote>
     * <p>You do not need to specify this parameter. The system automatically generates a task ID. If you specify the same task ID for subsequent tasks, the tasks are considered part of the same conversation group.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    /**
     * <p>The unique ID of the Alibaba Cloud Model Studio workspace. For more information, see <a href="https://help.aliyun.com/document_detail/2782167.html">Get a Workspace ID</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>xxxx</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static GetCategoriesByTaskIdRequest build(java.util.Map<String, ?> map) throws Exception {
        GetCategoriesByTaskIdRequest self = new GetCategoriesByTaskIdRequest();
        return TeaModel.build(map, self);
    }

    public GetCategoriesByTaskIdRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public GetCategoriesByTaskIdRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
