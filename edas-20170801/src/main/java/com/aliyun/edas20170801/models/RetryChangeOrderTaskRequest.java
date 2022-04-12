// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class RetryChangeOrderTaskRequest extends TeaModel {
    @NameInMap("RetryStatus")
    public Boolean retryStatus;

    @NameInMap("TaskId")
    public String taskId;

    public static RetryChangeOrderTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        RetryChangeOrderTaskRequest self = new RetryChangeOrderTaskRequest();
        return TeaModel.build(map, self);
    }

    public RetryChangeOrderTaskRequest setRetryStatus(Boolean retryStatus) {
        this.retryStatus = retryStatus;
        return this;
    }
    public Boolean getRetryStatus() {
        return this.retryStatus;
    }

    public RetryChangeOrderTaskRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
