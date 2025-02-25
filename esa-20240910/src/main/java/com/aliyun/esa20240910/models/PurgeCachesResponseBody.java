// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class PurgeCachesResponseBody extends TeaModel {
    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>ET5BF670-09D5-4D0B-BEBY-D96A2A528000</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Task ID, which is returned when you create a refresh or preheat task.</p>
     * 
     * <strong>example:</strong>
     * <p>15940956620</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static PurgeCachesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PurgeCachesResponseBody self = new PurgeCachesResponseBody();
        return TeaModel.build(map, self);
    }

    public PurgeCachesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PurgeCachesResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
