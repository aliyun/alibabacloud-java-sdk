// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240313.models;

import com.aliyun.tea.*;

public class ReleaseAgentRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("agentId")
    public String agentId;

    public static ReleaseAgentRequest build(java.util.Map<String, ?> map) throws Exception {
        ReleaseAgentRequest self = new ReleaseAgentRequest();
        return TeaModel.build(map, self);
    }

    public ReleaseAgentRequest setAgentId(String agentId) {
        this.agentId = agentId;
        return this;
    }
    public String getAgentId() {
        return this.agentId;
    }

}
