// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class QueryWarningThresholdNewResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryWarningThresholdNewResponseBody body;

    public static QueryWarningThresholdNewResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryWarningThresholdNewResponse self = new QueryWarningThresholdNewResponse();
        return TeaModel.build(map, self);
    }

    public QueryWarningThresholdNewResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryWarningThresholdNewResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryWarningThresholdNewResponse setBody(QueryWarningThresholdNewResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryWarningThresholdNewResponseBody getBody() {
        return this.body;
    }

}
