// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class StopMigrationJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StopMigrationJobResponseBody body;

    public static StopMigrationJobResponse build(java.util.Map<String, ?> map) throws Exception {
        StopMigrationJobResponse self = new StopMigrationJobResponse();
        return TeaModel.build(map, self);
    }

    public StopMigrationJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StopMigrationJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StopMigrationJobResponse setBody(StopMigrationJobResponseBody body) {
        this.body = body;
        return this;
    }
    public StopMigrationJobResponseBody getBody() {
        return this.body;
    }

}
