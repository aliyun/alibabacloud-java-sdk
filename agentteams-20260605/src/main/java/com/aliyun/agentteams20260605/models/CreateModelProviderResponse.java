// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentteams20260605.models;

import com.aliyun.tea.*;

public class CreateModelProviderResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateModelProviderResponseBody body;

    public static CreateModelProviderResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateModelProviderResponse self = new CreateModelProviderResponse();
        return TeaModel.build(map, self);
    }

    public CreateModelProviderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateModelProviderResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateModelProviderResponse setBody(CreateModelProviderResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateModelProviderResponseBody getBody() {
        return this.body;
    }

}
