// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20220531.models;

import com.aliyun.tea.*;

public class QueryItemDetailWithDivisionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryItemDetailWithDivisionResponseBody body;

    public static QueryItemDetailWithDivisionResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryItemDetailWithDivisionResponse self = new QueryItemDetailWithDivisionResponse();
        return TeaModel.build(map, self);
    }

    public QueryItemDetailWithDivisionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryItemDetailWithDivisionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryItemDetailWithDivisionResponse setBody(QueryItemDetailWithDivisionResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryItemDetailWithDivisionResponseBody getBody() {
        return this.body;
    }

}
