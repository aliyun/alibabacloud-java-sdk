// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ExportSnapshotResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The export task ID. Call the <code>DescribeTasks</code> operation to check the task status.</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static ExportSnapshotResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ExportSnapshotResponseBody self = new ExportSnapshotResponseBody();
        return TeaModel.build(map, self);
    }

    public ExportSnapshotResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ExportSnapshotResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
