// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class MigrateDesktopsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public MigrateDesktopsResponseBody body;

    public static MigrateDesktopsResponse build(java.util.Map<String, ?> map) throws Exception {
        MigrateDesktopsResponse self = new MigrateDesktopsResponse();
        return TeaModel.build(map, self);
    }

    public MigrateDesktopsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public MigrateDesktopsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public MigrateDesktopsResponse setBody(MigrateDesktopsResponseBody body) {
        this.body = body;
        return this;
    }
    public MigrateDesktopsResponseBody getBody() {
        return this.body;
    }

}
