// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class QueryInboundCallIdResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryInboundCallIdResponseBody body;

    public static QueryInboundCallIdResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryInboundCallIdResponse self = new QueryInboundCallIdResponse();
        return TeaModel.build(map, self);
    }

    public QueryInboundCallIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryInboundCallIdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryInboundCallIdResponse setBody(QueryInboundCallIdResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryInboundCallIdResponseBody getBody() {
        return this.body;
    }

}
