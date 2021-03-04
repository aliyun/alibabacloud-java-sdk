// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class QueryPrepaidCardsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryPrepaidCardsResponseBody body;

    public static QueryPrepaidCardsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryPrepaidCardsResponse self = new QueryPrepaidCardsResponse();
        return TeaModel.build(map, self);
    }

    public QueryPrepaidCardsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryPrepaidCardsResponse setBody(QueryPrepaidCardsResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryPrepaidCardsResponseBody getBody() {
        return this.body;
    }

}
