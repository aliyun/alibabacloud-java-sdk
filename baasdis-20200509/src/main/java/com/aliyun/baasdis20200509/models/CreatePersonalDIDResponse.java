// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baasdis20200509.models;

import com.aliyun.tea.*;

public class CreatePersonalDIDResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreatePersonalDIDResponseBody body;

    public static CreatePersonalDIDResponse build(java.util.Map<String, ?> map) throws Exception {
        CreatePersonalDIDResponse self = new CreatePersonalDIDResponse();
        return TeaModel.build(map, self);
    }

    public CreatePersonalDIDResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreatePersonalDIDResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreatePersonalDIDResponse setBody(CreatePersonalDIDResponseBody body) {
        this.body = body;
        return this;
    }
    public CreatePersonalDIDResponseBody getBody() {
        return this.body;
    }

}
