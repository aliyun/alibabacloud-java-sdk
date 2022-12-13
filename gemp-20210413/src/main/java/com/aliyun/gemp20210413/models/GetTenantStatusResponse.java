// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class GetTenantStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetTenantStatusResponseBody body;

    public static GetTenantStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTenantStatusResponse self = new GetTenantStatusResponse();
        return TeaModel.build(map, self);
    }

    public GetTenantStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetTenantStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetTenantStatusResponse setBody(GetTenantStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public GetTenantStatusResponseBody getBody() {
        return this.body;
    }

}
