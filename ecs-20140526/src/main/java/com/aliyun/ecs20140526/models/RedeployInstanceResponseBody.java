// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class RedeployInstanceResponseBody extends TeaModel {
    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    // The ID of the redeployment task.
    // 
    // You can call the [DescribeTasks](~~25622~~) operation to query the migration result.
    @NameInMap("TaskId")
    public String taskId;

    public static RedeployInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RedeployInstanceResponseBody self = new RedeployInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public RedeployInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RedeployInstanceResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
