// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class DeleteCredentialRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>暂不支持</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

    public static DeleteCredentialRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteCredentialRequest self = new DeleteCredentialRequest();
        return TeaModel.build(map, self);
    }

    public DeleteCredentialRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
