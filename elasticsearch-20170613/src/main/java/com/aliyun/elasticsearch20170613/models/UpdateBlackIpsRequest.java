// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class UpdateBlackIpsRequest extends TeaModel {
    @NameInMap("clientToken")
    public String clientToken;

    public static UpdateBlackIpsRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateBlackIpsRequest self = new UpdateBlackIpsRequest();
        return TeaModel.build(map, self);
    }

    public UpdateBlackIpsRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
