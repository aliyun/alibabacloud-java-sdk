// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class StopListenerResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public StopListenerResponseBody body;

    public static StopListenerResponse build(java.util.Map<String, ?> map) throws Exception {
        StopListenerResponse self = new StopListenerResponse();
        return TeaModel.build(map, self);
    }

    public StopListenerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StopListenerResponse setBody(StopListenerResponseBody body) {
        this.body = body;
        return this;
    }
    public StopListenerResponseBody getBody() {
        return this.body;
    }

}
