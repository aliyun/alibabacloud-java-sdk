// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class QueryBotsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public QueryBotsResponse setBody(QueryBotsResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryBotsResponseBody getBody() {
        return this.body;
    }

}
