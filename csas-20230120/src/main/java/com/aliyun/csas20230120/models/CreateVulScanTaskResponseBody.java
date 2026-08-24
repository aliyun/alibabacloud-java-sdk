// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class CreateVulScanTaskResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>3D7EC0AF-DB2A-5D9C-90EC-F090A6BAAEA7</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the created vulnerability scanning task.</p>
     * 
     * <strong>example:</strong>
     * <p>vul-scan-task-4d7b1e9a6c38****</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static CreateVulScanTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateVulScanTaskResponseBody self = new CreateVulScanTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateVulScanTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateVulScanTaskResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
