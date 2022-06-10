// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class GetCustomDomainResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetCustomDomainResponseBody body;

    public static GetCustomDomainResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCustomDomainResponse self = new GetCustomDomainResponse();
        return TeaModel.build(map, self);
    }

    public GetCustomDomainResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetCustomDomainResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetCustomDomainResponse setBody(GetCustomDomainResponseBody body) {
        this.body = body;
        return this;
    }
    public GetCustomDomainResponseBody getBody() {
        return this.body;
    }

}
