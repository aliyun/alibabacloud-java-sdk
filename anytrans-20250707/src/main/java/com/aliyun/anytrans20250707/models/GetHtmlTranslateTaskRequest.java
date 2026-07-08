// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.anytrans20250707.models;

import com.aliyun.tea.*;

public class GetHtmlTranslateTaskRequest extends TeaModel {
    /**
     * <p>The ID of the HTML translation task.</p>
     * 
     * <strong>example:</strong>
     * <p>868c2fdd-96c2-4546-96d2-a259b8f35252</p>
     */
    @NameInMap("taskId")
    public String taskId;

    /**
     * <p>The ID of the Model Studio workspace.</p>
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
