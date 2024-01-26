// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DetachCenResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DetachCenResponseBody body;

    public static DetachCenResponse build(java.util.Map<String, ?> map) throws Exception {
        DetachCenResponse self = new DetachCenResponse();
        return TeaModel.build(map, self);
    }

    public DetachCenResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DetachCenResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DetachCenResponse setBody(DetachCenResponseBody body) {
        this.body = body;
        return this;
    }
    public DetachCenResponseBody getBody() {
        return this.body;
    }

}
