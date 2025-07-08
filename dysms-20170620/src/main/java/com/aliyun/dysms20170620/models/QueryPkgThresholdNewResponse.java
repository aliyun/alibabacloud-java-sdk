// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class QueryPkgThresholdNewResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryPkgThresholdNewResponseBody body;

    public static QueryPkgThresholdNewResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryPkgThresholdNewResponse self = new QueryPkgThresholdNewResponse();
        return TeaModel.build(map, self);
    }

    public QueryPkgThresholdNewResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryPkgThresholdNewResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryPkgThresholdNewResponse setBody(QueryPkgThresholdNewResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryPkgThresholdNewResponseBody getBody() {
        return this.body;
    }

}
