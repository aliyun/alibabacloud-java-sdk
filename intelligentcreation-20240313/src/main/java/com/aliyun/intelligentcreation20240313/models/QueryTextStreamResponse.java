// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240313.models;

import com.aliyun.tea.*;

public class QueryTextStreamResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryTextStreamResponseBody body;

    public static QueryTextStreamResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryTextStreamResponse self = new QueryTextStreamResponse();
        return TeaModel.build(map, self);
    }

    public QueryTextStreamResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryTextStreamResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryTextStreamResponse setBody(QueryTextStreamResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryTextStreamResponseBody getBody() {
        return this.body;
    }

}
