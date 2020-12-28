// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class InvokeShellCommandResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("CommandId")
    public String commandId;

    @NameInMap("InstanceIds")
    public java.util.List<String> instanceIds;

    public static InvokeShellCommandResponseBody build(java.util.Map<String, ?> map) throws Exception {
        InvokeShellCommandResponseBody self = new InvokeShellCommandResponseBody();
        return TeaModel.build(map, self);
    }

    public InvokeShellCommandResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public InvokeShellCommandResponseBody setCommandId(String commandId) {
        this.commandId = commandId;
        return this;
    }
    public String getCommandId() {
        return this.commandId;
    }

    public InvokeShellCommandResponseBody setInstanceIds(java.util.List<String> instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public java.util.List<String> getInstanceIds() {
        return this.instanceIds;
    }

}
