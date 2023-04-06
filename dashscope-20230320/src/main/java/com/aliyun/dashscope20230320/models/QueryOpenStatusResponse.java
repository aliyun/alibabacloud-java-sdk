// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dashscope20230320.models;

import com.aliyun.tea.*;

public class QueryOpenStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryOpenStatusResponseBody body;

    public static QueryOpenStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryOpenStatusResponse self = new QueryOpenStatusResponse();
        return TeaModel.build(map, self);
    }

    public QueryOpenStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryOpenStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryOpenStatusResponse setBody(QueryOpenStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryOpenStatusResponseBody getBody() {
        return this.body;
    }

}
