// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class ReversedInitializeServerResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ReversedInitializeServerResponseBody body;

    public static ReversedInitializeServerResponse build(java.util.Map<String, ?> map) throws Exception {
        ReversedInitializeServerResponse self = new ReversedInitializeServerResponse();
        return TeaModel.build(map, self);
    }

    public ReversedInitializeServerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReversedInitializeServerResponse setBody(ReversedInitializeServerResponseBody body) {
        this.body = body;
        return this;
    }
    public ReversedInitializeServerResponseBody getBody() {
        return this.body;
    }

}
