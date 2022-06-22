// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class QueryAhasPostStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryAhasPostStatusResponseBody body;

    public static QueryAhasPostStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAhasPostStatusResponse self = new QueryAhasPostStatusResponse();
        return TeaModel.build(map, self);
    }

    public QueryAhasPostStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryAhasPostStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryAhasPostStatusResponse setBody(QueryAhasPostStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryAhasPostStatusResponseBody getBody() {
        return this.body;
    }

}
