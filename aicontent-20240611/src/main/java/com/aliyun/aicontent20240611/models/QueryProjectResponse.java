// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class QueryProjectResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryProjectResponseBody body;

    public static QueryProjectResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryProjectResponse self = new QueryProjectResponse();
        return TeaModel.build(map, self);
    }

    public QueryProjectResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryProjectResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryProjectResponse setBody(QueryProjectResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryProjectResponseBody getBody() {
        return this.body;
    }

}
