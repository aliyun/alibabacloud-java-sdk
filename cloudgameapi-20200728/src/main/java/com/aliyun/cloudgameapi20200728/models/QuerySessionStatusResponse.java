// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudgameapi20200728.models;

import com.aliyun.tea.*;

public class QuerySessionStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QuerySessionStatusResponseBody body;

    public static QuerySessionStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySessionStatusResponse self = new QuerySessionStatusResponse();
        return TeaModel.build(map, self);
    }

    public QuerySessionStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QuerySessionStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QuerySessionStatusResponse setBody(QuerySessionStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public QuerySessionStatusResponseBody getBody() {
        return this.body;
    }

}
