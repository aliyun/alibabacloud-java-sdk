// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class CreateDomainMetaResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateDomainMetaResponseBody body;

    public static CreateDomainMetaResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDomainMetaResponse self = new CreateDomainMetaResponse();
        return TeaModel.build(map, self);
    }

    public CreateDomainMetaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDomainMetaResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateDomainMetaResponse setBody(CreateDomainMetaResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDomainMetaResponseBody getBody() {
        return this.body;
    }

}
