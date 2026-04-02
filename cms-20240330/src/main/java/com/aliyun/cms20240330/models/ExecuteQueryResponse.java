// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class ExecuteQueryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ExecuteQueryResponseBody body;

    public static ExecuteQueryResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecuteQueryResponse self = new ExecuteQueryResponse();
        return TeaModel.build(map, self);
    }

    public ExecuteQueryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExecuteQueryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ExecuteQueryResponse setBody(ExecuteQueryResponseBody body) {
        this.body = body;
        return this;
    }
    public ExecuteQueryResponseBody getBody() {
        return this.body;
    }

}
