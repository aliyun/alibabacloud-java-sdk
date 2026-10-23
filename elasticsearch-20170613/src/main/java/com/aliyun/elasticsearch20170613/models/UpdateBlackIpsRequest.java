// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class UpdateBlackIpsRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request. Use different values for different requests.</p>
     * 
     * <strong>example:</strong>
     * <p>5A2CFF0E-5718-45B5-9D4D-70B3FF***</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

    public static UpdateBlackIpsRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateBlackIpsRequest self = new UpdateBlackIpsRequest();
        return TeaModel.build(map, self);
    }

    public UpdateBlackIpsRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
