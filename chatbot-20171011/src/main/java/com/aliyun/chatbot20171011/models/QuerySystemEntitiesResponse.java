// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class QuerySystemEntitiesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QuerySystemEntitiesResponseBody body;

    public static QuerySystemEntitiesResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySystemEntitiesResponse self = new QuerySystemEntitiesResponse();
        return TeaModel.build(map, self);
    }

    public QuerySystemEntitiesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QuerySystemEntitiesResponse setBody(QuerySystemEntitiesResponseBody body) {
        this.body = body;
        return this;
    }
    public QuerySystemEntitiesResponseBody getBody() {
        return this.body;
    }

}
