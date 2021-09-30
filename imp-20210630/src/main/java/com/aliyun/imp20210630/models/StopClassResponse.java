// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class StopClassResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public StopClassResponseBody body;

    public static StopClassResponse build(java.util.Map<String, ?> map) throws Exception {
        StopClassResponse self = new StopClassResponse();
        return TeaModel.build(map, self);
    }

    public StopClassResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StopClassResponse setBody(StopClassResponseBody body) {
        this.body = body;
        return this;
    }
    public StopClassResponseBody getBody() {
        return this.body;
    }

}
