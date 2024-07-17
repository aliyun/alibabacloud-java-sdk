// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class UpdateDatabaseResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateDatabaseResponseBody body;

    public static UpdateDatabaseResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateDatabaseResponse self = new UpdateDatabaseResponse();
        return TeaModel.build(map, self);
    }

    public UpdateDatabaseResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateDatabaseResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateDatabaseResponse setBody(UpdateDatabaseResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateDatabaseResponseBody getBody() {
        return this.body;
    }

}
