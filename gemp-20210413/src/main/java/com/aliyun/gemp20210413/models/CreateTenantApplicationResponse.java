// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class CreateTenantApplicationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public CreateTenantApplicationResponse setBody(CreateTenantApplicationResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateTenantApplicationResponseBody getBody() {
        return this.body;
    }

}
