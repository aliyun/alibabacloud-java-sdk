// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class QueryCompenInfosForOpResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryCompenInfosForOpResponseBody body;

    public static QueryCompenInfosForOpResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryCompenInfosForOpResponse self = new QueryCompenInfosForOpResponse();
        return TeaModel.build(map, self);
    }

    public QueryCompenInfosForOpResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryCompenInfosForOpResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryCompenInfosForOpResponse setBody(QueryCompenInfosForOpResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryCompenInfosForOpResponseBody getBody() {
        return this.body;
    }

}
