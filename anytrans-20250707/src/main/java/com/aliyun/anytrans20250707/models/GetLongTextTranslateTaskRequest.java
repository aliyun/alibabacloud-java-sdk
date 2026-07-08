// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.anytrans20250707.models;

import com.aliyun.tea.*;

public class GetLongTextTranslateTaskRequest extends TeaModel {
    /**
     * <p>The ID of the long-text translation task.</p>
     * 
     * <strong>example:</strong>
     * <p>a8f25f25-0b36-4349-857f-e19a43f69e51</p>
     */
    @NameInMap("taskId")
    public String taskId;

    /**
     * <p>The ID of the Model Studio workspace.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>llm-ep8ba0dr6seiddri</p>
     */
    @NameInMap("workspaceId")
    public String workspaceId;

    public static GetLongTextTranslateTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLongTextTranslateTaskRequest self = new GetLongTextTranslateTaskRequest();
        return TeaModel.build(map, self);
    }

    public GetLongTextTranslateTaskRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public GetLongTextTranslateTaskRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
