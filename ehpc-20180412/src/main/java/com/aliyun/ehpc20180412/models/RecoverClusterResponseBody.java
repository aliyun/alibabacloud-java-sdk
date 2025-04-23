// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class RecoverClusterResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>18FB21E3-F423-4B84-BB63-D8887A29****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The task ID.</p>
     * 
     * <strong>example:</strong>
     * <p>18FB21E3-F423-4B84-BB63-D8887A29****</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static RecoverClusterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RecoverClusterResponseBody self = new RecoverClusterResponseBody();
        return TeaModel.build(map, self);
    }

    public RecoverClusterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RecoverClusterResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
