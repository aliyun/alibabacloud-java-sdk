// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class RestartLogstashRequest extends TeaModel {
    @NameInMap("clientToken")
    public String clientToken;

    @NameInMap("force")
    public Boolean force;

    public static RestartLogstashRequest build(java.util.Map<String, ?> map) throws Exception {
        RestartLogstashRequest self = new RestartLogstashRequest();
        return TeaModel.build(map, self);
    }

    public RestartLogstashRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public RestartLogstashRequest setForce(Boolean force) {
        this.force = force;
        return this;
    }
    public Boolean getForce() {
        return this.force;
    }

}
