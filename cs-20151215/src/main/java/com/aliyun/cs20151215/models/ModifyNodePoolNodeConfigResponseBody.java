// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class ModifyNodePoolNodeConfigResponseBody extends TeaModel {
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
     * <p>The task ID.</p>
     */
    @NameInMap("task_id")
    public String taskId;

    public static ModifyNodePoolNodeConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyNodePoolNodeConfigResponseBody self = new ModifyNodePoolNodeConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyNodePoolNodeConfigResponseBody setNodepoolId(String nodepoolId) {
        this.nodepoolId = nodepoolId;
        return this;
    }
    public String getNodepoolId() {
        return this.nodepoolId;
    }

    public ModifyNodePoolNodeConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyNodePoolNodeConfigResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
