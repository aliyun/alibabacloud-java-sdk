// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmpinc20210113.models;

import com.aliyun.tea.*;

public class CreateOXSDeliveryTaskResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TaskId")
    public Long taskId;

    public static CreateOXSDeliveryTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateOXSDeliveryTaskResponseBody self = new CreateOXSDeliveryTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateOXSDeliveryTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateOXSDeliveryTaskResponseBody setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }
    public Long getTaskId() {
        return this.taskId;
    }

}
