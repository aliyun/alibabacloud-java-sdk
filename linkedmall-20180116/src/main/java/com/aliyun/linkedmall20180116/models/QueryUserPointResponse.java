// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class QueryUserPointResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryUserPointResponseBody body;

    public static QueryUserPointResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryUserPointResponse self = new QueryUserPointResponse();
        return TeaModel.build(map, self);
    }

    public QueryUserPointResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryUserPointResponse setBody(QueryUserPointResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryUserPointResponseBody getBody() {
        return this.body;
    }

}
