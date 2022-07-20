// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cgcs20211111.models;

import com.aliyun.tea.*;

public class CancelReserveTaskRequest extends TeaModel {
    // 客户端幂等性 token
    @NameInMap("ClientToken")
    public String clientToken;

    // 创建容量预定任务时返回的 taskId
    @NameInMap("TaskId")
    public String taskId;

    public static CancelReserveTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CancelReserveTaskRequest self = new CancelReserveTaskRequest();
        return TeaModel.build(map, self);
    }

    public CancelReserveTaskRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CancelReserveTaskRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
