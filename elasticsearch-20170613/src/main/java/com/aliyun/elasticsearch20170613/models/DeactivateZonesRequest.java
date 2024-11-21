// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class DeactivateZonesRequest extends TeaModel {
    @NameInMap("body")
    public String body;

    /**
     * <p>Used to ensure idempotency of the request. The client generates this parameter value and must guarantee its uniqueness across different requests, with a maximum length of 64 ASCII characters.</p>
     * 
     * <strong>example:</strong>
     * <p>5A2CFF0E-5718-45B5-9D4D-70B3FF****</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

    public static DeactivateZonesRequest build(java.util.Map<String, ?> map) throws Exception {
        DeactivateZonesRequest self = new DeactivateZonesRequest();
        return TeaModel.build(map, self);
    }

    public DeactivateZonesRequest setBody(String body) {
        this.body = body;
        return this;
    }
    public String getBody() {
        return this.body;
    }

    public DeactivateZonesRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
