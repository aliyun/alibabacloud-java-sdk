// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_controller20221215.models;

import com.aliyun.tea.*;

public class RebootNodesResponseBody extends TeaModel {
    /**
     * <p>Request ID</p>
     * 
     * <strong>example:</strong>
     * <p>4FD06DF0-9167-5C6F-A145-F30CA4A15D54</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Task Id</p>
     * 
     * <strong>example:</strong>
     * <p>i158475611663639202234</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static RebootNodesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RebootNodesResponseBody self = new RebootNodesResponseBody();
        return TeaModel.build(map, self);
    }

    public RebootNodesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RebootNodesResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
