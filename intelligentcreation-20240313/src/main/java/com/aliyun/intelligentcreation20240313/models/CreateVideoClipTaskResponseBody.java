// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240313.models;

import com.aliyun.tea.*;

public class CreateVideoClipTaskResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>86A90C40-D1AB-50DA-A4B1-0D545F80F2FE</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>837091359375048704</p>
     */
    @NameInMap("taskId")
    public String taskId;

    public static CreateVideoClipTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateVideoClipTaskResponseBody self = new CreateVideoClipTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateVideoClipTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateVideoClipTaskResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
