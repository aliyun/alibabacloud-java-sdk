// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class StartMigrationJobResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public StartMigrationJobResponse setBody(StartMigrationJobResponseBody body) {
        this.body = body;
        return this;
    }
    public StartMigrationJobResponseBody getBody() {
        return this.body;
    }

}
