// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class CreateILMPolicyRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

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

}
