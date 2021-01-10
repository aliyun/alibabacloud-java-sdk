// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryAIPlanResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryAIPlanResponseBody body;

    public static QueryAIPlanResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAIPlanResponse self = new QueryAIPlanResponse();
        return TeaModel.build(map, self);
    }

    public QueryAIPlanResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryAIPlanResponse setBody(QueryAIPlanResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryAIPlanResponseBody getBody() {
        return this.body;
    }

}
