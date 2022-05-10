// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class GetLiveDomainStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetLiveDomainStatusResponseBody body;

    public static GetLiveDomainStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLiveDomainStatusResponse self = new GetLiveDomainStatusResponse();
        return TeaModel.build(map, self);
    }

    public GetLiveDomainStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLiveDomainStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetLiveDomainStatusResponse setBody(GetLiveDomainStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLiveDomainStatusResponseBody getBody() {
        return this.body;
    }

}
