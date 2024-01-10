// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dg20190327.models;

import com.aliyun.tea.*;

public class DeleteDatabaseAccessPointResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteDatabaseAccessPointResponseBody body;

    public static DeleteDatabaseAccessPointResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDatabaseAccessPointResponse self = new DeleteDatabaseAccessPointResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDatabaseAccessPointResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDatabaseAccessPointResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteDatabaseAccessPointResponse setBody(DeleteDatabaseAccessPointResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDatabaseAccessPointResponseBody getBody() {
        return this.body;
    }

}
