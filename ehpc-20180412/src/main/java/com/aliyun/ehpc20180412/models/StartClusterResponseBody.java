// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class StartClusterResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>76E1ADE7-D15A-457F-AAFD-06C5A5F052D0</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the task.</p>
     * 
     * <strong>example:</strong>
     * <p>76E1ADE7-D15A-457F-AAFD-06C5A5F052D0</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static StartClusterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StartClusterResponseBody self = new StartClusterResponseBody();
        return TeaModel.build(map, self);
    }

    public StartClusterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public StartClusterResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
