// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class UpdateDataLakeDatabaseResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateDataLakeDatabaseResponseBody body;

    public static UpdateDataLakeDatabaseResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateDataLakeDatabaseResponse self = new UpdateDataLakeDatabaseResponse();
        return TeaModel.build(map, self);
    }

    public UpdateDataLakeDatabaseResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateDataLakeDatabaseResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateDataLakeDatabaseResponse setBody(UpdateDataLakeDatabaseResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateDataLakeDatabaseResponseBody getBody() {
        return this.body;
    }

}
