// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hcs_mgw20240626.models;

import com.aliyun.tea.*;

public class CreateAgentRequest extends TeaModel {
    /**
     * <p>The details for creating the agent.</p>
     */
    @NameInMap("ImportAgent")
    public CreateAgentInfo importAgent;

    public static CreateAgentRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAgentRequest self = new CreateAgentRequest();
        return TeaModel.build(map, self);
    }

    public CreateAgentRequest setImportAgent(CreateAgentInfo importAgent) {
        this.importAgent = importAgent;
        return this;
    }
    public CreateAgentInfo getImportAgent() {
        return this.importAgent;
    }

}
