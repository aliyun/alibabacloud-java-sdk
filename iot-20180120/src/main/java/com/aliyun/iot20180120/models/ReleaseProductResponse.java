// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class ReleaseProductResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public ReleaseProductResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ReleaseProductResponse setBody(ReleaseProductResponseBody body) {
        this.body = body;
        return this;
    }
    public ReleaseProductResponseBody getBody() {
        return this.body;
    }

}
