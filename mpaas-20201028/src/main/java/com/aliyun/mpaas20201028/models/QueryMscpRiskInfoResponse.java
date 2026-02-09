// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class QueryMscpRiskInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryMscpRiskInfoResponseBody body;

    public static QueryMscpRiskInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryMscpRiskInfoResponse self = new QueryMscpRiskInfoResponse();
        return TeaModel.build(map, self);
    }

    public QueryMscpRiskInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryMscpRiskInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryMscpRiskInfoResponse setBody(QueryMscpRiskInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryMscpRiskInfoResponseBody getBody() {
        return this.body;
    }

}
