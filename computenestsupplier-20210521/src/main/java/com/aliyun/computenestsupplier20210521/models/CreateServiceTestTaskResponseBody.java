// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenestsupplier20210521.models;

import com.aliyun.tea.*;

public class CreateServiceTestTaskResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>DF0F666F-FBBC-55C3-A368-C955DE7B4839</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The task ID.</p>
     * 
     * <strong>example:</strong>
     * <p>stt-568c2c5a687a409b977e</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static CreateServiceTestTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateServiceTestTaskResponseBody self = new CreateServiceTestTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateServiceTestTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateServiceTestTaskResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
