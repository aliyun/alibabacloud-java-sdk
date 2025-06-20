// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_controller20221215.models;

import com.aliyun.tea.*;

public class UpdateNodeGroupResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>8F065DDD-6996-5973-9691-9EC57BD0072E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The task ID.</p>
     * 
     * <strong>example:</strong>
     * <p>i15374011238111706</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static UpdateNodeGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateNodeGroupResponseBody self = new UpdateNodeGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateNodeGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateNodeGroupResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
