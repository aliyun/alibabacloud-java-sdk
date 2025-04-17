// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240313.models;

import com.aliyun.tea.*;

public class QueryImageToVideoTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryImageToVideoTaskResponseBody body;

    public static QueryImageToVideoTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryImageToVideoTaskResponse self = new QueryImageToVideoTaskResponse();
        return TeaModel.build(map, self);
    }

    public QueryImageToVideoTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryImageToVideoTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryImageToVideoTaskResponse setBody(QueryImageToVideoTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryImageToVideoTaskResponseBody getBody() {
        return this.body;
    }

}
