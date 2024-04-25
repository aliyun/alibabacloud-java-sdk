// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class CreateSqlLogTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateSqlLogTaskResponseBody body;

    public static CreateSqlLogTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateSqlLogTaskResponse self = new CreateSqlLogTaskResponse();
        return TeaModel.build(map, self);
    }

    public CreateSqlLogTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateSqlLogTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateSqlLogTaskResponse setBody(CreateSqlLogTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateSqlLogTaskResponseBody getBody() {
        return this.body;
    }

}
