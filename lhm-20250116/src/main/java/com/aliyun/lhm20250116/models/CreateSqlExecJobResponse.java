// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lhm20250116.models;

import com.aliyun.tea.*;

public class CreateSqlExecJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateSqlExecJobResponseBody body;

    public static CreateSqlExecJobResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateSqlExecJobResponse self = new CreateSqlExecJobResponse();
        return TeaModel.build(map, self);
    }

    public CreateSqlExecJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateSqlExecJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateSqlExecJobResponse setBody(CreateSqlExecJobResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateSqlExecJobResponseBody getBody() {
        return this.body;
    }

}
