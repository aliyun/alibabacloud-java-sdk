// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class QueryClusterInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryClusterInfoResponseBody body;

    public static QueryClusterInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryClusterInfoResponse self = new QueryClusterInfoResponse();
        return TeaModel.build(map, self);
    }

    public QueryClusterInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryClusterInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryClusterInfoResponse setBody(QueryClusterInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryClusterInfoResponseBody getBody() {
        return this.body;
    }

}
