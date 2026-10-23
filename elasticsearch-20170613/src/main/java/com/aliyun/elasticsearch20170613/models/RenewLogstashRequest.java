// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class RenewLogstashRequest extends TeaModel {
    /**
     * <p>The renewal duration and cycle for the Logstash instance.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;duration&quot;:1,&quot;pricingCycle&quot;:&quot;Year&quot;}</p>
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

    public static RenewLogstashRequest build(java.util.Map<String, ?> map) throws Exception {
        RenewLogstashRequest self = new RenewLogstashRequest();
        return TeaModel.build(map, self);
    }

    public RenewLogstashRequest setBody(String body) {
        this.body = body;
        return this;
    }
    public String getBody() {
        return this.body;
    }

    public RenewLogstashRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
