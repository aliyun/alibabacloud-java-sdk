// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class FetchParseDocumentLayoutTaskRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>29ae0ba84c1c4cc694d0f4f1aead8005</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>llm-xxxx</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static FetchParseDocumentLayoutTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        FetchParseDocumentLayoutTaskRequest self = new FetchParseDocumentLayoutTaskRequest();
        return TeaModel.build(map, self);
    }

    public FetchParseDocumentLayoutTaskRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public FetchParseDocumentLayoutTaskRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
