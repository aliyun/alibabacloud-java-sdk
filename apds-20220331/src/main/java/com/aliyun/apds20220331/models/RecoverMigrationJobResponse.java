// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apds20220331.models;

import com.aliyun.tea.*;

public class RecoverMigrationJobResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public RecoverMigrationJobResponseBody body;

    public static RecoverMigrationJobResponse build(java.util.Map<String, ?> map) throws Exception {
        RecoverMigrationJobResponse self = new RecoverMigrationJobResponse();
        return TeaModel.build(map, self);
    }

    public RecoverMigrationJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RecoverMigrationJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RecoverMigrationJobResponse setBody(RecoverMigrationJobResponseBody body) {
        this.body = body;
        return this;
    }
    public RecoverMigrationJobResponseBody getBody() {
        return this.body;
    }

}
