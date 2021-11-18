// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class StartBack2BackCallRequest extends TeaModel {
    @NameInMap("CallCenterNumber")
    public String callCenterNumber;

    @NameInMap("Callee")
    public String callee;

    @NameInMap("Caller")
    public String caller;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("WorkflowId")
    public String workflowId;

    public static StartBack2BackCallRequest build(java.util.Map<String, ?> map) throws Exception {
        StartBack2BackCallRequest self = new StartBack2BackCallRequest();
        return TeaModel.build(map, self);
    }

    public StartBack2BackCallRequest setCallCenterNumber(String callCenterNumber) {
        this.callCenterNumber = callCenterNumber;
        return this;
    }
    public String getCallCenterNumber() {
        return this.callCenterNumber;
    }

    public StartBack2BackCallRequest setCallee(String callee) {
        this.callee = callee;
        return this;
    }
    public String getCallee() {
        return this.callee;
    }

    public StartBack2BackCallRequest setCaller(String caller) {
        this.caller = caller;
        return this;
    }
    public String getCaller() {
        return this.caller;
    }

    public StartBack2BackCallRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public StartBack2BackCallRequest setWorkflowId(String workflowId) {
        this.workflowId = workflowId;
        return this;
    }
    public String getWorkflowId() {
        return this.workflowId;
    }

}
