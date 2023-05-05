// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210602.models;

import com.aliyun.tea.*;

public class CreateTenantAppResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateTenantAppResponseBody body;

    public static CreateTenantAppResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateTenantAppResponse self = new CreateTenantAppResponse();
        return TeaModel.build(map, self);
    }

    public CreateTenantAppResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateTenantAppResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateTenantAppResponse setBody(CreateTenantAppResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateTenantAppResponseBody getBody() {
        return this.body;
    }

}
