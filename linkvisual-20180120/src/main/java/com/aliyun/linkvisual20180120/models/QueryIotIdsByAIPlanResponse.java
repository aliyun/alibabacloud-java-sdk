// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryIotIdsByAIPlanResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryIotIdsByAIPlanResponseBody body;

    public static QueryIotIdsByAIPlanResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryIotIdsByAIPlanResponse self = new QueryIotIdsByAIPlanResponse();
        return TeaModel.build(map, self);
    }

    public QueryIotIdsByAIPlanResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryIotIdsByAIPlanResponse setBody(QueryIotIdsByAIPlanResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryIotIdsByAIPlanResponseBody getBody() {
        return this.body;
    }

}
