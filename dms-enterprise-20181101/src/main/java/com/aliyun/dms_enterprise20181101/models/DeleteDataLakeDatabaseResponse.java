// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class DeleteDataLakeDatabaseResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteDataLakeDatabaseResponseBody body;

    public static DeleteDataLakeDatabaseResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDataLakeDatabaseResponse self = new DeleteDataLakeDatabaseResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDataLakeDatabaseResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDataLakeDatabaseResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteDataLakeDatabaseResponse setBody(DeleteDataLakeDatabaseResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDataLakeDatabaseResponseBody getBody() {
        return this.body;
    }

}
