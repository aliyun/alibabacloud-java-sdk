// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class UpdatePublicNetworkRequest extends TeaModel {
    /**
     * <p>The public network access switch configuration for the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;enablePublic&quot;:true}</p>
     */
    @NameInMap("body")
    public String body;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must ensure that it is unique among different requests. The token can be up to 64 ASCII characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>5A2CFF0E-5718-45B5-9D4D-70B3FF****</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

    public static UpdatePublicNetworkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdatePublicNetworkRequest self = new UpdatePublicNetworkRequest();
        return TeaModel.build(map, self);
    }

    public UpdatePublicNetworkRequest setBody(String body) {
        this.body = body;
        return this;
    }
    public String getBody() {
        return this.body;
    }

    public UpdatePublicNetworkRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
