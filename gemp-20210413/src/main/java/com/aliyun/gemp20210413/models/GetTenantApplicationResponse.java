// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class GetTenantApplicationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetTenantApplicationResponseBody body;

    public static GetTenantApplicationResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTenantApplicationResponse self = new GetTenantApplicationResponse();
        return TeaModel.build(map, self);
    }

    public GetTenantApplicationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetTenantApplicationResponse setBody(GetTenantApplicationResponseBody body) {
        this.body = body;
        return this;
    }
    public GetTenantApplicationResponseBody getBody() {
        return this.body;
    }

}
