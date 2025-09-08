// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class RunDeepWritingRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("Cursor")
    public Integer cursor;

    /**
     * <strong>example:</strong>
     * <p>95c2fbe6-5a20-4fc2-8a93-376ed05fbe13</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>llm-ir8zkqry2fncaxwq</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static RunDeepWritingRequest build(java.util.Map<String, ?> map) throws Exception {
        RunDeepWritingRequest self = new RunDeepWritingRequest();
        return TeaModel.build(map, self);
    }

    public RunDeepWritingRequest setCursor(Integer cursor) {
        this.cursor = cursor;
        return this;
    }
    public Integer getCursor() {
        return this.cursor;
    }

    public RunDeepWritingRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public RunDeepWritingRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
