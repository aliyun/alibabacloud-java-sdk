// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class UpdateLogstashRequest extends TeaModel {
    @NameInMap("clientToken")
    public String clientToken;

    public static UpdateLogstashRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateLogstashRequest self = new UpdateLogstashRequest();
        return TeaModel.build(map, self);
    }

    public UpdateLogstashRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
