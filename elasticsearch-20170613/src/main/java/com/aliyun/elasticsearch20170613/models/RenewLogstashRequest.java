// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class RenewLogstashRequest extends TeaModel {
    @NameInMap("clientToken")
    public String clientToken;

    public static RenewLogstashRequest build(java.util.Map<String, ?> map) throws Exception {
        RenewLogstashRequest self = new RenewLogstashRequest();
        return TeaModel.build(map, self);
    }

    public RenewLogstashRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
