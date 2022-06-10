// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class CreateCustomDomainResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateCustomDomainResponseBody body;

    public static CreateCustomDomainResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateCustomDomainResponse self = new CreateCustomDomainResponse();
        return TeaModel.build(map, self);
    }

    public CreateCustomDomainResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateCustomDomainResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateCustomDomainResponse setBody(CreateCustomDomainResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateCustomDomainResponseBody getBody() {
        return this.body;
    }

}
