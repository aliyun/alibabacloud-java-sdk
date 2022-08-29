// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datatrust20220801.models;

import com.aliyun.tea.*;

public class CreateMpcSqlJobResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateMpcSqlJobResponseBody body;

    public static CreateMpcSqlJobResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateMpcSqlJobResponse self = new CreateMpcSqlJobResponse();
        return TeaModel.build(map, self);
    }

    public CreateMpcSqlJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateMpcSqlJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateMpcSqlJobResponse setBody(CreateMpcSqlJobResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateMpcSqlJobResponseBody getBody() {
        return this.body;
    }

}
