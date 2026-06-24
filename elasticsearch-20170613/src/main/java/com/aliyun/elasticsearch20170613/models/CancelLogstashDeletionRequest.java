// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class CancelLogstashDeletionRequest extends TeaModel {
    /**
     * <p>A unique token used to ensure idempotence of the request. The client generates this value. The value must be unique among different requests and can be up to 64 ASCII characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>5A2CFF0E-5718-45B5-9D4D-70B3FF****</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

    public static CancelLogstashDeletionRequest build(java.util.Map<String, ?> map) throws Exception {
        CancelLogstashDeletionRequest self = new CancelLogstashDeletionRequest();
        return TeaModel.build(map, self);
    }

    public CancelLogstashDeletionRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
