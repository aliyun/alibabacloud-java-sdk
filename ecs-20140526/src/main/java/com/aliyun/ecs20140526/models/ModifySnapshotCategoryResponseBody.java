// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifySnapshotCategoryResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>B48A12CD-1295-4A38-A8F0-0E92C937****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the archive task. You can call the DescribeTasks operation to query the status and progress of the archive task.</p>
     * 
     * <strong>example:</strong>
     * <p>t-dxh34xds**d</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static ModifySnapshotCategoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifySnapshotCategoryResponseBody self = new ModifySnapshotCategoryResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifySnapshotCategoryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifySnapshotCategoryResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
