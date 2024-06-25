// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class RemoveNodePoolNodesResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>A9891419-D125-4D89-AFCA-68846675E2F7</p>
     */
    @NameInMap("request_id")
    public String requestId;

    /**
     * <p>The task ID.</p>
     * 
     * <strong>example:</strong>
     * <p>T-62a944794ee141074400****</p>
     */
    @NameInMap("task_id")
    public String taskId;

    public static RemoveNodePoolNodesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RemoveNodePoolNodesResponseBody self = new RemoveNodePoolNodesResponseBody();
        return TeaModel.build(map, self);
    }

    public RemoveNodePoolNodesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RemoveNodePoolNodesResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
