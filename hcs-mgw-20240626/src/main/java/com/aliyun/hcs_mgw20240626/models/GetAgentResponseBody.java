// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hcs_mgw20240626.models;

import com.aliyun.tea.*;

public class GetAgentResponseBody extends TeaModel {
    /**
     * <p>The details for obtaining the details of the agent.</p>
     */
    @NameInMap("ImportAgent")
    public GetAgentResp importAgent;

    public static GetAgentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAgentResponseBody self = new GetAgentResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAgentResponseBody setImportAgent(GetAgentResp importAgent) {
        this.importAgent = importAgent;
        return this;
    }
    public GetAgentResp getImportAgent() {
        return this.importAgent;
    }

}
