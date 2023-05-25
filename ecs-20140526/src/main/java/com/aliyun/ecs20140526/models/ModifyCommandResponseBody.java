// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyCommandResponseBody extends TeaModel {
    /**
     * <p>The maximum timeout period for the command to be run on the instance. Unit: seconds. When a command cannot run within the specified time range, the command times out. Then, the command process is forcibly terminated by canceling the process ID (PID) of the command.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyCommandResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyCommandResponseBody self = new ModifyCommandResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyCommandResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
