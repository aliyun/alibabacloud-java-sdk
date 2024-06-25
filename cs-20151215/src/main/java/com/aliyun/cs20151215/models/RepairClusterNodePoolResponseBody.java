// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class RepairClusterNodePoolResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>db82195b-75a8-40e5-9be4-16f1829dc624</p>
     */
    @NameInMap("request_id")
    public String requestId;

    /**
     * <p>The ID of the task.</p>
     * 
     * <strong>example:</strong>
     * <p>T-613b19bbd160ad4928000001</p>
     */
    @NameInMap("task_id")
    public String taskId;

    public static RepairClusterNodePoolResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RepairClusterNodePoolResponseBody self = new RepairClusterNodePoolResponseBody();
        return TeaModel.build(map, self);
    }

    public RepairClusterNodePoolResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RepairClusterNodePoolResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
