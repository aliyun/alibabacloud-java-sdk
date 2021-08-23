// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class QueryIntentsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryIntentsResponseBody body;

    public static QueryIntentsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryIntentsResponse self = new QueryIntentsResponse();
        return TeaModel.build(map, self);
    }

    public QueryIntentsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryIntentsResponse setBody(QueryIntentsResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryIntentsResponseBody getBody() {
        return this.body;
    }

}
