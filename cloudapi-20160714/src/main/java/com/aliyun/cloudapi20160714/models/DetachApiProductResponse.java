// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DetachApiProductResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DetachApiProductResponseBody body;

    public static DetachApiProductResponse build(java.util.Map<String, ?> map) throws Exception {
        DetachApiProductResponse self = new DetachApiProductResponse();
        return TeaModel.build(map, self);
    }

    public DetachApiProductResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DetachApiProductResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DetachApiProductResponse setBody(DetachApiProductResponseBody body) {
        this.body = body;
        return this;
    }
    public DetachApiProductResponseBody getBody() {
        return this.body;
    }

}
