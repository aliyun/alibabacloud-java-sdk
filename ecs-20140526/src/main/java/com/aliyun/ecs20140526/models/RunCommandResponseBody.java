// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class RunCommandResponseBody extends TeaModel {
    /**
     * <p>The command ID.</p>
     */
    @NameInMap("CommandId")
    public String commandId;

    /**
     * <p>The command task ID.</p>
     */
    @NameInMap("InvokeId")
    public String invokeId;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static RunCommandResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RunCommandResponseBody self = new RunCommandResponseBody();
        return TeaModel.build(map, self);
    }

    public RunCommandResponseBody setCommandId(String commandId) {
        this.commandId = commandId;
        return this;
    }
    public String getCommandId() {
        return this.commandId;
    }

    public RunCommandResponseBody setInvokeId(String invokeId) {
        this.invokeId = invokeId;
        return this;
    }
    public String getInvokeId() {
        return this.invokeId;
    }

    public RunCommandResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
