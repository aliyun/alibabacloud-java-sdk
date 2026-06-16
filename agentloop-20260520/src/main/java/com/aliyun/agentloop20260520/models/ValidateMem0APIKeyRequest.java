// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentloop20260520.models;

import com.aliyun.tea.*;

public class ValidateMem0APIKeyRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>my-agent-space</p>
     */
    @NameInMap("agentSpace")
    public String agentSpace;

    public static ValidateMem0APIKeyRequest build(java.util.Map<String, ?> map) throws Exception {
        ValidateMem0APIKeyRequest self = new ValidateMem0APIKeyRequest();
        return TeaModel.build(map, self);
    }

    public ValidateMem0APIKeyRequest setAgentSpace(String agentSpace) {
        this.agentSpace = agentSpace;
        return this;
    }
    public String getAgentSpace() {
        return this.agentSpace;
    }

}
