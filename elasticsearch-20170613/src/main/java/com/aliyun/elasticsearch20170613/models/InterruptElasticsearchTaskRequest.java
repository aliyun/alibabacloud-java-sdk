// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class InterruptElasticsearchTaskRequest extends TeaModel {
    @NameInMap("body")
    public String body;

    @NameInMap("clientToken")
    public String clientToken;

    public static InterruptElasticsearchTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        InterruptElasticsearchTaskRequest self = new InterruptElasticsearchTaskRequest();
        return TeaModel.build(map, self);
    }

    public InterruptElasticsearchTaskRequest setBody(String body) {
        this.body = body;
        return this;
    }
    public String getBody() {
        return this.body;
    }

    public InterruptElasticsearchTaskRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
