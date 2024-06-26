// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class QueryBlockResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryBlockResponseBody body;

    public static QueryBlockResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryBlockResponse self = new QueryBlockResponse();
        return TeaModel.build(map, self);
    }

    public QueryBlockResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryBlockResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryBlockResponse setBody(QueryBlockResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryBlockResponseBody getBody() {
        return this.body;
    }

}
