// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class UpdateInstanceImageResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1A923337-44D9-5CAD-9A53-95084BD4****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>t-1ljew7on6ay0j****</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static UpdateInstanceImageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateInstanceImageResponseBody self = new UpdateInstanceImageResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateInstanceImageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateInstanceImageResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
