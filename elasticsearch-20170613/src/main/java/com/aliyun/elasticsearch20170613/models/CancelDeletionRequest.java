// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class CancelDeletionRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

    public static CancelDeletionRequest build(java.util.Map<String, ?> map) throws Exception {
        CancelDeletionRequest self = new CancelDeletionRequest();
        return TeaModel.build(map, self);
    }

    public CancelDeletionRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
