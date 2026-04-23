// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GetAIAgentConcurrencyRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>*<strong><strong><strong>3b3d94abda22</strong></strong></strong></p>
     */
    @NameInMap("AIAgentId")
    public String AIAgentId;

    public static GetAIAgentConcurrencyRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAIAgentConcurrencyRequest self = new GetAIAgentConcurrencyRequest();
        return TeaModel.build(map, self);
    }

    public GetAIAgentConcurrencyRequest setAIAgentId(String AIAgentId) {
        this.AIAgentId = AIAgentId;
        return this;
    }
    public String getAIAgentId() {
        return this.AIAgentId;
    }

}
