// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class RestartCollectorRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    public static RestartCollectorRequest build(java.util.Map<String, ?> map) throws Exception {
        RestartCollectorRequest self = new RestartCollectorRequest();
        return TeaModel.build(map, self);
    }

    public RestartCollectorRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
