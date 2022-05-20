// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class DeleteAutoScaleInstancePolicyRequest extends TeaModel {
    @NameInMap("ConsoleContext")
    public String consoleContext;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("PolicyUuid")
    public String policyUuid;

    public static DeleteAutoScaleInstancePolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAutoScaleInstancePolicyRequest self = new DeleteAutoScaleInstancePolicyRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAutoScaleInstancePolicyRequest setConsoleContext(String consoleContext) {
        this.consoleContext = consoleContext;
        return this;
    }
    public String getConsoleContext() {
        return this.consoleContext;
    }

    public DeleteAutoScaleInstancePolicyRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DeleteAutoScaleInstancePolicyRequest setPolicyUuid(String policyUuid) {
        this.policyUuid = policyUuid;
        return this;
    }
    public String getPolicyUuid() {
        return this.policyUuid;
    }

}
