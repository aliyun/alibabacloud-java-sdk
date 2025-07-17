// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dlfnext20250310.models;

import com.aliyun.tea.*;

public class AlterDatabaseResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AlterDatabaseResponseBody body;

    public static AlterDatabaseResponse build(java.util.Map<String, ?> map) throws Exception {
        AlterDatabaseResponse self = new AlterDatabaseResponse();
        return TeaModel.build(map, self);
    }

    public AlterDatabaseResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AlterDatabaseResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AlterDatabaseResponse setBody(AlterDatabaseResponseBody body) {
        this.body = body;
        return this;
    }
    public AlterDatabaseResponseBody getBody() {
        return this.body;
    }

}
