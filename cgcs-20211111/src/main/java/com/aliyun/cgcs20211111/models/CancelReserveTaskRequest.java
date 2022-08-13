// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cgcs20211111.models;

import com.aliyun.tea.*;

public class CancelReserveTaskRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

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
