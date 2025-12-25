// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetRoutineAccessTokenResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetRoutineAccessTokenResponseBody body;

    public static GetRoutineAccessTokenResponse build(java.util.Map<String, ?> map) throws Exception {
        GetRoutineAccessTokenResponse self = new GetRoutineAccessTokenResponse();
        return TeaModel.build(map, self);
    }

    public GetRoutineAccessTokenResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetRoutineAccessTokenResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetRoutineAccessTokenResponse setBody(GetRoutineAccessTokenResponseBody body) {
        this.body = body;
        return this;
    }
    public GetRoutineAccessTokenResponseBody getBody() {
        return this.body;
    }

}
