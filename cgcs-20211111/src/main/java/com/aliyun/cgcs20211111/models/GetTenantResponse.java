// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cgcs20211111.models;

import com.aliyun.tea.*;

public class GetTenantResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetTenantResponseBody body;

    public static GetTenantResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTenantResponse self = new GetTenantResponse();
        return TeaModel.build(map, self);
    }

    public GetTenantResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetTenantResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetTenantResponse setBody(GetTenantResponseBody body) {
        this.body = body;
        return this;
    }
    public GetTenantResponseBody getBody() {
        return this.body;
    }

}
