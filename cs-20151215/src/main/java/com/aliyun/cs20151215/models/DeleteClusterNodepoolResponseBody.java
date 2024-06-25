// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DeleteClusterNodepoolResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>7263C978-3DBD-4E06-B319-793B38A2F388</p>
     */
    @NameInMap("request_id")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>T-655ace947e0e6603af000004</p>
     */
    @NameInMap("task_id")
    public String taskId;

    public static DeleteClusterNodepoolResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteClusterNodepoolResponseBody self = new DeleteClusterNodepoolResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteClusterNodepoolResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteClusterNodepoolResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
