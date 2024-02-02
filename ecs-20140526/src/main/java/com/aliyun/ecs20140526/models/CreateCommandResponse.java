// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CreateCommandResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateCommandResponseBody body;

    public static CreateCommandResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateCommandResponse self = new CreateCommandResponse();
        return TeaModel.build(map, self);
    }

    public CreateCommandResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateCommandResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateCommandResponse setBody(CreateCommandResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateCommandResponseBody getBody() {
        return this.body;
    }

}
