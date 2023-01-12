// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class GetInvalidDomainCountResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetInvalidDomainCountResponseBody body;

    public static GetInvalidDomainCountResponse build(java.util.Map<String, ?> map) throws Exception {
        GetInvalidDomainCountResponse self = new GetInvalidDomainCountResponse();
        return TeaModel.build(map, self);
    }

    public GetInvalidDomainCountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetInvalidDomainCountResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetInvalidDomainCountResponse setBody(GetInvalidDomainCountResponseBody body) {
        this.body = body;
        return this;
    }
    public GetInvalidDomainCountResponseBody getBody() {
        return this.body;
    }

}
