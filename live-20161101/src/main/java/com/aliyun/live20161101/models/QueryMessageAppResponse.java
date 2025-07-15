// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class QueryMessageAppResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryMessageAppResponseBody body;

    public static QueryMessageAppResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryMessageAppResponse self = new QueryMessageAppResponse();
        return TeaModel.build(map, self);
    }

    public QueryMessageAppResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryMessageAppResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryMessageAppResponse setBody(QueryMessageAppResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryMessageAppResponseBody getBody() {
        return this.body;
    }

}
