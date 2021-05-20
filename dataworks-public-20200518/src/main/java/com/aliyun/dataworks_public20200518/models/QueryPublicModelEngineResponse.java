// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class QueryPublicModelEngineResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public QueryPublicModelEngineResponse setBody(QueryPublicModelEngineResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryPublicModelEngineResponseBody getBody() {
        return this.body;
    }

}
