// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentteams20260605.models;

import com.aliyun.tea.*;

public class GetUserPasswordResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetUserPasswordResponseBody body;

    public static GetUserPasswordResponse build(java.util.Map<String, ?> map) throws Exception {
        GetUserPasswordResponse self = new GetUserPasswordResponse();
        return TeaModel.build(map, self);
    }

    public GetUserPasswordResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetUserPasswordResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetUserPasswordResponse setBody(GetUserPasswordResponseBody body) {
        this.body = body;
        return this;
    }
    public GetUserPasswordResponseBody getBody() {
        return this.body;
    }

}
