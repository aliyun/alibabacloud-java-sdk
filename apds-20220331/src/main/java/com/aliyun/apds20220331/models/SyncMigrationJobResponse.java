// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apds20220331.models;

import com.aliyun.tea.*;

public class SyncMigrationJobResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SyncMigrationJobResponseBody body;

    public static SyncMigrationJobResponse build(java.util.Map<String, ?> map) throws Exception {
        SyncMigrationJobResponse self = new SyncMigrationJobResponse();
        return TeaModel.build(map, self);
    }

    public SyncMigrationJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SyncMigrationJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SyncMigrationJobResponse setBody(SyncMigrationJobResponseBody body) {
        this.body = body;
        return this;
    }
    public SyncMigrationJobResponseBody getBody() {
        return this.body;
    }

}
