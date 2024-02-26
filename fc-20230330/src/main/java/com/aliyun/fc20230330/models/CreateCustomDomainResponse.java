// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class CreateCustomDomainResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CustomDomain body;

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

    public CreateCustomDomainResponse setBody(CustomDomain body) {
        this.body = body;
        return this;
    }
    public CustomDomain getBody() {
        return this.body;
    }

}
