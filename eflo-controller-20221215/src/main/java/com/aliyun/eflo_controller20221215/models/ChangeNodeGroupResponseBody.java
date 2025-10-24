// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_controller20221215.models;

import com.aliyun.tea.*;

public class ChangeNodeGroupResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>887FA855-89F4-5DB3-B305-C5879EC480E6</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>i159136551662516768776</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static ChangeNodeGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ChangeNodeGroupResponseBody self = new ChangeNodeGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public ChangeNodeGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ChangeNodeGroupResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
