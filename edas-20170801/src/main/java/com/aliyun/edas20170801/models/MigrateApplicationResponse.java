// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class MigrateApplicationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public MigrateApplicationResponseBody body;

    public static MigrateApplicationResponse build(java.util.Map<String, ?> map) throws Exception {
        MigrateApplicationResponse self = new MigrateApplicationResponse();
        return TeaModel.build(map, self);
    }

    public MigrateApplicationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public MigrateApplicationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public MigrateApplicationResponse setBody(MigrateApplicationResponseBody body) {
        this.body = body;
        return this;
    }
    public MigrateApplicationResponseBody getBody() {
        return this.body;
    }

}
