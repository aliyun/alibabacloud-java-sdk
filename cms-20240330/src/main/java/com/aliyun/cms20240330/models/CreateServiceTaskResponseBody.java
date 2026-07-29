// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class CreateServiceTaskResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>A1B2C3D4-E5F6-7890-ABCD-EF1234567890</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The ID of the created task. Use this ID for subsequent query or deletion operations.</p>
     * 
     * <strong>example:</strong>
     * <p>a1b2c3d4-e5f6-7890-abcd-ef1234567890</p>
     */
    @NameInMap("taskId")
    public String taskId;

    public static CreateServiceTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateServiceTaskResponseBody self = new CreateServiceTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateServiceTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateServiceTaskResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
