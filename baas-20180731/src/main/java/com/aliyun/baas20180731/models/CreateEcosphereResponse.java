// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class CreateEcosphereResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateEcosphereResponseBody body;

    public static CreateEcosphereResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateEcosphereResponse self = new CreateEcosphereResponse();
        return TeaModel.build(map, self);
    }

    public CreateEcosphereResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateEcosphereResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateEcosphereResponse setBody(CreateEcosphereResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateEcosphereResponseBody getBody() {
        return this.body;
    }

}
