// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class CreateTenantApplicationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateTenantApplicationResponseBody body;

    public static CreateTenantApplicationResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateTenantApplicationResponse self = new CreateTenantApplicationResponse();
        return TeaModel.build(map, self);
    }

    public CreateTenantApplicationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateTenantApplicationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateTenantApplicationResponse setBody(CreateTenantApplicationResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateTenantApplicationResponseBody getBody() {
        return this.body;
    }

}
