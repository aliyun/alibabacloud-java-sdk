// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentteams20260605.models;

import com.aliyun.tea.*;

public class GetModelProviderResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetModelProviderResponseBody body;

    public static GetModelProviderResponse build(java.util.Map<String, ?> map) throws Exception {
        GetModelProviderResponse self = new GetModelProviderResponse();
        return TeaModel.build(map, self);
    }

    public GetModelProviderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetModelProviderResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetModelProviderResponse setBody(GetModelProviderResponseBody body) {
        this.body = body;
        return this;
    }
    public GetModelProviderResponseBody getBody() {
        return this.body;
    }

}
