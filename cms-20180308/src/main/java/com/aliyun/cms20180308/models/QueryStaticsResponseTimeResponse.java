// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20180308.models;

import com.aliyun.tea.*;

public class QueryStaticsResponseTimeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryStaticsResponseTimeResponseBody body;

    public static QueryStaticsResponseTimeResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryStaticsResponseTimeResponse self = new QueryStaticsResponseTimeResponse();
        return TeaModel.build(map, self);
    }

    public QueryStaticsResponseTimeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryStaticsResponseTimeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryStaticsResponseTimeResponse setBody(QueryStaticsResponseTimeResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryStaticsResponseTimeResponseBody getBody() {
        return this.body;
    }

}
