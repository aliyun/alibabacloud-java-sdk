// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mindlive20210301.models;

import com.aliyun.tea.*;

public class RequestLiveTeleprompterStateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RequestLiveTeleprompterStateResponseBody body;

    public static RequestLiveTeleprompterStateResponse build(java.util.Map<String, ?> map) throws Exception {
        RequestLiveTeleprompterStateResponse self = new RequestLiveTeleprompterStateResponse();
        return TeaModel.build(map, self);
    }

    public RequestLiveTeleprompterStateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RequestLiveTeleprompterStateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RequestLiveTeleprompterStateResponse setBody(RequestLiveTeleprompterStateResponseBody body) {
        this.body = body;
        return this;
    }
    public RequestLiveTeleprompterStateResponseBody getBody() {
        return this.body;
    }

}
