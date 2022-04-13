// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class CreateTenantResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateTenantResponseBody body;

    public static CreateTenantResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateTenantResponse self = new CreateTenantResponse();
        return TeaModel.build(map, self);
    }

    public CreateTenantResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateTenantResponse setBody(CreateTenantResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateTenantResponseBody getBody() {
        return this.body;
    }

}
