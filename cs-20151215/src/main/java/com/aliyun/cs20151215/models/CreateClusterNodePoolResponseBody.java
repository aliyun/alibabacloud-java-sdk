// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class CreateClusterNodePoolResponseBody extends TeaModel {
    /**
     * <p>The node pool ID.</p>
     */
    @NameInMap("nodepool_id")
    public String nodepoolId;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("request_id")
    public String requestId;

    /**
     * <p>The ID of the task.</p>
     */
    @NameInMap("task_id")
    public String taskId;

    public static CreateClusterNodePoolResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateClusterNodePoolResponseBody self = new CreateClusterNodePoolResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateClusterNodePoolResponseBody setNodepoolId(String nodepoolId) {
        this.nodepoolId = nodepoolId;
        return this;
    }
    public String getNodepoolId() {
        return this.nodepoolId;
    }

    public CreateClusterNodePoolResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateClusterNodePoolResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
