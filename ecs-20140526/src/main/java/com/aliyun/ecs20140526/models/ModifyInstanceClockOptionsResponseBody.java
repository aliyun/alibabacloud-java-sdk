// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyInstanceClockOptionsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>t-bp1hvgwromzv32iq****</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static ModifyInstanceClockOptionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstanceClockOptionsResponseBody self = new ModifyInstanceClockOptionsResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyInstanceClockOptionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyInstanceClockOptionsResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
