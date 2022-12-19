// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class QuerySimilarImageClustersResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QuerySimilarImageClustersResponseBody body;

    public static QuerySimilarImageClustersResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySimilarImageClustersResponse self = new QuerySimilarImageClustersResponse();
        return TeaModel.build(map, self);
    }

    public QuerySimilarImageClustersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QuerySimilarImageClustersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QuerySimilarImageClustersResponse setBody(QuerySimilarImageClustersResponseBody body) {
        this.body = body;
        return this;
    }
    public QuerySimilarImageClustersResponseBody getBody() {
        return this.body;
    }

}
