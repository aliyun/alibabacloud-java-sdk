// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class CancelReleaseProductResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CancelReleaseProductResponseBody body;

    public static CancelReleaseProductResponse build(java.util.Map<String, ?> map) throws Exception {
        CancelReleaseProductResponse self = new CancelReleaseProductResponse();
        return TeaModel.build(map, self);
    }

    public CancelReleaseProductResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CancelReleaseProductResponse setBody(CancelReleaseProductResponseBody body) {
        this.body = body;
        return this;
    }
    public CancelReleaseProductResponseBody getBody() {
        return this.body;
    }

}
