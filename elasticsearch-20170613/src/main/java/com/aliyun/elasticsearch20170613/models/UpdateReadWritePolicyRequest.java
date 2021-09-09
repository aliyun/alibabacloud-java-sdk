// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class UpdateReadWritePolicyRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    public static UpdateReadWritePolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateReadWritePolicyRequest self = new UpdateReadWritePolicyRequest();
        return TeaModel.build(map, self);
    }

    public UpdateReadWritePolicyRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
