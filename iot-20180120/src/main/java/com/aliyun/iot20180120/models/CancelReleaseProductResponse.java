// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class CancelReleaseProductResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public CancelReleaseProductResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CancelReleaseProductResponse setBody(CancelReleaseProductResponseBody body) {
        this.body = body;
        return this;
    }
    public CancelReleaseProductResponseBody getBody() {
        return this.body;
    }

}
