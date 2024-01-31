// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class CreateEdgeMachineResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateEdgeMachineResponseBody body;

    public static CreateEdgeMachineResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateEdgeMachineResponse self = new CreateEdgeMachineResponse();
        return TeaModel.build(map, self);
    }

    public CreateEdgeMachineResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateEdgeMachineResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateEdgeMachineResponse setBody(CreateEdgeMachineResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateEdgeMachineResponseBody getBody() {
        return this.body;
    }

}
