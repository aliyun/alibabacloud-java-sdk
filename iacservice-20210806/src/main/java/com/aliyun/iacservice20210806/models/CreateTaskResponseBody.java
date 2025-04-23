// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class CreateTaskResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>CD478792-6952-5A1C-9F57-78932BF0FAC6</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>task-433aead756057fffeaba4828f5195</p>
     */
    @NameInMap("taskId")
    public String taskId;

    public static CreateTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateTaskResponseBody self = new CreateTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateTaskResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
