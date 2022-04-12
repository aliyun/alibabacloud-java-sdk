// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cgcs20211111.models;

import com.aliyun.tea.*;

public class GetTenantIdResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetTenantIdResponseBody body;

    public static GetTenantIdResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTenantIdResponse self = new GetTenantIdResponse();
        return TeaModel.build(map, self);
    }

    public GetTenantIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetTenantIdResponse setBody(GetTenantIdResponseBody body) {
        this.body = body;
        return this;
    }
    public GetTenantIdResponseBody getBody() {
        return this.body;
    }

}
