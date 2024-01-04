// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class QueryAppTopologyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryAppTopologyResponseBody body;

    public static QueryAppTopologyResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAppTopologyResponse self = new QueryAppTopologyResponse();
        return TeaModel.build(map, self);
    }

    public QueryAppTopologyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryAppTopologyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryAppTopologyResponse setBody(QueryAppTopologyResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryAppTopologyResponseBody getBody() {
        return this.body;
    }

}
