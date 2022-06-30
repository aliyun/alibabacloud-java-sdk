// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apds20220331.models;

import com.aliyun.tea.*;

public class StopSyncMigrationJobResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public StopSyncMigrationJobResponseBody body;

    public static StopSyncMigrationJobResponse build(java.util.Map<String, ?> map) throws Exception {
        StopSyncMigrationJobResponse self = new StopSyncMigrationJobResponse();
        return TeaModel.build(map, self);
    }

    public StopSyncMigrationJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StopSyncMigrationJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StopSyncMigrationJobResponse setBody(StopSyncMigrationJobResponseBody body) {
        this.body = body;
        return this;
    }
    public StopSyncMigrationJobResponseBody getBody() {
        return this.body;
    }

}
