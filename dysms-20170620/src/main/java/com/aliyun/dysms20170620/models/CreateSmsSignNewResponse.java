// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class CreateSmsSignNewResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateSmsSignNewResponseBody body;

    public static CreateSmsSignNewResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateSmsSignNewResponse self = new CreateSmsSignNewResponse();
        return TeaModel.build(map, self);
    }

    public CreateSmsSignNewResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateSmsSignNewResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateSmsSignNewResponse setBody(CreateSmsSignNewResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateSmsSignNewResponseBody getBody() {
        return this.body;
    }

}
