// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudgameapi20200728.models;

import com.aliyun.tea.*;

public class SetGameAliveResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SetGameAliveResponseBody body;

    public static SetGameAliveResponse build(java.util.Map<String, ?> map) throws Exception {
        SetGameAliveResponse self = new SetGameAliveResponse();
        return TeaModel.build(map, self);
    }

    public SetGameAliveResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetGameAliveResponse setBody(SetGameAliveResponseBody body) {
        this.body = body;
        return this;
    }
    public SetGameAliveResponseBody getBody() {
        return this.body;
    }

}
