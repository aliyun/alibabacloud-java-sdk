// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class GetInstancePublishTaskStateRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>ac627989eb4f8a98ed05fd098bbae5_p_beebot_public</p>
     */
    @NameInMap("AgentKey")
    public String agentKey;

    /**
     * <strong>example:</strong>
     * <p>8521</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <strong>example:</strong>
     * <p>chatbot-cn-mp90s2lrk00050</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static GetInstancePublishTaskStateRequest build(java.util.Map<String, ?> map) throws Exception {
        GetInstancePublishTaskStateRequest self = new GetInstancePublishTaskStateRequest();
        return TeaModel.build(map, self);
    }

    public GetInstancePublishTaskStateRequest setAgentKey(String agentKey) {
        this.agentKey = agentKey;
        return this;
    }
    public String getAgentKey() {
        return this.agentKey;
    }

    public GetInstancePublishTaskStateRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public GetInstancePublishTaskStateRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
