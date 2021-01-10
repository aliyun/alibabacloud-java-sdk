// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class PushMessageResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public PushMessageResponseBody body;

    public static PushMessageResponse build(java.util.Map<String, ?> map) throws Exception {
        PushMessageResponse self = new PushMessageResponse();
        return TeaModel.build(map, self);
    }

    public PushMessageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PushMessageResponse setBody(PushMessageResponseBody body) {
        this.body = body;
        return this;
    }
    public PushMessageResponseBody getBody() {
        return this.body;
    }

}
