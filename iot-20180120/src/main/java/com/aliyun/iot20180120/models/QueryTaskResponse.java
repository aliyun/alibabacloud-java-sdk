// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryTaskResponseBody body;

    public static QueryTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryTaskResponse self = new QueryTaskResponse();
        return TeaModel.build(map, self);
    }

    public QueryTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryTaskResponse setBody(QueryTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryTaskResponseBody getBody() {
        return this.body;
    }

}
