// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class GetModelConnectionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetModelConnectionResponseBody body;

    public static GetModelConnectionResponse build(java.util.Map<String, ?> map) throws Exception {
        GetModelConnectionResponse self = new GetModelConnectionResponse();
        return TeaModel.build(map, self);
    }

    public GetModelConnectionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetModelConnectionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetModelConnectionResponse setBody(GetModelConnectionResponseBody body) {
        this.body = body;
        return this;
    }
    public GetModelConnectionResponseBody getBody() {
        return this.body;
    }

}
