// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class CreateApplicationMonitorResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>04F0F334-1335-436C-A1D7-6C044FE73368</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the origin probing task.</p>
     * 
     * <strong>example:</strong>
     * <p>sm-bp1fpdjfju9k8yr1y****</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static CreateApplicationMonitorResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateApplicationMonitorResponseBody self = new CreateApplicationMonitorResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateApplicationMonitorResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateApplicationMonitorResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
