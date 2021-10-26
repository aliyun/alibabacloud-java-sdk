// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class InvokeShellCommandResponseBody extends TeaModel {
    @NameInMap("CommandId")
    public String commandId;

    @NameInMap("InstanceIds")
    public InvokeShellCommandResponseBodyInstanceIds instanceIds;

    @NameInMap("RequestId")
    public String requestId;

    public static InvokeShellCommandResponseBody build(java.util.Map<String, ?> map) throws Exception {
        InvokeShellCommandResponseBody self = new InvokeShellCommandResponseBody();
        return TeaModel.build(map, self);
    }

    public InvokeShellCommandResponseBody setCommandId(String commandId) {
        this.commandId = commandId;
        return this;
    }
    public String getCommandId() {
        return this.commandId;
    }

    public InvokeShellCommandResponseBody setInstanceIds(InvokeShellCommandResponseBodyInstanceIds instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public InvokeShellCommandResponseBodyInstanceIds getInstanceIds() {
        return this.instanceIds;
    }

    public InvokeShellCommandResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class InvokeShellCommandResponseBodyInstanceIds extends TeaModel {
        @NameInMap("InstanceId")
        public java.util.List<String> instanceId;

        public static InvokeShellCommandResponseBodyInstanceIds build(java.util.Map<String, ?> map) throws Exception {
            InvokeShellCommandResponseBodyInstanceIds self = new InvokeShellCommandResponseBodyInstanceIds();
            return TeaModel.build(map, self);
        }

        public InvokeShellCommandResponseBodyInstanceIds setInstanceId(java.util.List<String> instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public java.util.List<String> getInstanceId() {
            return this.instanceId;
        }

    }

}
