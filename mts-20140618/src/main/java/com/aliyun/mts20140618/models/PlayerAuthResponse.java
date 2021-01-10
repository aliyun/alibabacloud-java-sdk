// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class PlayerAuthResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public PlayerAuthResponseBody body;

    public static PlayerAuthResponse build(java.util.Map<String, ?> map) throws Exception {
        PlayerAuthResponse self = new PlayerAuthResponse();
        return TeaModel.build(map, self);
    }

    public PlayerAuthResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PlayerAuthResponse setBody(PlayerAuthResponseBody body) {
        this.body = body;
        return this;
    }
    public PlayerAuthResponseBody getBody() {
        return this.body;
    }

}
