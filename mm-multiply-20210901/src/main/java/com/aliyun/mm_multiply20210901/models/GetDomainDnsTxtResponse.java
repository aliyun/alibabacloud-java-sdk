// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mm_multiply20210901.models;

import com.aliyun.tea.*;

public class GetDomainDnsTxtResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetDomainDnsTxtResponseBody body;

    public static GetDomainDnsTxtResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDomainDnsTxtResponse self = new GetDomainDnsTxtResponse();
        return TeaModel.build(map, self);
    }

    public GetDomainDnsTxtResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDomainDnsTxtResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDomainDnsTxtResponse setBody(GetDomainDnsTxtResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDomainDnsTxtResponseBody getBody() {
        return this.body;
    }

}
