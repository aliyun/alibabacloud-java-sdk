// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class TaskStatus extends TeaModel {
    // message of the task
    @NameInMap("Message")
    public String message;

    // status of the task
    @NameInMap("Status")
    public String status;

    public static TaskStatus build(java.util.Map<String, ?> map) throws Exception {
        TaskStatus self = new TaskStatus();
        return TeaModel.build(map, self);
    }

    public TaskStatus setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public TaskStatus setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
