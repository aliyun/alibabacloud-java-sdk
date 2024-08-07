// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class CancelInstancePublishTaskRequest extends TeaModel {
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

    public static CancelInstancePublishTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CancelInstancePublishTaskRequest self = new CancelInstancePublishTaskRequest();
        return TeaModel.build(map, self);
    }

    public CancelInstancePublishTaskRequest setAgentKey(String agentKey) {
        this.agentKey = agentKey;
        return this;
    }
    public String getAgentKey() {
        return this.agentKey;
    }

    public CancelInstancePublishTaskRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public CancelInstancePublishTaskRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
