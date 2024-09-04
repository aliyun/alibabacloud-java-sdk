// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baasdis20200509.models;

import com.aliyun.tea.*;

public class CreateTenantDIDResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateTenantDIDResponseBody body;

    public static CreateTenantDIDResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateTenantDIDResponse self = new CreateTenantDIDResponse();
        return TeaModel.build(map, self);
    }

    public CreateTenantDIDResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateTenantDIDResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateTenantDIDResponse setBody(CreateTenantDIDResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateTenantDIDResponseBody getBody() {
        return this.body;
    }

}
