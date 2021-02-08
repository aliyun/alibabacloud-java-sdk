// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class RunCommandResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("CommandId")
    @Validation(required = true)
    public String commandId;

    @NameInMap("InvokeId")
    @Validation(required = true)
    public String invokeId;

    public static RunCommandResponse build(java.util.Map<String, ?> map) throws Exception {
        RunCommandResponse self = new RunCommandResponse();
        return TeaModel.build(map, self);
    }

    public RunCommandResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RunCommandResponse setCommandId(String commandId) {
        this.commandId = commandId;
        return this;
    }
    public String getCommandId() {
        return this.commandId;
    }

    public RunCommandResponse setInvokeId(String invokeId) {
        this.invokeId = invokeId;
        return this;
    }
    public String getInvokeId() {
        return this.invokeId;
    }

}
