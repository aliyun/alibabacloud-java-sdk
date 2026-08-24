// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class UpdateVirusFileStatusResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>3D7EC0AF-DB2A-5D9C-90EC-F090A6BAAEA7</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The disposal task ID. This parameter is returned when Operation is set to AdminQuarantine. An empty string is returned when Operation is set to AdminTrust. You can check the execution result on the user terminal device by using the TaskExecutionInfo field of ListVirusFileStatuses.</p>
     * 
     * <strong>example:</strong>
     * <p>v1:1024773</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static UpdateVirusFileStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateVirusFileStatusResponseBody self = new UpdateVirusFileStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateVirusFileStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateVirusFileStatusResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
