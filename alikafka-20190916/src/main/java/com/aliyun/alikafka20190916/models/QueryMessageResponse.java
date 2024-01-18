// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafka20190916.models;

import com.aliyun.tea.*;

public class QueryMessageResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryMessageResponseBody body;

    public static QueryMessageResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryMessageResponse self = new QueryMessageResponse();
        return TeaModel.build(map, self);
    }

    public QueryMessageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryMessageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryMessageResponse setBody(QueryMessageResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryMessageResponseBody getBody() {
        return this.body;
    }

}
