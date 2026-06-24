// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class CreateILMPolicyRequest extends TeaModel {
    /**
     * <p>A unique token used to ensure the idempotence of the request. The client generates this value. The value must be unique among different requests and can contain a maximum of 64 ASCII characters.</p>
     * 
     * <strong>example:</strong>
     * <p>5A2CFF0E-5718-45B5-9D4D-70B3FF****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("body")
    public String body;

    public static CreateILMPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateILMPolicyRequest self = new CreateILMPolicyRequest();
        return TeaModel.build(map, self);
    }

    public CreateILMPolicyRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateILMPolicyRequest setBody(String body) {
        this.body = body;
        return this;
    }
    public String getBody() {
        return this.body;
    }

}
