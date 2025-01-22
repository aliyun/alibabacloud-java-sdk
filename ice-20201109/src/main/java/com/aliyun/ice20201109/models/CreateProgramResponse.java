// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class CreateProgramResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateProgramResponseBody body;

    public static CreateProgramResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateProgramResponse self = new CreateProgramResponse();
        return TeaModel.build(map, self);
    }

    public CreateProgramResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateProgramResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateProgramResponse setBody(CreateProgramResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateProgramResponseBody getBody() {
        return this.body;
    }

}
