// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class UpgradeClusterNodepoolResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>2D69A58F-345C-4FDE-88E4-BF518944****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The task ID.</p>
     * 
     * <strong>example:</strong>
     * <p>T-5fd211e924e1d0078700xxxx</p>
     */
    @NameInMap("task_id")
    public String taskId;

    public static UpgradeClusterNodepoolResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpgradeClusterNodepoolResponseBody self = new UpgradeClusterNodepoolResponseBody();
        return TeaModel.build(map, self);
    }

    public UpgradeClusterNodepoolResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpgradeClusterNodepoolResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
