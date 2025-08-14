// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class CreateNacosMcpServerResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateNacosMcpServerResponseBody body;

    public static CreateNacosMcpServerResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateNacosMcpServerResponse self = new CreateNacosMcpServerResponse();
        return TeaModel.build(map, self);
    }

    public CreateNacosMcpServerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateNacosMcpServerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateNacosMcpServerResponse setBody(CreateNacosMcpServerResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateNacosMcpServerResponseBody getBody() {
        return this.body;
    }

}
