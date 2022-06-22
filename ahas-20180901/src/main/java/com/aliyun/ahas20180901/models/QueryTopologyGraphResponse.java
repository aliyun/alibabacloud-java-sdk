// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class QueryTopologyGraphResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryTopologyGraphResponseBody body;

    public static QueryTopologyGraphResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryTopologyGraphResponse self = new QueryTopologyGraphResponse();
        return TeaModel.build(map, self);
    }

    public QueryTopologyGraphResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryTopologyGraphResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryTopologyGraphResponse setBody(QueryTopologyGraphResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryTopologyGraphResponseBody getBody() {
        return this.body;
    }

}
