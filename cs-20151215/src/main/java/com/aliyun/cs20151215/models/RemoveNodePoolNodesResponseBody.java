// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class RemoveNodePoolNodesResponseBody extends TeaModel {
    @NameInMap("request_id")
    public String requestId;

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
