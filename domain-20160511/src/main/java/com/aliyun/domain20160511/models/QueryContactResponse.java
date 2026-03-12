// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20160511.models;

import com.aliyun.tea.*;

public class QueryContactResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryContactResponseBody body;

    public static QueryContactResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryContactResponse self = new QueryContactResponse();
        return TeaModel.build(map, self);
    }

    public QueryContactResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryContactResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryContactResponse setBody(QueryContactResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryContactResponseBody getBody() {
        return this.body;
    }

}
