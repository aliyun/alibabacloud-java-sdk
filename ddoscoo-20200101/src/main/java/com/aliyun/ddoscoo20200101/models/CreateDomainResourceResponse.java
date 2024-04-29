// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class CreateDomainResourceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateDomainResourceResponseBody body;

    public static CreateDomainResourceResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDomainResourceResponse self = new CreateDomainResourceResponse();
        return TeaModel.build(map, self);
    }

    public CreateDomainResourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDomainResourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateDomainResourceResponse setBody(CreateDomainResourceResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDomainResourceResponseBody getBody() {
        return this.body;
    }

}
