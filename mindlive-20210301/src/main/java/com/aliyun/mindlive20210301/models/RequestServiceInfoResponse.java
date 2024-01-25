// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mindlive20210301.models;

import com.aliyun.tea.*;

public class RequestServiceInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RequestServiceInfoResponseBody body;

    public static RequestServiceInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        RequestServiceInfoResponse self = new RequestServiceInfoResponse();
        return TeaModel.build(map, self);
    }

    public RequestServiceInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RequestServiceInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RequestServiceInfoResponse setBody(RequestServiceInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public RequestServiceInfoResponseBody getBody() {
        return this.body;
    }

}
