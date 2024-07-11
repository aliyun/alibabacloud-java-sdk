// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cgcs20211111.models;

import com.aliyun.tea.*;

public class ReleaseCapacityResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>46329898-489C-4E63-9BA1-C1DA5C5D0986</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>b354****</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static ReleaseCapacityResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ReleaseCapacityResponseBody self = new ReleaseCapacityResponseBody();
        return TeaModel.build(map, self);
    }

    public ReleaseCapacityResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ReleaseCapacityResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
