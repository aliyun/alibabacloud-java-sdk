// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class QueryVideoAuditResultRequest extends TeaModel {
    /**
     * <p>Task ID</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    /**
     * <p>Workspace ID</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>llm-xxxxx</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static QueryVideoAuditResultRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryVideoAuditResultRequest self = new QueryVideoAuditResultRequest();
        return TeaModel.build(map, self);
    }

    public QueryVideoAuditResultRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public QueryVideoAuditResultRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
