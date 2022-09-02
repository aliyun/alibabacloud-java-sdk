// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.layout20220801.models;

import com.aliyun.tea.*;

public class QueryTreeNodesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryTreeNodesResponseBody body;

    public static QueryTreeNodesResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryTreeNodesResponse self = new QueryTreeNodesResponse();
        return TeaModel.build(map, self);
    }

    public QueryTreeNodesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryTreeNodesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryTreeNodesResponse setBody(QueryTreeNodesResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryTreeNodesResponseBody getBody() {
        return this.body;
    }

}
