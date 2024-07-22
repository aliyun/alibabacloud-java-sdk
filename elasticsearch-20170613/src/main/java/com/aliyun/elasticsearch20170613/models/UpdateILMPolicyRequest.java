// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class UpdateILMPolicyRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>5A2CFF0E-5718-45B5-9D4D-70B3FF****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("body")
    public String body;

    public static UpdateILMPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateILMPolicyRequest self = new UpdateILMPolicyRequest();
        return TeaModel.build(map, self);
    }

    public UpdateILMPolicyRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateILMPolicyRequest setBody(String body) {
        this.body = body;
        return this;
    }
    public String getBody() {
        return this.body;
    }

}
