// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class SuspendMigrationJobResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

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

    public SuspendMigrationJobResponse setBody(SuspendMigrationJobResponseBody body) {
        this.body = body;
        return this;
    }
    public SuspendMigrationJobResponseBody getBody() {
        return this.body;
    }

}
