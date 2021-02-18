// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class StopMigrationJobResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public StopMigrationJobResponse setBody(StopMigrationJobResponseBody body) {
        this.body = body;
        return this;
    }
    public StopMigrationJobResponseBody getBody() {
        return this.body;
    }

}
