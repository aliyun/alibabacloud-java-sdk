// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class ModifyClusterNodePoolResponseBody extends TeaModel {
    /**
     * <p>The node pool ID.</p>
     * 
     * <strong>example:</strong>
     * <p>np737c3ac1ac684703b9e10673aa2c****</p>
     */
    @NameInMap("nodepool_id")
    public String nodepoolId;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>687C5BAA-D103-4993-884B-C35E4314****</p>
     */
    @NameInMap("request_id")
    public String requestId;

    /**
     * <p>The task ID.</p>
     * 
     * <strong>example:</strong>
     * <p>T-5fd211e924e1d00787000293</p>
     */
    @NameInMap("task_id")
    public String taskId;

    public static ModifyClusterNodePoolResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyClusterNodePoolResponseBody self = new ModifyClusterNodePoolResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyClusterNodePoolResponseBody setNodepoolId(String nodepoolId) {
        this.nodepoolId = nodepoolId;
        return this;
    }
    public String getNodepoolId() {
        return this.nodepoolId;
    }

    public ModifyClusterNodePoolResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyClusterNodePoolResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
