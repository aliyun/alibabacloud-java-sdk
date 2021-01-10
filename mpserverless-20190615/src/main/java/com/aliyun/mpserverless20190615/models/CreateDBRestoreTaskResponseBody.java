// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class CreateDBRestoreTaskResponseBody extends TeaModel {
    @NameInMap("TaskId")
    public String taskId;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateDBRestoreTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDBRestoreTaskResponseBody self = new CreateDBRestoreTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDBRestoreTaskResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public CreateDBRestoreTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
