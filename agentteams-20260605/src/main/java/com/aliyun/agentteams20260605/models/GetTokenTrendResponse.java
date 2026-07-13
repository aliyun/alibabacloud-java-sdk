// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentteams20260605.models;

import com.aliyun.tea.*;

public class GetTokenTrendResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetTokenTrendResponseBody body;

    public static GetTokenTrendResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTokenTrendResponse self = new GetTokenTrendResponse();
        return TeaModel.build(map, self);
    }

    public GetTokenTrendResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetTokenTrendResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetTokenTrendResponse setBody(GetTokenTrendResponseBody body) {
        this.body = body;
        return this;
    }
    public GetTokenTrendResponseBody getBody() {
        return this.body;
    }

}
