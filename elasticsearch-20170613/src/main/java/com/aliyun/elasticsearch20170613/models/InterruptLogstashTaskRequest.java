// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class InterruptLogstashTaskRequest extends TeaModel {
    @NameInMap("clientToken")
    public String clientToken;

    public static InterruptLogstashTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        InterruptLogstashTaskRequest self = new InterruptLogstashTaskRequest();
        return TeaModel.build(map, self);
    }

    public InterruptLogstashTaskRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
