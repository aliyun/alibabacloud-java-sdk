// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class RetryChangeOrderTaskRequest extends TeaModel {
    /**
     * <p>The retry status.</p>
     */
    @NameInMap("RetryStatus")
    public Boolean retryStatus;

    /**
     * <p>The ID of the process.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
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
