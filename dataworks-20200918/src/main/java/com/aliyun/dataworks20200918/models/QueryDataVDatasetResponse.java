// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks20200918.models;

import com.aliyun.tea.*;

public class QueryDataVDatasetResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryDataVDatasetResponseBody body;

    public static QueryDataVDatasetResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDataVDatasetResponse self = new QueryDataVDatasetResponse();
        return TeaModel.build(map, self);
    }

    public QueryDataVDatasetResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryDataVDatasetResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryDataVDatasetResponse setBody(QueryDataVDatasetResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryDataVDatasetResponseBody getBody() {
        return this.body;
    }

}
