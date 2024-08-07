// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class CancelPublishTaskRequest extends TeaModel {
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

    public static CancelPublishTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CancelPublishTaskRequest self = new CancelPublishTaskRequest();
        return TeaModel.build(map, self);
    }

    public CancelPublishTaskRequest setAgentKey(String agentKey) {
        this.agentKey = agentKey;
        return this;
    }
    public String getAgentKey() {
        return this.agentKey;
    }

    public CancelPublishTaskRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

}
