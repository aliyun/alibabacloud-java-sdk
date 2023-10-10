// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class ModifyClusterNodePoolResponseBody extends TeaModel {
    /**
     * <p>The node pool ID.</p>
     */
    @NameInMap("nodepool_id")
    public String nodepoolId;

    /**
     * <p>The task ID.</p>
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

    public ModifyClusterNodePoolResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
