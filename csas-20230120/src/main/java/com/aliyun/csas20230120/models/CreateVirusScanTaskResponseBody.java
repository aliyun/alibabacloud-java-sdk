// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class CreateVirusScanTaskResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>3D7EC0AF-DB2A-5D9C-90EC-F090A6BAAEA7</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the created virus scan task.</p>
     * 
     * <strong>example:</strong>
     * <p>v1:1024772</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static CreateVirusScanTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateVirusScanTaskResponseBody self = new CreateVirusScanTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateVirusScanTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateVirusScanTaskResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
