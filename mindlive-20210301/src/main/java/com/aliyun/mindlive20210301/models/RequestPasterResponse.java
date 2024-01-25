// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mindlive20210301.models;

import com.aliyun.tea.*;

public class RequestPasterResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RequestPasterResponseBody body;

    public static RequestPasterResponse build(java.util.Map<String, ?> map) throws Exception {
        RequestPasterResponse self = new RequestPasterResponse();
        return TeaModel.build(map, self);
    }

    public RequestPasterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RequestPasterResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RequestPasterResponse setBody(RequestPasterResponseBody body) {
        this.body = body;
        return this;
    }
    public RequestPasterResponseBody getBody() {
        return this.body;
    }

}
