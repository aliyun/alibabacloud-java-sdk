// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class QueryEntitiesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryEntitiesResponseBody body;

    public static QueryEntitiesResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryEntitiesResponse self = new QueryEntitiesResponse();
        return TeaModel.build(map, self);
    }

    public QueryEntitiesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryEntitiesResponse setBody(QueryEntitiesResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryEntitiesResponseBody getBody() {
        return this.body;
    }

}
