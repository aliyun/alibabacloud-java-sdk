// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class QuerySmsSendFailDetailsUrlResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QuerySmsSendFailDetailsUrlResponseBody body;

    public static QuerySmsSendFailDetailsUrlResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySmsSendFailDetailsUrlResponse self = new QuerySmsSendFailDetailsUrlResponse();
        return TeaModel.build(map, self);
    }

    public QuerySmsSendFailDetailsUrlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QuerySmsSendFailDetailsUrlResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QuerySmsSendFailDetailsUrlResponse setBody(QuerySmsSendFailDetailsUrlResponseBody body) {
        this.body = body;
        return this;
    }
    public QuerySmsSendFailDetailsUrlResponseBody getBody() {
        return this.body;
    }

}
