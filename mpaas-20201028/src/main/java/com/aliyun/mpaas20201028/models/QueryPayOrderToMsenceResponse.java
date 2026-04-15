// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class QueryPayOrderToMsenceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryPayOrderToMsenceResponseBody body;

    public static QueryPayOrderToMsenceResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryPayOrderToMsenceResponse self = new QueryPayOrderToMsenceResponse();
        return TeaModel.build(map, self);
    }

    public QueryPayOrderToMsenceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryPayOrderToMsenceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryPayOrderToMsenceResponse setBody(QueryPayOrderToMsenceResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryPayOrderToMsenceResponseBody getBody() {
        return this.body;
    }

}
