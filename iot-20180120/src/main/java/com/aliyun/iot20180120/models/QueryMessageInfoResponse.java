// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryMessageInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryMessageInfoResponseBody body;

    public static QueryMessageInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryMessageInfoResponse self = new QueryMessageInfoResponse();
        return TeaModel.build(map, self);
    }

    public QueryMessageInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryMessageInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryMessageInfoResponse setBody(QueryMessageInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryMessageInfoResponseBody getBody() {
        return this.body;
    }

}
