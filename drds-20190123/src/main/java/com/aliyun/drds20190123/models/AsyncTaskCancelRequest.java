// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class AsyncTaskCancelRequest extends TeaModel {
    @NameInMap("DrdsInstanceId")
    @Validation(required = true)
    public String drdsInstanceId;

    @NameInMap("TaskId")
    @Validation(required = true)
    public Long taskId;

    public static AsyncTaskCancelRequest build(java.util.Map<String, ?> map) throws Exception {
        AsyncTaskCancelRequest self = new AsyncTaskCancelRequest();
        return TeaModel.build(map, self);
    }

    public AsyncTaskCancelRequest setDrdsInstanceId(String drdsInstanceId) {
        this.drdsInstanceId = drdsInstanceId;
        return this;
    }
    public String getDrdsInstanceId() {
        return this.drdsInstanceId;
    }

    public AsyncTaskCancelRequest setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }
    public Long getTaskId() {
        return this.taskId;
    }

}
