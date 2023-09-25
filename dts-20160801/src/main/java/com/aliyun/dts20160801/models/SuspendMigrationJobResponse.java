// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20160801.models;

import com.aliyun.tea.*;

public class SuspendMigrationJobResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SuspendMigrationJobResponseBody body;

    public static SuspendMigrationJobResponse build(java.util.Map<String, ?> map) throws Exception {
        SuspendMigrationJobResponse self = new SuspendMigrationJobResponse();
        return TeaModel.build(map, self);
    }

    public SuspendMigrationJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SuspendMigrationJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SuspendMigrationJobResponse setBody(SuspendMigrationJobResponseBody body) {
        this.body = body;
        return this;
    }
    public SuspendMigrationJobResponseBody getBody() {
        return this.body;
    }

}
