// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliyunauth20181222.models;

import com.aliyun.tea.*;

public class QueryAuthResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryAuthResponseBody body;

    public static QueryAuthResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAuthResponse self = new QueryAuthResponse();
        return TeaModel.build(map, self);
    }

    public QueryAuthResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryAuthResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryAuthResponse setBody(QueryAuthResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryAuthResponseBody getBody() {
        return this.body;
    }

}
