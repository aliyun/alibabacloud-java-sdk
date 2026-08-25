// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class CreateModelConnectionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateModelConnectionResponseBody body;

    public static CreateModelConnectionResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateModelConnectionResponse self = new CreateModelConnectionResponse();
        return TeaModel.build(map, self);
    }

    public CreateModelConnectionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateModelConnectionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateModelConnectionResponse setBody(CreateModelConnectionResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateModelConnectionResponseBody getBody() {
        return this.body;
    }

}
