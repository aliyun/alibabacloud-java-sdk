// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class QueryDatasetResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryDatasetResponseBody body;

    public static QueryDatasetResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDatasetResponse self = new QueryDatasetResponse();
        return TeaModel.build(map, self);
    }

    public QueryDatasetResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryDatasetResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryDatasetResponse setBody(QueryDatasetResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryDatasetResponseBody getBody() {
        return this.body;
    }

}
