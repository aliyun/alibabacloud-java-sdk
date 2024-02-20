// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class QueryReceiverDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryReceiverDetailResponseBody body;

    public static QueryReceiverDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryReceiverDetailResponse self = new QueryReceiverDetailResponse();
        return TeaModel.build(map, self);
    }

    public QueryReceiverDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryReceiverDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryReceiverDetailResponse setBody(QueryReceiverDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryReceiverDetailResponseBody getBody() {
        return this.body;
    }

}
