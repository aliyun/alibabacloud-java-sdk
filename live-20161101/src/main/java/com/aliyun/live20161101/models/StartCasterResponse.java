// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class StartCasterResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public StartCasterResponseBody body;

    public static StartCasterResponse build(java.util.Map<String, ?> map) throws Exception {
        StartCasterResponse self = new StartCasterResponse();
        return TeaModel.build(map, self);
    }

    public StartCasterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StartCasterResponse setBody(StartCasterResponseBody body) {
        this.body = body;
        return this;
    }
    public StartCasterResponseBody getBody() {
        return this.body;
    }

}
