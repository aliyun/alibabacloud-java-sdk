// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyInvocationAttributeResponseBody extends TeaModel {
    /**
     * <p>The command ID.</p>
     * <ul>
     * <li>A new command is created and the new <code>CommandId</code> is returned only when <code>CommandContent</code> is changed.</li>
     * <li>When <code>CommandContent</code> is not changed, no new command is created, and the <code>CommandId</code> of the currently executing command is returned.</li>
     * <li>If <a href="https://help.aliyun.com/document_detail/64841.html">InvokeCommand</a> was called, or <a href="https://help.aliyun.com/document_detail/141751.html">RunCommand</a> was called with <code>KeepCommand</code> set to <code>true</code>, the new command is retained. Otherwise, when the execution completes or the task is manually stopped, all commands associated with the task are deleted.</li>
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
