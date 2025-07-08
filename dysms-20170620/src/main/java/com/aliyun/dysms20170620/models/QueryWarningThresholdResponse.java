// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class QueryWarningThresholdResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryWarningThresholdResponseBody body;

    public static QueryWarningThresholdResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryWarningThresholdResponse self = new QueryWarningThresholdResponse();
        return TeaModel.build(map, self);
    }

    public QueryWarningThresholdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryWarningThresholdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryWarningThresholdResponse setBody(QueryWarningThresholdResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryWarningThresholdResponseBody getBody() {
        return this.body;
    }

}
