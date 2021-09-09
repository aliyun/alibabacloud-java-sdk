// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class CreateLogstashRequest extends TeaModel {
    @NameInMap("clientToken")
    public String clientToken;

    public static CreateLogstashRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLogstashRequest self = new CreateLogstashRequest();
        return TeaModel.build(map, self);
    }

    public CreateLogstashRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
