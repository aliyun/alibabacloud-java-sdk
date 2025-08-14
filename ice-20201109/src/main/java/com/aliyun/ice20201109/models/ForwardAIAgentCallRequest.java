// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ForwardAIAgentCallRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>13**********</p>
     */
    @NameInMap("CalledNumber")
    public String calledNumber;

    /**
     * <strong>example:</strong>
     * <p>call_instance_202******</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static ForwardAIAgentCallRequest build(java.util.Map<String, ?> map) throws Exception {
        ForwardAIAgentCallRequest self = new ForwardAIAgentCallRequest();
        return TeaModel.build(map, self);
    }

    public ForwardAIAgentCallRequest setCalledNumber(String calledNumber) {
        this.calledNumber = calledNumber;
        return this;
    }
    public String getCalledNumber() {
        return this.calledNumber;
    }

    public ForwardAIAgentCallRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
