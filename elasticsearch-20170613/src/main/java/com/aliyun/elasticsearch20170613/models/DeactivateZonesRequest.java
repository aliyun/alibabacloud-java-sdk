// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class DeactivateZonesRequest extends TeaModel {
    /**
     * <p>The IDs of the zones to be taken offline.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;cn-hangzhou-i&quot;,&quot;cn-hangzhou-f&quot;]</p>
     */
    @NameInMap("body")
    public String body;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the value, but you must ensure that it is unique among different requests. The token can be up to 64 ASCII characters in length.</p>
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
