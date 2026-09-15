// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class ConvertMcpToFreeEditRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-426655440000</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

    public static ConvertMcpToFreeEditRequest build(java.util.Map<String, ?> map) throws Exception {
        ConvertMcpToFreeEditRequest self = new ConvertMcpToFreeEditRequest();
        return TeaModel.build(map, self);
    }

    public ConvertMcpToFreeEditRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
