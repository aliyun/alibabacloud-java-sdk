// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class DeleteModelConnectionRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>client-token-1</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

    public static DeleteModelConnectionRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteModelConnectionRequest self = new DeleteModelConnectionRequest();
        return TeaModel.build(map, self);
    }

    public DeleteModelConnectionRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
