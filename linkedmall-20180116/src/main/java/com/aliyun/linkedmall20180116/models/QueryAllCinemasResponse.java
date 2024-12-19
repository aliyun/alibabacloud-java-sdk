// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class QueryAllCinemasResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryAllCinemasResponseBody body;

    public static QueryAllCinemasResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAllCinemasResponse self = new QueryAllCinemasResponse();
        return TeaModel.build(map, self);
    }

    public QueryAllCinemasResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryAllCinemasResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryAllCinemasResponse setBody(QueryAllCinemasResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryAllCinemasResponseBody getBody() {
        return this.body;
    }

}
