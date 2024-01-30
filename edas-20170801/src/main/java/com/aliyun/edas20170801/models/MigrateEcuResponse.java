// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class MigrateEcuResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public MigrateEcuResponseBody body;

    public static MigrateEcuResponse build(java.util.Map<String, ?> map) throws Exception {
        MigrateEcuResponse self = new MigrateEcuResponse();
        return TeaModel.build(map, self);
    }

    public MigrateEcuResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public MigrateEcuResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public MigrateEcuResponse setBody(MigrateEcuResponseBody body) {
        this.body = body;
        return this;
    }
    public MigrateEcuResponseBody getBody() {
        return this.body;
    }

}
