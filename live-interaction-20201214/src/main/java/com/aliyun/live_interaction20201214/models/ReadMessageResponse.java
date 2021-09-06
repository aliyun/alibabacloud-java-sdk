// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live_interaction20201214.models;

import com.aliyun.tea.*;

public class ReadMessageResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ReadMessageResponseBody body;

    public static ReadMessageResponse build(java.util.Map<String, ?> map) throws Exception {
        ReadMessageResponse self = new ReadMessageResponse();
        return TeaModel.build(map, self);
    }

    public ReadMessageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReadMessageResponse setBody(ReadMessageResponseBody body) {
        this.body = body;
        return this;
    }
    public ReadMessageResponseBody getBody() {
        return this.body;
    }

}
