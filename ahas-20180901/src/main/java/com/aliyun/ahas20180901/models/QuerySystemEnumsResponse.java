// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class QuerySystemEnumsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QuerySystemEnumsResponseBody body;

    public static QuerySystemEnumsResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySystemEnumsResponse self = new QuerySystemEnumsResponse();
        return TeaModel.build(map, self);
    }

    public QuerySystemEnumsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QuerySystemEnumsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QuerySystemEnumsResponse setBody(QuerySystemEnumsResponseBody body) {
        this.body = body;
        return this;
    }
    public QuerySystemEnumsResponseBody getBody() {
        return this.body;
    }

}
