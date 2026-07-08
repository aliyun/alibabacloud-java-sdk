// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class FetchExportTermsTaskRequest extends TeaModel {
    /**
     * <p>The task ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>3f7045e099474ba28ceca1b4eb6d6e21</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    /**
     * <p>The unique identifier of your Alibaba Cloud Model Studio workspace. To get your <a href="https://help.aliyun.com/document_detail/2782167.html">Workspace ID</a>, see the referenced document.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>llm-xx</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static FetchExportTermsTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        FetchExportTermsTaskRequest self = new FetchExportTermsTaskRequest();
        return TeaModel.build(map, self);
    }

    public FetchExportTermsTaskRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public FetchExportTermsTaskRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
