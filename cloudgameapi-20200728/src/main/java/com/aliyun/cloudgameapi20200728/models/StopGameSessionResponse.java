// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudgameapi20200728.models;

import com.aliyun.tea.*;

public class StopGameSessionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public StopGameSessionResponseBody body;

    public static StopGameSessionResponse build(java.util.Map<String, ?> map) throws Exception {
        StopGameSessionResponse self = new StopGameSessionResponse();
        return TeaModel.build(map, self);
    }

    public StopGameSessionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StopGameSessionResponse setBody(StopGameSessionResponseBody body) {
        this.body = body;
        return this;
    }
    public StopGameSessionResponseBody getBody() {
        return this.body;
    }

}
