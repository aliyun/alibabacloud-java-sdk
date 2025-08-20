// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lingmou20250527.models;

import com.aliyun.tea.*;

public class QueryChatInstanceSessionsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryChatInstanceSessionsResponseBody body;

    public static QueryChatInstanceSessionsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryChatInstanceSessionsResponse self = new QueryChatInstanceSessionsResponse();
        return TeaModel.build(map, self);
    }

    public QueryChatInstanceSessionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryChatInstanceSessionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryChatInstanceSessionsResponse setBody(QueryChatInstanceSessionsResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryChatInstanceSessionsResponseBody getBody() {
        return this.body;
    }

}
