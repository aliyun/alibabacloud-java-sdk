// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class StartMigrationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StartMigrationResponseBody body;

    public static StartMigrationResponse build(java.util.Map<String, ?> map) throws Exception {
        StartMigrationResponse self = new StartMigrationResponse();
        return TeaModel.build(map, self);
    }

    public StartMigrationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StartMigrationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StartMigrationResponse setBody(StartMigrationResponseBody body) {
        this.body = body;
        return this;
    }
    public StartMigrationResponseBody getBody() {
        return this.body;
    }

}
