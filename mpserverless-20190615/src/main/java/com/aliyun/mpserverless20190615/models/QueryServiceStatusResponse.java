// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class QueryServiceStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryServiceStatusResponseBody body;

    public static QueryServiceStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryServiceStatusResponse self = new QueryServiceStatusResponse();
        return TeaModel.build(map, self);
    }

    public QueryServiceStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryServiceStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryServiceStatusResponse setBody(QueryServiceStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryServiceStatusResponseBody getBody() {
        return this.body;
    }

}
