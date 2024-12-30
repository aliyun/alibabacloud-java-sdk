// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class CreateDataLakeDatabaseResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateDataLakeDatabaseResponseBody body;

    public static CreateDataLakeDatabaseResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDataLakeDatabaseResponse self = new CreateDataLakeDatabaseResponse();
        return TeaModel.build(map, self);
    }

    public CreateDataLakeDatabaseResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDataLakeDatabaseResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateDataLakeDatabaseResponse setBody(CreateDataLakeDatabaseResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDataLakeDatabaseResponseBody getBody() {
        return this.body;
    }

}
