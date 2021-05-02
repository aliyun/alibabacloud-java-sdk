// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class ReleaseProductResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ReleaseProductResponseBody body;

    public static ReleaseProductResponse build(java.util.Map<String, ?> map) throws Exception {
        ReleaseProductResponse self = new ReleaseProductResponse();
        return TeaModel.build(map, self);
    }

    public ReleaseProductResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReleaseProductResponse setBody(ReleaseProductResponseBody body) {
        this.body = body;
        return this;
    }
    public ReleaseProductResponseBody getBody() {
        return this.body;
    }

}
