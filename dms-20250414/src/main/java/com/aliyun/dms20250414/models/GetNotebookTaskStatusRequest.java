// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class GetNotebookTaskStatusRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>8141456676986429894916354</p>
     */
    @NameInMap("SessionId")
    public String sessionId;

    /**
     * <strong>example:</strong>
     * <p>c2b4cb5a-7420-49a8-aa7c-528becd6e1bf</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    /**
     * <strong>example:</strong>
     * <p>8630242382****</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static GetNotebookTaskStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        GetNotebookTaskStatusRequest self = new GetNotebookTaskStatusRequest();
        return TeaModel.build(map, self);
    }

    public GetNotebookTaskStatusRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public GetNotebookTaskStatusRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public GetNotebookTaskStatusRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
