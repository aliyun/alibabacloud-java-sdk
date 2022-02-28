// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class UnregisterServerResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UnregisterServerResponseBody body;

    public static UnregisterServerResponse build(java.util.Map<String, ?> map) throws Exception {
        UnregisterServerResponse self = new UnregisterServerResponse();
        return TeaModel.build(map, self);
    }

    public UnregisterServerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UnregisterServerResponse setBody(UnregisterServerResponseBody body) {
        this.body = body;
        return this;
    }
    public UnregisterServerResponseBody getBody() {
        return this.body;
    }

}
