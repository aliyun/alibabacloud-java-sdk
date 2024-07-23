// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyInvocationAttributeResponseBody extends TeaModel {
    /**
     * <p>The command ID.</p>
     * <ul>
     * <li>A new command is added and the <code>CommandId</code> value of the new command is returned only when <code>CommandContent</code> is changed.</li>
     * <li>No new command is added and the <code>CommandId</code> value of the command that is running is returned if <code>CommandContent</code> is not changed.</li>
     * <li>If you set <code>KeepCommand</code> to <code>true</code> when you called the <a href="https://help.aliyun.com/document_detail/64841.html">InvokeCommand</a> or <a href="https://help.aliyun.com/document_detail/141751.html">RunCommand</a> operation, a new command is added and retained. Otherwise, commands related to the task are deleted after all executions of the task are complete or the task is manually stopped.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>c-hz01272yr52****</p>
     */
    @NameInMap("CommandId")
    public String commandId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3****</p>
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
