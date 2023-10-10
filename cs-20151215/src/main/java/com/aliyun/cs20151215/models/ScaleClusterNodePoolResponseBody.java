// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class ScaleClusterNodePoolResponseBody extends TeaModel {
    /**
     * <p>The task ID.</p>
     */
    @NameInMap("task_id")
    public String taskId;

    public static ScaleClusterNodePoolResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ScaleClusterNodePoolResponseBody self = new ScaleClusterNodePoolResponseBody();
        return TeaModel.build(map, self);
    }

    public ScaleClusterNodePoolResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
