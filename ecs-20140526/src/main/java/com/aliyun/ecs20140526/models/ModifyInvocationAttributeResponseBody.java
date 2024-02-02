// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyInvocationAttributeResponseBody extends TeaModel {
    @NameInMap("CommandId")
    public String commandId;

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
