// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class CreateILMPolicyRequest extends TeaModel {
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
