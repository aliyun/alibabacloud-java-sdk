// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bizworks20210408.models;

import com.aliyun.tea.*;

public class QueryUsageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryUsageResponseBody body;

    public static QueryUsageResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryUsageResponse self = new QueryUsageResponse();
        return TeaModel.build(map, self);
    }

    public QueryUsageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryUsageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryUsageResponse setBody(QueryUsageResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryUsageResponseBody getBody() {
        return this.body;
    }

}
