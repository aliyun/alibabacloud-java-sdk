// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class GetMigrateApplicationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetMigrateApplicationResponseBody body;

    public static GetMigrateApplicationResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMigrateApplicationResponse self = new GetMigrateApplicationResponse();
        return TeaModel.build(map, self);
    }

    public GetMigrateApplicationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetMigrateApplicationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetMigrateApplicationResponse setBody(GetMigrateApplicationResponseBody body) {
        this.body = body;
        return this;
    }
    public GetMigrateApplicationResponseBody getBody() {
        return this.body;
    }

}
