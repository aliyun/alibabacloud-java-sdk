// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyInvocationAttributeResponseBody extends TeaModel {
    /**
     * <p>The command ID.</p>
     * <br>
     * <p>*   A new command is added and the `CommandId` value of the new command is returned only when `CommandContent` is changed.</p>
     * <p>*   No new command is added and the `CommandId` value of the command that is running is returned if `CommandContent` is not changed.</p>
     * <p>*   If you set `KeepCommand` to `true` when you called the [InvokeCommand](https://help.aliyun.com/document_detail/64841.html) or [RunCommand](https://help.aliyun.com/document_detail/141751.html) operation, a new command is added and retained. Otherwise, commands related to the task are deleted after all executions of the task are complete or the task is manually stopped.</p>
     */
    @NameInMap("CommandId")
    public String commandId;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyInvocationAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyInvocationAttributeResponseBody self = new ModifyInvocationAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyInvocationAttributeResponseBody setCommandId(String commandId) {
        this.commandId = commandId;
        return this;
    }
    public String getCommandId() {
        return this.commandId;
    }

    public ModifyInvocationAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
