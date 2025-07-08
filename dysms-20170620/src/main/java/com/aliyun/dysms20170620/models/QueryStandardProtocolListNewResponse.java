// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class QueryStandardProtocolListNewResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryStandardProtocolListNewResponseBody body;

    public static QueryStandardProtocolListNewResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryStandardProtocolListNewResponse self = new QueryStandardProtocolListNewResponse();
        return TeaModel.build(map, self);
    }

    public QueryStandardProtocolListNewResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryStandardProtocolListNewResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryStandardProtocolListNewResponse setBody(QueryStandardProtocolListNewResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryStandardProtocolListNewResponseBody getBody() {
        return this.body;
    }

}
