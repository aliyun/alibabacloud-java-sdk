// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetUserActiveTenantResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetUserActiveTenantResponseBody body;

    public static GetUserActiveTenantResponse build(java.util.Map<String, ?> map) throws Exception {
        GetUserActiveTenantResponse self = new GetUserActiveTenantResponse();
        return TeaModel.build(map, self);
    }

    public GetUserActiveTenantResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetUserActiveTenantResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetUserActiveTenantResponse setBody(GetUserActiveTenantResponseBody body) {
        this.body = body;
        return this;
    }
    public GetUserActiveTenantResponseBody getBody() {
        return this.body;
    }

}
