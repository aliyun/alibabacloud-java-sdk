// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class CreateTokenRequest extends TeaModel {
    @NameInMap("AgentKey")
    public String agentKey;

    public static CreateTokenRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateTokenRequest self = new CreateTokenRequest();
        return TeaModel.build(map, self);
    }

    public CreateTokenRequest setAgentKey(String agentKey) {
        this.agentKey = agentKey;
        return this;
    }
    public String getAgentKey() {
        return this.agentKey;
    }

}
