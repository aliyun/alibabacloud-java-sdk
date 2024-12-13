// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class TakeoverAIAgentCallRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>uid2</p>
     */
    @NameInMap("HumanAgentUserId")
    public String humanAgentUserId;

    /**
     * <strong>example:</strong>
     * <p>39f8e0bc005e4f309379701645f4****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("RequireToken")
    public Boolean requireToken;

    public static TakeoverAIAgentCallRequest build(java.util.Map<String, ?> map) throws Exception {
        TakeoverAIAgentCallRequest self = new TakeoverAIAgentCallRequest();
        return TeaModel.build(map, self);
    }

    public TakeoverAIAgentCallRequest setHumanAgentUserId(String humanAgentUserId) {
        this.humanAgentUserId = humanAgentUserId;
        return this;
    }
    public String getHumanAgentUserId() {
        return this.humanAgentUserId;
    }

    public TakeoverAIAgentCallRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public TakeoverAIAgentCallRequest setRequireToken(Boolean requireToken) {
        this.requireToken = requireToken;
        return this;
    }
    public Boolean getRequireToken() {
        return this.requireToken;
    }

}
