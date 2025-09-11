// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.anytrans20250707.models;

import com.aliyun.tea.*;

public class GetHtmlTranslateTaskRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>2746f4be-cff2-465e-a2c6-12bff30ce0f9</p>
     */
    @NameInMap("taskId")
    public String taskId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>llm-kqtrcpdee4xm29xx</p>
     */
    @NameInMap("workspaceId")
    public String workspaceId;

    public static GetHtmlTranslateTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        GetHtmlTranslateTaskRequest self = new GetHtmlTranslateTaskRequest();
        return TeaModel.build(map, self);
    }

    public GetHtmlTranslateTaskRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public GetHtmlTranslateTaskRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
