// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypns20170620.models;

import com.aliyun.tea.*;

public class QueryTagStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryTagStatusResponseBody body;

    public static QueryTagStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryTagStatusResponse self = new QueryTagStatusResponse();
        return TeaModel.build(map, self);
    }

    public QueryTagStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryTagStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryTagStatusResponse setBody(QueryTagStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryTagStatusResponseBody getBody() {
        return this.body;
    }

}
