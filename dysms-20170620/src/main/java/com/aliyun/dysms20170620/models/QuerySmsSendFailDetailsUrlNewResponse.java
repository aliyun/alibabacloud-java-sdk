// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class QuerySmsSendFailDetailsUrlNewResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QuerySmsSendFailDetailsUrlNewResponseBody body;

    public static QuerySmsSendFailDetailsUrlNewResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySmsSendFailDetailsUrlNewResponse self = new QuerySmsSendFailDetailsUrlNewResponse();
        return TeaModel.build(map, self);
    }

    public QuerySmsSendFailDetailsUrlNewResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QuerySmsSendFailDetailsUrlNewResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QuerySmsSendFailDetailsUrlNewResponse setBody(QuerySmsSendFailDetailsUrlNewResponseBody body) {
        this.body = body;
        return this;
    }
    public QuerySmsSendFailDetailsUrlNewResponseBody getBody() {
        return this.body;
    }

}
