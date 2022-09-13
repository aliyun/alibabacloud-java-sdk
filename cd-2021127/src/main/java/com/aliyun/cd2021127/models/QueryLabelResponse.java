// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cd2021127.models;

import com.aliyun.tea.*;

public class QueryLabelResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLabelResponseBody body;

    public static QueryLabelResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLabelResponse self = new QueryLabelResponse();
        return TeaModel.build(map, self);
    }

    public QueryLabelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLabelResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryLabelResponse setBody(QueryLabelResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLabelResponseBody getBody() {
        return this.body;
    }

}
