// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class StartMigrationJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StartMigrationJobResponseBody body;

    public static StartMigrationJobResponse build(java.util.Map<String, ?> map) throws Exception {
        StartMigrationJobResponse self = new StartMigrationJobResponse();
        return TeaModel.build(map, self);
    }

    public StartMigrationJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StartMigrationJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StartMigrationJobResponse setBody(StartMigrationJobResponseBody body) {
        this.body = body;
        return this;
    }
    public StartMigrationJobResponseBody getBody() {
        return this.body;
    }

}
