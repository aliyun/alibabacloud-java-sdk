// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class CreateDNADBResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateDNADBResponseBody body;

    public static CreateDNADBResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDNADBResponse self = new CreateDNADBResponse();
        return TeaModel.build(map, self);
    }

    public CreateDNADBResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDNADBResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateDNADBResponse setBody(CreateDNADBResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDNADBResponseBody getBody() {
        return this.body;
    }

}
