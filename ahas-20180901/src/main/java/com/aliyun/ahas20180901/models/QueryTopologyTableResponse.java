// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class QueryTopologyTableResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryTopologyTableResponseBody body;

    public static QueryTopologyTableResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryTopologyTableResponse self = new QueryTopologyTableResponse();
        return TeaModel.build(map, self);
    }

    public QueryTopologyTableResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryTopologyTableResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryTopologyTableResponse setBody(QueryTopologyTableResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryTopologyTableResponseBody getBody() {
        return this.body;
    }

}
