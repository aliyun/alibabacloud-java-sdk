// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class FindCustomAgentImagePreparationRequest extends TeaModel {
    /**
     * <p>The client token submitted when creating or explicitly updating the image. Do not specify AgentId or the operation type.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>image-update-20261022-001</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

    public static FindCustomAgentImagePreparationRequest build(java.util.Map<String, ?> map) throws Exception {
        FindCustomAgentImagePreparationRequest self = new FindCustomAgentImagePreparationRequest();
        return TeaModel.build(map, self);
    }

    public FindCustomAgentImagePreparationRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
