// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class GetInterveneGlobalReplyRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("AgentKey")
    public String agentKey;

    public static GetInterveneGlobalReplyRequest build(java.util.Map<String, ?> map) throws Exception {
        GetInterveneGlobalReplyRequest self = new GetInterveneGlobalReplyRequest();
        return TeaModel.build(map, self);
    }

    public GetInterveneGlobalReplyRequest setAgentKey(String agentKey) {
        this.agentKey = agentKey;
        return this;
    }
    public String getAgentKey() {
        return this.agentKey;
    }

}
