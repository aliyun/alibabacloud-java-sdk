// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class CreateMcpServerResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateMcpServerResponseBody body;

    public static CreateMcpServerResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateMcpServerResponse self = new CreateMcpServerResponse();
        return TeaModel.build(map, self);
    }

    public CreateMcpServerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateMcpServerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateMcpServerResponse setBody(CreateMcpServerResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateMcpServerResponseBody getBody() {
        return this.body;
    }

}
