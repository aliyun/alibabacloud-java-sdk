// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class QueryFlowLimitResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryFlowLimitResponseBody body;

    public static QueryFlowLimitResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryFlowLimitResponse self = new QueryFlowLimitResponse();
        return TeaModel.build(map, self);
    }

    public QueryFlowLimitResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryFlowLimitResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryFlowLimitResponse setBody(QueryFlowLimitResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryFlowLimitResponseBody getBody() {
        return this.body;
    }

}
