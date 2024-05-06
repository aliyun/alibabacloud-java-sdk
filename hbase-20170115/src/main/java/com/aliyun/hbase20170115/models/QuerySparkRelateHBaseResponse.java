// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20170115.models;

import com.aliyun.tea.*;

public class QuerySparkRelateHBaseResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QuerySparkRelateHBaseResponseBody body;

    public static QuerySparkRelateHBaseResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySparkRelateHBaseResponse self = new QuerySparkRelateHBaseResponse();
        return TeaModel.build(map, self);
    }

    public QuerySparkRelateHBaseResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QuerySparkRelateHBaseResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QuerySparkRelateHBaseResponse setBody(QuerySparkRelateHBaseResponseBody body) {
        this.body = body;
        return this;
    }
    public QuerySparkRelateHBaseResponseBody getBody() {
        return this.body;
    }

}
