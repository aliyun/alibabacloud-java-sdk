// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudgameapi20200728.models;

import com.aliyun.tea.*;

public class QueryOutAccountBindStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryOutAccountBindStatusResponseBody body;

    public static QueryOutAccountBindStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryOutAccountBindStatusResponse self = new QueryOutAccountBindStatusResponse();
        return TeaModel.build(map, self);
    }

    public QueryOutAccountBindStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryOutAccountBindStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryOutAccountBindStatusResponse setBody(QueryOutAccountBindStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryOutAccountBindStatusResponseBody getBody() {
        return this.body;
    }

}
