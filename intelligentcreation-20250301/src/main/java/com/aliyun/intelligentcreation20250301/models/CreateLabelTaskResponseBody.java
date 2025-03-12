// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20250301.models;

import com.aliyun.tea.*;

public class CreateLabelTaskResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>ABCDEFGH-1234-5678-90AB-123456789ABC</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>03s1Xmp791KUMYuZVEb</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static CreateLabelTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateLabelTaskResponseBody self = new CreateLabelTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateLabelTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateLabelTaskResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
