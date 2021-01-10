// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class StopCasterResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public StopCasterResponseBody body;

    public static StopCasterResponse build(java.util.Map<String, ?> map) throws Exception {
        StopCasterResponse self = new StopCasterResponse();
        return TeaModel.build(map, self);
    }

    public StopCasterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StopCasterResponse setBody(StopCasterResponseBody body) {
        this.body = body;
        return this;
    }
    public StopCasterResponseBody getBody() {
        return this.body;
    }

}
