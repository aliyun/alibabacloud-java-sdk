// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class QueryFlowLimitNewResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryFlowLimitNewResponseBody body;

    public static QueryFlowLimitNewResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryFlowLimitNewResponse self = new QueryFlowLimitNewResponse();
        return TeaModel.build(map, self);
    }

    public QueryFlowLimitNewResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryFlowLimitNewResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryFlowLimitNewResponse setBody(QueryFlowLimitNewResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryFlowLimitNewResponseBody getBody() {
        return this.body;
    }

}
