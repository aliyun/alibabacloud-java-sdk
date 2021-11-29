// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class CreateIllegalUrlExportTaskResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TaskId")
    public String taskId;

    public static CreateIllegalUrlExportTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateIllegalUrlExportTaskResponseBody self = new CreateIllegalUrlExportTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateIllegalUrlExportTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateIllegalUrlExportTaskResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
