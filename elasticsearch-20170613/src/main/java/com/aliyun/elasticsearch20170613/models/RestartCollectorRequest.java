// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class RestartCollectorRequest extends TeaModel {
    /**
     * <p>A unique token that is used to ensure the idempotence of the request. The client generates this value. The value must be unique among different requests and cannot exceed 64 ASCII characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>5A2CFF0E-5718-45B5-9D4D-70B3FF****</p>
     */
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
