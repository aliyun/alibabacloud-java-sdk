// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class GetDomainResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetDomainResponseBody body;

    public static GetDomainResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDomainResponse self = new GetDomainResponse();
        return TeaModel.build(map, self);
    }

    public GetDomainResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDomainResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDomainResponse setBody(GetDomainResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDomainResponseBody getBody() {
        return this.body;
    }

}
