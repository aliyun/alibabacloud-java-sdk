// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class QueryBotsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryBotsResponseBody body;

    public static QueryBotsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryBotsResponse self = new QueryBotsResponse();
        return TeaModel.build(map, self);
    }

    public QueryBotsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryBotsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryBotsResponse setBody(QueryBotsResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryBotsResponseBody getBody() {
        return this.body;
    }

}
