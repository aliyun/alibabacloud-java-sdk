// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafkastreaming20260202.models;

import com.aliyun.tea.*;

public class CheckSqlContentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CheckSqlContentResponseBody body;

    public static CheckSqlContentResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckSqlContentResponse self = new CheckSqlContentResponse();
        return TeaModel.build(map, self);
    }

    public CheckSqlContentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckSqlContentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CheckSqlContentResponse setBody(CheckSqlContentResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckSqlContentResponseBody getBody() {
        return this.body;
    }

}
