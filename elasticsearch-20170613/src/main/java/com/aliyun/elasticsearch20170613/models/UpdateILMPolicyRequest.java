// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class UpdateILMPolicyRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

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

}
