// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class GetInterveneTemplateFileUrlRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("AgentKey")
    public String agentKey;

    public static GetInterveneTemplateFileUrlRequest build(java.util.Map<String, ?> map) throws Exception {
        GetInterveneTemplateFileUrlRequest self = new GetInterveneTemplateFileUrlRequest();
        return TeaModel.build(map, self);
    }

    public GetInterveneTemplateFileUrlRequest setAgentKey(String agentKey) {
        this.agentKey = agentKey;
        return this;
    }
    public String getAgentKey() {
        return this.agentKey;
    }

}
