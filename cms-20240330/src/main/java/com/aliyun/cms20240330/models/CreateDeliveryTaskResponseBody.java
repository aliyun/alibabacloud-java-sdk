// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class CreateDeliveryTaskResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>4CB23A2E-B426-5D4B-9AA2-6C7A508D954B</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>98e367d8fb8cc83b</p>
     */
    @NameInMap("taskId")
    public String taskId;

    public static CreateDeliveryTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDeliveryTaskResponseBody self = new CreateDeliveryTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDeliveryTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateDeliveryTaskResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
