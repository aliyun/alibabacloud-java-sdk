// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class StopBindingResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public StopBindingResponseBody body;

    public static StopBindingResponse build(java.util.Map<String, ?> map) throws Exception {
        StopBindingResponse self = new StopBindingResponse();
        return TeaModel.build(map, self);
    }

    public StopBindingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StopBindingResponse setBody(StopBindingResponseBody body) {
        this.body = body;
        return this;
    }
    public StopBindingResponseBody getBody() {
        return this.body;
    }

}
