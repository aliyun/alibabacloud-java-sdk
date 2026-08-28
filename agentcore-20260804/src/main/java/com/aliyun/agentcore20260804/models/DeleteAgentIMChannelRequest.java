// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class DeleteAgentIMChannelRequest extends TeaModel {
    /**
     * <p>A reserved idempotence token. The backend does not provide persistent idempotence guarantee in the current version.</p>
     * 
     * <strong>example:</strong>
     * <p>client-token-1</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

    public static DeleteAgentIMChannelRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAgentIMChannelRequest self = new DeleteAgentIMChannelRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAgentIMChannelRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
