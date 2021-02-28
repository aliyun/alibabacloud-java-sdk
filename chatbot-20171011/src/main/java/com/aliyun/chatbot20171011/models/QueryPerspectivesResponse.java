// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class QueryPerspectivesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryPerspectivesResponseBody body;

    public static QueryPerspectivesResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryPerspectivesResponse self = new QueryPerspectivesResponse();
        return TeaModel.build(map, self);
    }

    public QueryPerspectivesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryPerspectivesResponse setBody(QueryPerspectivesResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryPerspectivesResponseBody getBody() {
        return this.body;
    }

}
