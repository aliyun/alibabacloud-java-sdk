// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class QueryPublicModelEngineResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryPublicModelEngineResponseBody body;

    public static QueryPublicModelEngineResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryPublicModelEngineResponse self = new QueryPublicModelEngineResponse();
        return TeaModel.build(map, self);
    }

    public QueryPublicModelEngineResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryPublicModelEngineResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryPublicModelEngineResponse setBody(QueryPublicModelEngineResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryPublicModelEngineResponseBody getBody() {
        return this.body;
    }

}
