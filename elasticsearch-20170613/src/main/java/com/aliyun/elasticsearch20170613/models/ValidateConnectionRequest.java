// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ValidateConnectionRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    public static ValidateConnectionRequest build(java.util.Map<String, ?> map) throws Exception {
        ValidateConnectionRequest self = new ValidateConnectionRequest();
        return TeaModel.build(map, self);
    }

    public ValidateConnectionRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
