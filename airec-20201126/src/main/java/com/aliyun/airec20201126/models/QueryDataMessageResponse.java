// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class QueryDataMessageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryDataMessageResponseBody body;

    public static QueryDataMessageResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDataMessageResponse self = new QueryDataMessageResponse();
        return TeaModel.build(map, self);
    }

    public QueryDataMessageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryDataMessageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryDataMessageResponse setBody(QueryDataMessageResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryDataMessageResponseBody getBody() {
        return this.body;
    }

}
