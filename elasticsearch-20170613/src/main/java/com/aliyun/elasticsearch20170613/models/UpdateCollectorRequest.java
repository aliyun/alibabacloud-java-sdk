// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class UpdateCollectorRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>5A2CFF0E-5718-45B5-9D4D-70B3FF****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("body")
    public String body;

    public static UpdateCollectorRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateCollectorRequest self = new UpdateCollectorRequest();
        return TeaModel.build(map, self);
    }

    public UpdateCollectorRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateCollectorRequest setBody(String body) {
        this.body = body;
        return this;
    }
    public String getBody() {
        return this.body;
    }

}
